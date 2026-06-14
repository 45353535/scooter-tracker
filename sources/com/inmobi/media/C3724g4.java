package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.g4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3724g4 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f38609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3774i4 f38610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f38611c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3724g4(C3774i4 c3774i4, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f38610b = c3774i4;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f38609a = obj;
        this.f38611c |= Integer.MIN_VALUE;
        return this.f38610b.b(this);
    }
}
