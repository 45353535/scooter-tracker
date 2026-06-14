package com.explorestack.iab.vast.processor;

import h2.t;

/* JADX INFO: loaded from: classes5.dex */
class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f18308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f18309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f18310c;

    e() {
        this(true, true, true);
    }

    boolean a() {
        return this.f18309b;
    }

    boolean b() {
        return this.f18310c;
    }

    boolean c() {
        return this.f18308a;
    }

    e(t tVar) {
        this(tVar.N("followAdditionalWrappers", true), tVar.N("allowMultipleAds", true), tVar.N("fallbackOnNoAd", true));
    }

    private e(boolean z10, boolean z11, boolean z12) {
        this.f18308a = z10;
        this.f18309b = z11;
        this.f18310c = z12;
    }
}
