package com.fyber.inneractive.sdk.flow;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.external.InneractiveVideoError;
import com.fyber.inneractive.sdk.util.IAlog;
import com.iab.omid.library.fyber.adsession.AdEvents;
import com.iab.omid.library.fyber.adsession.AdSession;
import com.iab.omid.library.fyber.adsession.AdSessionConfiguration;
import com.iab.omid.library.fyber.adsession.AdSessionContext;
import com.iab.omid.library.fyber.adsession.CreativeType;
import com.iab.omid.library.fyber.adsession.ImpressionType;
import com.iab.omid.library.fyber.adsession.Owner;
import com.iab.omid.library.fyber.adsession.Partner;
import com.iab.omid.library.fyber.adsession.media.MediaEvents;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes7.dex */
public final class u extends k implements com.fyber.inneractive.sdk.player.s {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.t f20985m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f20986n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f20987o = new t(this);

    @Override // com.fyber.inneractive.sdk.flow.k, com.fyber.inneractive.sdk.interfaces.b
    public final void a() {
        com.fyber.inneractive.sdk.model.vast.b bVar;
        if (this.f20985m != null) {
            com.fyber.inneractive.sdk.response.e eVar = this.f20753b;
            this.f20985m.a((eVar == null || (bVar = ((com.fyber.inneractive.sdk.response.g) eVar).O) == null) ? null : bVar.f21164d.size() == 0 ? new InneractiveVideoError(InneractiveVideoError.Error.ERROR_FAILED_PLAYING_ALL_MEDIA_FILES, null) : new InneractiveVideoError(InneractiveVideoError.Error.ERROR_FAILED_PLAYING_MEDIA_FILE, null), null, true);
        }
        IAlog.a("%s: IAAdContentLoaderImpl : cancel load ad content retry task", IAlog.a(this));
        com.fyber.inneractive.sdk.util.r.f23896b.removeCallbacks(this.f20763l);
        this.f20762k.a();
        super.a();
    }

    @Override // com.fyber.inneractive.sdk.flow.k, com.fyber.inneractive.sdk.interfaces.c
    public final void cancel() {
        IAlog.a("%s: IAAdContentLoaderImpl : cancel load ad content retry task", IAlog.a(this));
        com.fyber.inneractive.sdk.util.r.f23896b.removeCallbacks(this.f20763l);
        this.f20762k.a();
    }

    @Override // com.fyber.inneractive.sdk.flow.k
    public final String e() {
        return "send_failed_vast_creatives";
    }

    @Override // com.fyber.inneractive.sdk.flow.k
    public final void h() {
        IAlog.a(IAlog.a(this) + "start called", new Object[0]);
        a(this.f20758g, (com.fyber.inneractive.sdk.response.g) this.f20753b, this.f20752a, this);
    }

    public final com.fyber.inneractive.sdk.player.ui.remote.g j() {
        com.fyber.inneractive.sdk.player.a aVar;
        com.fyber.inneractive.sdk.player.ui.remote.g gVar;
        com.fyber.inneractive.sdk.player.t tVar = this.f20985m;
        if (tVar == null || (aVar = tVar.f23333f) == null || (gVar = ((com.fyber.inneractive.sdk.player.n) aVar).f23319u) == null) {
            return null;
        }
        return gVar;
    }

    public final void a(Exception exc, String str, boolean z10) {
        HashMap map = new HashMap();
        map.put("description", str);
        if (exc != null) {
            map.put("exception", exc.getMessage());
        }
        if (j() != null) {
            j().f23408a.a();
        }
        com.fyber.inneractive.sdk.network.events.a.a(com.fyber.inneractive.sdk.network.t.VAST_ERROR_DVC_FAILURE, com.fyber.inneractive.sdk.network.events.b.TEMPLATE_ERROR.name(), this.f20986n, this.f20752a, this.f20753b, map, Boolean.valueOf(z10));
    }

    @Override // com.fyber.inneractive.sdk.player.s
    public final void a(InneractiveInfrastructureError inneractiveInfrastructureError) {
        com.fyber.inneractive.sdk.util.r.f23895a.execute(new e(new f(this.f20753b, this.f20752a, "send_failed_vast_creatives", this.f20758g.b()), inneractiveInfrastructureError));
        b(inneractiveInfrastructureError);
    }

    public final void a(com.fyber.inneractive.sdk.config.global.r rVar, com.fyber.inneractive.sdk.response.g gVar, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.player.s sVar) {
        com.fyber.inneractive.sdk.model.vast.b bVar;
        AdSessionConfiguration adSessionConfigurationCreateAdSessionConfiguration;
        String str;
        com.fyber.inneractive.sdk.network.t tVar;
        com.fyber.inneractive.sdk.model.vast.b bVar2;
        com.fyber.inneractive.sdk.config.s0 s0VarF = f();
        if (s0VarF == null && gVar != null) {
            s0VarF = com.fyber.inneractive.sdk.config.a.a(gVar.f23735o);
        }
        AdSessionContext adSessionContextCreateNativeAdSessionContext = null;
        com.fyber.inneractive.sdk.model.vast.b bVar3 = gVar == null ? null : gVar.O;
        if (bVar3 != null && bVar3.f21164d.size() < bVar3.f21169i) {
            bVar3.f21164d.clear();
            bVar3.f21167g.clear();
            bVar3.f21164d.addAll(bVar3.f21171k);
            bVar3.f21167g.addAll(bVar3.f21172l);
        }
        t0 t0Var = new t0(s0VarF, rVar, gVar, inneractiveAdRequest);
        this.f20754c = t0Var;
        com.fyber.inneractive.sdk.player.t tVar2 = new com.fyber.inneractive.sdk.player.t(gVar, inneractiveAdRequest, t0Var, sVar);
        this.f20985m = tVar2;
        t0 t0Var2 = (t0) this.f20754c;
        t0Var2.f20983i = tVar2;
        t0Var2.f21040f = this.f20759h;
        this.f20986n = bVar3 != null ? bVar3.f21174n : null;
        tVar2.f23332e = null;
        if (gVar != null && (bVar2 = gVar.O) != null) {
            tVar2.f23332e = (com.fyber.inneractive.sdk.model.vast.r) bVar2.f21164d.poll();
        }
        if (tVar2.f23332e == null) {
            InneractiveVideoError.Error playerError = new InneractiveVideoError(InneractiveVideoError.Error.ERROR_FAILED_PLAYING_ALL_MEDIA_FILES).getPlayerError();
            int i10 = com.fyber.inneractive.sdk.player.r.f23327a[playerError.ordinal()];
            if (i10 == 1) {
                tVar = com.fyber.inneractive.sdk.network.t.VAST_ERROR_NO_MEDIA_FILES;
            } else if (i10 == 2) {
                tVar = com.fyber.inneractive.sdk.network.t.VAST_ERROR_FAILED_PLAYING_MEDIA_FILE;
            } else if (i10 == 3) {
                tVar = com.fyber.inneractive.sdk.network.t.VAST_ERROR_FAILED_PLAYING_ALL_MEDIA_FILES;
            } else if (i10 == 4) {
                tVar = com.fyber.inneractive.sdk.network.t.VAST_ERROR_PRE_BUFFER_TIMEOUT;
            } else if (i10 != 5) {
                IAlog.a("IAReportError, Does not know player error " + playerError.getErrorString(), new Object[0]);
                tVar = com.fyber.inneractive.sdk.network.t.VAST_UNKNOWN_PLAYER_ERROR;
            } else {
                tVar = com.fyber.inneractive.sdk.network.t.VAST_ERROR_BUFFER_TIMEOUT;
            }
            InneractiveAdRequest inneractiveAdRequest2 = tVar2.f23329b;
            com.fyber.inneractive.sdk.response.g gVar2 = tVar2.f23330c;
            JSONArray jSONArrayB = tVar2.f23335h.b();
            com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(gVar2);
            wVar.f21417b = tVar;
            wVar.f21416a = inneractiveAdRequest2;
            wVar.f21419d = jSONArrayB;
            wVar.a((String) null);
            sVar.a(new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, i.VAST_NO_MEDIA_FILES));
        } else {
            try {
                tVar2.f23333f = tVar2.f23328a.a();
            } catch (Throwable th2) {
                tVar2.f23331d.a(new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, i.COULD_NOT_CREATE_FLOW_MANAGER, th2));
            }
            com.fyber.inneractive.sdk.player.a aVar = tVar2.f23333f;
            if (aVar != null) {
                com.fyber.inneractive.sdk.player.n nVar = (com.fyber.inneractive.sdk.player.n) aVar;
                com.fyber.inneractive.sdk.measurement.e eVar = nVar.f23255d;
                if (eVar != null) {
                    com.fyber.inneractive.sdk.measurement.f fVar = new com.fyber.inneractive.sdk.measurement.f();
                    ArrayList arrayList = nVar.f23314p.f21165e;
                    t0 t0Var3 = nVar.f23253b;
                    try {
                        try {
                            CreativeType creativeType = CreativeType.VIDEO;
                            ImpressionType impressionType = ImpressionType.UNSPECIFIED;
                            Owner owner = Owner.NATIVE;
                            adSessionConfigurationCreateAdSessionConfiguration = AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false);
                        } catch (Throwable th3) {
                            fVar.a(th3);
                            adSessionConfigurationCreateAdSessionConfiguration = null;
                        }
                        ArrayList arrayListA = fVar.a(arrayList);
                        Partner partner = eVar.f21099e;
                        if (partner != null && (str = eVar.f21096b) != null) {
                            try {
                                adSessionContextCreateNativeAdSessionContext = AdSessionContext.createNativeAdSessionContext(partner, str, arrayListA, "", "");
                            } catch (Throwable th4) {
                                fVar.a(th4);
                            }
                        }
                        AdSession adSessionCreateAdSession = AdSession.createAdSession(adSessionConfigurationCreateAdSessionConfiguration, adSessionContextCreateNativeAdSessionContext);
                        fVar.f21104a = adSessionCreateAdSession;
                        fVar.f21105b = AdEvents.createAdEvents(adSessionCreateAdSession);
                        fVar.f21106c = MediaEvents.createMediaEvents(fVar.f21104a);
                        fVar.f21104a.start();
                        fVar.f21109f = t0Var3;
                    } catch (Throwable th5) {
                        fVar.a(th5);
                    }
                    nVar.f23256e = fVar;
                    nVar.f23257f = new com.fyber.inneractive.sdk.player.p(fVar);
                }
                if (nVar.f23256e == null && (bVar = nVar.f23314p) != null) {
                    for (com.fyber.inneractive.sdk.measurement.h hVar : bVar.f21165e) {
                        com.fyber.inneractive.sdk.measurement.i iVar = com.fyber.inneractive.sdk.measurement.i.ERROR_DURING_RESOURCE_LOAD;
                        com.fyber.inneractive.sdk.model.vast.x xVar = com.fyber.inneractive.sdk.model.vast.x.EVENT_VERIFICATION_NOT_EXECUTED;
                        com.fyber.inneractive.sdk.player.n.a(new com.fyber.inneractive.sdk.measurement.g(hVar.a(xVar), iVar), xVar);
                    }
                }
            }
            tVar2.a();
        }
        if (TextUtils.isEmpty(this.f20986n)) {
            return;
        }
        IAConfigManager.O.f20313s.a(new com.fyber.inneractive.sdk.network.v0(this.f20987o, com.fyber.inneractive.sdk.util.o.f23888a, new com.fyber.inneractive.sdk.cache.l(this.f20986n)));
    }
}
