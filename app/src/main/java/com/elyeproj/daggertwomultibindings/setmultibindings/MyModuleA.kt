package com.elyeproj.daggertwomultibindings.setmultibindings

import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoSet

@Module
object MyModuleA {
    @JvmStatic @Provides @IntoSet @QualifySetOne
    fun provideOneString(depA: DepA, depB: DepB) = "ABC"
}
