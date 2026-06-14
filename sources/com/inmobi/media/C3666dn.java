package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.dn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3666dn extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f38472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3717fn f38473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f38474e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3666dn(C3717fn c3717fn, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f38473d = c3717fn;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f38472c = obj;
        this.f38474e |= Integer.MIN_VALUE;
        return C3717fn.a(this.f38473d, this);
    }
}
