package com.mbridge.msdk.reward.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.cache.a;
import com.mbridge.msdk.foundation.db.j;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.download.download.ResDownloadCheckManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.c;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.reward.adapter.b;
import com.mbridge.msdk.reward.controller.a;
import com.mbridge.msdk.reward.player.MBRewardVideoActivity;
import com.mbridge.msdk.videocommon.a;
import com.taurusx.tax.w.s.s;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class c {
    private String C;
    private h D;
    public String K;
    private List<CampaignEx> V;
    private CopyOnWriteArrayList<CampaignEx> W;
    private List<CampaignEx> X;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f50245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f50246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f50247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f50248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f50249e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f50250f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f50251g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f50252h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.video.bt.module.orglistener.h f50253i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile com.mbridge.msdk.reward.adapter.a f50254j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile a.j f50255k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.setting.c f50256l;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f50262r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f50263s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f50265u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f50266v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f50267w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f50268x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private CampaignUnit f50269y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f50270z;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f50257m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f50258n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f50259o = new Object();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f50260p = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f50261q = 2;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f50264t = "";
    private boolean A = false;
    private long B = 0;
    private boolean E = false;
    private boolean F = false;
    public String G = "";
    public String H = "";
    public String I = "";
    public int J = 0;
    private Handler L = new a(Looper.getMainLooper());
    private boolean M = false;
    private long N = 0;
    volatile boolean O = false;
    volatile boolean P = false;
    volatile boolean Q = false;
    volatile boolean R = false;
    volatile boolean S = false;
    public volatile boolean T = false;
    private String U = "";

    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        /* JADX WARN: Removed duplicated region for block: B:91:0x022f  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x0231  */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void handleMessage(android.os.Message r18) {
            /*
                Method dump skipped, instruction units count: 1234
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.c.a.handleMessage(android.os.Message):void");
        }
    }

    class b extends com.mbridge.msdk.reward.request.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.foundation.same.report.metrics.c f50272e;

        b(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            this.f50272e = cVar;
        }

        @Override // com.mbridge.msdk.reward.request.a
        public void a(CampaignUnit campaignUnit) throws Throwable {
            CampaignEx campaignEx;
            try {
                c.this.c(campaignUnit);
                c.this.a(campaignUnit);
                if (campaignUnit != null) {
                    c.this.G = campaignUnit.getRequestId();
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
                if (c.this.f50270z != null && c.this.f50270z.size() > 0 && (campaignEx = (CampaignEx) c.this.f50270z.get(0)) != null && TextUtils.isEmpty(campaignEx.getNLRid())) {
                    c.this.f50270z.clear();
                }
                if (c.this.V != null) {
                    c.this.V.clear();
                }
                c.this.O = false;
                c.this.P = false;
                synchronized (c.this.f50259o) {
                    try {
                        if (c.this.Q) {
                            c.this.Q = false;
                        }
                        c.this.S = false;
                        c.this.R = false;
                        c.this.b("exception after load success", this.f50272e);
                        c.this.n();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        @Override // com.mbridge.msdk.reward.request.a
        public void b(int i10, String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            CampaignEx campaignEx;
            if (i10 == -1) {
                c.this.B = System.currentTimeMillis();
            }
            if (c.this.f50270z != null && c.this.f50270z.size() > 0 && (campaignEx = (CampaignEx) c.this.f50270z.get(0)) != null && TextUtils.isEmpty(campaignEx.getNLRid())) {
                c.this.f50270z.clear();
            }
            if (c.this.V != null) {
                c.this.V.clear();
            }
            c.this.O = false;
            c.this.P = false;
            synchronized (c.this.f50259o) {
                try {
                    if (c.this.Q) {
                        c.this.Q = false;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            c.this.a(cVar, i10);
            c.this.S = false;
            c.this.R = false;
            if (!c.this.M) {
                c.this.a(i10, str, cVar);
            }
            c.this.n();
        }
    }

    class d implements b.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        com.mbridge.msdk.foundation.same.report.metrics.c f50295a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f50296b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f50297c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ CopyOnWriteArrayList f50298d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f50299e;

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f50301a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ com.mbridge.msdk.foundation.error.b f50302b;

            a(String str, com.mbridge.msdk.foundation.error.b bVar) {
                this.f50301a = str;
                this.f50302b = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                c cVar = c.this;
                cVar.a(cVar.f50246b, (List<CampaignEx>) c.this.V, c.this.f50263s, this.f50301a);
                if (c.this.L != null) {
                    c.this.L.removeMessages(5);
                }
                if (c.this.S || c.this.f50254j == null) {
                    return;
                }
                c.this.S = false;
                com.mbridge.msdk.foundation.error.b bVar = this.f50302b;
                if (bVar != null) {
                    bVar.c("errorCode: 3202 errorMessage: temp resource download failed");
                }
                d dVar = d.this;
                if (dVar.f50295a == null) {
                    dVar.f50295a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                }
                d dVar2 = d.this;
                dVar2.f50295a.b(dVar2.f50298d);
                d.this.f50295a.a(this.f50302b);
                c.this.f50254j.a(c.this.V, this.f50302b, d.this.f50295a);
                q0.a("RewardMVVideoAdapter", "播放模板下载失败，非大模板 onVideoLoadFail");
            }
        }

        class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f50304a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ com.mbridge.msdk.foundation.error.b f50305b;

            b(String str, com.mbridge.msdk.foundation.error.b bVar) {
                this.f50304a = str;
                this.f50305b = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                c cVar = c.this;
                cVar.a(cVar.f50246b, (List<CampaignEx>) c.this.V, c.this.f50263s, this.f50304a);
                if (c.this.L != null) {
                    c.this.L.removeMessages(5);
                }
                if (c.this.S || c.this.f50254j == null) {
                    return;
                }
                c.this.S = false;
                com.mbridge.msdk.foundation.error.b bVar = this.f50305b;
                if (bVar != null) {
                    bVar.c("errorCode: 3203 errorMessage: tpl temp resource download failed");
                }
                d dVar = d.this;
                if (dVar.f50295a == null) {
                    dVar.f50295a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                }
                d dVar2 = d.this;
                dVar2.f50295a.b(dVar2.f50298d);
                d.this.f50295a.a(this.f50305b);
                c.this.f50254j.a(c.this.V, this.f50305b, d.this.f50295a);
                q0.a("RewardMVVideoAdapter", "播放模板下载失败，大模板，nscpt 1 onVideoLoadFail");
            }
        }

        d(CampaignEx campaignEx, boolean z10, CopyOnWriteArrayList copyOnWriteArrayList, int i10) {
            this.f50296b = campaignEx;
            this.f50297c = z10;
            this.f50298d = copyOnWriteArrayList;
            this.f50299e = i10;
            this.f50295a = com.mbridge.msdk.foundation.same.report.metrics.d.b().c().get(campaignEx.getLocalRequestId());
        }

        @Override // com.mbridge.msdk.reward.adapter.b.n
        public void a(String str, String str2, String str3, String str4) {
        }

        @Override // com.mbridge.msdk.reward.adapter.b.n
        public void a(String str, String str2, com.mbridge.msdk.foundation.error.b bVar) {
            q0.a("RewardMVVideoAdapter", "template 下载失败： ");
            if (bVar != null) {
                bVar.c("errorCode: 3202 errorMessage: temp resource download failed");
            }
            if (!this.f50297c && c.this.f50254j != null && c.this.L != null) {
                q0.a("RewardMVVideoAdapter", "播放模板下载失败，非大模板");
                if (this.f50296b.getRsIgnoreCheckRule() == null || this.f50296b.getRsIgnoreCheckRule().size() <= 0 || !this.f50296b.getRsIgnoreCheckRule().contains(1)) {
                    c.this.L.post(new a(str2, bVar));
                    return;
                } else {
                    q0.c("RewardMVVideoAdapter", "template download fail but hit ignoreCheckRule");
                    return;
                }
            }
            if (this.f50299e == 1) {
                if (this.f50296b.getRsIgnoreCheckRule() != null && this.f50296b.getRsIgnoreCheckRule().size() > 0) {
                    if (this.f50296b.getRsIgnoreCheckRule().contains(3)) {
                        q0.c("RewardMVVideoAdapter", "tpl download fail but hit ignoreCheckRule");
                        return;
                    } else if (this.f50296b.getCMPTEntryUrl().equals(this.f50296b.getendcard_url()) && this.f50296b.getRsIgnoreCheckRule().contains(2)) {
                        q0.c("RewardMVVideoAdapter", "endcard download fail but hit ignoreCheckRule at 3203");
                        return;
                    }
                }
                if (c.this.f50254j == null || c.this.L == null) {
                    return;
                }
                c.this.L.post(new b(str2, bVar));
            }
        }
    }

    class f extends c.a {
        f() {
        }

        @Override // com.mbridge.msdk.foundation.same.c.a
        public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            com.mbridge.msdk.reward.report.metrics.a.a().a(str, cVar);
        }
    }

    class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignUnit f50319a;

        g(CampaignUnit campaignUnit) {
            this.f50319a = campaignUnit;
        }

        @Override // java.lang.Runnable
        public void run() {
            j.a(com.mbridge.msdk.foundation.db.g.a(c.this.f50245a)).d();
            CampaignUnit campaignUnit = this.f50319a;
            if (campaignUnit == null || campaignUnit.getAds() == null || this.f50319a.getAds().size() <= 0) {
                return;
            }
            c.this.d(this.f50319a.getAds());
        }
    }

    public class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f50321a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.mbridge.msdk.foundation.same.report.metrics.c f50322b;

        public h(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            this.f50321a = str;
            this.f50322b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (c.this.E) {
                    return;
                }
                c.this.F = true;
                if (c.this.L != null) {
                    Message messageObtainMessage = c.this.L.obtainMessage();
                    messageObtainMessage.obj = this.f50321a;
                    messageObtainMessage.what = 2;
                    if (this.f50322b != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("metrics_data_lrid", this.f50322b.t());
                        messageObtainMessage.setData(bundle);
                    }
                    c.this.L.sendMessage(messageObtainMessage);
                }
            } catch (Exception e10) {
                q0.b("RewardMVVideoAdapter", e10.getMessage());
            }
        }
    }

    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f50324a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.mbridge.msdk.foundation.same.report.metrics.c f50325b;

        public i(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            this.f50324a = str;
            this.f50325b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (com.mbridge.msdk.util.b.a()) {
                    c cVar = c.this;
                    cVar.f50265u = com.mbridge.msdk.b.a(cVar.f50246b, c.this.f50245a);
                }
                c cVar2 = c.this;
                cVar2.f50252h = v0.a(cVar2.f50245a, c.this.f50246b);
                if (c.this.F) {
                    return;
                }
                if (c.this.D != null && c.this.L != null) {
                    c.this.L.removeCallbacks(c.this.D);
                }
                c.this.E = true;
                if (c.this.L != null) {
                    Message messageObtainMessage = c.this.L.obtainMessage();
                    messageObtainMessage.obj = this.f50324a;
                    messageObtainMessage.what = 1;
                    if (this.f50325b != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("metrics_data_lrid", this.f50325b.t());
                        messageObtainMessage.setData(bundle);
                    }
                    c.this.L.sendMessage(messageObtainMessage);
                }
                if (TextUtils.isEmpty(c.this.f50252h)) {
                    return;
                }
                q0.b("RewardMVVideoAdapter", "excludeId : " + c.this.f50252h);
            } catch (Exception e10) {
                q0.b("RewardMVVideoAdapter", e10.getMessage());
            }
        }
    }

    public c(Context context, String str, String str2) {
        try {
            this.f50245a = context.getApplicationContext();
            this.f50246b = str2;
            this.f50247c = str;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private String i() {
        try {
            return a1.b(com.mbridge.msdk.reward.controller.a.f50342c0) ? com.mbridge.msdk.reward.controller.a.f50342c0 : "";
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    private String k() {
        com.mbridge.msdk.setting.g gVarB = com.mbridge.msdk.setting.h.b().b(com.mbridge.msdk.foundation.controller.c.n().b());
        return com.mbridge.msdk.foundation.same.net.utils.d.h().a(this.C, TextUtils.isEmpty(this.C) ? gVarB.q0() : gVarB.B());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        try {
            if (a1.b(this.f50246b)) {
                com.mbridge.msdk.reward.controller.a.a(this.f50246b, 0);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void c(String str) {
        this.f50264t = str;
    }

    public void d(boolean z10) {
        this.f50262r = z10;
    }

    public void e(boolean z10) {
        this.f50263s = z10;
    }

    public void f(boolean z10) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList;
        if (z10 || (copyOnWriteArrayList = this.f50270z) == null || copyOnWriteArrayList.size() <= 0) {
            return;
        }
        com.mbridge.msdk.videocommon.cache.a.a().a(this.f50246b, this.f50270z);
    }

    public boolean g(boolean z10) {
        if (z10) {
            List<CampaignEx> list = this.X;
            if (list == null || list.size() <= 0) {
                return false;
            }
            for (CampaignEx campaignEx : this.X) {
                if (campaignEx != null) {
                    campaignEx.setLoadTimeoutState(1);
                    if (campaignEx.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx.getRewardTemplateMode().j())) {
                        ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f50246b + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().j(), true);
                    }
                }
            }
            com.mbridge.msdk.videocommon.cache.a.a().a(this.f50246b, this.X, "load_timeout", 1);
            return true;
        }
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.f50270z;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            return false;
        }
        for (CampaignEx campaignEx2 : this.f50270z) {
            if (campaignEx2 != null) {
                campaignEx2.setLoadTimeoutState(1);
                if (campaignEx2.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx2.getRewardTemplateMode().j())) {
                    ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f50246b + "_" + campaignEx2.getRequestId() + "_" + campaignEx2.getRewardTemplateMode().j(), true);
                }
            }
        }
        com.mbridge.msdk.videocommon.cache.a.a().a(this.f50246b, this.f50270z, "load_timeout", 1);
        return true;
    }

    public void h(boolean z10) {
        if (z10) {
            List<CampaignEx> list = this.X;
            if (list == null || list.size() <= 0) {
                return;
            }
            for (CampaignEx campaignEx : this.X) {
                if (campaignEx != null) {
                    campaignEx.setLoadTimeoutState(0);
                    if (campaignEx.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx.getRewardTemplateMode().j())) {
                        ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f50246b + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().j(), false);
                    }
                }
            }
            com.mbridge.msdk.videocommon.cache.a.a().a(this.f50246b, this.X, "load_timeout", 0);
            return;
        }
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.f50270z;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            return;
        }
        for (CampaignEx campaignEx2 : this.f50270z) {
            if (campaignEx2 != null) {
                campaignEx2.setLoadTimeoutState(0);
                if (campaignEx2.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx2.getRewardTemplateMode().j())) {
                    ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f50246b + "_" + campaignEx2.getRequestId() + "_" + campaignEx2.getRewardTemplateMode().j(), false);
                }
            }
        }
        com.mbridge.msdk.videocommon.cache.a.a().a(this.f50246b, this.f50270z, "load_timeout", 0);
    }

    public String j() {
        return this.f50246b;
    }

    public boolean l() {
        return b(false);
    }

    public boolean m() {
        List<CampaignEx> listC = com.mbridge.msdk.videocommon.cache.a.a().c(this.f50246b, 1, this.f50263s, this.f50264t);
        if (listC == null || listC.size() <= 0) {
            q0.a("test_isReay_db", "database has not can use data");
            return false;
        }
        CampaignEx campaignEx = listC.get(0);
        int iA = com.mbridge.msdk.videocommon.cache.a.a().a(this.f50246b, 1, this.f50263s, this.f50264t);
        if (TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()) || campaignEx.getNscpt() != 1 || listC.size() >= iA) {
            return a(listC, !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()), campaignEx.getNscpt());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<CampaignEx> list) {
        if (this.f50245a == null || list == null || list.size() == 0) {
            return;
        }
        j jVarA = j.a(com.mbridge.msdk.foundation.db.g.a(this.f50245a));
        for (int i10 = 0; i10 < list.size(); i10++) {
            CampaignEx campaignEx = list.get(i10);
            if (campaignEx != null) {
                if (com.mbridge.msdk.util.b.a()) {
                    if (v0.c(this.f50245a, campaignEx.getPackageName())) {
                        com.mbridge.msdk.b.a(campaignEx);
                    } else {
                        a(jVarA, campaignEx);
                    }
                } else {
                    a(jVarA, campaignEx);
                }
            }
        }
    }

    private String e() {
        return com.mbridge.msdk.b.a();
    }

    public void c(boolean z10) {
        this.M = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(CampaignUnit campaignUnit) {
        if (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() <= 0) {
            return;
        }
        try {
            com.mbridge.msdk.foundation.same.report.metrics.c metricsData = campaignUnit.getMetricsData();
            if (metricsData != null) {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("result", 1);
                eVar.a("timeout", Integer.valueOf(this.f50250f));
                eVar.a("hst", k());
                metricsData.b(campaignUnit.getAds());
                metricsData.a("2000126", eVar);
                campaignUnit.setLocalRequestId(metricsData.t());
                com.mbridge.msdk.reward.report.metrics.a.a().a("2000126", metricsData);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardMVVideoAdapter", e10.getMessage());
            }
        }
    }

    public CopyOnWriteArrayList<CampaignEx> f() {
        return this.W;
    }

    public void b(String str) {
        this.I = str;
    }

    public boolean b(boolean z10) {
        com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListB = com.mbridge.msdk.videocommon.cache.a.a().b(this.f50246b, 1, this.f50263s, this.f50264t);
        if (copyOnWriteArrayListB != null && copyOnWriteArrayListB.size() > 0) {
            CampaignEx campaignEx = copyOnWriteArrayListB.get(0);
            cVar.i(campaignEx.getCurrentLocalRid());
            int iA = com.mbridge.msdk.videocommon.cache.a.a().a(this.f50246b, 1, this.f50263s, this.f50264t);
            if (TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()) || campaignEx.getNscpt() != 1 || copyOnWriteArrayListB.size() >= iA) {
                boolean zA = a(copyOnWriteArrayListB, !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()), campaignEx.getNscpt(), z10);
                if (z10) {
                    a(zA, cVar, copyOnWriteArrayListB);
                }
                return zA;
            }
            if (z10) {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a(s.I, "is_ready_cltr");
                eVar.a("reason", "nscpt error");
                eVar.a("type", 8);
                a(cVar, eVar, copyOnWriteArrayListB);
            }
            return false;
        }
        q0.a("RewardVideoController", "database has not can use data");
        if (z10) {
            com.mbridge.msdk.foundation.same.report.metrics.e eVar2 = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar2.a(s.I, "is_ready_cse");
            eVar2.a("reason", "no effective campaign list");
            eVar2.a("type", 8);
            a(cVar, eVar2, copyOnWriteArrayListB);
        }
        return false;
    }

    class e implements b.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        com.mbridge.msdk.foundation.same.report.metrics.c f50307a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f50308b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CopyOnWriteArrayList f50309c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f50310d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f50311e;

        e(CampaignEx campaignEx, CopyOnWriteArrayList copyOnWriteArrayList, boolean z10, int i10) {
            this.f50308b = campaignEx;
            this.f50309c = copyOnWriteArrayList;
            this.f50310d = z10;
            this.f50311e = i10;
            this.f50307a = com.mbridge.msdk.foundation.same.report.metrics.d.b().c().get(campaignEx.getLocalRequestId());
        }

        @Override // com.mbridge.msdk.reward.adapter.b.n
        public void a(String str, String str2, String str3, String str4) {
            q0.a("RewardMVVideoAdapter", "大模板业务，大模板下载成功");
            c.this.P = true;
            if (!c.this.O || c.this.Q || c.this.L == null) {
                return;
            }
            synchronized (c.this.f50259o) {
                try {
                    if (c.this.Q) {
                        return;
                    }
                    c.this.Q = true;
                    c.this.L.post(new a(str3, str, str2));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.mbridge.msdk.reward.adapter.b.n
        public void a(String str, String str2, com.mbridge.msdk.foundation.error.b bVar) {
            q0.a("RewardMVVideoAdapter", "大模板业务，大模板下载失败");
            if (this.f50308b.getRsIgnoreCheckRule() != null && this.f50308b.getRsIgnoreCheckRule().size() > 0) {
                if (this.f50308b.getRsIgnoreCheckRule().contains(3)) {
                    q0.c("RewardMVVideoAdapter", "tpl download fail but hit ignoreCheckRule");
                    return;
                } else if (this.f50308b.getCMPTEntryUrl().equals(this.f50308b.getendcard_url()) && this.f50308b.getRsIgnoreCheckRule().contains(2)) {
                    q0.c("RewardMVVideoAdapter", "endcard download fail but hit ignoreCheckRule at 3203");
                    return;
                }
            }
            c cVar = c.this;
            cVar.a(cVar.f50246b, (List<CampaignEx>) c.this.V, c.this.f50263s, str2);
            c.this.P = false;
            if (c.this.L != null) {
                c.this.L.removeMessages(5);
            }
            if (c.this.f50254j == null || c.this.S) {
                return;
            }
            c.this.S = false;
            if (bVar != null) {
                bVar.c("errorCode: 3203 errorMessage: tpl temp resource download failed");
            }
            if (this.f50307a == null) {
                this.f50307a = new com.mbridge.msdk.foundation.same.report.metrics.c();
            }
            this.f50307a.b(this.f50309c);
            this.f50307a.a(bVar);
            c.this.f50254j.a(c.this.V, bVar, this.f50307a);
            q0.a("RewardMVVideoAdapter", "大模板业务，大模板下载失败 onVideoLoadFail");
        }

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f50313a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f50314b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f50315c;

            a(String str, String str2, String str3) {
                this.f50313a = str;
                this.f50314b = str2;
                this.f50315c = str3;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.mbridge.msdk.reward.adapter.b bVarB = com.mbridge.msdk.reward.adapter.b.b();
                boolean z10 = c.this.A;
                Handler handler = c.this.L;
                boolean z11 = c.this.f50262r;
                boolean z12 = c.this.f50263s;
                String str = this.f50313a;
                String requestIdNotice = e.this.f50308b.getRequestIdNotice();
                String str2 = this.f50314b;
                String str3 = this.f50315c;
                String cMPTEntryUrl = e.this.f50308b.getCMPTEntryUrl();
                int i10 = c.this.f50261q;
                e eVar = e.this;
                bVarB.a(z10, handler, z11, z12, str, requestIdNotice, str2, str3, cMPTEntryUrl, i10, eVar.f50308b, eVar.f50309c, H5DownLoadManager.getInstance().getH5ResAddress(e.this.f50308b.getCMPTEntryUrl()), this.f50315c, c.this.f50256l, new C0554a(), false);
            }

            /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.c$e$a$a, reason: collision with other inner class name */
            class C0554a implements b.o {
                C0554a() {
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, String str4, String str5, a.C0600a c0600a) {
                    q0.a("HBOPTIMIZE", "模板加载成功 requestId " + str4);
                    e eVar = e.this;
                    if (c.this.a(eVar.f50309c, eVar.f50310d, eVar.f50311e)) {
                        c cVar = c.this;
                        cVar.a(cVar.f50246b, (List<CampaignEx>) c.this.V, (List<CampaignEx>) c.this.X, c.this.f50263s);
                        if (c.this.L != null) {
                            c.this.L.removeMessages(5);
                        }
                        if (c.this.f50254j == null || c.this.R) {
                            return;
                        }
                        c.this.R = true;
                        e eVar2 = e.this;
                        com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = eVar2.f50307a;
                        if (cVar2 != null) {
                            cVar2.b(eVar2.f50309c);
                        }
                        com.mbridge.msdk.reward.adapter.a aVar = c.this.f50254j;
                        e eVar3 = e.this;
                        aVar.a(eVar3.f50309c, eVar3.f50307a);
                        return;
                    }
                    c cVar3 = c.this;
                    cVar3.a(str3, (List<CampaignEx>) cVar3.V, c.this.f50263s, a.this.f50313a);
                    if (c.this.L != null) {
                        c.this.L.removeMessages(5);
                    }
                    if (c.this.f50254j == null || c.this.S) {
                        return;
                    }
                    c.this.S = false;
                    com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880008, "errorCode: 3505 errorMessage: tpl temp preload success but isReady false");
                    e eVar4 = e.this;
                    if (eVar4.f50307a == null) {
                        eVar4.f50307a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    e eVar5 = e.this;
                    eVar5.f50307a.b(eVar5.f50309c);
                    e.this.f50307a.a(bVarA);
                    c.this.f50254j.a(c.this.V, bVarA, e.this.f50307a);
                    q0.a("RewardMVVideoAdapter", "大模板业务，大模板预加载成功 isReady false  onVideoLoadFail");
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, a.C0600a c0600a, com.mbridge.msdk.foundation.error.b bVar) {
                    q0.a("RewardMVVideoAdapter", "大模板业务，大模板预加载失败");
                    q0.b("HBOPTIMIZE", "模板加载失败 requestId " + str2);
                    a aVar = a.this;
                    c cVar = c.this;
                    cVar.a(aVar.f50315c, (List<CampaignEx>) cVar.V, c.this.f50263s, str2);
                    if (c.this.L != null) {
                        c.this.L.removeMessages(5);
                    }
                    if (c.this.f50254j == null || c.this.S) {
                        return;
                    }
                    c.this.S = false;
                    e eVar = e.this;
                    if (eVar.f50307a == null) {
                        eVar.f50307a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    e eVar2 = e.this;
                    eVar2.f50307a.b(eVar2.f50309c);
                    e.this.f50307a.a(bVar);
                    c.this.f50254j.a(c.this.V, bVar, e.this.f50307a);
                    q0.a("RewardMVVideoAdapter", "大模板业务，大模板预加载失败 onVideoLoadFail");
                }
            }
        }
    }

    private void d() {
        try {
            Map<String, Long> map = com.mbridge.msdk.foundation.same.buffer.b.f48631l;
            if (map == null || map.size() <= 0) {
                return;
            }
            com.mbridge.msdk.foundation.same.buffer.b.f48631l.clear();
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public String a(boolean z10) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListB;
        CampaignEx campaignEx;
        if (z10) {
            if (TextUtils.isEmpty(this.H) && (copyOnWriteArrayListB = com.mbridge.msdk.videocommon.download.b.getInstance().b(this.f50246b)) != null && copyOnWriteArrayListB.size() > 0 && (campaignEx = copyOnWriteArrayListB.get(0)) != null) {
                this.H = campaignEx.getRequestId();
            }
            return this.H;
        }
        return this.G;
    }

    public String g() {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.f50270z;
        if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
            return com.mbridge.msdk.foundation.same.c.b(this.f50270z);
        }
        return com.mbridge.msdk.foundation.same.c.b(this.X);
    }

    public CopyOnWriteArrayList<CampaignEx> h() {
        return this.f50270z;
    }

    private void c() {
        try {
            com.mbridge.msdk.foundation.db.i.a(com.mbridge.msdk.foundation.db.g.a(this.f50245a)).a(this.f50246b);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public void a(int i10) {
        this.f50261q = i10;
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.c$c, reason: collision with other inner class name */
    class C0551c implements b.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        com.mbridge.msdk.foundation.same.report.metrics.c f50274a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f50275b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f50276c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ CopyOnWriteArrayList f50277d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f50278e;

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.c$c$c, reason: collision with other inner class name */
        class RunnableC0553c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ CopyOnWriteArrayList f50292a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ com.mbridge.msdk.foundation.error.b f50293b;

            RunnableC0553c(CopyOnWriteArrayList copyOnWriteArrayList, com.mbridge.msdk.foundation.error.b bVar) {
                this.f50292a = copyOnWriteArrayList;
                this.f50293b = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                c cVar = c.this;
                cVar.a(cVar.f50246b, this.f50292a, c.this.f50263s, "");
                if (c.this.L != null) {
                    c.this.L.removeMessages(5);
                }
                if (c.this.S || c.this.f50254j == null) {
                    return;
                }
                c.this.S = false;
                C0551c c0551c = C0551c.this;
                if (c0551c.f50274a == null) {
                    c0551c.f50274a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                }
                C0551c c0551c2 = C0551c.this;
                c0551c2.f50274a.b(c0551c2.f50277d);
                com.mbridge.msdk.foundation.error.b bVar = this.f50293b;
                if (bVar != null) {
                    bVar.c("errorCode: 3201 errorMessage: campaign resource download failed");
                }
                C0551c.this.f50274a.a(this.f50293b);
                c.this.f50254j.a(this.f50292a, this.f50293b, C0551c.this.f50274a);
                q0.a("RewardMVVideoAdapter", "Campaign 下载失败：onVideoLoadFail");
            }
        }

        C0551c(CampaignEx campaignEx, boolean z10, CopyOnWriteArrayList copyOnWriteArrayList, int i10) {
            this.f50275b = campaignEx;
            this.f50276c = z10;
            this.f50277d = copyOnWriteArrayList;
            this.f50278e = i10;
            this.f50274a = com.mbridge.msdk.foundation.same.report.metrics.d.b().c().get(campaignEx.getLocalRequestId());
        }

        @Override // com.mbridge.msdk.reward.adapter.b.h
        public void a(String str, String str2, String str3, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            c.this.O = true;
            if (this.f50276c) {
                if (!c.this.P || c.this.Q || c.this.L == null) {
                    return;
                }
                synchronized (c.this.f50259o) {
                    try {
                        if (c.this.Q) {
                            return;
                        }
                        c.this.Q = true;
                        c.this.L.post(new b(str3, str2, copyOnWriteArrayList));
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            for (CampaignEx campaignEx : copyOnWriteArrayList) {
                if (campaignEx == null || campaignEx.getRewardTemplateMode() == null || TextUtils.isEmpty(campaignEx.getRewardTemplateMode().j()) || campaignEx.getRewardTemplateMode().j().contains(CampaignEx.KEY_IS_CMPT_ENTRY) || c.this.L == null) {
                    String str4 = str;
                    String str5 = str2;
                    String str6 = str3;
                    CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = copyOnWriteArrayList;
                    if (c.this.a(this.f50277d, this.f50276c, this.f50278e)) {
                        c cVar = c.this;
                        cVar.a(cVar.f50246b, copyOnWriteArrayList2, (List<CampaignEx>) c.this.X, c.this.f50263s);
                        if (c.this.L != null) {
                            c.this.L.removeMessages(5);
                        }
                        if (c.this.f50254j != null && !c.this.R) {
                            c.this.R = true;
                            com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = this.f50274a;
                            if (cVar2 != null) {
                                cVar2.b(this.f50277d);
                            }
                            c.this.f50254j.a(this.f50277d, this.f50274a);
                        }
                    } else {
                        c cVar3 = c.this;
                        cVar3.a(str5, (List<CampaignEx>) cVar3.V, c.this.f50263s, str6);
                        if (c.this.L != null) {
                            c.this.L.removeMessages(5);
                        }
                        if (c.this.f50254j != null && !c.this.S) {
                            c.this.S = false;
                            com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880015, "errorCode: 3503 errorMessage: have no temp but isReady false");
                            if (this.f50274a == null) {
                                this.f50274a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                            }
                            this.f50274a.b(this.f50277d);
                            this.f50274a.a(bVarA);
                            c.this.f50254j.a(this.f50277d, bVarA, this.f50274a);
                            q0.a("RewardMVVideoAdapter", "Campaign 下载成功： 非大模板，不存在播放模板,isReay false onVideoLoadFail");
                        }
                    }
                    str = str4;
                    str2 = str5;
                    str3 = str6;
                    copyOnWriteArrayList = copyOnWriteArrayList2;
                } else {
                    c.this.L.post(new a(campaignEx, str, str2, str3, copyOnWriteArrayList));
                }
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.c$c$a */
        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ CampaignEx f50280a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f50281b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f50282c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f50283d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ CopyOnWriteArrayList f50284e;

            a(CampaignEx campaignEx, String str, String str2, String str3, CopyOnWriteArrayList copyOnWriteArrayList) {
                this.f50280a = campaignEx;
                this.f50281b = str;
                this.f50282c = str2;
                this.f50283d = str3;
                this.f50284e = copyOnWriteArrayList;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.mbridge.msdk.reward.adapter.b bVarB = com.mbridge.msdk.reward.adapter.b.b();
                boolean z10 = c.this.A;
                Handler handler = c.this.L;
                boolean z11 = c.this.f50262r;
                boolean z12 = c.this.f50263s;
                String strJ = this.f50280a.getRewardTemplateMode().j();
                int i10 = c.this.f50261q;
                C0551c c0551c = C0551c.this;
                bVarB.a(z10, handler, z11, z12, null, strJ, i10, c0551c.f50275b, c0551c.f50277d, H5DownLoadManager.getInstance().getH5ResAddress(this.f50280a.getRewardTemplateMode().j()), this.f50281b, this.f50282c, this.f50283d, this.f50280a.getRequestIdNotice(), c.this.f50256l, new C0552a());
            }

            /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.c$c$a$a, reason: collision with other inner class name */
            class C0552a implements b.o {
                C0552a() {
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, String str4, String str5, a.C0600a c0600a) {
                    C0551c c0551c = C0551c.this;
                    if (c.this.a(c0551c.f50277d, c0551c.f50276c, c0551c.f50278e)) {
                        c cVar = c.this;
                        String str6 = cVar.f50246b;
                        a aVar = a.this;
                        cVar.a(str6, aVar.f50284e, (List<CampaignEx>) c.this.X, c.this.f50263s);
                        if (c.this.L != null) {
                            c.this.L.removeMessages(5);
                        }
                        if (c.this.f50254j == null || c.this.R) {
                            return;
                        }
                        c.this.R = true;
                        C0551c c0551c2 = C0551c.this;
                        com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = c0551c2.f50274a;
                        if (cVar2 != null) {
                            cVar2.b(c0551c2.f50277d);
                        }
                        com.mbridge.msdk.reward.adapter.a aVar2 = c.this.f50254j;
                        C0551c c0551c3 = C0551c.this;
                        aVar2.a(c0551c3.f50277d, c0551c3.f50274a);
                        return;
                    }
                    c cVar3 = c.this;
                    cVar3.a(str3, (List<CampaignEx>) cVar3.V, c.this.f50263s, str4);
                    if (c.this.L != null) {
                        c.this.L.removeMessages(5);
                    }
                    if (c.this.f50254j == null || c.this.S) {
                        return;
                    }
                    c.this.S = false;
                    com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880015, "errorCode: 3502 errorMessage: temp preload success but isReady false");
                    C0551c c0551c4 = C0551c.this;
                    if (c0551c4.f50274a == null) {
                        c0551c4.f50274a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    C0551c c0551c5 = C0551c.this;
                    c0551c5.f50274a.b(c0551c5.f50277d);
                    C0551c.this.f50274a.a(bVarA);
                    com.mbridge.msdk.reward.adapter.a aVar3 = c.this.f50254j;
                    C0551c c0551c6 = C0551c.this;
                    aVar3.a(c0551c6.f50277d, bVarA, c0551c6.f50274a);
                    q0.a("RewardMVVideoAdapter", "Campaign 下载成功： 非大模板，播放模板预加载成功,isReay false onVideoLoadFail");
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, a.C0600a c0600a, com.mbridge.msdk.foundation.error.b bVar) {
                    if (bVar != null) {
                        bVar.a("his_reason", "preload template failed is tpl :" + C0551c.this.f50276c);
                    }
                    if (C0551c.this.f50275b.getRsIgnoreCheckRule() != null && C0551c.this.f50275b.getRsIgnoreCheckRule().size() > 0 && C0551c.this.f50275b.getRsIgnoreCheckRule().contains(1)) {
                        q0.c("RewardMVVideoAdapter", "template download fail but hit ignoreCheckRule");
                        return;
                    }
                    a aVar = a.this;
                    c cVar = c.this;
                    cVar.a(aVar.f50282c, (List<CampaignEx>) cVar.V, c.this.f50263s, str2);
                    if (c.this.L != null) {
                        c.this.L.removeMessages(5);
                    }
                    if (c.this.f50254j == null || c.this.S) {
                        return;
                    }
                    c.this.S = false;
                    C0551c c0551c = C0551c.this;
                    if (c0551c.f50274a == null) {
                        c0551c.f50274a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    C0551c c0551c2 = C0551c.this;
                    c0551c2.f50274a.b(c0551c2.f50277d);
                    C0551c.this.f50274a.a(bVar);
                    c.this.f50254j.a(c.this.V, bVar, C0551c.this.f50274a);
                    q0.a("RewardMVVideoAdapter", "Campaign 下载失败： 非大模板，播放模板预加载失败 onVideoLoadFail");
                }
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.c$c$b */
        class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f50287a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f50288b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ CopyOnWriteArrayList f50289c;

            b(String str, String str2, CopyOnWriteArrayList copyOnWriteArrayList) {
                this.f50287a = str;
                this.f50288b = str2;
                this.f50289c = copyOnWriteArrayList;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.mbridge.msdk.reward.adapter.b bVarB = com.mbridge.msdk.reward.adapter.b.b();
                boolean z10 = c.this.A;
                Handler handler = c.this.L;
                boolean z11 = c.this.f50262r;
                boolean z12 = c.this.f50263s;
                String str = this.f50287a;
                String requestIdNotice = C0551c.this.f50275b.getRequestIdNotice();
                String str2 = c.this.f50247c;
                String str3 = this.f50288b;
                String cMPTEntryUrl = C0551c.this.f50275b.getCMPTEntryUrl();
                int i10 = c.this.f50261q;
                C0551c c0551c = C0551c.this;
                bVarB.a(z10, handler, z11, z12, str, requestIdNotice, str2, str3, cMPTEntryUrl, i10, c0551c.f50275b, c0551c.f50277d, H5DownLoadManager.getInstance().getH5ResAddress(C0551c.this.f50275b.getCMPTEntryUrl()), this.f50288b, c.this.f50256l, new a(), false);
            }

            /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.c$c$b$a */
            class a implements b.o {
                a() {
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, String str4, String str5, a.C0600a c0600a) {
                    C0551c c0551c = C0551c.this;
                    if (c.this.a(c0551c.f50277d, c0551c.f50276c, c0551c.f50278e)) {
                        c cVar = c.this;
                        String str6 = cVar.f50246b;
                        b bVar = b.this;
                        cVar.a(str6, bVar.f50289c, (List<CampaignEx>) c.this.X, c.this.f50263s);
                        if (c.this.L != null) {
                            c.this.L.removeMessages(5);
                        }
                        if (c.this.f50254j == null || c.this.R) {
                            return;
                        }
                        c.this.R = true;
                        C0551c c0551c2 = C0551c.this;
                        com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = c0551c2.f50274a;
                        if (cVar2 != null) {
                            cVar2.b(c0551c2.f50277d);
                        }
                        com.mbridge.msdk.reward.adapter.a aVar = c.this.f50254j;
                        C0551c c0551c3 = C0551c.this;
                        aVar.a(c0551c3.f50277d, c0551c3.f50274a);
                        return;
                    }
                    c cVar3 = c.this;
                    cVar3.a(str3, (List<CampaignEx>) cVar3.V, c.this.f50263s, str4);
                    if (c.this.L != null) {
                        c.this.L.removeMessages(5);
                    }
                    if (c.this.f50254j == null || c.this.S) {
                        return;
                    }
                    c.this.S = false;
                    com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880015, "errorCode: 3505 errorMessage: tpl temp preload success but isReady false");
                    C0551c c0551c4 = C0551c.this;
                    if (c0551c4.f50274a == null) {
                        c0551c4.f50274a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    C0551c c0551c5 = C0551c.this;
                    c0551c5.f50274a.b(c0551c5.f50277d);
                    C0551c.this.f50274a.a(bVarA);
                    c.this.f50254j.a(c.this.V, bVarA, C0551c.this.f50274a);
                    q0.a("RewardMVVideoAdapter", "Campaign 下载成功： 大模板预加载成功,isReady false onVideoLoadFail");
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, a.C0600a c0600a, com.mbridge.msdk.foundation.error.b bVar) {
                    if (bVar != null) {
                        bVar.a("his_reason", "errorCode: 3303 errorMessage: tpl temp preload failed");
                    }
                    if (C0551c.this.f50275b.getRsIgnoreCheckRule() != null && C0551c.this.f50275b.getRsIgnoreCheckRule().size() > 0 && C0551c.this.f50275b.getRsIgnoreCheckRule().contains(3)) {
                        q0.c("RewardMVVideoAdapter", "template download fail but hit ignoreCheckRule");
                        return;
                    }
                    b bVar2 = b.this;
                    c cVar = c.this;
                    cVar.a(bVar2.f50288b, (List<CampaignEx>) cVar.V, c.this.f50263s, str2);
                    if (c.this.L != null) {
                        c.this.L.removeMessages(5);
                    }
                    if (c.this.f50254j == null || c.this.S) {
                        return;
                    }
                    c.this.S = false;
                    C0551c c0551c = C0551c.this;
                    if (c0551c.f50274a == null) {
                        c0551c.f50274a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    C0551c c0551c2 = C0551c.this;
                    c0551c2.f50274a.b(c0551c2.f50277d);
                    C0551c.this.f50274a.a(bVar);
                    c.this.f50254j.a(c.this.V, bVar, C0551c.this.f50274a);
                    q0.a("RewardMVVideoAdapter", "Campaign 下载成功： 大模板预加载失败 onVideoLoadFail");
                }
            }
        }

        @Override // com.mbridge.msdk.reward.adapter.b.h
        public void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.foundation.error.b bVar) {
            c.this.O = false;
            if (c.this.f50254j == null || c.this.L == null) {
                return;
            }
            c.this.L.post(new RunnableC0553c(copyOnWriteArrayList, bVar));
        }
    }

    public void a(int i10, String str) {
        this.J = i10;
        this.K = str;
    }

    public void c(List<CampaignEx> list) {
        this.X = list;
    }

    public boolean a(CampaignEx campaignEx, boolean z10, com.mbridge.msdk.foundation.error.b bVar, int i10, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        c cVar2;
        com.mbridge.msdk.foundation.same.report.metrics.c cVar3;
        com.mbridge.msdk.foundation.cache.c cVar4;
        com.mbridge.msdk.foundation.cache.c cVar5 = new com.mbridge.msdk.foundation.cache.c();
        com.mbridge.msdk.reward.candidate.a aVar = new com.mbridge.msdk.reward.candidate.a(this.f50246b, this.f50262r);
        boolean z11 = false;
        if (aVar.a(this.C)) {
            return false;
        }
        if (!this.T) {
            this.T = true;
            cVar5 = aVar.a(this.C, cVar, campaignEx, bVar, i10, this);
            cVar3 = cVar;
            cVar2 = this;
            if (cVar5 != null && cVar5.g() > com.mbridge.msdk.foundation.cache.c.f48242i) {
                if (cVar5.c() != null && cVar5.c().size() > 0) {
                    a(cVar5.c(), true, true, true);
                } else if (cVar5.g() == com.mbridge.msdk.foundation.cache.c.f48244k && bVar != null) {
                    bVar.a(com.mbridge.msdk.foundation.error.a.b(880038));
                    bVar.d(cVar5.e());
                }
            }
            cVar4 = cVar5;
            aVar.a(cVar3, cVar2.C, cVar4, (List<a.b>) null, (JSONObject) null, 3);
            return z11;
        }
        cVar2 = this;
        cVar3 = cVar;
        cVar5.d("isCandidate:false");
        cVar5.a(com.mbridge.msdk.foundation.cache.c.f48244k);
        cVar4 = cVar5;
        z11 = true;
        aVar.a(cVar3, cVar2.C, cVar4, (List<a.b>) null, (JSONObject) null, 3);
        return z11;
    }

    public void b(String str, boolean z10, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        String strT;
        boolean zA;
        try {
            if (this.f50245a == null) {
                com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is Context is null");
                if (cVar != null) {
                    cVar.a(bVarA);
                }
                b("errorCode: 3507 errorMessage: data load failed, errorMsg is Context is null", cVar);
                return;
            }
            if (a1.a(this.f50246b)) {
                com.mbridge.msdk.foundation.error.b bVarA2 = com.mbridge.msdk.foundation.error.a.a(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is UnitId is null");
                if (cVar != null) {
                    cVar.a(bVarA2);
                }
                b("errorCode: 3507 errorMessage: data load failed, errorMsg is UnitId is null", cVar);
                return;
            }
            if (this.f50256l == null) {
                com.mbridge.msdk.foundation.error.b bVarA3 = com.mbridge.msdk.foundation.error.a.a(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is RewardUnitSetting is null");
                if (cVar != null) {
                    cVar.a(bVarA3);
                }
                b("errorCode: 3507 errorMessage: data load failed, errorMsg is RewardUnitSetting is null", cVar);
                return;
            }
            if (TextUtils.isEmpty(str)) {
                if (System.currentTimeMillis() - this.B < this.f50256l.p() * 1000) {
                    com.mbridge.msdk.foundation.error.b bVarA4 = com.mbridge.msdk.foundation.error.a.a(880018, "errorCode: 3507 errorMessage: data load failed, errorMsg is EXCEPTION_RETURN_EMPTY");
                    if (cVar != null) {
                        cVar.a(bVarA4);
                        cVar.b(true);
                    }
                    b("errorCode: 3507 errorMessage: data load failed, errorMsg is EXCEPTION_RETURN_EMPTY", cVar);
                    return;
                }
            }
            if (cVar == null) {
                strT = "";
            } else {
                strT = cVar.t();
            }
            com.mbridge.msdk.foundation.same.net.wrapper.e eVarA = new com.mbridge.msdk.reward.adapter.e(this.f50247c, this.f50246b, this.f50262r, this.f50256l, strT).a(this.f50251g, this.f50252h, this.f50248d, i(), e(), this.f50265u, str, z10, this.f50266v);
            if (eVarA == null) {
                com.mbridge.msdk.foundation.error.b bVarA5 = com.mbridge.msdk.foundation.error.a.a(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is Load param is null");
                if (cVar != null) {
                    cVar.a(bVarA5);
                }
                b("errorCode: 3507 errorMessage: data load failed, errorMsg is Load param is null", cVar);
                return;
            }
            if (this.J != 0) {
                eVarA.a("r_index", this.J + "");
            }
            if (!TextUtils.isEmpty(this.K)) {
                eVarA.a("invalid_ad_ids", this.K);
            }
            this.N = System.currentTimeMillis();
            com.mbridge.msdk.reward.request.b bVar = new com.mbridge.msdk.reward.request.b(this.f50245a);
            b bVar2 = new b(cVar);
            bVar2.a(str);
            bVar2.setUnitId(this.f50246b);
            bVar2.setPlacementId(this.f50247c);
            bVar2.setAdType(this.f50262r ? 287 : 94);
            bVar2.a(cVar);
            try {
                zA = com.mbridge.msdk.videocommon.download.j.a().a(this.f50262r ? 287 : 94);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardMVVideoAdapter", "isRewardVideoRefactorForCampaignRequest exception " + e10.getMessage());
                }
                zA = false;
            }
            boolean z11 = zA;
            try {
                if (com.mbridge.msdk.foundation.same.net.utils.c.b().a(eVarA) == null) {
                    com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                    eVar.a("hst", k());
                    if (this.J != 0) {
                        eVar.a("r_index", this.J + "");
                    }
                    cVar.a("2000125", eVar);
                    com.mbridge.msdk.reward.report.metrics.a.a().a("2000125", cVar);
                }
            } catch (Exception e11) {
                if (MBridgeConstans.DEBUG) {
                    e11.printStackTrace();
                }
            }
            if (z11) {
                bVar.getCampaign(1, str, eVarA, bVar2, com.mbridge.msdk.foundation.same.c.a(this.f50250f * 1000, 30000L));
            } else {
                bVar.choiceV3OrV5BySetting(1, eVarA, bVar2, str, com.mbridge.msdk.foundation.same.c.a(this.f50250f * 1000, 30000L));
            }
        } catch (Exception e12) {
            e12.printStackTrace();
            b("Load exception", cVar);
            n();
        }
    }

    public void a(com.mbridge.msdk.videocommon.setting.c cVar) {
        try {
            this.f50256l = cVar;
            if (cVar == null || cVar.o() * 1000 == com.mbridge.msdk.foundation.same.a.L) {
                return;
            }
            com.mbridge.msdk.foundation.same.a.L = this.f50256l.o() * 1000;
        } catch (Throwable th2) {
            q0.b("RewardMVVideoAdapter", th2.getMessage(), th2);
        }
    }

    public boolean a(List<CampaignEx> list, boolean z10, int i10, boolean z11) {
        return a(list, z10, i10, false, z11);
    }

    public boolean a(List<CampaignEx> list, boolean z10, int i10) {
        return a(list, z10, i10, false, false);
    }

    public boolean a(List<CampaignEx> list, boolean z10) {
        if (list != null && list.size() > 0) {
            CampaignEx campaignEx = list.get(0);
            if (campaignEx != null && com.mbridge.msdk.videocommon.download.b.getInstance().a(94, this.f50246b, list)) {
                if (z10) {
                    if (campaignEx.isDynamicView()) {
                        return true;
                    }
                    if (campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0) {
                        if (campaignEx.getRsIgnoreCheckRule().contains(3)) {
                            q0.c("RewardMVVideoAdapter", "Is not check big template download status");
                            return true;
                        }
                        if (campaignEx.getCMPTEntryUrl().equals(campaignEx.getendcard_url()) && campaignEx.getRsIgnoreCheckRule().contains(2)) {
                            q0.c("RewardMVVideoAdapter", "Is not check big template ENDCARD download status");
                            return true;
                        }
                    }
                    if (ResDownloadCheckManager.getInstance().checkPreLoadState(this.f50246b + "_" + campaignEx.getRequestId() + "_" + campaignEx.getCMPTEntryUrl())) {
                        q0.a("RewardVideoController", "大模板业务，开始检查大模板预加载情况，大模板预加载成功");
                        return true;
                    }
                } else {
                    if (campaignEx.isDynamicView()) {
                        return true;
                    }
                    if (campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(1)) {
                        q0.c("RewardMVVideoAdapter", "Is not check template download status");
                        return true;
                    }
                    if (campaignEx.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx.getRewardTemplateMode().j())) {
                        if (ResDownloadCheckManager.getInstance().checkPreLoadState(this.f50246b + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().j())) {
                            q0.a("RewardVideoController", "非大模板业务，存在播放模板，播放模板预加载成功");
                            return true;
                        }
                    } else {
                        q0.a("RewardVideoController", "非大模板 没有 template");
                        return true;
                    }
                }
            }
        } else {
            q0.a("RewardVideoController", "数据为空");
        }
        return false;
    }

    public boolean a(List<CampaignEx> list, boolean z10, int i10, boolean z11, boolean z12) {
        com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        if (list != null && list.size() > 0) {
            CampaignEx campaignEx = list.get(0);
            cVar.i(campaignEx.getCurrentLocalRid());
            boolean zA = com.mbridge.msdk.videocommon.download.b.getInstance().a(94, this.f50246b, this.f50263s, list.size(), z10, i10, list, z11, eVar);
            eVar.a(s.I, "is_ready_crwtpl_" + zA);
            if (zA) {
                if (z10) {
                    if (campaignEx.isDynamicView()) {
                        return true;
                    }
                    if (campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0) {
                        if (campaignEx.getRsIgnoreCheckRule().contains(3)) {
                            q0.c("RewardMVVideoAdapter", "Is not check big template download status");
                            return true;
                        }
                        if (campaignEx.getCMPTEntryUrl().equals(campaignEx.getendcard_url()) && campaignEx.getRsIgnoreCheckRule().contains(2)) {
                            q0.c("RewardMVVideoAdapter", "Is not check big template of ENDCARD download status");
                            return true;
                        }
                    }
                    if (ResDownloadCheckManager.getInstance().checkPreLoadState(this.f50246b + "_" + campaignEx.getRequestId() + "_" + campaignEx.getCMPTEntryUrl())) {
                        return true;
                    }
                    if (z12) {
                        eVar.a(s.I, "is_ready_crwtpl_" + zA);
                        eVar.a("reason", "h5 big template checkPreLoadState error");
                        eVar.a("type", 5);
                        a(cVar, eVar, list);
                    }
                } else {
                    if (campaignEx.isDynamicView()) {
                        return true;
                    }
                    if (campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(1)) {
                        q0.c("RewardMVVideoAdapter", "Is not check template download status");
                        return true;
                    }
                    if (campaignEx.getRewardTemplateMode() == null || TextUtils.isEmpty(campaignEx.getRewardTemplateMode().j())) {
                        return true;
                    }
                    String str = this.f50246b + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().j();
                    if (z12) {
                        ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(str, true);
                    }
                    if (ResDownloadCheckManager.getInstance().checkPreLoadState(str)) {
                        return true;
                    }
                    if (z12) {
                        eVar.a(s.I, "is_ready_crwtpl_" + zA);
                        eVar.a("reason", "h5 template checkPreLoadState error");
                        eVar.a("type", 5);
                        a(cVar, eVar, list);
                    }
                }
            }
        } else {
            eVar.a(s.I, "is_ready_crwtpl_empty");
            eVar.a("reason", "campaign list is empty error");
            eVar.a("type", 8);
        }
        a(cVar, eVar, list);
        return false;
    }

    private void b(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (this.L != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 18;
            if (cVar != null) {
                Bundle bundle = new Bundle();
                bundle.putString("metrics_data_lrid", cVar.t());
                messageObtain.setData(bundle);
            }
            this.L.sendMessage(messageObtain);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (this.L != null) {
            if (TextUtils.isEmpty(str)) {
                str = "load fail exception";
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = 4;
            messageObtain.obj = str;
            if (cVar != null) {
                cVar.b(true);
                Bundle bundle = new Bundle();
                bundle.putString("metrics_data_lrid", cVar.t());
                messageObtain.setData(bundle);
            }
            if (str.contains("exception")) {
                this.L.sendMessageAtFrontOfQueue(messageObtain);
            } else {
                this.L.sendMessage(messageObtain);
            }
        }
    }

    public void a(com.mbridge.msdk.video.bt.module.orglistener.h hVar, String str, String str2, int i10, String str3, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        try {
            this.f50253i = hVar;
            if (this.f50245a != null && !a1.a(this.f50246b)) {
                Intent intent = new Intent(this.f50245a, (Class<?>) MBRewardVideoActivity.class);
                intent.putExtra(MBridgeConstans.UNIT_ID, this.f50246b);
                intent.putExtra(MBridgeConstans.PLACEMENT_ID, this.f50247c);
                intent.putExtra(MBridgeConstans.REWARD_ID, str);
                intent.putExtra(MBridgeConstans.MUTE_STATE, i10);
                intent.putExtra(MBridgeConstans.IS_IV, this.f50262r);
                intent.putExtra(MBridgeConstans.IS_BID, this.f50263s);
                intent.putExtra(MBridgeConstans.EXTRA_DATA, str3);
                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListB = com.mbridge.msdk.videocommon.download.b.getInstance().b(this.f50246b);
                boolean z10 = false;
                if (copyOnWriteArrayListB != null && copyOnWriteArrayListB.size() > 0) {
                    CampaignEx campaignEx = copyOnWriteArrayListB.get(0);
                    if (copyOnWriteArrayListB.size() == 1 && !com.mbridge.msdk.foundation.same.c.a(this.f50245a, campaignEx) && campaignEx.getFilterAdsShowCallState() == 1) {
                        com.mbridge.msdk.videocommon.cache.a.a().b(this.f50246b, campaignEx);
                        com.mbridge.msdk.video.bt.module.orglistener.h hVar2 = this.f50253i;
                        if (hVar2 != null) {
                            hVar2.a(cVar, "show_campaign_filtered");
                            return;
                        }
                    }
                    if (campaignEx != null) {
                        this.H = campaignEx.getRequestId();
                    }
                    if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl())) {
                        z10 = true;
                    }
                    a();
                } else {
                    com.mbridge.msdk.video.bt.module.orglistener.h hVar3 = this.f50253i;
                    if (hVar3 != null) {
                        hVar3.a(cVar, "load failed");
                        return;
                    }
                }
                intent.putExtra(MBridgeConstans.IS_BIG_OFFER, z10);
                if (this.f50262r) {
                    intent.putExtra(MBridgeConstans.IV_REWARD_MODE_TYPE, this.f50266v);
                    intent.putExtra(MBridgeConstans.IV_REWARD_VALUE_TYPE, this.f50267w);
                    intent.putExtra(MBridgeConstans.IV_REWARD_VALUE, this.f50268x);
                }
                if (!TextUtils.isEmpty(str2)) {
                    intent.putExtra(MBridgeConstans.USER_ID, str2);
                }
                RewardUnitCacheManager.getInstance().add(this.f50247c, this.f50246b, this.f50256l);
                try {
                    if (com.mbridge.msdk.foundation.controller.c.n() != null && com.mbridge.msdk.foundation.controller.c.n().f() != null) {
                        ((Activity) com.mbridge.msdk.foundation.controller.c.n().f()).startActivity(intent);
                        return;
                    }
                } catch (Throwable th2) {
                    q0.b("RewardMVVideoAdapter", th2.getMessage());
                }
                intent.addFlags(268435456);
                this.f50245a.startActivity(intent);
                return;
            }
            com.mbridge.msdk.video.bt.module.orglistener.h hVar4 = this.f50253i;
            if (hVar4 != null) {
                hVar4.a(cVar, "context or unitid is null");
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            com.mbridge.msdk.video.bt.module.orglistener.h hVar5 = this.f50253i;
            if (hVar5 != null) {
                hVar5.a(cVar, "show failed, exception is " + e10.getMessage());
            }
        }
    }

    private void b() {
        if (com.mbridge.msdk.videocommon.cache.a.a() != null) {
            try {
                com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
                if (gVarD == null) {
                    gVarD = com.mbridge.msdk.setting.h.b().a();
                }
                com.mbridge.msdk.videocommon.cache.a.a().a(gVarD.b0() * 1000, this.f50246b);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01e9 A[Catch: all -> 0x0024, Exception -> 0x0027, TryCatch #2 {all -> 0x0024, blocks: (B:8:0x001c, B:10:0x0020, B:16:0x002c, B:18:0x0032, B:20:0x003c, B:22:0x0049, B:24:0x0053, B:25:0x0058, B:27:0x005e, B:28:0x006f, B:30:0x0075, B:31:0x007d, B:33:0x0082, B:37:0x008d, B:39:0x0099, B:41:0x00a7, B:77:0x0168, B:79:0x0177, B:81:0x017d, B:83:0x0183, B:126:0x0229, B:85:0x018c, B:86:0x018f, B:76:0x0165, B:45:0x00b4, B:48:0x00bf, B:87:0x0190, B:89:0x0198, B:91:0x019e, B:93:0x01a8, B:98:0x01bd, B:99:0x01c2, B:101:0x01c9, B:103:0x01cf, B:107:0x01de, B:108:0x01e1, B:110:0x01e9, B:117:0x0216, B:111:0x01ed, B:113:0x01f6, B:115:0x01fc, B:116:0x020b, B:96:0x01b3), top: B:144:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01ed A[Catch: all -> 0x0024, Exception -> 0x0027, TryCatch #2 {all -> 0x0024, blocks: (B:8:0x001c, B:10:0x0020, B:16:0x002c, B:18:0x0032, B:20:0x003c, B:22:0x0049, B:24:0x0053, B:25:0x0058, B:27:0x005e, B:28:0x006f, B:30:0x0075, B:31:0x007d, B:33:0x0082, B:37:0x008d, B:39:0x0099, B:41:0x00a7, B:77:0x0168, B:79:0x0177, B:81:0x017d, B:83:0x0183, B:126:0x0229, B:85:0x018c, B:86:0x018f, B:76:0x0165, B:45:0x00b4, B:48:0x00bf, B:87:0x0190, B:89:0x0198, B:91:0x019e, B:93:0x01a8, B:98:0x01bd, B:99:0x01c2, B:101:0x01c9, B:103:0x01cf, B:107:0x01de, B:108:0x01e1, B:110:0x01e9, B:117:0x0216, B:111:0x01ed, B:113:0x01f6, B:115:0x01fc, B:116:0x020b, B:96:0x01b3), top: B:144:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0237 A[PHI: r15
  0x0237: PHI (r15v4 'e' java.io.IOException) = (r15v7 'e' java.io.IOException), (r15v8 'e' java.io.IOException) binds: [B:132:0x0235, B:124:0x0226] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0190 A[Catch: all -> 0x0024, Exception -> 0x0027, PHI: r4
  0x0190: PHI (r4v6 java.io.FileOutputStream) = (r4v5 java.io.FileOutputStream), (r4v10 java.io.FileOutputStream) binds: [B:38:0x0097, B:82:0x0181] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {all -> 0x0024, blocks: (B:8:0x001c, B:10:0x0020, B:16:0x002c, B:18:0x0032, B:20:0x003c, B:22:0x0049, B:24:0x0053, B:25:0x0058, B:27:0x005e, B:28:0x006f, B:30:0x0075, B:31:0x007d, B:33:0x0082, B:37:0x008d, B:39:0x0099, B:41:0x00a7, B:77:0x0168, B:79:0x0177, B:81:0x017d, B:83:0x0183, B:126:0x0229, B:85:0x018c, B:86:0x018f, B:76:0x0165, B:45:0x00b4, B:48:0x00bf, B:87:0x0190, B:89:0x0198, B:91:0x019e, B:93:0x01a8, B:98:0x01bd, B:99:0x01c2, B:101:0x01c9, B:103:0x01cf, B:107:0x01de, B:108:0x01e1, B:110:0x01e9, B:117:0x0216, B:111:0x01ed, B:113:0x01f6, B:115:0x01fc, B:116:0x020b, B:96:0x01b3), top: B:144:0x001c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.mbridge.msdk.reward.adapter.d b(com.mbridge.msdk.foundation.entity.CampaignUnit r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 595
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.c.b(com.mbridge.msdk.foundation.entity.CampaignUnit):com.mbridge.msdk.reward.adapter.d");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a() {
        /*
            r4 = this;
            com.mbridge.msdk.foundation.controller.c r0 = com.mbridge.msdk.foundation.controller.c.n()
            android.content.Context r0 = r0.d()
            com.mbridge.msdk.foundation.db.b r0 = com.mbridge.msdk.foundation.db.b.a(r0)
            java.lang.String r1 = r4.f50246b
            java.lang.String r2 = r4.H
            java.util.List r0 = r0.a(r1, r2)
            if (r0 == 0) goto La8
            int r1 = r0.size()
            java.lang.String r2 = r4.f50246b
            java.lang.String r2 = com.mbridge.msdk.foundation.same.buffer.b.d(r2)
            if (r1 != 0) goto L24
            goto La8
        L24:
            r3 = 1
            if (r1 != r3) goto L45
            r1 = 0
            java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Exception -> L43
            if (r3 == 0) goto L70
            java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Exception -> L43
            com.mbridge.msdk.foundation.entity.d r3 = (com.mbridge.msdk.foundation.entity.d) r3     // Catch: java.lang.Exception -> L43
            java.lang.String r3 = r3.d()     // Catch: java.lang.Exception -> L43
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L43
            com.mbridge.msdk.foundation.entity.d r0 = (com.mbridge.msdk.foundation.entity.d) r0     // Catch: java.lang.Exception -> L43
            java.lang.String r0 = r0.b()     // Catch: java.lang.Exception -> L43
            goto L73
        L43:
            r0 = move-exception
            goto L9f
        L45:
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L43
            if (r1 != 0) goto L70
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L43
        L4f:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Exception -> L43
            if (r1 == 0) goto L70
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Exception -> L43
            com.mbridge.msdk.foundation.entity.d r1 = (com.mbridge.msdk.foundation.entity.d) r1     // Catch: java.lang.Exception -> L43
            if (r1 == 0) goto L4f
            java.lang.String r3 = r1.a()     // Catch: java.lang.Exception -> L43
            boolean r3 = r2.equals(r3)     // Catch: java.lang.Exception -> L43
            if (r3 == 0) goto L4f
            java.lang.String r3 = r1.d()     // Catch: java.lang.Exception -> L43
            java.lang.String r0 = r1.b()     // Catch: java.lang.Exception -> L43
            goto L73
        L70:
            java.lang.String r0 = ""
            r3 = r0
        L73:
            boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L43
            if (r1 != 0) goto La8
            java.lang.String r1 = r4.H     // Catch: java.lang.Exception -> L43
            boolean r1 = r3.equals(r1)     // Catch: java.lang.Exception -> L43
            if (r1 == 0) goto La8
            com.mbridge.msdk.foundation.controller.c r1 = com.mbridge.msdk.foundation.controller.c.n()     // Catch: java.lang.Exception -> L43
            android.content.Context r1 = r1.d()     // Catch: java.lang.Exception -> L43
            com.mbridge.msdk.foundation.db.b r1 = com.mbridge.msdk.foundation.db.b.a(r1)     // Catch: java.lang.Exception -> L43
            java.lang.String r3 = r4.f50246b     // Catch: java.lang.Exception -> L43
            r1.b(r2, r3)     // Catch: java.lang.Exception -> L43
            java.lang.String r1 = r4.f50246b     // Catch: java.lang.Exception -> L43
            java.lang.String r2 = r4.H     // Catch: java.lang.Exception -> L43
            com.mbridge.msdk.foundation.same.buffer.b.a(r1, r2, r0)     // Catch: java.lang.Exception -> L43
            java.lang.String r0 = r4.f50246b     // Catch: java.lang.Exception -> L43
            com.mbridge.msdk.foundation.same.buffer.b.e(r0)     // Catch: java.lang.Exception -> L43
            return
        L9f:
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = "RewardMVVideoAdapter"
            com.mbridge.msdk.foundation.tools.q0.a(r1, r0)
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.c.a():void");
    }

    public void a(int i10, int i11, boolean z10, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        a(i10, i11, z10, "", this.A, cVar);
    }

    public void a(int i10, int i11, boolean z10, String str, boolean z11, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        CampaignEx campaignEx;
        this.f50249e = i10;
        this.f50250f = i11;
        this.f50251g = z10;
        this.C = str;
        this.A = z11;
        boolean zB = false;
        this.T = false;
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.f50270z;
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0 && (campaignEx = this.f50270z.get(0)) != null && TextUtils.isEmpty(campaignEx.getNLRid())) {
            this.f50270z.clear();
        }
        List<CampaignEx> list = this.V;
        if (list != null) {
            list.clear();
        }
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = this.W;
        if (copyOnWriteArrayList2 != null) {
            copyOnWriteArrayList2.clear();
        }
        this.O = false;
        this.P = false;
        synchronized (this.f50259o) {
            try {
                if (this.Q) {
                    this.Q = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.S = false;
        this.R = false;
        try {
            zB = com.mbridge.msdk.mbsignalcommon.webEnvCheck.a.b(this.f50245a);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardMVVideoAdapter", e10.getMessage());
            }
        }
        if (!zB) {
            com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is WebView is not available");
            if (cVar != null) {
                cVar.a(bVarA);
            }
            b("errorCode: 3507 errorMessage: data load failed, errorMsg is WebView is not available", cVar);
            return;
        }
        if (this.f50245a == null) {
            com.mbridge.msdk.foundation.error.b bVarA2 = com.mbridge.msdk.foundation.error.a.a(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is Context is null");
            if (cVar != null) {
                cVar.a(bVarA2);
            }
            b("errorCode: 3507 errorMessage: data load failed, errorMsg is Context is null", cVar);
            return;
        }
        if (a1.a(this.f50246b)) {
            com.mbridge.msdk.foundation.error.b bVarA3 = com.mbridge.msdk.foundation.error.a.a(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is UnitId is null");
            if (cVar != null) {
                cVar.a(bVarA3);
            }
            b("errorCode: 3507 errorMessage: data load failed, errorMsg is UnitId is null", cVar);
            return;
        }
        if (this.f50256l == null) {
            com.mbridge.msdk.foundation.error.b bVarA4 = com.mbridge.msdk.foundation.error.a.a(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is RewardUnitSetting is null");
            if (cVar != null) {
                cVar.a(bVarA4);
            }
            b("RewardUnitSetting is null", cVar);
            return;
        }
        d();
        c();
        q0.c("RewardMVVideoAdapter", "load 开始清除过期数据");
        b();
        a(str, z11, cVar);
    }

    private void b(List<CampaignEx> list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    this.f50248d += list.size();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                return;
            }
        }
        com.mbridge.msdk.videocommon.setting.c cVar = this.f50256l;
        if (cVar == null || this.f50248d > cVar.r()) {
            this.f50248d = 0;
        }
        if (a1.b(this.f50246b)) {
            com.mbridge.msdk.reward.controller.a.a(this.f50246b, this.f50248d);
        }
    }

    private boolean b(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return false;
        }
        try {
            return campaignEx.getPlayable_ads_without_video() == 2;
        } catch (Throwable th2) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            th2.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002a A[Catch: Exception -> 0x0027, TryCatch #0 {Exception -> 0x0027, blocks: (B:4:0x0004, B:6:0x000a, B:14:0x0021, B:18:0x002f, B:20:0x004d, B:22:0x0055, B:24:0x0059, B:27:0x0062, B:29:0x007b, B:28:0x0070, B:30:0x0091, B:17:0x002a), top: B:36:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.mbridge.msdk.foundation.same.report.metrics.c r6, int r7) {
        /*
            r5 = this;
            java.lang.String r0 = "2000126"
            if (r6 == 0) goto Lb6
            boolean r1 = r6.F()     // Catch: java.lang.Exception -> L27
            if (r1 != 0) goto Lb6
            com.mbridge.msdk.foundation.same.report.metrics.e r1 = new com.mbridge.msdk.foundation.same.report.metrics.e     // Catch: java.lang.Exception -> L27
            r1.<init>()     // Catch: java.lang.Exception -> L27
            r2 = 3
            java.lang.String r3 = "result"
            if (r7 == r2) goto L2a
            r2 = 880023(0xd6d97, float:1.233175E-39)
            if (r7 == r2) goto L2a
            r2 = 880041(0xd6da9, float:1.2332E-39)
            if (r7 == r2) goto L2a
            switch(r7) {
                case 10: goto L2a;
                case 11: goto L2a;
                case 12: goto L2a;
                default: goto L21;
            }
        L21:
            java.lang.String r7 = "1"
            r1.a(r3, r7)     // Catch: java.lang.Exception -> L27
            goto L2f
        L27:
            r6 = move-exception
            goto Laf
        L2a:
            java.lang.String r7 = "2"
            r1.a(r3, r7)     // Catch: java.lang.Exception -> L27
        L2f:
            java.lang.String r7 = "timeout"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L27
            r2.<init>()     // Catch: java.lang.Exception -> L27
            int r3 = r5.f50250f     // Catch: java.lang.Exception -> L27
            r2.append(r3)     // Catch: java.lang.Exception -> L27
            java.lang.String r3 = ""
            r2.append(r3)     // Catch: java.lang.Exception -> L27
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L27
            r1.a(r7, r2)     // Catch: java.lang.Exception -> L27
            com.mbridge.msdk.foundation.error.b r7 = r6.u()     // Catch: java.lang.Exception -> L27
            if (r7 == 0) goto L91
            java.lang.String r2 = "campaign_request_error"
            java.lang.Object r2 = r7.a(r2)     // Catch: java.lang.Exception -> L27
            if (r2 == 0) goto L91
            boolean r3 = r2 instanceof com.mbridge.msdk.foundation.same.net.exception.a     // Catch: java.lang.Exception -> L27
            if (r3 == 0) goto L91
            r3 = r2
            com.mbridge.msdk.foundation.same.net.exception.a r3 = (com.mbridge.msdk.foundation.same.net.exception.a) r3     // Catch: java.lang.Exception -> L27
            com.mbridge.msdk.foundation.same.net.toolbox.a r3 = r3.f48691c     // Catch: java.lang.Exception -> L27
            java.lang.String r4 = "code"
            if (r3 == 0) goto L70
            com.mbridge.msdk.foundation.same.net.exception.a r2 = (com.mbridge.msdk.foundation.same.net.exception.a) r2     // Catch: java.lang.Exception -> L27
            com.mbridge.msdk.foundation.same.net.toolbox.a r2 = r2.f48691c     // Catch: java.lang.Exception -> L27
            int r2 = r2.f48712d     // Catch: java.lang.Exception -> L27
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L27
            r1.a(r4, r2)     // Catch: java.lang.Exception -> L27
            goto L7b
        L70:
            int r2 = r7.g()     // Catch: java.lang.Exception -> L27
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L27
            r1.a(r4, r2)     // Catch: java.lang.Exception -> L27
        L7b:
            java.lang.String r2 = "reason"
            java.lang.String r3 = r7.l()     // Catch: java.lang.Exception -> L27
            r1.a(r2, r3)     // Catch: java.lang.Exception -> L27
            java.lang.String r2 = "err_desc"
            java.lang.String r7 = r7.i()     // Catch: java.lang.Exception -> L27
            r1.a(r2, r7)     // Catch: java.lang.Exception -> L27
            r7 = 0
            r6.a(r7)     // Catch: java.lang.Exception -> L27
        L91:
            java.lang.String r7 = "hst"
            java.lang.String r2 = r5.k()     // Catch: java.lang.Exception -> L27
            r1.a(r7, r2)     // Catch: java.lang.Exception -> L27
            java.lang.String r7 = "126_exclude"
            r2 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L27
            r1.a(r7, r2)     // Catch: java.lang.Exception -> L27
            r6.a(r0, r1)     // Catch: java.lang.Exception -> L27
            com.mbridge.msdk.reward.report.metrics.a r7 = com.mbridge.msdk.reward.report.metrics.a.a()     // Catch: java.lang.Exception -> L27
            r7.a(r0, r6)     // Catch: java.lang.Exception -> L27
            return
        Laf:
            boolean r7 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r7 == 0) goto Lb6
            r6.printStackTrace()
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.c.a(com.mbridge.msdk.foundation.same.report.metrics.c, int):void");
    }

    private void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (this.L != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 3;
            if (cVar != null) {
                Bundle bundle = new Bundle();
                bundle.putString("metrics_data_lrid", cVar.t());
                messageObtain.setData(bundle);
            }
            this.L.sendMessage(messageObtain);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (this.L != null) {
            if (TextUtils.isEmpty(str)) {
                str = "load fail exception";
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = 4;
            messageObtain.obj = str;
            messageObtain.arg1 = i10;
            if (cVar != null) {
                cVar.b(true);
                Bundle bundle = new Bundle();
                bundle.putString("metrics_data_lrid", cVar.t());
                messageObtain.setData(bundle);
            }
            if (str.contains("exception")) {
                this.L.sendMessageAtFrontOfQueue(messageObtain);
            } else {
                this.L.sendMessage(messageObtain);
            }
        }
    }

    private void a(j jVar, CampaignEx campaignEx) {
        if (jVar == null || jVar.a(campaignEx.getId())) {
            return;
        }
        com.mbridge.msdk.foundation.entity.g gVar = new com.mbridge.msdk.foundation.entity.g();
        gVar.a(campaignEx.getId());
        gVar.b(campaignEx.getFca());
        gVar.c(campaignEx.getFcb());
        gVar.a(0);
        gVar.d(0);
        gVar.a(System.currentTimeMillis());
        jVar.b(gVar);
    }

    private void a(String str, String str2, List<CampaignEx> list) {
        if (com.mbridge.msdk.videocommon.cache.a.a() != null) {
            com.mbridge.msdk.videocommon.cache.a.a().a(str, str2, list);
        }
    }

    public void a(com.mbridge.msdk.reward.adapter.a aVar) {
        this.f50254j = aVar;
    }

    public void a(a.j jVar) {
        this.f50255k = jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.mbridge.msdk.reward.adapter.d a(com.mbridge.msdk.foundation.entity.CampaignUnit r6) throws java.lang.Throwable {
        /*
            r5 = this;
            r5.f50269y = r6
            com.mbridge.msdk.reward.adapter.d r0 = r5.b(r6)
            com.mbridge.msdk.reward.candidate.a r1 = new com.mbridge.msdk.reward.candidate.a
            java.lang.String r2 = r5.f50246b
            boolean r3 = r5.f50262r
            r1.<init>(r2, r3)
            java.util.concurrent.CopyOnWriteArrayList r2 = r0.b()
            java.lang.String r3 = r5.C
            java.lang.String r4 = r5.f50246b
            r1.a(r2, r3, r5, r4)
            java.util.concurrent.CopyOnWriteArrayList r1 = r0.b()
            boolean r2 = r0.e()
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L43
            int r2 = r0.d()
            if (r2 != 0) goto L30
            r1.clear()
            goto L3d
        L30:
            boolean r2 = r0.a()
            if (r2 == 0) goto L3d
            com.mbridge.msdk.foundation.same.report.metrics.c r6 = r6.getMetricsData()
            r5.b(r6)
        L3d:
            int r6 = r0.c()
            if (r6 == 0) goto L45
        L43:
            r6 = r4
            goto L46
        L45:
            r6 = r3
        L46:
            r5.a(r1, r4, r3, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.c.a(com.mbridge.msdk.foundation.entity.CampaignUnit):com.mbridge.msdk.reward.adapter.d");
    }

    public void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, boolean z10, boolean z11, boolean z12) {
        com.mbridge.msdk.foundation.same.report.metrics.c metricsData;
        try {
            if (z11) {
                this.V = copyOnWriteArrayList;
                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>(copyOnWriteArrayList);
                this.W = copyOnWriteArrayList2;
                metricsData = a((List<CampaignEx>) copyOnWriteArrayList2);
            } else {
                metricsData = this.f50269y.getMetricsData();
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardMVVideoAdapter", e10.getMessage());
            }
            metricsData = null;
        }
        a(this.f50269y, copyOnWriteArrayList);
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
            q0.c("RewardMVVideoAdapter", "onload load success size:" + copyOnWriteArrayList.size());
            if (z10) {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                if (z11) {
                    eVar.a(Reporting.EventType.CACHE, 1);
                } else {
                    eVar.a(Reporting.EventType.CACHE, 2);
                }
                if (metricsData != null) {
                    metricsData.a("2000127", eVar);
                    metricsData.a("2000048", eVar);
                }
                a(metricsData);
            }
            List<CampaignEx> listB = com.mbridge.msdk.videocommon.cache.a.a().b(this.f50246b, 1, this.f50263s);
            if (listB != null && listB.size() > 0 && metricsData != null) {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar2 = new com.mbridge.msdk.foundation.same.report.metrics.e();
                CampaignEx campaignEx = copyOnWriteArrayList.get(0);
                eVar2.a("cid", campaignEx.getId());
                eVar2.a("price", "");
                eVar2.a("bid_tk", this.C);
                eVar2.a("lrid", campaignEx.getLocalRequestId());
                CampaignEx campaignEx2 = listB.get(0);
                eVar2.a("cid_old", com.mbridge.msdk.foundation.same.c.a(listB));
                eVar2.a("price_old", "");
                eVar2.a("bid_tk_old", campaignEx2.getBidToken());
                eVar2.a("lrid_old", campaignEx2.getLocalRequestId());
                metricsData.a("m_load_overwrite", eVar2);
                com.mbridge.msdk.reward.report.metrics.a.a().a("m_load_overwrite", metricsData);
            }
            if (z12) {
                a(copyOnWriteArrayList);
                return;
            } else {
                this.U = "campaign filtered";
                a(880021, "campaign filtered", metricsData);
                return;
            }
        }
        q0.c("RewardMVVideoAdapter", "onload load fail, callback campaign have not video");
        if (TextUtils.isEmpty(this.U)) {
            this.U = "APP ALREADY INSTALLED";
        }
        a(this.U.contains("INSTALL") ? 880021 : 880003, this.U, metricsData);
    }

    public void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        CampaignUnit campaignUnit = this.f50269y;
        if (campaignUnit != null) {
            a(campaignUnit.getSessionId());
        }
        b(copyOnWriteArrayList);
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
            q0.c("RewardMVVideoAdapter", "#######onload 把广告存在本地 size:" + copyOnWriteArrayList.size());
            a(this.f50247c, this.f50246b, copyOnWriteArrayList);
        }
        CampaignEx campaignEx = copyOnWriteArrayList.get(0);
        this.f50270z = copyOnWriteArrayList;
        a(campaignEx);
    }

    private void a(CampaignEx campaignEx) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>(this.f50270z);
        boolean zIsEmpty = TextUtils.isEmpty(campaignEx.getCMPTEntryUrl());
        boolean z10 = !zIsEmpty;
        int nscpt = campaignEx.getNscpt();
        this.O = false;
        this.P = false;
        synchronized (this.f50259o) {
            try {
                if (this.Q) {
                    this.Q = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.S = false;
        this.R = false;
        if (this.f50263s) {
            com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(campaignEx.getBidToken(), campaignEx.getCampaignUnitId(), campaignEx.getEncryptPrice());
        }
        com.mbridge.msdk.reward.adapter.b.b().a(this.f50245a, z10, nscpt, this.f50263s, this.f50262r ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94, this.f50247c, this.f50246b, campaignEx.getRequestId(), copyOnWriteArrayList, new C0551c(campaignEx, z10, copyOnWriteArrayList, nscpt), new d(campaignEx, z10, copyOnWriteArrayList, nscpt));
        if (zIsEmpty) {
            return;
        }
        com.mbridge.msdk.reward.adapter.b.b().a(this.f50245a, campaignEx, this.f50247c, this.f50246b, campaignEx.getRequestId(), new e(campaignEx, copyOnWriteArrayList, z10, nscpt));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, List<CampaignEx> list, List<CampaignEx> list2, boolean z10) {
        com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d())).a(str, list, list2, z10);
        if (list2 != null && list2.size() > 0) {
            for (CampaignEx campaignEx : list2) {
                if (campaignEx.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx.getRewardTemplateMode().j())) {
                    com.mbridge.msdk.videocommon.a.e(str + "_" + campaignEx.getId() + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().j());
                    com.mbridge.msdk.videocommon.a.b(campaignEx.getAdType(), campaignEx);
                }
            }
        }
        if (z10) {
            a(str, list, list2);
        }
        if (list == null || list.size() <= 0) {
            return;
        }
        try {
            CampaignEx campaignEx2 = list.get(0);
            com.mbridge.msdk.reward.candidate.a aVar = new com.mbridge.msdk.reward.candidate.a(str, this.f50262r);
            if (campaignEx2 == null || !TextUtils.isEmpty(campaignEx2.getNLRid())) {
                return;
            }
            aVar.a(campaignEx2.getLocalRequestId(), campaignEx2.getRequestId(), 1, campaignEx2.getEcppv());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(java.lang.String r12, java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r13, java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r14) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.c.a(java.lang.String, java.util.List, java.util.List):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, List<CampaignEx> list, boolean z10, String str2) {
        if (!TextUtils.isEmpty(str) && list != null && list.size() > 0) {
            CampaignEx campaignEx = list.get(0);
            if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getEcppv()) && !TextUtils.isEmpty(str2)) {
                com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d())).a(str, (CampaignEx) null, z10, str2);
                return;
            } else {
                com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d())).a(str, list, z10);
                return;
            }
        }
        com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d())).a(str, (CampaignEx) null, z10, str2);
    }

    private void a(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        try {
            com.mbridge.msdk.foundation.same.c.a(campaignEx, this.f50245a, cVar, new f());
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    private void a(CampaignUnit campaignUnit, List<CampaignEx> list) {
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new g(campaignUnit));
    }

    private void a(String str) {
        if (a1.b(str)) {
            com.mbridge.msdk.reward.controller.a.f50342c0 = str;
        }
    }

    public void a(int i10, int i11, int i12) {
        this.f50266v = i10;
        this.f50267w = i11;
        this.f50268x = i12;
    }

    public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (this.f50256l != null && TextUtils.isEmpty(str)) {
            int iQ = this.f50256l.q() * 1000;
            List<CampaignEx> list = this.X;
            if (list != null && list.size() > 0) {
                if (System.currentTimeMillis() - this.X.get(0).getTimestamp() < iQ) {
                    b("hit ltorwc", cVar);
                    return;
                }
            }
        }
        b(str, this.A, cVar);
    }

    public void a(String str, boolean z10, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        com.mbridge.msdk.foundation.same.threadpool.a.f().execute(new i(str, cVar));
        if (this.L != null) {
            h hVar = new h(str, cVar);
            this.D = hVar;
            this.L.postDelayed(hVar, 90000L);
            return;
        }
        b(str, z10, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.mbridge.msdk.foundation.same.report.metrics.c a(Message message) {
        com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
        if (message != null) {
            try {
                Bundle data = message.getData();
                if (data != null) {
                    return com.mbridge.msdk.foundation.same.report.metrics.d.b().b(data.getString("metrics_data_lrid"));
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }
        return cVar;
    }

    private com.mbridge.msdk.foundation.same.report.metrics.c a(List<CampaignEx> list) {
        com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
        String localRequestId = "";
        if (list != null) {
            try {
                if (list.size() > 0) {
                    if (list.get(0) != null) {
                        localRequestId = list.get(0).getLocalRequestId();
                    }
                    if (com.mbridge.msdk.foundation.same.report.metrics.d.b().c().containsKey(localRequestId)) {
                        com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = com.mbridge.msdk.foundation.same.report.metrics.d.b().c().get(localRequestId);
                        if (cVar2 == null) {
                            try {
                                cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
                            } catch (Exception e10) {
                                e = e10;
                                cVar = cVar2;
                                if (MBridgeConstans.DEBUG) {
                                    e.printStackTrace();
                                }
                                return cVar;
                            }
                        } else {
                            cVar = cVar2;
                        }
                    }
                    cVar.i(localRequestId);
                    cVar.b(list);
                }
            } catch (Exception e11) {
                e = e11;
            }
        }
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a(Reporting.EventType.CACHE, 1);
        eVar.a(CampaignEx.JSON_KEY_HB, 1);
        eVar.a("auto_load", 2);
        cVar.a("2000127", eVar);
        cVar.a("2000048", eVar);
        cVar.a(this.f50262r ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94);
        cVar.h("1");
        cVar.f("2");
        if (!TextUtils.isEmpty(localRequestId)) {
            com.mbridge.msdk.foundation.same.report.metrics.d.b().c().put(localRequestId, cVar);
        }
        return cVar;
    }

    private void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, com.mbridge.msdk.foundation.same.report.metrics.e eVar, List<CampaignEx> list) {
        if (cVar != null) {
            if (list != null) {
                try {
                    if (list.size() > 0) {
                        cVar.b(list);
                        CampaignEx campaignEx = list.get(0);
                        if (campaignEx != null) {
                            cVar.i(campaignEx.getLocalRequestId());
                        }
                        cVar.b(list);
                    }
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        e10.printStackTrace();
                        return;
                    }
                    return;
                }
            }
            a(false, cVar, eVar);
        }
    }

    private void a(boolean z10, com.mbridge.msdk.foundation.same.report.metrics.c cVar, List<CampaignEx> list) {
        if (cVar == null) {
            cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
        }
        if (list != null && list.size() > 0) {
            CampaignEx campaignEx = list.get(0);
            if (campaignEx != null) {
                cVar.i(campaignEx.getLocalRequestId());
            }
            cVar.b(list);
        }
        a(z10, cVar, (com.mbridge.msdk.foundation.same.report.metrics.e) null);
    }

    private void a(boolean z10, com.mbridge.msdk.foundation.same.report.metrics.c cVar, com.mbridge.msdk.foundation.same.report.metrics.e eVar) {
        if (eVar == null) {
            eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        }
        cVar.n(this.f50246b);
        cVar.a(this.f50262r ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94);
        eVar.a("result", Integer.valueOf(z10 ? 1 : 2));
        eVar.a("bid_tk", this.C);
        eVar.a(CampaignEx.JSON_KEY_HB, Integer.valueOf(this.f50263s ? 1 : 0));
        cVar.a("m_offer_ready", eVar);
        com.mbridge.msdk.reward.report.metrics.a.a().a("m_offer_ready", cVar);
    }
}
