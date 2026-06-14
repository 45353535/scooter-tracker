package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.m2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4424m2 {
    public static final String A = "nurl";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f43616o = "adMarkup";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f43617p = "instance";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f43618q = "adData";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f43619r = "price";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f43620s = "serverData";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f43621t = "loadTimeout";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f43622u = "order";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f43623v = "show";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f43624w = "price";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f43625x = "notifications";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f43626y = "burl";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f43627z = "lurl";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f43628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f43629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JSONObject f43630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f43631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private Integer f43632e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f43633f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f43634g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f43635h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List<String> f43636i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List<String> f43637j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List<String> f43638k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private JSONObject f43639l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private C4638yb f43640m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f43641n;

    public C4424m2(String str) {
        this.f43628a = null;
        this.f43629b = "";
        this.f43630c = null;
        this.f43631d = "";
        this.f43632e = null;
        this.f43633f = -1;
        this.f43634g = -1;
        this.f43635h = -1;
        this.f43636i = new ArrayList();
        this.f43637j = new ArrayList();
        this.f43638k = new ArrayList();
        this.f43639l = null;
        this.f43640m = null;
        this.f43641n = true;
        this.f43628a = str;
    }

    public W8 a(String str) {
        return null;
    }

    public List<String> b() {
        return this.f43636i;
    }

    public String c() {
        return this.f43628a;
    }

    public C4638yb d() {
        return this.f43640m;
    }

    public int e() {
        return this.f43633f;
    }

    @Nullable
    public Integer f() {
        return this.f43632e;
    }

    public List<String> g() {
        return this.f43637j;
    }

    public List<String> h() {
        return this.f43638k;
    }

    public String i() {
        return this.f43631d;
    }

    public int j() {
        return this.f43635h;
    }

    public String k() {
        return this.f43629b;
    }

    public int l() {
        return this.f43634g;
    }

    public JSONObject m() {
        return this.f43639l;
    }

    public boolean n() {
        return this.f43641n;
    }

    private void a(@Nullable JSONObject jSONObject, int i10) {
        this.f43633f = i10;
        this.f43634g = i10;
        this.f43635h = i10;
        if (jSONObject != null) {
            int iOptInt = jSONObject.optInt(f43623v, i10);
            this.f43634g = iOptInt;
            this.f43635h = jSONObject.optInt("price", iOptInt);
        }
    }

    @Nullable
    public JSONObject a() {
        return this.f43630c;
    }

    private void a(JSONObject jSONObject, String str, List<String> list) throws JSONException {
        if (jSONObject.has(str)) {
            list.addAll(C4365ia.b(jSONObject.getJSONArray(str)));
        }
    }

    public C4424m2(JSONObject jSONObject) {
        this(jSONObject, -1, null);
    }

    public C4424m2(JSONObject jSONObject, int i10, JSONObject jSONObject2) {
        this.f43628a = null;
        this.f43629b = "";
        this.f43630c = null;
        this.f43631d = "";
        this.f43632e = null;
        this.f43633f = -1;
        this.f43634g = -1;
        this.f43635h = -1;
        ArrayList arrayList = new ArrayList();
        this.f43636i = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f43637j = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.f43638k = arrayList3;
        this.f43639l = null;
        this.f43640m = null;
        this.f43641n = true;
        try {
            if (jSONObject.has(f43617p)) {
                this.f43628a = jSONObject.getString(f43617p);
            }
            if (jSONObject.has("adMarkup")) {
                this.f43629b = jSONObject.getString("adMarkup");
            } else if (jSONObject.has(f43620s)) {
                this.f43629b = jSONObject.getJSONObject(f43620s).toString();
            }
            this.f43630c = jSONObject.optJSONObject("adData");
            this.f43631d = jSONObject.optString("price", "0");
            if (jSONObject.has(f43625x)) {
                JSONObject jSONObject3 = jSONObject.getJSONObject(f43625x);
                a(jSONObject3, f43626y, arrayList);
                a(jSONObject3, f43627z, arrayList2);
                a(jSONObject3, A, arrayList3);
            }
            this.f43639l = C4365ia.a(jSONObject2, jSONObject.optJSONObject(com.ironsource.mediationsdk.d.f43815d));
            this.f43640m = jSONObject.has(com.ironsource.mediationsdk.d.f43816e) ? C4638yb.a(jSONObject.getJSONObject(com.ironsource.mediationsdk.d.f43816e)) : null;
            this.f43632e = jSONObject.has(f43621t) ? Integer.valueOf((int) TimeUnit.MILLISECONDS.toSeconds(jSONObject.getLong(f43621t))) : null;
            a(jSONObject.optJSONObject(f43622u), i10);
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            this.f43641n = false;
            IronLog.INTERNAL.error("exception " + e10.getMessage());
        }
    }
}
