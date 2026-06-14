package com.appodeal.ads;

import kotlin.Result;

/* JADX INFO: loaded from: classes6.dex */
public final class f5 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public j5 f13317r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f13318s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j5 f13319t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f13320u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5(j5 j5Var, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f13319t = j5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f13318s = obj;
        this.f13320u |= Integer.MIN_VALUE;
        Object objD = this.f13319t.d(this);
        return objD == pf.b.g() ? objD : Result.a(objD);
    }
}
