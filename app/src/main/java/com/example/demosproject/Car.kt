package com.example.demosproject

class Car(private val tire : Tire) {

    fun go(){
        println("motor go~~")
        tire.run()
    }
}