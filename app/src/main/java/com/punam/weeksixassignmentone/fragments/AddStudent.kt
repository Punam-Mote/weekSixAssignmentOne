package com.punam.weeksixassignmentone.fragments

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.fragment.app.Fragment
import com.punam.weeksixassignmentone.CommunicateInterface
import com.punam.weeksixassignmentone.R
import com.punam.weeksixassignmentone.model.Student


class AddStudent : Fragment(){
    private lateinit var etName:EditText
    private lateinit var etAge:EditText

    private lateinit var rdGroup: RadioGroup
    private lateinit var rdMale:RadioButton
    private lateinit var rdFemale:RadioButton
    private lateinit var rdOthers:RadioButton

    private lateinit var etAddress:EditText
    private lateinit var etimage:EditText

    private lateinit var btnSave:Button
  //  var arrayList = arrayListOf<Student>();// initialize arrayList




     var newStudent=ArrayList<Student>()
   private lateinit var communicateInterface: CommunicateInterface

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val view= inflater.inflate(R.layout.fragment_add_student, container, false)
        etName=view.findViewById(R.id.etName)
        etAge=view.findViewById(R.id.etAge)
        rdGroup=view.findViewById(R.id.rdGroup)
        rdMale=view.findViewById(R.id.rdMale)
        rdFemale=view.findViewById(R.id.rdFemale)
        rdOthers=view.findViewById(R.id.rdOthers)
        etAddress=view.findViewById(R.id.etAddress)
        etimage=view.findViewById(R.id.etimage)
        btnSave=view.findViewById(R.id.btnSave)

//        val addstudent = AddStudent()

        communicateInterface=activity as CommunicateInterface
        btnSave.setOnClickListener {
            var name = etName.text.toString();
            var age = etAge.text.toString().toInt();
            var gender = rdGroup.checkedRadioButtonId.toString();
            var address = etAddress.text.toString();
            var image = etimage.text.toString();
            var studentdata = Student(id, name, age, gender, address, image)

            newStudent.add(studentdata);


            communicateInterface.passData(newStudent)

//            Bundle bundle = new Bundle();
//            bundle.putString("studentdata",newStudent)
//            Home fragment = new Home() fragment.setArgument(bundle)
//            fragmentManager().beginTransaction().replace(R.id.linearContainer,fragmentManager).commit()
        }


        return view
    }




}