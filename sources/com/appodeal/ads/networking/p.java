package com.appodeal.ads.networking;

import com.appodeal.ads.ed;
import kotlin.Result;

/* JADX INFO: loaded from: classes6.dex */
public final class p extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ed f14146r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public com.appodeal.ads.networking.processors.a f14147s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f14148t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f14149u;

    public p(kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f14148t = obj;
        this.f14149u |= Integer.MIN_VALUE;
        Object objA = v.a(null, null, this);
        return objA == pf.b.g() ? objA : Result.a(objA);
    }
}
