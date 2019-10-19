package com.ajdi.yassin.netfleak.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * @author Yassin Ajdi
 * @since 10/19/2019.
 */
@Singleton
@Component(
    modules = [
        AppModule::class,
        AndroidSupportInjectionModule::class]
)
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

//    fun inject(githubApp: GithubApp)
}