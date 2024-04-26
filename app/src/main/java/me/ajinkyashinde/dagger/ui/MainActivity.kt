package me.ajinkyashinde.dagger.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import me.ajinkyashinde.dagger.MyApplication
import me.ajinkyashinde.dagger.R
import me.ajinkyashinde.dagger.di.compoent.DaggerActivityComponent
import me.ajinkyashinde.dagger.di.module.ActivityModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var mainViewModal: MainViewModal

    override fun onCreate(savedInstanceState: Bundle?) {
        getDependencies()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("Main", "Network: ${mainViewModal.getNetworkData()}")
        findViewById<TextView>(R.id.text).text = mainViewModal.getNetworkData()

    }

    private fun getDependencies() {
        DaggerActivityComponent
            .builder()
            .applicationComponent((application as MyApplication).applicationComponent)
            .activityModule(ActivityModule(this))
            .build()
            .inject(this)
    }
}