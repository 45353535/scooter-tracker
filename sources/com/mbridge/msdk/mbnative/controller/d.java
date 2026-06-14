package com.mbridge.msdk.mbnative.controller;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.entity.k;
import com.mbridge.msdk.foundation.same.c;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.nativex.view.MBMediaView;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.setting.j;
import com.mbridge.msdk.setting.l;
import com.unity3d.services.core.fid.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class d extends com.mbridge.msdk.mbnative.controller.b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f49610r = "d";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static Map<String, Map<Long, Object>> f49611s = new HashMap();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static Map<String, Boolean> f49612t = new HashMap();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static Map<String, k> f49613u = new HashMap();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static Map<String, Integer> f49614v = new HashMap();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static Map<String, Integer> f49615w = new HashMap();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static d f49616x = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static int f49617y = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static int f49618z = -2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private j f49619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.click.a f49620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private l f49621d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f49622e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map<String, Object> f49626i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private List<Integer> f49627j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected List<Integer> f49628k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private List<Integer> f49629l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f49630m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f49631n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f49632o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f49633p;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Queue<Integer> f49623f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Queue<Long> f49624g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f49625h = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.task.b f49634q = new com.mbridge.msdk.foundation.same.task.b(com.mbridge.msdk.foundation.controller.c.n().d());

    class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    public class b extends com.mbridge.msdk.mbnative.service.net.b implements com.mbridge.msdk.foundation.same.task.d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f49636c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f49637d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f49638e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f49639f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f49640g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Runnable f49643j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private com.mbridge.msdk.preload.listenter.a f49645l;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private List<String> f49641h = null;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f49642i = false;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f49644k = true;

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ CampaignUnit f49647a;

            a(CampaignUnit campaignUnit) {
                this.f49647a = campaignUnit;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean z10;
                if (MBridgeConstans.PRELOAD_RESULT_IN_SUBTHREAD && Looper.myLooper() == null) {
                    Looper.prepare();
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (b.this.f49643j != null) {
                    b bVar = b.this;
                    d.this.f49598a.removeCallbacks(bVar.f49643j);
                }
                if (com.mbridge.msdk.util.b.a()) {
                    d.this.a(this.f49647a);
                }
                if (d.f49611s.containsKey("0_" + b.this.unitId)) {
                    d.f49611s.remove("0_" + b.this.unitId);
                }
                if (b.this.f49640g > 0) {
                    if (this.f49647a.ads.size() > b.this.f49640g) {
                        b bVar2 = b.this;
                        bVar2.f49637d = bVar2.f49640g;
                    } else {
                        b.this.f49637d = this.f49647a.ads.size();
                    }
                } else if (b.this.f49640g == -1) {
                    b.this.f49637d = 0;
                } else if (b.this.f49640g == -3) {
                    b.this.f49637d = this.f49647a.ads.size();
                } else if (b.this.f49640g == -2) {
                    if (this.f49647a.getTemplate() == 3) {
                        if (b.this.f49639f != 0) {
                            b bVar3 = b.this;
                            bVar3.f49637d = bVar3.f49639f;
                        }
                    } else if (b.this.f49638e != 0) {
                        b bVar4 = b.this;
                        bVar4.f49637d = bVar4.f49638e;
                    }
                    if (b.this.f49637d <= 0) {
                        b.this.f49637d = ((Integer) d.f49614v.get(b.this.unitId)).intValue();
                    }
                }
                if (this.f49647a.ads.size() < b.this.f49637d) {
                    b.this.f49637d = this.f49647a.ads.size();
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("adtp", 42);
                if (TextUtils.isEmpty(b.this.b())) {
                    eVar.a(CampaignEx.JSON_KEY_HB, 0);
                } else {
                    eVar.a(CampaignEx.JSON_KEY_HB, 1);
                }
                com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.foundation.same.report.metrics.d.b().a(true, b.this.b(), eVar, this.f49647a.getAds().get(0), b.this.unitId);
                for (int i10 = 0; i10 < this.f49647a.ads.size(); i10++) {
                    CampaignEx campaignEx = this.f49647a.ads.get(i10);
                    campaignEx.setLocalRequestId(cVarA.t());
                    campaignEx.setCampaignUnitId(b.this.unitId);
                    boolean zC = v0.c(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx.getPackageName());
                    d.this.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx);
                    if (arrayList.size() < b.this.f49637d && campaignEx.getOfferType() != 99) {
                        if (v0.c(campaignEx)) {
                            campaignEx.setRtinsType(zC ? 1 : 2);
                        }
                        if (com.mbridge.msdk.foundation.same.c.b(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx)) {
                            arrayList.add(campaignEx);
                            if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                                arrayList2.add(campaignEx);
                            }
                        } else {
                            v0.a(b.this.unitId, campaignEx, com.mbridge.msdk.foundation.same.a.f48612x);
                        }
                        b.this.a(campaignEx, null, null);
                    }
                    d dVar = d.this;
                    dVar.a(dVar.f49630m, campaignEx);
                }
                b bVar5 = b.this;
                d.this.a(arrayList2, bVar5.unitId);
                com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> bVarA = com.mbridge.msdk.mbnative.cache.c.a(this.f49647a.getAds().get(0) != null ? this.f49647a.getAds().get(0).getType() : 1);
                if (bVarA != null) {
                    bVarA.a(b.this.unitId, arrayList);
                }
                d.a(b.this.f49636c, b.this.unitId);
                if (Looper.myLooper() != null && z10) {
                    Looper.loop();
                }
                if (this.f49647a.getAds().get(0) != null) {
                    com.mbridge.msdk.click.c.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f49647a.getAds().get(0).getMaitve(), this.f49647a.getAds().get(0).getMaitve_src());
                }
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.mbnative.controller.d$b$b, reason: collision with other inner class name */
        class C0537b extends c.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ CampaignEx f49649a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Context f49650b;

            C0537b(CampaignEx campaignEx, Context context, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
                this.f49649a = campaignEx;
                this.f49650b = context;
            }

            @Override // com.mbridge.msdk.foundation.same.c.a
            public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
                com.mbridge.msdk.mbnative.report.a.a(str, cVar, this.f49649a, this.f49650b, (com.mbridge.msdk.foundation.same.report.metrics.callback.a) null);
            }
        }

        class c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f49652a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f49653b;

            c(String str, int i10) {
                this.f49652a = str;
                this.f49653b = i10;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean z10;
                if (MBridgeConstans.PRELOAD_RESULT_IN_SUBTHREAD && Looper.myLooper() == null) {
                    Looper.prepare();
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!b.this.f49642i) {
                    if (b.this.f49643j != null) {
                        b bVar = b.this;
                        d.this.f49598a.removeCallbacks(bVar.f49643j);
                    }
                    if (b.this.a() == 1 || b.this.f49644k) {
                        b bVar2 = b.this;
                        d dVar = d.this;
                        String str = this.f49652a;
                        int iA = bVar2.a();
                        b bVar3 = b.this;
                        dVar.a(str, iA, bVar3.unitId, bVar3.placementId, bVar3.f49645l);
                    }
                } else if (b.this.f49644k) {
                    b bVar4 = b.this;
                    d dVar2 = d.this;
                    String str2 = this.f49652a;
                    int iA2 = bVar4.a();
                    b bVar5 = b.this;
                    dVar2.a(str2, iA2, bVar5.unitId, bVar5.placementId, bVar5.f49645l);
                }
                if (this.f49653b == -1) {
                    d.b(b.this.f49636c, b.this.unitId);
                }
                if (Looper.myLooper() == null || !z10) {
                    return;
                }
                Looper.loop();
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.mbnative.controller.d$b$d, reason: collision with other inner class name */
        class RunnableC0538d implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f49655a;

            RunnableC0538d(List list) {
                this.f49655a = list;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean z10;
                if (MBridgeConstans.PRELOAD_RESULT_IN_SUBTHREAD && Looper.myLooper() == null) {
                    Looper.prepare();
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!b.this.f49642i && b.this.f49643j != null) {
                    b bVar = b.this;
                    d.this.f49598a.removeCallbacks(bVar.f49643j);
                }
                List list = this.f49655a;
                if (list != null && list.size() > 0) {
                    Iterator it = this.f49655a.iterator();
                    while (it.hasNext()) {
                        for (CampaignEx campaignEx : ((Frame) it.next()).getCampaigns()) {
                            d dVar = d.this;
                            dVar.a(dVar.f49630m, campaignEx);
                        }
                    }
                    HashMap map = new HashMap();
                    map.put(Long.valueOf(System.currentTimeMillis()), this.f49655a);
                    if (d.f49611s.containsKey("1_" + b.this.unitId)) {
                        d.f49611s.remove("1_" + b.this.unitId);
                    }
                    d.f49611s.put("1_" + b.this.unitId, map);
                }
                if (Looper.myLooper() == null || !z10) {
                    return;
                }
                Looper.loop();
            }
        }

        public b(int i10) {
            this.f49636c = i10;
        }

        public void b(List<String> list) {
            this.f49641h = list;
        }

        public void c(int i10) {
            this.f49638e = i10;
        }

        public void d(int i10) {
            this.f49637d = i10;
        }

        public void e(int i10) {
            this.f49639f = i10;
        }

        public void b(int i10) {
            this.f49640g = i10;
        }

        public void a(com.mbridge.msdk.preload.listenter.a aVar) {
            this.f49645l = aVar;
        }

        public void b(boolean z10) {
            this.f49644k = z10;
        }

        @Override // com.mbridge.msdk.foundation.same.task.d
        public void a(boolean z10) {
            this.f49642i = z10;
        }

        @Override // com.mbridge.msdk.mbnative.service.net.b
        public void a(List<com.mbridge.msdk.tracker.network.g> list, CampaignUnit campaignUnit) {
            d.this.f49631n = true;
            d.this.a(true, this.f49645l, (String) null);
            d.this.a(new Thread(new a(campaignUnit)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.c cVar, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
            try {
                Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                com.mbridge.msdk.foundation.same.c.a(campaignEx, contextD, cVar, new C0537b(campaignEx, contextD, aVar));
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }

        @Override // com.mbridge.msdk.mbnative.service.net.b
        public void a(int i10, String str) {
            d.this.a(new Thread(new c(str, i10)));
        }

        public void a(Runnable runnable) {
            this.f49643j = runnable;
        }

        @Override // com.mbridge.msdk.mbnative.service.net.b
        public void a(List<Frame> list) {
            d.this.a(new Thread(new RunnableC0538d(list)));
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f49657a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.mbridge.msdk.foundation.same.task.d f49658b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f49659c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f49660d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f49661e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private com.mbridge.msdk.preload.listenter.a f49662f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f49663g = false;

        public c(int i10, com.mbridge.msdk.foundation.same.task.d dVar, int i11, String str, String str2) {
            this.f49657a = i10;
            this.f49658b = dVar;
            this.f49659c = i11;
            this.f49660d = str;
            this.f49661e = str2;
        }

        public void a(boolean z10) {
            this.f49663g = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f49658b.a(true);
            int i10 = this.f49657a;
            if (i10 != 1) {
                if (i10 != 2) {
                    return;
                }
                d.this.a("REQUEST_TIMEOUT", this.f49659c, this.f49660d, this.f49661e, this.f49662f);
            } else {
                d.this.f49631n = true;
                if (this.f49663g || this.f49659c == 1) {
                    d.this.a("REQUEST_TIMEOUT", this.f49659c, this.f49660d, this.f49661e, this.f49662f);
                }
            }
        }

        public void a(com.mbridge.msdk.preload.listenter.a aVar) {
            this.f49662f = aVar;
        }

        public void a(String str) {
            this.f49660d = str;
        }
    }

    public d() {
        if (Looper.myLooper() == null) {
            Looper.prepare();
        }
        this.f49598a = new a();
    }

    public static Map<String, Integer> c() {
        return f49614v;
    }

    public static Map<String, Integer> d() {
        return f49615w;
    }

    public static Map<String, k> e() {
        return f49613u;
    }

    public static Map<String, Map<Long, Object>> f() {
        return f49611s;
    }

    public static Map<String, Boolean> g() {
        return f49612t;
    }

    public static void b(int i10, String str) {
        if (f49613u.containsKey(str)) {
            k kVar = f49613u.get(str);
            if (i10 == 1) {
                kVar.a(0);
            } else if (i10 == 2) {
                kVar.b(0);
            }
            f49613u.put(str, kVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x01ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(java.util.Map<java.lang.String, java.lang.Object> r27, int r28) {
        /*
            Method dump skipped, instruction units count: 992
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbnative.controller.d.a(java.util.Map, int):void");
    }

    private int a(String str) {
        if (str == null) {
            return 0;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() > 0) {
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObject = (JSONObject) jSONArray.opt(i10);
                    if (2 == jSONObject.optInt("id", 0)) {
                        return jSONObject.optInt("ad_num");
                    }
                }
            }
        } catch (Exception e10) {
            q0.b(f49610r, com.mbridge.msdk.mbnative.common.a.a(e10));
        }
        return 0;
    }

    public List<Campaign> a(String str, int i10) {
        com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> bVarA;
        l lVarE = h.b().e("", str);
        this.f49621d = lVarE;
        if (lVarE == null) {
            this.f49621d = l.i(str);
        }
        List<Integer> listB = this.f49621d.b();
        this.f49627j = listB;
        if (listB == null || listB.size() <= 0 || !this.f49627j.contains(1) || (bVarA = com.mbridge.msdk.mbnative.cache.c.a(1)) == null) {
            return null;
        }
        return bVarA.a(str, i10);
    }

    public void a(int i10, l lVar, String str, String str2, com.mbridge.msdk.preload.listenter.a aVar) {
        Queue<Integer> queue = this.f49623f;
        if (queue == null || queue.size() <= 0) {
            return;
        }
        try {
            int iIntValue = this.f49623f.poll().intValue();
            long jLongValue = MBridgeConstans.REQUEST_TIME_OUT;
            Queue<Long> queue2 = this.f49624g;
            if (queue2 != null && queue2.size() > 0) {
                jLongValue = this.f49624g.poll().longValue();
            }
            q0.c(f49610r, "preload start queue adsource = " + iIntValue);
            a(iIntValue, jLongValue, str, str2, this.f49626i, i10, lVar, aVar);
        } catch (Throwable unused) {
            q0.b(f49610r, "queue poll exception");
        }
    }

    public void a(int i10, long j10, String str, String str2, Map<String, Object> map, int i11, l lVar, com.mbridge.msdk.preload.listenter.a aVar) {
        com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> bVarA;
        List<Campaign> listA;
        if (i10 != 1 && (bVarA = com.mbridge.msdk.mbnative.cache.c.a(i10)) != null && (listA = bVarA.a(str, this.f49633p)) != null && listA.size() > 0) {
            a(true, aVar, (String) null);
            return;
        }
        if (i10 == 1) {
            a(i10, j10, i11, lVar, str, str2, true, aVar);
        } else if (i10 != 2) {
            a(i10, j10, i11, lVar, str, str2, aVar, false);
        } else {
            a(2, j10, i11, lVar, str, str2, aVar, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0296 A[Catch: Exception -> 0x0092, TryCatch #2 {Exception -> 0x0092, blocks: (B:3:0x0016, B:6:0x005f, B:8:0x0065, B:10:0x006d, B:12:0x0075, B:14:0x007d, B:16:0x0087, B:19:0x0095, B:21:0x009f, B:22:0x00a9, B:24:0x00b3, B:26:0x00bd, B:28:0x00c3, B:29:0x00cc, B:31:0x00e5, B:32:0x00ec, B:34:0x00f2, B:35:0x00f7, B:37:0x011e, B:38:0x0123, B:45:0x013f, B:48:0x0147, B:50:0x014f, B:52:0x0155, B:54:0x015a, B:56:0x015e, B:61:0x016b, B:63:0x0173, B:65:0x0179, B:70:0x0185, B:71:0x0197, B:73:0x019b, B:75:0x01b6, B:77:0x01be, B:79:0x01cd, B:80:0x01e5, B:84:0x01f6, B:86:0x01fc, B:88:0x0210, B:90:0x0216, B:95:0x021f, B:97:0x0225, B:102:0x0235, B:109:0x0257, B:117:0x026d, B:119:0x0296, B:120:0x029d, B:122:0x02a5, B:124:0x02b7, B:125:0x02c0, B:127:0x02cb, B:133:0x02db, B:137:0x02eb, B:142:0x02f8, B:146:0x0324, B:148:0x035f, B:149:0x0364, B:151:0x036c, B:153:0x0376, B:154:0x0396, B:156:0x039e, B:158:0x03a8, B:159:0x03c8, B:163:0x03fc, B:165:0x0428, B:169:0x045c, B:168:0x0445, B:162:0x03f9, B:145:0x0310, B:134:0x02e0, B:135:0x02e5, B:108:0x024a, B:111:0x025e, B:170:0x0462), top: B:178:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02a5 A[Catch: Exception -> 0x0092, TryCatch #2 {Exception -> 0x0092, blocks: (B:3:0x0016, B:6:0x005f, B:8:0x0065, B:10:0x006d, B:12:0x0075, B:14:0x007d, B:16:0x0087, B:19:0x0095, B:21:0x009f, B:22:0x00a9, B:24:0x00b3, B:26:0x00bd, B:28:0x00c3, B:29:0x00cc, B:31:0x00e5, B:32:0x00ec, B:34:0x00f2, B:35:0x00f7, B:37:0x011e, B:38:0x0123, B:45:0x013f, B:48:0x0147, B:50:0x014f, B:52:0x0155, B:54:0x015a, B:56:0x015e, B:61:0x016b, B:63:0x0173, B:65:0x0179, B:70:0x0185, B:71:0x0197, B:73:0x019b, B:75:0x01b6, B:77:0x01be, B:79:0x01cd, B:80:0x01e5, B:84:0x01f6, B:86:0x01fc, B:88:0x0210, B:90:0x0216, B:95:0x021f, B:97:0x0225, B:102:0x0235, B:109:0x0257, B:117:0x026d, B:119:0x0296, B:120:0x029d, B:122:0x02a5, B:124:0x02b7, B:125:0x02c0, B:127:0x02cb, B:133:0x02db, B:137:0x02eb, B:142:0x02f8, B:146:0x0324, B:148:0x035f, B:149:0x0364, B:151:0x036c, B:153:0x0376, B:154:0x0396, B:156:0x039e, B:158:0x03a8, B:159:0x03c8, B:163:0x03fc, B:165:0x0428, B:169:0x045c, B:168:0x0445, B:162:0x03f9, B:145:0x0310, B:134:0x02e0, B:135:0x02e5, B:108:0x024a, B:111:0x025e, B:170:0x0462), top: B:178:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02cb A[Catch: Exception -> 0x0092, TryCatch #2 {Exception -> 0x0092, blocks: (B:3:0x0016, B:6:0x005f, B:8:0x0065, B:10:0x006d, B:12:0x0075, B:14:0x007d, B:16:0x0087, B:19:0x0095, B:21:0x009f, B:22:0x00a9, B:24:0x00b3, B:26:0x00bd, B:28:0x00c3, B:29:0x00cc, B:31:0x00e5, B:32:0x00ec, B:34:0x00f2, B:35:0x00f7, B:37:0x011e, B:38:0x0123, B:45:0x013f, B:48:0x0147, B:50:0x014f, B:52:0x0155, B:54:0x015a, B:56:0x015e, B:61:0x016b, B:63:0x0173, B:65:0x0179, B:70:0x0185, B:71:0x0197, B:73:0x019b, B:75:0x01b6, B:77:0x01be, B:79:0x01cd, B:80:0x01e5, B:84:0x01f6, B:86:0x01fc, B:88:0x0210, B:90:0x0216, B:95:0x021f, B:97:0x0225, B:102:0x0235, B:109:0x0257, B:117:0x026d, B:119:0x0296, B:120:0x029d, B:122:0x02a5, B:124:0x02b7, B:125:0x02c0, B:127:0x02cb, B:133:0x02db, B:137:0x02eb, B:142:0x02f8, B:146:0x0324, B:148:0x035f, B:149:0x0364, B:151:0x036c, B:153:0x0376, B:154:0x0396, B:156:0x039e, B:158:0x03a8, B:159:0x03c8, B:163:0x03fc, B:165:0x0428, B:169:0x045c, B:168:0x0445, B:162:0x03f9, B:145:0x0310, B:134:0x02e0, B:135:0x02e5, B:108:0x024a, B:111:0x025e, B:170:0x0462), top: B:178:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0310 A[Catch: Exception -> 0x0092, TryCatch #2 {Exception -> 0x0092, blocks: (B:3:0x0016, B:6:0x005f, B:8:0x0065, B:10:0x006d, B:12:0x0075, B:14:0x007d, B:16:0x0087, B:19:0x0095, B:21:0x009f, B:22:0x00a9, B:24:0x00b3, B:26:0x00bd, B:28:0x00c3, B:29:0x00cc, B:31:0x00e5, B:32:0x00ec, B:34:0x00f2, B:35:0x00f7, B:37:0x011e, B:38:0x0123, B:45:0x013f, B:48:0x0147, B:50:0x014f, B:52:0x0155, B:54:0x015a, B:56:0x015e, B:61:0x016b, B:63:0x0173, B:65:0x0179, B:70:0x0185, B:71:0x0197, B:73:0x019b, B:75:0x01b6, B:77:0x01be, B:79:0x01cd, B:80:0x01e5, B:84:0x01f6, B:86:0x01fc, B:88:0x0210, B:90:0x0216, B:95:0x021f, B:97:0x0225, B:102:0x0235, B:109:0x0257, B:117:0x026d, B:119:0x0296, B:120:0x029d, B:122:0x02a5, B:124:0x02b7, B:125:0x02c0, B:127:0x02cb, B:133:0x02db, B:137:0x02eb, B:142:0x02f8, B:146:0x0324, B:148:0x035f, B:149:0x0364, B:151:0x036c, B:153:0x0376, B:154:0x0396, B:156:0x039e, B:158:0x03a8, B:159:0x03c8, B:163:0x03fc, B:165:0x0428, B:169:0x045c, B:168:0x0445, B:162:0x03f9, B:145:0x0310, B:134:0x02e0, B:135:0x02e5, B:108:0x024a, B:111:0x025e, B:170:0x0462), top: B:178:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x035f A[Catch: Exception -> 0x0092, TryCatch #2 {Exception -> 0x0092, blocks: (B:3:0x0016, B:6:0x005f, B:8:0x0065, B:10:0x006d, B:12:0x0075, B:14:0x007d, B:16:0x0087, B:19:0x0095, B:21:0x009f, B:22:0x00a9, B:24:0x00b3, B:26:0x00bd, B:28:0x00c3, B:29:0x00cc, B:31:0x00e5, B:32:0x00ec, B:34:0x00f2, B:35:0x00f7, B:37:0x011e, B:38:0x0123, B:45:0x013f, B:48:0x0147, B:50:0x014f, B:52:0x0155, B:54:0x015a, B:56:0x015e, B:61:0x016b, B:63:0x0173, B:65:0x0179, B:70:0x0185, B:71:0x0197, B:73:0x019b, B:75:0x01b6, B:77:0x01be, B:79:0x01cd, B:80:0x01e5, B:84:0x01f6, B:86:0x01fc, B:88:0x0210, B:90:0x0216, B:95:0x021f, B:97:0x0225, B:102:0x0235, B:109:0x0257, B:117:0x026d, B:119:0x0296, B:120:0x029d, B:122:0x02a5, B:124:0x02b7, B:125:0x02c0, B:127:0x02cb, B:133:0x02db, B:137:0x02eb, B:142:0x02f8, B:146:0x0324, B:148:0x035f, B:149:0x0364, B:151:0x036c, B:153:0x0376, B:154:0x0396, B:156:0x039e, B:158:0x03a8, B:159:0x03c8, B:163:0x03fc, B:165:0x0428, B:169:0x045c, B:168:0x0445, B:162:0x03f9, B:145:0x0310, B:134:0x02e0, B:135:0x02e5, B:108:0x024a, B:111:0x025e, B:170:0x0462), top: B:178:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x036c A[Catch: Exception -> 0x0092, TryCatch #2 {Exception -> 0x0092, blocks: (B:3:0x0016, B:6:0x005f, B:8:0x0065, B:10:0x006d, B:12:0x0075, B:14:0x007d, B:16:0x0087, B:19:0x0095, B:21:0x009f, B:22:0x00a9, B:24:0x00b3, B:26:0x00bd, B:28:0x00c3, B:29:0x00cc, B:31:0x00e5, B:32:0x00ec, B:34:0x00f2, B:35:0x00f7, B:37:0x011e, B:38:0x0123, B:45:0x013f, B:48:0x0147, B:50:0x014f, B:52:0x0155, B:54:0x015a, B:56:0x015e, B:61:0x016b, B:63:0x0173, B:65:0x0179, B:70:0x0185, B:71:0x0197, B:73:0x019b, B:75:0x01b6, B:77:0x01be, B:79:0x01cd, B:80:0x01e5, B:84:0x01f6, B:86:0x01fc, B:88:0x0210, B:90:0x0216, B:95:0x021f, B:97:0x0225, B:102:0x0235, B:109:0x0257, B:117:0x026d, B:119:0x0296, B:120:0x029d, B:122:0x02a5, B:124:0x02b7, B:125:0x02c0, B:127:0x02cb, B:133:0x02db, B:137:0x02eb, B:142:0x02f8, B:146:0x0324, B:148:0x035f, B:149:0x0364, B:151:0x036c, B:153:0x0376, B:154:0x0396, B:156:0x039e, B:158:0x03a8, B:159:0x03c8, B:163:0x03fc, B:165:0x0428, B:169:0x045c, B:168:0x0445, B:162:0x03f9, B:145:0x0310, B:134:0x02e0, B:135:0x02e5, B:108:0x024a, B:111:0x025e, B:170:0x0462), top: B:178:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x039e A[Catch: Exception -> 0x0092, TryCatch #2 {Exception -> 0x0092, blocks: (B:3:0x0016, B:6:0x005f, B:8:0x0065, B:10:0x006d, B:12:0x0075, B:14:0x007d, B:16:0x0087, B:19:0x0095, B:21:0x009f, B:22:0x00a9, B:24:0x00b3, B:26:0x00bd, B:28:0x00c3, B:29:0x00cc, B:31:0x00e5, B:32:0x00ec, B:34:0x00f2, B:35:0x00f7, B:37:0x011e, B:38:0x0123, B:45:0x013f, B:48:0x0147, B:50:0x014f, B:52:0x0155, B:54:0x015a, B:56:0x015e, B:61:0x016b, B:63:0x0173, B:65:0x0179, B:70:0x0185, B:71:0x0197, B:73:0x019b, B:75:0x01b6, B:77:0x01be, B:79:0x01cd, B:80:0x01e5, B:84:0x01f6, B:86:0x01fc, B:88:0x0210, B:90:0x0216, B:95:0x021f, B:97:0x0225, B:102:0x0235, B:109:0x0257, B:117:0x026d, B:119:0x0296, B:120:0x029d, B:122:0x02a5, B:124:0x02b7, B:125:0x02c0, B:127:0x02cb, B:133:0x02db, B:137:0x02eb, B:142:0x02f8, B:146:0x0324, B:148:0x035f, B:149:0x0364, B:151:0x036c, B:153:0x0376, B:154:0x0396, B:156:0x039e, B:158:0x03a8, B:159:0x03c8, B:163:0x03fc, B:165:0x0428, B:169:0x045c, B:168:0x0445, B:162:0x03f9, B:145:0x0310, B:134:0x02e0, B:135:0x02e5, B:108:0x024a, B:111:0x025e, B:170:0x0462), top: B:178:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03f9 A[Catch: Exception -> 0x0092, TryCatch #2 {Exception -> 0x0092, blocks: (B:3:0x0016, B:6:0x005f, B:8:0x0065, B:10:0x006d, B:12:0x0075, B:14:0x007d, B:16:0x0087, B:19:0x0095, B:21:0x009f, B:22:0x00a9, B:24:0x00b3, B:26:0x00bd, B:28:0x00c3, B:29:0x00cc, B:31:0x00e5, B:32:0x00ec, B:34:0x00f2, B:35:0x00f7, B:37:0x011e, B:38:0x0123, B:45:0x013f, B:48:0x0147, B:50:0x014f, B:52:0x0155, B:54:0x015a, B:56:0x015e, B:61:0x016b, B:63:0x0173, B:65:0x0179, B:70:0x0185, B:71:0x0197, B:73:0x019b, B:75:0x01b6, B:77:0x01be, B:79:0x01cd, B:80:0x01e5, B:84:0x01f6, B:86:0x01fc, B:88:0x0210, B:90:0x0216, B:95:0x021f, B:97:0x0225, B:102:0x0235, B:109:0x0257, B:117:0x026d, B:119:0x0296, B:120:0x029d, B:122:0x02a5, B:124:0x02b7, B:125:0x02c0, B:127:0x02cb, B:133:0x02db, B:137:0x02eb, B:142:0x02f8, B:146:0x0324, B:148:0x035f, B:149:0x0364, B:151:0x036c, B:153:0x0376, B:154:0x0396, B:156:0x039e, B:158:0x03a8, B:159:0x03c8, B:163:0x03fc, B:165:0x0428, B:169:0x045c, B:168:0x0445, B:162:0x03f9, B:145:0x0310, B:134:0x02e0, B:135:0x02e5, B:108:0x024a, B:111:0x025e, B:170:0x0462), top: B:178:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0428 A[Catch: Exception -> 0x0092, TryCatch #2 {Exception -> 0x0092, blocks: (B:3:0x0016, B:6:0x005f, B:8:0x0065, B:10:0x006d, B:12:0x0075, B:14:0x007d, B:16:0x0087, B:19:0x0095, B:21:0x009f, B:22:0x00a9, B:24:0x00b3, B:26:0x00bd, B:28:0x00c3, B:29:0x00cc, B:31:0x00e5, B:32:0x00ec, B:34:0x00f2, B:35:0x00f7, B:37:0x011e, B:38:0x0123, B:45:0x013f, B:48:0x0147, B:50:0x014f, B:52:0x0155, B:54:0x015a, B:56:0x015e, B:61:0x016b, B:63:0x0173, B:65:0x0179, B:70:0x0185, B:71:0x0197, B:73:0x019b, B:75:0x01b6, B:77:0x01be, B:79:0x01cd, B:80:0x01e5, B:84:0x01f6, B:86:0x01fc, B:88:0x0210, B:90:0x0216, B:95:0x021f, B:97:0x0225, B:102:0x0235, B:109:0x0257, B:117:0x026d, B:119:0x0296, B:120:0x029d, B:122:0x02a5, B:124:0x02b7, B:125:0x02c0, B:127:0x02cb, B:133:0x02db, B:137:0x02eb, B:142:0x02f8, B:146:0x0324, B:148:0x035f, B:149:0x0364, B:151:0x036c, B:153:0x0376, B:154:0x0396, B:156:0x039e, B:158:0x03a8, B:159:0x03c8, B:163:0x03fc, B:165:0x0428, B:169:0x045c, B:168:0x0445, B:162:0x03f9, B:145:0x0310, B:134:0x02e0, B:135:0x02e5, B:108:0x024a, B:111:0x025e, B:170:0x0462), top: B:178:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x043c  */
    @Override // com.mbridge.msdk.mbnative.controller.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(int r26, long r27, int r29, com.mbridge.msdk.setting.l r30, java.lang.String r31, java.lang.String r32, com.mbridge.msdk.preload.listenter.a r33, boolean r34) {
        /*
            Method dump skipped, instruction units count: 1148
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbnative.controller.d.a(int, long, int, com.mbridge.msdk.setting.l, java.lang.String, java.lang.String, com.mbridge.msdk.preload.listenter.a, boolean):void");
    }

    public static void a(int i10, String str) {
        k kVar;
        if (f49613u.containsKey(str)) {
            kVar = f49613u.get(str);
        } else {
            kVar = new k();
        }
        int iIntValue = f49614v.get(str).intValue();
        int iIntValue2 = d().containsKey(str) ? d().get(str).intValue() : 1;
        if (i10 == 1) {
            int iA = iIntValue + kVar.a();
            kVar.a(iA <= iIntValue2 ? iA : 0);
        } else if (i10 == 2) {
            int iB = iIntValue + kVar.b();
            kVar.b(iB <= iIntValue2 ? iB : 0);
        }
        f49613u.put(str, kVar);
    }

    public void a(String str, int i10, String str2, String str3, com.mbridge.msdk.preload.listenter.a aVar) {
        Log.e(f49610r, str);
        try {
            Queue<Integer> queue = this.f49623f;
            if (queue == null || queue.size() > 0) {
                if (this.f49623f != null) {
                    a(i10, this.f49621d, str2, str3, aVar);
                    return;
                }
            }
            a(false, aVar, str);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public void a(String str, String str2, String str3) {
        if (this.f49619b == null) {
            this.f49619b = new j();
        }
        this.f49619b.a(com.mbridge.msdk.foundation.controller.c.n().d(), str, str2, str3);
    }

    public void a(boolean z10, com.mbridge.msdk.preload.listenter.a aVar, String str) {
        if (z10) {
            if (aVar == null || aVar.a()) {
                return;
            }
            aVar.a(true);
            aVar.onPreloadSucceed();
            return;
        }
        if (aVar == null || aVar.a()) {
            return;
        }
        aVar.a(true);
        aVar.onPreloadFaild(str);
    }

    public void a(boolean z10, Campaign campaign) {
        if (campaign == null) {
            return;
        }
        if (z10 && campaign.getIconDrawable() == null) {
            campaign.loadIconUrlAsyncWithBlock(null);
        }
        if (z10 && campaign.getBigDrawable() == null) {
            campaign.loadImageUrlAsyncWithBlock(null);
        }
    }

    public void a(Thread thread) {
        if (!MBridgeConstans.PRELOAD_RESULT_IN_SUBTHREAD) {
            thread.run();
        } else {
            thread.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<CampaignEx> list, String str) {
        if (list != null) {
            try {
            } catch (Exception e10) {
                q0.b(f49610r, com.mbridge.msdk.mbnative.common.a.a(e10));
            }
            if (list.size() > 0) {
                try {
                    int i10 = MBMediaView.f49923p0;
                    Object objInvoke = com.mbridge.msdk.videocommon.download.b.class.getMethod(Constants.GET_INSTANCE, null).invoke(null, null);
                    if (objInvoke != null) {
                        com.mbridge.msdk.videocommon.download.b.class.getMethod("createUnitCache", Context.class, String.class, CopyOnWriteArrayList.class, Integer.TYPE, com.mbridge.msdk.videocommon.listener.a.class).invoke(objInvoke, com.mbridge.msdk.foundation.controller.c.n().d(), str, new CopyOnWriteArrayList(list), 1, null);
                        com.mbridge.msdk.videocommon.download.b.class.getMethod("load", String.class).invoke(objInvoke, str);
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    q0.b(f49610r, "please import the videocommon aar");
                    return;
                }
                q0.b(f49610r, com.mbridge.msdk.mbnative.common.a.a(e10));
            }
        }
    }
}
