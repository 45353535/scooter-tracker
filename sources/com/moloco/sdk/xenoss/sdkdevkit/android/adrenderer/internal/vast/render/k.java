package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f58227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t f58228c;

    public k(j resource, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t tVar) {
        Intrinsics.checkNotNullParameter(resource, "resource");
        this.f58227b = resource;
        this.f58228c = tVar;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t
    public void destroy() {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t tVar = this.f58228c;
        if (tVar != null) {
            tVar.destroy();
        }
    }

    public final j k() {
        return this.f58227b;
    }
}
