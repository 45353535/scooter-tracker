package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
public abstract class h {
    public static final f a(int i10, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        return new g(i10, scope, null);
    }

    public static final d.a c(int i10) {
        return i10 == 0 ? d.a.C0768a.f58158a : new d.a.b(i10, null);
    }
}
