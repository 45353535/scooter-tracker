package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.utils.Log;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class x5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15250b;

    public x5(String className, String methodName) {
        Intrinsics.checkNotNullParameter(className, "className");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        this.f15249a = className;
        this.f15250b = methodName;
    }

    public final void a(String str) {
        String str2;
        String str3 = this.f15249a;
        if (str == null || str.length() == 0) {
            str2 = this.f15250b;
        } else {
            str2 = this.f15250b + ". " + str;
        }
        Log.log(LogConstants.KEY_SDK_PUBLIC, str3, str2, Log.LogLevel.verbose);
    }

    public final void b(String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Log.log(LogConstants.KEY_SDK_PUBLIC, this.f15249a, this.f15250b + ". Error during executing method - " + errorMessage, Log.LogLevel.verbose);
    }
}
