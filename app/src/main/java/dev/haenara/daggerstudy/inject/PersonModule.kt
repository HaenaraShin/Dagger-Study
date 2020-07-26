package dev.haenara.daggerstudy.inject

import dagger.Module
import dagger.Provides

@Module
class PersonModule {
    @Provides
    fun provideName() = "Haenara"

    @Provides
    fun provideAge() = 31
}