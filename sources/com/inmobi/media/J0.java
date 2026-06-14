package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class J0 implements Eg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ L0 f37084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f37085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ej f37086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f37087d;

    public J0(L0 l02, boolean z10, Ej ej, String str) {
        this.f37084a = l02;
        this.f37085b = z10;
        this.f37086c = ej;
        this.f37087d = str;
    }

    @Override // com.inmobi.media.Eg
    public final void onError(Exception exc) {
        this.f37084a.a(exc, this.f37086c);
    }

    @Override // com.inmobi.media.Eg
    public final void a(String result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f37084a.a("file saved - " + result + " , isReporting - " + this.f37085b);
        this.f37084a.a(result, this.f37086c, this.f37087d, this.f37085b);
    }
}
