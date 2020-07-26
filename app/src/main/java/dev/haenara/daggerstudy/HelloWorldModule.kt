package dev.haenara.daggerstudy

import dagger.Module
import dagger.Provides

@Module
class HelloWorldModule {
    @Provides
    fun provideHelloWorld() : String{
        return "Hello Dagger!"
    }
}