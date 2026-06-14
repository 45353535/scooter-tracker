package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.service.Service;
import com.appodeal.ads.modules.common.internal.service.ServiceVariant;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class i8 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public n6 f13422r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Map f13423s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Iterator f13424t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ServiceVariant f13425u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f13426v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Service f13427w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f13428x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ n8 f13429y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f13430z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8(n8 n8Var, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f13429y = n8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f13428x = obj;
        this.f13430z |= Integer.MIN_VALUE;
        return this.f13429y.c(null, null, this);
    }
}
