package com.appodeal.ads.services.firebase;

import kotlin.Result;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f14671r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ FirebaseService f14672s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f14673t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(FirebaseService firebaseService, Continuation continuation) {
        super(continuation);
        this.f14672s = firebaseService;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f14671r = obj;
        this.f14673t |= Integer.MIN_VALUE;
        Object objB = this.f14672s.mo4428initializegIAlus(null, this);
        return objB == pf.b.g() ? objB : Result.a(objB);
    }
}
