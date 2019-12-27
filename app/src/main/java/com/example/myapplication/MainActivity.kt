package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//study ：AppCompatActivity一种向下兼容的Activity，可以将Activity在各个系统版本中增加的特性和功能最低兼容到Android2.1系统。
//study ：':' = extends
class MainActivity : AppCompatActivity() {
    //study ：onCreate()为活动被创建时必定要执行的方法。
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //study ：setContentView（）给当前的活动引入一个布局
        setContentView(R.layout.activity_main)
    }
}
