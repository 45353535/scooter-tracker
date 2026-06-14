package io.appmetrica.analytics.impl;

import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class Y9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f76703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f76704c;

    public Y9(JSONObject jSONObject) {
        this.f76702a = jSONObject.getString("name");
        this.f76704c = jSONObject.getBoolean(POBCoreNativeConstants.NATIVE_REQUIRED_FIELD);
        this.f76703b = jSONObject.optInt("version", -1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Y9.class == obj.getClass()) {
            Y9 y92 = (Y9) obj;
            if (this.f76703b != y92.f76703b || this.f76704c != y92.f76704c) {
                return false;
            }
            String str = this.f76702a;
            String str2 = y92.f76702a;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f76702a;
        return ((((str != null ? str.hashCode() : 0) * 31) + this.f76703b) * 31) + (this.f76704c ? 1 : 0);
    }

    public Y9(String str, int i10, boolean z10) {
        this.f76702a = str;
        this.f76703b = i10;
        this.f76704c = z10;
    }
}
