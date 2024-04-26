package me.ajinkyashinde.dagger.data.remote

import android.content.Context
import me.ajinkyashinde.dagger.di.ApplicationContext
import me.ajinkyashinde.dagger.di.NetworkApiKey
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NetworkService @Inject constructor(
    private val httpClient: HttpClient,
    @ApplicationContext private val context: Context,
    @NetworkApiKey private val apiKey: String
) {

    fun getDummyData(): String {
        return "NETWORK_DUMMY_DATA"
    }

}