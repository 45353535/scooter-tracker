package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.wj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5527wj implements Xa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f78533a;

    public C5527wj(Throwable th2) {
        this.f78533a = th2;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya2) {
        ya2.reportUnhandledException(this.f78533a);
    }
}
