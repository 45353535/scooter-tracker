package com.fyber.inneractive.sdk.flow;

import android.content.Context;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes7.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f21041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0 f21042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InneractiveAdRequest f21043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.response.g f21044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.model.vast.b f21045e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final JSONArray f21046f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.global.features.u f21047g;

    public x0(Context context, t0 t0Var) {
        com.fyber.inneractive.sdk.config.global.features.u uVar;
        JSONArray jSONArrayB;
        com.fyber.inneractive.sdk.config.global.r rVar = t0Var.f21037c;
        InneractiveAdRequest inneractiveAdRequest = t0Var.f21035a;
        com.fyber.inneractive.sdk.response.g gVar = (com.fyber.inneractive.sdk.response.g) t0Var.f21036b;
        com.fyber.inneractive.sdk.model.vast.b bVar = gVar.O;
        if (rVar != null) {
            uVar = (com.fyber.inneractive.sdk.config.global.features.u) rVar.a(com.fyber.inneractive.sdk.config.global.features.u.class);
            jSONArrayB = rVar.b();
        } else {
            uVar = null;
            jSONArrayB = null;
        }
        this.f21041a = context;
        this.f21042b = t0Var;
        this.f21043c = inneractiveAdRequest;
        this.f21044d = gVar;
        this.f21045e = bVar;
        this.f21047g = uVar;
        this.f21046f = jSONArrayB;
    }
}
