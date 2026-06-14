package com.appodeal.consent.networking;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends kotlin.coroutines.jvm.internal.d {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ k C;
    public int D;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public k f15501r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public g f15502s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public l f15503t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public m f15504u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public JSONObject f15505v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public JSONObject f15506w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public com.appodeal.consent.cache.p[] f15507x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public com.appodeal.consent.cache.p f15508y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f15509z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.C = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.a(this);
    }
}
