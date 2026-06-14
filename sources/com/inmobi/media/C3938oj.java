package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.oj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3938oj extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f39210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3963pj f39211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39212c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3938oj(C3963pj c3963pj, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f39211b = c3963pj;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f39210a = obj;
        this.f39212c |= Integer.MIN_VALUE;
        return this.f39211b.a(this);
    }
}
