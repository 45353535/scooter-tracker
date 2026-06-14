package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class j {
    public static final int a(int i10, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (int) (i10 * context.getResources().getDisplayMetrics().density);
    }
}
