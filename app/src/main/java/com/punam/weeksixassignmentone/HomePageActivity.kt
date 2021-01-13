package com.punam.weeksixassignmentone

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.punam.weeksixassignmentone.adapter.StudentAdapter
import com.punam.weeksixassignmentone.adapter.ViewPageAdapter
import com.punam.weeksixassignmentone.fragments.About
import com.punam.weeksixassignmentone.fragments.AddStudent
import com.punam.weeksixassignmentone.fragments.Home
import com.punam.weeksixassignmentone.model.Student

class HomePageActivity : AppCompatActivity(), CommunicateInterface  {
    private lateinit var lstTitle: ArrayList<String>
    private lateinit var lstFragment: ArrayList<Fragment>
    private lateinit var viewPage:ViewPager2
    private lateinit var tabLayout: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)
        viewPage=findViewById(R.id.viewPage)
        tabLayout=findViewById(R.id.tabLayout)

        val addStudent = AddStudent()
        supportFragmentManager.beginTransaction().replace(R.id.recyclerView,addStudent).commit()


        AddStudents();
        val adapter= ViewPageAdapter(lstFragment,supportFragmentManager,lifecycle)
        viewPage.adapter=adapter
        TabLayoutMediator(tabLayout,viewPage){ tab,position ->
            tab.text=lstTitle[position]
        }.attach()



    }


    private fun AddStudents(){
        lstTitle=ArrayList<String>()
        lstTitle.add("Home")
        lstTitle.add("Add Student")
        lstTitle.add("About")
        lstFragment=ArrayList<Fragment>()
        lstFragment.add(Home())
        lstFragment.add(AddStudent())
        lstFragment.add(About())
    }

    override fun passData(arrayList: ArrayList<Student>) {
        val bundle=Bundle()
        bundle.putString("student", arrayList.toString())

        val transaction=this.supportFragmentManager.beginTransaction()
        val home = Home()
        home.arguments=bundle

        transaction.commit()
    }
}