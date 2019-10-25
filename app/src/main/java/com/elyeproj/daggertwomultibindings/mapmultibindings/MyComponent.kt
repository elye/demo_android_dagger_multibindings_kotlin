package com.elyeproj.daggertwomultibindings.mapmultibindings

import javax.inject.Provider

import dagger.Component

@Component(modules = [MyModule::class])
interface MyComponent {
    fun longsByString(): Map<String, Long>
    fun stringsByClass(): Map<Class<*>, String>

    fun providerLongsByString(): Map<String, Provider<Long>>

    fun myEnumStringMap(): Map<MyEnum, String>
    fun stringsByNumberClass(): Map<Class<out Number>, String>
}
