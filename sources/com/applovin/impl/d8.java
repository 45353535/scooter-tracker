package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class d8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f8672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f8673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f8674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f8675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f8676e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f8677f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f8678g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f8679h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f8680i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final float f8681j;

    public d8(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        kVar.O();
        if (com.applovin.impl.sdk.o.a()) {
            kVar.O().d("VideoButtonProperties", "Updating video button properties with JSON = " + JsonUtils.maybeConvertToIndentedString(jSONObject));
        }
        this.f8672a = JsonUtils.getInt(jSONObject, "width", 64);
        this.f8673b = JsonUtils.getInt(jSONObject, "height", 7);
        this.f8674c = JsonUtils.getInt(jSONObject, "margin", 20);
        this.f8675d = JsonUtils.getInt(jSONObject, "gravity", 85);
        this.f8676e = JsonUtils.getBoolean(jSONObject, "tap_to_fade", Boolean.FALSE).booleanValue();
        this.f8677f = JsonUtils.getInt(jSONObject, "tap_to_fade_duration_milliseconds", 500);
        this.f8678g = JsonUtils.getInt(jSONObject, "fade_in_duration_milliseconds", 500);
        this.f8679h = JsonUtils.getInt(jSONObject, "fade_out_duration_milliseconds", 500);
        this.f8680i = JsonUtils.getFloat(jSONObject, "fade_in_delay_seconds", 1.0f);
        this.f8681j = JsonUtils.getFloat(jSONObject, "fade_out_delay_seconds", 6.0f);
    }

    public float a() {
        return this.f8680i;
    }

    public long b() {
        return this.f8678g;
    }

    public float c() {
        return this.f8681j;
    }

    public long d() {
        return this.f8679h;
    }

    public int e() {
        return this.f8675d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            d8 d8Var = (d8) obj;
            if (this.f8672a == d8Var.f8672a && this.f8673b == d8Var.f8673b && this.f8674c == d8Var.f8674c && this.f8675d == d8Var.f8675d && this.f8676e == d8Var.f8676e && this.f8677f == d8Var.f8677f && this.f8678g == d8Var.f8678g && this.f8679h == d8Var.f8679h && Float.compare(d8Var.f8680i, this.f8680i) == 0 && Float.compare(d8Var.f8681j, this.f8681j) == 0) {
                return true;
            }
        }
        return false;
    }

    public int f() {
        return this.f8673b;
    }

    public int g() {
        return this.f8674c;
    }

    public long h() {
        return this.f8677f;
    }

    public int hashCode() {
        int i10 = ((((((((((((((this.f8672a * 31) + this.f8673b) * 31) + this.f8674c) * 31) + this.f8675d) * 31) + (this.f8676e ? 1 : 0)) * 31) + this.f8677f) * 31) + this.f8678g) * 31) + this.f8679h) * 31;
        float f10 = this.f8680i;
        int iFloatToIntBits = (i10 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
        float f11 = this.f8681j;
        return iFloatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0);
    }

    public int i() {
        return this.f8672a;
    }

    public boolean j() {
        return this.f8676e;
    }

    public String toString() {
        return "VideoButtonProperties{widthPercentOfScreen=" + this.f8672a + ", heightPercentOfScreen=" + this.f8673b + ", margin=" + this.f8674c + ", gravity=" + this.f8675d + ", tapToFade=" + this.f8676e + ", tapToFadeDurationMillis=" + this.f8677f + ", fadeInDurationMillis=" + this.f8678g + ", fadeOutDurationMillis=" + this.f8679h + ", fadeInDelay=" + this.f8680i + ", fadeOutDelay=" + this.f8681j + '}';
    }
}
