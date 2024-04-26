package me.ajinkyashinde.dagger.ui

import me.ajinkyashinde.dagger.data.remote.NetworkService
import me.ajinkyashinde.dagger.di.ActivityScope
import javax.inject.Inject

@ActivityScope
class MainViewModal @Inject constructor(
    private val networkService: NetworkService
) {

    fun getNetworkData(): String{
        return "Network Data = 1. Hashcode ${networkService.hashCode()} + \n" +
                "2. Data ${networkService.getDummyData()}"
    }

}