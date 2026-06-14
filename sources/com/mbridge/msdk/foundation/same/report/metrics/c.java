package com.mbridge.msdk.foundation.same.report.metrics;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.C4240b4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class c implements Serializable, Cloneable {
    private int A;
    private int B;
    private CampaignEx C;
    private CopyOnWriteArrayList<CampaignEx> D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f48856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, Map<String, String>> f48857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, Map<String, String>> f48858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, Map<String, String>> f48859d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, Long> f48860e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.foundation.error.b f48861f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f48862g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f48863h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f48864i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f48865j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f48866k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f48867l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f48868m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f48869n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f48870o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f48871p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f48872q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f48873r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f48874s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f48875t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f48876u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f48877v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f48878w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f48879x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f48880y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f48881z;

    public c() {
        this.f48856a = false;
        this.f48857b = new HashMap();
        this.f48858c = new HashMap();
        this.f48859d = new HashMap();
        this.f48860e = new HashMap();
        this.f48862g = "";
        this.f48863h = new CopyOnWriteArrayList<>();
        this.f48874s = -1;
        this.f48876u = false;
        this.f48878w = false;
        this.D = new CopyOnWriteArrayList<>();
    }

    public int A() {
        return this.B;
    }

    public String B() {
        Map<String, String> map;
        if (!TextUtils.isEmpty(this.f48864i)) {
            return this.f48864i;
        }
        try {
            if (TextUtils.isEmpty(this.f48864i)) {
                String str = this.f48862g + this.f48873r;
                Map<String, Map<String, String>> map2 = this.f48857b;
                if (map2 != null && map2.containsKey(str) && (map = this.f48857b.get(str)) != null && map.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID)) {
                    this.f48864i = map.get(MBridgeConstans.PROPERTIES_UNIT_ID);
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
        return this.f48864i;
    }

    public String C() {
        return this.f48869n;
    }

    public boolean D() {
        return this.f48876u;
    }

    public boolean E() {
        return this.f48878w;
    }

    public boolean F() {
        return this.f48877v;
    }

    public boolean G() {
        return this.f48856a;
    }

    public void a(boolean z10) {
        this.f48876u = z10;
    }

    public void b(List<CampaignEx> list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    if (!this.D.isEmpty()) {
                        this.D.clear();
                    }
                    this.D.addAll(list);
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }
    }

    public Map<String, String> c(String str) {
        com.mbridge.msdk.foundation.error.b bVarU;
        com.mbridge.msdk.foundation.error.b bVarU2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        e eVar = new e();
        try {
            this.f48873r = str;
            eVar.a("ts", Long.valueOf(System.currentTimeMillis()));
            if (!TextUtils.isEmpty(B())) {
                eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, B());
            }
            if (this.f48865j != 0) {
                eVar.a("adtp", Integer.valueOf(g()));
            }
            if (!TextUtils.isEmpty(s())) {
                eVar.a(CampaignEx.JSON_KEY_HB, s());
            }
            if (!TextUtils.isEmpty(l())) {
                eVar.a("bid_tk", l());
            }
            if (!TextUtils.isEmpty(str)) {
                eVar.a(C4240b4.i.W, str);
            }
            if (Arrays.asList(b.f48841a).contains(str)) {
                eVar.a("from_cache", D() ? "1" : "2");
            }
            if ("2000047".contains(str) && (bVarU2 = u()) != null) {
                eVar.a("type", Integer.valueOf(bVarU2.h()));
                eVar.a("reason", bVarU2.l());
                if (!TextUtils.isEmpty(bVarU2.m())) {
                    eVar.a("reason_d", bVarU2.m());
                    eVar.a("type_d", Integer.valueOf(bVarU2.n()));
                }
            }
            if ("2000048".contains(str) && (bVarU = u()) != null && !TextUtils.isEmpty(bVarU.m())) {
                eVar.a("type", Integer.valueOf(bVarU.n()));
                eVar.a("reason", bVarU.m());
            }
            if (this.f48865j == 296) {
                eVar.a("auto_load", j());
                eVar.a("auto_refresh", Integer.valueOf(i()));
                eVar.a("auto_refresh_interval", Integer.valueOf(k()));
                eVar.a(FirebaseAnalytics.Param.CONTENT_TYPE, Integer.valueOf(p()));
                eVar.a("temp_display_type", Integer.valueOf(A()));
            }
            a(eVar);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
        return eVar.a();
    }

    @NonNull
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void d(String str) {
        if (this.f48860e == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f48860e.put(str, Long.valueOf(System.currentTimeMillis()));
    }

    public void e(int i10) {
        this.f48874s = i10;
    }

    public void f(String str) {
        this.f48872q = str;
    }

    public int g() {
        return this.f48865j;
    }

    public void h(String str) {
        this.f48871p = str;
    }

    public void i(String str) {
        this.f48862g = str;
    }

    public void j(String str) {
        this.f48873r = str;
    }

    public void k(String str) {
        this.f48867l = str;
    }

    public String l() {
        return this.f48866k;
    }

    public List<CampaignEx> m() {
        return this.f48863h;
    }

    public CampaignEx n() {
        return this.C;
    }

    public List<CampaignEx> o() {
        return this.D;
    }

    public int p() {
        return this.A;
    }

    public int q() {
        return this.f48874s;
    }

    public int r() {
        return this.f48875t;
    }

    public String s() {
        return this.f48871p;
    }

    public String t() {
        return this.f48862g;
    }

    public com.mbridge.msdk.foundation.error.b u() {
        return this.f48861f;
    }

    public Map<String, Map<String, String>> v() {
        return this.f48859d;
    }

    public Map<String, Map<String, String>> w() {
        return this.f48857b;
    }

    public String x() {
        return this.f48867l;
    }

    public String y() {
        return this.f48870o;
    }

    public String z() {
        return this.f48868m;
    }

    public void a(List<CampaignEx> list) {
        if (list != null) {
            try {
                if (list.isEmpty()) {
                    return;
                }
                if (!this.f48863h.isEmpty()) {
                    this.f48863h.clear();
                }
                this.f48863h.addAll(list);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }
    }

    public void e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String str2 = this.f48862g + str;
            Map<String, Map<String, String>> map = this.f48857b;
            if (map == null || !map.containsKey(str2)) {
                return;
            }
            this.f48857b.remove(str2);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public void f(int i10) {
        this.f48875t = i10;
    }

    public void g(String str) {
        this.f48866k = str;
    }

    public int i() {
        return this.f48880y;
    }

    public String j() {
        return this.f48872q;
    }

    public int k() {
        return this.f48881z;
    }

    public void l(String str) {
        this.f48870o = str;
    }

    public void m(String str) {
        this.f48868m = str;
    }

    public void n(String str) {
        this.f48864i = str;
    }

    public void o(String str) {
        this.f48869n = str;
    }

    public void d(boolean z10) {
        this.f48879x = z10;
    }

    public void g(int i10) {
        this.B = i10;
    }

    public void d(int i10) {
        this.A = i10;
    }

    public void b(String str, e eVar) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str) || eVar == null) {
            return;
        }
        try {
            String str2 = this.f48862g + str;
            Map<String, Map<String, String>> map2 = this.f48858c;
            if (map2 != null) {
                if (map2.containsKey(str2) && (map = this.f48858c.get(str2)) != null) {
                    map.putAll(eVar.a());
                } else {
                    this.f48858c.put(str2, eVar.a());
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public void a(CampaignEx campaignEx) {
        this.C = campaignEx;
        if (campaignEx == null) {
            return;
        }
        try {
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.D;
            if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
                int i10 = 0;
                while (true) {
                    if (i10 >= this.D.size()) {
                        break;
                    }
                    if (this.D.get(i10) != null && this.D.get(i10).getId().equals(campaignEx.getId())) {
                        this.D.set(i10, campaignEx);
                        break;
                    }
                    i10++;
                }
            }
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = this.f48863h;
            if (copyOnWriteArrayList2 == null || copyOnWriteArrayList2.isEmpty()) {
                return;
            }
            for (int i11 = 0; i11 < this.f48863h.size(); i11++) {
                if (this.f48863h.get(i11) != null && this.f48863h.get(i11).getId().equals(campaignEx.getId())) {
                    this.f48863h.set(i11, campaignEx);
                    return;
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public c(boolean z10) {
        this.f48856a = false;
        this.f48857b = new HashMap();
        this.f48858c = new HashMap();
        this.f48859d = new HashMap();
        this.f48860e = new HashMap();
        this.f48862g = "";
        this.f48863h = new CopyOnWriteArrayList<>();
        this.f48874s = -1;
        this.f48876u = false;
        this.f48878w = false;
        this.D = new CopyOnWriteArrayList<>();
        this.f48856a = z10;
    }

    public long b(String str) {
        Map<String, Long> map;
        try {
            if (!TextUtils.isEmpty(str) && (map = this.f48860e) != null && map.containsKey(str)) {
                Long l10 = this.f48860e.get(str);
                return System.currentTimeMillis() - (l10 != null ? l10.longValue() : 0L);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
        return 0L;
    }

    public void a(int i10) {
        this.f48865j = i10;
    }

    public Map<String, String> a(String str) {
        return this.f48858c.containsKey(str) ? this.f48858c.remove(str) : new HashMap();
    }

    public void b(boolean z10) {
        this.f48878w = z10;
    }

    public void a(String str, e eVar) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str) || eVar == null) {
            return;
        }
        try {
            String str2 = this.f48862g + str;
            Map<String, Map<String, String>> map2 = this.f48857b;
            if (map2 != null) {
                if (map2.containsKey(str2) && (map = this.f48857b.get(str2)) != null) {
                    map.putAll(eVar.a());
                } else {
                    this.f48857b.put(str2, eVar.a());
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public void b(int i10) {
        this.f48880y = i10;
    }

    private void a(e eVar) {
        if ("2000126".equals(this.f48873r)) {
            String strA = com.mbridge.msdk.foundation.same.net.d.a(l());
            if (eVar != null) {
                eVar.a("dns_ty", Integer.valueOf(com.mbridge.msdk.setting.e.a().a(strA)));
                eVar.a("dns_hs", strA);
            }
        }
    }

    public void a(com.mbridge.msdk.foundation.error.b bVar) {
        this.f48861f = bVar;
    }

    public void c(boolean z10) {
        this.f48877v = z10;
    }

    public void c(int i10) {
        this.f48881z = i10;
    }
}
