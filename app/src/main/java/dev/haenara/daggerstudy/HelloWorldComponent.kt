package dev.haenara.daggerstudy

import dagger.Component

@Component(modules = [HelloWorldModule::class])
interface HelloWorldComponent {
    fun getString(): String
}