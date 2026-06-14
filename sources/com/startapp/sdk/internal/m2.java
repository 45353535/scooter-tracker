package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.remoteconfig.BluetoothConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class m2 extends ce implements zd {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final lb f64905j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final lb f64906k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f4 f64907l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(Context context, lb commonPrefs, lb prefs, lb consentManager, lb handler, f4 configProvider) {
        super(context, prefs, handler, "26787005dc4a1477", "c8ef3e50475fc527");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(commonPrefs, "commonPrefs");
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        Intrinsics.checkNotNullParameter(consentManager, "consentManager");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(configProvider, "configProvider");
        this.f64905j = commonPrefs;
        this.f64906k = consentManager;
        this.f64907l = configProvider;
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
        this.f64907l.getClass();
        BluetoothConfig bluetoothConfigL = MetaData.E().l();
        if (bluetoothConfigL != null) {
            return bluetoothConfigL.b();
        }
        return 0L;
    }

    @Override // com.startapp.sdk.internal.ce
    public final boolean f() {
        Boolean boolB = ((h6) this.f64906k.a()).b();
        if (boolB != null && boolB.booleanValue()) {
            this.f64907l.getClass();
            BluetoothConfig bluetoothConfigL = MetaData.E().l();
            if (bluetoothConfigL != null && bluetoothConfigL.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.startapp.sdk.internal.ce
    public final void g() {
        Context context = this.f64817a;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        lb lbVar = this.f64905j;
        this.f64907l.getClass();
        long millis = TimeUnit.SECONDS.toMillis(MetaData.E().l() != null ? r2.c() : 0);
        this.f64907l.getClass();
        com.startapp.sdk.adsbase.periodic.a aVar = new com.startapp.sdk.adsbase.periodic.a(context, this, lbVar, millis, TimeUnit.MINUTES.toMillis(MetaData.E().l() != null ? r2.a() : 0));
        ((Executor) com.startapp.sdk.components.a.a(aVar.f65589a).D.a()).execute(aVar.f65592d);
    }

    @Override // com.startapp.sdk.internal.zd
    public final void a(Object obj) {
        b(obj != null ? obj.toString() : null);
    }
}
