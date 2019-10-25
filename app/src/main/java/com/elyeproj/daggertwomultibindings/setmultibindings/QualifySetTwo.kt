package com.elyeproj.daggertwomultibindings.setmultibindings

import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy

import javax.inject.Qualifier

@Qualifier
@Target(
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.PROPERTY_SETTER,
    AnnotationTarget.FIELD,
    AnnotationTarget.VALUE_PARAMETER,
    AnnotationTarget.ANNOTATION_CLASS)
@Retention(RetentionPolicy.RUNTIME)
internal annotation class QualifySetTwo
