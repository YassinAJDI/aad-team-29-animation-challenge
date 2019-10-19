package com.ajdi.yassin.netfleak.di

import com.ajdi.yassin.netfleak.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * @author Yassin Ajdi
 * @since 10/19/2019.
 */
@Module
abstract class MainActivityModule {

    @ContributesAndroidInjector(modules = [FragmentBuildersModule::class])
    abstract fun contributeMainActivity(): MainActivity
}