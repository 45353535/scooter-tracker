package com.inmobi.media;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class Ve extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f37907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f37908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3632cf f37909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f37910e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ve(C3632cf c3632cf, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f37909d = c3632cf;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f37908c = obj;
        this.f37910e |= Integer.MIN_VALUE;
        return this.f37909d.b(this);
    }
}
