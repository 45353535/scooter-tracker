package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.kj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3838kj extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f38895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Cj f38896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f38897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3913nj f38898d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f38899e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3838kj(C3913nj c3913nj, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f38898d = c3913nj;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f38897c = obj;
        this.f38899e |= Integer.MIN_VALUE;
        return C3913nj.a(this.f38898d, null, null, this);
    }
}
