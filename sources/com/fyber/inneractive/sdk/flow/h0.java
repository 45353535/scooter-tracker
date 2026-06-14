package com.fyber.inneractive.sdk.flow;

import android.app.Application;
import android.os.Looper;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveMediationName;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class h0 implements i0, r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InneractiveAdSpot.RequestListener f20738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InneractiveAdRequest f20739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e0 f20740d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public x f20741e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s0 f20742f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashSet f20743g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public m f20744h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public g0 f20745i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p f20748l;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f20746j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f20747k = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AtomicBoolean f20749m = new AtomicBoolean(false);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f20750n = new Object();

    public h0() {
        String string = UUID.randomUUID().toString();
        this.f20737a = string;
        this.f20743g = new HashSet();
        IAlog.a("%sInneractiveAdSpotImpl created with UID: %s", IAlog.a(this), string);
    }

    public static String a(h0 h0Var) {
        h0Var.getClass();
        return IAlog.a(h0Var);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void addUnitController(InneractiveUnitController inneractiveUnitController) {
        if (inneractiveUnitController != null) {
            s0 s0Var = (s0) inneractiveUnitController;
            s0Var.setAdSpot(this);
            if (this.f20743g.size() > 0) {
                for (InneractiveUnitController inneractiveUnitController2 : new HashSet(this.f20743g)) {
                    if (inneractiveUnitController2.getClass().equals(inneractiveUnitController.getClass())) {
                        removeUnitController(inneractiveUnitController2);
                    }
                }
            }
            this.f20743g.add(s0Var);
            if (this.f20741e != null) {
                for (s0 s0Var2 : this.f20743g) {
                    if (s0Var2.supports(this)) {
                        this.f20742f = s0Var2;
                        return;
                    }
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void destroy() {
        IAlog.a("%sInneractiveAdSpotImpl spot destroy: %s", IAlog.a(this), this.f20737a);
        if (Looper.myLooper() == null || Looper.getMainLooper() != Looper.myLooper()) {
            com.fyber.inneractive.sdk.util.r.f23896b.post(new d0(this));
            return;
        }
        this.f20749m.set(true);
        Iterator it = this.f20743g.iterator();
        while (it.hasNext()) {
            ((InneractiveUnitController) it.next()).destroy();
        }
        this.f20743g.clear();
        a((x) null);
        this.f20738b = null;
        a();
        InneractiveAdSpotManager.get().removeSpot(this);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final x getAdContent() {
        return this.f20741e;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final InneractiveAdRequest getCurrentProcessedRequest() {
        return this.f20739c;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final String getLocalUniqueId() {
        return this.f20737a;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final InneractiveMediationName getMediationName() {
        return IAConfigManager.O.f20307m;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final String getMediationNameString() {
        return IAConfigManager.O.f20306l;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final String getMediationVersion() {
        return IAConfigManager.O.f20308n;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final String getRequestedSpotId() {
        InneractiveAdRequest inneractiveAdRequest = this.f20739c;
        return inneractiveAdRequest != null ? inneractiveAdRequest.getSpotId() : "";
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final InneractiveUnitController getSelectedUnitController() {
        return this.f20742f;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean isReady() {
        /*
            r14 = this;
            r0 = 2
            r1 = 1
            java.lang.String r2 = "Got exception adding param to json object: %s, %s"
            com.fyber.inneractive.sdk.flow.x r3 = r14.f20741e
            r4 = 0
            if (r3 != 0) goto La
            return r4
        La:
            com.fyber.inneractive.sdk.response.e r3 = r3.b()
            if (r3 == 0) goto L25
            com.fyber.inneractive.sdk.flow.x r3 = r14.f20741e
            com.fyber.inneractive.sdk.response.e r3 = r3.b()
            r3.getClass()
            long r5 = java.lang.System.currentTimeMillis()
            long r7 = r3.f23721a
            int r3 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r3 >= 0) goto L25
            r3 = r1
            goto L26
        L25:
            r3 = r4
        L26:
            if (r3 == 0) goto Lac
            com.fyber.inneractive.sdk.flow.x r5 = r14.f20741e
            if (r5 == 0) goto Lac
            com.fyber.inneractive.sdk.response.e r6 = r5.b()
            boolean r7 = r14.f20747k
            if (r7 != 0) goto Lac
            if (r6 == 0) goto Lac
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r8 = java.lang.System.currentTimeMillis()
            long r10 = r6.f23723c
            long r8 = r8 - r10
            long r7 = r7.toMinutes(r8)
            long r9 = r6.f23722b
            long r7 = r7 - r9
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Firing Event 802 - AdExpired - time passed- "
            r11.<init>(r12)
            r11.append(r7)
            java.lang.String r12 = ", sessionTimeOut - "
            r11.append(r12)
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            java.lang.Object[] r12 = new java.lang.Object[r4]
            com.fyber.inneractive.sdk.util.IAlog.a(r11, r12)
            com.fyber.inneractive.sdk.network.w r11 = new com.fyber.inneractive.sdk.network.w
            com.fyber.inneractive.sdk.network.t r12 = com.fyber.inneractive.sdk.network.t.IA_AD_EXPIRED
            com.fyber.inneractive.sdk.external.InneractiveAdRequest r13 = r5.f21035a
            com.fyber.inneractive.sdk.config.global.r r5 = r5.f21037c
            org.json.JSONArray r5 = r5.b()
            r11.<init>(r6)
            r11.f21417b = r12
            r11.f21416a = r13
            r11.f21419d = r5
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            java.lang.String r6 = "time_passed"
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r5.put(r6, r7)     // Catch: java.lang.Exception -> L85
            goto L8e
        L85:
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r8[r4] = r6
            r8[r1] = r7
            com.fyber.inneractive.sdk.util.IAlog.f(r2, r8)
        L8e:
            java.lang.String r6 = "timeout"
            java.lang.Long r7 = java.lang.Long.valueOf(r9)
            r5.put(r6, r7)     // Catch: java.lang.Exception -> L98
            goto La1
        L98:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r4] = r6
            r0[r1] = r7
            com.fyber.inneractive.sdk.util.IAlog.f(r2, r0)
        La1:
            org.json.JSONArray r0 = r11.f21421f
            r0.put(r5)
            r0 = 0
            r11.a(r0)
            r14.f20747k = r1
        Lac:
            if (r3 != 0) goto Lb7
            com.fyber.inneractive.sdk.flow.x r0 = r14.f20741e
            boolean r0 = r0.e()
            if (r0 == 0) goto Lb7
            goto Lb8
        Lb7:
            r1 = r4
        Lb8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.flow.h0.isReady():boolean");
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void loadAd(String str) {
        if (this.f20749m.get()) {
            IAlog.a("%s : loadAd: spot is already destroyed", IAlog.a(this));
            a(this.f20741e);
            return;
        }
        IAlog.a("%s : InneractiveAdSpotImpl Start load ad process", IAlog.a(this));
        if (IAConfigManager.d()) {
            IAlog.a("%sIAB TCF purpose 1 disabled, dropping request", IAlog.a(this));
            InneractiveAdSpot.RequestListener requestListener = this.f20738b;
            if (requestListener != null) {
                requestListener.onInneractiveFailedAdRequest(this, InneractiveErrorCode.IAB_TCF_PURPOSE_1_DISABLED);
                return;
            }
            return;
        }
        if (str == null || TextUtils.isEmpty(str)) {
            InneractiveAdSpot.RequestListener requestListener2 = this.f20738b;
            if (requestListener2 != null) {
                requestListener2.onInneractiveFailedAdRequest(this, InneractiveErrorCode.INVALID_INPUT);
                return;
            }
            return;
        }
        if (!InneractiveAdManager.wasInitialized()) {
            InneractiveAdSpot.RequestListener requestListener3 = this.f20738b;
            if (requestListener3 != null) {
                requestListener3.onInneractiveFailedAdRequest(this, InneractiveErrorCode.SDK_NOT_INITIALIZED);
                return;
            }
            return;
        }
        com.fyber.inneractive.sdk.metrics.d.f21138d.a(this.f20737a).c();
        String str2 = this.f20737a;
        this.f20748l = new p(str2);
        if (this.f20740d == null) {
            this.f20740d = new e0(this);
        }
        com.fyber.inneractive.sdk.bidder.adm.y yVar = new com.fyber.inneractive.sdk.bidder.adm.y(str, str2);
        com.fyber.inneractive.sdk.config.global.r rVarA = com.fyber.inneractive.sdk.config.global.r.a();
        c0 c0Var = new c0(this, yVar, rVarA, str);
        IAlog.a("%s initOmidSdkIfNeeded", IAlog.a(this));
        IAConfigManager iAConfigManager = IAConfigManager.O;
        com.fyber.inneractive.sdk.measurement.e eVar = iAConfigManager.K;
        if (eVar == null || !eVar.f21095a) {
            Application application = com.fyber.inneractive.sdk.util.o.f23888a;
            IAlog.c("initOmidSdk", new Object[0]);
            com.fyber.inneractive.sdk.util.r.f23895a.execute(new com.fyber.inneractive.sdk.config.a0(iAConfigManager, application));
        }
        iAConfigManager.H.a();
        com.fyber.inneractive.sdk.util.r.f23895a.execute(new com.fyber.inneractive.sdk.bidder.adm.t(yVar, c0Var, rVarA));
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void removeUnitController(InneractiveUnitController inneractiveUnitController) {
        if (inneractiveUnitController != null) {
            s0 s0Var = this.f20742f;
            if (s0Var != null && s0Var.equals(inneractiveUnitController)) {
                this.f20742f.destroy();
                this.f20742f = null;
            }
            this.f20743g.remove(inneractiveUnitController);
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void requestAd(InneractiveAdRequest inneractiveAdRequest) {
        if (IAConfigManager.d()) {
            IAlog.a("%sIAB TCF purpose 1 disabled, dropping request", IAlog.a(this));
            InneractiveAdSpot.RequestListener requestListener = this.f20738b;
            if (requestListener != null) {
                requestListener.onInneractiveFailedAdRequest(this, InneractiveErrorCode.IAB_TCF_PURPOSE_1_DISABLED);
                return;
            }
            return;
        }
        IAlog.a("%srequestAd called with request: %s", IAlog.a(this), inneractiveAdRequest);
        if (inneractiveAdRequest == null && this.f20739c == null) {
            IAlog.b("%srequestAd called with a null request, but no previous request is available! Cannot continue", IAlog.a(this));
            InneractiveAdSpot.RequestListener requestListener2 = this.f20738b;
            if (requestListener2 != null) {
                requestListener2.onInneractiveFailedAdRequest(this, InneractiveErrorCode.INVALID_INPUT);
                return;
            }
            return;
        }
        if (!InneractiveAdManager.wasInitialized()) {
            InneractiveAdSpot.RequestListener requestListener3 = this.f20738b;
            if (requestListener3 != null) {
                requestListener3.onInneractiveFailedAdRequest(this, InneractiveErrorCode.SDK_NOT_INITIALIZED);
                return;
            }
            return;
        }
        InneractiveAdRequest inneractiveAdRequest2 = inneractiveAdRequest != null ? inneractiveAdRequest : this.f20739c;
        String str = this.f20737a;
        inneractiveAdRequest2.f20990b = str;
        com.fyber.inneractive.sdk.metrics.d.f21138d.a(str).c();
        if (this.f20743g.isEmpty()) {
            IAlog.b("%srequestAd called but no AdUnitControllers exist! Cannot continue", IAlog.a(this));
            if (this.f20738b != null) {
                if (inneractiveAdRequest == null) {
                    inneractiveAdRequest = this.f20739c;
                }
                a(inneractiveAdRequest, null);
                this.f20738b.onInneractiveFailedAdRequest(this, InneractiveErrorCode.INVALID_INPUT);
                return;
            }
            return;
        }
        IAConfigManager.b();
        m mVar = this.f20744h;
        if (mVar != null) {
            boolean z10 = inneractiveAdRequest != null || this.f20739c == null;
            l lVar = mVar.f20769g;
            if (lVar != null) {
                IAConfigManager.removeListener(lVar);
            }
            com.fyber.inneractive.sdk.network.m mVar2 = mVar.f20850d;
            if (mVar2 != null) {
                mVar2.a();
                mVar.f20850d = null;
            }
            mVar.a(z10);
            mVar.f20848b = null;
        }
        if (inneractiveAdRequest != null) {
            InneractiveAdRequest inneractiveAdRequest3 = this.f20739c;
            if (inneractiveAdRequest3 != null) {
                inneractiveAdRequest.setSelectedUnitConfig(inneractiveAdRequest3.getSelectedUnitConfig());
            }
            this.f20739c = inneractiveAdRequest;
            x xVar = this.f20741e;
            if (xVar != null) {
                xVar.destroy();
                this.f20746j = true;
            }
            Iterator it = this.f20743g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    this.f20739c.f20989a = false;
                    break;
                } else if (((s0) it.next()) instanceof InneractiveFullscreenUnitController) {
                    break;
                }
            }
        }
        this.f20744h = new m(this.f20737a);
        if (this.f20740d == null) {
            this.f20740d = new e0(this);
        }
        IAlog.a("%sFound ad source for request! %s", IAlog.a(this), this.f20744h);
        IAlog.a("%s initOmidSdkIfNeeded", IAlog.a(this));
        IAConfigManager iAConfigManager = IAConfigManager.O;
        com.fyber.inneractive.sdk.measurement.e eVar = iAConfigManager.K;
        if (eVar == null || !eVar.f21095a) {
            Application application = com.fyber.inneractive.sdk.util.o.f23888a;
            IAlog.c("initOmidSdk", new Object[0]);
            com.fyber.inneractive.sdk.util.r.f23895a.execute(new com.fyber.inneractive.sdk.config.a0(iAConfigManager, application));
        }
        iAConfigManager.H.a();
        m mVar3 = this.f20744h;
        if (mVar3 != null) {
            InneractiveAdRequest inneractiveAdRequest4 = this.f20739c;
            mVar3.f20848b = this.f20740d;
            if (IAConfigManager.e()) {
                mVar3.c(inneractiveAdRequest4);
                return;
            }
            l lVar2 = new l(mVar3, inneractiveAdRequest4);
            mVar3.f20769g = lVar2;
            IAConfigManager.addListener(lVar2);
            IAConfigManager.a();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void setMediationName(InneractiveMediationName inneractiveMediationName) {
        InneractiveAdManager.setMediationName(inneractiveMediationName);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void setMediationVersion(String str) {
        InneractiveAdManager.setMediationVersion(str);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void setRequestListener(InneractiveAdSpot.RequestListener requestListener) {
        IAlog.a("%ssetRequestListener called with: %s", IAlog.a(this), requestListener);
        this.f20738b = requestListener;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void setMediationName(String str) {
        InneractiveAdManager.setMediationName(str);
    }

    @Override // com.fyber.inneractive.sdk.flow.r0
    public final void a(g0 g0Var) {
        this.f20745i = g0Var;
        requestAd(null);
    }

    @Override // com.fyber.inneractive.sdk.flow.i0
    public final void a() {
        x xVar;
        JSONArray jSONArrayB;
        com.fyber.inneractive.sdk.config.global.r rVar;
        x xVar2 = this.f20741e;
        if (xVar2 != null) {
            if (xVar2.c() && (xVar = this.f20741e) != null && !xVar.f21039e) {
                String string = Arrays.toString(Thread.currentThread().getStackTrace());
                IAlog.a("Firing Event 803 - Stack trace - %s", string);
                com.fyber.inneractive.sdk.network.t tVar = com.fyber.inneractive.sdk.network.t.IA_AD_DESTROYED_WITHOUT_SHOW;
                x xVar3 = this.f20741e;
                InneractiveAdRequest inneractiveAdRequest = xVar3.f21035a;
                com.fyber.inneractive.sdk.response.e eVarB = xVar3.b();
                m mVar = this.f20744h;
                p pVar = this.f20748l;
                com.fyber.inneractive.sdk.config.global.r rVar2 = pVar != null ? pVar.f20849c : null;
                if (mVar != null && (rVar = mVar.f20849c) != null) {
                    jSONArrayB = rVar.b();
                } else {
                    jSONArrayB = rVar2 != null ? rVar2.b() : null;
                }
                com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVarB);
                wVar.f21417b = tVar;
                wVar.f21416a = inneractiveAdRequest;
                wVar.f21419d = jSONArrayB;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("stack_trace", string);
                } catch (Exception unused) {
                    IAlog.f("Got exception adding param to json object: %s, %s", "stack_trace", string);
                }
                wVar.f21421f.put(jSONObject);
                wVar.a((String) null);
            }
            this.f20741e.destroy();
            this.f20741e = null;
        }
        this.f20742f = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.fyber.inneractive.sdk.external.InneractiveAdRequest r10, com.fyber.inneractive.sdk.response.e r11) {
        /*
            r9 = this;
            r0 = 0
            if (r10 == 0) goto L33
            com.fyber.inneractive.sdk.config.s0 r1 = r10.getSelectedUnitConfig()
            if (r1 == 0) goto L33
            com.fyber.inneractive.sdk.config.s0 r1 = r10.getSelectedUnitConfig()
            com.fyber.inneractive.sdk.config.r0 r1 = (com.fyber.inneractive.sdk.config.r0) r1
            com.fyber.inneractive.sdk.config.l0 r1 = r1.f20435c
            if (r1 == 0) goto L1e
            com.fyber.inneractive.sdk.config.s0 r1 = r10.getSelectedUnitConfig()
            com.fyber.inneractive.sdk.config.r0 r1 = (com.fyber.inneractive.sdk.config.r0) r1
            com.fyber.inneractive.sdk.config.l0 r1 = r1.f20435c
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = r1.f20420b
            goto L34
        L1e:
            com.fyber.inneractive.sdk.config.s0 r1 = r10.getSelectedUnitConfig()
            com.fyber.inneractive.sdk.config.r0 r1 = (com.fyber.inneractive.sdk.config.r0) r1
            com.fyber.inneractive.sdk.config.t0 r1 = r1.f20438f
            if (r1 == 0) goto L33
            com.fyber.inneractive.sdk.config.s0 r1 = r10.getSelectedUnitConfig()
            com.fyber.inneractive.sdk.config.r0 r1 = (com.fyber.inneractive.sdk.config.r0) r1
            com.fyber.inneractive.sdk.config.t0 r1 = r1.f20438f
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = r1.f20498j
            goto L34
        L33:
            r1 = r0
        L34:
            com.fyber.inneractive.sdk.flow.x r2 = r9.f20741e
            if (r2 == 0) goto L3e
            com.fyber.inneractive.sdk.response.e r2 = r2.f21036b
            if (r2 == 0) goto L3e
            r4 = r2
            goto L3f
        L3e:
            r4 = r11
        L3f:
            java.lang.String r6 = r9.f20737a
            if (r1 != 0) goto L47
            if (r4 == 0) goto L47
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = r4.f23736p
        L47:
            r7 = r1
            com.fyber.inneractive.sdk.metrics.c r3 = new com.fyber.inneractive.sdk.metrics.c
            com.fyber.inneractive.sdk.flow.x r11 = r9.f20741e
            if (r11 != 0) goto L51
        L4e:
            r5 = r10
            r8 = r0
            goto L58
        L51:
            com.fyber.inneractive.sdk.config.global.r r11 = r11.f21037c
            org.json.JSONArray r0 = r11.b()
            goto L4e
        L58:
            r3.<init>(r4, r5, r6, r7, r8)
            r3.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.flow.h0.a(com.fyber.inneractive.sdk.external.InneractiveAdRequest, com.fyber.inneractive.sdk.response.e):void");
    }

    public final void a(x xVar) {
        synchronized (this.f20750n) {
            try {
                p pVar = this.f20748l;
                if (pVar != null) {
                    pVar.a(true);
                    pVar.f20848b = null;
                    this.f20748l = null;
                }
                m mVar = this.f20744h;
                if (mVar != null) {
                    l lVar = mVar.f20769g;
                    if (lVar != null) {
                        IAConfigManager.removeListener(lVar);
                    }
                    com.fyber.inneractive.sdk.network.m mVar2 = mVar.f20850d;
                    if (mVar2 != null) {
                        mVar2.a();
                        mVar.f20850d = null;
                    }
                    mVar.a(true);
                    mVar.f20848b = null;
                    this.f20744h = null;
                }
                if (xVar != null) {
                    xVar.destroy();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
