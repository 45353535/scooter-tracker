package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f56392a = new d();

    public final float a(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public final float b(float f10, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return f10 / a(context);
    }

    public final int c(float f10, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (int) (b(f10, context) + 0.5f);
    }
}
