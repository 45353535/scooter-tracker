package com.moloco.sdk.internal.services;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f55588a;

    public g(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f55588a = context;
    }

    @Override // com.moloco.sdk.internal.services.f
    public e a() {
        com.moloco.sdk.common_adapter_internal.b bVarInvoke = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.a0.a(this.f55588a).invoke();
        float fE = bVarInvoke.e();
        return new e(bVarInvoke.f(), fE, bVarInvoke.c(), bVarInvoke.b(), bVarInvoke.d(), bVarInvoke.a(), this.f55588a.getResources().getDisplayMetrics().xdpi, this.f55588a.getResources().getDisplayMetrics().ydpi);
    }

    @Override // com.moloco.sdk.internal.services.f
    public h b() {
        int i10 = this.f55588a.getResources().getConfiguration().orientation;
        return i10 != 1 ? i10 != 2 ? h.f55589b : h.f55591d : h.f55590c;
    }

    @Override // com.moloco.sdk.internal.services.f
    public e invoke() {
        return a();
    }
}
