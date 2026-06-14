package com.fyber.inneractive.sdk.player;

import android.text.TextUtils;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveVideoError;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.network.x;
import com.fyber.inneractive.sdk.network.z0;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.util.IAlog;
import com.iab.omid.library.fyber.adsession.media.Position;
import com.iab.omid.library.fyber.adsession.media.VastProperties;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class n extends f implements a {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final k f23313x = new k();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.model.vast.b f23314p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.enums.a f23315q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f23316r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final s0 f23317s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.endcard.k f23318t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.ui.remote.g f23319u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.storepromo.b f23320v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final AtomicBoolean f23321w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public n(android.content.Context r22, com.fyber.inneractive.sdk.response.g r23, com.fyber.inneractive.sdk.config.s0 r24, com.fyber.inneractive.sdk.external.InneractiveAdRequest r25, com.fyber.inneractive.sdk.flow.t0 r26, com.fyber.inneractive.sdk.measurement.e r27) {
        /*
            Method dump skipped, instruction units count: 2022
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.n.<init>(android.content.Context, com.fyber.inneractive.sdk.response.g, com.fyber.inneractive.sdk.config.s0, com.fyber.inneractive.sdk.external.InneractiveAdRequest, com.fyber.inneractive.sdk.flow.t0, com.fyber.inneractive.sdk.measurement.e):void");
    }

    @Override // com.fyber.inneractive.sdk.player.controller.p
    public final void a(com.fyber.inneractive.sdk.player.enums.b bVar) {
        boolean zA;
        String str;
        int i10;
        int i11;
        com.fyber.inneractive.sdk.response.e eVar;
        com.fyber.inneractive.sdk.response.e eVar2;
        com.fyber.inneractive.sdk.response.e eVar3;
        s0 s0Var;
        IAlog.a("IAMediaPlayerFlowManager: onPlayerStateChanged with - %s", bVar);
        p pVar = this.f23257f;
        if (pVar != null && bVar != com.fyber.inneractive.sdk.player.enums.b.Prepared) {
            pVar.a(bVar);
        } else if (bVar == com.fyber.inneractive.sdk.player.enums.b.Prepared && pVar != null) {
            pVar.f23326d = true;
        }
        int i12 = d.f21572a[bVar.ordinal()];
        if (i12 == 1) {
            IAlog.a("IAMediaPlayerFlowManager: onPlayerPrepared called", new Object[0]);
            if (this.f23260i) {
                IAlog.a("IMediaPlayerFlowManager: onPlayerPrepared is called, but object is already destroyed?? ignore", new Object[0]);
            } else {
                this.f23259h = true;
                if (this.f23256e != null && this.f23253b != null && (s0Var = this.f23317s) != null) {
                    int iIntValue = ((r0) s0Var).f20438f.f20496h.value().intValue();
                    boolean zA2 = f.a(this.f23252a.c(), ((com.fyber.inneractive.sdk.response.g) this.f23253b.f21036b).f23745y, this.f23317s);
                    boolean zBooleanValue = ((r0) this.f23317s).f20438f.f20489a.booleanValue();
                    com.fyber.inneractive.sdk.measurement.f fVar = this.f23256e;
                    if (!zA2) {
                        iIntValue = 0;
                    }
                    if (fVar.f21105b != null) {
                        try {
                            fVar.f21105b.loaded(zA2 ? VastProperties.createVastPropertiesForSkippableMedia(iIntValue, zBooleanValue, Position.STANDALONE) : VastProperties.createVastPropertiesForNonSkippableMedia(zBooleanValue, Position.STANDALONE));
                        } catch (Throwable th2) {
                            fVar.a(th2);
                        }
                    }
                }
                if (this.f23263l != null) {
                    t0 t0Var = this.f23253b;
                    if (t0Var == null || (eVar3 = t0Var.f21036b) == null) {
                        zA = false;
                    } else {
                        zA = f.a(this.f23252a.c(), eVar3.f23745y, this.f23317s);
                        eVar3.f23740t.setVideo(new ImpressionData.Video(zA, (int) TimeUnit.MILLISECONDS.toSeconds(this.f23252a.c())));
                    }
                    try {
                        t0 t0Var2 = this.f23253b;
                        com.fyber.inneractive.sdk.response.g gVar = t0Var2 != null ? (com.fyber.inneractive.sdk.response.g) t0Var2.f21036b : null;
                        u uVar = u.EVENT_READY_ON_CLIENT;
                        InneractiveAdRequest inneractiveAdRequest = this.f23254c;
                        t0 t0Var3 = this.f23253b;
                        JSONArray jSONArrayB = t0Var3 == null ? null : t0Var3.f21037c.b();
                        w wVar = new w(gVar);
                        wVar.f21418c = uVar;
                        wVar.f21416a = inneractiveAdRequest;
                        wVar.f21419d = jSONArrayB;
                        if (this.f23265n != null && gVar != null) {
                            IAlog.a("Video content loader: Vast load took: " + (System.currentTimeMillis() - gVar.N) + " msec", new Object[0]);
                            t0 t0Var4 = this.f23253b;
                            if (t0Var4 == null || (eVar2 = t0Var4.f21036b) == null || ((com.fyber.inneractive.sdk.response.g) eVar2).O == null) {
                                str = "";
                                i10 = 0;
                                i11 = 0;
                            } else {
                                i10 = ((com.fyber.inneractive.sdk.response.g) eVar2).O.f21169i;
                                i11 = ((com.fyber.inneractive.sdk.response.g) eVar2).O.f21170j;
                                str = ((com.fyber.inneractive.sdk.response.g) eVar2).O.f21161a;
                            }
                            String str2 = "0";
                            if (t0Var4 != null && (eVar = t0Var4.f21036b) != null && !TextUtils.isEmpty(((com.fyber.inneractive.sdk.response.g) eVar).E)) {
                                str2 = ((com.fyber.inneractive.sdk.response.g) this.f23253b.f21036b).E;
                            }
                            x xVar = new x();
                            xVar.a(Integer.valueOf(this.f23252a.c() / 1000), "duration").a(this.f23265n.f21232g, "url").a(this.f23265n.f21230e, com.taurusx.tax.f.a.f65992s).a(TextUtils.isEmpty(this.f23265n.f21229d) ? "na" : this.f23265n.f21229d, "mime").a(this.f23265n.f21226a, "delivery").a(Long.valueOf(System.currentTimeMillis() - gVar.N), "load_time").a(Integer.valueOf(this.f23262k), "media_file_index").a(this.f23252a.d(), "player").a(Boolean.valueOf(zA), "is_video_skippable").a(Integer.valueOf(i10), "supported_media_files").a(Integer.valueOf(i11), "total_media_files").a(str, "vast_version");
                            if (str2 != null && str2.equals("1")) {
                                xVar.a(str2, "hide_endcard");
                            }
                            wVar.f21421f.put(xVar.f21423a);
                        }
                        wVar.a((String) null);
                    } catch (Exception unused) {
                    }
                    t tVar = (t) this.f23263l;
                    if (!tVar.f23334g) {
                        tVar.f23334g = true;
                        s sVar = tVar.f23331d;
                        if (sVar != null) {
                            sVar.c();
                        }
                    }
                }
            }
        } else if (i12 == 2) {
            IAlog.a("IAMediaPlayerFlowManager: onPlayerBuffering", new Object[0]);
        } else if (i12 == 3) {
            this.f23252a.b();
        }
        int i13 = l.f23272a[bVar.ordinal()];
        if (i13 != 1) {
            if (i13 == 2) {
                if (this.f23315q.equals(com.fyber.inneractive.sdk.player.enums.a.Completed)) {
                    a(com.fyber.inneractive.sdk.player.enums.a.Restarted);
                    return;
                }
                return;
            } else {
                if (i13 != 3) {
                    return;
                }
                b(this.f23252a.c());
                a(com.fyber.inneractive.sdk.player.enums.a.Completed);
                return;
            }
        }
        com.fyber.inneractive.sdk.model.vast.b bVar2 = this.f23314p;
        if (bVar2 == null || bVar2.f21173m.size() == 0) {
            return;
        }
        int iC = this.f23252a.c();
        for (com.fyber.inneractive.sdk.model.vast.e eVar4 : this.f23314p.f21173m) {
            int i14 = -1;
            if (eVar4.f21188c == -1) {
                if (!TextUtils.isEmpty(eVar4.f21187b)) {
                    String str3 = eVar4.f21187b;
                    i14 = Integer.parseInt(str3.substring(0, str3.length() - 1));
                }
                eVar4.f21188c = (i14 * iC) / 100;
            }
        }
        Collections.sort(this.f23314p.f21173m, new com.fyber.inneractive.sdk.model.vast.d());
    }

    public final void b(int i10) {
        com.fyber.inneractive.sdk.model.vast.b bVar = this.f23314p;
        if (bVar == null || bVar.f21173m.isEmpty()) {
            return;
        }
        while (this.f23314p.f21173m.size() > 0 && i10 >= ((com.fyber.inneractive.sdk.model.vast.e) this.f23314p.f21173m.get(0)).f21188c) {
            com.fyber.inneractive.sdk.model.vast.e eVar = (com.fyber.inneractive.sdk.model.vast.e) this.f23314p.f21173m.get(0);
            String str = eVar.f21186a;
            if (!TextUtils.isEmpty(str)) {
                IAlog.a("IAVastMediaPlayerFlowManager: Firing event for type: progress", new Object[0]);
                z0.b(str);
            }
            this.f23314p.f21173m.remove(eVar);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.p
    public final void d() {
    }

    public final void b(InneractiveVideoError inneractiveVideoError, JSONObject jSONObject) {
        try {
            if (this.f23265n != null && inneractiveVideoError.getPlayerError() != InneractiveVideoError.Error.ERROR_FAILED_PLAYING_ALL_MEDIA_FILES) {
                jSONObject.put("url", this.f23265n.f21232g);
                jSONObject.put(com.taurusx.tax.f.a.f65992s, this.f23265n.f21230e);
                jSONObject.put("mime", this.f23265n.f21229d);
                jSONObject.put("delivery", this.f23265n.f21226a);
            }
            com.fyber.inneractive.sdk.player.controller.q qVar = this.f23252a;
            jSONObject.put("player", qVar != null ? qVar.d() : "");
            if (inneractiveVideoError.getCause() != null) {
                jSONObject.put("exception", inneractiveVideoError.getCause().getClass().getName());
                jSONObject.put(PglCryptUtils.KEY_MESSAGE, inneractiveVideoError.getCause().getMessage() == null ? "empty" : inneractiveVideoError.getCause().getMessage());
            }
        } catch (Exception unused) {
            IAlog.a("onReportError: Failed creating Json object from media file!", new Object[0]);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.o
    public final void a(int i10) {
        int iC = this.f23252a.c();
        b(i10);
        int i11 = l.f23273b[this.f23315q.ordinal()];
        if (i11 == 1) {
            if (this.f23252a.f21526e != com.fyber.inneractive.sdk.player.enums.b.Buffering) {
                a(com.fyber.inneractive.sdk.player.enums.a.Started);
                com.fyber.inneractive.sdk.measurement.f fVar = this.f23256e;
                if (fVar != null) {
                    if (fVar.f21105b != null && !fVar.f21108e) {
                        IAlog.a("%s impression", "OMVideo");
                        fVar.f21108e = true;
                        try {
                            fVar.f21105b.impressionOccurred();
                        } catch (Throwable th2) {
                            fVar.a(th2);
                        }
                    }
                    com.fyber.inneractive.sdk.measurement.f fVar2 = this.f23256e;
                    long jC = this.f23252a.c();
                    float f10 = this.f23252a.g() ? 0.0f : 1.0f;
                    if (fVar2.f21106c == null || fVar2.f21107d) {
                        return;
                    }
                    fVar2.f21107d = true;
                    IAlog.a("%s start", "OMVideo");
                    try {
                        fVar2.f21106c.start(jC, f10);
                        return;
                    } catch (Throwable th3) {
                        fVar2.a(th3);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (i11 == 2) {
            if (i10 > iC / 4) {
                a(com.fyber.inneractive.sdk.player.enums.a.FirstQuarter);
                com.fyber.inneractive.sdk.measurement.f fVar3 = this.f23256e;
                if (fVar3 == null || fVar3.f21106c == null) {
                    return;
                }
                IAlog.a("%s firstQuartile", "OMVideo");
                try {
                    fVar3.f21106c.firstQuartile();
                    return;
                } catch (Throwable th4) {
                    fVar3.a(th4);
                    return;
                }
            }
            return;
        }
        if (i11 != 3) {
            if (i11 == 4 && i10 > (iC / 4) * 3) {
                a(com.fyber.inneractive.sdk.player.enums.a.ThirdPQuarter);
                com.fyber.inneractive.sdk.measurement.f fVar4 = this.f23256e;
                if (fVar4 == null || fVar4.f21106c == null) {
                    return;
                }
                IAlog.a("%s thirdQuartile", "OMVideo");
                try {
                    fVar4.f21106c.thirdQuartile();
                    return;
                } catch (Throwable th5) {
                    fVar4.a(th5);
                    return;
                }
            }
            return;
        }
        if (i10 > iC / 2) {
            a(com.fyber.inneractive.sdk.player.enums.a.MidPoint);
            com.fyber.inneractive.sdk.measurement.f fVar5 = this.f23256e;
            if (fVar5 == null || fVar5.f21106c == null) {
                return;
            }
            IAlog.a("%s midpoint", "OMVideo");
            try {
                fVar5.f21106c.midpoint();
            } catch (Throwable th6) {
                fVar5.a(th6);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.f
    public final void a(InneractiveVideoError inneractiveVideoError, JSONObject jSONObject) {
        a(this.f23314p, VideoClickOrigin.InvalidOrigin, com.fyber.inneractive.sdk.model.vast.x.EVENT_ERROR);
        b(inneractiveVideoError, jSONObject);
        IAlog.f("IAMediaPlayerFlowManager: reporting error to listeners: %s", inneractiveVideoError.getPlayerError().toString());
        q qVar = this.f23263l;
        if (qVar != null) {
            try {
                ((t) qVar).a(inneractiveVideoError, jSONObject, false);
            } catch (Exception e10) {
                if (IAlog.f23840a <= 3) {
                    e10.printStackTrace();
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.f
    public final void a(com.fyber.inneractive.sdk.response.i iVar, VideoClickOrigin videoClickOrigin, com.fyber.inneractive.sdk.model.vast.x... xVarArr) {
        if (xVarArr.length == 0) {
            IAlog.f("IAVastMediaPlayerFlowManager: eventTypes array is empty", new Object[0]);
            return;
        }
        if (iVar == null) {
            IAlog.f("IAVastMediaPlayerFlowManager: parser is null", new Object[0]);
            return;
        }
        ArrayList<String> arrayList = new ArrayList();
        for (com.fyber.inneractive.sdk.model.vast.x xVar : xVarArr) {
            String strA = xVar.a();
            IAlog.a("IAVastMediaPlayerFlowManager: Firing events for type: %s", strA);
            List<String> listA = iVar.a(xVar);
            if (listA != null && !listA.isEmpty()) {
                arrayList.addAll(listA);
                IAlog.a("found %d events for type: %s, url: %s", Integer.valueOf(listA.size()), strA, listA.get(0));
                for (String str : listA) {
                    IAlog.a("   event url: %s", str);
                    if (!TextUtils.isEmpty(str)) {
                        xVar.a();
                    }
                }
            } else {
                IAlog.a("IAVastMediaPlayerFlowManager: no events for type: %s", strA);
            }
            if (xVar == com.fyber.inneractive.sdk.model.vast.x.EVENT_CLICK) {
                for (Map.Entry entry : f23313x.entrySet()) {
                    String str2 = (String) entry.getKey();
                    String strA2 = ((m) entry.getValue()).a(this.f23252a, videoClickOrigin);
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        String str3 = (String) arrayList.get(i10);
                        if (str3.contains(str2)) {
                            arrayList.set(i10, str3.replace(str2, strA2));
                        }
                    }
                }
            }
        }
        for (String str4 : arrayList) {
            if (!TextUtils.isEmpty(str4)) {
                z0.b(str4);
            }
        }
    }

    public static void a(com.fyber.inneractive.sdk.response.i iVar, com.fyber.inneractive.sdk.model.vast.x... xVarArr) {
        ArrayList<String> arrayList = new ArrayList();
        for (com.fyber.inneractive.sdk.model.vast.x xVar : xVarArr) {
            String strA = xVar.a();
            IAlog.a("IAVastMediaPlayerFlowManager: Firing events for type: %s", strA);
            List<String> listA = iVar.a(xVar);
            if (listA != null && listA.size() != 0) {
                arrayList.addAll(listA);
                IAlog.a("found %d events for type: %s", Integer.valueOf(listA.size()), strA);
                for (String str : listA) {
                    IAlog.a("   event url: %s", str);
                    if (!TextUtils.isEmpty(str)) {
                        xVar.a();
                    }
                }
            } else {
                IAlog.a("IAVastMediaPlayerFlowManager: no events for type: %s", strA);
            }
        }
        for (String str2 : arrayList) {
            if (!TextUtils.isEmpty(str2)) {
                z0.b(str2);
            }
        }
    }

    public final void a(com.fyber.inneractive.sdk.player.enums.a aVar) {
        if (this.f23315q == aVar) {
            return;
        }
        if (aVar == com.fyber.inneractive.sdk.player.enums.a.Started) {
            this.f23316r = false;
            if (this.f23321w.compareAndSet(false, true)) {
                a(this.f23314p, VideoClickOrigin.InvalidOrigin, com.fyber.inneractive.sdk.model.vast.x.EVENT_IMPRESSION, com.fyber.inneractive.sdk.model.vast.x.EVENT_START);
            } else {
                IAlog.a("%sreportPlayStartEvents called, but start events was already reported", IAlog.a(this));
            }
        } else if (aVar == com.fyber.inneractive.sdk.player.enums.a.FirstQuarter) {
            a(this.f23314p, VideoClickOrigin.InvalidOrigin, com.fyber.inneractive.sdk.model.vast.x.EVENT_FIRSTQ);
        } else if (aVar == com.fyber.inneractive.sdk.player.enums.a.MidPoint) {
            a(this.f23314p, VideoClickOrigin.InvalidOrigin, com.fyber.inneractive.sdk.model.vast.x.EVENT_MID);
        } else if (aVar == com.fyber.inneractive.sdk.player.enums.a.ThirdPQuarter) {
            a(this.f23314p, VideoClickOrigin.InvalidOrigin, com.fyber.inneractive.sdk.model.vast.x.EVENT_THIRDQ);
        } else if (aVar == com.fyber.inneractive.sdk.player.enums.a.Completed && !this.f23316r) {
            this.f23316r = true;
            a(this.f23314p, VideoClickOrigin.InvalidOrigin, com.fyber.inneractive.sdk.model.vast.x.EVENT_COMPLETE);
        } else if (aVar == com.fyber.inneractive.sdk.player.enums.a.Restarted) {
            a(this.f23314p, VideoClickOrigin.InvalidOrigin, com.fyber.inneractive.sdk.model.vast.x.EVENT_REWIND);
        } else if (aVar == com.fyber.inneractive.sdk.player.enums.a.Progress) {
            a(this.f23314p, VideoClickOrigin.InvalidOrigin, com.fyber.inneractive.sdk.model.vast.x.EVENT_PROGRESS);
        }
        this.f23315q = aVar;
    }
}
