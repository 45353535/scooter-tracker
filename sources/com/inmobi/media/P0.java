package com.inmobi.media;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class P0 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Function1 f37512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f37513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ R0 f37514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f37515d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P0(R0 r02, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f37514c = r02;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f37513b = obj;
        this.f37515d |= Integer.MIN_VALUE;
        return this.f37514c.a((Function1) null, this);
    }
}
