package com.appodeal.consent.parameters;

import kotlin.coroutines.jvm.internal.d;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f15545r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f15546s;

    public a(d dVar) {
        super(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f15545r = obj;
        this.f15546s |= Integer.MIN_VALUE;
        return b.a(null, this);
    }
}
