package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.u4;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f10882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f10883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f10884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f10885d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map f10886e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map f10887f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map f10888g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private u4.a f10889h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f10890i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f10891j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f10892k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f10893l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f10894m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f10895n;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f10896a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f10897b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f10898c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f10899d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Map f10900e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Map f10901f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Map f10902g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private u4.a f10903h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f10904i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f10905j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f10906k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f10907l;

        public b a(String str) {
            this.f10899d = str;
            return this;
        }

        public b b(String str) {
            this.f10896a = str;
            return this;
        }

        public b c(String str) {
            this.f10897b = str;
            return this;
        }

        public b d(String str) {
            this.f10898c = str;
            return this;
        }

        public b a(Map map) {
            this.f10901f = map;
            return this;
        }

        public b b(Map map) {
            this.f10900e = map;
            return this;
        }

        public b c(Map map) {
            this.f10902g = map;
            return this;
        }

        public b d(boolean z10) {
            this.f10906k = z10;
            return this;
        }

        public b a(u4.a aVar) {
            this.f10903h = aVar;
            return this;
        }

        public b b(boolean z10) {
            this.f10907l = z10;
            return this;
        }

        public b c(boolean z10) {
            this.f10905j = z10;
            return this;
        }

        public b a(boolean z10) {
            this.f10904i = z10;
            return this;
        }

        public d a() {
            return new d(this);
        }
    }

    public static b b() {
        return new b();
    }

    void a() {
        Map map = CollectionUtils.map(this.f10886e);
        map.put("postback_ts", String.valueOf(System.currentTimeMillis()));
        this.f10886e = map;
    }

    int c() {
        return this.f10895n;
    }

    String d() {
        return this.f10885d;
    }

    String e() {
        return this.f10894m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f10882a.equals(((d) obj).f10882a);
    }

    u4.a f() {
        return this.f10889h;
    }

    Map g() {
        return this.f10887f;
    }

    String h() {
        return this.f10883b;
    }

    public int hashCode() {
        return this.f10882a.hashCode();
    }

    Map i() {
        return this.f10886e;
    }

    Map j() {
        return this.f10888g;
    }

    String k() {
        return this.f10884c;
    }

    void l() {
        this.f10895n++;
    }

    public boolean m() {
        return this.f10892k;
    }

    boolean n() {
        return this.f10890i;
    }

    boolean o() {
        return this.f10891j;
    }

    boolean p() {
        return this.f10893l;
    }

    JSONObject q() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("uniqueId", this.f10882a);
        jSONObject.put("communicatorRequestId", this.f10894m);
        jSONObject.put("httpMethod", this.f10883b);
        jSONObject.put("targetUrl", this.f10884c);
        jSONObject.put("backupUrl", this.f10885d);
        jSONObject.put("encodingType", this.f10889h);
        jSONObject.put("isEncodingEnabled", this.f10890i);
        jSONObject.put("gzipBodyEncoding", this.f10891j);
        jSONObject.put("isAllowedPreInitEvent", this.f10892k);
        jSONObject.put("attemptNumber", this.f10895n);
        if (this.f10886e != null) {
            jSONObject.put("parameters", new JSONObject(this.f10886e));
        }
        if (this.f10887f != null) {
            jSONObject.put("httpHeaders", new JSONObject(this.f10887f));
        }
        if (this.f10888g != null) {
            jSONObject.put("requestBody", new JSONObject(this.f10888g));
        }
        return jSONObject;
    }

    public String toString() {
        return "PostbackRequest{uniqueId='" + this.f10882a + "', communicatorRequestId='" + this.f10894m + "', httpMethod='" + this.f10883b + "', targetUrl='" + this.f10884c + "', backupUrl='" + this.f10885d + "', attemptNumber=" + this.f10895n + ", isEncodingEnabled=" + this.f10890i + ", isGzipBodyEncoding=" + this.f10891j + ", isAllowedPreInitEvent=" + this.f10892k + ", shouldFireInWebView=" + this.f10893l + '}';
    }

    d(JSONObject jSONObject, k kVar) throws JSONException {
        String string = JsonUtils.getString(jSONObject, "uniqueId", UUID.randomUUID().toString());
        String string2 = JsonUtils.getString(jSONObject, "communicatorRequestId", "");
        String string3 = JsonUtils.getString(jSONObject, "httpMethod", "");
        String string4 = jSONObject.getString("targetUrl");
        String string5 = JsonUtils.getString(jSONObject, "backupUrl", "");
        int i10 = jSONObject.getInt("attemptNumber");
        Map mapSynchronizedMap = JsonUtils.valueExists(jSONObject, "parameters") ? DesugarCollections.synchronizedMap(JsonUtils.toStringMap(jSONObject.getJSONObject("parameters"))) : new HashMap();
        Map mapSynchronizedMap2 = JsonUtils.valueExists(jSONObject, "httpHeaders") ? DesugarCollections.synchronizedMap(JsonUtils.toStringMap(jSONObject.getJSONObject("httpHeaders"))) : new HashMap();
        Map mapSynchronizedMap3 = JsonUtils.valueExists(jSONObject, "requestBody") ? DesugarCollections.synchronizedMap(JsonUtils.toStringObjectMap(jSONObject.getJSONObject("requestBody"))) : new HashMap();
        this.f10882a = string;
        this.f10883b = string3;
        this.f10894m = string2;
        this.f10884c = string4;
        this.f10885d = string5;
        this.f10886e = mapSynchronizedMap;
        this.f10887f = mapSynchronizedMap2;
        this.f10888g = mapSynchronizedMap3;
        this.f10889h = u4.a.a(jSONObject.optInt("encodingType", u4.a.DEFAULT.b()));
        this.f10890i = jSONObject.optBoolean("isEncodingEnabled", false);
        this.f10891j = jSONObject.optBoolean("gzipBodyEncoding", false);
        this.f10892k = jSONObject.optBoolean("isAllowedPreInitEvent", false);
        this.f10893l = jSONObject.optBoolean("shouldFireInWebView", false);
        this.f10895n = i10;
    }

    private d(b bVar) {
        this.f10882a = UUID.randomUUID().toString();
        this.f10883b = bVar.f10897b;
        this.f10884c = bVar.f10898c;
        this.f10885d = bVar.f10899d;
        this.f10886e = bVar.f10900e;
        this.f10887f = bVar.f10901f;
        this.f10888g = bVar.f10902g;
        this.f10889h = bVar.f10903h;
        this.f10890i = bVar.f10904i;
        this.f10891j = bVar.f10905j;
        this.f10892k = bVar.f10906k;
        this.f10893l = bVar.f10907l;
        this.f10894m = bVar.f10896a;
        this.f10895n = 0;
    }
}
