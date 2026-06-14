package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes12.dex */
public final class Sj implements Xa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f76448a;

    public Sj(String str) {
        this.f76448a = str;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya2) {
        ya2.reportEvent(this.f76448a);
    }
}
