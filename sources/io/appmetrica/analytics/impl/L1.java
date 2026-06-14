package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* JADX INFO: loaded from: classes12.dex */
public final class L1 implements A1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ICommonExecutor f76043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A1 f76044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f76045c;

    public L1(@NonNull A1 a12) {
        this(C5468ua.k().x().b(), a12);
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void a(Intent intent, int i10) {
        this.f76043a.execute(new D1(this, intent, i10));
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void b(Intent intent) {
        this.f76043a.execute(new H1(this, intent));
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void c(Intent intent) {
        this.f76043a.execute(new G1(this, intent));
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void onConfigurationChanged(@NonNull Configuration configuration) {
        this.f76043a.execute(new B1(this, configuration));
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final synchronized void onCreate() {
        this.f76045c = true;
        this.f76043a.execute(new C1(this));
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void onDestroy() {
        this.f76043a.removeAll();
        synchronized (this) {
            this.f76045c = false;
        }
        this.f76044b.onDestroy();
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void pauseUserSession(@NonNull Bundle bundle) {
        this.f76043a.execute(new K1(this, bundle));
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void reportData(int i10, Bundle bundle) {
        this.f76043a.execute(new I1(this, i10, bundle));
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void resumeUserSession(@NonNull Bundle bundle) {
        this.f76043a.execute(new J1(this, bundle));
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void a(Intent intent, int i10, int i11) {
        this.f76043a.execute(new E1(this, intent, i10, i11));
    }

    public L1(IHandlerExecutor iHandlerExecutor, A1 a12) {
        this.f76045c = false;
        this.f76043a = iHandlerExecutor;
        this.f76044b = a12;
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void a(Intent intent) {
        this.f76043a.execute(new F1(this, intent));
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void a(@NonNull InterfaceC5584z1 interfaceC5584z1) {
        this.f76044b.a(interfaceC5584z1);
    }
}
