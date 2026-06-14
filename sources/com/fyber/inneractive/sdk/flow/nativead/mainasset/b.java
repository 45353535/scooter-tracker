package com.fyber.inneractive.sdk.flow.nativead.mainasset;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.i;
import com.fyber.inneractive.sdk.flow.nativead.g;
import com.fyber.inneractive.sdk.flow.nativead.s;
import com.fyber.inneractive.sdk.flow.nativead.t;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.u0;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.response.nativead.j;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements d, s {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f20809h = IAlog.a(b.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.response.nativead.f f20810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f20811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u0 f20812c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.nativead.b f20813d = com.fyber.inneractive.sdk.flow.nativead.b.UNINITIALIZED;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j f20814e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public r f20815f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f20816g;

    public b(com.fyber.inneractive.sdk.response.nativead.f fVar, com.fyber.inneractive.sdk.flow.nativead.f fVar2, j jVar, r rVar) {
        this.f20810a = fVar;
        this.f20811b = fVar2;
        this.f20814e = jVar;
        this.f20815f = rVar;
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.s
    public final void a(g gVar, Exception exc, com.fyber.inneractive.sdk.response.nativead.f fVar) {
        String message;
        if (this.f20813d == com.fyber.inneractive.sdk.flow.nativead.b.LOADED) {
            return;
        }
        if (gVar == null) {
            this.f20813d = com.fyber.inneractive.sdk.flow.nativead.b.FAILED;
            i iVar = i.NATIVE_AD_IMAGE_LOAD_FAILED;
            if (exc != null) {
                message = exc.getMessage();
            } else {
                message = "Failed to download main media image: " + iVar.name();
            }
            IAlog.f("%s : %s", f20809h, message);
            InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD, iVar);
            c cVar = this.f20811b;
            if (cVar != null) {
                ((com.fyber.inneractive.sdk.flow.nativead.f) cVar).a(inneractiveInfrastructureError, message);
                return;
            }
            return;
        }
        if (this.f20814e != null && this.f20815f != null) {
            u uVar = u.EVENT_READY_ON_CLIENT;
            j jVar = this.f20814e;
            JSONArray jSONArrayB = this.f20815f.b();
            w wVar = new w(jVar);
            wVar.f21418c = uVar;
            wVar.f21416a = null;
            wVar.f21419d = jSONArrayB;
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f20816g;
            IAlog.a("%sMain image load took: " + jCurrentTimeMillis + " msec", IAlog.a(this));
            JSONObject jSONObject = new JSONObject();
            String str = this.f20810a.f23758d.f23752a;
            try {
                jSONObject.put("url", str);
            } catch (Exception unused) {
                IAlog.f("Got exception adding param to json object: %s, %s", "url", str);
            }
            String strB = com.fyber.inneractive.sdk.util.u.b(gVar.f20790b);
            try {
                jSONObject.put("mime", strB);
            } catch (Exception unused2) {
                IAlog.f("Got exception adding param to json object: %s, %s", "mime", strB);
            }
            Long lValueOf = Long.valueOf(jCurrentTimeMillis);
            try {
                jSONObject.put("load_time", lValueOf);
            } catch (Exception unused3) {
                IAlog.f("Got exception adding param to json object: %s, %s", "load_time", lValueOf);
            }
            wVar.f21421f.put(jSONObject);
            wVar.a((String) null);
        }
        this.f20813d = com.fyber.inneractive.sdk.flow.nativead.b.LOADED;
        c cVar2 = this.f20811b;
        if (cVar2 != null) {
            com.fyber.inneractive.sdk.flow.nativead.f fVar2 = (com.fyber.inneractive.sdk.flow.nativead.f) cVar2;
            fVar2.f20780d.add(gVar);
            fVar2.a();
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.c
    public final void b() {
        com.fyber.inneractive.sdk.response.nativead.c cVar;
        String str;
        com.fyber.inneractive.sdk.response.nativead.f fVar = this.f20810a;
        if (fVar != null && (cVar = fVar.f23758d) != null && (str = cVar.f23752a) != null && !str.trim().isEmpty()) {
            this.f20816g = System.currentTimeMillis();
            this.f20813d = com.fyber.inneractive.sdk.flow.nativead.b.LOADING;
            t tVar = new t(this.f20810a, this);
            IAConfigManager iAConfigManager = IAConfigManager.O;
            u0 u0Var = new u0(tVar, iAConfigManager.f20316v.f20407a, new com.fyber.inneractive.sdk.cache.d(this.f20810a.f23758d.f23752a));
            this.f20812c = u0Var;
            iAConfigManager.f20313s.a(u0Var);
            return;
        }
        a aVar = new a("Main media image is not loadable");
        this.f20813d = com.fyber.inneractive.sdk.flow.nativead.b.FAILED;
        i iVar = i.NATIVE_AD_IMAGE_LOAD_FAILED;
        String message = aVar.getMessage();
        IAlog.f("%s : %s", f20809h, message);
        InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD, iVar);
        c cVar2 = this.f20811b;
        if (cVar2 != null) {
            ((com.fyber.inneractive.sdk.flow.nativead.f) cVar2).a(inneractiveInfrastructureError, message);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.c
    public final void destroy() {
        u0 u0Var = this.f20812c;
        if (u0Var != null) {
            u0Var.c();
            this.f20812c = null;
        }
        this.f20814e = null;
        this.f20815f = null;
        this.f20810a = null;
        this.f20811b = null;
        this.f20813d = com.fyber.inneractive.sdk.flow.nativead.b.DESTROYED;
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.c
    public final boolean a() {
        return this.f20813d == com.fyber.inneractive.sdk.flow.nativead.b.LOADING;
    }
}
