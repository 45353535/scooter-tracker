package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.sm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4040sm extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f39559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39560b;

    public C4040sm(kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f39559a = obj;
        this.f39560b |= Integer.MIN_VALUE;
        return AbstractC4140wm.a(null, null, this);
    }
}
