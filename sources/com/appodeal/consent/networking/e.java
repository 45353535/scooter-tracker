package com.appodeal.consent.networking;

import kotlin.Result;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f15495r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f15496s;

    public e(kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f15495r = obj;
        this.f15496s |= Integer.MIN_VALUE;
        Object objB = f.b(null, null, null, this);
        return objB == pf.b.g() ? objB : Result.a(objB);
    }
}
