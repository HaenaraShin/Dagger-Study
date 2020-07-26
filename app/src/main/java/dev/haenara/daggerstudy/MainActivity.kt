package dev.haenara.daggerstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.Component
import dagger.MembersInjector
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView.text = getStringFromDagger()
    }

    private fun getStringFromDagger(): String {
        val component:HelloWorldComponent 
                = DaggerHelloWorldComponent.create()
        return component.getString()
    }

}
