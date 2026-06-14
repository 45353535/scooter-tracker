package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class c8 implements q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Uri f8505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Uri f8506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f8507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f8508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f8509e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f8510f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f8511g;

    public enum a {
        Progressive,
        Streaming
    }

    private c8() {
    }

    public static c8 a(p8 p8Var, com.applovin.impl.sdk.k kVar) {
        if (p8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        try {
            String strD = p8Var.d();
            if (!URLUtil.isValidUrl(strD)) {
                kVar.O();
                if (!com.applovin.impl.sdk.o.a()) {
                    return null;
                }
                kVar.O().b("VastVideoFile", "Unable to create video file. Could not find URL.");
                return null;
            }
            Uri uri = Uri.parse(strD);
            c8 c8Var = new c8();
            c8Var.f8505a = uri;
            c8Var.f8506b = uri;
            c8Var.f8511g = a(p8Var);
            c8Var.f8507c = a((String) p8Var.a().get("delivery"));
            c8Var.f8510f = StringUtils.parseInt((String) p8Var.a().get("height"));
            c8Var.f8509e = StringUtils.parseInt((String) p8Var.a().get("width"));
            c8Var.f8508d = ((String) p8Var.a().get("type")).toLowerCase(Locale.ENGLISH);
            return c8Var;
        } catch (Throwable th2) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("VastVideoFile", "Error occurred while initializing", th2);
            }
            kVar.D().a("VastVideoFile", th2);
            return null;
        }
    }

    public long b() {
        return this.f8511g;
    }

    public String c() {
        return this.f8508d;
    }

    public Uri d() {
        return this.f8505a;
    }

    public Uri e() {
        return this.f8506b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c8)) {
            return false;
        }
        c8 c8Var = (c8) obj;
        if (this.f8509e != c8Var.f8509e || this.f8510f != c8Var.f8510f || this.f8511g != c8Var.f8511g) {
            return false;
        }
        Uri uri = this.f8505a;
        if (uri == null ? c8Var.f8505a != null : !uri.equals(c8Var.f8505a)) {
            return false;
        }
        Uri uri2 = this.f8506b;
        if (uri2 == null ? c8Var.f8506b != null : !uri2.equals(c8Var.f8506b)) {
            return false;
        }
        if (this.f8507c != c8Var.f8507c) {
            return false;
        }
        String str = this.f8508d;
        String str2 = c8Var.f8508d;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        Uri uri = this.f8505a;
        int iHashCode = (uri != null ? uri.hashCode() : 0) * 31;
        Uri uri2 = this.f8506b;
        int iHashCode2 = (iHashCode + (uri2 != null ? uri2.hashCode() : 0)) * 31;
        a aVar = this.f8507c;
        int iHashCode3 = (iHashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        String str = this.f8508d;
        return ((((((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + this.f8509e) * 31) + this.f8510f) * 31) + Long.valueOf(this.f8511g).hashCode();
    }

    public String toString() {
        return "VastVideoFile{sourceVideoUri=" + this.f8505a + ", videoUri=" + this.f8506b + ", deliveryType=" + this.f8507c + ", fileType='" + this.f8508d + "', width=" + this.f8509e + ", height=" + this.f8510f + ", bitrate=" + this.f8511g + '}';
    }

    private static a a(String str) {
        if (StringUtils.isValidString(str)) {
            if ("progressive".equalsIgnoreCase(str)) {
                return a.Progressive;
            }
            if ("streaming".equalsIgnoreCase(str)) {
                return a.Streaming;
            }
        }
        return a.Progressive;
    }

    private static long a(p8 p8Var) {
        Map mapA = p8Var.a();
        long j10 = StringUtils.parseLong((String) mapA.get(com.taurusx.tax.f.a.f65992s), 0L);
        return j10 != 0 ? j10 : (StringUtils.parseLong((String) mapA.get(com.taurusx.tax.f.a.f65988a), 0L) + StringUtils.parseLong((String) mapA.get(com.taurusx.tax.f.a.f65990n), 0L)) / 2;
    }

    public void a(Uri uri) {
        this.f8506b = uri;
    }

    public static c8 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        String string = JsonUtils.getString(jSONObject, "source_video_uri", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        Uri uri = Uri.parse(string);
        if (TextUtils.isEmpty(JsonUtils.getString(jSONObject, "video_uri", null))) {
            return null;
        }
        Uri uri2 = Uri.parse(string);
        String string2 = JsonUtils.getString(jSONObject, "file_type", null);
        if (TextUtils.isEmpty(string2)) {
            return null;
        }
        a aVarValueOf = a.valueOf(JsonUtils.getString(jSONObject, "delivery_type", a.Progressive.toString()));
        int i10 = JsonUtils.getInt(jSONObject, "width", 0);
        int i11 = JsonUtils.getInt(jSONObject, "height", 0);
        int i12 = JsonUtils.getInt(jSONObject, com.taurusx.tax.f.a.f65992s, 0);
        c8 c8Var = new c8();
        c8Var.f8505a = uri;
        c8Var.f8506b = uri2;
        c8Var.f8507c = aVarValueOf;
        c8Var.f8508d = string2;
        c8Var.f8509e = i10;
        c8Var.f8510f = i11;
        c8Var.f8511g = i12;
        return c8Var;
    }

    @Override // com.applovin.impl.q4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        Uri uri = this.f8505a;
        if (uri != null) {
            JsonUtils.putString(jSONObject, "source_video_uri", uri.toString());
        }
        Uri uri2 = this.f8506b;
        if (uri2 != null) {
            JsonUtils.putString(jSONObject, "video_uri", uri2.toString());
        }
        a aVar = this.f8507c;
        JsonUtils.putString(jSONObject, "delivery_type", aVar == null ? null : aVar.toString());
        JsonUtils.putString(jSONObject, "file_type", this.f8508d);
        JsonUtils.putInt(jSONObject, "width", this.f8509e);
        JsonUtils.putInt(jSONObject, "height", this.f8510f);
        JsonUtils.putLong(jSONObject, com.taurusx.tax.f.a.f65992s, this.f8511g);
        return jSONObject;
    }
}
