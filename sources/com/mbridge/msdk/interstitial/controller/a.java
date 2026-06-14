package com.mbridge.msdk.interstitial.controller;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.out.InterstitialListener;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.setting.j;
import com.mbridge.msdk.setting.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static String f49186o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static Map<String, Integer> f49187p = new HashMap();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static Map<String, Integer> f49188q = new HashMap();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static Map<String, d> f49189r = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f49191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f49192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f49193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f49194e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private MBridgeIds f49195f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Handler f49196g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private l f49197h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private InterstitialListener f49198i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f49190a = "InterstitialController";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f49199j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f49200k = "";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f49201l = "";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f49202m = "";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f49203n = false;

    /* JADX INFO: renamed from: com.mbridge.msdk.interstitial.controller.a$a, reason: collision with other inner class name */
    class HandlerC0526a extends Handler {
        HandlerC0526a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                return;
            }
            int i10 = message.what;
            if (i10 == 1) {
                if (a.this.f49198i != null) {
                    a.this.f49198i.onInterstitialLoadSuccess(a.this.f49195f);
                    return;
                }
                return;
            }
            String str = "";
            if (i10 == 2) {
                if (a.this.f49198i != null) {
                    Object obj = message.obj;
                    if (obj != null && (obj instanceof String)) {
                        str = (String) obj;
                    }
                    a.this.f49198i.onInterstitialLoadFail(a.this.f49195f, TextUtils.isEmpty(str) ? "can't show because unknow error" : str);
                    return;
                }
                return;
            }
            if (i10 == 3) {
                a aVar = a.this;
                aVar.f49199j = true;
                if (aVar.f49198i != null) {
                    a.this.f49198i.onInterstitialShowSuccess(a.this.f49195f);
                    return;
                }
                return;
            }
            if (i10 == 4) {
                if (a.this.f49198i != null) {
                    Object obj2 = message.obj;
                    if (obj2 != null && (obj2 instanceof String)) {
                        str = (String) obj2;
                    }
                    a.this.f49198i.onInterstitialShowFail(a.this.f49195f, TextUtils.isEmpty(str) ? "can't show because unknow error" : str);
                    return;
                }
                return;
            }
            if (i10 == 6) {
                if (a.this.f49198i != null) {
                    a.this.f49198i.onInterstitialAdClick(a.this.f49195f);
                }
            } else {
                if (i10 != 7) {
                    return;
                }
                a aVar2 = a.this;
                aVar2.f49199j = false;
                if (aVar2.f49198i != null) {
                    a.this.f49198i.onInterstitialClosed(a.this.f49195f);
                }
            }
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.interstitial.adapter.a f49205a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c f49206b;

        public b(com.mbridge.msdk.interstitial.adapter.a aVar, c cVar) {
            this.f49205a = aVar;
            this.f49206b = cVar;
        }

        public void a(boolean z10, String str) {
            try {
                com.mbridge.msdk.interstitial.adapter.a aVar = this.f49205a;
                if (aVar != null) {
                    aVar.a((b) null);
                    this.f49205a = null;
                }
                if (this.f49206b != null) {
                    if (a.this.f49196g != null) {
                        a.this.f49196g.removeCallbacks(this.f49206b);
                    }
                    if (z10) {
                        if (a.this.f49198i != null) {
                            a.this.c(str);
                        }
                    } else if (a.this.f49198i != null) {
                        a.this.b(str);
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public void b(boolean z10, String str) {
            try {
                a.this.f49200k = str;
                try {
                    ArrayList arrayList = new ArrayList();
                    com.mbridge.msdk.interstitial.adapter.a aVar = this.f49205a;
                    if (aVar != null && aVar.d() != null) {
                        arrayList.add(this.f49205a.d());
                    }
                    a.this.f49201l = com.mbridge.msdk.foundation.same.c.b(arrayList);
                } catch (Exception e10) {
                    q0.b(a.this.f49190a, e10.getMessage());
                }
                if (this.f49206b != null) {
                    if (a.this.f49196g != null) {
                        a.this.f49196g.removeCallbacks(this.f49206b);
                    }
                    if (z10) {
                        a.this.b(false);
                    } else if (a.this.f49198i != null) {
                        a.this.h();
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.interstitial.adapter.a f49208a;

        public c(com.mbridge.msdk.interstitial.adapter.a aVar) {
            this.f49208a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.mbridge.msdk.interstitial.adapter.a aVar = this.f49208a;
                if (aVar != null) {
                    if (aVar.f()) {
                        a.this.c("load timeout");
                    } else if (a.this.f49198i != null) {
                        a.this.b("load timeout");
                    }
                    this.f49208a.a((b) null);
                    this.f49208a = null;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public a() {
        try {
            c();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        Handler handler = this.f49196g;
        if (handler != null) {
            handler.sendEmptyMessage(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        Handler handler = this.f49196g;
        if (handler != null) {
            handler.sendEmptyMessage(3);
        }
    }

    public void g() {
        try {
            new j().a(this.f49191b, (String) null, (String) null, this.f49192c);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void j() {
        try {
            if (this.f49191b == null) {
                c("context is null");
                return;
            }
            if (TextUtils.isEmpty(this.f49192c)) {
                c("unitid is null");
            } else if (!this.f49203n) {
                c("init error");
            } else {
                e();
                b(true);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            c("can't show because unknow error");
        }
    }

    public class d {
        public d() {
        }

        public void a(String str) {
            try {
                a.this.c(str);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public void b() {
            try {
                if (a.this.f49196g != null) {
                    a.this.f49196g.sendEmptyMessage(7);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public void c() {
            try {
                a.this.i();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public void a() {
            try {
                if (a.this.f49196g != null) {
                    a.this.f49196g.sendEmptyMessage(6);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    private void e() {
        try {
            g();
            l lVarE = h.b().e(com.mbridge.msdk.foundation.controller.c.n().b(), this.f49192c);
            this.f49197h = lVarE;
            if (lVarE == null) {
                this.f49197h = l.h(this.f49192c);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void f() {
        try {
            if (this.f49191b == null) {
                b("context is null");
                return;
            }
            if (TextUtils.isEmpty(this.f49192c)) {
                b("unitid is null");
            } else {
                if (!this.f49203n) {
                    b("init error");
                    return;
                }
                e();
                d();
                a(false);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            b("can't show because unknow error");
        }
    }

    private void c() {
        try {
            this.f49196g = new HandlerC0526a(Looper.getMainLooper());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void d() {
        try {
            l lVar = this.f49197h;
            if (lVar != null) {
                int iE = lVar.e();
                int iY = this.f49197h.y();
                if (iE <= 0) {
                    iE = 1;
                }
                if (iY <= 0) {
                    iY = 1;
                }
                int i10 = iY * iE;
                if (f49188q == null || TextUtils.isEmpty(this.f49192c)) {
                    return;
                }
                f49188q.put(this.f49192c, Integer.valueOf(i10));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public String b() {
        if (this.f49199j) {
            return this.f49202m;
        }
        return this.f49200k;
    }

    public static void a(String str, int i10) {
        try {
            if (f49187p == null || TextUtils.isEmpty(str)) {
                return;
            }
            f49187p.put(str, Integer.valueOf(i10));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        try {
            if (this.f49196g != null) {
                Message messageObtain = Message.obtain();
                messageObtain.obj = str;
                messageObtain.what = 4;
                this.f49196g.sendMessage(messageObtain);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z10) {
        try {
            CampaignEx campaignExD = new com.mbridge.msdk.interstitial.adapter.a(this.f49191b, this.f49192c, this.f49193d, this.f49194e, true).d();
            if (campaignExD != null) {
                a(campaignExD);
            } else if (z10) {
                a(true);
            } else {
                c("no ads available can show");
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            if (this.f49198i != null) {
                c("can't show because unknow error");
            }
        }
    }

    public static int a(String str) {
        Map<String, Integer> map;
        Integer num;
        try {
            if (TextUtils.isEmpty(str) || (map = f49187p) == null || !map.containsKey(str) || (num = f49187p.get(str)) == null) {
                return 0;
            }
            return num.intValue();
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public void a(InterstitialListener interstitialListener) {
        this.f49198i = interstitialListener;
    }

    public boolean a(Context context, Map<String, Object> map) {
        try {
            this.f49203n = false;
        } catch (Exception e10) {
            e10.printStackTrace();
            this.f49203n = false;
        }
        if (map != null && context != null && map.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID) && (map.get(MBridgeConstans.PROPERTIES_UNIT_ID) instanceof String)) {
            if (map.containsKey(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY) && (map.get(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY) instanceof String)) {
                this.f49194e = (String) map.get(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY);
            }
            this.f49192c = (String) map.get(MBridgeConstans.PROPERTIES_UNIT_ID);
            this.f49191b = context;
            if (map.containsKey(MBridgeConstans.PLACEMENT_ID) && map.get(MBridgeConstans.PLACEMENT_ID) != null) {
                this.f49193d = (String) map.get(MBridgeConstans.PLACEMENT_ID);
            }
            this.f49195f = new MBridgeIds(this.f49193d, this.f49192c);
            this.f49203n = true;
            return this.f49203n;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        try {
            if (this.f49196g != null) {
                Message messageObtain = Message.obtain();
                messageObtain.obj = str;
                messageObtain.what = 2;
                this.f49196g.sendMessage(messageObtain);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public String a() {
        return this.f49201l;
    }

    public void a(boolean z10) {
        boolean z11;
        try {
            z11 = z10;
            try {
                com.mbridge.msdk.interstitial.adapter.a aVar = new com.mbridge.msdk.interstitial.adapter.a(this.f49191b, this.f49192c, this.f49193d, this.f49194e, z11);
                c cVar = new c(aVar);
                aVar.a(new b(aVar, cVar));
                Handler handler = this.f49196g;
                if (handler != null) {
                    handler.postDelayed(cVar, 30000L);
                }
                aVar.j();
            } catch (Exception e10) {
                e = e10;
                e.printStackTrace();
                if (z11) {
                    return;
                }
                b("can't show because unknow error");
            }
        } catch (Exception e11) {
            e = e11;
            z11 = z10;
        }
    }

    private void a(CampaignEx campaignEx) {
        d dVar = new d();
        if (f49189r != null && !TextUtils.isEmpty(this.f49192c)) {
            f49189r.put(this.f49192c, dVar);
        }
        Intent intent = new Intent(this.f49191b, (Class<?>) MBInterstitialActivity.class);
        intent.addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        intent.addFlags(268435456);
        if (!TextUtils.isEmpty(this.f49192c)) {
            intent.putExtra("unitId", this.f49192c);
        }
        if (campaignEx != null) {
            this.f49202m = campaignEx.getRequestId();
            intent.putExtra("campaign", campaignEx);
        }
        Context context = this.f49191b;
        if (context != null) {
            context.startActivity(intent);
        }
    }
}
