package com.appodeal.ads.network.httpclients;

import com.appodeal.ads.network.HttpClient;
import com.appodeal.ads.network.NetworkResponseHandler;
import kotlin.Result;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public b f13955r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public HttpClient.Method f13956s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public NetworkResponseHandler f13957t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f13958u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public com.appodeal.ads.network.httpclients.verification.b f13959v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f13960w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f13961x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ b f13962y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f13963z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(continuation);
        this.f13962y = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f13961x = obj;
        this.f13963z |= Integer.MIN_VALUE;
        Object objMo4433enqueuetZkwj4A = this.f13962y.mo4433enqueuetZkwj4A(null, null, null, 0L, 0L, null, false, null, this);
        return objMo4433enqueuetZkwj4A == pf.b.g() ? objMo4433enqueuetZkwj4A : Result.a(objMo4433enqueuetZkwj4A);
    }
}
