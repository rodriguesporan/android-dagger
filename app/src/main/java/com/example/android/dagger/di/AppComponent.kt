package com.example.android.dagger.di

import com.example.android.dagger.registration.RegistrationActivity
import dagger.Component

@Component(modules = [StorageModule::class])
interface AppComponent {
    fun inject(activity: RegistrationActivity)
}