package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.crashreport.ANRRemoteConfig;

/* JADX INFO: loaded from: classes11.dex */
public final class x3 implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ANRRemoteConfig f65526a;

    public x3(ANRRemoteConfig aNRRemoteConfig) {
        this.f65526a = aNRRemoteConfig;
    }

    @Override // com.startapp.sdk.internal.e
    public final long a(long j10) {
        return this.f65526a.b() - j10;
    }
}
