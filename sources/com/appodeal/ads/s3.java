package com.appodeal.ads;

import android.content.Context;
import kotlin.Result;

/* JADX INFO: loaded from: classes6.dex */
public final class s3 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public l4 f14450r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f14451s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Context f14452t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f14453u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ l4 f14454v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f14455w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(l4 l4Var, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f14454v = l4Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f14453u = obj;
        this.f14455w |= Integer.MIN_VALUE;
        Object objC = this.f14454v.c(null, null, this);
        return objC == pf.b.g() ? objC : Result.a(objC);
    }
}
