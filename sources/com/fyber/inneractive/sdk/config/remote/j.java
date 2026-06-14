package com.fyber.inneractive.sdk.config.remote;

import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.TapAction;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f20469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f20470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f20471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Skip f20472d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Boolean f20473e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TapAction f20474f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Orientation f20475g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Integer f20476h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Integer f20477i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public UnitDisplayType f20478j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f20479k = new ArrayList();

    public static j a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        j jVar = new j();
        int iOptInt = jSONObject.optInt(com.taurusx.tax.f.a.f65990n, Integer.MIN_VALUE);
        Integer numValueOf = Integer.valueOf(iOptInt);
        int iOptInt2 = jSONObject.optInt(com.taurusx.tax.f.a.f65988a, Integer.MIN_VALUE);
        Integer numValueOf2 = Integer.valueOf(iOptInt2);
        int iOptInt3 = jSONObject.optInt("pivotBitrate", Integer.MIN_VALUE);
        Integer numValueOf3 = Integer.valueOf(iOptInt3);
        int iOptInt4 = jSONObject.optInt("padding", Integer.MIN_VALUE);
        Integer numValueOf4 = Integer.valueOf(iOptInt4);
        if (iOptInt == Integer.MIN_VALUE) {
            numValueOf = null;
        }
        jVar.f20470b = numValueOf;
        if (iOptInt2 == Integer.MIN_VALUE) {
            numValueOf2 = null;
        }
        jVar.f20471c = numValueOf2;
        jVar.f20472d = Skip.fromValue(Integer.valueOf(jSONObject.optInt("skip", Integer.MIN_VALUE)));
        jVar.f20473e = jSONObject.has("muted") ? Boolean.valueOf(jSONObject.optBoolean("muted", true)) : null;
        jVar.f20469a = jSONObject.has("autoPlay") ? Boolean.valueOf(jSONObject.optBoolean("autoPlay", true)) : null;
        jVar.f20475g = Orientation.fromValue(jSONObject.optString("orientation"));
        jVar.f20474f = TapAction.fromValue(jSONObject.optString("tap"));
        if (iOptInt3 == Integer.MIN_VALUE) {
            numValueOf3 = null;
        }
        jVar.f20476h = numValueOf3;
        jVar.f20477i = iOptInt4 != Integer.MIN_VALUE ? numValueOf4 : null;
        jVar.f20478j = UnitDisplayType.fromValue(jSONObject.optString("unitDisplayType"));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("filterApi");
        if (jSONArrayOptJSONArray != null) {
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                int iOptInt5 = jSONArrayOptJSONArray.optInt(i10, Integer.MIN_VALUE);
                if (iOptInt5 != Integer.MIN_VALUE) {
                    jVar.f20479k.add(Integer.valueOf(iOptInt5));
                }
            }
        }
        return jVar;
    }
}
