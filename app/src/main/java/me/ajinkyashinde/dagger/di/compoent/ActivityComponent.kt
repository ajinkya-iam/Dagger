package me.ajinkyashinde.dagger.di.compoent

import dagger.Component
import me.ajinkyashinde.dagger.di.ActivityScope
import me.ajinkyashinde.dagger.di.module.ActivityModule
import me.ajinkyashinde.dagger.ui.MainActivity

@ActivityScope
@Component(dependencies = [ApplicationComponent::class], modules = [ActivityModule::class])
interface ActivityComponent {
    fun inject(activity: MainActivity)
}