package com.example.demosproject

import org.koin.core.module.Module
import org.koin.dsl.module

val myModule = module {
    single { Car(Tire()) }
}
