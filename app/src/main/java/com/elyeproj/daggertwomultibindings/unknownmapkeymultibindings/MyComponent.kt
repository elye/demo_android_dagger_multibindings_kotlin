package com.elyeproj.daggertwomultibindings.unknownmapkeymultibindings

import dagger.Component

@Component(modules = [MyMapModule::class])
interface MyComponent {
    fun runtimeKeyMapMultiBinding(): Map<String, String>
}
