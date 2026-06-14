package com.fyber.inneractive.sdk.flow.nativead.mainasset;

import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.i;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.flow.u;
import com.fyber.inneractive.sdk.flow.x;
import com.fyber.inneractive.sdk.player.s;
import com.fyber.inneractive.sdk.response.g;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements d, s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f20817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.response.nativead.f f20818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g f20819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InneractiveAdRequest f20820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f20821e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.nativead.b f20823g = com.fyber.inneractive.sdk.flow.nativead.b.UNINITIALIZED;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public u f20822f = new u();

    public f(com.fyber.inneractive.sdk.response.nativead.f fVar, r rVar, g gVar, InneractiveAdRequest inneractiveAdRequest, String str, com.fyber.inneractive.sdk.flow.nativead.f fVar2) {
        this.f20818b = fVar;
        this.f20817a = rVar;
        this.f20819c = gVar;
        this.f20820d = inneractiveAdRequest;
        this.f20821e = fVar2;
    }

    @Override // com.fyber.inneractive.sdk.player.s
    public final void a(InneractiveInfrastructureError inneractiveInfrastructureError) {
        InneractiveInfrastructureError inneractiveInfrastructureError2 = new InneractiveInfrastructureError(inneractiveInfrastructureError.getErrorCode(), i.NATIVE_AD_VIDEO_LOAD_FAILED);
        this.f20823g = com.fyber.inneractive.sdk.flow.nativead.b.FAILED;
        c cVar = this.f20821e;
        if (cVar != null) {
            ((com.fyber.inneractive.sdk.flow.nativead.f) cVar).a(inneractiveInfrastructureError2, "onAdFailedToLoad");
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.c
    public final void b() {
        com.fyber.inneractive.sdk.response.nativead.f fVar;
        com.fyber.inneractive.sdk.response.nativead.e eVar;
        String str;
        g gVar;
        if (this.f20822f != null && (fVar = this.f20818b) != null && (eVar = fVar.f23757c) != null && (str = eVar.f23754a) != null && !str.trim().isEmpty() && (gVar = this.f20819c) != null) {
            this.f20823g = com.fyber.inneractive.sdk.flow.nativead.b.LOADING;
            this.f20822f.a(this.f20817a, gVar, this.f20820d, this);
            return;
        }
        InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, i.VIDEO_ERROR_NULL);
        this.f20823g = com.fyber.inneractive.sdk.flow.nativead.b.FAILED;
        c cVar = this.f20821e;
        if (cVar != null) {
            ((com.fyber.inneractive.sdk.flow.nativead.f) cVar).a(inneractiveInfrastructureError, "mVideoContentLoader is null, can't start loading");
        }
        IAlog.b("%smVideoContentLoader is null, can't start loading", IAlog.a(this));
    }

    @Override // com.fyber.inneractive.sdk.player.s
    public final void c() {
        u uVar;
        this.f20823g = com.fyber.inneractive.sdk.flow.nativead.b.LOADED;
        c cVar = this.f20821e;
        if (cVar == null || (uVar = this.f20822f) == null) {
            IAlog.b("%sCan't notify success, required member is null in onAdLoaded. Is null: mLoadListener: %s, mVideoContentLoader: %s", IAlog.a(this), Boolean.valueOf(this.f20821e == null), Boolean.valueOf(this.f20822f == null));
            return;
        }
        t0 t0Var = (t0) uVar.f20754c;
        com.fyber.inneractive.sdk.flow.nativead.f fVar = (com.fyber.inneractive.sdk.flow.nativead.f) cVar;
        if (t0Var == null) {
            fVar.a(new InneractiveInfrastructureError(InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD, i.NATIVE_AD_EMPTY_CONTENT), "Undetectable main media");
        } else {
            fVar.f20781e = t0Var;
            fVar.a();
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.c
    public final void destroy() {
        u uVar = this.f20822f;
        if (uVar != null) {
            x xVar = uVar.f20754c;
            if (xVar != null) {
                ((t0) xVar).destroy();
            }
            u uVar2 = this.f20822f;
            uVar2.getClass();
            IAlog.a("%s: IAAdContentLoaderImpl : cancel load ad content retry task", IAlog.a(uVar2));
            com.fyber.inneractive.sdk.util.r.f23896b.removeCallbacks(uVar2.f20763l);
            uVar2.f20762k.a();
            this.f20822f = null;
        }
        this.f20821e = null;
        this.f20820d = null;
        this.f20819c = null;
        this.f20823g = com.fyber.inneractive.sdk.flow.nativead.b.DESTROYED;
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.c
    public final boolean a() {
        return this.f20823g == com.fyber.inneractive.sdk.flow.nativead.b.LOADING;
    }
}
