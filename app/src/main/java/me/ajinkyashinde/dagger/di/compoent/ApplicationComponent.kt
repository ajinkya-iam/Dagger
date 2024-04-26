package me.ajinkyashinde.dagger.di.compoent

import android.content.Context
import dagger.Component
import me.ajinkyashinde.dagger.MyApplication
import me.ajinkyashinde.dagger.data.remote.NetworkService
import me.ajinkyashinde.dagger.di.ApplicationContext
import me.ajinkyashinde.dagger.di.module.ApplicationModule
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    fun inject(application: MyApplication)

    @ApplicationContext
    fun getContext(): Context

    fun getNetworkService(): NetworkService
}