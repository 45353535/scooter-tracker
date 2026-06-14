package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes12.dex */
public final class Lj implements Xa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f76084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte[] f76085b;

    public Lj(String str, byte[] bArr) {
        this.f76084a = str;
        this.f76085b = bArr;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya2) {
        ya2.setSessionExtra(this.f76084a, this.f76085b);
    }
}
