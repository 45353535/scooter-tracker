package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.k9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3828k9 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C3853l9 f38867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f38868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3853l9 f38869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f38870d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3828k9(C3853l9 c3853l9, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f38869c = c3853l9;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f38868b = obj;
        this.f38870d |= Integer.MIN_VALUE;
        return this.f38869c.a(this);
    }
}
