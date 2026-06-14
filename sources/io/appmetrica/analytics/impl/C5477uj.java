package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.uj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5477uj implements Xa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f78393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f78394b;

    public C5477uj(String str, Throwable th2) {
        this.f78393a = str;
        this.f78394b = th2;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya2) {
        ya2.reportError(this.f78393a, this.f78394b);
    }
}
