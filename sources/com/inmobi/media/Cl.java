package com.inmobi.media;

/* JADX INFO: loaded from: classes9.dex */
public final class Cl extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f36683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Fl f36684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f36685c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cl(Fl fl, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f36684b = fl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f36683a = obj;
        this.f36685c |= Integer.MIN_VALUE;
        return this.f36684b.a((String) null, this);
    }
}
