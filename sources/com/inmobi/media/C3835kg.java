package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.kg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3835kg extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Rf f38884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f38885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3935og f38886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f38887d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3835kg(C3935og c3935og, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f38886c = c3935og;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f38885b = obj;
        this.f38887d |= Integer.MIN_VALUE;
        return this.f38886c.a((String) null, this);
    }
}
