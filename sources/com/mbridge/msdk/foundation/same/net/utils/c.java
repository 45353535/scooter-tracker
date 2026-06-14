package com.mbridge.msdk.foundation.same.net.utils;

import android.text.TextUtils;
import com.ironsource.C4240b4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.net.e;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f48714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f48715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ConcurrentHashMap<String, b> f48716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ArrayList<Integer> f48717d;

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48718a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f48719b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f48720c;

        public b(long j10, int i10, String str) {
            this.f48720c = j10;
            this.f48718a = i10;
            this.f48719b = str;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.net.utils.c$c, reason: collision with other inner class name */
    private static class C0518c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final c f48721a = new c();
    }

    private List<Integer> a() {
        return Arrays.asList(-1, -10, -1201, -1202, -1203, -1205, -1206, -1208, -1301, -1302, -1305, -1306, -1307, -1915, 10602, 10603, 10604, 10609, 10610, 10616);
    }

    public static c b() {
        return C0518c.f48721a;
    }

    private c() {
        this.f48714a = "IDErrorUtil";
        this.f48716c = new ConcurrentHashMap<>();
        this.f48717d = new ArrayList<>();
        g gVarD = h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
        gVarD = gVarD == null ? h.b().a() : gVarD;
        this.f48715b = gVarD.t() * 1000;
        if (gVarD.x() == null || gVarD.x().size() <= 0) {
            q0.b("IDErrorUtil", "Setting ercd is EMPTY and use default code list.");
            this.f48717d.addAll(a());
        } else {
            q0.b("IDErrorUtil", "Setting ercd not EMPTY will use setting.");
            this.f48717d.addAll(gVarD.x());
        }
    }

    public synchronized void a(String str, int i10, String str2, long j10) {
        if (this.f48716c.containsKey(str)) {
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (this.f48717d.contains(Integer.valueOf(i10))) {
            q0.b("IDErrorUtil", "addErrorInfo : " + str + " " + str2);
            this.f48716c.put(str, new b(j10, i10, str2));
        }
    }

    public e a(com.mbridge.msdk.foundation.same.net.wrapper.e eVar) {
        String str = eVar.a().get("app_id");
        String str2 = eVar.a().get(Reporting.Key.PLACEMENT_ID);
        String str3 = TextUtils.isEmpty(str2) ? "" : str2;
        String strReplace = eVar.a().get(MBridgeConstans.PROPERTIES_UNIT_ID);
        if (TextUtils.isEmpty(strReplace)) {
            strReplace = eVar.a().get("unit_ids");
            if (!TextUtils.isEmpty(strReplace)) {
                strReplace = strReplace.replace(C4240b4.j.f42672d, "").replace(C4240b4.j.f42674e, "");
            }
        }
        String str4 = strReplace;
        String str5 = eVar.a().get("ad_type");
        if (TextUtils.isEmpty(str5)) {
            str5 = "0";
        }
        return a(str, str4, str3, eVar.a().get("token"), str5);
    }

    private e a(String str, String str2, String str3, String str4, String str5) {
        int i10;
        String str6 = str + "_" + str3 + "_" + str2 + "_" + str5;
        b bVarA = a(str6);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.mbridge.msdk.tracker.network.g("data_res_type", "1"));
        if (bVarA != null && !TextUtils.isEmpty(bVarA.f48719b)) {
            try {
                if (bVarA.f48718a != -1) {
                    return e.a(new JSONObject(bVarA.f48719b), new com.mbridge.msdk.foundation.same.net.toolbox.a(200, bVarA.f48719b.getBytes(), arrayList));
                }
                if (!TextUtils.isEmpty(str4)) {
                    return null;
                }
                if (str5 != null && !TextUtils.isEmpty(str5) && (i10 = Integer.parseInt(str5)) != 287 && i10 != 94) {
                    if (System.currentTimeMillis() < ((long) (h.b().c(str, str2).u() * 1000)) + bVarA.f48720c) {
                        return e.a(new JSONObject(bVarA.f48719b), new com.mbridge.msdk.foundation.same.net.toolbox.a(200, bVarA.f48719b.getBytes(), arrayList));
                    }
                    this.f48716c.remove(str6);
                    return null;
                }
            } catch (Exception e10) {
                q0.b("IDErrorUtil", e10.getMessage());
            }
        }
        q0.b("IDErrorUtil", "getErrorInfo RETURN NULL");
        return null;
    }

    private synchronized b a(String str) {
        b bVar;
        q0.b("IDErrorUtil", "getErrorInfo : " + str);
        if (!this.f48716c.containsKey(str) || (bVar = this.f48716c.get(str)) == null) {
            return null;
        }
        if (bVar.f48718a == -1) {
            return bVar;
        }
        if (System.currentTimeMillis() > bVar.f48720c + ((long) this.f48715b)) {
            this.f48716c.remove(str);
            if (this.f48716c.size() > 0) {
                for (Map.Entry<String, b> entry : this.f48716c.entrySet()) {
                    q0.b("IDErrorUtil", "getErrorInfo : delete timeout entry");
                    if (System.currentTimeMillis() - entry.getValue().f48720c > this.f48715b) {
                        this.f48716c.remove(entry.getKey());
                    }
                }
            }
            return null;
        }
        q0.b("IDErrorUtil", "getErrorInfo : " + bVar.f48719b);
        return bVar;
    }
}
