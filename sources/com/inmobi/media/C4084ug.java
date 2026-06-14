package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.ug, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4084ug extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f39685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4134wg f39686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39687c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4084ug(C4134wg c4134wg, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f39686b = c4134wg;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f39685a = obj;
        this.f39687c |= Integer.MIN_VALUE;
        return C4134wg.a(this.f39686b, this);
    }
}
