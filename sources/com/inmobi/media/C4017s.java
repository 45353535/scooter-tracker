package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4017s extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f39490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4117w f39491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39492c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4017s(C4117w c4117w, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f39491b = c4117w;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f39490a = obj;
        this.f39492c |= Integer.MIN_VALUE;
        return C4117w.a(this.f39491b, null, null, 0, this);
    }
}
