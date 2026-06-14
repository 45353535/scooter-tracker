package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes10.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j0 f56170a = new j0();

    public final boolean a(String adm) {
        Intrinsics.checkNotNullParameter(adm, "adm");
        return StringsKt.e0(adm, "mraid.js", true);
    }

    public final boolean b(String adm) {
        Intrinsics.checkNotNullParameter(adm, "adm");
        return StringsKt.e0(adm, "<VAST", true);
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r c(String adm) {
        Intrinsics.checkNotNullParameter(adm, "adm");
        return b(adm) ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r.f58894b : a(adm) ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r.f58895c : com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r.f58896d;
    }
}
