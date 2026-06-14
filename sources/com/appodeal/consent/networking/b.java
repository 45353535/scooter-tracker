package com.appodeal.consent.networking;

import kotlin.Result;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f15482r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f15483s;

    public b(kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f15482r = obj;
        this.f15483s |= Integer.MIN_VALUE;
        Object objA = f.a(null, this);
        return objA == pf.b.g() ? objA : Result.a(objA);
    }
}
