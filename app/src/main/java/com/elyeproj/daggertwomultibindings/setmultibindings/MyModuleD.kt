package com.elyeproj.daggertwomultibindings.setmultibindings

import dagger.Module
import dagger.Provides
import dagger.multibindings.ElementsIntoSet

@Module
object MyModuleD {
    @JvmStatic @Provides @ElementsIntoSet @QualifySetTwo
    fun provideSomeStrings(depA: DepA, depB: DepB) = setOf("456", "789")
}
