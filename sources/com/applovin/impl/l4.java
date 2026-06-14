package com.applovin.impl;

import android.text.TextUtils;
import android.webkit.WebView;
import com.applovin.impl.sdk.utils.StringUtils;
import com.iab.omid.library.applovin.adsession.AdSession;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.CreativeType;
import com.iab.omid.library.applovin.adsession.ImpressionType;
import com.iab.omid.library.applovin.adsession.Owner;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import com.iab.omid.library.applovin.adsession.media.InteractionType;
import com.iab.omid.library.applovin.adsession.media.MediaEvents;
import com.iab.omid.library.applovin.adsession.media.Position;
import com.iab.omid.library.applovin.adsession.media.VastProperties;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class l4 extends f4 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final /* synthetic */ boolean f9237p = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final o7 f9238h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f9239i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MediaEvents f9240j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final VastProperties f9241k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final AtomicBoolean f9242l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final AtomicBoolean f9243m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AtomicBoolean f9244n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final AtomicBoolean f9245o;

    public l4(o7 o7Var) {
        super(o7Var);
        this.f9239i = new AtomicBoolean();
        this.f9242l = new AtomicBoolean();
        this.f9243m = new AtomicBoolean();
        this.f9244n = new AtomicBoolean();
        this.f9245o = new AtomicBoolean();
        this.f9238h = o7Var;
        float fM1 = o7Var.m1();
        if (o7Var.m1() == -1) {
            this.f9241k = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
        } else {
            this.f9241k = VastProperties.createVastPropertiesForSkippableMedia(fM1, true, Position.STANDALONE);
        }
    }

    public void A() {
        b("track resumed", new Runnable() { // from class: com.applovin.impl.vb
            @Override // java.lang.Runnable
            public final void run() {
                this.f11146b.s();
            }
        });
    }

    public void B() {
        b("track skipped", new Runnable() { // from class: com.applovin.impl.zb
            @Override // java.lang.Runnable
            public final void run() {
                this.f11660b.t();
            }
        });
    }

    public void C() {
        if (this.f9245o.compareAndSet(false, true)) {
            b("track third quartile", new Runnable() { // from class: com.applovin.impl.tb
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11028b.u();
                }
            });
        }
    }

    @Override // com.applovin.impl.f4
    protected AdSessionContext a(WebView webView) {
        if (!f9237p && this.f9238h.e1() == null) {
            throw new AssertionError();
        }
        ArrayList arrayList = new ArrayList();
        for (p7 p7Var : this.f9238h.e1().b()) {
            List<v7> listC = p7Var.c();
            if (listC.isEmpty()) {
                a8.a(p7Var.b(), t7.FAILED_TO_LOAD_RESOURCE, this.f8833b);
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (v7 v7Var : listC) {
                    if ("omid".equalsIgnoreCase(v7Var.b())) {
                        arrayList2.add(v7Var);
                    }
                }
                if (arrayList2.isEmpty()) {
                    a8.a(p7Var.b(), t7.API_FRAMEWORK_OR_LANGUAGE_TYPE_NOT_SUPPORTED, this.f8833b);
                } else {
                    ArrayList<URL> arrayList3 = new ArrayList();
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        try {
                            arrayList3.add(new URL(((v7) it.next()).c()));
                        } catch (Throwable th2) {
                            if (com.applovin.impl.sdk.o.a()) {
                                this.f8834c.a(this.f8835d, "Failed to parse JavaScript resource url", th2);
                            }
                        }
                    }
                    if (arrayList3.isEmpty()) {
                        a8.a(p7Var.b(), t7.FAILED_TO_LOAD_RESOURCE, this.f8833b);
                    } else {
                        String strE = p7Var.e();
                        String strD = p7Var.d();
                        if (!StringUtils.isValidString(strE) || StringUtils.isValidString(strD)) {
                            for (URL url : arrayList3) {
                                arrayList.add(StringUtils.isValidString(strE) ? VerificationScriptResource.createVerificationScriptResourceWithParameters(strD, url, strE) : VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url));
                            }
                        } else {
                            a8.a(p7Var.b(), t7.FAILED_TO_LOAD_RESOURCE, this.f8833b);
                        }
                    }
                }
            }
        }
        String strA = this.f8833b.e0().a();
        if (TextUtils.isEmpty(strA)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8834c.b(this.f8835d, "JavaScript SDK content not loaded successfully");
            }
            return null;
        }
        try {
            return AdSessionContext.createNativeAdSessionContext(this.f8833b.e0().b(), strA, arrayList, this.f9238h.getOpenMeasurementContentUrl(), this.f9238h.getOpenMeasurementCustomReferenceData());
        } catch (Throwable th3) {
            if (!com.applovin.impl.sdk.o.a()) {
                return null;
            }
            this.f8834c.a(this.f8835d, "Failed to create ad session context", th3);
            return null;
        }
    }

    public void b(final float f10, final boolean z10) {
        if (this.f9242l.compareAndSet(false, true)) {
            b("track started", new Runnable() { // from class: com.applovin.impl.qb
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10249b.a(f10, z10);
                }
            });
        }
    }

    @Override // com.applovin.impl.f4
    public void h() {
        b("track loaded", new Runnable() { // from class: com.applovin.impl.wb
            @Override // java.lang.Runnable
            public final void run() {
                this.f11235b.p();
            }
        });
    }

    public void v() {
        b("track clicked", new Runnable() { // from class: com.applovin.impl.bc
            @Override // java.lang.Runnable
            public final void run() {
                this.f8463b.m();
            }
        });
    }

    public void w() {
        b("track completed", new Runnable() { // from class: com.applovin.impl.sb
            @Override // java.lang.Runnable
            public final void run() {
                this.f10427b.n();
            }
        });
    }

    public void x() {
        if (this.f9243m.compareAndSet(false, true)) {
            b("track first quartile", new Runnable() { // from class: com.applovin.impl.ub
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11087b.o();
                }
            });
        }
    }

    public void y() {
        if (this.f9244n.compareAndSet(false, true)) {
            b("track midpoint", new Runnable() { // from class: com.applovin.impl.ac
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8243b.q();
                }
            });
        }
    }

    public void z() {
        b("track paused", new Runnable() { // from class: com.applovin.impl.xb
            @Override // java.lang.Runnable
            public final void run() {
                this.f11487b.r();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k() {
        this.f9240j.bufferFinish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l() {
        this.f9240j.bufferStart();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m() {
        this.f9240j.adUserInteraction(InteractionType.CLICK);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n() {
        this.f9240j.complete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o() {
        this.f9240j.firstQuartile();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p() {
        this.f8838g.loaded(this.f9241k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q() {
        this.f9240j.midpoint();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r() {
        this.f9240j.pause();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s() {
        this.f9240j.resume();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t() {
        this.f9240j.skipped();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u() {
        this.f9240j.thirdQuartile();
    }

    public void i() {
        if (this.f9239i.compareAndSet(true, false)) {
            b("buffer finished", new Runnable() { // from class: com.applovin.impl.pb
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10129b.k();
                }
            });
        }
    }

    public void j() {
        if (this.f9239i.compareAndSet(false, true)) {
            b("buffer started", new Runnable() { // from class: com.applovin.impl.yb
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11564b.l();
                }
            });
        }
    }

    public void b(final boolean z10) {
        b("track volume changed", new Runnable() { // from class: com.applovin.impl.rb
            @Override // java.lang.Runnable
            public final void run() {
                this.f10364b.a(z10);
            }
        });
    }

    @Override // com.applovin.impl.f4
    protected AdSessionConfiguration a() {
        try {
            CreativeType creativeType = CreativeType.VIDEO;
            ImpressionType impressionType = ImpressionType.BEGIN_TO_RENDER;
            Owner owner = Owner.NATIVE;
            return AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false);
        } catch (Throwable th2) {
            if (!com.applovin.impl.sdk.o.a()) {
                return null;
            }
            this.f8834c.a(this.f8835d, "Failed to create ad session configuration", th2);
            return null;
        }
    }

    @Override // com.applovin.impl.f4
    protected void a(AdSession adSession) {
        try {
            this.f9240j = MediaEvents.createMediaEvents(adSession);
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8834c.a(this.f8835d, "Failed to create media events", th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(float f10, boolean z10) {
        this.f9240j.start(f10, z10 ? 0.0f : 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z10) {
        this.f9240j.volumeChange(z10 ? 0.0f : 1.0f);
    }
}
