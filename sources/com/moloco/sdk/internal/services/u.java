package com.moloco.sdk.internal.services;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f55721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f55723c;

    public u(String applicationName, String packageName, String version) {
        Intrinsics.checkNotNullParameter(applicationName, "applicationName");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(version, "version");
        this.f55721a = applicationName;
        this.f55722b = packageName;
        this.f55723c = version;
    }

    public final String a() {
        return this.f55722b;
    }

    public final String b() {
        return this.f55723c;
    }
}
