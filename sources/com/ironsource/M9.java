package com.ironsource;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class M9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f41314a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f41318e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<String, String> f41319f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Ec f41320g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f41321h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f41315b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f41316c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C4312f8 f41317d = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected boolean f41322i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected String f41323j = null;

    public M9(String str, Ec ec2) throws NullPointerException {
        this.f41314a = SDKUtils.requireNonEmptyOrNull(str, "Instance name can't be null");
        this.f41320g = (Ec) SDKUtils.requireNonNull(ec2, "AdListener name can't be null");
    }

    public M9 a(boolean z10) {
        this.f41316c = z10;
        return this;
    }

    public M9 b(boolean z10) {
        this.f41322i = z10;
        return this;
    }

    public M9 c() {
        this.f41315b = true;
        return this;
    }

    public M9 a(C4312f8 c4312f8) {
        this.f41317d = c4312f8;
        return this;
    }

    public M9 b(@Nullable String str) {
        this.f41323j = str;
        return this;
    }

    public M9 c(boolean z10) {
        this.f41321h = z10;
        return this;
    }

    public M9 a(String str) {
        this.f41318e = str;
        return this;
    }

    public String b() {
        String str = this.f41318e;
        if (str != null) {
            return str;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", this.f41314a);
            jSONObject.put("rewarded", this.f41315b);
        } catch (JSONException e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        return (this.f41316c || this.f41321h) ? W9.a() : W9.a(jSONObject);
    }

    public M9 a(Map<String, String> map) {
        this.f41319f = map;
        return this;
    }

    public L9 a() {
        return new L9(b(), this.f41314a, this.f41315b, this.f41316c, this.f41321h, this.f41322i, this.f41323j, this.f41319f, this.f41320g, this.f41317d);
    }
}
