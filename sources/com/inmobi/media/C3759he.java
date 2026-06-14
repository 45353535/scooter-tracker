package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.he, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3759he extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f38710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4057te f38711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f38712c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3759he(C4057te c4057te, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f38711b = c4057te;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f38710a = obj;
        this.f38712c |= Integer.MIN_VALUE;
        return this.f38711b.a(this);
    }
}
