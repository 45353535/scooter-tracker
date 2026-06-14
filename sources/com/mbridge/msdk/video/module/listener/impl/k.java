package com.mbridge.msdk.video.module.listener.impl;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class k extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected boolean f52762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected CampaignEx f52763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected List<CampaignEx> f52764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected boolean f52765d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected com.mbridge.msdk.videocommon.download.a f52766e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected com.mbridge.msdk.videocommon.entity.c f52767f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected String f52768g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected String f52769h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected com.mbridge.msdk.video.module.listener.a f52770i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected int f52771j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f52772k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f52773l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f52774m = false;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                k kVar = k.this;
                if (!kVar.f52762a || kVar.f52763b == null || !a1.b(kVar.f52768g) || com.mbridge.msdk.foundation.controller.c.n().d() == null) {
                    return;
                }
                com.mbridge.msdk.foundation.db.i iVarA = com.mbridge.msdk.foundation.db.i.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
                com.mbridge.msdk.foundation.entity.f fVar = new com.mbridge.msdk.foundation.entity.f();
                fVar.a(System.currentTimeMillis());
                fVar.b(k.this.f52768g);
                fVar.a(k.this.f52763b.getId());
                iVarA.a(fVar);
            } catch (Throwable th2) {
                q0.b("NotifyListener", th2.getMessage(), th2);
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                k kVar = k.this;
                if (kVar.f52762a && kVar.f52763b != null && a1.b(kVar.f52768g)) {
                    com.mbridge.msdk.videocommon.cache.a aVarA = com.mbridge.msdk.videocommon.cache.a.a();
                    k kVar2 = k.this;
                    aVarA.a(kVar2.f52763b, kVar2.f52768g);
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
            try {
                com.mbridge.msdk.videocommon.cache.a aVarA2 = com.mbridge.msdk.videocommon.cache.a.a();
                k kVar3 = k.this;
                aVarA2.b(kVar3.f52769h, kVar3.f52763b.getAdType());
            } catch (Exception e11) {
                if (MBridgeConstans.DEBUG) {
                    e11.printStackTrace();
                }
            } catch (Throwable th2) {
                q0.a("NotifyListener", th2.getMessage());
            }
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d())).b(k.this.f52763b.getId());
            } catch (Throwable th2) {
                q0.b("NotifyListener", th2.getMessage(), th2);
            }
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.videocommon.download.a aVar;
            try {
                if (s0.a().a("c_r_v_f_w_s_e", false)) {
                    return;
                }
                k kVar = k.this;
                if (!kVar.f52762a || (aVar = kVar.f52766e) == null) {
                    return;
                }
                if (aVar.h() != null && !TextUtils.isEmpty(k.this.f52766e.h().getVideoUrlEncode())) {
                    com.mbridge.msdk.foundation.db.m.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d())).a(k.this.f52766e.h().getVideoUrlEncode());
                }
                if (TextUtils.isEmpty(k.this.f52766e.p())) {
                    return;
                }
                File file = new File(k.this.f52766e.p());
                if (file.exists() && file.isFile() && file.delete()) {
                    q0.a("NotifyListener", "DEL File :" + file.getAbsolutePath());
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public k(CampaignEx campaignEx, com.mbridge.msdk.videocommon.download.a aVar, com.mbridge.msdk.videocommon.entity.c cVar, String str, String str2, com.mbridge.msdk.video.module.listener.a aVar2, int i10, boolean z10) {
        this.f52765d = false;
        this.f52770i = new f();
        this.f52771j = 1;
        if (!z10 && campaignEx != null && a1.b(str2) && aVar != null && aVar2 != null) {
            this.f52763b = campaignEx;
            this.f52769h = str;
            this.f52768g = str2;
            this.f52766e = aVar;
            this.f52767f = cVar;
            this.f52770i = aVar2;
            this.f52762a = true;
            this.f52771j = i10;
            this.f52765d = false;
            return;
        }
        if (!z10 || campaignEx == null || !a1.b(str2) || aVar2 == null) {
            return;
        }
        this.f52763b = campaignEx;
        this.f52769h = str;
        this.f52768g = str2;
        this.f52766e = aVar;
        this.f52767f = cVar;
        this.f52770i = aVar2;
        this.f52762a = true;
        this.f52771j = i10;
        this.f52765d = true;
    }

    private void d() {
        if (!this.f52762a || com.mbridge.msdk.foundation.same.buffer.b.f48630k == null || TextUtils.isEmpty(this.f52763b.getId())) {
            return;
        }
        com.mbridge.msdk.foundation.same.buffer.b.a(this.f52768g, this.f52763b, "reward");
    }

    private void f() {
        if (this.f52763b != null) {
            try {
                HashMap map = new HashMap();
                List<com.mbridge.msdk.foundation.entity.d> listA = com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(this.f52763b.getCampaignUnitId(), this.f52763b.getRequestId());
                if (listA == null || listA.size() <= 0 || listA.get(0) == null) {
                    return;
                }
                if (listA.get(0).c() == 1) {
                    map.put("encrypt_p=", "encrypt_p=" + listA.get(0).b());
                    map.put("irlfa=", "irlfa=1");
                    for (Map.Entry entry : map.entrySet()) {
                        String str = (String) entry.getKey();
                        String str2 = (String) entry.getValue();
                        CampaignEx campaignEx = this.f52763b;
                        campaignEx.setImpressionURL(campaignEx.getImpressionURL().replaceAll(str, str2));
                        CampaignEx campaignEx2 = this.f52763b;
                        campaignEx2.setOnlyImpressionURL(campaignEx2.getOnlyImpressionURL().replaceAll(str, str2));
                    }
                }
                q0.a("BidReplaceCampignDao", "removeReplace count " + com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(this.f52763b.getRequestId()));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    private void m() {
        new Thread(new c()).start();
    }

    public void a(CampaignEx campaignEx) {
        this.f52763b = campaignEx;
    }

    public void b(int i10) {
        if (this.f52763b != null) {
            if (i10 == 1 || i10 == 2) {
                com.mbridge.msdk.video.module.report.b.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f52763b, i10, this.f52771j);
            }
        }
    }

    public void c() {
        a aVar = new a();
        if (com.mbridge.msdk.foundation.controller.d.a().e()) {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(aVar);
        } else {
            aVar.run();
        }
    }

    protected void e() {
        d dVar = new d();
        if (com.mbridge.msdk.foundation.controller.d.a().e()) {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(dVar);
        } else {
            dVar.run();
        }
    }

    public void g() {
        if (!this.f52762a || this.f52763b == null) {
            return;
        }
        com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n("2000061", this.f52763b.getId(), this.f52763b.getRequestId(), this.f52763b.getRequestIdNotice(), this.f52768g, m0.s(com.mbridge.msdk.foundation.controller.c.n().d()));
        nVar.b(this.f52763b.isMraid() ? com.mbridge.msdk.foundation.entity.n.N : com.mbridge.msdk.foundation.entity.n.O);
        com.mbridge.msdk.foundation.same.report.g.b(nVar, com.mbridge.msdk.foundation.controller.c.n().d(), this.f52768g);
    }

    protected void h() {
        String str;
        try {
            if (!this.f52762a || this.f52772k || TextUtils.isEmpty(this.f52763b.getImpressionURL())) {
                return;
            }
            this.f52772k = true;
            if (this.f52763b.isBidCampaign()) {
                f();
            }
            String impressionURL = this.f52763b.getImpressionURL();
            if (this.f52763b.getSpareOfferFlag() == 1) {
                str = impressionURL + "&to=1&cbt=" + this.f52763b.getCbt() + "&tmorl=" + this.f52771j;
            } else {
                str = impressionURL + "&to=0&cbt=" + this.f52763b.getCbt() + "&tmorl=" + this.f52771j;
            }
            com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f52763b, this.f52768g, str, false, true, com.mbridge.msdk.click.retry.a.f46603m);
            com.mbridge.msdk.video.module.report.b.d(com.mbridge.msdk.foundation.controller.c.n().d(), this.f52763b);
            m();
            d();
        } catch (Throwable th2) {
            q0.b("NotifyListener", th2.getMessage(), th2);
        }
    }

    protected void i() {
        CampaignEx campaignEx;
        Map<String, Long> map;
        String str;
        try {
            CampaignEx campaignEx2 = this.f52763b;
            if (campaignEx2 != null && campaignEx2.isDynamicView() && this.f52765d && !this.f52763b.isCampaignIsFiltered()) {
                this.f52773l = true;
                return;
            }
            if (!this.f52762a || (campaignEx = this.f52763b) == null || TextUtils.isEmpty(campaignEx.getOnlyImpressionURL()) || (map = com.mbridge.msdk.foundation.same.buffer.b.f48631l) == null || map.containsKey(this.f52763b.getOnlyImpressionURL()) || this.f52773l) {
                return;
            }
            com.mbridge.msdk.foundation.same.buffer.b.f48631l.put(this.f52763b.getOnlyImpressionURL(), Long.valueOf(System.currentTimeMillis()));
            String onlyImpressionURL = this.f52763b.getOnlyImpressionURL();
            if (this.f52763b.getSpareOfferFlag() == 1) {
                str = onlyImpressionURL + "&to=1&cbt=" + this.f52763b.getCbt() + "&tmorl=" + this.f52771j;
            } else {
                str = onlyImpressionURL + "&to=0&cbt=" + this.f52763b.getCbt() + "&tmorl=" + this.f52771j;
            }
            String str2 = str;
            if (!this.f52765d || this.f52763b.isCampaignIsFiltered()) {
                com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f52763b, this.f52768g, str2, false, true, com.mbridge.msdk.click.retry.a.f46604n);
                b();
            }
            this.f52773l = true;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    protected void j() {
        CampaignEx campaignEx;
        List<String> pv_urls;
        try {
            if (!this.f52762a || this.f52774m || (campaignEx = this.f52763b) == null) {
                return;
            }
            this.f52774m = true;
            if ((campaignEx.isDynamicView() && this.f52765d && !this.f52763b.isCampaignIsFiltered()) || (pv_urls = this.f52763b.getPv_urls()) == null || pv_urls.size() <= 0) {
                return;
            }
            Iterator<String> it = pv_urls.iterator();
            while (it.hasNext()) {
                com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f52763b, this.f52768g, it.next(), false, true);
            }
        } catch (Throwable th2) {
            q0.b("NotifyListener", th2.getMessage());
        }
    }

    protected void k() {
        CampaignEx campaignEx = this.f52763b;
        if (campaignEx == null || TextUtils.isEmpty(campaignEx.getCampaignUnitId()) || this.f52763b.getNativeVideoTracking() == null || this.f52763b.getNativeVideoTracking().n() == null) {
            return;
        }
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        CampaignEx campaignEx2 = this.f52763b;
        com.mbridge.msdk.click.a.a(contextD, campaignEx2, campaignEx2.getCampaignUnitId(), this.f52763b.getNativeVideoTracking().n(), false, false);
    }

    protected void l() {
        com.mbridge.msdk.videocommon.download.a aVar = this.f52766e;
        if (aVar != null) {
            aVar.d(true);
        }
    }

    public void a(List<CampaignEx> list) {
        this.f52764c = list;
    }

    @Override // com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
    public void a(int i10, Object obj) {
        super.a(i10, obj);
        this.f52770i.a(i10, obj);
    }

    public void b() {
        try {
            b bVar = new b();
            if (com.mbridge.msdk.foundation.controller.d.a().e()) {
                com.mbridge.msdk.foundation.same.threadpool.a.b().execute(bVar);
            } else {
                bVar.run();
            }
        } catch (Throwable th2) {
            q0.b("NotifyListener", th2.getMessage(), th2);
        }
    }

    public void a(int i10, String str) {
        if (this.f52763b != null) {
            com.mbridge.msdk.foundation.same.report.g.c(new com.mbridge.msdk.foundation.entity.n("2000062", this.f52763b.getId(), this.f52763b.getRequestId(), this.f52763b.getRequestIdNotice(), this.f52768g, m0.s(com.mbridge.msdk.foundation.controller.c.n().d()), i10, str), com.mbridge.msdk.foundation.controller.c.n().d(), this.f52768g);
        }
    }

    protected void b(String str) {
        try {
            if (this.f52763b != null) {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("url", this.f52763b.getVideoUrlEncode());
                eVar.a("reason", str);
                String noticeUrl = this.f52763b.getNoticeUrl();
                String clickURL = this.f52763b.getClickURL();
                if (TextUtils.isEmpty(noticeUrl)) {
                    if (!TextUtils.isEmpty(clickURL)) {
                        eVar.a("offer_url", clickURL);
                    }
                } else {
                    eVar.a("offer_url", noticeUrl);
                }
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000021", this.f52763b, eVar);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void a(int i10) {
        CampaignEx campaignEx = this.f52763b;
        if (campaignEx != null) {
            String noticeUrl = campaignEx.getNoticeUrl();
            if (TextUtils.isEmpty(noticeUrl)) {
                return;
            }
            if (i10 == 1 || i10 == 2) {
                if (!noticeUrl.contains("endscreen_type")) {
                    StringBuilder sb2 = new StringBuilder(noticeUrl);
                    if (noticeUrl.contains("?")) {
                        sb2.append("&endscreen_type=");
                        sb2.append(i10);
                    } else {
                        sb2.append("?endscreen_type=");
                        sb2.append(i10);
                    }
                    noticeUrl = sb2.toString();
                } else if (i10 == 2) {
                    if (noticeUrl.contains("endscreen_type=1")) {
                        noticeUrl = noticeUrl.replace("endscreen_type=1", "endscreen_type=2");
                    }
                } else if (noticeUrl.contains("endscreen_type=2")) {
                    noticeUrl = noticeUrl.replace("endscreen_type=2", "endscreen_type=1");
                }
                this.f52763b.setNoticeUrl(noticeUrl);
            }
        }
    }

    protected void a() {
        com.mbridge.msdk.videocommon.download.b.getInstance().a(false);
    }

    protected void a(String str) {
        List<CampaignEx> list;
        if (this.f52763b == null || (list = this.f52764c) == null || list.size() == 0 || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("camp_position")) {
                this.f52763b = this.f52764c.get(jSONObject.getInt("camp_position"));
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("NotifyListener", e10.getMessage());
            }
        }
    }
}
