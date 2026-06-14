package io.appmetrica.analytics.impl;

import androidx.annotation.WorkerThread;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.cg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5018cg implements InterfaceC5549xg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5198jg f76972a;

    public C5018cg(C5198jg c5198jg) {
        this.f76972a = c5198jg;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5549xg
    @WorkerThread
    public final void a(@Nullable C5424sg c5424sg) {
        C5198jg c5198jg = this.f76972a;
        C5198jg.a(c5198jg, c5424sg, (InterfaceC4992bg) c5198jg.f77526d.getValue());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5549xg
    @WorkerThread
    public final void a(@NotNull Throwable th2) {
        C5198jg c5198jg = this.f76972a;
        C5198jg.a(c5198jg, null, (InterfaceC4992bg) c5198jg.f77526d.getValue());
    }
}
