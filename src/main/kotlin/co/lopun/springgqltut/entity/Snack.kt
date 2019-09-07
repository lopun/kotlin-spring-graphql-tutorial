package co.lopun.springgqltut.entity

import org.springframework.data.annotation.Id
import org.springframework.data.annotation.Transient
import org.springframework.data.mongodb.core.mapping.Document
import kotlin.collections.ArrayList

@Document(collection = "snack")
data class Snack(
    var name: String,
    var amount: Float
) {
    @Id
    var id: String = ""

    @Transient
    var reviews: List<Review> = ArrayList()
}

