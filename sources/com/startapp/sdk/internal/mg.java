package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.SensorsConfig;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class mg extends ce implements zd {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final lb f64938j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final i4 f64939k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mg(Context context, lb prefs, lb consentManager, lb handler, i4 configProvider) {
        super(context, prefs, handler, "cc8b2544ce91bcdf", "7099d13208ad24ae");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        Intrinsics.checkNotNullParameter(consentManager, "consentManager");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(configProvider, "configProvider");
        this.f64938j = consentManager;
        this.f64939k = configProvider;
    }

    @Override // com.startapp.sdk.internal.ce
    public final Object a(String str) {
        return str;
    }

    @Override // com.startapp.sdk.internal.k6
    public final /* bridge */ /* synthetic */ Object c() {
        return "";
    }

    @Override // com.startapp.sdk.internal.ce
    public final long d() {
        this.f64939k.getClass();
        SensorsConfig sensorsConfigT = MetaData.E().T();
        if (sensorsConfigT != null) {
            return sensorsConfigT.h();
        }
        return 0L;
    }

    @Override // com.startapp.sdk.internal.ce
    public final boolean f() {
        Boolean boolB = ((h6) this.f64938j.a()).b();
        if (boolB != null && boolB.booleanValue()) {
            this.f64939k.getClass();
            SensorsConfig sensorsConfigT = MetaData.E().T();
            if (sensorsConfigT != null && sensorsConfigT.l()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.startapp.sdk.internal.ce
    public final void g() {
        i8 i8Var = new i8(this.f64817a, this);
        ((Executor) com.startapp.sdk.components.a.a(i8Var.f65589a).D.a()).execute(i8Var.f65592d);
    }

    @Override // com.startapp.sdk.internal.zd
    public final void a(Object obj) {
        b(obj != null ? obj.toString() : null);
    }
}
