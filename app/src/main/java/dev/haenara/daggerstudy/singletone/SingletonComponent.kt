package dev.haenara.daggerstudy.singletone

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [SingletonModule::class])
interface SingletonComponent {
    fun getObject(): Object
}