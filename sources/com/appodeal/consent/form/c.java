package com.appodeal.consent.form;

import kotlin.Result;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f15410r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r f15411s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f15412t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(r rVar, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f15411s = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f15410r = obj;
        this.f15412t |= Integer.MIN_VALUE;
        Object objC = r.c(this.f15411s, null, null, this);
        return objC == pf.b.g() ? objC : Result.a(objC);
    }
}
