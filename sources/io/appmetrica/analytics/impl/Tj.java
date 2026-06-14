package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes12.dex */
public final class Tj implements Xa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f76519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f76520b;

    public Tj(String str, String str2) {
        this.f76519a = str;
        this.f76520b = str2;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya2) {
        ya2.reportEvent(this.f76519a, this.f76520b);
    }
}
