package com.example.kondya.kotlinyoutuberecyclerviewdemo

import android.graphics.Color
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_main.*

class CourseDetailActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        recyclerview_main.layoutManager = LinearLayoutManager(this)

        recyclerview_main.adapter = CourseDetailAdpter()

    }

    private class CourseDetailAdpter: RecyclerView.Adapter<CoursreLessonViewHolder>() {

        override fun getItemCount(): Int {
            return 5
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):CoursreLessonViewHolder {

            val layoutInflater = LayoutInflater.from(parent?.context)
            val customView = layoutInflater.inflate(R.layout.course_lesson_row,parent,false)
            return CoursreLessonViewHolder(customView)

        }

        override fun onBindViewHolder(holder:CoursreLessonViewHolder, position: Int) {

        }

    }
    private class CoursreLessonViewHolder(val customView: View): RecyclerView.ViewHolder(customView){



    }
}

