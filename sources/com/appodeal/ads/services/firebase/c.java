package com.appodeal.ads.services.firebase;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public FirebaseService f14666r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public List f14667s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f14668t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ FirebaseService f14669u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f14670v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(FirebaseService firebaseService, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f14669u = firebaseService;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f14668t = obj;
        this.f14670v |= Integer.MIN_VALUE;
        return FirebaseService.c(this.f14669u, null, this);
    }
}
