package com.startapp.sdk.internal;

import com.startapp.sdk.ads.external.config.AdUnitConfig;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c6 implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f64338a;

    public c6(Map factories) {
        Intrinsics.checkNotNullParameter(factories, "factories");
        this.f64338a = factories;
    }

    @Override // com.startapp.sdk.internal.k0
    public final void a() {
        Iterator it = this.f64338a.values().iterator();
        while (it.hasNext()) {
            ((k0) it.next()).a();
        }
    }

    @Override // com.startapp.sdk.internal.k0
    public final void b(AdUnitConfig config, Function1 listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        k0 k0Var = (k0) this.f64338a.get(config.getNetwork());
        if (k0Var != null) {
            k0Var.b(config, listener);
        } else {
            listener.invoke(null);
        }
    }

    @Override // com.startapp.sdk.internal.k0
    public final void a(AdUnitConfig config, Function1 listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        k0 k0Var = (k0) this.f64338a.get(config.getNetwork());
        if (k0Var != null) {
            k0Var.a(config, listener);
        } else {
            listener.invoke(null);
        }
    }
}
