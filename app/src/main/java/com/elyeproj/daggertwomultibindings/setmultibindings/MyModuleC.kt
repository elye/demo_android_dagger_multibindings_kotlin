package com.elyeproj.daggertwomultibindings.setmultibindings

import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoSet

@Module
object MyModuleC {
    @JvmStatic @Provides @IntoSet @QualifySetTwo
    fun provideOneString(depA: DepA, depB: DepB) = "123"
}
