package com.elyeproj.daggertwomultibindings.subcomponentmultibindings

import dagger.Subcomponent

@Subcomponent(modules = [ChildModule::class])
interface ChildComponent {
    fun strings(): Set<String>
    fun stringMap(): Map<String, String>
}
