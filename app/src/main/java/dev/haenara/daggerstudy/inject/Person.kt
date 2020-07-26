package dev.haenara.daggerstudy.inject

import javax.inject.Inject

class PersonA @Inject constructor(
    var name: String,
    var age: Int
)

class PersonB {
    @Inject lateinit var name: String
    var age: Int = 0
        get() = field
        @Inject set(value) {field = value}
}