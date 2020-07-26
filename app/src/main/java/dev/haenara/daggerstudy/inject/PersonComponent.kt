package dev.haenara.daggerstudy.inject

import dagger.Component

@Component(modules = [PersonModule::class])
interface PersonComponent {
    fun getPersonA() : PersonA
    fun inject(b: PersonB)
}