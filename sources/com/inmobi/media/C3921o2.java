package com.inmobi.media;

import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: renamed from: com.inmobi.media.o2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3921o2 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Mutex f39149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f39150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC4020s2 f39151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f39152d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3921o2(AbstractC4020s2 abstractC4020s2, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f39151c = abstractC4020s2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f39150b = obj;
        this.f39152d |= Integer.MIN_VALUE;
        return AbstractC4020s2.a(this.f39151c, this);
    }
}
