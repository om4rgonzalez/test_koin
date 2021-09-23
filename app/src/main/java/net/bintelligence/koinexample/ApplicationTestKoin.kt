package net.bintelligence.koinexample

import android.app.Application
import net.bintelligence.koinexample.koin.appModule
import org.koin.core.context.startKoin

class ApplicationTestKoin: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(listOf(appModule))
        }
    }
}