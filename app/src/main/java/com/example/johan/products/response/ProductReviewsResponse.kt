package com.example.johan.products.response

import com.google.gson.annotations.SerializedName

data class ProductReviewsResponse(
    @SerializedName("items")
    var items: Array<Item>? = arrayOf()
)

data class Item(
    @SerializedName("id")
    var id: String? = ""
) {
    @SerializedName("review_statistics")
    var reviewStatistics: ReviewStatistics? = ReviewStatistics()

    @SerializedName("reviews")
    var reviews: Array<Review>? = arrayOf()
}

data class ReviewStatistics(
    @SerializedName("average_overall_rating")
    var average: Float? = 0.toFloat()
)

data class Review(
    @SerializedName("id")
    var id: String? = ""
) {
    @SerializedName("usernickname")
    var userNickname: String? = ""

    @SerializedName("title")
    var title: String? = ""

    @SerializedName("review_text")
    var reviewText: String? = ""

    @SerializedName("rating")
    var rating: Float? = 0.toFloat()

    @SerializedName("submission_time")
    var submissionTime: String? = ""

    @SerializedName("product_id")
    var productId: String? = ""
}
