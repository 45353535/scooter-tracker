package com.appsflyer.internal;

import com.android.billingclient.BuildConfig;
import java.lang.reflect.Field;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class AFj1gSDK implements AFj1jSDK {
    @Override // com.appsflyer.internal.AFj1jSDK
    @NotNull
    public final String getRevenue() {
        Object objB;
        try {
            Result.Companion companion = Result.f93230c;
            Field declaredField = BuildConfig.class.getDeclaredField("VERSION_NAME");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            Intrinsics.checkNotNull(obj, "");
            objB = Result.b((String) obj);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        return (String) (Result.i(objB) ? "" : objB);
    }
}
