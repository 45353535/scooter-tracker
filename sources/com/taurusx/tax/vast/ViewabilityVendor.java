package com.taurusx.tax.vast;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.taurusx.tax.log.LogUtil;
import j$.util.Objects;
import java.io.Serializable;
import java.net.URL;
import java.security.InvalidParameterException;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class ViewabilityVendor implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f67064a = "javascriptResourceUrl";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f67065g = "apiFramework";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f67066n = "vendorKey";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final long f67067o = 2566572076713868153L;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f67068s = "omid";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f67069t = "verificationParameters";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f67070c;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final URL f67071w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f67072y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f67073z;

    public static class Builder {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f67074c;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public String f67075o;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public String f67076w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public String f67077y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public String f67078z = "omid";

        public Builder(String str) {
            this.f67077y = str;
        }

        public ViewabilityVendor build() {
            try {
                return new ViewabilityVendor(this);
            } catch (Exception e10) {
                LogUtil.v("taurusx", "Warning: " + e10.getLocalizedMessage());
                return null;
            }
        }

        public Builder withApiFramework(String str) {
            this.f67078z = str;
            return this;
        }

        public Builder withVendorKey(String str) {
            this.f67076w = str;
            return this;
        }

        public Builder withVerificationNotExecuted(String str) {
            this.f67075o = str;
            return this;
        }

        public Builder withVerificationParameters(String str) {
            this.f67074c = str;
            return this;
        }
    }

    public static Set<ViewabilityVendor> createFromJsonArray(JSONArray jSONArray) {
        HashSet hashSet = new HashSet();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                ViewabilityVendor viewabilityVendorZ = z(jSONArray.optJSONObject(i10));
                if (viewabilityVendorZ != null) {
                    hashSet.add(viewabilityVendorZ);
                }
            }
        }
        return hashSet;
    }

    public static ViewabilityVendor z(JSONObject jSONObject) {
        Builder builder = new Builder(jSONObject.optString(f67064a));
        builder.withApiFramework(jSONObject.optString("apiFramework", "")).withVendorKey(jSONObject.optString("vendorKey", "")).withVerificationParameters(jSONObject.optString(f67069t, ""));
        return builder.build();
    }

    @SuppressLint({"NewApi"})
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewabilityVendor)) {
            return false;
        }
        ViewabilityVendor viewabilityVendor = (ViewabilityVendor) obj;
        if (Objects.equals(this.f67073z, viewabilityVendor.f67073z) && Objects.equals(this.f67071w, viewabilityVendor.f67071w) && Objects.equals(this.f67072y, viewabilityVendor.f67072y)) {
            return Objects.equals(this.f67070c, viewabilityVendor.f67070c);
        }
        return false;
    }

    public URL getJavascriptResourceUrl() {
        return this.f67071w;
    }

    public String getVendorKey() {
        return this.f67073z;
    }

    public String getVerificationNotExecuted() {
        return this.f67070c;
    }

    public String getVerificationParameters() {
        return this.f67072y;
    }

    public int hashCode() {
        String str = this.f67073z;
        int iHashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f67071w.hashCode()) * 31;
        String str2 = this.f67072y;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f67070c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return this.f67073z + IOUtils.LINE_SEPARATOR_UNIX + this.f67071w + IOUtils.LINE_SEPARATOR_UNIX + this.f67072y + IOUtils.LINE_SEPARATOR_UNIX;
    }

    public ViewabilityVendor(Builder builder) throws Exception {
        if (!"omid".equalsIgnoreCase(builder.f67078z) || TextUtils.isEmpty(builder.f67077y)) {
            throw new InvalidParameterException("ViewabilityVendor cannot be created.");
        }
        this.f67073z = builder.f67076w;
        this.f67071w = new URL(builder.f67077y);
        this.f67072y = builder.f67074c;
        this.f67070c = builder.f67075o;
    }
}
