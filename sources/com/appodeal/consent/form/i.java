package com.appodeal.consent.form;

import kotlin.Result;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f15426r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r f15427s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f15428t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(r rVar, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f15427s = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f15426r = obj;
        this.f15428t |= Integer.MIN_VALUE;
        Object objA = this.f15427s.a(null, null, this);
        return objA == pf.b.g() ? objA : Result.a(objA);
    }
}
