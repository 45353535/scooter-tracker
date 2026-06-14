package com.appodeal.consent.networking;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f15500d;

    public g(String key, String packageName, String packageVersion, String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(packageVersion, "packageVersion");
        this.f15497a = key;
        this.f15498b = packageName;
        this.f15499c = packageVersion;
        this.f15500d = str;
    }
}
