package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.TapAction;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.b1;
import com.fyber.inneractive.sdk.util.c1;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class t0 implements b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f20489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f20490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f20491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f20492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Orientation f20493e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Integer f20494f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Integer f20495g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Skip f20496h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TapAction f20497i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public UnitDisplayType f20498j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f20499k;

    public t0() {
        Boolean bool = Boolean.TRUE;
        this.f20489a = bool;
        this.f20490b = 5000;
        this.f20491c = 0;
        this.f20492d = bool;
        this.f20494f = 0;
        this.f20495g = 2048;
        this.f20496h = Skip.fromValue(0);
        this.f20499k = new ArrayList();
    }

    @Override // com.fyber.inneractive.sdk.util.b1
    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        c1.a(jSONObject, "autoPlay", this.f20489a);
        c1.a(jSONObject, com.taurusx.tax.f.a.f65990n, this.f20490b);
        c1.a(jSONObject, com.taurusx.tax.f.a.f65988a, this.f20491c);
        c1.a(jSONObject, "muted", this.f20492d);
        c1.a(jSONObject, "orientation", this.f20493e);
        c1.a(jSONObject, "padding", this.f20494f);
        c1.a(jSONObject, "pivotBitrate", this.f20495g);
        c1.a(jSONObject, "skip", this.f20496h);
        c1.a(jSONObject, "tapAction", this.f20497i);
        c1.a(jSONObject, "unitDisplayType", this.f20498j);
        JSONArray jSONArray = new JSONArray();
        List<Integer> list = this.f20499k;
        if (list != null) {
            for (Integer num : list) {
                if (num != null) {
                    jSONArray.put(num);
                }
            }
        }
        c1.a(jSONObject, "filterApi", jSONArray);
        return jSONObject;
    }
}
