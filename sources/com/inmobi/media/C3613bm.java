package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.bm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3613bm extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C3941om f38290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f38291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3941om f38292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f38293d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3613bm(C3941om c3941om, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f38292c = c3941om;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f38291b = obj;
        this.f38293d |= Integer.MIN_VALUE;
        return this.f38292c.a(this);
    }
}
