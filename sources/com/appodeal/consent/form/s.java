package com.appodeal.consent.form;

import kotlin.Result;

/* JADX INFO: loaded from: classes6.dex */
public final class s extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f15454r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ v f15455s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f15456t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(v vVar, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f15455s = vVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f15454r = obj;
        this.f15456t |= Integer.MIN_VALUE;
        Object objA = this.f15455s.a(null, null, null, this);
        return objA == pf.b.g() ? objA : Result.a(objA);
    }
}
