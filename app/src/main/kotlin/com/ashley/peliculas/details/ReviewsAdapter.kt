package com.ashley.peliculas.details

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ashley.domain.entities.Review
import com.ashley.peliculas.R
import kotlinx.android.synthetic.main.cell_reviews_adapter.view.*


class ReviewsAdapter(private val reviews: List<Review>) : RecyclerView.Adapter<ReviewsAdapter.ReviewViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ReviewViewHolder {
        val view = LayoutInflater.from(parent?.context).inflate(R.layout.cell_reviews_adapter, parent, false)
        return ReviewViewHolder(view)
    }


    override fun onBindViewHolder(holder: ReviewViewHolder?, position: Int) {
        holder?.bind(reviews[position])
    }

    override fun getItemCount(): Int {
        return reviews.size
    }


    class ReviewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(review: Review) {
            with(itemView) {
                reviews_adapter_content.text = "\"${review.content}\""
                reviews_adapter_author.text = review.author
            }
        }

    }
}