package com.punam.weeksixassignmentone.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.punam.weeksixassignmentone.R
import com.punam.weeksixassignmentone.adapter.StudentAdapter
import com.punam.weeksixassignmentone.adapter.ViewPageAdapter
import com.punam.weeksixassignmentone.model.Student


class Home : Fragment() {
        var listStudent=ArrayList<Student>()
    //private var studentdata=ArrayList<Student>()
    private lateinit var recyclerView: RecyclerView
    var displayMessage:String?=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_home, container, false)
        recyclerView=view.findViewById(R.id.recyclerView)

        loadStudents();

        val adapter=StudentAdapter(listStudent,context!!)
        recyclerView.layoutManager=LinearLayoutManager(context)
        recyclerView.adapter=adapter
//        val adapter=context?.let { ViewPageAdapter(listStudent, it) }
//        recyclerView.layoutManager= LinearLayoutManager(null)
//      recyclerView.adapter=adapter

//        Bundle bundle =this.getArguments()
//        String data=bundle.getString("studentdata")
//        adapter.notifyDataSetChanged();

        displayMessage=arguments?.getString("studentdata")
        displayMessage= listStudent.toString()



        return view;

    }
    private fun loadStudents(){

        listStudent.add(
                Student(1,"Aksana chetri",19,"Female","Nakkhu",
                        "https://scontent.fktm8-1.fna.fbcdn.net/v/t1.0-9/123191009_789660098518779_90415475176227567_o.jpg?_nc_cat=106&ccb=2&_nc_sid=09cbfe&_nc_ohc=YAzPPq5TVksAX-JVWPy&_nc_ht=scontent.fktm8-1.fna&oh=d558e373f0509be4a82a2c004ff48bc1&oe=6020CAAB")
        )

        listStudent.add(
                Student(2,"Arya",22,"Female","Lazimpat",
                        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQD2zBDJDpa84W6NNahxmHbYTLf2-YKVc6k5Q&usqp=CAU")
        )

        listStudent.add(
                Student(3,"Shaswat Pandey",20,"Male","Balaju",
                        "https://scontent.fktm8-1.fna.fbcdn.net/v/t31.0-8/17917845_1385487038175359_7273886807868239401_o.jpg?_nc_cat=109&ccb=2&_nc_sid=174925&_nc_ohc=c0cFq7wYBAwAX91MPDq&_nc_ht=scontent.fktm8-1.fna&oh=da2cccc5702acbd5fc5977cadb1b8f11&oe=6022F6F9")
        )

    }



}