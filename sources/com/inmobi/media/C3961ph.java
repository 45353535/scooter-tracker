package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.ph, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3961ph extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f39287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f39288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3986qh f39289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f39290d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3961ph(C3986qh c3986qh, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f39289c = c3986qh;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f39288b = obj;
        this.f39290d |= Integer.MIN_VALUE;
        return this.f39289c.a(null, this);
    }
}
