package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
public abstract class o {
    public static final m a(Context context, CoroutineScope scope, boolean z10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return new n(context, scope, z10);
    }
}
