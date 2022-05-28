package kg.itc.examplemvvm.data.storage

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "quotes")
data class QuoteEntity(
    @PrimaryKey
    val quoteId: String,
    val quoteContent: String,
    val quoteAuthor: String
)
