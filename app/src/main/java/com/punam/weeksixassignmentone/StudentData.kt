package com.punam.weeksixassignmentone

import com.punam.weeksixassignmentone.model.Student
import java.util.*

class StudentData private constructor() {
    var list = ArrayList<Student>()
    fun List(): ArrayList<Student> {
        return list
    }

    companion object {
        private val data = StudentData()
        fun get(): StudentData {
            return data
        }
    }
}