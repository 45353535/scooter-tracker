package com.appodeal.consent.revoke;

import kotlin.Result;
import kotlin.coroutines.jvm.internal.d;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f15547r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f15548s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f15549t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, d dVar) {
        super(dVar);
        this.f15548s = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f15547r = obj;
        this.f15549t |= Integer.MIN_VALUE;
        Object objA = this.f15548s.a(null, null, null, this);
        return objA == pf.b.g() ? objA : Result.a(objA);
    }
}
