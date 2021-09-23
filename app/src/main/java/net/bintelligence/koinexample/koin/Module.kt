package net.bintelligence.koinexample.koin

import net.bintelligence.koinexample.Friend
import net.bintelligence.koinexample.SchoolCourse
import net.bintelligence.koinexample.Student
import org.koin.dsl.module


val appModule = module{
    single{ SchoolCourse()}
    factory{ Friend() }
    factory { Student(get(), get()) }
}