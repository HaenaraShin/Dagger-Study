package dev.haenara.daggerstudy

import dagger.Module
import dagger.Provides
import javax.inject.Inject

@Module
class HelloWorldModule {
    @Provides
    fun provideHelloWorld() : String{
        return "Hello Dagger!"
    }
    @Inject lateinit var number : String
}