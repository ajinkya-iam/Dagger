package me.ajinkyashinde.dagger.di.module

import android.content.Context
import dagger.Module
import dagger.Provides
import me.ajinkyashinde.dagger.MyApplication
import me.ajinkyashinde.dagger.data.remote.HttpClient
import me.ajinkyashinde.dagger.di.ApplicationContext
import me.ajinkyashinde.dagger.di.NetworkApiKey
import javax.inject.Singleton

@Module
class ApplicationModule(private val application: MyApplication){

    @ApplicationContext
    @Provides
    fun provideContext(): Context{
        return application
    }

    @Provides
    @NetworkApiKey
    fun providesNetworkKey(): String = "NETWORK_API_KEY"

    @Singleton
    @Provides
    fun providesHttpClient(): HttpClient{
        return HttpClient()
    }

}