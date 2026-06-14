package com.inmobi.media;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.inmobi.media.b9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3600b9 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Function1 f38254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f38255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3729g9 f38256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f38257d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3600b9(C3729g9 c3729g9, Continuation continuation) {
        super(continuation);
        this.f38256c = c3729g9;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f38255b = obj;
        this.f38257d |= Integer.MIN_VALUE;
        return this.f38256c.a((Function1) null, this);
    }
}
