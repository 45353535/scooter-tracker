package com.google.common.eventbus;

import com.google.common.annotations.GwtCompatible;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes9.dex */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@GwtCompatible
@Retention(RetentionPolicy.RUNTIME)
@interface ParametricNullness {
}
