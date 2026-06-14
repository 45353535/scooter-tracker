package com.fyber.inneractive.sdk.player.controller;

import android.app.Application;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.config.t0;
import com.fyber.inneractive.sdk.config.w0;
import com.fyber.inneractive.sdk.config.x0;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import com.iab.omid.library.fyber.adsession.AdSession;
import com.iab.omid.library.fyber.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.fyber.adsession.media.InteractionType;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public abstract class z implements b, p, o, com.fyber.inneractive.sdk.player.ui.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.f f21547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s0 f21548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.global.r f21549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.ui.s f21550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public x f21551e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g0 f21553g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Runnable f21556j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f21557k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public u f21559m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f21560n;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.ui.g f21567u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f21568v;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f21552f = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f21554h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f21555i = -0.1f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f21558l = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f21561o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f21562p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f21563q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f21564r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f21565s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public com.fyber.inneractive.sdk.ignite.m f21566t = com.fyber.inneractive.sdk.ignite.m.NONE;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f21569w = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f21571y = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Skip f21570x = null;

    public z(com.fyber.inneractive.sdk.player.f fVar, com.fyber.inneractive.sdk.player.ui.s sVar, s0 s0Var, com.fyber.inneractive.sdk.config.global.r rVar, boolean z10, String str) {
        q qVar;
        this.f21547a = fVar;
        this.f21548b = s0Var;
        this.f21549c = rVar;
        this.f21550d = sVar;
        this.f21560n = z10;
        this.f21568v = str;
        sVar.setListener(this);
        if (fVar == null || (qVar = fVar.f23252a) == null) {
            return;
        }
        if (!qVar.f21523b.contains(this)) {
            qVar.f21523b.add(this);
        }
        q qVar2 = fVar.f23252a;
        if (qVar2.f21524c.contains(this)) {
            return;
        }
        qVar2.f21524c.add(this);
    }

    public static int l() {
        int i10;
        try {
            i10 = Integer.parseInt(IAConfigManager.O.f20315u.f20484b.a("max_rv_tsec", Integer.toString(30)));
        } catch (Throwable unused) {
            i10 = 30;
        }
        if (i10 < 1) {
            return 30;
        }
        return i10;
    }

    public abstract boolean A();

    public boolean B() {
        com.fyber.inneractive.sdk.player.f fVar;
        q qVar;
        t0 t0Var;
        s0 s0Var = this.f21548b;
        boolean z10 = (s0Var == null || (t0Var = ((r0) s0Var).f20438f) == null || t0Var.f20498j != UnitDisplayType.REWARDED) ? false : true;
        if (!InneractiveAdManager.isCurrentUserAChild() || !z10 || this.f21550d == null || (fVar = this.f21547a) == null || (qVar = fVar.f23252a) == null) {
            return false;
        }
        int iB = qVar.b() / 1000;
        return (this.f21547a.f23252a.c() / 1000) - iB <= 0 || iB < l();
    }

    public void C() {
        Boolean boolC;
        com.fyber.inneractive.sdk.config.global.r rVar = this.f21549c;
        com.fyber.inneractive.sdk.config.global.features.u uVar = rVar != null ? (com.fyber.inneractive.sdk.config.global.features.u) rVar.a(com.fyber.inneractive.sdk.config.global.features.u.class) : null;
        boolean zBooleanValue = (uVar == null || (boolC = uVar.c("show_cta")) == null) ? true : boolC.booleanValue();
        g0 g0Var = this.f21553g;
        if (g0Var != null) {
            this.f21566t = g0Var.p();
        }
        com.fyber.inneractive.sdk.ignite.m mVar = this.f21566t;
        this.f21550d.a(mVar == com.fyber.inneractive.sdk.ignite.m.NONE ? zBooleanValue : true, mVar);
    }

    public final void D() {
        com.fyber.inneractive.sdk.flow.endcard.b bVarA;
        g0 g0Var;
        com.fyber.inneractive.sdk.flow.storepromo.controller.c cVar;
        boolean z10;
        com.fyber.inneractive.sdk.flow.storepromo.ui.c cVar2;
        com.fyber.inneractive.sdk.flow.storepromo.ui.c cVar3;
        View view;
        View view2;
        com.fyber.inneractive.sdk.flow.endcard.b bVar;
        com.fyber.inneractive.sdk.model.vast.o oVar;
        this.f21550d.h();
        com.fyber.inneractive.sdk.flow.endcard.k kVarJ = j();
        if (kVarJ != null) {
            bVarA = kVarJ.a();
            com.fyber.inneractive.sdk.flow.endcard.h hVar = kVarJ.f20668e;
            com.fyber.inneractive.sdk.flow.endcard.m mVar = kVarJ.f20665b;
            hVar.getClass();
            if (mVar.f20700a.size() >= 1) {
                com.fyber.inneractive.sdk.flow.endcard.b bVarA2 = mVar.a();
                com.fyber.inneractive.sdk.model.vast.i iVar = com.fyber.inneractive.sdk.model.vast.i.FMP_End_Card;
                Iterator it = mVar.f20700a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        bVar = null;
                        break;
                    } else {
                        bVar = (com.fyber.inneractive.sdk.flow.endcard.b) it.next();
                        if (bVar.i() == iVar) {
                            break;
                        }
                    }
                }
                if (bVarA2 != null && bVarA2.i() != com.fyber.inneractive.sdk.model.vast.i.FMP_End_Card && bVarA2.i() != com.fyber.inneractive.sdk.model.vast.i.Default_End_Card && bVarA2.l() && (oVar = bVarA2.f20648c.f21045e.f21166f) != null && oVar.f21220d && bVar != null && bVar.l()) {
                    hVar.a(bVarA2, bVar.l());
                    hVar.a(bVar, true, bVarA2.k());
                } else if (bVarA2 == bVar || bVarA2 == null || bVarA2.g() == com.fyber.inneractive.sdk.util.g.DEFAULT_ENDCARD) {
                    hVar.a(bVarA2, false, false);
                } else {
                    hVar.a(bVarA2, false);
                }
            }
        } else {
            bVarA = null;
        }
        if (bVarA == null) {
            if (e() || (g0Var = this.f21553g) == null) {
                return;
            }
            g0Var.j();
            return;
        }
        a(bVarA);
        if (n() != null) {
            com.fyber.inneractive.sdk.flow.storepromo.b bVarN = n();
            com.fyber.inneractive.sdk.player.ui.s sVar = this.f21550d;
            com.fyber.inneractive.sdk.flow.storepromo.controller.b bVar2 = bVarN.f20876d;
            if (bVar2 == null || (cVar = bVar2.f20885c) == null || !(z10 = cVar.f20896e)) {
                bVarN.f20873a.a();
                bVarN.a();
                bVarN.a((bVarN.f20876d == null ? com.fyber.inneractive.sdk.flow.storepromo.events.a.CONTROLLER_NOT_INITIALIZED : com.fyber.inneractive.sdk.flow.storepromo.events.a.TEMPLATE_NOT_LOADED).name(), (String) null, (String) null);
                return;
            }
            bVar2.f20891i = kVarJ;
            if (!z10 || (cVar2 = bVar2.f20886d) == null || bVar2.f20889g) {
                return;
            }
            if (cVar2.f20974b == null || (view2 = cVar2.f20973a) == null || view2.getParent() == null || cVar2.f20974b.getVisibility() != 0) {
                com.fyber.inneractive.sdk.flow.storepromo.ui.c cVar4 = bVar2.f20886d;
                if (cVar4.f20974b == null || cVar4.f20973a == null) {
                    IAlog.f("StorePromoView: show: missing container or content", new Object[0]);
                    return;
                }
                cVar4.a();
                com.fyber.inneractive.sdk.util.v.a(cVar4.f20974b);
                sVar.addView(cVar4.f20974b);
                cVar4.f20973a.setAnimation(cVar4.f20975c);
                cVar4.f20974b.setVisibility(0);
                com.fyber.inneractive.sdk.flow.storepromo.b bVar3 = cVar4.f20978f;
                if (bVar3 != null) {
                    com.fyber.inneractive.sdk.flow.storepromo.controller.b bVar4 = bVar3.f20876d;
                    com.fyber.inneractive.sdk.flow.storepromo.observer.b bVar5 = new com.fyber.inneractive.sdk.flow.storepromo.observer.b((bVar4 == null || (cVar3 = bVar4.f20886d) == null || cVar3.f20974b == null || (view = cVar3.f20973a) == null || view.getParent() == null || cVar3.f20974b.getVisibility() != 0) ? false : true, bVar3.f20881i);
                    Iterator it2 = bVar3.f20880h.iterator();
                    while (it2.hasNext()) {
                        ((com.fyber.inneractive.sdk.flow.storepromo.observer.a) it2.next()).a(bVar5);
                    }
                    JSONObject jSONObject = new JSONObject();
                    Integer numValueOf = Integer.valueOf(bVar3.f20879g);
                    try {
                        jSONObject.put("screenshots", numValueOf);
                    } catch (Exception unused) {
                        IAlog.f("Got exception adding param to json object: %s, %s", "screenshots", numValueOf);
                    }
                    com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.VAST_EVENT_SP_IMPRESSION;
                    InneractiveAdRequest inneractiveAdRequest = bVar3.f20875c;
                    com.fyber.inneractive.sdk.response.e eVar = bVar3.f20874b;
                    String str = bVar3.f20878f;
                    com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(uVar, inneractiveAdRequest, eVar);
                    try {
                        jSONObject.put("templateURL", str);
                    } catch (Exception unused2) {
                        IAlog.f("Got exception adding param to json object: %s, %s", "templateURL", str);
                    }
                    wVar.f21421f.put(jSONObject);
                    wVar.a((String) null);
                }
            }
        }
    }

    public void E() {
        boolean z10;
        q qVar;
        q qVar2;
        com.fyber.inneractive.sdk.player.f fVar = this.f21547a;
        if (fVar != null && (((qVar2 = fVar.f23252a) != null && qVar2.f21526e == com.fyber.inneractive.sdk.player.enums.b.Completed) || this.f21563q)) {
            fVar.a();
        }
        boolean zA = IAConfigManager.O.f20315u.f20484b.a(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD).a();
        com.fyber.inneractive.sdk.player.ui.s sVar = this.f21550d;
        com.fyber.inneractive.sdk.player.f fVar2 = this.f21547a;
        sVar.e((fVar2 == null || (qVar = fVar2.f23252a) == null || qVar.f21526e != com.fyber.inneractive.sdk.player.enums.b.Completed) && !(((z10 = this.f21563q) && !zA) || this.f21564r || (z10 && zA)));
    }

    public void a() {
    }

    public abstract void b(g1 g1Var);

    @Override // com.fyber.inneractive.sdk.player.controller.b
    public boolean b() {
        com.fyber.inneractive.sdk.player.f fVar = this.f21547a;
        if (fVar == null) {
            return false;
        }
        if (this.f21554h || fVar.f23252a == null) {
            return true;
        }
        com.fyber.inneractive.sdk.player.ui.s sVar = this.f21550d;
        if (sVar != null && sVar.i()) {
            return true;
        }
        int iC = this.f21547a.f23252a.c();
        com.fyber.inneractive.sdk.player.f fVar2 = this.f21547a;
        return com.fyber.inneractive.sdk.player.f.a(iC, com.fyber.inneractive.sdk.player.f.a(fVar2), ((com.fyber.inneractive.sdk.player.n) fVar2).f23317s) && !this.f21554h && this.f21552f == 0;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.p
    public final void c(boolean z10) {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.p
    public final void d() {
        if (this.f21561o && !this.f21558l) {
            this.f21558l = true;
        }
    }

    @Override // com.fyber.inneractive.sdk.ui.controller.b
    public void destroy() {
        q qVar;
        Application application;
        u uVar = this.f21559m;
        if (uVar != null && (application = com.fyber.inneractive.sdk.util.o.f23888a) != null) {
            application.unregisterActivityLifecycleCallbacks(uVar);
        }
        IAlog.a("%sdestroy called", IAlog.a(this));
        com.fyber.inneractive.sdk.player.f fVar = this.f21547a;
        if (fVar != null && (qVar = fVar.f23252a) != null) {
            qVar.f21523b.remove(this);
            this.f21547a.f23252a.f21524c.remove(this);
        }
        g();
        Runnable runnable = this.f21556j;
        if (runnable != null) {
            this.f21550d.removeCallbacks(runnable);
            this.f21556j = null;
        }
        this.f21553g = null;
    }

    public boolean e() {
        String str;
        com.fyber.inneractive.sdk.flow.endcard.k kVarJ = j();
        if (kVarJ != null) {
            com.fyber.inneractive.sdk.response.g gVar = kVarJ.f20664a.f21044d;
            if (!((gVar == null || (str = gVar.E) == null || !TextUtils.equals(str, "1")) ? false : true)) {
                return true;
            }
        }
        return false;
    }

    public final void f(boolean z10) {
        q qVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f21547a;
        if (fVar != null && (qVar = fVar.f23252a) != null) {
            qVar.b(z10);
        }
        this.f21550d.setMuteButtonState(true);
    }

    public void g() {
        if (this.f21567u != null) {
            IAlog.a("%sdestroyTextureView", IAlog.a(this));
        }
    }

    public void h(boolean z10) {
        q qVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f21547a;
        if (fVar != null) {
            if (!fVar.f23258g) {
                E();
                return;
            }
            if (z10 && (qVar = fVar.f23252a) != null) {
                qVar.a(0, true);
                return;
            }
            q qVar2 = fVar.f23252a;
            if (qVar2 != null) {
                com.fyber.inneractive.sdk.player.enums.b bVar = qVar2.f21526e;
                if (bVar == com.fyber.inneractive.sdk.player.enums.b.Completed || bVar == com.fyber.inneractive.sdk.player.enums.b.Prepared) {
                    qVar2.a(1, true);
                } else {
                    qVar2.j();
                }
            }
        }
    }

    public abstract int i();

    public final void i(boolean z10) {
        q qVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f21547a;
        if (fVar != null && (qVar = fVar.f23252a) != null) {
            qVar.d(z10);
        }
        this.f21550d.setMuteButtonState(false);
    }

    public final com.fyber.inneractive.sdk.flow.endcard.k j() {
        com.fyber.inneractive.sdk.player.f fVar = this.f21547a;
        if (fVar != null) {
            return ((com.fyber.inneractive.sdk.player.n) fVar).f23318t;
        }
        return null;
    }

    public com.fyber.inneractive.sdk.web.b0 k() {
        return new w(this);
    }

    public final float m() {
        try {
            return ((AudioManager) this.f21550d.getContext().getSystemService("audio")).getStreamVolume(3);
        } catch (Throwable unused) {
            return 1.0f;
        }
    }

    public com.fyber.inneractive.sdk.flow.storepromo.b n() {
        com.fyber.inneractive.sdk.player.f fVar = this.f21547a;
        if (fVar != null) {
            return ((com.fyber.inneractive.sdk.player.n) fVar).f23320v;
        }
        return null;
    }

    public abstract int o();

    public final boolean p() {
        q qVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f21547a;
        return (fVar == null || (qVar = fVar.f23252a) == null || (!qVar.g() && ((double) m()) != 0.0d)) ? false : true;
    }

    public final void q() {
        this.f21550d.a(true);
        this.f21550d.e(false);
        Runnable runnable = this.f21556j;
        if (runnable == null) {
            if (runnable == null) {
                this.f21556j = new t(this);
            }
            int i10 = i();
            IAlog.a("%s Starting buffering timeout with %d", IAlog.a(this), Integer.valueOf(i10));
            this.f21550d.postDelayed(this.f21556j, i10);
        }
    }

    public abstract void r();

    public void s() {
        if (B()) {
            g(false);
        } else {
            d(false);
        }
    }

    public abstract void t();

    public void u() {
        Runnable runnable = this.f21556j;
        if (runnable != null) {
            this.f21550d.removeCallbacks(runnable);
            this.f21556j = null;
        }
        this.f21550d.a(false);
        E();
    }

    public abstract void v();

    public void w() {
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void x() {
        /*
            r5 = this;
            com.fyber.inneractive.sdk.player.ui.s r0 = r5.f21550d
            r1 = 0
            r0.a(r1)
            com.fyber.inneractive.sdk.player.ui.s r0 = r5.f21550d
            r0.e(r1)
            java.lang.Runnable r0 = r5.f21556j
            if (r0 == 0) goto L17
            com.fyber.inneractive.sdk.player.ui.s r2 = r5.f21550d
            r2.removeCallbacks(r0)
            r0 = 0
            r5.f21556j = r0
        L17:
            com.fyber.inneractive.sdk.player.f r0 = r5.f21547a
            r2 = 1
            if (r0 == 0) goto L74
            boolean r0 = r5.A()
            if (r0 == 0) goto L74
            boolean r0 = r5.f21554h
            if (r0 != 0) goto L74
            com.fyber.inneractive.sdk.player.f r0 = r5.f21547a
            com.fyber.inneractive.sdk.player.controller.q r0 = r0.f23252a
            int r0 = r0.c()
            com.fyber.inneractive.sdk.player.f r3 = r5.f21547a
            r4 = r3
            com.fyber.inneractive.sdk.player.n r4 = (com.fyber.inneractive.sdk.player.n) r4
            com.fyber.inneractive.sdk.config.s0 r4 = r4.f23317s
            int r3 = com.fyber.inneractive.sdk.player.f.a(r3)
            boolean r0 = com.fyber.inneractive.sdk.player.f.a(r0, r3, r4)
            if (r0 == 0) goto L74
            int r0 = r5.f21552f
            if (r0 > 0) goto L4c
            com.fyber.inneractive.sdk.player.ui.s r0 = r5.f21550d
            r0.g(r2)
            r5.h()
            goto L74
        L4c:
            com.fyber.inneractive.sdk.player.f r0 = r5.f21547a
            if (r0 == 0) goto L64
            com.fyber.inneractive.sdk.player.controller.q r0 = r0.f23252a
            if (r0 == 0) goto L64
            int r0 = r0.c()
            int r0 = r0 / 1000
            int r3 = r5.f21552f
            if (r3 < r0) goto L64
            com.fyber.inneractive.sdk.player.ui.s r0 = r5.f21550d
            r0.g(r1)
            goto L74
        L64:
            boolean r0 = r5.f21562p
            if (r0 != 0) goto L74
            com.fyber.inneractive.sdk.player.ui.s r0 = r5.f21550d
            r0.g(r2)
            int r0 = r5.f21552f
            r5.b(r0)
            r5.f21562p = r2
        L74:
            com.fyber.inneractive.sdk.player.controller.g0 r0 = r5.f21553g
            if (r0 == 0) goto L81
            boolean r3 = r5.f21557k
            if (r3 != 0) goto L81
            r5.f21557k = r2
            r0.k()
        L81:
            r5.f21563q = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.controller.z.x():void");
    }

    public final void y() {
        com.fyber.inneractive.sdk.player.ui.g gVar;
        com.fyber.inneractive.sdk.player.ui.s sVar = this.f21550d;
        if (sVar != null) {
            sVar.o();
        }
        com.fyber.inneractive.sdk.player.f fVar = this.f21547a;
        if (fVar != null && fVar.f23252a != null && (gVar = this.f21567u) != null) {
            gVar.invalidate();
            this.f21567u.requestLayout();
        }
        com.fyber.inneractive.sdk.player.ui.s sVar2 = this.f21550d;
        if (sVar2 != null) {
            sVar2.invalidate();
            this.f21550d.requestLayout();
        }
    }

    public void z() {
        q qVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f21547a;
        if (fVar == null || (qVar = fVar.f23252a) == null) {
            return;
        }
        if (qVar.f21526e == com.fyber.inneractive.sdk.player.enums.b.Paused) {
            IAlog.a("%spauseVideo called in bad state! %s", IAlog.a(this), qVar.f21526e);
            return;
        }
        IAlog.a("%spauseVideo %s", IAlog.a(this), this.f21550d);
        TextureView textureView = qVar.f21531j;
        if (textureView == null || textureView.getParent() == null || textureView.getParent() != this.f21550d.getTextureHost()) {
            return;
        }
        qVar.i();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.p
    public final void a(com.fyber.inneractive.sdk.player.mediaplayer.o oVar) {
    }

    @Override // com.fyber.inneractive.sdk.player.ui.n
    public void c() {
        IAlog.a("%sonVideoViewDetachedFromWindow", IAlog.a(this));
        g();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b7  */
    @Override // com.fyber.inneractive.sdk.player.controller.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.fyber.inneractive.sdk.flow.endcard.b r6) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.controller.z.a(com.fyber.inneractive.sdk.flow.endcard.b):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(boolean r7) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.controller.z.d(boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g(boolean r6) {
        /*
            r5 = this;
            com.fyber.inneractive.sdk.player.controller.f0 r0 = new com.fyber.inneractive.sdk.player.controller.f0
            com.fyber.inneractive.sdk.player.ui.s r1 = r5.f21550d
            android.content.Context r1 = r1.getContext()
            com.fyber.inneractive.sdk.config.global.r r2 = r5.f21549c
            if (r2 == 0) goto L31
            java.lang.Class<com.fyber.inneractive.sdk.config.global.features.c> r3 = com.fyber.inneractive.sdk.config.global.features.c.class
            com.fyber.inneractive.sdk.config.global.features.h r2 = r2.a(r3)
            com.fyber.inneractive.sdk.config.global.features.c r2 = (com.fyber.inneractive.sdk.config.global.features.c) r2
            r2.getClass()
            java.util.ArrayList r4 = new java.util.ArrayList
            java.util.HashMap r2 = r2.f20380c
            java.util.Collection r2 = r2.values()
            r4.<init>(r2)
            int r2 = r4.size()
            if (r2 <= 0) goto L31
            com.fyber.inneractive.sdk.config.global.r r2 = r5.f21549c
            com.fyber.inneractive.sdk.config.global.features.h r2 = r2.a(r3)
            com.fyber.inneractive.sdk.config.global.features.c r2 = (com.fyber.inneractive.sdk.config.global.features.c) r2
            goto L32
        L31:
            r2 = 0
        L32:
            com.fyber.inneractive.sdk.player.controller.v r3 = new com.fyber.inneractive.sdk.player.controller.v
            r3.<init>(r5, r6)
            r0.<init>(r1, r2, r3)
            android.app.Dialog r6 = r0.f21509b
            r6.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.controller.z.g(boolean):void");
    }

    public final void e(boolean z10) {
        q qVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f21547a;
        if (fVar == null || (qVar = fVar.f23252a) == null) {
            return;
        }
        com.fyber.inneractive.sdk.player.enums.b bVar = qVar.f21526e;
        if (z10 && bVar != com.fyber.inneractive.sdk.player.enums.b.Completed && !this.f21550d.b()) {
            h(false);
            return;
        }
        if (!z10 && bVar == com.fyber.inneractive.sdk.player.enums.b.Paused && this.f21550d.b()) {
            int iB = qVar.b();
            int iC = qVar.c();
            if (iB <= 0 || iB > iC) {
                return;
            }
            qVar.a(iB - 1, false);
            qVar.a(iB, false);
        }
    }

    public void f() {
        q qVar;
        q qVar2;
        com.fyber.inneractive.sdk.measurement.f fVar;
        if (this.f21567u == null) {
            com.fyber.inneractive.sdk.player.ui.g gVar = new com.fyber.inneractive.sdk.player.ui.g(this.f21550d);
            this.f21567u = gVar;
            gVar.setId(R.id.ia_inn_texture_view);
            com.fyber.inneractive.sdk.player.f fVar2 = this.f21547a;
            if (fVar2 != null && (fVar = fVar2.f23256e) != null) {
                com.fyber.inneractive.sdk.player.ui.s sVar = this.f21550d;
                View[] trackingFriendlyView = sVar.getTrackingFriendlyView();
                AdSession adSession = fVar.f21104a;
                if (adSession != null) {
                    try {
                        adSession.registerAdView(sVar);
                    } catch (Throwable th2) {
                        fVar.a(th2);
                    }
                }
                if (fVar.f21104a != null && trackingFriendlyView != null) {
                    for (View view : trackingFriendlyView) {
                        if (view != null) {
                            try {
                                fVar.f21104a.addFriendlyObstruction(view, FriendlyObstructionPurpose.VIDEO_CONTROLS, null);
                            } catch (Throwable th3) {
                                fVar.a(th3);
                            }
                        }
                    }
                }
                View[] trackingFriendlyViewObstructionPurposeOther = this.f21550d.getTrackingFriendlyViewObstructionPurposeOther();
                if (fVar.f21104a != null) {
                    for (View view2 : trackingFriendlyViewObstructionPurposeOther) {
                        if (view2 != null) {
                            try {
                                fVar.f21104a.addFriendlyObstruction(view2, FriendlyObstructionPurpose.OTHER, null);
                            } catch (Throwable th4) {
                                fVar.a(th4);
                            }
                        }
                    }
                }
            }
        }
        IAlog.a("%sconnectToTextureView called %s", IAlog.a(this), this.f21550d.getTextureHost());
        if (this.f21567u != null && this.f21550d.getTextureHost().equals(this.f21567u.getParent())) {
            IAlog.a("%sconnectToTextureView called but already connected", IAlog.a(this));
            return;
        }
        com.fyber.inneractive.sdk.player.f fVar3 = this.f21547a;
        if (fVar3 != null && (qVar2 = fVar3.f23252a) != null) {
            qVar2.a(this.f21567u);
        }
        com.fyber.inneractive.sdk.player.ui.g gVar2 = this.f21567u;
        if (gVar2 != null && gVar2.getParent() == null) {
            IAlog.a("%supdateView adding texture to parent", IAlog.a(this));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            this.f21550d.getTextureHost().addView(this.f21567u, layoutParams);
        }
        this.f21558l = false;
        x xVar = new x(this);
        this.f21551e = xVar;
        com.fyber.inneractive.sdk.player.f fVar4 = this.f21547a;
        if (fVar4 == null || (qVar = fVar4.f23252a) == null) {
            return;
        }
        qVar.f21525d = xVar;
    }

    public void h() {
        if (A()) {
            com.fyber.inneractive.sdk.config.global.r rVar = this.f21549c;
            String str = null;
            com.fyber.inneractive.sdk.config.global.features.d dVar = rVar != null ? (com.fyber.inneractive.sdk.config.global.features.d) rVar.a(com.fyber.inneractive.sdk.config.global.features.d.class) : null;
            if (dVar != null) {
                dVar.d(IAConfigManager.O.f20309o);
                com.fyber.inneractive.sdk.model.vast.a aVar = dVar.f20378e;
                if (aVar != null && aVar.f21159d) {
                    str = aVar.f21157b;
                }
            }
            if (TextUtils.isEmpty(this.f21568v) && str != null) {
                this.f21550d.setSkipText(str);
            } else {
                com.fyber.inneractive.sdk.player.ui.s sVar = this.f21550d;
                sVar.setSkipText(sVar.getContext().getString(R.string.ia_video_skip_text));
            }
            this.f21550d.g();
            this.f21552f = 0;
            g0 g0Var = this.f21553g;
            if (g0Var != null) {
                g0Var.d();
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.b
    public void b(boolean z10) {
        IAlog.a("%sinitUI", IAlog.a(this));
        com.fyber.inneractive.sdk.player.f fVar = this.f21547a;
        if (fVar == null || fVar.f23252a == null) {
            return;
        }
        this.f21550d.setUnitConfig(this.f21548b);
        this.f21550d.a(this.f21560n, this.f21547a.f23252a.f(), this.f21547a.f23252a.e());
        if (A()) {
            this.f21552f = o();
        } else {
            this.f21550d.g(false);
        }
        if (!z10) {
            a(this.f21547a.f23252a.b());
            a(this.f21547a.f23252a.f21526e, false);
        }
        this.f21550d.setMuteButtonState(p());
    }

    public final void b(int i10) {
        if (this.f21550d != null) {
            com.fyber.inneractive.sdk.config.global.r rVar = this.f21549c;
            String str = null;
            com.fyber.inneractive.sdk.config.global.features.d dVar = rVar != null ? (com.fyber.inneractive.sdk.config.global.features.d) rVar.a(com.fyber.inneractive.sdk.config.global.features.d.class) : null;
            if (dVar != null) {
                dVar.d(IAConfigManager.O.f20309o);
                com.fyber.inneractive.sdk.model.vast.a aVar = dVar.f20378e;
                if (aVar != null && aVar.f21159d) {
                    str = aVar.f21158c;
                }
            }
            if (TextUtils.isEmpty(this.f21568v) && str != null) {
                this.f21550d.setSkipText(str.replaceFirst("\\[TIME\\]", Integer.toString(i10)));
            } else {
                this.f21550d.setSkipText(String.valueOf(i10));
            }
        }
    }

    public final void b(com.fyber.inneractive.sdk.flow.storepromo.observer.a aVar) {
        com.fyber.inneractive.sdk.flow.storepromo.b bVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f21547a;
        if (fVar != null && (bVar = ((com.fyber.inneractive.sdk.player.n) fVar).f23320v) != null) {
            bVar.getClass();
            synchronized (com.fyber.inneractive.sdk.flow.storepromo.b.f20872k) {
                bVar.f20880h.remove(aVar);
            }
            return;
        }
        IAlog.f("Unable to remove store promo observer, promo manager is unavailable", new Object[0]);
    }

    public final com.fyber.inneractive.sdk.player.ui.c a(com.fyber.inneractive.sdk.player.ui.c cVar) {
        String string;
        cVar.f23352h = this.f21547a != null && com.fyber.inneractive.sdk.player.f.a(this.f21549c, this.f21566t);
        com.fyber.inneractive.sdk.config.global.r rVar = this.f21549c;
        com.fyber.inneractive.sdk.config.global.features.n nVar = rVar != null ? (com.fyber.inneractive.sdk.config.global.features.n) rVar.a(com.fyber.inneractive.sdk.config.global.features.n.class) : null;
        if (nVar != null) {
            string = nVar.a("app_info_button_text", "App Info");
            if (string != null && string.length() > 30) {
                string = string.substring(0, 30);
            }
        } else {
            string = this.f21550d.getContext().getString(R.string.ia_video_app_info_text);
        }
        cVar.f23353i = string;
        cVar.f23351g = this.f21566t;
        return cVar;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.p
    public final void a(com.fyber.inneractive.sdk.player.enums.b bVar) {
        IAlog.a("%sonPlayerStateChanged with %s", IAlog.a(this), bVar);
        a(bVar, true);
    }

    public final void a(com.fyber.inneractive.sdk.player.enums.b bVar, boolean z10) {
        g0 g0Var;
        com.fyber.inneractive.sdk.player.ui.s sVar;
        switch (y.f21545a[bVar.ordinal()]) {
            case 1:
                boolean z11 = this.f21569w;
                if (z11) {
                    IAlog.a("IAVideoUIControllerBase playerStateUpdated=%s mBuffering=%s", bVar, String.valueOf(z11));
                    q();
                }
                break;
            case 2:
                if (this.f21561o) {
                    E();
                    w();
                }
                break;
            case 3:
                if (this.f21561o) {
                    this.f21569w = true;
                    q();
                }
                break;
            case 4:
                if (this.f21569w) {
                    this.f21569w = false;
                }
                if (this.f21561o) {
                    x();
                }
                break;
            case 5:
                u();
                break;
            case 6:
                if (this.f21561o || (!e() && !this.f21565s)) {
                    this.f21565s = true;
                    if (!this.f21550d.b()) {
                        this.f21550d.a(false);
                        Runnable runnable = this.f21556j;
                        if (runnable != null) {
                            this.f21550d.removeCallbacks(runnable);
                            this.f21556j = null;
                        }
                        E();
                        D();
                        this.f21557k = false;
                        this.f21554h = true;
                    }
                    if (z10 && (g0Var = this.f21553g) != null) {
                        g0Var.onCompleted();
                        break;
                    }
                }
                break;
            case 7:
                if (this.f21561o || ((sVar = this.f21550d) != null && sVar.isShown())) {
                    s();
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00c6  */
    @Override // com.fyber.inneractive.sdk.player.controller.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(int r9) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.controller.z.a(int):void");
    }

    public final void a(String str) {
        t0 t0Var;
        x0 x0Var = IAConfigManager.O.f20318x;
        s0 s0Var = this.f21548b;
        if (s0Var == null || (t0Var = ((r0) s0Var).f20438f) == null) {
            return;
        }
        x0Var.a(t0Var.f20498j, "LAST_VAST_CLICKED_TYPE", str);
    }

    public void a(boolean z10) {
        com.fyber.inneractive.sdk.player.f fVar;
        q qVar;
        x xVar;
        com.fyber.inneractive.sdk.player.ui.s sVar;
        Application application;
        if (this.f21561o == z10 || (fVar = this.f21547a) == null || fVar.f23252a == null) {
            return;
        }
        IAlog.a("%sonVisibilityChanged: %s my video view is%s", IAlog.a(this), Boolean.valueOf(z10), this.f21550d);
        if (z10) {
            this.f21561o = true;
            com.fyber.inneractive.sdk.player.enums.b bVar = this.f21547a.f23252a.f21526e;
            if (bVar != com.fyber.inneractive.sdk.player.enums.b.Completed && !this.f21550d.b()) {
                if (bVar != com.fyber.inneractive.sdk.player.enums.b.Error) {
                    if (bVar == com.fyber.inneractive.sdk.player.enums.b.Idle) {
                        this.f21547a.getClass();
                    } else {
                        if (bVar == com.fyber.inneractive.sdk.player.enums.b.Start_in_progress || bVar == com.fyber.inneractive.sdk.player.enums.b.Playing) {
                            x();
                        }
                        com.fyber.inneractive.sdk.player.f fVar2 = this.f21547a;
                        if (!fVar2.f23261j) {
                            com.fyber.inneractive.sdk.player.n nVar = (com.fyber.inneractive.sdk.player.n) fVar2;
                            nVar.a(nVar.f23314p, VideoClickOrigin.InvalidOrigin, com.fyber.inneractive.sdk.model.vast.x.EVENT_CREATIVE_VIEW);
                            fVar2.f23261j = true;
                        }
                        f();
                        if (this.f21559m != null || (application = com.fyber.inneractive.sdk.util.o.f23888a) == null) {
                            return;
                        }
                        u uVar = new u(this);
                        this.f21559m = uVar;
                        application.registerActivityLifecycleCallbacks(uVar);
                        return;
                    }
                }
                s();
                return;
            }
            if (!this.f21565s) {
                this.f21565s = true;
                if (!this.f21571y) {
                    if (!this.f21550d.b()) {
                        this.f21550d.a(false);
                        Runnable runnable = this.f21556j;
                        if (runnable != null) {
                            this.f21550d.removeCallbacks(runnable);
                            this.f21556j = null;
                        }
                        E();
                        D();
                        this.f21557k = false;
                        this.f21554h = true;
                    }
                    g0 g0Var = this.f21553g;
                    if (g0Var != null) {
                        g0Var.onCompleted();
                    }
                }
            }
            com.fyber.inneractive.sdk.player.ui.s sVar2 = this.f21550d;
            if (sVar2 != null) {
                sVar2.k();
                return;
            }
            return;
        }
        this.f21561o = false;
        com.fyber.inneractive.sdk.player.f fVar3 = this.f21547a;
        if (fVar3 != null && (qVar = fVar3.f23252a) != null && (xVar = qVar.f21525d) != null && xVar.equals(this.f21551e)) {
            IAlog.a("%sonVisibilityChanged pausing video", IAlog.a(this));
            z();
            if (this.f21547a.f23252a.f21526e == com.fyber.inneractive.sdk.player.enums.b.Completed || ((sVar = this.f21550d) != null && sVar.b())) {
                this.f21550d.j();
            }
        }
        com.fyber.inneractive.sdk.player.ui.s sVar3 = this.f21550d;
        if (sVar3 == null || !sVar3.f23363h) {
            g();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void a(int i10, g1 g1Var) {
        IAlog.a("onClicked called with %d", Integer.valueOf(i10));
        switch (i10) {
            case 1:
                if (p()) {
                    i(true);
                    com.fyber.inneractive.sdk.player.f fVar = this.f21547a;
                    if (fVar != null) {
                        com.fyber.inneractive.sdk.player.n nVar = (com.fyber.inneractive.sdk.player.n) fVar;
                        nVar.a(nVar.f23314p, VideoClickOrigin.MUTE, com.fyber.inneractive.sdk.model.vast.x.EVENT_UNMUTE);
                    }
                } else {
                    f(true);
                    com.fyber.inneractive.sdk.player.f fVar2 = this.f21547a;
                    if (fVar2 != null) {
                        com.fyber.inneractive.sdk.player.n nVar2 = (com.fyber.inneractive.sdk.player.n) fVar2;
                        nVar2.a(nVar2.f23314p, VideoClickOrigin.MUTE, com.fyber.inneractive.sdk.model.vast.x.EVENT_MUTE);
                    }
                }
                this.f21550d.setMuteButtonState(p());
                break;
            case 2:
                v();
                break;
            case 3:
                a(w0.CTA_BUTTON.a());
                a(false, VideoClickOrigin.CTA, g1Var);
                break;
            case 4:
                a(w0.COMPANION.a());
                com.fyber.inneractive.sdk.player.f fVar3 = this.f21547a;
                String str = null;
                if (fVar3 != null) {
                    com.fyber.inneractive.sdk.player.n nVar3 = (com.fyber.inneractive.sdk.player.n) fVar3;
                    com.fyber.inneractive.sdk.flow.endcard.b bVarA = nVar3.f23318t.f20665b.a();
                    if (bVarA instanceof com.fyber.inneractive.sdk.flow.endcard.c) {
                        com.fyber.inneractive.sdk.flow.endcard.c cVar = (com.fyber.inneractive.sdk.flow.endcard.c) bVarA;
                        String str2 = cVar.f20652g.f21183g;
                        if (TextUtils.isEmpty(str2)) {
                            com.fyber.inneractive.sdk.model.vast.b bVar = nVar3.f23314p;
                            if (bVar != null) {
                                str = bVar.f21162b;
                            }
                        } else {
                            str = str2;
                        }
                        fVar3.a(cVar, VideoClickOrigin.COMPANION, com.fyber.inneractive.sdk.model.vast.x.EVENT_CLICK);
                    }
                }
                com.fyber.inneractive.sdk.player.ui.s sVar = this.f21550d;
                if (sVar != null) {
                    sVar.f();
                }
                g0 g0Var = this.f21553g;
                if (g0Var != null) {
                    g0Var.a(str, g1Var, false);
                }
                break;
            case 5:
                t();
                break;
            case 6:
                if (B()) {
                    g(true);
                } else {
                    d(true);
                }
                break;
            case 7:
                b(g1Var);
                break;
            case 8:
                a(w0.COMPANION.a());
                a(true, VideoClickOrigin.COMPANION, g1Var);
                break;
            case 9:
                com.fyber.inneractive.sdk.player.f fVar4 = this.f21547a;
                if (fVar4 != null && !this.f21550d.f23363h) {
                    fVar4.f23258g = true;
                    h(false);
                    break;
                }
                break;
            case 10:
                a(w0.APP_INFO.a());
                a(false, VideoClickOrigin.APP_INFO, g1Var);
                break;
            case 11:
                a(w0.STORE_PROMO.a());
                a(false, VideoClickOrigin.STORE_PROMO, g1Var);
                break;
        }
    }

    public final boolean a(boolean z10, VideoClickOrigin videoClickOrigin, g1 g1Var) {
        com.fyber.inneractive.sdk.util.g gVar;
        boolean z11 = true;
        com.fyber.inneractive.sdk.player.ui.s sVar = this.f21550d;
        if (sVar != null) {
            sVar.f();
        }
        g0 g0Var = this.f21553g;
        if (g0Var == null) {
            z11 = false;
        } else {
            if (z10) {
                com.fyber.inneractive.sdk.player.f fVar = this.f21547a;
                if (fVar != null) {
                    com.fyber.inneractive.sdk.model.vast.b bVar = ((com.fyber.inneractive.sdk.player.n) fVar).f23314p;
                    g0Var.a(bVar != null ? bVar.f21162b : null, g1Var, true);
                    com.fyber.inneractive.sdk.player.n nVar = (com.fyber.inneractive.sdk.player.n) this.f21547a;
                    nVar.a(nVar.f23314p, videoClickOrigin, com.fyber.inneractive.sdk.model.vast.x.EVENT_CLICK);
                }
            } else {
                int i10 = y.f21546b[videoClickOrigin.ordinal()];
                if (i10 == 1) {
                    gVar = com.fyber.inneractive.sdk.util.g.STORE_PROMO_CTA;
                } else if (i10 == 2) {
                    gVar = com.fyber.inneractive.sdk.util.g.VIDEO_CLICK;
                } else if (i10 != 3) {
                    gVar = com.fyber.inneractive.sdk.util.g.VIDEO_CTA;
                } else {
                    gVar = com.fyber.inneractive.sdk.util.g.VIDEO_APP_INFO;
                }
                com.fyber.inneractive.sdk.util.d0 d0VarA = this.f21553g.a(g1Var, gVar);
                com.fyber.inneractive.sdk.player.f fVar2 = this.f21547a;
                if (fVar2 != null) {
                    com.fyber.inneractive.sdk.player.n nVar2 = (com.fyber.inneractive.sdk.player.n) fVar2;
                    nVar2.a(nVar2.f23314p, videoClickOrigin, com.fyber.inneractive.sdk.model.vast.x.EVENT_CLICK);
                    com.fyber.inneractive.sdk.measurement.f fVar3 = this.f21547a.f23256e;
                    if (fVar3 != null && fVar3.f21106c != null) {
                        IAlog.a("%s click", "OMVideo");
                        try {
                            fVar3.f21106c.adUserInteraction(InteractionType.CLICK);
                        } catch (Throwable th2) {
                            fVar3.a(th2);
                        }
                    }
                }
                if (d0VarA.f23861a == com.fyber.inneractive.sdk.util.g0.FAILED) {
                }
            }
            z11 = false;
        }
        if (videoClickOrigin == VideoClickOrigin.VIDEO) {
            a(w0.VIDEO.a());
        }
        return z11;
    }

    public final boolean a(com.fyber.inneractive.sdk.flow.storepromo.observer.a aVar) {
        com.fyber.inneractive.sdk.flow.storepromo.b bVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f21547a;
        if (fVar != null && (bVar = ((com.fyber.inneractive.sdk.player.n) fVar).f23320v) != null) {
            bVar.getClass();
            synchronized (com.fyber.inneractive.sdk.flow.storepromo.b.f20872k) {
                bVar.f20880h.add(aVar);
            }
            return true;
        }
        IAlog.f("Unable to add store promo observer, promo manager is unavailable", new Object[0]);
        return false;
    }
}
