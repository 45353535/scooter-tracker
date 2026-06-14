package com.inmobi.media;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: com.inmobi.media.oh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3936oh extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CoroutineContext f39204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f39205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3986qh f39206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f39207d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3936oh(C3986qh c3986qh, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f39206c = c3986qh;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f39205b = obj;
        this.f39207d |= Integer.MIN_VALUE;
        return this.f39206c.a(this);
    }
}
