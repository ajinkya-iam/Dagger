package me.ajinkyashinde.dagger

import android.app.Application
import me.ajinkyashinde.dagger.data.remote.NetworkService
import me.ajinkyashinde.dagger.di.compoent.ApplicationComponent
import me.ajinkyashinde.dagger.di.compoent.DaggerApplicationComponent
import me.ajinkyashinde.dagger.di.module.ApplicationModule
import javax.inject.Inject

class MyApplication : Application() {

    lateinit var applicationComponent: ApplicationComponent

    @Inject
    lateinit var networkService: NetworkService

    override fun onCreate() {
        super.onCreate()
        getDependencies()
    }

    private fun getDependencies() {
        applicationComponent = DaggerApplicationComponent
            .builder()
            .applicationModule(ApplicationModule(this))
            .build()
        applicationComponent.inject(this)
    }

}