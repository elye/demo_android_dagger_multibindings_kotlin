package com.elyeproj.daggertwomultibindings.setmultibindings

import dagger.Component

@Component(modules = [MyModuleA::class, MyModuleB::class, MyModuleC::class, MyModuleD::class])
interface MyComponent {
    @QualifySetOne
    fun setOnestrings(): Set<String>

    @QualifySetTwo
    fun setTwostrings(): Set<String>
}
