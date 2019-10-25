package com.elyeproj.daggertwomultibindings.setmultibindings

import dagger.Module
import dagger.Provides
import dagger.multibindings.ElementsIntoSet

@Module
object MyModuleB {
    @JvmStatic @Provides @ElementsIntoSet @QualifySetOne
    fun provideSomeStrings(depA: DepA, depB: DepB) = setOf("DEF", "GHI")
}
