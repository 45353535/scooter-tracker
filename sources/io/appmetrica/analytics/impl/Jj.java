package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes12.dex */
public final class Jj implements Xa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Yj f76005a;

    public Jj(Yj yj) {
        this.f76005a = yj;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya2) {
        Xj xjA = ((C5247ld) this.f76005a).a();
        if (xjA != null) {
            ya2.reportEvent(xjA.f76672a, xjA.f76673b);
        }
    }
}
