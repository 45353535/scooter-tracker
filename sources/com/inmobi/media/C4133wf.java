package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.wf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4133wf extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f39849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4183yf f39850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39851c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4133wf(C4183yf c4183yf, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f39850b = c4183yf;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f39849a = obj;
        this.f39851c |= Integer.MIN_VALUE;
        return C4183yf.a(this.f39850b, this);
    }
}
