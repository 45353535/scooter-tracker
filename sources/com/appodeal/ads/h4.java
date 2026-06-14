package com.appodeal.ads;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class h4 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Iterator f13382r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f13383s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j5 f13384t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f13385u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(j5 j5Var, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f13384t = j5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f13383s = obj;
        this.f13385u |= Integer.MIN_VALUE;
        return j5.b(this.f13384t, null, null, null, null, this);
    }
}
