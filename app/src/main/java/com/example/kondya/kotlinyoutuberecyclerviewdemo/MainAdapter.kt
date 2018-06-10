package com.example.kondya.kotlinyoutuberecyclerviewdemo

import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.video_row.view.*

class MainAdapter(val homeFeed: HomeFeed): RecyclerView.Adapter<CustomViewHolder>(){


    override fun getItemCount(): Int {
        return homeFeed.videos.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {

        val layoutInflater = LayoutInflater.from(parent?.context)
        val cellForRow = layoutInflater.inflate(R.layout.video_row,parent,false)
        return CustomViewHolder(cellForRow)

    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {

        val video = homeFeed.videos.get(position)
        holder.view.textView_video_title?.text = video.name
        holder.view.textView_channel_name?.text = video.channel.name + "  *  " + "20K Views\n4 days ago"

        val thumbnilImageView = holder.view.imageView_video_thumbnil
        Picasso.get().load(video.imageUrl).into(thumbnilImageView)

        val channel_profile = holder?.view?.imageView_channel_profile

        Picasso.get().load(video.channel.profileImageUrl).into(channel_profile)




    }
}

class CustomViewHolder(val view: View): RecyclerView.ViewHolder(view){


    init {

        view.setOnClickListener {

            val intent = Intent(view.context,CourseDetailActivity::class.java)

            view.context.startActivity(intent)
        }

    }

}