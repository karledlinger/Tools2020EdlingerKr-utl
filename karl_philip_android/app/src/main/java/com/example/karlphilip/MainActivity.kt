package com.example.karlphilip

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
		System.out.println("Hallo vom Member 1");
	   	System.out.println("Hallo vom anderem Team");
    }

    fun thisIsANewMethod() {

		System.out.println("Hallo vom Member 1");
		System.out.println("Hallo vom Member 1, Line 1");
		System.out.println("Hallo vom Member 1, Line 2");
		System.out.println("Hallo vom Member 1, Line 3");


        System.out.println("Hallo Methode von Member 2")
    }

    fun testMethod1() {
        System.out.println("Hallo Test1 von Member 2")
    }


}
