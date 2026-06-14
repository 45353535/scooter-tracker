package com.appodeal.consent.networking;

import com.appodeal.consent.ConsentUpdateRequestParameters;
import kotlin.Result;

/* JADX INFO: loaded from: classes6.dex */
public final class u extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ConsentUpdateRequestParameters f15539r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f15540s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f15541t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ v f15542u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f15543v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f15542u = vVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f15541t = obj;
        this.f15543v |= Integer.MIN_VALUE;
        Object objA = this.f15542u.a(null, null, this);
        return objA == pf.b.g() ? objA : Result.a(objA);
    }
}
