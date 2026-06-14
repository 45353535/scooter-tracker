package com.appodeal.ads;

import android.content.Context;
import com.appodeal.ads.modules.common.internal.data.ApplicationData;

/* JADX INFO: loaded from: classes6.dex */
public final class fb extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Context f13324r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ApplicationData f13325s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f13326t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ hc f13327u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f13328v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb(hc hcVar, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f13327u = hcVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f13326t = obj;
        this.f13328v |= Integer.MIN_VALUE;
        return this.f13327u.b(null, null, this);
    }
}
