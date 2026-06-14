package com.appodeal.ads;

import android.content.Context;
import com.appodeal.ads.api.Device;

/* JADX INFO: loaded from: classes6.dex */
public final class k5 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Context f13538r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public RestrictedData f13539s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Device.b f13540t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f13541u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ w5 f13542v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f13543w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(w5 w5Var, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f13542v = w5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f13541u = obj;
        this.f13543w |= Integer.MIN_VALUE;
        return this.f13542v.f(null, null, this);
    }
}
