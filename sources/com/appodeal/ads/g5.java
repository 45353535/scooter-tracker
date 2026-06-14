package com.appodeal.ads;

import android.content.Context;
import com.appodeal.ads.api.d;
import com.appodeal.ads.modules.common.internal.data.ApplicationData;

/* JADX INFO: loaded from: classes6.dex */
public final class g5 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public w5 f13341r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Context f13342s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ApplicationData f13343t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public d.b f13344u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f13345v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ w5 f13346w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f13347x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(w5 w5Var, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f13346w = w5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f13345v = obj;
        this.f13347x |= Integer.MIN_VALUE;
        return this.f13346w.e(null, null, this);
    }
}
