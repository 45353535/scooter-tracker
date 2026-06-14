package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class u0 implements t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f56963a;

    public u0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f56963a = context;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0
    public boolean a(String uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return v0.b(this.f56963a, uri);
    }
}
