package com.moloco.sdk.internal.services.events;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f55575a = d.f55576a;

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b
    public void a(boolean z10, boolean z11, String appForegroundUrl, String appBackgroundUrl) {
        Intrinsics.checkNotNullParameter(appForegroundUrl, "appForegroundUrl");
        Intrinsics.checkNotNullParameter(appBackgroundUrl, "appBackgroundUrl");
        this.f55575a = new e(z10, z11, appForegroundUrl, appBackgroundUrl);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b
    public boolean b() {
        return this.f55575a.d();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b
    public boolean c() {
        return this.f55575a.c();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b
    public String d() {
        return this.f55575a.b();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b
    public String a() {
        return this.f55575a.a();
    }
}
