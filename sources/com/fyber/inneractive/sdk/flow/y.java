package com.fyber.inneractive.sdk.flow;

import android.content.Context;
import com.fyber.inneractive.sdk.util.g1;

/* JADX INFO: loaded from: classes7.dex */
public final class y implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f21048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f21049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f21050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.util.g f21051d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f21052e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.click.o f21053f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b0 f21054g;

    public y(b0 b0Var, Context context, String str, g1 g1Var, com.fyber.inneractive.sdk.util.g gVar, boolean z10, com.fyber.inneractive.sdk.click.o oVar) {
        this.f21054g = b0Var;
        this.f21048a = context;
        this.f21049b = str;
        this.f21050c = g1Var;
        this.f21051d = gVar;
        this.f21052e = z10;
        this.f21053f = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f21054g.a(this.f21048a, this.f21049b, this.f21050c, this.f21051d, this.f21052e, this.f21053f);
    }
}
