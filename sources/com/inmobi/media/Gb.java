package com.inmobi.media;

/* JADX INFO: loaded from: classes9.dex */
public final class Gb extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f36934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Jb f36935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f36936c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gb(Jb jb2, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f36935b = jb2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f36934a = obj;
        this.f36936c |= Integer.MIN_VALUE;
        return this.f36935b.a(null, null, this);
    }
}
