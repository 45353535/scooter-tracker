package io.bidmachine.iab.vast.processor;

import e9.u;

/* JADX INFO: loaded from: classes12.dex */
class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f80447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f80448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f80449c;

    e() {
        this(true, true, true);
    }

    boolean a() {
        return this.f80448b;
    }

    boolean b() {
        return this.f80449c;
    }

    boolean c() {
        return this.f80447a;
    }

    e(u uVar) {
        this(uVar.M("followAdditionalWrappers", true), uVar.M("allowMultipleAds", true), uVar.M("fallbackOnNoAd", true));
    }

    private e(boolean z10, boolean z11, boolean z12) {
        this.f80447a = z10;
        this.f80448b = z11;
        this.f80449c = z12;
    }
}
