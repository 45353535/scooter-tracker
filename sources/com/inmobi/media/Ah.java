package com.inmobi.media;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class Ah extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f36575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f36576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f36577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bh f36578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f36579e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ah(Bh bh2, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f36578d = bh2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f36577c = obj;
        this.f36579e |= Integer.MIN_VALUE;
        return this.f36578d.a((Ne) null, (List) null, this);
    }
}
