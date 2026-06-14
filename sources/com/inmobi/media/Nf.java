package com.inmobi.media;

import android.app.Activity;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: loaded from: classes9.dex */
public final class Nf extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f37446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Mutex f37447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f37448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Pf f37449d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f37450e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Nf(Pf pf2, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f37449d = pf2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f37448c = obj;
        this.f37450e |= Integer.MIN_VALUE;
        return Pf.a(this.f37449d, null, this);
    }
}
