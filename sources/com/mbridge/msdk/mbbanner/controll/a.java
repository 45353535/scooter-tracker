package com.mbridge.msdk.mbbanner.controll;

import android.text.TextUtils;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.report.metrics.e;
import com.mbridge.msdk.foundation.tools.e1;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbbanner.common.manager.c;
import com.mbridge.msdk.out.BannerAdListener;
import com.mbridge.msdk.out.BannerSize;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.setting.j;
import com.mbridge.msdk.setting.l;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static String f49435x = "BannerController";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f49436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f49437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f49438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private MBridgeIds f49439d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f49440e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f49441f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private MBBannerView f49442g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f49443h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f49444i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f49445j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private BannerAdListener f49447l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private CampaignUnit f49448m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private c f49449n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private l f49450o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private j f49451p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f49452q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f49453r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f49454s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f49455t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f49456u;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f49446k = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.listener.c f49457v = new C0533a();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.listener.b f49458w = new b();

    public a(MBBannerView mBBannerView, BannerSize bannerSize, String str, String str2) {
        this.f49442g = mBBannerView;
        if (bannerSize != null) {
            this.f49443h = bannerSize.getHeight();
            this.f49444i = bannerSize.getWidth();
        }
        this.f49436a = str2;
        str = TextUtils.isEmpty(str) ? "" : str;
        this.f49437b = str;
        this.f49439d = new MBridgeIds(str, this.f49436a);
        f();
    }

    private int a(int i10) {
        if (i10 > 0) {
            if (i10 < 10) {
                return 10;
            }
            if (i10 > 180) {
                return 180;
            }
        }
        return i10;
    }

    private void l() {
        l lVarE = h.b().e(com.mbridge.msdk.foundation.controller.c.n().b(), this.f49436a);
        this.f49450o = lVarE;
        if (lVarE == null) {
            this.f49450o = l.i(this.f49436a);
        }
        if (this.f49446k == -1) {
            this.f49445j = a(this.f49450o.D());
        }
        if (this.f49441f == 0) {
            boolean z10 = this.f49450o.g() == 1;
            this.f49440e = z10;
            c cVar = this.f49449n;
            if (cVar != null) {
                cVar.c(z10);
            }
        }
    }

    class b implements com.mbridge.msdk.mbbanner.common.listener.b {
        b() {
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.b
        public void a(String str, CampaignUnit campaignUnit, boolean z10) {
            a.this.f49448m = campaignUnit;
            a.this.a(1, (com.mbridge.msdk.foundation.error.b) null);
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.b
        public void b(com.mbridge.msdk.foundation.error.b bVar) {
            a.this.a(bVar.k(), bVar);
            a.this.c();
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.b
        public void a(com.mbridge.msdk.foundation.error.b bVar) {
            a.this.a(2, bVar);
            a.this.a(bVar.k(), bVar);
            a.this.c();
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.b
        public void a(String str, int i10, boolean z10) {
            if (a.this.f49442g != null) {
                a.this.f49455t = true;
                a.this.j();
            }
        }
    }

    private boolean a(View view) {
        return true;
    }

    private void f() {
        b(com.mbridge.msdk.foundation.controller.c.n().b(), com.mbridge.msdk.foundation.controller.c.n().c());
        l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (this.f49454s || !this.f49455t) {
            return;
        }
        if (!a(this.f49442g)) {
            a(new com.mbridge.msdk.foundation.error.b(880044));
        } else if (this.f49448m != null) {
            if (this.f49449n == null) {
                this.f49449n = new c(this.f49442g, this.f49457v, this.f49437b, this.f49436a, this.f49440e, this.f49450o);
            }
            this.f49449n.a(this.f49438c);
            this.f49449n.b(this.f49452q);
            this.f49449n.d(this.f49453r);
            this.f49449n.a(this.f49440e, this.f49441f);
            this.f49449n.b(this.f49448m);
        } else {
            a(new com.mbridge.msdk.foundation.error.b(880043));
        }
        this.f49455t = false;
    }

    private void k() {
        MBBannerView mBBannerView = this.f49442g;
        if (mBBannerView != null) {
            if (!this.f49452q || !this.f49453r || this.f49456u || e1.a(mBBannerView, 1)) {
                com.mbridge.msdk.mbbanner.common.manager.a.b().a(2, this.f49437b, this.f49436a, null, null);
            } else {
                com.mbridge.msdk.mbbanner.common.manager.a.b().a(3, this.f49437b, this.f49436a, new com.mbridge.msdk.mbbanner.common.data.a(this.f49444i + "x" + this.f49443h, this.f49445j * 1000), this.f49458w);
            }
            if (this.f49452q) {
                return;
            }
            com.mbridge.msdk.mbbanner.common.manager.a.b().a(4, this.f49437b, this.f49436a, null, null);
            com.mbridge.msdk.mbbanner.common.manager.a.b().b(this.f49436a);
        }
    }

    public void c() {
        if (this.f49454s) {
            return;
        }
        k();
        l();
        com.mbridge.msdk.mbbanner.common.data.a aVar = new com.mbridge.msdk.mbbanner.common.data.a(this.f49444i + "x" + this.f49443h, this.f49445j * 1000);
        aVar.c(this.f49437b);
        aVar.a(true);
        aVar.b(com.mbridge.msdk.mbbanner.common.report.a.b(""));
        com.mbridge.msdk.mbbanner.common.manager.a.b().a(this.f49437b, this.f49436a, aVar, this.f49458w);
    }

    public String d() {
        CampaignUnit campaignUnit = this.f49448m;
        return campaignUnit != null ? com.mbridge.msdk.foundation.same.c.b(campaignUnit.getAds()) : "";
    }

    public String e() {
        CampaignUnit campaignUnit = this.f49448m;
        return (campaignUnit == null || campaignUnit.getRequestId() == null) ? "" : this.f49448m.getRequestId();
    }

    public void g() {
        com.mbridge.msdk.mbbanner.common.manager.a.b().a(4, this.f49437b, this.f49436a, new com.mbridge.msdk.mbbanner.common.data.a(this.f49444i + "x" + this.f49443h, this.f49445j * 1000), this.f49458w);
    }

    public void h() {
        com.mbridge.msdk.mbbanner.common.manager.a.b().a(3, this.f49437b, this.f49436a, new com.mbridge.msdk.mbbanner.common.data.a(this.f49444i + "x" + this.f49443h, this.f49445j * 1000), this.f49458w);
    }

    public void i() {
        this.f49454s = true;
        if (this.f49447l != null) {
            this.f49447l = null;
        }
        if (this.f49458w != null) {
            this.f49458w = null;
        }
        if (this.f49457v != null) {
            this.f49457v = null;
        }
        if (this.f49442g != null) {
            this.f49442g = null;
        }
        com.mbridge.msdk.mbbanner.common.manager.a.b().a(4, this.f49437b, this.f49436a, null, null);
        com.mbridge.msdk.mbbanner.common.manager.a.b().b(this.f49436a);
        com.mbridge.msdk.mbbanner.common.manager.a.b().c();
        c cVar = this.f49449n;
        if (cVar != null) {
            cVar.h();
        }
    }

    public void b(int i10) {
        int iA = a(i10);
        this.f49446k = iA;
        this.f49445j = iA;
    }

    private void b(String str, String str2) {
        if (this.f49451p == null) {
            this.f49451p = new j();
        }
        this.f49451p.a(com.mbridge.msdk.foundation.controller.c.n().d(), str, str2, this.f49436a);
    }

    public void b(boolean z10) {
        this.f49452q = z10;
        b();
        j();
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.controll.a$a, reason: collision with other inner class name */
    class C0533a implements com.mbridge.msdk.mbbanner.common.listener.c {
        C0533a() {
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.c
        public void a(List<CampaignEx> list) {
            q0.b(a.f49435x, "onShowSuccessed:");
            if (a.this.f49447l != null) {
                a.this.f49447l.onLoadSuccessed(a.this.f49439d);
            }
            try {
                com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(a.this.f49436a, list.get(0).getLocalRequestId());
                cVarA.b(list);
                cVarA.g(1);
                cVarA.d(TextUtils.isEmpty(list.get(0).getBannerUrl()) ? 2 : 1);
                com.mbridge.msdk.mbbanner.common.report.a.a("2000048", cVarA, (e) null);
            } catch (Exception e10) {
                q0.b(a.f49435x, e10.getMessage());
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.c
        public void b() {
            if (a.this.f49447l != null) {
                a.this.f49447l.onCloseBanner(a.this.f49439d);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.c
        public void c() {
            if (a.this.f49447l != null) {
                a.this.f49447l.onClick(a.this.f49439d);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.c
        public void d() {
            if (a.this.f49447l != null) {
                a.this.f49447l.closeFullScreen(a.this.f49439d);
                a.this.f49456u = false;
                com.mbridge.msdk.mbbanner.common.manager.a.b().a(3, a.this.f49437b, a.this.f49436a, new com.mbridge.msdk.mbbanner.common.data.a(a.this.f49444i + "x" + a.this.f49443h, a.this.f49445j * 1000), a.this.f49458w);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.c
        public void onLeaveApp() {
            if (a.this.f49447l != null) {
                a.this.f49447l.onLeaveApp(a.this.f49439d);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.c
        public void a(CampaignEx campaignEx) {
            a.this.c();
            if (a.this.f49447l != null) {
                a.this.f49447l.onLogImpression(a.this.f49439d);
            }
            try {
                com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(a.this.f49436a, campaignEx.getLocalRequestId());
                cVarA.a(campaignEx);
                cVarA.h(campaignEx.isBidCampaign() ? "1" : "0");
                int i10 = 1;
                cVarA.g(a.this.f49449n != null ? a.this.f49449n.c() : 1);
                if (a.this.f49445j != 0) {
                    i10 = 2;
                }
                cVarA.b(i10);
                cVarA.c(a.this.f49445j);
                com.mbridge.msdk.mbbanner.common.report.a.a("2000128", cVarA, (e) null);
                com.mbridge.msdk.mbbanner.common.report.a.a("2000130", cVarA, (e) null);
            } catch (Exception e10) {
                q0.b(a.f49435x, e10.getMessage());
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.c
        public void a(com.mbridge.msdk.foundation.error.b bVar) {
            a.this.a(bVar);
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.c
        public void a() {
            if (a.this.f49447l != null) {
                a.this.f49447l.showFullScreen(a.this.f49439d);
                a.this.f49456u = true;
                com.mbridge.msdk.mbbanner.common.manager.a.b().a(2, a.this.f49437b, a.this.f49436a, null, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, com.mbridge.msdk.foundation.error.b bVar) {
        CampaignUnit campaignUnit;
        String strL = "";
        if (bVar != null) {
            try {
                strL = bVar.l();
                if (TextUtils.isEmpty(str)) {
                    str = bVar.k();
                }
            } catch (Throwable th2) {
                q0.b(f49435x, th2.getMessage());
            }
        }
        if (TextUtils.isEmpty(str) && (campaignUnit = this.f49448m) != null) {
            str = campaignUnit.getLocalRequestId();
        }
        com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(this.f49436a, str);
        CampaignUnit campaignUnit2 = this.f49448m;
        cVarA.b(campaignUnit2 != null ? campaignUnit2.getAds() : null);
        cVarA.a(bVar);
        CampaignUnit campaignUnit3 = this.f49448m;
        if (campaignUnit3 != null && !campaignUnit3.getAds().isEmpty()) {
            cVarA.d(TextUtils.isEmpty(this.f49448m.getAds().get(0).getBannerUrl()) ? 1 : 2);
        }
        cVarA.b(true);
        com.mbridge.msdk.mbbanner.common.report.a.a("2000047", cVarA, (e) null);
        BannerAdListener bannerAdListener = this.f49447l;
        if (bannerAdListener != null) {
            bannerAdListener.onLoadFailed(this.f49439d, strL);
        }
    }

    public void b() {
        k();
        c cVar = this.f49449n;
        if (cVar != null) {
            cVar.b(this.f49452q);
            this.f49449n.d(this.f49453r);
        }
    }

    public void c(boolean z10) {
        this.f49453r = z10;
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, com.mbridge.msdk.foundation.error.b bVar) {
        try {
            com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(this.f49436a, bVar == null ? this.f49448m.getLocalRequestId() : bVar.k());
            e eVar = new e();
            eVar.a("result", Integer.valueOf(i10));
            CampaignUnit campaignUnit = this.f49448m;
            if (campaignUnit != null && !campaignUnit.getAds().isEmpty()) {
                CampaignEx campaignEx = this.f49448m.getAds().get(0);
                if (campaignEx != null) {
                    cVarA.d(TextUtils.isEmpty(campaignEx.getBannerUrl()) ? 2 : 1);
                }
                cVarA.b(this.f49448m.getAds());
            }
            if (bVar != null) {
                cVarA.a(bVar);
            }
            com.mbridge.msdk.mbbanner.common.report.a.a("2000126", cVarA, eVar);
        } catch (Exception e10) {
            q0.b(f49435x, e10.getMessage());
        }
    }

    public void a(BannerSize bannerSize) {
        if (bannerSize != null) {
            this.f49443h = bannerSize.getHeight();
            this.f49444i = bannerSize.getWidth();
        }
    }

    public void a(boolean z10) {
        this.f49440e = z10;
        this.f49441f = z10 ? 1 : 2;
    }

    public void a(String str, String str2) {
        boolean zB;
        if (this.f49443h >= 1 && this.f49444i >= 1) {
            try {
                zB = com.mbridge.msdk.mbsignalcommon.webEnvCheck.a.b(com.mbridge.msdk.foundation.controller.c.n().d());
            } catch (Exception e10) {
                q0.b(f49435x, e10.getMessage());
                zB = false;
            }
            if (!zB) {
                a(str2, new com.mbridge.msdk.foundation.error.b(880029));
                return;
            }
            this.f49438c = str2;
            com.mbridge.msdk.mbbanner.common.data.a aVar = new com.mbridge.msdk.mbbanner.common.data.a(this.f49444i + "x" + this.f49443h, this.f49445j * 1000);
            aVar.a(str);
            aVar.c(this.f49437b);
            aVar.b(str2);
            com.mbridge.msdk.mbbanner.common.manager.a.b().b(this.f49437b, this.f49436a, aVar, this.f49458w);
            com.mbridge.msdk.mbbanner.common.manager.a.b().a(1, this.f49437b, this.f49436a, aVar, this.f49458w);
            return;
        }
        a(str2, new com.mbridge.msdk.foundation.error.b(880037));
    }

    public void a(BannerAdListener bannerAdListener) {
        this.f49447l = bannerAdListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.foundation.error.b bVar) {
        a(this.f49438c, bVar);
        if (bVar.g() != 880044) {
            c();
        }
    }

    public void a(int i10, int i11, int i12, int i13) {
        c cVar = this.f49449n;
        if (cVar != null) {
            cVar.a(i10, i11, i12, i13);
        }
    }
}
