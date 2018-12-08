package tampan.kucingapes.simplewallpaper.model.collection

import com.google.gson.annotations.SerializedName

data class UnsplashCollection(
        @SerializedName("cover_photo")
        val coverPhoto: CoverPhoto?,
        @SerializedName("curated")
        val curated: Boolean?,
        @SerializedName("description")
        val description: String?,
        @SerializedName("featured")
        val featured: Boolean?,
        @SerializedName("id")
        val id: Int?,
        @SerializedName("links")
        val links: Links?,
        @SerializedName("preview_photos")
        val previewPhotos: List<PreviewPhoto?>?,
        @SerializedName("private")
        val `private`: Boolean?,
        @SerializedName("published_at")
        val publishedAt: String?,
        @SerializedName("share_key")
        val shareKey: String?,
        @SerializedName("tags")
        val tags: List<Tag?>?,
        @SerializedName("title")
        val title: String?,
        @SerializedName("total_photos")
        val totalPhotos: Int?,
        @SerializedName("updated_at")
        val updatedAt: String?,
        @SerializedName("user")
        val user: User?
)