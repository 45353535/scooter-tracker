package com.mbridge.msdk.videocommon.setting;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.foundation.tools.q0;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static ConcurrentHashMap<String, c> f53284c = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static com.mbridge.msdk.videocommon.setting.a f53285d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile b f53286e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile boolean f53287a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CopyOnWriteArrayList<String> f53288b = new CopyOnWriteArrayList<>();

    class a implements H5DownLoadManager.ZipDownloadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f53289a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f53290b;

        a(String str, String str2) {
            this.f53289a = str;
            this.f53290b = str2;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) {
            j.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f53289a, this.f53290b, 2, str2);
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z10) {
            j.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f53289a, this.f53290b, 1, "");
        }
    }

    private b() {
    }

    public static b b() {
        if (f53286e == null) {
            synchronized (b.class) {
                try {
                    if (f53286e == null) {
                        f53286e = new b();
                    }
                } finally {
                }
            }
        }
        return f53286e;
    }

    public void a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f53288b.add(str);
        } catch (Exception unused) {
        }
    }

    public com.mbridge.msdk.videocommon.setting.a c() {
        com.mbridge.msdk.videocommon.setting.a aVar = f53285d;
        if (aVar != null) {
            return aVar;
        }
        String strA = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("reward_" + com.mbridge.msdk.foundation.controller.c.n().b());
        if (TextUtils.isEmpty(strA)) {
            e(com.mbridge.msdk.foundation.controller.c.n().b(), com.mbridge.msdk.foundation.controller.c.n().c());
            return a();
        }
        com.mbridge.msdk.videocommon.setting.a aVarA = com.mbridge.msdk.videocommon.setting.a.a(strA);
        if (!a(aVarA)) {
            return aVarA;
        }
        e(com.mbridge.msdk.foundation.controller.c.n().b(), com.mbridge.msdk.foundation.controller.c.n().c());
        return a();
    }

    public String d(String str) {
        return com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("reward_" + str);
    }

    public void e(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f53288b.remove(str);
        } catch (Exception unused) {
        }
    }

    public void f(String str, String str2) {
        com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("reward_" + str, str2);
        f53285d = com.mbridge.msdk.videocommon.setting.a.a(str2);
    }

    public void g(String str, String str2) {
        try {
            String strA = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("reward_" + str + "_" + str2);
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(strA);
            jSONObject.put("current_time", System.currentTimeMillis());
            a(str, str2, jSONObject.toString());
        } catch (Throwable th2) {
            q0.b("RewardSettingManager", th2.getMessage());
        }
    }

    public void a(String str, String str2, String str3, com.mbridge.msdk.videocommon.net.c cVar) {
        if (!TextUtils.isEmpty(str3) && !this.f53288b.contains(str3)) {
            a(str3);
            new com.mbridge.msdk.videocommon.net.a().a(com.mbridge.msdk.foundation.controller.c.n().d(), str, str2, str3, cVar);
            return;
        }
        q0.a("test_reward_unit_setting", "unitID: " + str3 + " is requesting");
    }

    public c d(String str, String str2) {
        String str3 = "reward_" + str + "_" + str2;
        if (f53284c.containsKey(str3)) {
            return f53284c.get(str3);
        }
        c cVarA = c.a(com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(str3));
        if (cVarA != null) {
            f53284c.put(str3, cVarA);
        }
        return cVarA;
    }

    public void e(String str, String str2) {
        if (this.f53287a) {
            return;
        }
        this.f53287a = true;
        new com.mbridge.msdk.videocommon.net.a().a(com.mbridge.msdk.foundation.controller.c.n().d(), str, str2);
    }

    public void f(String str) {
        try {
            String strA = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("reward_" + str);
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(strA);
            jSONObject.put("current_time", System.currentTimeMillis());
            f(str, jSONObject.toString());
        } catch (Throwable th2) {
            q0.b("RewardSettingManager", th2.getMessage());
        }
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strC = b().a(com.mbridge.msdk.foundation.controller.c.n().b(), str, false).c();
        if (TextUtils.isEmpty(strC) || !TextUtils.isEmpty(H5DownLoadManager.getInstance().getH5ResAddress(strC))) {
            return;
        }
        a(strC, str);
    }

    public c a(String str, String str2, boolean z10) {
        c cVar;
        boolean zA;
        String str3 = "reward_" + str + "_" + str2;
        if (f53284c.containsKey(str3)) {
            try {
                cVar = f53284c.get(str3);
            } catch (Exception unused) {
                cVar = null;
            }
            try {
                zA = a(cVar);
            } catch (Exception unused2) {
                zA = false;
            }
            if (zA) {
                a(str, com.mbridge.msdk.foundation.controller.c.n().c(), str2, null);
            }
            return cVar;
        }
        c cVarA = c.a(com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(str3));
        if (!a(cVarA)) {
            f53284c.put(str3, cVarA);
            return cVarA;
        }
        if (cVarA != null) {
            return cVarA;
        }
        a(str, com.mbridge.msdk.foundation.controller.c.n().c(), str2, null);
        return a(z10);
    }

    public com.mbridge.msdk.videocommon.setting.a d() {
        String str = "reward_" + com.mbridge.msdk.foundation.controller.c.n().b();
        if (f53285d == null) {
            String strA = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(str);
            if (!TextUtils.isEmpty(strA)) {
                com.mbridge.msdk.videocommon.setting.a aVarA = com.mbridge.msdk.videocommon.setting.a.a(strA);
                if (aVarA != null) {
                    f53285d = aVarA;
                }
                return aVarA;
            }
        }
        return f53285d;
    }

    public c c(String str, String str2) {
        c cVar;
        boolean zA;
        String str3 = "reward_" + str + "_" + str2;
        if (f53284c.containsKey(str3)) {
            try {
                cVar = f53284c.get(str3);
            } catch (Exception unused) {
                cVar = null;
            }
            try {
                zA = a(cVar);
            } catch (Exception unused2) {
                zA = false;
            }
            if (zA) {
                a(str, com.mbridge.msdk.foundation.controller.c.n().c(), str2, null);
            }
            return cVar;
        }
        c cVarA = c.a(com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(str3));
        if (a(cVarA)) {
            a(str, com.mbridge.msdk.foundation.controller.c.n().c(), str2, null);
            return null;
        }
        f53284c.put(str3, cVarA);
        return cVarA;
    }

    public void b(boolean z10) {
        this.f53287a = z10;
    }

    public String b(String str, String str2) {
        return com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("reward_" + str + "_" + str2);
    }

    public boolean a(com.mbridge.msdk.videocommon.setting.a aVar) {
        if (aVar != null) {
            return aVar.b() + aVar.d() <= System.currentTimeMillis();
        }
        return true;
    }

    public static boolean c(String str) {
        JSONArray jSONArrayOptJSONArray;
        try {
            if (!TextUtils.isEmpty(str) && (jSONArrayOptJSONArray = new JSONObject(str).optJSONArray("unitSetting")) != null) {
                String strOptString = jSONArrayOptJSONArray.optJSONObject(0).optString("unitId");
                if (jSONArrayOptJSONArray.length() > 0) {
                    if (!TextUtils.isEmpty(strOptString)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public final com.mbridge.msdk.videocommon.setting.a a() {
        com.mbridge.msdk.videocommon.setting.a aVar = new com.mbridge.msdk.videocommon.setting.a();
        HashMap map = new HashMap(5);
        map.put("1", 1000);
        map.put("9", 1000);
        map.put("8", 1000);
        HashMap map2 = new HashMap(3);
        map2.put("1", new com.mbridge.msdk.videocommon.entity.c("Virtual Item", 1));
        aVar.a(map);
        aVar.b(map2);
        aVar.c(43200L);
        aVar.e(5400L);
        aVar.d(3600L);
        aVar.b(3600L);
        aVar.f(5L);
        aVar.a(1);
        return aVar;
    }

    private final boolean a(c cVar) {
        com.mbridge.msdk.videocommon.setting.a aVarC = c();
        if (aVarC == null || cVar == null) {
            return true;
        }
        return cVar.j() + aVarC.h() <= System.currentTimeMillis();
    }

    public void a(String str, String str2, String str3) {
        String str4 = "reward_" + str + "_" + str2;
        com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(str4, str3);
        c cVarA = c.a(str3);
        f53284c.put(str4, cVarA);
        if (com.mbridge.msdk.util.b.a() || TextUtils.isEmpty(cVarA.c())) {
            return;
        }
        a(cVarA.c(), str2);
    }

    private void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            j.a(com.mbridge.msdk.foundation.controller.c.n().d(), str, str2, 2, "alert url is exception ,url:" + str);
            return;
        }
        H5DownLoadManager.getInstance().downloadH5Res(new com.mbridge.msdk.foundation.same.report.metrics.c(true), str, new a(str, str2));
    }

    public c a(boolean z10) {
        c cVar = new c();
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new com.mbridge.msdk.videocommon.entity.b(1, 30, null));
            cVar.a((List<com.mbridge.msdk.videocommon.entity.b>) arrayList);
            cVar.b(1);
            cVar.e(1);
            cVar.E(1);
            cVar.h(1);
            cVar.u(1);
            cVar.n(1);
            cVar.D(3);
            cVar.C(80);
            cVar.y(100);
            cVar.i(0);
            cVar.o(2);
            cVar.G(-1);
            cVar.p(70);
            cVar.H(2);
            if (z10) {
                cVar.I(5);
            } else {
                cVar.I(-1);
            }
            cVar.m(0);
            cVar.A(0);
            cVar.k(1);
            cVar.B(1);
            cVar.f(3);
            ArrayList<Integer> arrayList2 = new ArrayList<>();
            arrayList2.add(4);
            arrayList2.add(6);
            cVar.a(arrayList2);
            cVar.q(1);
            cVar.F(1);
            cVar.r(60);
            return cVar;
        } catch (Exception e10) {
            e10.printStackTrace();
            return cVar;
        }
    }
}
