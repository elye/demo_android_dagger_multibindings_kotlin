package com.elyeproj.daggertwomultibindings.emptymultibindings

import dagger.Module
import dagger.multibindings.Multibinds
import java.util.Collections.emptySet
import dagger.multibindings.ElementsIntoSet
import dagger.Provides
import java.util.*

@Module
abstract class ParentModule {
    @Multibinds abstract fun aSet(): Set<String>
    @Multibinds abstract fun aMap(): Map<String, String>
}
