package io.appmetrica.analytics.impl;

import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5433t0 implements Ia {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f78251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f78252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5238l4 f78253c;

    public C5433t0() {
        IHandlerExecutor iHandlerExecutorA = C5186j4.l().g().a();
        this.f78252b = iHandlerExecutorA;
        this.f78251a = iHandlerExecutorA.getHandler();
        this.f78253c = new C5238l4();
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final void a(@Nullable AppMetricaConfig appMetricaConfig, @NonNull InterfaceC4961ab interfaceC4961ab) {
    }

    @Override // io.appmetrica.analytics.impl.Ia
    @NonNull
    public final Handler b() {
        return this.f78251a;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    @NonNull
    public final C4978b2 c() {
        return new C4978b2();
    }

    @Override // io.appmetrica.analytics.impl.Ia
    @NonNull
    public final C5394rb d() {
        return new C5394rb();
    }

    @Override // io.appmetrica.analytics.impl.Ia
    @NonNull
    public final ICommonExecutor getDefaultExecutor() {
        return this.f78252b;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    @NonNull
    public final C5238l4 a() {
        return this.f78253c;
    }
}
