package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.hg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3761hg extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f38714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f38715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC3785ig f38716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f38717d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3761hg(AbstractC3785ig abstractC3785ig, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f38716c = abstractC3785ig;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f38715b = obj;
        this.f38717d |= Integer.MIN_VALUE;
        return this.f38716c.a((String) null, this);
    }
}
