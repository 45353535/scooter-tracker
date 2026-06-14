package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes12.dex */
public final class Pj implements Xa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f76265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f76266b;

    public Pj(String str, String str2) {
        this.f76265a = str;
        this.f76266b = str2;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya2) {
        ya2.putAppEnvironmentValue(this.f76265a, this.f76266b);
    }
}
