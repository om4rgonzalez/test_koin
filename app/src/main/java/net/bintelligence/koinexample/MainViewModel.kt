package net.bintelligence.koinexample

import android.util.Log

class Student(val course: SchoolCourse,
              val friend: Friend) {

    fun beSmart(){
        course.study()
        friend.hangout()
    }

}


class SchoolCourse{
    fun study(){
        Log.d("_STUDENT", "I am studying")
    }
}

class Friend{
    fun hangout(){
        Log.d("_STUDENT", "We are hanginout")
    }
}