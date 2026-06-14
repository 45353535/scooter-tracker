package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.vj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5502vj implements Xa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f78460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f78461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f78462c;

    public C5502vj(String str, String str2, Throwable th2) {
        this.f78460a = str;
        this.f78461b = str2;
        this.f78462c = th2;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya2) {
        ya2.reportError(this.f78460a, this.f78461b, this.f78462c);
    }
}
