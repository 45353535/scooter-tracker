package com.fyber.inneractive.sdk.player;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.external.InneractiveVideoError;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.model.vast.x;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class t implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f23328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InneractiveAdRequest f23329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.response.g f23330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s f23331d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.fyber.inneractive.sdk.model.vast.r f23332e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f23333f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f23334g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.global.r f23335h;

    public t(com.fyber.inneractive.sdk.response.g gVar, InneractiveAdRequest inneractiveAdRequest, t0 t0Var, s sVar) {
        this.f23329b = inneractiveAdRequest;
        this.f23330c = gVar;
        this.f23331d = sVar;
        this.f23335h = t0Var.f21037c;
        this.f23328a = new b(t0Var);
    }

    public final void a() {
        a aVar = this.f23333f;
        if (aVar == null) {
            this.f23331d.a(new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, com.fyber.inneractive.sdk.flow.i.COULD_NOT_LOAD_USING_FLOW_MANAGER, new Exception("loadNextMediaFile flowManager is null")));
            return;
        }
        com.fyber.inneractive.sdk.model.vast.r rVar = this.f23332e;
        n nVar = (n) aVar;
        nVar.f23263l = this;
        if (rVar != null) {
            String str = rVar.f21232g;
            nVar.f23265n = rVar;
            nVar.f23262k++;
            nVar.f23259h = false;
            nVar.f23261j = false;
            IAlog.a("IAMediaPlayerFlowManager: playNextMediaFile - loading video url: %s", str);
            IAlog.a("IAMediaPlayerFlowManager: start - start fetching video frame", new Object[0]);
            if (nVar.f23260i) {
                return;
            }
            nVar.f23252a.a(str, nVar.f23264m);
        }
    }

    public final void a(InneractiveVideoError inneractiveVideoError, JSONObject jSONObject, boolean z10) {
        JSONObject jSONObject2;
        InneractiveErrorCode inneractiveErrorCode;
        com.fyber.inneractive.sdk.network.t tVar;
        com.fyber.inneractive.sdk.model.vast.b bVar;
        com.fyber.inneractive.sdk.network.t tVar2;
        if (jSONObject != null || inneractiveVideoError == null) {
            jSONObject2 = jSONObject;
        } else {
            jSONObject2 = new JSONObject();
            ((n) this.f23333f).b(inneractiveVideoError, jSONObject2);
        }
        com.fyber.inneractive.sdk.flow.i iVar = com.fyber.inneractive.sdk.flow.i.UNSPECIFIED;
        if (inneractiveVideoError != null) {
            InneractiveVideoError.Error playerError = inneractiveVideoError.getPlayerError();
            int i10 = r.f23327a[playerError.ordinal()];
            if (i10 == 1) {
                tVar2 = com.fyber.inneractive.sdk.network.t.VAST_ERROR_NO_MEDIA_FILES;
            } else if (i10 == 2) {
                tVar2 = com.fyber.inneractive.sdk.network.t.VAST_ERROR_FAILED_PLAYING_MEDIA_FILE;
            } else if (i10 == 3) {
                tVar2 = com.fyber.inneractive.sdk.network.t.VAST_ERROR_FAILED_PLAYING_ALL_MEDIA_FILES;
            } else if (i10 == 4) {
                tVar2 = com.fyber.inneractive.sdk.network.t.VAST_ERROR_PRE_BUFFER_TIMEOUT;
            } else if (i10 != 5) {
                IAlog.a("IAReportError, Does not know player error " + playerError.getErrorString(), new Object[0]);
                tVar2 = com.fyber.inneractive.sdk.network.t.VAST_UNKNOWN_PLAYER_ERROR;
            } else {
                tVar2 = com.fyber.inneractive.sdk.network.t.VAST_ERROR_BUFFER_TIMEOUT;
            }
            InneractiveAdRequest inneractiveAdRequest = this.f23329b;
            com.fyber.inneractive.sdk.response.g gVar = this.f23330c;
            JSONArray jSONArrayB = this.f23335h.b();
            w wVar = new w(gVar);
            wVar.f21417b = tVar2;
            wVar.f21416a = inneractiveAdRequest;
            wVar.f21419d = jSONArrayB;
            if (jSONObject2 != null) {
                try {
                    wVar.f21421f.put(new JSONObject(jSONObject2.toString()));
                } catch (Exception unused) {
                }
            }
            wVar.a((String) null);
        }
        if (InneractiveErrorCode.NON_SECURE_CONTENT_DETECTED == null) {
            com.fyber.inneractive.sdk.network.t tVar3 = com.fyber.inneractive.sdk.network.t.VPAID_ERROR_UNSECURE_CONTENT;
            InneractiveAdRequest inneractiveAdRequest2 = this.f23329b;
            com.fyber.inneractive.sdk.response.g gVar2 = this.f23330c;
            JSONArray jSONArrayB2 = this.f23335h.b();
            w wVar2 = new w(gVar2);
            wVar2.f21417b = tVar3;
            wVar2.f21416a = inneractiveAdRequest2;
            wVar2.f21419d = jSONArrayB2;
            wVar2.a((String) null);
        }
        if (inneractiveVideoError != null) {
            IAlog.a("got onMediaPlayerLoadError with: " + inneractiveVideoError.getPlayerError(), new Object[0]);
            if (z10) {
                inneractiveErrorCode = InneractiveErrorCode.LOAD_TIMEOUT;
                iVar = com.fyber.inneractive.sdk.flow.i.VIDEO_AD_LOAD_TIMEOUT;
            } else {
                inneractiveErrorCode = null;
            }
            IAlog.a("got onMediaPlayerLoadError with: " + inneractiveVideoError.description(), new Object[0]);
            if (inneractiveVideoError.getPlayerError().isFatal()) {
                inneractiveErrorCode = InneractiveErrorCode.SERVER_INVALID_RESPONSE;
                iVar = com.fyber.inneractive.sdk.flow.i.VIDEO_FATAL_ERROR;
            }
            if (inneractiveErrorCode == null) {
                inneractiveErrorCode = InneractiveErrorCode.SERVER_INVALID_RESPONSE;
                iVar = com.fyber.inneractive.sdk.flow.i.VIDEO_ERROR_UNSPECIFIED;
            }
        } else {
            inneractiveErrorCode = null;
        }
        if (z10) {
            return;
        }
        this.f23332e = null;
        com.fyber.inneractive.sdk.response.g gVar3 = this.f23330c;
        if (gVar3 != null && (bVar = gVar3.O) != null) {
            this.f23332e = (com.fyber.inneractive.sdk.model.vast.r) bVar.f21164d.poll();
        }
        if (this.f23332e == null) {
            InneractiveVideoError.Error playerError2 = new InneractiveVideoError(InneractiveVideoError.Error.ERROR_FAILED_PLAYING_ALL_MEDIA_FILES).getPlayerError();
            int i11 = r.f23327a[playerError2.ordinal()];
            if (i11 == 1) {
                tVar = com.fyber.inneractive.sdk.network.t.VAST_ERROR_NO_MEDIA_FILES;
            } else if (i11 == 2) {
                tVar = com.fyber.inneractive.sdk.network.t.VAST_ERROR_FAILED_PLAYING_MEDIA_FILE;
            } else if (i11 == 3) {
                tVar = com.fyber.inneractive.sdk.network.t.VAST_ERROR_FAILED_PLAYING_ALL_MEDIA_FILES;
            } else if (i11 == 4) {
                tVar = com.fyber.inneractive.sdk.network.t.VAST_ERROR_PRE_BUFFER_TIMEOUT;
            } else if (i11 != 5) {
                IAlog.a("IAReportError, Does not know player error " + playerError2.getErrorString(), new Object[0]);
                tVar = com.fyber.inneractive.sdk.network.t.VAST_UNKNOWN_PLAYER_ERROR;
            } else {
                tVar = com.fyber.inneractive.sdk.network.t.VAST_ERROR_BUFFER_TIMEOUT;
            }
            InneractiveAdRequest inneractiveAdRequest3 = this.f23329b;
            com.fyber.inneractive.sdk.response.g gVar4 = this.f23330c;
            JSONArray jSONArrayB3 = this.f23335h.b();
            w wVar3 = new w(gVar4);
            wVar3.f21417b = tVar;
            wVar3.f21416a = inneractiveAdRequest3;
            wVar3.f21419d = jSONArrayB3;
            wVar3.a((String) null);
            s sVar = this.f23331d;
            if (sVar != null) {
                if (inneractiveVideoError != null) {
                    sVar.a(new InneractiveInfrastructureError(inneractiveErrorCode, iVar, inneractiveVideoError.getCause()));
                    return;
                } else {
                    sVar.a(new InneractiveInfrastructureError(inneractiveErrorCode, com.fyber.inneractive.sdk.flow.i.VIDEO_ERROR_NULL));
                    return;
                }
            }
            return;
        }
        if (this.f23334g) {
            return;
        }
        try {
            this.f23333f = this.f23328a.a();
        } catch (Throwable th2) {
            this.f23331d.a(new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, com.fyber.inneractive.sdk.flow.i.COULD_NOT_CREATE_FLOW_MANAGER, th2));
        }
        a();
    }

    public final void a(String str, String... strArr) {
        a aVar = this.f23333f;
        if (aVar != null) {
            n nVar = (n) aVar;
            if ("TRACKING_COMPLETED".equalsIgnoreCase(str)) {
                nVar.f23316r = true;
                return;
            }
            if ("EVENT_TRACKING".equalsIgnoreCase(str)) {
                for (String str2 : strArr) {
                    nVar.a(nVar.f23314p, VideoClickOrigin.InvalidOrigin, x.a(str2));
                }
            }
        }
    }
}
