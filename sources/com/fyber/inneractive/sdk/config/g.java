package com.fyber.inneractive.sdk.config;

import android.app.Application;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f20352a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f20353b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f20354c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f20355d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f20356e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public InneractiveAdManager.GdprConsentSource f20357f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f20358g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f20359h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Boolean f20360i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Boolean f20361j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public SharedPreferences f20362k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public SharedPreferences f20363l;

    public final boolean a(boolean z10, String str) {
        if (com.fyber.inneractive.sdk.util.o.f23888a == null) {
            return false;
        }
        f();
        SharedPreferences sharedPreferences = this.f20362k;
        if (sharedPreferences == null) {
            return false;
        }
        sharedPreferences.edit().putBoolean(str, z10).apply();
        return true;
    }

    public final void b() {
        IAlog.a("Clearing LGPD consent status", new Object[0]);
        if (com.fyber.inneractive.sdk.util.o.f23888a == null) {
            IAlog.f("clearLgpdConsentStatus was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
            return;
        }
        f();
        this.f20360i = null;
        SharedPreferences sharedPreferences = this.f20362k;
        if (sharedPreferences != null) {
            sharedPreferences.edit().remove("IALgpdConsentStatus").apply();
        }
    }

    public final void c() {
        IAlog.a("Clearing CCPA Consent String", new Object[0]);
        if (com.fyber.inneractive.sdk.util.o.f23888a == null) {
            IAlog.f("clearUSPrivacyString was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
            return;
        }
        f();
        this.f20359h = null;
        SharedPreferences sharedPreferences = this.f20362k;
        if (sharedPreferences != null) {
            sharedPreferences.edit().remove("IACCPAConsentData").apply();
        }
    }

    public final Boolean d() {
        if (this.f20352a == null) {
            this.f20353b = g();
        }
        if (com.fyber.inneractive.sdk.util.o.f23888a == null) {
            return null;
        }
        Boolean bool = this.f20352a;
        return bool == null ? this.f20353b : bool;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e() {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            java.lang.Boolean r2 = r5.f20354c
            if (r2 != 0) goto L4d
            com.fyber.inneractive.sdk.config.IAConfigManager r2 = com.fyber.inneractive.sdk.config.IAConfigManager.O
            com.fyber.inneractive.sdk.config.s r2 = r2.f20315u
            if (r2 == 0) goto L46
            com.fyber.inneractive.sdk.config.o r2 = r2.f20484b
            if (r2 != 0) goto L11
            goto L46
        L11:
            java.lang.String r3 = "TcfPurpose1"
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            int r2 = r2.a(r3, r0, r4)
            if (r2 != r0) goto L46
            android.content.SharedPreferences r2 = r5.f20363l
            if (r2 != 0) goto L20
            goto L46
        L20:
            java.lang.String r3 = "IABTCF_PurposeConsents"
            r4 = 0
            java.lang.String r2 = r2.getString(r3, r4)     // Catch: java.lang.Exception -> L39
            if (r2 == 0) goto L46
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L30
            goto L46
        L30:
            char r2 = r2.charAt(r1)
            r3 = 48
            if (r2 != r3) goto L46
            goto L47
        L39:
            java.lang.String r2 = com.fyber.inneractive.sdk.util.IAlog.a(r5)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r1] = r2
            java.lang.String r2 = "%sException caught when trying to resolveIsIabGdprPurpose1Disabled from prefs"
            com.fyber.inneractive.sdk.util.IAlog.b(r2, r0)
        L46:
            r0 = r1
        L47:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.f20354c = r0
        L4d:
            java.lang.Boolean r0 = r5.f20354c
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.config.g.e():boolean");
    }

    public final void f() {
        Application application = com.fyber.inneractive.sdk.util.o.f23888a;
        if (application != null) {
            if (this.f20363l == null) {
                this.f20363l = application.getSharedPreferences(application.getPackageName() + "_preferences", 0);
            }
            if (this.f20362k == null) {
                SharedPreferences sharedPreferences = application.getSharedPreferences("IAConfigurationPreferences", 0);
                this.f20362k = sharedPreferences;
                if (sharedPreferences != null) {
                    if (sharedPreferences.contains("IAGDPRBool")) {
                        this.f20352a = Boolean.valueOf(sharedPreferences.getBoolean("IAGDPRBool", false));
                    } else {
                        this.f20353b = g();
                    }
                    if (sharedPreferences.contains("IAGdprConsentData")) {
                        this.f20355d = sharedPreferences.getString("IAGdprConsentData", null);
                    } else {
                        this.f20356e = h();
                    }
                    if (sharedPreferences.contains("IACCPAConsentData")) {
                        this.f20359h = sharedPreferences.getString("IACCPAConsentData", null);
                    }
                    if (sharedPreferences.contains("IAGdprSource")) {
                        try {
                            this.f20357f = InneractiveAdManager.GdprConsentSource.valueOf(sharedPreferences.getString("IAGdprSource", InneractiveAdManager.GdprConsentSource.Internal.toString()));
                        } catch (Exception unused) {
                            this.f20357f = InneractiveAdManager.GdprConsentSource.Internal;
                        }
                    }
                    if (sharedPreferences.contains("IALgpdConsentStatus")) {
                        this.f20360i = Boolean.valueOf(sharedPreferences.getBoolean("IALgpdConsentStatus", false));
                    }
                    if (sharedPreferences.contains("keyUserID")) {
                        this.f20358g = sharedPreferences.getString("keyUserID", null);
                    }
                }
            }
        }
    }

    public final Boolean g() {
        o oVar;
        SharedPreferences sharedPreferences;
        s sVar = IAConfigManager.O.f20315u;
        if (sVar != null && (oVar = sVar.f20484b) != null) {
            int iA = oVar.a("TcfVendorId", 262, Integer.MIN_VALUE);
            if (iA != 0 && (sharedPreferences = this.f20363l) != null) {
                try {
                    String string = sharedPreferences.getString(com.taurusx.tax.g.q.f66284p, null);
                    if (string == null) {
                        return null;
                    }
                    int i10 = (iA >= 0 ? iA : 262) - 1;
                    return Boolean.valueOf(string.length() > i10 && string.charAt(i10) == '1');
                } catch (Exception unused) {
                }
            }
        }
        return null;
    }

    public final String h() {
        SharedPreferences sharedPreferences;
        if (IAConfigManager.O.f20315u.f20484b.a("TcfVendorId", 262, Integer.MIN_VALUE) != 0 && (sharedPreferences = this.f20363l) != null && sharedPreferences.contains("IABTCF_TCString")) {
            try {
                return this.f20363l.getString("IABTCF_TCString", null);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final boolean a(String str, String str2) {
        if (com.fyber.inneractive.sdk.util.o.f23888a != null) {
            f();
            if (this.f20362k != null) {
                IAlog.a("Saving %s value = %s to sharedPrefs", str, str2);
                this.f20362k.edit().putString(str, str2).apply();
                return true;
            }
        }
        return false;
    }

    public final void a(String str) {
        if (com.fyber.inneractive.sdk.util.o.f23888a != null) {
            f();
            if (TextUtils.isEmpty(str)) {
                this.f20358g = str;
                SharedPreferences sharedPreferences = this.f20362k;
                if (sharedPreferences != null) {
                    sharedPreferences.edit().remove("keyUserID").apply();
                    return;
                }
                return;
            }
            if (str.length() > 512) {
                str = str.substring(0, 512);
            }
            SharedPreferences sharedPreferences2 = this.f20362k;
            if (sharedPreferences2 != null) {
                this.f20358g = str;
                sharedPreferences2.edit().putString("keyUserID", str).apply();
            }
        }
    }

    public final void a() {
        IAlog.a("Clearing GDPR Consent String and status", new Object[0]);
        if (com.fyber.inneractive.sdk.util.o.f23888a == null) {
            IAlog.f("ClearGdprConsent was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
            return;
        }
        f();
        this.f20352a = null;
        this.f20355d = null;
        SharedPreferences sharedPreferences = this.f20362k;
        if (sharedPreferences != null) {
            sharedPreferences.edit().remove("IAGdprConsentData").remove("IAGDPRBool").remove("IAGdprSource").apply();
        }
    }
}
