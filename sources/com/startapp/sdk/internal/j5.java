package com.startapp.sdk.internal;

import android.content.Context;
import io.bidmachine.ads.networks.gam.BuildConfig;
import java.util.Collections;

/* JADX INFO: loaded from: classes11.dex */
public final class j5 implements k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f64747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f64748b;

    public j5(com.startapp.sdk.components.a aVar, Context context) {
        this.f64748b = aVar;
        this.f64747a = context;
    }

    @Override // com.startapp.sdk.internal.k7
    public final Object a() {
        return new c6(Collections.singletonMap(BuildConfig.ADAPTER_NAME, new q7(this.f64747a, this.f64748b.C)));
    }
}
