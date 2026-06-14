package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.r6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3999r6 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f39443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4074u6 f39444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f39445d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3999r6(C4074u6 c4074u6, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f39444c = c4074u6;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f39443b = obj;
        this.f39445d |= Integer.MIN_VALUE;
        return C4074u6.a(this.f39444c, this);
    }
}
