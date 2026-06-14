package com.inmobi.media;

/* JADX INFO: loaded from: classes9.dex */
public final class Ja extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f37120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ La f37121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f37122c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ja(La la2, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f37121b = la2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f37120a = obj;
        this.f37122c |= Integer.MIN_VALUE;
        return La.a(this.f37121b, this);
    }
}
