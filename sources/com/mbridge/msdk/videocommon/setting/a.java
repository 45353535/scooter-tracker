package com.mbridge.msdk.videocommon.setting;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, Integer> f53272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, com.mbridge.msdk.videocommon.entity.c> f53273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f53274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f53275d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f53276e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f53277f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f53278g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f53279h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f53281j;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f53280i = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f53282k = "";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f53283l = "";

    public String a() {
        return this.f53281j;
    }

    public void b(String str) {
        this.f53281j = str;
    }

    public void c(String str) {
        this.f53283l = str;
    }

    public void d(String str) {
        this.f53282k = str;
    }

    public void e(long j10) {
        this.f53275d = j10;
    }

    public String f() {
        return this.f53283l;
    }

    public Map<String, com.mbridge.msdk.videocommon.entity.c> g() {
        return this.f53273b;
    }

    public long h() {
        return this.f53275d * 1000;
    }

    public long i() {
        return this.f53278g;
    }

    public String j() {
        return this.f53282k;
    }

    public JSONObject k() {
        JSONObject jSONObject = new JSONObject();
        try {
            Map<String, Integer> map = this.f53272a;
            if (map != null && map.size() > 0) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    for (Map.Entry<String, Integer> entry : this.f53272a.entrySet()) {
                        jSONObject2.put(entry.getKey(), entry.getValue().intValue());
                    }
                    jSONObject.put("caplist", jSONObject2);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            Map<String, com.mbridge.msdk.videocommon.entity.c> map2 = this.f53273b;
            if (map2 != null && map2.size() > 0) {
                try {
                    JSONArray jSONArray = new JSONArray();
                    for (Map.Entry<String, com.mbridge.msdk.videocommon.entity.c> entry2 : this.f53273b.entrySet()) {
                        JSONObject jSONObject3 = new JSONObject();
                        String key = entry2.getKey();
                        com.mbridge.msdk.videocommon.entity.c value = entry2.getValue();
                        if (value != null) {
                            jSONObject3.put("name", value.c());
                            jSONObject3.put("amount", value.a());
                            jSONObject3.put("id", key);
                        }
                        jSONArray.put(jSONObject3);
                    }
                    jSONObject.put("reward", jSONArray);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
            jSONObject.put("getpf", this.f53274c);
            jSONObject.put("ruct", this.f53275d);
            jSONObject.put(CampaignEx.JSON_KEY_PLCT, this.f53276e);
            jSONObject.put("dlct", this.f53277f);
            jSONObject.put("vcct", this.f53278g);
            jSONObject.put("current_time", this.f53279h);
            jSONObject.put("vtag", this.f53282k);
            jSONObject.put("isDefault", this.f53280i);
            return jSONObject;
        } catch (Exception e12) {
            e12.printStackTrace();
            return jSONObject;
        }
    }

    public void a(long j10) {
        this.f53279h = j10;
    }

    public void b(long j10) {
        this.f53277f = j10;
    }

    public void c(long j10) {
        this.f53274c = j10;
    }

    public long d() {
        return this.f53274c * 1000;
    }

    public long e() {
        return this.f53276e * 1000;
    }

    public void f(long j10) {
        this.f53278g = j10;
    }

    public void a(Map<String, Integer> map) {
        this.f53272a = map;
    }

    public long b() {
        return this.f53279h;
    }

    public long c() {
        return this.f53277f;
    }

    public void d(long j10) {
        this.f53276e = j10;
    }

    public void a(int i10) {
        this.f53280i = i10;
    }

    public void b(Map<String, com.mbridge.msdk.videocommon.entity.c> map) {
        this.f53273b = map;
    }

    public static a a(String str) {
        a aVar = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                a aVar2 = new a();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("caplist");
                    aVar2.b(jSONObject.optString("ab_id", ""));
                    aVar2.c(jSONObject.optString("rid", ""));
                    if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.length() > 0) {
                        HashMap map = new HashMap();
                        Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                        while (itKeys != null && itKeys.hasNext()) {
                            String next = itKeys.next();
                            int iOptInt = jSONObjectOptJSONObject.optInt(next, 1000);
                            if (!TextUtils.isEmpty(next)) {
                                if (!TextUtils.isEmpty(next) && iOptInt == 0) {
                                    map.put(next, 1000);
                                } else {
                                    map.put(next, Integer.valueOf(iOptInt));
                                }
                            }
                        }
                        aVar2.a(map);
                    }
                    aVar2.b(com.mbridge.msdk.videocommon.entity.c.a(jSONObject.optJSONArray("reward")));
                    aVar2.c(jSONObject.optLong("getpf", 43200L));
                    aVar2.e(jSONObject.optLong("ruct", 5400L));
                    aVar2.d(jSONObject.optLong(CampaignEx.JSON_KEY_PLCT, 3600L));
                    aVar2.b(jSONObject.optLong("dlct", 3600L));
                    aVar2.f(jSONObject.optLong("vcct", 5L));
                    aVar2.a(jSONObject.optLong("current_time"));
                    aVar2.d(jSONObject.optString("vtag", ""));
                    return aVar2;
                } catch (Exception e10) {
                    e = e10;
                    aVar = aVar2;
                    e.printStackTrace();
                    return aVar;
                }
            } catch (Exception e11) {
                e = e11;
            }
        }
        return aVar;
    }
}
