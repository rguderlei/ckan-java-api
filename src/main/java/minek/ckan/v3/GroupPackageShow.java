package minek.ckan.v3;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import minek.ckan.v3.enums.ApprovalStatus;
import minek.ckan.v3.enums.State;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
public class GroupPackageShow {

    @SerializedName("license_title")
    private String licenseTitle;
    private String maintainer;
    @SerializedName("relationships_as_object")
    private List<String> relationshipsAsObject;
    @SerializedName("private")
    private boolean _private;
    @SerializedName("maintainer_email")
    private String maintainerEmail;
    @SerializedName("num_tags")
    private int numTags;
    private UUID id;
    @SerializedName("metadata_created")
    private LocalDateTime metadataCreated;
    @SerializedName("metadata_modified")
    private LocalDateTime metadataModified;
    private String author;
    @SerializedName("author_email")
    private String authorEmail;
    private State state;
    private String version;
    @SerializedName("creator_user_id")
    private UUID creatorUserId;
    private String type;
    private List<Resource> resources;
    @SerializedName("num_resources")
    private int numResources;
    private List<Tag> tags;
    private List<Group> groups;
    @SerializedName("license_id")
    private String licenseId;
    @SerializedName("relationships_as_subject")
    private List<String> relationshipsAsSubject;
    private Organization organization;
    private String name;
    private boolean isopen;
    private String url;
    private String notes;
    @SerializedName("owner_org")
    private UUID ownerOrg;
    private List<Extra> extras;
    @SerializedName("license_url")
    private String licenseUrl;
    private String title;
    @SerializedName("revision_id")
    private UUID revisionId;

    @Data
    public static class Resource {
        private String mimetype;
        @SerializedName("cache_url")
        private String cacheUrl;
        private String hash;
        private String description;
        private String name;
        private String format;
        private String url;
        @SerializedName("datastore_active")
        private boolean datastoreActive;
        @SerializedName("cache_last_updated")
        private String cacheLastUpdated;
        @SerializedName("package_id")
        private UUID packageId;
        private LocalDateTime created;
        private State state;
        @SerializedName("mimetype_inner")
        private String mimetypeInner;
        @SerializedName("last_modified")
        private String lastModified;
        private int position;
        @SerializedName("revision_id")
        private UUID revisionId;
        @SerializedName("url_type")
        private String urlType;
        private UUID id;
        @SerializedName("resource_type")
        private String resourceType;
        private Integer size;
    }

    @Data
    public static class Tag {
        @SerializedName("vocabulary_id")
        private UUID vocabularyId;
        private State state;
        @SerializedName("display_name")
        private String displayName;
        private UUID id;
        private String name;
    }

    @Data
    public static class Group {
        @SerializedName("display_name")
        private String displayName;
        private String description;
        @SerializedName("image_display_url")
        private String imageDisplayUrl;
        private String title;
        private UUID id;
        private String name;
    }

    @Data
    public static class Organization {
        private String description;
        private LocalDateTime created;
        private String title;
        private String name;
        @SerializedName("is_organization")
        private boolean isOrganization;
        private State state;
        @SerializedName("image_url")
        private String imageUrl;
        @SerializedName("revision_id")
        private UUID revisionId;
        private String type;
        private UUID id;
        @SerializedName("approval_status")
        private ApprovalStatus approvalStatus;
    }

    @Data
    public static class Extra {
        private State key;
        private String value;
    }
}