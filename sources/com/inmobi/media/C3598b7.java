package com.inmobi.media;

import java.util.List;

/* JADX INFO: renamed from: com.inmobi.media.b7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3598b7 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f38248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f38249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3876m7 f38250d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f38251e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3598b7(C3876m7 c3876m7, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f38250d = c3876m7;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f38249c = obj;
        this.f38251e |= Integer.MIN_VALUE;
        return this.f38250d.b(this);
    }
}
