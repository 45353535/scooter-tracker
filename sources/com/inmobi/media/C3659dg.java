package com.inmobi.media;

import java.util.Iterator;

/* JADX INFO: renamed from: com.inmobi.media.dg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3659dg extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Iterator f38447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f38448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3684eg f38449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f38450d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3659dg(C3684eg c3684eg, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f38449c = c3684eg;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f38448b = obj;
        this.f38450d |= Integer.MIN_VALUE;
        return this.f38449c.a((String) null, this);
    }
}
