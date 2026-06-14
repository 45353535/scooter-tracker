package com.appodeal.ads.utils.reflection;

import kotlin.Result;
import kotlin.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {
    public static Object a(String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        try {
            Result.Companion companion = Result.f93230c;
            Class<?> cls = Class.forName(className, false, a.class.getClassLoader());
            Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<T of com.appodeal.ads.utils.reflection.ReflectionClassCreatorImpl.obtainServiceClass>");
            return Result.b(cls.newInstance());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            return Result.b(d.a(th2));
        }
    }
}
