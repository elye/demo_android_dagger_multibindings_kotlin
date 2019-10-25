package com.elyeproj.daggertwomultibindings.subcomponentmultibindings

import dagger.Component

@Component(modules = [ParentModule::class])
interface ParentComponent {
    fun strings(): Set<String>
    fun stringMap(): Map<String, String>
    fun childComponent(): ChildComponent
}
