package com.inmobi.media;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class Yf extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Rf f38055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Function2 f38056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f38057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Zf f38058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f38059e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Yf(Zf zf2, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f38058d = zf2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f38057c = obj;
        this.f38059e |= Integer.MIN_VALUE;
        return this.f38058d.a(null, null, this);
    }
}
