package com.taurusx.tax.g;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import com.taurusx.tax.log.LogUtil;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile q f66278e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f66279f = "IABTCF_gdprApplies";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f66280g = "IABTCF_TCString";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f66281i = "IABTCF_AddtlConsent";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f66282l = "IABGPP_GppSID";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f66283m = "IABTCF_PurposeConsents";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f66284p = "IABTCF_VendorConsents";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f66285t = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f66286v = "IABGPP_HDR_GppString";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f66287a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f66288c;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f66289n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f66290o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f66291s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f66292w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f66293y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public SharedPreferences f66294z;

    public q(Context context) {
        this.f66292w = "";
        this.f66293y = -1;
        this.f66288c = "";
        this.f66290o = "";
        this.f66291s = "";
        this.f66287a = "";
        this.f66289n = "";
        try {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
            this.f66294z = defaultSharedPreferences;
            if (defaultSharedPreferences == null) {
                return;
            }
            this.f66292w = defaultSharedPreferences.getString("IABTCF_TCString", "");
            this.f66293y = this.f66294z.getInt("IABTCF_gdprApplies", -1);
            this.f66288c = this.f66294z.getString(f66283m, "");
            this.f66290o = this.f66294z.getString(f66284p, "");
            this.f66291s = this.f66294z.getString(f66281i, "");
            this.f66287a = this.f66294z.getString("IABGPP_HDR_GppString", "");
            this.f66289n = this.f66294z.getString(f66282l, "");
            g();
        } catch (Throwable th2) {
            LogUtil.d("taurusx", "TCStringManager getInstance err: " + Log.getStackTraceString(th2));
        }
    }

    public String a() {
        return this.f66292w;
    }

    public String c() {
        return this.f66287a;
    }

    public void g() {
    }

    public String n() {
        return this.f66290o;
    }

    public String o() {
        return this.f66291s;
    }

    public String s() {
        return this.f66288c;
    }

    public int t() {
        return this.f66293y;
    }

    public void w(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("tcstring", a());
                jSONObject2.put("gdpr_applies", t());
                jSONObject2.put("purpose_consents", s());
                jSONObject2.put("vendor_consents", n());
                jSONObject2.put("addtl_consent", o());
                jSONObject.put("iabtcf", jSONObject2);
            } catch (Throwable th2) {
                LogUtil.d("taurusx", "TCStringManager addTCFParams err: " + Log.getStackTraceString(th2));
            }
        }
    }

    public String y() {
        return this.f66289n;
    }

    public void z(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("hdr_gppstring", c());
                jSONObject2.put("gppsid", y());
                jSONObject.put("iabgpp", jSONObject2);
            } catch (Throwable th2) {
                LogUtil.d("taurusx", "TCStringManager addTCFParams err: " + Log.getStackTraceString(th2));
            }
        }
    }

    public JSONObject z() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("hdr_gppstring", c());
            jSONObject2.put("gppsid", y());
            jSONObject.put("iabgpp", jSONObject2);
            return jSONObject;
        } catch (Throwable th2) {
            LogUtil.d("taurusx", "TCStringManager generateTCFParams err: " + Log.getStackTraceString(th2));
            return jSONObject;
        }
    }

    public JSONObject w() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("tcstring", a());
            jSONObject2.put("gdpr_applies", t());
            jSONObject2.put("purpose_consents", s());
            jSONObject2.put("vendor_consents", n());
            jSONObject2.put("addtl_consent", o());
            jSONObject.put("iabtcf", jSONObject2);
            return jSONObject;
        } catch (Throwable th2) {
            LogUtil.d("taurusx", "TCStringManager generateTCFParams err: " + Log.getStackTraceString(th2));
            return jSONObject;
        }
    }

    public static q z(Context context) {
        if (f66278e == null) {
            synchronized (q.class) {
                try {
                    if (f66278e == null) {
                        f66278e = new q(context);
                    }
                } finally {
                }
            }
        }
        return f66278e;
    }
}
