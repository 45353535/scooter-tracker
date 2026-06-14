package com.appodeal.ads.services;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public r f14646r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f14647s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f14648t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Map f14649u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f14650v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f14651w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f14652x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(r rVar, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f14651w = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f14650v = obj;
        this.f14652x |= Integer.MIN_VALUE;
        return this.f14651w.c(null, null, null, this);
    }
}
