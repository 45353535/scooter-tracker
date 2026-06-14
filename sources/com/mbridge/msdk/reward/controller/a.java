package com.mbridge.msdk.reward.controller;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.cache.a;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.foundation.tools.y0;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import com.mbridge.msdk.reward.adapter.b;
import com.mbridge.msdk.videocommon.a;
import com.mbridge.msdk.videocommon.listener.InterVideoOutListener;
import com.taurusx.tax.w.s.s;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static String f50341b0 = "";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static String f50342c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static ConcurrentHashMap<String, Integer> f50343d0 = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static ConcurrentHashMap<String, String> f50344e0 = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static ConcurrentHashMap<String, i> f50345f0 = new ConcurrentHashMap<>();
    private Queue<Integer> I;
    private String J;
    private CopyOnWriteArrayList<CampaignEx> S;
    private List<CampaignEx> T;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f50346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.reward.adapter.c f50348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.setting.c f50349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.setting.a f50350d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile InterVideoOutListener f50351e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile h f50352f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f50353g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f50354h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MBridgeIds f50355i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    g f50356j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f50357k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private volatile String f50358l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f50359m;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f50363q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f50364r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f50365s;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f50370x;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f50360n = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f50362p = 2;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f50366t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f50367u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f50368v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f50369w = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f50371y = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private String f50372z = "";
    private String A = "";
    private ArrayList<Integer> B = new ArrayList<>(7);
    private boolean C = false;
    private final Object D = new Object();
    public boolean E = false;
    int F = 25;
    int G = 1;
    private List<CampaignEx> H = new ArrayList();
    private com.mbridge.msdk.foundation.db.g K = null;
    private volatile boolean L = true;
    private volatile boolean M = false;
    private volatile boolean N = false;
    private volatile boolean O = false;
    private volatile boolean P = false;
    private volatile boolean Q = false;
    private volatile boolean R = false;
    volatile boolean U = false;
    volatile boolean V = false;
    volatile boolean W = false;
    volatile boolean X = false;
    volatile boolean Y = false;
    private JSONArray Z = new JSONArray();

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private int f50347a0 = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Handler f50361o = new com.mbridge.msdk.reward.controller.b(this);

    /* JADX INFO: renamed from: com.mbridge.msdk.reward.controller.a$a, reason: collision with other inner class name */
    class C0555a implements com.mbridge.msdk.videocommon.net.c {
        C0555a() {
        }

        @Override // com.mbridge.msdk.videocommon.net.c
        public void a(String str) {
        }

        @Override // com.mbridge.msdk.videocommon.net.c
        public void onFailed(String str) {
        }
    }

    class c implements b.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        com.mbridge.msdk.foundation.same.report.metrics.c f50393a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f50394b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CopyOnWriteArrayList f50395c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f50396d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f50397e;

        c(CampaignEx campaignEx, CopyOnWriteArrayList copyOnWriteArrayList, boolean z10, int i10) {
            this.f50394b = campaignEx;
            this.f50395c = copyOnWriteArrayList;
            this.f50396d = z10;
            this.f50397e = i10;
            this.f50393a = com.mbridge.msdk.foundation.same.report.metrics.d.b().c().get(campaignEx.getLocalRequestId());
        }

        @Override // com.mbridge.msdk.reward.adapter.b.n
        public void a(String str, String str2, String str3, String str4) {
        }

        @Override // com.mbridge.msdk.reward.adapter.b.n
        public void a(String str, String str2, com.mbridge.msdk.foundation.error.b bVar) {
            String unitId = bVar == null ? "" : bVar.j().getUnitId();
            a aVar = a.this;
            aVar.c(unitId, (List<CampaignEx>) aVar.T);
            if (bVar != null) {
                bVar.c("errorCode: 3202 errorMessage: temp resource download failed");
            }
            if (this.f50393a == null) {
                this.f50393a = new com.mbridge.msdk.foundation.same.report.metrics.c();
            }
            this.f50393a.b(this.f50395c);
            this.f50393a.a(bVar);
            if (!this.f50396d && a.this.f50352f != null) {
                if (a.this.X) {
                    return;
                }
                a.this.X = true;
                a.this.f50352f.b(bVar, this.f50393a);
                return;
            }
            if (this.f50397e != 1 || a.this.X || a.this.f50352f == null) {
                return;
            }
            a.this.X = true;
            a.this.f50352f.b(bVar, this.f50393a);
        }
    }

    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (a.this.K == null) {
                    a.this.K = com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d());
                }
                com.mbridge.msdk.foundation.db.h hVarA = com.mbridge.msdk.foundation.db.h.a(a.this.K);
                if (hVarA != null) {
                    hVarA.b(a.this.f50354h);
                }
            } catch (Throwable unused) {
                q0.b("RewardVideoController", "can't find DailyPlayCapDao");
            }
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.mbridge.msdk.reward.adapter.c f50412a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f50413b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f50414c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f50415d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f50416e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f50417f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private com.mbridge.msdk.foundation.same.report.metrics.c f50418g;

        public f(com.mbridge.msdk.reward.adapter.c cVar, int i10, boolean z10, String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar2) {
            this.f50412a = cVar;
            this.f50413b = i10;
            this.f50414c = z10;
            if (cVar != null) {
                cVar.c(false);
            }
            this.f50417f = str;
            this.f50418g = cVar2;
        }

        public void a() {
            this.f50415d = true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f50415d) {
                return;
            }
            com.mbridge.msdk.reward.adapter.c cVar = this.f50412a;
            if (cVar != null) {
                cVar.c(true);
            }
            q0.b("RewardVideoController", "adSource=" + this.f50413b + " CommonCancelTimeTask mIsDevCall：" + this.f50414c);
            a.this.a(com.mbridge.msdk.foundation.error.a.a(880023, "v3 is timeout"), this.f50418g);
        }

        public void a(int i10) {
            this.f50416e = i10;
        }
    }

    public class g implements com.mbridge.msdk.reward.adapter.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.reward.adapter.c f50420a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f50421b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private f f50422c;

        public g(com.mbridge.msdk.reward.adapter.c cVar, boolean z10) {
            this.f50420a = cVar;
            this.f50421b = z10;
        }

        public void a(f fVar) {
            this.f50422c = fVar;
        }

        @Override // com.mbridge.msdk.reward.adapter.a
        public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            f fVar = this.f50422c;
            if (fVar != null) {
                fVar.a();
                a.this.f50361o.removeCallbacks(this.f50422c);
            }
            if (a.this.f50352f != null) {
                a.this.f50352f.a(a.this.f50358l, a.this.f50354h, cVar);
            }
        }

        @Override // com.mbridge.msdk.reward.adapter.a
        public void a(List<CampaignEx> list, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            f fVar = this.f50422c;
            if (fVar != null) {
                fVar.a();
                a.this.f50361o.removeCallbacks(this.f50422c);
            }
            a.this.a(list);
            if (a.this.f50352f != null) {
                if (list != null && list.size() == 1) {
                    CampaignEx campaignEx = list.get(0);
                    if (!com.mbridge.msdk.foundation.same.c.a(a.this.f50346a, campaignEx) && campaignEx.getFilterAdsVideoCallState() == 0) {
                        if (a.this.f50347a0 <= 1) {
                            com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880020, "load exception second");
                            if (cVar != null) {
                                cVar.a(bVarA);
                                cVar.b(true);
                            }
                            a.this.f50352f.a(bVarA, cVar);
                            return;
                        }
                        a.m(a.this);
                        return;
                    }
                }
                a.this.f50352f.c(a.this.f50358l, a.this.f50354h, cVar);
            }
        }

        @Override // com.mbridge.msdk.reward.adapter.a
        public void a(List<CampaignEx> list, com.mbridge.msdk.foundation.error.b bVar, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            f fVar = this.f50422c;
            if (fVar != null) {
                fVar.a();
                a.this.f50361o.removeCallbacks(this.f50422c);
            }
            com.mbridge.msdk.reward.adapter.c cVar2 = this.f50420a;
            if (cVar2 != null) {
                cVar2.a((com.mbridge.msdk.reward.adapter.a) null);
                this.f50420a = null;
            }
            a.this.a(list);
            if (a.this.f50352f != null) {
                a.this.f50352f.a(bVar, cVar);
            }
        }
    }

    public final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<InterVideoOutListener> f50424a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile AtomicInteger f50425b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Handler f50426c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f50427d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f50428e;

        /* synthetic */ h(a aVar, InterVideoOutListener interVideoOutListener, Handler handler, String str, C0555a c0555a) {
            this(interVideoOutListener, handler, str);
        }

        public void c(String str, String str2, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            Handler handler = this.f50426c;
            if (handler != null) {
                handler.removeMessages(1001002);
            }
            WeakReference<InterVideoOutListener> weakReference = this.f50424a;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if (this.f50425b.get() == 2 || this.f50426c == null) {
                return;
            }
            a.m(a.this);
            this.f50425b.set(2);
            if (a.this.O) {
                return;
            }
            a.this.O = true;
            if (cVar == null) {
                cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
            }
            cVar.b(a.this.H);
            a.this.a("2000048", cVar, interVideoOutListener);
            if (interVideoOutListener != null) {
                Message messageObtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                bundle.putString("metrics_data_lrid", cVar.t());
                messageObtain.setData(bundle);
                messageObtain.obj = str2;
                messageObtain.what = 9;
                this.f50426c.sendMessage(messageObtain);
            }
        }

        public void d(String str, String str2, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            Handler handler = this.f50426c;
            if (handler != null) {
                handler.removeMessages(1001002);
            }
            WeakReference<InterVideoOutListener> weakReference = this.f50424a;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if (this.f50425b.get() == 2 || this.f50426c == null) {
                return;
            }
            if (this.f50425b.get() == 1) {
                this.f50425b.set(3);
            }
            if (a.this.O) {
                return;
            }
            a.this.O = true;
            if (cVar == null) {
                cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
            }
            cVar.a(true);
            cVar.b(a.this.H);
            a.this.a("2000048", cVar, interVideoOutListener);
            if (interVideoOutListener != null) {
                Message messageObtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                bundle.putSerializable("metrics_data_lrid", cVar.t());
                messageObtain.setData(bundle);
                messageObtain.obj = str2;
                messageObtain.what = 9;
                this.f50426c.sendMessage(messageObtain);
            }
            if (a.this.P) {
                this.f50425b.set(2);
            }
        }

        private h(InterVideoOutListener interVideoOutListener, Handler handler, String str) {
            this.f50424a = new WeakReference<>(interVideoOutListener);
            this.f50425b = new AtomicInteger(0);
            this.f50426c = handler;
            this.f50427d = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String str, String str2, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            WeakReference<InterVideoOutListener> weakReference = this.f50424a;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if (this.f50426c == null || a.this.N) {
                return;
            }
            a.this.N = true;
            a.this.a("2000127", cVar, interVideoOutListener);
            if (interVideoOutListener != null) {
                Message messageObtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                bundle.putBoolean(MBridgeConstans.PROPERTIES_IS_CACHED_CAMPAIGN, true);
                if (cVar != null) {
                    bundle.putString("metrics_data_lrid", cVar.t());
                }
                messageObtain.setData(bundle);
                messageObtain.obj = str2;
                messageObtain.what = 17;
                this.f50426c.sendMessage(messageObtain);
                if (s0.a().a("l_s_i_l_v_s", false)) {
                    d(str, str2, cVar);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int a() {
            return this.f50425b.get();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(int i10) {
            this.f50425b.set(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str, String str2, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            WeakReference<InterVideoOutListener> weakReference = this.f50424a;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if ((this.f50425b.get() != 1 && this.f50425b.get() != 3) || this.f50426c == null || a.this.N) {
                return;
            }
            a.this.N = true;
            a.this.a("2000127", cVar, interVideoOutListener);
            if (interVideoOutListener != null) {
                Message messageObtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                bundle.putBoolean(MBridgeConstans.PROPERTIES_IS_CACHED_CAMPAIGN, false);
                if (cVar != null) {
                    bundle.putString("metrics_data_lrid", cVar.t());
                }
                messageObtain.setData(bundle);
                messageObtain.obj = str2;
                messageObtain.what = 17;
                this.f50426c.sendMessage(messageObtain);
                if (s0.a().a("l_s_i_l_v_s", false)) {
                    c(str, str2, cVar);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            WeakReference<InterVideoOutListener> weakReference = this.f50424a;
            a.this.a("2000047", cVar, weakReference != null ? weakReference.get() : null);
            if (this.f50426c != null) {
                Message messageObtain = Message.obtain();
                messageObtain.obj = str;
                messageObtain.what = 18;
                if (cVar != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("metrics_data_lrid", cVar.t());
                    messageObtain.setData(bundle);
                }
                this.f50426c.sendMessage(messageObtain);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0077 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(com.mbridge.msdk.foundation.error.b r12, com.mbridge.msdk.foundation.same.report.metrics.c r13) {
            /*
                Method dump skipped, instruction units count: 344
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.controller.a.h.a(com.mbridge.msdk.foundation.error.b, com.mbridge.msdk.foundation.same.report.metrics.c):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(com.mbridge.msdk.foundation.error.b bVar, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            String strL;
            WeakReference<InterVideoOutListener> weakReference = this.f50424a;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if (this.f50425b.get() == 2 || this.f50426c == null) {
                return;
            }
            a.this.Q = true;
            if (bVar != null) {
                strL = bVar.l();
            } else {
                strL = "";
            }
            if (strL.contains("resource load timeout")) {
                a.this.P = true;
            }
            if (a.this.Q && a.this.P && !a.this.O) {
                this.f50425b.set(2);
                if (interVideoOutListener != null) {
                    Message messageObtain = Message.obtain();
                    messageObtain.obj = strL;
                    messageObtain.what = 16;
                    if (cVar != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("metrics_data_lrid", cVar.t());
                        messageObtain.setData(bundle);
                    }
                    this.f50426c.sendMessage(messageObtain);
                }
                if (cVar == null) {
                    cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
                }
                cVar.a(true);
                a.this.a("2000047", cVar, interVideoOutListener);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            this.f50425b.set(2);
            b(str, cVar);
        }

        public void a(boolean z10) {
            this.f50428e = z10;
        }
    }

    public final class i extends com.mbridge.msdk.video.bt.module.orglistener.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private a f50430c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Handler f50431d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f50432e;

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.controller.a$i$a, reason: collision with other inner class name */
        class RunnableC0562a implements Runnable {
            RunnableC0562a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (i.this.f50430c != null) {
                    i.this.f50430c.a(false, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(0, a.this.f50366t ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94, a.this.f50354h, true, 1));
                }
            }
        }

        /* synthetic */ i(a aVar, a aVar2, Handler handler, C0555a c0555a) {
            this(aVar2, handler);
        }

        @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
        public void b(String str, String str2) {
            try {
                a aVar = this.f50430c;
                if (aVar == null || aVar.f50351e == null) {
                    return;
                }
                try {
                    this.f50430c.f50351e.onVideoComplete(a.this.f50355i);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardVideoController", e10.getMessage());
                    }
                }
                this.f50432e = 5;
            } catch (Exception e11) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoController", e11.getMessage());
                }
            }
        }

        public void e() {
            a.this.B.clear();
            this.f50430c = null;
        }

        private i(a aVar, Handler handler) {
            this.f50432e = 0;
            this.f50430c = aVar;
            this.f50431d = handler;
        }

        @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
        public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            a.this.E = false;
            try {
                com.mbridge.msdk.reward.candidate.a aVar = new com.mbridge.msdk.reward.candidate.a(a.this.f50354h, a.this.f50366t);
                a aVar2 = this.f50430c;
                aVar.a(cVar.t(), (aVar2 == null || aVar2.f50348b == null) ? "" : this.f50430c.f50348b.H, 3, a.f50341b0);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoController", e10.getMessage());
                }
            }
            try {
                a aVar3 = this.f50430c;
                if (aVar3 != null) {
                    aVar3.C = true;
                    if (this.f50430c.f50348b != null) {
                        this.f50430c.f50348b.H = "";
                    }
                    this.f50430c.q();
                    if (a.this.f50367u) {
                        a.this.a();
                    }
                    a aVar4 = a.this;
                    aVar4.a("2000130", cVar, aVar4.f50351e, "");
                    b();
                    if (this.f50430c.f50351e != null) {
                        this.f50430c.f50351e.onAdShow(a.this.f50355i);
                        this.f50432e = 2;
                    }
                }
            } catch (Throwable th2) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoController", th2.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
        public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, boolean z10, com.mbridge.msdk.videocommon.entity.c cVar2) {
            try {
                a aVar = this.f50430c;
                if (aVar != null && aVar.f50351e != null) {
                    if (cVar2 == null) {
                        cVar2 = com.mbridge.msdk.videocommon.entity.c.a(this.f50430c.f50359m);
                    }
                    if (a.this.f50367u) {
                        a.this.a();
                        a.this.v();
                        com.mbridge.msdk.foundation.same.buffer.b.d(a.this.f50354h, a.this.m());
                    }
                    this.f50430c.f50351e.onAdClose(a.this.f50355i, new RewardInfo(z10, cVar2.c(), String.valueOf(cVar2.a())));
                    this.f50432e = 7;
                    this.f50430c.C = false;
                    e();
                }
                com.mbridge.msdk.foundation.same.report.metrics.d.b().b("2000152", cVar, null);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoController", e10.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
        public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, String str) {
            try {
                a aVar = a.this;
                aVar.E = false;
                if (this.f50430c != null) {
                    if (aVar.f50367u) {
                        a.this.a();
                    }
                    this.f50430c.C = false;
                    a.this.a("2000131", cVar, this.f50430c.f50351e, str);
                    a();
                    if (this.f50430c.f50351e != null) {
                        try {
                            this.f50430c.f50351e.onShowFail(cVar, a.this.f50355i, str);
                        } catch (Exception e10) {
                            if (MBridgeConstans.DEBUG) {
                                q0.b("RewardVideoController", e10.getMessage());
                            }
                        }
                        this.f50432e = 4;
                    }
                }
            } catch (Exception e11) {
                this.f50432e = 0;
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoController", e11.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
        public void a(boolean z10, String str, String str2) {
            try {
                a aVar = this.f50430c;
                if (aVar == null || aVar.f50351e == null) {
                    return;
                }
                if (a.this.f50367u) {
                    a.this.a();
                }
                this.f50430c.C = false;
                try {
                    this.f50430c.f50351e.onVideoAdClicked(z10, a.this.f50355i);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardVideoController", e10.getMessage());
                    }
                }
            } catch (Exception e11) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoController", e11.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
        public void a(boolean z10, int i10) {
            try {
                a aVar = this.f50430c;
                if (aVar == null || aVar.f50351e == null) {
                    return;
                }
                try {
                    this.f50430c.f50351e.onAdCloseWithIVReward(a.this.f50355i, new RewardInfo(z10, i10));
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardVideoController", e10.getMessage());
                    }
                }
            } catch (Exception e11) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoController", e11.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
        public void a(String str, String str2) {
            try {
                a aVar = this.f50430c;
                if (aVar == null || aVar.f50351e == null) {
                    return;
                }
                try {
                    this.f50430c.f50351e.onEndcardShow(a.this.f50355i);
                    com.mbridge.msdk.foundation.feedback.b.b().a(str2 + "_2", 2);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardVideoController", e10.getMessage());
                    }
                }
                this.f50432e = 6;
            } catch (Exception e11) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoController", e11.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
        public void a(int i10, String str, String str2) {
            this.f50432e = i10;
            a aVar = this.f50430c;
            if (aVar == null || aVar.f50367u || this.f50430c.f50366t || this.f50430c.f50349c == null || !this.f50430c.f50349c.a(this.f50432e) || this.f50430c.f50352f == null || this.f50430c.f50352f.a() == 1 || this.f50430c.f50352f.a() == 3 || a.this.B.contains(Integer.valueOf(this.f50432e))) {
                return;
            }
            a.this.B.add(Integer.valueOf(this.f50432e));
            int iF = this.f50430c.f50349c.f() * 1000;
            if (this.f50432e == 4) {
                iF = 3000;
            }
            Handler handler = this.f50431d;
            if (handler != null) {
                handler.removeMessages(1001001);
                this.f50431d.sendEmptyMessageDelayed(1001001, iF);
            } else {
                new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0562a(), iF);
            }
        }
    }

    public class j {
        public j() {
        }

        public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            a.this.f50347a0++;
            a aVar = a.this;
            aVar.b(aVar.f50370x, str, cVar);
        }
    }

    static /* synthetic */ int m(a aVar) {
        int i10 = aVar.f50347a0;
        aVar.f50347a0 = i10 - 1;
        return i10;
    }

    private void w() {
        com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(this.f50346a)).b(this.f50354h);
    }

    private void x() {
        try {
            List<CampaignEx> listC = com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(this.f50346a)).c(this.f50354h);
            if (listC == null || listC.size() <= 0) {
                return;
            }
            for (CampaignEx campaignEx : listC) {
                if (TextUtils.isEmpty(campaignEx.getCMPTEntryUrl())) {
                    com.mbridge.msdk.videocommon.a.b(campaignEx.getAdType(), campaignEx);
                } else {
                    com.mbridge.msdk.videocommon.a.e(this.f50354h + "_" + campaignEx.getRequestId() + "_" + campaignEx.getCMPTEntryUrl());
                    if (campaignEx.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx.getRewardTemplateMode().j())) {
                        com.mbridge.msdk.videocommon.a.e(this.f50354h + "_" + campaignEx.getId() + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().j());
                    }
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoController", e10.getMessage());
            }
        }
    }

    public void f(boolean z10) {
        this.f50371y = z10;
    }

    public MBridgeIds g() {
        return this.f50355i;
    }

    public List<CampaignEx> h() {
        return this.T;
    }

    public CopyOnWriteArrayList<CampaignEx> i() {
        return this.S;
    }

    public String j() {
        com.mbridge.msdk.reward.adapter.c cVar = this.f50348b;
        return cVar != null ? cVar.g() : "";
    }

    public h k() {
        return this.f50352f;
    }

    public String l() {
        return this.f50358l;
    }

    public String m() {
        com.mbridge.msdk.reward.adapter.c cVar = this.f50348b;
        return cVar != null ? cVar.a(this.C) : "";
    }

    public com.mbridge.msdk.reward.adapter.c n() {
        return this.f50348b;
    }

    public InterVideoOutListener o() {
        return this.f50351e;
    }

    public String p() {
        return this.f50354h;
    }

    public void q() {
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new e());
    }

    public boolean r() {
        return this.f50367u;
    }

    public boolean s() {
        return this.f50370x;
    }

    public boolean t() {
        return this.f50366t;
    }

    public boolean u() {
        return (this.f50351e == null || this.f50352f == null) ? false : true;
    }

    public void v() {
        ConcurrentHashMap<String, String> concurrentHashMap;
        if (!this.C || (concurrentHashMap = f50344e0) == null || concurrentHashMap.containsKey(m())) {
            return;
        }
        f50344e0.remove(m());
    }

    private com.mbridge.msdk.foundation.same.report.metrics.c b(boolean z10, String str, com.mbridge.msdk.foundation.same.report.metrics.e eVar) {
        com.mbridge.msdk.foundation.same.report.metrics.c cVar;
        String strA;
        com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = new com.mbridge.msdk.foundation.same.report.metrics.c();
        try {
            b(z10);
            if (TextUtils.isEmpty(str)) {
                strA = SameMD5.getMD5(v0.d());
            } else {
                strA = a(str);
            }
            this.A = strA;
            cVar2 = com.mbridge.msdk.foundation.same.report.metrics.d.b().b(strA);
            if (cVar2 == null) {
                cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
                try {
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().c().put(strA, cVar);
                    cVar.d(true);
                    cVar2 = cVar;
                } catch (Exception e10) {
                    e = e10;
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardVideoController", e.getMessage());
                    }
                    return cVar;
                }
            }
            cVar2.i(strA);
            cVar2.n(this.f50354h);
            if (eVar != null) {
                if (eVar.a("adtp")) {
                    cVar2.a(Integer.parseInt((String) eVar.b("adtp")));
                }
                if (eVar.a(CampaignEx.JSON_KEY_HB)) {
                    String str2 = (String) eVar.b(CampaignEx.JSON_KEY_HB);
                    cVar2.h(str2);
                    if (str2.equals("1")) {
                        cVar2.g(str);
                    }
                }
            }
            cVar2.f(z10 ? "2" : "1");
            if (z10) {
                com.mbridge.msdk.reward.report.metrics.a.a().a("2000123", cVar2);
            }
            return cVar2;
        } catch (Exception e11) {
            e = e11;
            cVar = cVar2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str, List<CampaignEx> list) {
        if (list != null) {
            try {
                if (list.size() <= 0 || this.O) {
                    return;
                }
                com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d())).b(list, str);
            } catch (Throwable th2) {
                q0.b("RewardVideoController", th2.getMessage());
            }
        }
    }

    private void f() {
        com.mbridge.msdk.reward.adapter.c cVar = new com.mbridge.msdk.reward.adapter.c(this.f50346a, this.f50358l, this.f50354h);
        this.f50348b = cVar;
        cVar.d(this.f50366t);
        this.f50348b.e(this.f50367u);
        if (this.f50366t) {
            this.f50348b.a(this.f50363q, this.f50364r, this.f50365s);
        }
        this.f50348b.a(this.f50349c);
    }

    public void d(boolean z10) {
        this.f50366t = z10;
        if (z10) {
            this.f50362p = com.mbridge.msdk.foundation.same.a.X;
        } else {
            this.f50362p = com.mbridge.msdk.foundation.same.a.W;
        }
    }

    public void e(boolean z10) {
        this.f50367u = z10;
    }

    class d implements b.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        com.mbridge.msdk.foundation.same.report.metrics.c f50399a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f50400b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CopyOnWriteArrayList f50401c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.reward.adapter.c f50402d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f50403e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f50404f;

        d(CampaignEx campaignEx, CopyOnWriteArrayList copyOnWriteArrayList, com.mbridge.msdk.reward.adapter.c cVar, boolean z10, int i10) {
            this.f50400b = campaignEx;
            this.f50401c = copyOnWriteArrayList;
            this.f50402d = cVar;
            this.f50403e = z10;
            this.f50404f = i10;
            this.f50399a = com.mbridge.msdk.foundation.same.report.metrics.d.b().c().get(campaignEx.getLocalRequestId());
        }

        @Override // com.mbridge.msdk.reward.adapter.b.n
        public void a(String str, String str2, String str3, String str4) {
            a.this.V = true;
            if (!a.this.U || a.this.W || a.this.f50361o == null) {
                return;
            }
            a.this.W = true;
            a.this.f50361o.post(new RunnableC0560a(str3, str, str2));
        }

        @Override // com.mbridge.msdk.reward.adapter.b.n
        public void a(String str, String str2, com.mbridge.msdk.foundation.error.b bVar) {
            String unitId;
            if (bVar != null) {
                unitId = bVar.j().getUnitId();
                bVar.c("errorCode: 3203 errorMessage: tpl temp resource download failed");
            } else {
                unitId = "";
            }
            a aVar = a.this;
            aVar.c(unitId, (List<CampaignEx>) aVar.T);
            if (this.f50399a == null) {
                this.f50399a = new com.mbridge.msdk.foundation.same.report.metrics.c();
            }
            this.f50399a.a(bVar);
            this.f50399a.b(this.f50401c);
            a.this.V = false;
            if (a.this.f50352f == null || a.this.X) {
                return;
            }
            a.this.X = true;
            a.this.f50352f.b(bVar, this.f50399a);
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.controller.a$d$a, reason: collision with other inner class name */
        class RunnableC0560a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f50406a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f50407b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f50408c;

            RunnableC0560a(String str, String str2, String str3) {
                this.f50406a = str;
                this.f50407b = str2;
                this.f50408c = str3;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.mbridge.msdk.reward.adapter.b bVarB = com.mbridge.msdk.reward.adapter.b.b();
                boolean z10 = a.this.f50371y;
                Handler handler = a.this.f50361o;
                boolean z11 = a.this.f50366t;
                boolean z12 = a.this.f50367u;
                String str = this.f50406a;
                String requestIdNotice = d.this.f50400b.getRequestIdNotice();
                String str2 = this.f50407b;
                String str3 = this.f50408c;
                String cMPTEntryUrl = d.this.f50400b.getCMPTEntryUrl();
                int i10 = a.this.f50362p;
                d dVar = d.this;
                bVarB.a(z10, handler, z11, z12, str, requestIdNotice, str2, str3, cMPTEntryUrl, i10, dVar.f50400b, dVar.f50401c, H5DownLoadManager.getInstance().getH5ResAddress(d.this.f50400b.getCMPTEntryUrl()), this.f50408c, a.this.f50349c, new C0561a(), true);
            }

            /* JADX INFO: renamed from: com.mbridge.msdk.reward.controller.a$d$a$a, reason: collision with other inner class name */
            class C0561a implements b.o {
                C0561a() {
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, String str4, String str5, a.C0600a c0600a) {
                    d dVar = d.this;
                    com.mbridge.msdk.reward.adapter.c cVar = dVar.f50402d;
                    if (cVar != null && cVar.a(dVar.f50401c, dVar.f50403e, dVar.f50404f)) {
                        if (a.this.f50352f == null || a.this.Y) {
                            return;
                        }
                        a.this.Y = true;
                        q0.a("RewardVideoController", "Cache onVideoLoadSuccess");
                        d dVar2 = d.this;
                        a.this.a(dVar2.f50401c);
                        d dVar3 = d.this;
                        com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = dVar3.f50399a;
                        if (cVar2 != null) {
                            cVar2.b(dVar3.f50401c);
                        }
                        a.this.f50352f.d(str2, str3, d.this.f50399a);
                        return;
                    }
                    a aVar = a.this;
                    aVar.c(str3, (List<CampaignEx>) aVar.T);
                    if (a.this.f50352f == null || a.this.X) {
                        return;
                    }
                    a.this.X = true;
                    com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880015, "errorCode: 3505 errorMessage: tpl temp preload success but isReady false");
                    d dVar4 = d.this;
                    if (dVar4.f50399a == null) {
                        dVar4.f50399a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    d dVar5 = d.this;
                    dVar5.f50399a.b(dVar5.f50401c);
                    d.this.f50399a.a(bVarA);
                    a.this.f50352f.b(bVarA, d.this.f50399a);
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, a.C0600a c0600a, com.mbridge.msdk.foundation.error.b bVar) {
                    RunnableC0560a runnableC0560a = RunnableC0560a.this;
                    a aVar = a.this;
                    aVar.c(runnableC0560a.f50408c, (List<CampaignEx>) aVar.T);
                    if (a.this.f50352f == null || a.this.X) {
                        return;
                    }
                    a.this.X = true;
                    if (bVar != null) {
                        bVar.c("errorCode: 3303 errorMessage: tpl temp preload failed");
                    }
                    d dVar = d.this;
                    if (dVar.f50399a == null) {
                        dVar.f50399a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    d dVar2 = d.this;
                    dVar2.f50399a.b(dVar2.f50401c);
                    d.this.f50399a.a(bVar);
                    a.this.f50352f.b(bVar, d.this.f50399a);
                }
            }
        }
    }

    public void e() {
        o0.b();
    }

    private boolean d() {
        if (this.f50348b == null) {
            f();
        }
        com.mbridge.msdk.reward.adapter.c cVar = this.f50348b;
        if (cVar != null) {
            return cVar.b(true);
        }
        return false;
    }

    public void c(String str, String str2) {
        try {
            this.f50346a = com.mbridge.msdk.foundation.controller.c.n().d();
            this.f50354h = str2;
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            this.f50358l = str;
            this.f50355i = new MBridgeIds(this.f50358l, this.f50354h);
            this.f50350d = com.mbridge.msdk.videocommon.setting.b.b().c();
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new com.mbridge.msdk.reward.controller.c(this.f50346a, this.f50354h));
            if (this.K == null) {
                this.K = com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d());
            }
        } catch (Throwable th2) {
            q0.b("RewardVideoController", th2.getMessage(), th2);
        }
    }

    public void a(int i10) {
        this.f50362p = i10;
    }

    private void d(String str, String str2) {
        try {
            com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
            cVar.n(this.f50354h);
            cVar.a(this.f50366t ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94);
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a(s.I, str);
            eVar.a("reason", str2);
            cVar.a("m_temp_is_ready_check", eVar);
            com.mbridge.msdk.reward.report.metrics.a.a().a("m_temp_is_ready_check", cVar);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public void a(String str, String str2, String str3, String str4) {
        if (!TextUtils.isEmpty(str)) {
            y0.b(this.f50346a, "MBridge_ConfirmTitle" + this.f50354h, str.trim());
        }
        if (!TextUtils.isEmpty(str2)) {
            y0.b(this.f50346a, "MBridge_ConfirmContent" + this.f50354h, str2.trim());
        }
        if (!TextUtils.isEmpty(str4)) {
            y0.b(this.f50346a, "MBridge_CancelText" + this.f50354h, str4.trim());
        }
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        y0.b(this.f50346a, "MBridge_ConfirmText" + this.f50354h, str3.trim());
    }

    class b implements b.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        com.mbridge.msdk.foundation.same.report.metrics.c f50374a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f50375b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f50376c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.reward.adapter.c f50377d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f50378e;

        b(CampaignEx campaignEx, boolean z10, com.mbridge.msdk.reward.adapter.c cVar, int i10) {
            this.f50375b = campaignEx;
            this.f50376c = z10;
            this.f50377d = cVar;
            this.f50378e = i10;
            this.f50374a = com.mbridge.msdk.foundation.same.report.metrics.d.b().c().get(campaignEx.getLocalRequestId());
        }

        @Override // com.mbridge.msdk.reward.adapter.b.h
        public void a(String str, String str2, String str3, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            a.this.U = true;
            if (this.f50376c) {
                if (!a.this.V || a.this.W || a.this.f50361o == null) {
                    return;
                }
                a.this.W = true;
                a.this.f50361o.post(new RunnableC0558b(str3, str, str2, copyOnWriteArrayList));
                return;
            }
            for (CampaignEx campaignEx : copyOnWriteArrayList) {
                if (campaignEx == null || campaignEx.getRewardTemplateMode() == null || TextUtils.isEmpty(campaignEx.getRewardTemplateMode().j()) || campaignEx.getRewardTemplateMode().j().contains(CampaignEx.KEY_IS_CMPT_ENTRY) || a.this.f50361o == null) {
                    com.mbridge.msdk.reward.adapter.c cVar = this.f50377d;
                    if (cVar == null || !cVar.a(copyOnWriteArrayList, this.f50376c, this.f50378e)) {
                        a aVar = a.this;
                        aVar.c(str2, (List<CampaignEx>) aVar.T);
                        if (a.this.f50352f != null && !a.this.X) {
                            a.this.X = true;
                            com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880015, "errorCode: 3503 errorMessage: have no temp but isReady false");
                            if (this.f50374a == null) {
                                this.f50374a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                            }
                            this.f50374a.b(a.this.S);
                            this.f50374a.a(bVarA);
                            a.this.f50352f.b(bVarA, this.f50374a);
                        }
                    } else if (a.this.f50352f != null && !a.this.Y) {
                        a.this.Y = true;
                        q0.a("RewardVideoController", "Cache onVideoLoadSuccessForCache");
                        a.this.a(copyOnWriteArrayList);
                        com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = this.f50374a;
                        if (cVar2 != null) {
                            cVar2.b(copyOnWriteArrayList);
                        }
                        a.this.f50352f.d(str, str2, this.f50374a);
                    }
                } else {
                    a.this.f50361o.post(new RunnableC0556a(campaignEx, copyOnWriteArrayList, str, str2, str3));
                }
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.controller.a$b$a, reason: collision with other inner class name */
        class RunnableC0556a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ CampaignEx f50380a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ CopyOnWriteArrayList f50381b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f50382c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f50383d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f50384e;

            RunnableC0556a(CampaignEx campaignEx, CopyOnWriteArrayList copyOnWriteArrayList, String str, String str2, String str3) {
                this.f50380a = campaignEx;
                this.f50381b = copyOnWriteArrayList;
                this.f50382c = str;
                this.f50383d = str2;
                this.f50384e = str3;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.mbridge.msdk.reward.adapter.b.b().a(a.this.f50371y, a.this.f50361o, a.this.f50366t, a.this.f50367u, null, this.f50380a.getRewardTemplateMode().j(), a.this.f50362p, b.this.f50375b, this.f50381b, H5DownLoadManager.getInstance().getH5ResAddress(this.f50380a.getRewardTemplateMode().j()), this.f50382c, this.f50383d, this.f50384e, this.f50380a.getRequestIdNotice(), a.this.f50349c, new C0557a());
            }

            /* JADX INFO: renamed from: com.mbridge.msdk.reward.controller.a$b$a$a, reason: collision with other inner class name */
            class C0557a implements b.o {
                C0557a() {
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, String str4, String str5, a.C0600a c0600a) {
                    RunnableC0556a runnableC0556a = RunnableC0556a.this;
                    b bVar = b.this;
                    com.mbridge.msdk.reward.adapter.c cVar = bVar.f50377d;
                    if (cVar != null && cVar.a(runnableC0556a.f50381b, bVar.f50376c, bVar.f50378e)) {
                        if (a.this.f50352f == null || a.this.Y) {
                            return;
                        }
                        a.this.Y = true;
                        RunnableC0556a runnableC0556a2 = RunnableC0556a.this;
                        a.this.a(runnableC0556a2.f50381b);
                        a.this.f50352f.d(str2, str3, b.this.f50374a);
                        return;
                    }
                    a aVar = a.this;
                    aVar.c(str3, (List<CampaignEx>) aVar.T);
                    if (a.this.f50352f == null || a.this.X) {
                        return;
                    }
                    a.this.X = true;
                    com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880015, "errorCode: 3502 errorMessage: temp preload success but isReady false");
                    b bVar2 = b.this;
                    if (bVar2.f50374a == null) {
                        bVar2.f50374a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    RunnableC0556a runnableC0556a3 = RunnableC0556a.this;
                    b.this.f50374a.b(runnableC0556a3.f50381b);
                    b.this.f50374a.a(bVarA);
                    a.this.f50352f.b(bVarA, b.this.f50374a);
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, a.C0600a c0600a, com.mbridge.msdk.foundation.error.b bVar) {
                    RunnableC0556a runnableC0556a = RunnableC0556a.this;
                    a aVar = a.this;
                    aVar.c(runnableC0556a.f50383d, (List<CampaignEx>) aVar.T);
                    if (a.this.f50352f == null || a.this.X) {
                        return;
                    }
                    a.this.X = true;
                    bVar.c("errorCode: 3301 errorMessage: temp preload failed");
                    b bVar2 = b.this;
                    if (bVar2.f50374a == null) {
                        bVar2.f50374a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    b bVar3 = b.this;
                    bVar3.f50374a.b(a.this.S);
                    b.this.f50374a.a(bVar);
                    a.this.f50352f.b(bVar, b.this.f50374a);
                }
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.controller.a$b$b, reason: collision with other inner class name */
        class RunnableC0558b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f50387a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f50388b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f50389c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ CopyOnWriteArrayList f50390d;

            RunnableC0558b(String str, String str2, String str3, CopyOnWriteArrayList copyOnWriteArrayList) {
                this.f50387a = str;
                this.f50388b = str2;
                this.f50389c = str3;
                this.f50390d = copyOnWriteArrayList;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.mbridge.msdk.reward.adapter.b.b().a(a.this.f50371y, a.this.f50361o, a.this.f50366t, a.this.f50367u, this.f50387a, b.this.f50375b.getRequestIdNotice(), this.f50388b, this.f50389c, b.this.f50375b.getCMPTEntryUrl(), a.this.f50362p, b.this.f50375b, this.f50390d, H5DownLoadManager.getInstance().getH5ResAddress(b.this.f50375b.getCMPTEntryUrl()), this.f50389c, a.this.f50349c, new C0559a(), true);
            }

            /* JADX INFO: renamed from: com.mbridge.msdk.reward.controller.a$b$b$a, reason: collision with other inner class name */
            class C0559a implements b.o {
                C0559a() {
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, String str4, String str5, a.C0600a c0600a) {
                    RunnableC0558b runnableC0558b = RunnableC0558b.this;
                    b bVar = b.this;
                    com.mbridge.msdk.reward.adapter.c cVar = bVar.f50377d;
                    if (cVar != null && cVar.a(runnableC0558b.f50390d, bVar.f50376c, bVar.f50378e)) {
                        if (a.this.f50352f == null || a.this.Y) {
                            return;
                        }
                        a.this.Y = true;
                        q0.a("RewardVideoController", "Cache onVideoLoadSuccessForCache");
                        RunnableC0558b runnableC0558b2 = RunnableC0558b.this;
                        a.this.a(runnableC0558b2.f50390d);
                        RunnableC0558b runnableC0558b3 = RunnableC0558b.this;
                        com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = b.this.f50374a;
                        if (cVar2 != null) {
                            cVar2.b(runnableC0558b3.f50390d);
                        }
                        a.this.f50352f.d(str2, str3, b.this.f50374a);
                        return;
                    }
                    a aVar = a.this;
                    aVar.c(str3, (List<CampaignEx>) aVar.T);
                    if (a.this.f50352f == null || a.this.X) {
                        return;
                    }
                    a.this.X = true;
                    com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880015, "errorCode: 3504 errorMessage: tpl temp preload success but isReady false");
                    b bVar2 = b.this;
                    if (bVar2.f50374a == null) {
                        bVar2.f50374a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    b.this.f50374a.a(bVarA);
                    RunnableC0558b runnableC0558b4 = RunnableC0558b.this;
                    b.this.f50374a.b(runnableC0558b4.f50390d);
                    a.this.f50352f.b(bVarA, b.this.f50374a);
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, a.C0600a c0600a, com.mbridge.msdk.foundation.error.b bVar) {
                    RunnableC0558b runnableC0558b = RunnableC0558b.this;
                    a aVar = a.this;
                    aVar.c(runnableC0558b.f50389c, (List<CampaignEx>) aVar.T);
                    if (a.this.f50352f == null || a.this.X) {
                        return;
                    }
                    a.this.X = true;
                    if (bVar != null) {
                        bVar.c("errorCode: 3302 errorMessage: tpl preload failed");
                    }
                    b bVar2 = b.this;
                    if (bVar2.f50374a == null) {
                        bVar2.f50374a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    RunnableC0558b runnableC0558b2 = RunnableC0558b.this;
                    b.this.f50374a.b(runnableC0558b2.f50390d);
                    b.this.f50374a.a(bVar);
                    a.this.f50352f.b(bVar, b.this.f50374a);
                }
            }
        }

        @Override // com.mbridge.msdk.reward.adapter.b.h
        public void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.foundation.error.b bVar) {
            a.this.U = false;
            a aVar = a.this;
            aVar.c(aVar.f50354h, (List<CampaignEx>) a.this.T);
            if (a.this.f50352f == null || a.this.X) {
                return;
            }
            a.this.X = true;
            if (this.f50374a == null) {
                this.f50374a = new com.mbridge.msdk.foundation.same.report.metrics.c();
            }
            this.f50374a.b(copyOnWriteArrayList);
            if (bVar != null) {
                bVar.c("errorCode: 3201 errorMessage: campaign resource download failed");
            }
            this.f50374a.a(bVar);
            a.this.f50352f.b(bVar, this.f50374a);
        }
    }

    public boolean c(boolean z10) {
        try {
            if (c()) {
                if (z10) {
                    d("is_ready_start", "over cap check error");
                    com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                    eVar.a("type", 10);
                    cVar.a("m_offer_ready", eVar);
                    a(false, cVar, (List<CampaignEx>) this.f50348b.h());
                }
            } else if (this.f50367u) {
                try {
                    return a(z10);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardVideoController", e10.getMessage());
                    }
                }
            } else {
                return d();
            }
        } catch (Throwable th2) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoController", th2.getMessage());
            }
        }
        return false;
    }

    public void a(int i10, int i11, int i12) {
        this.f50363q = i10;
        this.f50364r = i11;
        if (i11 == com.mbridge.msdk.foundation.same.a.K) {
            this.f50365s = i12 < 0 ? 5 : i12;
        }
        if (i11 == com.mbridge.msdk.foundation.same.a.J) {
            this.f50365s = i12 < 0 ? 80 : i12;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ivRewardEnable", 1);
            jSONObject.put("ivRewardMode", i10 == com.mbridge.msdk.foundation.same.a.H ? 0 : 1);
            jSONObject.put("ivRewardPlayValueMode", i11 == com.mbridge.msdk.foundation.same.a.J ? 0 : 1);
            jSONObject.put("ivRewardPlayValue", i12);
            com.mbridge.msdk.setting.h.b().i(this.f50354h, jSONObject.toString());
        } catch (Exception unused) {
            q0.b("RewardVideoController", "setIVRewardEnable to SP was ERROR");
        }
    }

    private void b(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (this.f50352f != null) {
            String strB = com.mbridge.msdk.foundation.error.a.b(880001, "");
            com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880001, "");
            if (cVar != null) {
                cVar.a(bVarA);
                cVar.b(true);
            }
            this.f50352f.a(strB, cVar);
        }
    }

    private boolean c() {
        try {
            if (this.K == null) {
                this.K = com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d());
            }
            com.mbridge.msdk.foundation.db.h hVarA = com.mbridge.msdk.foundation.db.h.a(this.K);
            if (this.f50349c == null) {
                this.f50349c = com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.f50354h, this.f50366t);
            }
            int iK = this.f50349c.k();
            if (hVarA != null) {
                return hVarA.a(this.f50354h, iK);
            }
            return false;
        } catch (Throwable unused) {
            q0.b("RewardVideoController", "cap check error");
            return false;
        }
    }

    public static void a(String str, int i10) {
        try {
            if (f50343d0 == null || !a1.b(str)) {
                return;
            }
            f50343d0.put(str, Integer.valueOf(i10));
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoController", e10.getMessage());
            }
        }
    }

    private CopyOnWriteArrayList<CampaignEx> b(String str, List<CampaignEx> list) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (list != null) {
            try {
                if (list.size() > 0) {
                    int vcn = 1;
                    for (CampaignEx campaignEx : list) {
                        if (campaignEx != null) {
                            if (campaignEx.getVcn() > vcn) {
                                vcn = campaignEx.getVcn();
                            }
                            if (campaignEx.getTokenRule() == 1) {
                                String requestId = campaignEx.getRequestId();
                                if (!TextUtils.isEmpty(requestId)) {
                                    if (linkedHashMap.containsKey(requestId)) {
                                        List list2 = (List) linkedHashMap.get(requestId);
                                        if (list2 != null) {
                                            list2.add(campaignEx);
                                        }
                                    } else {
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(campaignEx);
                                        linkedHashMap.put(requestId, arrayList);
                                    }
                                }
                            } else {
                                String requestId2 = campaignEx.getRequestId();
                                if (!TextUtils.isEmpty(requestId2)) {
                                    if (linkedHashMap2.containsKey(requestId2)) {
                                        List list3 = (List) linkedHashMap2.get(requestId2);
                                        if (list3 != null) {
                                            list3.add(campaignEx);
                                        }
                                    } else {
                                        ArrayList arrayList2 = new ArrayList();
                                        arrayList2.add(campaignEx);
                                        linkedHashMap2.put(requestId2, arrayList2);
                                    }
                                }
                            }
                        }
                    }
                    if (linkedHashMap2.size() + linkedHashMap.size() >= vcn && linkedHashMap.size() > 0 && linkedHashMap.entrySet() != null && linkedHashMap.entrySet().iterator() != null && linkedHashMap.entrySet().iterator().next() != null && ((Map.Entry) linkedHashMap.entrySet().iterator().next()).getValue() != null) {
                        copyOnWriteArrayList.addAll((Collection) ((Map.Entry) linkedHashMap.entrySet().iterator().next()).getValue());
                        com.mbridge.msdk.foundation.same.buffer.b.a(this.f50354h, str, vcn);
                        return copyOnWriteArrayList;
                    }
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoController", e10.getMessage());
                }
            }
        }
        return copyOnWriteArrayList;
    }

    public static void a(String str, String str2) {
        ConcurrentHashMap<String, String> concurrentHashMap;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (concurrentHashMap = f50344e0) == null || concurrentHashMap.containsKey(str)) {
            return;
        }
        f50344e0.put(str, str2);
    }

    public void a() {
        try {
            String str = "";
            MBridgeIds mBridgeIds = this.f50355i;
            if (mBridgeIds != null) {
                if (!this.C) {
                    mBridgeIds.setBidToken("");
                    return;
                }
                String strM = m();
                if (TextUtils.isEmpty(strM)) {
                    return;
                }
                ConcurrentHashMap<String, String> concurrentHashMap = f50344e0;
                if (concurrentHashMap != null && concurrentHashMap.containsKey(strM) && !TextUtils.isEmpty(f50344e0.get(strM))) {
                    str = f50344e0.get(strM);
                }
                this.f50355i.setBidToken(str);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public void a(InterVideoOutListener interVideoOutListener) {
        this.f50351e = interVideoOutListener;
        this.f50352f = new h(this, interVideoOutListener, this.f50361o, this.f50354h, null);
    }

    public void a(boolean z10, com.mbridge.msdk.foundation.same.report.metrics.e eVar) {
        a(z10, "", eVar);
    }

    public void a(boolean z10, String str, com.mbridge.msdk.foundation.same.report.metrics.e eVar) {
        a aVar;
        com.mbridge.msdk.foundation.same.report.metrics.c cVarB = b(z10, str, eVar);
        this.f50372z = str;
        if (this.f50352f == null) {
            aVar = this;
            aVar.f50352f = new h(aVar, null, this.f50361o, this.f50354h, null);
        } else {
            aVar = this;
        }
        if (aVar.f50352f != null && aVar.f50352f.a() == 1) {
            a(z10, cVarB);
            return;
        }
        aVar.f50347a0 = 1;
        if (aVar.f50352f != null && aVar.f50352f.a() == 3) {
            aVar.L = false;
        } else {
            aVar.L = true;
            if (aVar.f50352f != null) {
                aVar.f50352f.a(1);
            }
        }
        aVar.f50370x = z10;
        aVar.f50361o.removeMessages(1001001);
        aVar.O = false;
        aVar.N = false;
        aVar.P = false;
        aVar.Q = false;
        x();
        w();
        com.mbridge.msdk.reward.adapter.b.b().c();
        try {
            if (TextUtils.isEmpty(str)) {
                if (aVar.f50366t) {
                    com.mbridge.msdk.timer.b.getInstance().addInterstitialList(aVar.f50358l, aVar.f50354h);
                } else {
                    com.mbridge.msdk.timer.b.getInstance().addRewardList(aVar.f50358l, aVar.f50354h);
                }
            }
            if (aVar.f50367u && TextUtils.isEmpty(str)) {
                a(cVarB);
                return;
            }
            if (com.mbridge.msdk.system.a.map == null) {
                b(cVarB);
                return;
            }
            com.mbridge.msdk.videocommon.setting.c cVarC = com.mbridge.msdk.videocommon.setting.b.b().c(com.mbridge.msdk.foundation.controller.c.n().b(), aVar.f50354h);
            aVar.f50349c = cVarC;
            if (cVarC == null) {
                aVar.J = com.mbridge.msdk.foundation.controller.c.n().b();
                com.mbridge.msdk.videocommon.setting.b.b().a(aVar.J, com.mbridge.msdk.foundation.controller.c.n().c(), aVar.f50354h, new C0555a());
                aVar.f50349c = com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), aVar.f50354h, aVar.f50366t);
            }
            if (!TextUtils.isEmpty(aVar.f50358l)) {
                aVar.f50349c.f(aVar.f50358l);
            }
            int iN = aVar.f50349c.n() * 1000;
            if (aVar.f50361o != null) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 1001002;
                if (cVarB != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("metrics_data_lrid", cVarB.t());
                    messageObtain.setData(bundle);
                }
                aVar.f50361o.sendMessageDelayed(messageObtain, iN);
            }
            aVar.I = aVar.f50349c.z();
            try {
                a(z10, str, cVarB);
            } catch (Exception e10) {
                if (aVar.f50352f != null) {
                    com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880020, "load exception");
                    if (cVarB != null) {
                        cVarB.a(bVarA);
                        cVarB.b(true);
                    }
                    aVar.f50352f.a(bVarA, cVarB);
                }
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoController", e10.getMessage());
                }
            }
        } catch (Exception e11) {
            if (aVar.f50352f != null) {
                com.mbridge.msdk.foundation.error.b bVarA2 = com.mbridge.msdk.foundation.error.a.a(880001, "");
                if (cVarB != null) {
                    cVarB.a(bVarA2);
                    cVarB.b(true);
                }
                aVar.f50352f.a(bVarA2, cVarB);
            }
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoController", e11.getMessage());
            }
        }
    }

    private boolean b(String str, String str2) {
        try {
            com.mbridge.msdk.reward.adapter.c cVar = this.f50348b;
            if (cVar == null || !str.equals(cVar.j())) {
                com.mbridge.msdk.reward.adapter.c cVar2 = new com.mbridge.msdk.reward.adapter.c(this.f50346a, this.f50358l, str);
                this.f50348b = cVar2;
                cVar2.d(this.f50366t);
                this.f50348b.e(this.f50367u);
            }
            this.f50348b.a(this.f50362p);
            this.f50348b.a(this.f50349c);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoController", e10.getMessage());
            }
        }
        List<CampaignEx> listB = com.mbridge.msdk.videocommon.cache.a.a().b(str, 1, this.f50367u);
        this.T = com.mbridge.msdk.videocommon.cache.a.a().a(str, 1, this.f50367u);
        if (listB != null && listB.size() > 0) {
            com.mbridge.msdk.videocommon.cache.a.a().a(str, listB, str2);
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.S;
            if (copyOnWriteArrayList == null) {
                this.S = new CopyOnWriteArrayList<>();
            } else {
                copyOnWriteArrayList.clear();
            }
            for (CampaignEx campaignEx : listB) {
                campaignEx.setLocalRequestId(str2);
                this.S.add(campaignEx);
            }
            a(this.S);
            return true;
        }
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = this.S;
        if (copyOnWriteArrayList2 == null) {
            return false;
        }
        copyOnWriteArrayList2.clear();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0043 A[Catch: Exception -> 0x00e5, TRY_ENTER, TryCatch #2 {Exception -> 0x00e5, blocks: (B:3:0x002c, B:11:0x005c, B:14:0x006b, B:19:0x008f, B:10:0x0043), top: B:39:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(boolean r9, java.lang.String r10, com.mbridge.msdk.foundation.same.report.metrics.c r11) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.controller.a.b(boolean, java.lang.String, com.mbridge.msdk.foundation.same.report.metrics.c):void");
    }

    private void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (this.f50352f != null) {
            com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880035, "");
            if (cVar != null) {
                cVar.a(bVarA);
                cVar.b(true);
            }
            this.f50352f.a("bidToken is empty", cVar);
        }
    }

    private boolean b() {
        if (this.f50348b == null) {
            f();
        }
        List<com.mbridge.msdk.foundation.entity.c> listA = com.mbridge.msdk.videocommon.cache.a.a().a(this.f50354h);
        if (listA == null || listA.size() <= 0) {
            return false;
        }
        for (com.mbridge.msdk.foundation.entity.c cVar : listA) {
            if (cVar != null) {
                this.f50348b.c(cVar.a());
                this.f50348b.b(cVar.d());
                if (this.f50348b.m()) {
                    return true;
                }
                com.mbridge.msdk.videocommon.cache.a.a().d(this.f50354h, cVar.a());
            }
        }
        return false;
    }

    private void a(boolean z10, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (!this.f50370x) {
            if (z10) {
                this.f50370x = z10;
            }
        } else if (z10) {
            String strB = com.mbridge.msdk.foundation.error.a.b(880016, "errorCode: 3501 errorMessage: current unit is loading");
            com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880016, "errorCode: 3501 errorMessage: current unit is loading");
            if (cVar != null) {
                cVar.a(bVarA);
                cVar.b(true);
            }
            this.f50352f.b(strB, cVar);
        }
    }

    private void b(boolean z10) {
        List<String> listE;
        if (z10) {
            try {
                com.mbridge.msdk.foundation.db.e eVarA = com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(this.f50346a));
                if (eVarA != null && (listE = eVarA.e(this.f50354h)) != null && listE.size() > 0) {
                    Iterator<String> it = listE.iterator();
                    while (it.hasNext()) {
                        com.mbridge.msdk.foundation.same.report.metrics.d.b().d(it.next());
                    }
                }
                LinkedHashMap<String, com.mbridge.msdk.foundation.same.report.metrics.c> linkedHashMapC = com.mbridge.msdk.foundation.same.report.metrics.d.b().c();
                if (linkedHashMapC == null || linkedHashMapC.size() <= 0) {
                    return;
                }
                Iterator<Map.Entry<String, com.mbridge.msdk.foundation.same.report.metrics.c>> it2 = linkedHashMapC.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry<String, com.mbridge.msdk.foundation.same.report.metrics.c> next = it2.next();
                    if (next != null && next.getValue().E()) {
                        it2.remove();
                    }
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }
    }

    private void a(boolean z10, String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        com.mbridge.msdk.reward.candidate.a aVar;
        com.mbridge.msdk.foundation.cache.c cVar2;
        com.mbridge.msdk.reward.candidate.a aVar2;
        com.mbridge.msdk.foundation.cache.c cVar3;
        String str2 = str;
        com.mbridge.msdk.foundation.same.report.metrics.c cVar4 = cVar;
        if (this.f50352f != null) {
            if (!this.f50367u) {
                this.R = b(this.f50354h, cVar4.t());
                if (this.R) {
                    if (!c()) {
                        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.S;
                        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
                            return;
                        }
                        try {
                            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                            eVar.a(Reporting.EventType.CACHE, 1);
                            cVar4.a("2000127", eVar);
                            cVar4.a("2000048", eVar);
                            cVar4.a(copyOnWriteArrayList);
                        } catch (Exception e10) {
                            if (MBridgeConstans.DEBUG) {
                                q0.b("RewardVideoController", e10.getMessage());
                            }
                        }
                        this.f50352f.b(this.f50358l, this.f50354h, cVar4);
                        CampaignEx campaignEx = copyOnWriteArrayList.get(0);
                        this.f50352f.a(this.f50367u);
                        com.mbridge.msdk.reward.adapter.c cVar5 = this.f50348b;
                        if (cVar5 != null && cVar5.a(copyOnWriteArrayList, !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()), campaignEx.getNscpt())) {
                            a(copyOnWriteArrayList);
                            this.f50352f.d(this.f50358l, this.f50354h, cVar4);
                        } else {
                            a(copyOnWriteArrayList, this.f50348b);
                        }
                        if (this.L) {
                            com.mbridge.msdk.reward.adapter.c cVar6 = this.f50348b;
                            if (cVar6 != null) {
                                cVar6.c(this.S);
                            }
                            a(this.I, z10, str2, cVar4);
                            return;
                        }
                        return;
                    }
                    q0.a("RewardVideoController", "非BID，本地存在可用的缓存，超过上限");
                    CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = this.S;
                    if (copyOnWriteArrayList2 != null && copyOnWriteArrayList2.size() > 0) {
                        Iterator<CampaignEx> it = this.S.iterator();
                        while (it.hasNext()) {
                            com.mbridge.msdk.videocommon.cache.a.a().a(it.next(), this.f50354h);
                        }
                    }
                    com.mbridge.msdk.reward.adapter.c cVar7 = this.f50348b;
                    if (cVar7 != null) {
                        cVar7.c(this.S);
                    }
                    if (z10) {
                        if (this.f50352f != null) {
                            String strB = com.mbridge.msdk.foundation.error.a.b(880019, "");
                            cVar4.a(com.mbridge.msdk.foundation.error.a.a(880019, ""));
                            cVar4.b(true);
                            this.f50352f.a(strB, cVar4);
                            return;
                        }
                        return;
                    }
                    this.R = false;
                    this.f50352f.a(this.f50367u);
                    a(this.I, z10, str2, cVar4);
                    return;
                }
                if (!c()) {
                    this.R = false;
                    com.mbridge.msdk.reward.adapter.c cVar8 = this.f50348b;
                    if (cVar8 != null) {
                        cVar8.c(this.S);
                    }
                    this.f50352f.a(this.f50367u);
                    a(this.I, z10, str2, cVar4);
                    return;
                }
                if (z10) {
                    if (this.f50352f != null) {
                        String strB2 = com.mbridge.msdk.foundation.error.a.b(880019, "");
                        cVar4.a(com.mbridge.msdk.foundation.error.a.a(880019, ""));
                        cVar4.b(true);
                        this.f50352f.a(strB2, cVar4);
                        return;
                    }
                    return;
                }
                this.R = false;
                com.mbridge.msdk.reward.adapter.c cVar9 = this.f50348b;
                if (cVar9 != null) {
                    cVar9.c(this.S);
                }
                this.f50352f.a(this.f50367u);
                a(this.I, z10, str2, cVar4);
                return;
            }
            List<CampaignEx> listB = com.mbridge.msdk.videocommon.cache.a.a().b(this.f50354h, 1, this.f50367u, "");
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListB = null;
            if (listB != null && listB.size() > 0) {
                if (!c()) {
                    if (this.f50348b == null) {
                        f();
                    }
                    CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListA = a(str2, listB);
                    if (copyOnWriteArrayListA != null && copyOnWriteArrayListA.size() > 0) {
                        a(copyOnWriteArrayListA, str2, cVar4);
                        return;
                    }
                    try {
                        aVar2 = new com.mbridge.msdk.reward.candidate.a(this.f50354h, this.f50366t);
                        cVar3 = new com.mbridge.msdk.foundation.cache.c();
                        try {
                            if (aVar2.a(str2)) {
                                cVar3 = aVar2.a(str2, cVar4, (CampaignEx) null, new com.mbridge.msdk.foundation.error.b(880038), 1, this.f50348b);
                                if (cVar3 != null && cVar3.g() == com.mbridge.msdk.foundation.cache.c.f48245l && cVar3.c() != null && cVar3.c().size() > 0 && this.f50348b != null) {
                                    CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListC = cVar3.c();
                                    ArrayList arrayList = new ArrayList();
                                    Iterator<CampaignEx> it2 = listB.iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            break;
                                        }
                                        CampaignEx next = it2.next();
                                        if (next != null) {
                                            String requestId = next.getRequestId();
                                            if (!TextUtils.isEmpty(requestId)) {
                                                for (int i10 = 0; i10 < copyOnWriteArrayListC.size(); i10++) {
                                                    CampaignEx campaignEx2 = copyOnWriteArrayListC.get(i10);
                                                    if (campaignEx2 != null) {
                                                        if (requestId.equals(campaignEx2.getRequestId())) {
                                                            break;
                                                        } else if (i10 == copyOnWriteArrayListC.size() - 1) {
                                                            arrayList.add(next);
                                                        }
                                                    }
                                                }
                                                if (copyOnWriteArrayListC.size() == 0) {
                                                    arrayList.add(next);
                                                }
                                            }
                                        }
                                    }
                                    this.f50348b.c(arrayList);
                                    this.f50348b.a(cVar3.c(), false, true, true);
                                    copyOnWriteArrayListB = new CopyOnWriteArrayList<>(cVar3.c());
                                }
                            } else {
                                copyOnWriteArrayListB = b(str2, listB);
                                if (copyOnWriteArrayListB.size() > 0) {
                                    com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(str2, copyOnWriteArrayListB);
                                }
                                cVar3.d("cb is closed");
                                cVar3.a(com.mbridge.msdk.foundation.cache.c.f48244k);
                            }
                        } catch (Exception e11) {
                            e = e11;
                            cVar4 = cVar;
                        }
                    } catch (Exception e12) {
                        e = e12;
                    }
                    try {
                        aVar2.a(cVar, str2, cVar3, (List<a.b>) null, (JSONObject) null, 1);
                        cVar4 = cVar;
                        str2 = str2;
                        if (copyOnWriteArrayListB != null && copyOnWriteArrayListB.size() > 0) {
                            a(copyOnWriteArrayListB, str2, cVar4);
                            if (this.f50348b != null && !aVar2.a(str2)) {
                                this.f50348b.c(copyOnWriteArrayListB);
                            }
                        }
                    } catch (Exception e13) {
                        e = e13;
                        cVar4 = cVar;
                        str2 = str2;
                        if (MBridgeConstans.DEBUG) {
                            q0.b("RewardVideoController", e.getMessage());
                        }
                    }
                    this.R = false;
                    this.f50352f.a(this.f50367u);
                    a(this.I, z10, str2, cVar4);
                    return;
                }
                com.mbridge.msdk.videocommon.cache.a.a().b(this.f50354h, str2);
                if (!z10 || this.f50352f == null) {
                    return;
                }
                String strB3 = com.mbridge.msdk.foundation.error.a.b(880019, "");
                com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880019, "");
                if (cVar4 != null) {
                    cVar4.a(bVarA);
                    cVar4.b(true);
                }
                this.f50352f.a(strB3, cVar4);
                return;
            }
            if (!c()) {
                try {
                    aVar = new com.mbridge.msdk.reward.candidate.a(this.f50354h, this.f50366t);
                    cVar2 = new com.mbridge.msdk.foundation.cache.c();
                    try {
                        if (aVar.a(str2)) {
                            if (this.f50348b == null) {
                                com.mbridge.msdk.reward.adapter.c cVar10 = new com.mbridge.msdk.reward.adapter.c(this.f50346a, this.f50358l, this.f50354h);
                                this.f50348b = cVar10;
                                cVar10.d(this.f50366t);
                                this.f50348b.e(this.f50367u);
                                if (this.f50366t) {
                                    this.f50348b.a(this.f50363q, this.f50364r, this.f50365s);
                                }
                                this.f50348b.a(this.f50362p);
                                this.f50348b.a(this.f50349c);
                            }
                            cVar2 = aVar.a(str2, cVar4, (CampaignEx) null, new com.mbridge.msdk.foundation.error.b(880038), 1, this.f50348b);
                            if (cVar2 != null && cVar2.g() == com.mbridge.msdk.foundation.cache.c.f48245l && cVar2.c() != null && cVar2.c().size() > 0 && this.f50348b != null) {
                                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListC2 = cVar2.c();
                                if (listB != null) {
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator<CampaignEx> it3 = listB.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            break;
                                        }
                                        CampaignEx next2 = it3.next();
                                        if (next2 != null) {
                                            String requestId2 = next2.getRequestId();
                                            if (!TextUtils.isEmpty(requestId2)) {
                                                for (int i11 = 0; i11 < copyOnWriteArrayListC2.size(); i11++) {
                                                    CampaignEx campaignEx3 = copyOnWriteArrayListC2.get(i11);
                                                    if (campaignEx3 != null) {
                                                        if (requestId2.equals(campaignEx3.getRequestId())) {
                                                            break;
                                                        } else if (i11 == copyOnWriteArrayListC2.size() - 1) {
                                                            arrayList2.add(next2);
                                                        }
                                                    }
                                                }
                                                if (copyOnWriteArrayListC2.size() == 0) {
                                                    arrayList2.add(next2);
                                                }
                                            }
                                        }
                                    }
                                    this.f50348b.c(arrayList2);
                                }
                                this.f50348b.a(cVar2.c(), false, true, true);
                                copyOnWriteArrayListB = new CopyOnWriteArrayList<>(cVar2.c());
                            }
                        } else {
                            copyOnWriteArrayListB = b(str2, listB);
                            if (copyOnWriteArrayListB.size() > 0) {
                                com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(str2, copyOnWriteArrayListB);
                            }
                            cVar2.d("cb is closed 2");
                            cVar2.a(com.mbridge.msdk.foundation.cache.c.f48244k);
                        }
                    } catch (Exception e14) {
                        e = e14;
                        cVar4 = cVar;
                    }
                } catch (Exception e15) {
                    e = e15;
                }
                try {
                    aVar.a(cVar, str2, cVar2, (List<a.b>) null, (JSONObject) null, 1);
                    cVar4 = cVar;
                    str2 = str2;
                    if (copyOnWriteArrayListB != null && copyOnWriteArrayListB.size() > 0) {
                        a(copyOnWriteArrayListB, str2, cVar4);
                        if (this.f50348b != null && !aVar.a(str2)) {
                            this.f50348b.c(copyOnWriteArrayListB);
                        }
                    }
                } catch (Exception e16) {
                    e = e16;
                    cVar4 = cVar;
                    str2 = str2;
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardVideoController", e.getMessage());
                    }
                }
                this.R = false;
                this.f50352f.a(this.f50367u);
                a(this.I, z10, str2, cVar4);
                return;
            }
            com.mbridge.msdk.videocommon.cache.a.a().b(this.f50354h, str2);
            if (!z10 || this.f50352f == null) {
                return;
            }
            String strB4 = com.mbridge.msdk.foundation.error.a.b(880019, "");
            com.mbridge.msdk.foundation.error.b bVarA2 = com.mbridge.msdk.foundation.error.a.a(880019, "");
            if (cVar4 != null) {
                cVar4.a(bVarA2);
                cVar4.b(true);
            }
            this.f50352f.a(strB4, cVar4);
        }
    }

    private void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            return;
        }
        try {
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a(Reporting.EventType.CACHE, 1);
            cVar.a("2000127", eVar);
            cVar.a("2000048", eVar);
            cVar.a(copyOnWriteArrayList);
        } catch (Exception e10) {
            q0.b("RewardVideoController", e10.getMessage());
        }
        this.R = true;
        this.f50352f.a(this.f50367u);
        this.f50352f.b(this.f50358l, this.f50354h, cVar);
        CampaignEx campaignEx = copyOnWriteArrayList.get(0);
        a(campaignEx.getRequestId(), str);
        com.mbridge.msdk.reward.adapter.c cVar2 = this.f50348b;
        if (cVar2 != null && cVar2.a(copyOnWriteArrayList, true ^ TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()), campaignEx.getNscpt())) {
            a(copyOnWriteArrayList);
            this.f50352f.d(this.f50358l, this.f50354h, cVar);
        } else {
            a(copyOnWriteArrayList, this.f50348b);
        }
    }

    private CopyOnWriteArrayList<CampaignEx> a(String str, List<CampaignEx> list) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        if (list != null && list.size() > 0 && !TextUtils.isEmpty(str)) {
            for (CampaignEx campaignEx : list) {
                if (campaignEx != null && str.equals(campaignEx.getBidToken())) {
                    copyOnWriteArrayList.add(campaignEx);
                }
            }
        }
        return copyOnWriteArrayList;
    }

    private void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.reward.adapter.c cVar) {
        CampaignEx campaignEx = copyOnWriteArrayList.get(0);
        boolean zIsEmpty = TextUtils.isEmpty(campaignEx.getCMPTEntryUrl());
        boolean z10 = !zIsEmpty;
        int nscpt = campaignEx.getNscpt();
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = false;
        com.mbridge.msdk.reward.adapter.b.b().a(this.f50346a, z10, nscpt, this.f50367u, this.f50366t ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94, this.f50358l, this.f50354h, campaignEx.getRequestId(), copyOnWriteArrayList, new b(campaignEx, z10, cVar, nscpt), new c(campaignEx, copyOnWriteArrayList, z10, nscpt));
        if (zIsEmpty) {
            return;
        }
        com.mbridge.msdk.reward.adapter.b.b().a(this.f50346a, campaignEx, this.f50358l, this.f50354h, campaignEx.getRequestId(), new d(campaignEx, copyOnWriteArrayList, cVar, z10, nscpt));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(java.util.Queue<java.lang.Integer> r12, boolean r13, java.lang.String r14, com.mbridge.msdk.foundation.same.report.metrics.c r15) {
        /*
            r11 = this;
            java.lang.String r1 = "RewardVideoController"
            java.lang.String r2 = "load mv api error:"
            r0 = 25
            r3 = 880020(0xd6d94, float:1.23317E-39)
            r4 = 1
            r11.F = r0     // Catch: java.lang.Exception -> L6f
            r11.G = r4     // Catch: java.lang.Exception -> L6f
            if (r12 == 0) goto L2a
            int r0 = r12.size()     // Catch: java.lang.Exception -> L25
            if (r0 <= 0) goto L2a
            java.lang.Object r12 = r12.poll()     // Catch: java.lang.Exception -> L25
            java.lang.Integer r12 = (java.lang.Integer) r12     // Catch: java.lang.Exception -> L25
            if (r12 == 0) goto L2a
            int r12 = r12.intValue()     // Catch: java.lang.Exception -> L25
            r11.F = r12     // Catch: java.lang.Exception -> L25
            goto L2a
        L25:
            r0 = move-exception
            r12 = r0
            r5 = r11
            r10 = r15
            goto L73
        L2a:
            int r6 = r11.G     // Catch: java.lang.Exception -> L39
            int r7 = r11.F     // Catch: java.lang.Exception -> L39
            r5 = r11
            r8 = r13
            r9 = r14
            r10 = r15
            r5.a(r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L36
            return
        L36:
            r0 = move-exception
        L37:
            r12 = r0
            goto L3d
        L39:
            r0 = move-exception
            r5 = r11
            r10 = r15
            goto L37
        L3d:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L5d
            r13.<init>()     // Catch: java.lang.Exception -> L5d
            r13.append(r2)     // Catch: java.lang.Exception -> L5d
            java.lang.String r14 = r12.getMessage()     // Catch: java.lang.Exception -> L5d
            r13.append(r14)     // Catch: java.lang.Exception -> L5d
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Exception -> L5d
            com.mbridge.msdk.foundation.error.b r13 = com.mbridge.msdk.foundation.error.a.a(r3, r13)     // Catch: java.lang.Exception -> L5d
            if (r10 == 0) goto L60
            r10.a(r13)     // Catch: java.lang.Exception -> L5d
            r10.b(r4)     // Catch: java.lang.Exception -> L5d
            goto L60
        L5d:
            r0 = move-exception
        L5e:
            r12 = r0
            goto L73
        L60:
            r11.a(r13, r10)     // Catch: java.lang.Exception -> L5d
            boolean r13 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch: java.lang.Exception -> L5d
            if (r13 == 0) goto La0
            java.lang.String r12 = r12.getMessage()     // Catch: java.lang.Exception -> L5d
            com.mbridge.msdk.foundation.tools.q0.b(r1, r12)     // Catch: java.lang.Exception -> L5d
            goto La0
        L6f:
            r0 = move-exception
            r5 = r11
            r10 = r15
            goto L5e
        L73:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r2)
            java.lang.String r14 = r12.getMessage()
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            com.mbridge.msdk.foundation.error.b r13 = com.mbridge.msdk.foundation.error.a.a(r3, r13)
            if (r10 == 0) goto L92
            r10.a(r13)
            r10.b(r4)
        L92:
            r11.a(r13, r10)
            boolean r13 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r13 == 0) goto La0
            java.lang.String r12 = r12.getMessage()
            com.mbridge.msdk.foundation.tools.q0.b(r1, r12)
        La0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.controller.a.a(java.util.Queue, boolean, java.lang.String, com.mbridge.msdk.foundation.same.report.metrics.c):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.foundation.error.b bVar, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (this.f50352f != null) {
            this.Q = true;
            this.f50352f.a(bVar, cVar);
        }
    }

    public void a(int i10, int i11, boolean z10, String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        try {
            com.mbridge.msdk.reward.adapter.c cVar2 = this.f50348b;
            if (cVar2 == null || !this.f50354h.equals(cVar2.j())) {
                com.mbridge.msdk.reward.adapter.c cVar3 = new com.mbridge.msdk.reward.adapter.c(this.f50346a, this.f50358l, this.f50354h);
                this.f50348b = cVar3;
                cVar3.d(this.f50366t);
                this.f50348b.e(this.f50367u);
            }
            if (this.f50366t) {
                this.f50348b.a(this.f50363q, this.f50364r, this.f50365s);
            }
            this.H = new ArrayList();
            this.f50348b.a(this.f50362p);
            this.f50348b.a(this.f50349c);
            f fVar = new f(this.f50348b, i10, z10, str, cVar);
            fVar.a(i11);
            g gVar = new g(this.f50348b, z10);
            this.f50356j = gVar;
            gVar.a(fVar);
            this.f50348b.a(this.f50356j);
            this.f50348b.a(0, "");
            this.f50348b.a(new j());
            this.f50348b.a(i10, i11, z10, str, this.f50371y, cVar);
            this.f50361o.postDelayed(fVar, i11 * 1000);
        } catch (Exception e10) {
            com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880020, e10.getMessage());
            if (cVar != null) {
                cVar.a(bVarA);
                cVar.b(true);
            }
            a(bVarA, cVar);
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoController", e10.getMessage());
            }
        }
    }

    private void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        com.mbridge.msdk.videocommon.setting.c cVar2;
        com.mbridge.msdk.videocommon.setting.c cVar3;
        boolean zL;
        boolean zM;
        try {
            if (this.f50348b == null) {
                f();
            }
            if (this.f50348b != null) {
                q0.b("RewardVideoController", "controller 819");
                if (this.f50367u) {
                    zL = a(false);
                } else {
                    zL = this.f50348b.l();
                }
                C0555a c0555a = null;
                if (zL) {
                    q0.c("RewardVideoController", "invoke adapter show isReady");
                    i iVar = new i(this, this, this.f50361o, c0555a);
                    f50345f0.put(this.f50354h, iVar);
                    this.f50348b.a(iVar, str, this.f50353g, this.f50362p, this.f50357k, cVar);
                    this.E = false;
                    return;
                }
                if (this.f50367u) {
                    zM = b();
                } else {
                    zM = this.f50348b.m();
                }
                if (zM) {
                    q0.c("RewardVideoController", "invoke adapter show isSpareOfferReady");
                    i iVar2 = new i(this, this, this.f50361o, c0555a);
                    f50345f0.put(this.f50354h, iVar2);
                    this.f50348b.a(iVar2, str, this.f50353g, this.f50362p, this.f50357k, cVar);
                    this.E = false;
                    return;
                }
            }
            this.E = false;
            a("2000131", cVar, this.f50351e, "can't show because load is failed");
            if (this.f50351e != null) {
                try {
                    this.f50351e.onShowFail(cVar, this.f50355i, "can't show because load is failed");
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardVideoController", e10.getMessage());
                    }
                }
            }
            if (this.f50366t || this.f50367u || (cVar3 = this.f50349c) == null || !cVar3.a(4) || this.f50352f == null || this.f50352f.a() == 1 || this.f50352f.a() == 3) {
                return;
            }
            a(false, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(0, 94, this.f50354h, true, 1));
        } catch (Exception e11) {
            this.E = false;
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoController", e11.getLocalizedMessage());
            }
            a("2000131", cVar, this.f50351e, "show exception");
            if (this.f50351e != null) {
                try {
                    this.f50351e.onShowFail(cVar, this.f50355i, "show exception");
                } catch (Exception unused) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardVideoController", e11.getMessage());
                    }
                }
            }
            if (this.f50366t || this.f50367u || (cVar2 = this.f50349c) == null || !cVar2.a(4) || this.f50352f == null || this.f50352f.a() == 1 || this.f50352f.a() == 3) {
                return;
            }
            a(false, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(0, 94, this.f50354h, true, 1));
        }
    }

    private boolean a(boolean z10) {
        if (this.f50348b == null) {
            f();
        }
        List<com.mbridge.msdk.foundation.entity.c> listA = com.mbridge.msdk.videocommon.cache.a.a().a(this.f50354h);
        String str = this.A;
        if (listA == null || listA.size() <= 0) {
            if (z10) {
                d("is_ready_ctir_false", "no effective campaign list");
                com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
                cVar.i(str);
                cVar.g(this.f50372z);
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("type", 8);
                cVar.a("m_offer_ready", eVar);
                a(false, cVar, (List<CampaignEx>) this.f50348b.h());
            }
            return false;
        }
        String strD = com.mbridge.msdk.foundation.same.buffer.b.d(this.f50354h);
        boolean zA = TextUtils.isEmpty(strD) ? false : a(listA, strD, z10);
        if (z10) {
            d("is_ready_ctir_" + zA, "");
        }
        if (!zA) {
            for (com.mbridge.msdk.foundation.entity.c cVar2 : listA) {
                if (cVar2 != null) {
                    this.f50348b.c(cVar2.a());
                    this.f50348b.b(cVar2.d());
                    if (this.f50348b.b(z10)) {
                        cVar2.d();
                        return true;
                    }
                }
            }
        } else if (z10) {
            com.mbridge.msdk.foundation.same.report.metrics.c cVar3 = new com.mbridge.msdk.foundation.same.report.metrics.c();
            cVar3.i(str);
            a(zA, cVar3, this.f50348b.h());
        }
        return zA;
    }

    private boolean a(List<com.mbridge.msdk.foundation.entity.c> list, String str, boolean z10) {
        if (list == null) {
            return false;
        }
        for (com.mbridge.msdk.foundation.entity.c cVar : list) {
            if (cVar != null && str.equals(cVar.b())) {
                this.f50348b.c(cVar.a());
                this.f50348b.b(cVar.d());
                if (this.f50348b.l()) {
                    if (!z10) {
                        return true;
                    }
                    com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    cVar2.i(cVar.d());
                    a(false, cVar2, (List<CampaignEx>) this.f50348b.h());
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0205 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(java.lang.String r12, java.lang.String r13, java.lang.String r14, com.mbridge.msdk.foundation.same.report.metrics.e r15) {
        /*
            Method dump skipped, instruction units count: 597
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.controller.a.a(java.lang.String, java.lang.String, java.lang.String, com.mbridge.msdk.foundation.same.report.metrics.e):void");
    }

    private com.mbridge.msdk.foundation.same.report.metrics.c a(com.mbridge.msdk.foundation.same.report.metrics.e eVar) {
        com.mbridge.msdk.foundation.same.report.metrics.c cVar;
        CampaignEx campaignEx;
        try {
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListB = com.mbridge.msdk.videocommon.download.b.getInstance().b(this.f50354h);
            String currentLocalRid = "";
            if (copyOnWriteArrayListB != null && copyOnWriteArrayListB.size() > 0 && (campaignEx = copyOnWriteArrayListB.get(0)) != null) {
                currentLocalRid = campaignEx.getCurrentLocalRid();
            }
            com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = TextUtils.isEmpty(currentLocalRid) ? null : com.mbridge.msdk.foundation.same.report.metrics.d.b().c().get(currentLocalRid);
            if (cVar2 != null) {
                cVar2.b(copyOnWriteArrayListB);
                cVar2.a("2000128", eVar);
                cVar2.i(currentLocalRid);
                cVar2.n(this.f50354h);
                com.mbridge.msdk.reward.report.metrics.a.a().a("2000128", cVar2);
                return cVar2;
            }
            cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
            try {
                cVar.n(this.f50354h);
                eVar.a("metrics_data_reason", "未获取到待展示的campaign信息 本地new metricsData");
                cVar.a("2000128", eVar);
                if (TextUtils.isEmpty(currentLocalRid)) {
                    cVar.i(SameMD5.getMD5(v0.d()));
                } else {
                    cVar.i(currentLocalRid);
                    cVar.b(copyOnWriteArrayListB);
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().c().put(currentLocalRid, cVar);
                }
                com.mbridge.msdk.reward.report.metrics.a.a().a("2000128", cVar);
                return cVar;
            } catch (Exception e10) {
                e = e10;
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoController", e.getMessage());
                }
                return cVar;
            }
        } catch (Exception e11) {
            e = e11;
            cVar = null;
        }
    }

    public void a(List<CampaignEx> list) {
        if (list != null && list.size() > 0) {
            this.H = list;
        } else {
            this.H = new ArrayList();
        }
    }

    private String a(String str) {
        String md5 = "";
        try {
            if (TextUtils.isEmpty(str)) {
                md5 = SameMD5.getMD5(v0.d());
            }
            String[] strArrSplit = str.split("_");
            if (strArrSplit != null && strArrSplit.length >= 3) {
                md5 = strArrSplit[2];
            }
            return TextUtils.isEmpty(md5) ? SameMD5.getMD5(v0.d()) : md5;
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
            return md5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.mbridge.msdk.foundation.same.report.metrics.c a(android.os.Message r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L1f
            android.os.Bundle r3 = r3.getData()     // Catch: java.lang.Exception -> L17
            if (r3 == 0) goto L1f
            com.mbridge.msdk.foundation.same.report.metrics.d r0 = com.mbridge.msdk.foundation.same.report.metrics.d.b()     // Catch: java.lang.Exception -> L17
            java.lang.String r1 = "metrics_data_lrid"
            java.lang.String r3 = r3.getString(r1)     // Catch: java.lang.Exception -> L17
            com.mbridge.msdk.foundation.same.report.metrics.c r3 = r0.b(r3)     // Catch: java.lang.Exception -> L17
            goto L20
        L17:
            r3 = move-exception
            boolean r0 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r0 == 0) goto L1f
            r3.printStackTrace()
        L1f:
            r3 = 0
        L20:
            if (r3 != 0) goto L27
            com.mbridge.msdk.foundation.same.report.metrics.c r3 = new com.mbridge.msdk.foundation.same.report.metrics.c
            r3.<init>()
        L27:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.controller.a.a(android.os.Message):com.mbridge.msdk.foundation.same.report.metrics.c");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar, InterVideoOutListener interVideoOutListener) {
        if (this.f50370x) {
            if (cVar == null) {
                cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
                cVar.b(this.H);
            }
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                if (interVideoOutListener != null) {
                    eVar.a("listener_state", 1);
                } else {
                    eVar.a("listener_state", 2);
                }
                cVar.a(str, eVar);
                com.mbridge.msdk.reward.report.metrics.a.a().a(str, cVar);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar, InterVideoOutListener interVideoOutListener, String str2) {
        if (cVar == null) {
            try {
                cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
                cVar.b(this.H);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                    return;
                }
                return;
            }
        }
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        if (!TextUtils.isEmpty(str2)) {
            eVar.a("reason", str2);
        }
        if (interVideoOutListener != null) {
            eVar.a("listener_state", 1);
        } else {
            eVar.a("listener_state", 2);
        }
        cVar.a(str, eVar);
        com.mbridge.msdk.reward.report.metrics.a.a().a(str, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.mbridge.msdk.foundation.same.report.metrics.c a(java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r5, com.mbridge.msdk.foundation.same.report.metrics.c r6) {
        /*
            r4 = this;
            com.mbridge.msdk.foundation.same.report.metrics.c r0 = new com.mbridge.msdk.foundation.same.report.metrics.c
            r0.<init>()
            java.lang.String r1 = ""
            if (r5 == 0) goto L38
            int r2 = r5.size()     // Catch: java.lang.Exception -> L2b
            if (r2 <= 0) goto L38
            r2 = 0
            java.lang.Object r3 = r5.get(r2)     // Catch: java.lang.Exception -> L2b
            if (r3 == 0) goto L2e
            java.lang.Object r1 = r5.get(r2)     // Catch: java.lang.Exception -> L2b
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = (com.mbridge.msdk.foundation.entity.CampaignEx) r1     // Catch: java.lang.Exception -> L2b
            java.lang.String r1 = r1.getLocalRequestId()     // Catch: java.lang.Exception -> L2b
            java.lang.Object r2 = r5.get(r2)     // Catch: java.lang.Exception -> L2b
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = (com.mbridge.msdk.foundation.entity.CampaignEx) r2     // Catch: java.lang.Exception -> L2b
            java.lang.String r2 = r2.getNLRid()     // Catch: java.lang.Exception -> L2b
            goto L2f
        L2b:
            r5 = move-exception
            goto La2
        L2e:
            r2 = r1
        L2f:
            r0.i(r1)     // Catch: java.lang.Exception -> L2b
            r0.b(r5)     // Catch: java.lang.Exception -> L2b
            r5 = r1
            r1 = r2
            goto L39
        L38:
            r5 = r1
        L39:
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L2b
            if (r1 == 0) goto L40
            return r6
        L40:
            com.mbridge.msdk.foundation.same.report.metrics.e r6 = new com.mbridge.msdk.foundation.same.report.metrics.e     // Catch: java.lang.Exception -> L2b
            r6.<init>()     // Catch: java.lang.Exception -> L2b
            java.lang.String r1 = "cache"
            r2 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L2b
            r6.a(r1, r3)     // Catch: java.lang.Exception -> L2b
            java.lang.String r1 = "hb"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L2b
            r6.a(r1, r2)     // Catch: java.lang.Exception -> L2b
            java.lang.String r1 = "auto_load"
            r2 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L2b
            r6.a(r1, r2)     // Catch: java.lang.Exception -> L2b
            java.lang.String r1 = "2000127"
            r0.a(r1, r6)     // Catch: java.lang.Exception -> L2b
            java.lang.String r1 = "2000048"
            r0.a(r1, r6)     // Catch: java.lang.Exception -> L2b
            boolean r6 = r4.f50366t     // Catch: java.lang.Exception -> L2b
            if (r6 == 0) goto L73
            r6 = 287(0x11f, float:4.02E-43)
            goto L75
        L73:
            r6 = 94
        L75:
            r0.a(r6)     // Catch: java.lang.Exception -> L2b
            java.lang.String r6 = "1"
            r0.h(r6)     // Catch: java.lang.Exception -> L2b
            java.lang.String r6 = "2"
            r0.f(r6)     // Catch: java.lang.Exception -> L2b
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L2b
            if (r6 != 0) goto La9
            com.mbridge.msdk.foundation.same.report.metrics.d r6 = com.mbridge.msdk.foundation.same.report.metrics.d.b()     // Catch: java.lang.Exception -> L2b
            java.util.LinkedHashMap r6 = r6.c()     // Catch: java.lang.Exception -> L2b
            boolean r6 = r6.containsKey(r5)     // Catch: java.lang.Exception -> L2b
            if (r6 != 0) goto La9
            com.mbridge.msdk.foundation.same.report.metrics.d r6 = com.mbridge.msdk.foundation.same.report.metrics.d.b()     // Catch: java.lang.Exception -> L2b
            java.util.LinkedHashMap r6 = r6.c()     // Catch: java.lang.Exception -> L2b
            r6.put(r5, r0)     // Catch: java.lang.Exception -> L2b
            return r0
        La2:
            boolean r6 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r6 == 0) goto La9
            r5.printStackTrace()
        La9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.controller.a.a(java.util.List, com.mbridge.msdk.foundation.same.report.metrics.c):com.mbridge.msdk.foundation.same.report.metrics.c");
    }

    private void a(boolean z10, com.mbridge.msdk.foundation.same.report.metrics.c cVar, List<CampaignEx> list) {
        if (cVar == null) {
            cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
        }
        if (list != null && list.size() > 0) {
            CampaignEx campaignEx = list.get(0);
            if (campaignEx != null) {
                cVar.i(campaignEx.getLocalRequestId());
                cVar.g(campaignEx.getBidToken());
            }
            cVar.b(list);
        }
        a(z10, cVar, (com.mbridge.msdk.foundation.same.report.metrics.e) null);
    }

    private void a(boolean z10, com.mbridge.msdk.foundation.same.report.metrics.c cVar, com.mbridge.msdk.foundation.same.report.metrics.e eVar) {
        if (eVar == null) {
            eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        }
        cVar.n(this.f50354h);
        cVar.a(this.f50366t ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94);
        eVar.a("result", Integer.valueOf(z10 ? 1 : 2));
        eVar.a(CampaignEx.JSON_KEY_HB, Integer.valueOf(this.f50367u ? 1 : 0));
        cVar.a("m_offer_ready", eVar);
        com.mbridge.msdk.reward.report.metrics.a.a().a("m_offer_ready", cVar);
    }
}
