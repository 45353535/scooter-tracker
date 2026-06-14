package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes12.dex */
public final class Y1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC5145he f76686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G7 f76687b;

    public Y1(C4952a2 c4952a2, G7 g72) {
        this.f76686a = c4952a2;
        this.f76687b = g72;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f76686a.consume(this.f76687b);
    }
}
