package net.bintelligence.koinexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.koin.android.ext.android.inject


class MainActivity : AppCompatActivity() {

    val student: Student by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        student.beSmart()

    }
}