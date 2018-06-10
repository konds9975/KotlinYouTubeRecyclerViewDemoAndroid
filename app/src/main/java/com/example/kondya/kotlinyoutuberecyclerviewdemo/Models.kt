package com.example.kondya.kotlinyoutuberecyclerviewdemo

class HomeFeed(val videos: List<Videos>)

class Videos(val id: Int, val name:String,val link: String, val imageUrl: String, numberOfViews: Int,val channel: Channel)

class Channel(val name: String,val profileImageUrl:String,val numberOfSubscribers:Int)