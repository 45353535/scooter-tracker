package com.inmobi.media;

import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public final class Eb extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Iterator f36784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f36785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f36786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Jb f36787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f36788e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Eb(Jb jb2, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f36787d = jb2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f36786c = obj;
        this.f36788e |= Integer.MIN_VALUE;
        return this.f36787d.a((C3980qb) null, this);
    }
}
