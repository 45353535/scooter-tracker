package com.mbridge.msdk.mbbanner.common.manager;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.same.report.metrics.e;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.setting.l;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f49323g = "a";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile a f49324h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f49325a = com.mbridge.msdk.foundation.controller.c.n().d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.util.a f49326b = new com.mbridge.msdk.mbbanner.common.util.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, com.mbridge.msdk.mbbanner.common.data.b> f49327c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, Boolean> f49328d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, Handler> f49329e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<String, Integer> f49330f = new ConcurrentHashMap();

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.manager.a$a, reason: collision with other inner class name */
    class C0527a implements com.mbridge.msdk.mbbanner.common.listener.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.mbbanner.common.data.a f49331a;

        C0527a(com.mbridge.msdk.mbbanner.common.data.a aVar) {
            this.f49331a = aVar;
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.d
        public void a(String str) {
            synchronized (a.b()) {
                this.f49331a.a("");
                a.this.f49328d.put(str, Boolean.FALSE);
            }
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f49333a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MBridgeIds f49334b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.mbbanner.common.listener.b f49335c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f49336d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.mbbanner.common.data.a f49337e;

        b(String str, MBridgeIds mBridgeIds, com.mbridge.msdk.mbbanner.common.listener.b bVar, String str2, com.mbridge.msdk.mbbanner.common.data.a aVar) {
            this.f49333a = str;
            this.f49334b = mBridgeIds;
            this.f49335c = bVar;
            this.f49336d = str2;
            this.f49337e = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Boolean bool;
            if (a.this.f49328d == null || !a.this.f49328d.containsKey(this.f49333a) || (bool = (Boolean) a.this.f49328d.get(this.f49333a)) == null || !bool.booleanValue()) {
                if (a.this.f49330f.containsKey(this.f49333a)) {
                    Integer num = (Integer) a.this.f49330f.get(this.f49333a);
                    int iIntValue = num != null ? num.intValue() : 0;
                    if (iIntValue == 2 || iIntValue == 4) {
                        q0.b(a.f49323g, "doUnitRotation: autoRotationStatus=" + iIntValue + " && unitId=" + this.f49333a);
                        if (a.this.f49326b != null) {
                            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880026);
                            bVar.a(this.f49334b);
                            a.this.f49326b.a(this.f49335c, bVar);
                            return;
                        }
                        return;
                    }
                }
                a.this.b(this.f49336d, this.f49333a, this.f49337e, this.f49335c);
            }
        }
    }

    private a() {
    }

    public static a b() {
        if (f49324h == null) {
            synchronized (a.class) {
                try {
                    if (f49324h == null) {
                        f49324h = new a();
                    }
                } finally {
                }
            }
        }
        return f49324h;
    }

    public void c() {
        Map<String, com.mbridge.msdk.mbbanner.common.data.b> map = this.f49327c;
        if (map != null) {
            map.clear();
        }
        Map<String, Boolean> map2 = this.f49328d;
        if (map2 != null) {
            map2.clear();
        }
        Map<String, Handler> map3 = this.f49329e;
        if (map3 != null) {
            for (Map.Entry<String, Handler> entry : map3.entrySet()) {
                if (entry.getValue() != null) {
                    entry.getValue().removeCallbacksAndMessages(null);
                }
            }
            this.f49329e.clear();
        }
        Map<String, Integer> map4 = this.f49330f;
        if (map4 != null) {
            map4.clear();
        }
    }

    private com.mbridge.msdk.mbbanner.common.data.b a(String str) {
        if (this.f49327c.containsKey(str)) {
            return this.f49327c.get(str);
        }
        l lVarE = h.b().e(com.mbridge.msdk.foundation.controller.c.n().b(), str);
        if (lVarE == null) {
            lVarE = l.i(str);
        }
        com.mbridge.msdk.mbbanner.common.data.b bVar = new com.mbridge.msdk.mbbanner.common.data.b(str, "", 0, lVarE.y());
        this.f49327c.put(str, bVar);
        return bVar;
    }

    public void b(String str, String str2, com.mbridge.msdk.mbbanner.common.data.a aVar, com.mbridge.msdk.mbbanner.common.listener.b bVar) {
        Boolean bool;
        MBridgeIds mBridgeIds = new MBridgeIds(str, str2);
        String strB = aVar.b();
        com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(str2, strB);
        cVarA.h(!TextUtils.isEmpty(aVar.a()) ? "1" : "0");
        cVarA.g(aVar.a());
        cVarA.f(aVar.f() ? "1" : "2");
        cVarA.b(aVar.f() ? 1 : 2);
        cVarA.c(aVar.d());
        com.mbridge.msdk.mbbanner.common.report.a.a("2000123", cVarA, (e) null);
        if (this.f49325a == null) {
            com.mbridge.msdk.foundation.error.b bVar2 = new com.mbridge.msdk.foundation.error.b(880025);
            bVar2.a(mBridgeIds);
            bVar2.b(strB);
            this.f49326b.a(bVar, bVar2);
            return;
        }
        if (bVar == null) {
            com.mbridge.msdk.foundation.error.b bVar3 = new com.mbridge.msdk.foundation.error.b(880001);
            bVar3.a(mBridgeIds);
            bVar3.b(strB);
            this.f49326b.a(bVar, bVar3);
            return;
        }
        Map<String, Boolean> map = this.f49328d;
        if (map != null && map.containsKey(str2) && (bool = this.f49328d.get(str2)) != null && bool.booleanValue()) {
            com.mbridge.msdk.foundation.error.b bVar4 = new com.mbridge.msdk.foundation.error.b(880016, "Current unit is loading!");
            bVar4.a(mBridgeIds);
            bVar4.b(strB);
            this.f49326b.a(bVar, bVar4);
            return;
        }
        this.f49328d.put(str2, Boolean.TRUE);
        com.mbridge.msdk.mbbanner.common.data.b bVarA = a(str2);
        bVarA.a(strB);
        new com.mbridge.msdk.mbbanner.common.manager.b(this.f49325a, bVarA, bVar, this.f49326b).a(str, str2, aVar, new C0527a(aVar));
        com.mbridge.msdk.mbbanner.common.report.a.a("2000125", cVarA, (e) null);
    }

    public void a(String str, String str2, com.mbridge.msdk.mbbanner.common.data.a aVar, com.mbridge.msdk.mbbanner.common.listener.b bVar) {
        Handler handler;
        MBridgeIds mBridgeIds = new MBridgeIds(str, str2);
        if (aVar != null && aVar.d() > 0) {
            if (TextUtils.isEmpty(aVar.b())) {
                aVar.b(com.mbridge.msdk.mbbanner.common.report.a.b(""));
            }
            if (this.f49329e.containsKey(str2)) {
                handler = this.f49329e.get(str2);
            } else {
                handler = new Handler();
                this.f49329e.put(str2, handler);
            }
            Handler handler2 = handler;
            b bVar2 = new b(str2, mBridgeIds, bVar, str, aVar);
            if (handler2 != null) {
                handler2.removeCallbacksAndMessages(null);
                handler2.postDelayed(bVar2, aVar.d());
                return;
            }
            return;
        }
        q0.b(f49323g, "doUnitRotation: Illegal banner request parameters! && unitId=" + str2);
    }

    public void a(int i10, String str, String str2, com.mbridge.msdk.mbbanner.common.data.a aVar, com.mbridge.msdk.mbbanner.common.listener.b bVar) {
        Handler handler;
        Handler handler2;
        Handler handler3;
        Integer num;
        int iIntValue = (!this.f49330f.containsKey(str2) || (num = this.f49330f.get(str2)) == null) ? 0 : num.intValue();
        if (i10 == 1) {
            if (this.f49329e.containsKey(str2) && (handler = this.f49329e.get(str2)) != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.f49330f.put(str2, Integer.valueOf(i10));
            return;
        }
        if (i10 == 2) {
            if (iIntValue == 1) {
                if (this.f49329e.containsKey(str2) && (handler2 = this.f49329e.get(str2)) != null) {
                    handler2.removeCallbacksAndMessages(null);
                }
                this.f49330f.put(str2, Integer.valueOf(i10));
                return;
            }
            return;
        }
        if (i10 == 3) {
            if (iIntValue == 2 || iIntValue == 4) {
                this.f49330f.put(str2, 1);
                a(str, str2, aVar, bVar);
                return;
            }
            return;
        }
        if (i10 != 4) {
            return;
        }
        if (iIntValue == 0) {
            this.f49330f.put(str2, 0);
            return;
        }
        if (this.f49329e.containsKey(str2) && (handler3 = this.f49329e.get(str2)) != null) {
            handler3.removeCallbacksAndMessages(null);
        }
        this.f49330f.put(str2, Integer.valueOf(i10));
    }

    public void b(String str) {
        if (this.f49329e.containsKey(str)) {
            Handler handler = this.f49329e.get(str);
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.f49329e.remove(str);
        }
    }
}
