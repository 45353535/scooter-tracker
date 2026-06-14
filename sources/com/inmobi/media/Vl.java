package com.inmobi.media;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class Vl extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f37919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Wl f37920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f37921c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Vl(Wl wl, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f37920b = wl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f37919a = obj;
        this.f37921c |= Integer.MIN_VALUE;
        return this.f37920b.a((String) null, (ArrayList) null, this);
    }
}
