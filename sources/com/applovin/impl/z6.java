package com.applovin.impl;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import androidx.collection.SieveCacheKt;
import com.applovin.impl.sdk.utils.StringUtils;
import com.ironsource.Sd;
import com.startapp.simple.bloomfilter.codec.IOUtils;

/* JADX INFO: loaded from: classes6.dex */
public class z6 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f11645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences f11646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f11647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Integer f11648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Integer f11649e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f11650f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f11651g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f11652h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f11653i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f11654j;

    public z6(com.applovin.impl.sdk.k kVar) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(com.applovin.impl.sdk.k.o());
        this.f11646b = defaultSharedPreferences;
        this.f11645a = kVar;
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this);
        this.f11647c = a(z4.f11636u.a());
        this.f11648d = a(z4.f11637v.a());
        this.f11649e = h();
        this.f11650f = (String) a5.a(z4.f11639x, (Object) null, defaultSharedPreferences, false);
        this.f11651g = (String) a5.a(z4.f11640y, (Object) null, defaultSharedPreferences, false);
        this.f11652h = (String) a5.a(z4.f11641z, (Object) null, defaultSharedPreferences, false);
        this.f11653i = (String) a5.a(z4.B, (Object) null, defaultSharedPreferences, false);
        this.f11654j = (String) a5.a(z4.D, (Object) null, defaultSharedPreferences, false);
        b(this.f11651g);
    }

    private Integer h() {
        String strA = z4.f11638w.a();
        if (this.f11646b.contains(strA)) {
            Integer num = (Integer) a5.a(strA, null, Integer.class, this.f11646b, false);
            if (num != null) {
                if (num.intValue() == 1 || num.intValue() == 0) {
                    return num;
                }
                this.f11645a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f11645a.O().b("TcfManager", "Integer value (" + num + ") for " + strA + " is invalid - setting GDPR Applies to null");
                }
                return null;
            }
            Long l10 = (Long) a5.a(strA, null, Long.class, this.f11646b, false);
            if (l10 != null) {
                if (l10.longValue() == 1 || l10.longValue() == 0) {
                    return Integer.valueOf(l10.intValue());
                }
                this.f11645a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f11645a.O().b("TcfManager", "Long value (" + l10 + ") for " + strA + " is invalid - setting GDPR Applies to null");
                }
                return null;
            }
            Boolean bool = (Boolean) a5.a(strA, null, Boolean.class, this.f11646b, false);
            if (bool != null) {
                return Integer.valueOf(bool.booleanValue() ? 1 : 0);
            }
            String str = (String) a5.a(strA, null, String.class, this.f11646b, false);
            if (str != null) {
                if ("1".equals(str) || "true".equals(str)) {
                    return 1;
                }
                if ("0".equals(str) || "false".equals(str)) {
                    return 0;
                }
                this.f11645a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f11645a.O().b("TcfManager", "String value (" + str + ") for " + strA + " is invalid - setting GDPR Applies to null");
                }
                return null;
            }
        }
        return null;
    }

    public Boolean a(int i10) {
        return c7.a(i10, this.f11651g);
    }

    public boolean b() {
        return c7.a(this.f11651g);
    }

    public String c() {
        return this.f11651g;
    }

    public String d() {
        return x6.a(this.f11647c);
    }

    public Integer e() {
        return this.f11647c;
    }

    public Integer f() {
        return this.f11648d;
    }

    public Integer g() {
        return this.f11649e;
    }

    public String i() {
        return a("CMP Name", d()) + a("CMP SDK ID", this.f11647c) + a("CMP SDK Version", this.f11648d) + a(z4.f11638w.a(), this.f11649e) + a(z4.f11639x.a(), this.f11650f) + a(z4.f11640y.a(), this.f11651g);
    }

    public String j() {
        return this.f11650f;
    }

    public String k() {
        return this.f11652h;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str == null) {
            this.f11645a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f11645a.O().a("TcfManager", "SharedPreferences are cleared - setting all stored TC data to null");
            }
            a();
            return;
        }
        if (str.equals(z4.f11636u.a())) {
            this.f11647c = a(str);
            this.f11645a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f11645a.O().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f11647c);
            }
            this.f11645a.Q0();
            return;
        }
        if (str.equals(z4.f11637v.a())) {
            this.f11648d = a(str);
            this.f11645a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f11645a.O().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f11648d);
                return;
            }
            return;
        }
        if (str.equals(z4.f11638w.a())) {
            this.f11649e = h();
            this.f11645a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f11645a.O().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f11649e);
                return;
            }
            return;
        }
        if (str.equals(z4.f11639x.a())) {
            this.f11650f = (String) a5.a(str, (Object) null, String.class, sharedPreferences);
            this.f11645a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f11645a.O().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f11650f);
            }
            this.f11645a.Q0();
            return;
        }
        if (str.equals(z4.f11640y.a())) {
            this.f11651g = (String) a5.a(str, (Object) null, String.class, sharedPreferences);
            this.f11645a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f11645a.O().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f11651g);
            }
            b(this.f11651g);
            return;
        }
        if (str.equals(z4.f11641z.a())) {
            this.f11652h = (String) a5.a(str, (Object) null, String.class, sharedPreferences);
            this.f11645a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f11645a.O().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f11652h);
                return;
            }
            return;
        }
        if (str.equals(z4.A.a())) {
            String str2 = (String) a5.a(str, (Object) null, String.class, sharedPreferences);
            this.f11645a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f11645a.O().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + str2);
                return;
            }
            return;
        }
        if (str.equals(z4.B.a())) {
            this.f11653i = (String) a5.a(str, (Object) null, String.class, sharedPreferences);
            this.f11645a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f11645a.O().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f11653i);
                return;
            }
            return;
        }
        if (str.equals(z4.C.a())) {
            String str3 = (String) a5.a(str, (Object) null, String.class, sharedPreferences);
            this.f11645a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f11645a.O().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + str3);
                return;
            }
            return;
        }
        if (str.equals(z4.D.a())) {
            this.f11654j = (String) a5.a(str, (Object) null, String.class, sharedPreferences);
            this.f11645a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f11645a.O().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f11654j);
                return;
            }
            return;
        }
        if (str.contains("IABTCF_PublisherRestrictions")) {
            String str4 = (String) a5.a(str, (Object) null, String.class, sharedPreferences);
            this.f11645a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f11645a.O().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + str4);
            }
        }
    }

    private Integer a(String str) {
        if (this.f11646b.contains(str)) {
            Integer num = (Integer) a5.a(str, null, Integer.class, this.f11646b, false);
            if (num != null) {
                return num;
            }
            Long l10 = (Long) a5.a(str, null, Long.class, this.f11646b, false);
            if (l10 != null && l10.longValue() >= SieveCacheKt.NodeMetaAndPreviousMask && l10.longValue() <= SieveCacheKt.NodeLinkMask) {
                return Integer.valueOf(l10.intValue());
            }
            String str2 = (String) a5.a(str, null, String.class, this.f11646b, false);
            if (str2 != null) {
                if (StringUtils.isNumeric(str2)) {
                    return Integer.valueOf(Integer.parseInt(str2));
                }
                this.f11645a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f11645a.O().b("TcfManager", "String value (" + str2 + ") for " + str + " is not numeric - storing value as null");
                }
            }
        }
        return null;
    }

    public Boolean b(int i10) {
        String str = this.f11653i;
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(c7.a(str, i10 - 1));
    }

    public Boolean c(int i10) {
        String str = this.f11654j;
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(c7.a(str, i10 - 1));
    }

    public Boolean d(int i10) {
        String str = this.f11652h;
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(c7.a(str, i10 - 1));
    }

    private void b(String str) {
        this.f11645a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f11645a.O().a("TcfManager", "Attempting to update consent from Additional Consent string: " + str);
        }
        Boolean boolA = c7.a(Sd.c.f41757e, str);
        if (boolA != null) {
            if (boolA.booleanValue()) {
                this.f11645a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f11645a.O().a("TcfManager", "Found AppLovin ID in the list of consented ATP IDs - setting user consent to true");
                }
                p0.b(true, com.applovin.impl.sdk.k.o());
            } else {
                this.f11645a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f11645a.O().a("TcfManager", "Could not find AppLovin ID in the list of consented ATP IDs - setting user consent to false");
                }
                p0.b(false, com.applovin.impl.sdk.k.o());
            }
            this.f11645a.Q0();
            return;
        }
        this.f11645a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f11645a.O().a("TcfManager", "AC string is not valid or AppLovin was not listed on the CMP flow - no consent update");
        }
    }

    private void a() {
        this.f11647c = null;
        this.f11649e = null;
        this.f11650f = null;
        this.f11651g = null;
        this.f11652h = null;
    }

    private String a(String str, Object obj) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
        sb2.append(str);
        sb2.append(" - ");
        sb2.append(obj != null ? obj.toString() : "No value set");
        return sb2.toString();
    }
}
