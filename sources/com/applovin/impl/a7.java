package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class a7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f8226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f8227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f8228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f8229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Boolean f8230e;

    public enum a {
        TCF_VENDOR,
        ATP_NETWORK,
        OTHER;

        /* JADX INFO: Access modifiers changed from: private */
        public static a b(int i10) {
            return i10 != 0 ? i10 != 1 ? OTHER : ATP_NETWORK : TCF_VENDOR;
        }
    }

    public a7(JSONObject jSONObject, String str) {
        this.f8229d = str;
        this.f8226a = a.b(JsonUtils.getInt(jSONObject, "type", a.OTHER.ordinal()));
        this.f8227b = JsonUtils.getInteger(jSONObject, "id", null);
        this.f8228c = JsonUtils.getString(jSONObject, "name", null);
    }

    public void a(Boolean bool) {
        this.f8230e = bool;
    }

    public String b() {
        return this.f8229d;
    }

    public String c() {
        return this.f8228c;
    }

    public Integer d() {
        return this.f8227b;
    }

    public String e() {
        Boolean bool = this.f8230e;
        return IOUtils.LINE_SEPARATOR_UNIX + this.f8229d + " - " + (bool != null ? String.valueOf(bool) : p0.b().a(com.applovin.impl.sdk.k.o()));
    }

    public a f() {
        return this.f8226a;
    }

    public Boolean a() {
        return this.f8230e;
    }
}
