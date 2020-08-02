package dev.haenara.daggerstudy.singletone

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class SingletonModule {
    @Provides
    @Singleton
    fun provideObject() = Object()
}