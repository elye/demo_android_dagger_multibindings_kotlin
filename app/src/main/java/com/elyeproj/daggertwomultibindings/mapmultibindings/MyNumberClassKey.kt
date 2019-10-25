package com.elyeproj.daggertwomultibindings.mapmultibindings

import dagger.MapKey
import kotlin.reflect.KClass

@MapKey
annotation class MyNumberClassKey(val value: KClass<out Number>)
