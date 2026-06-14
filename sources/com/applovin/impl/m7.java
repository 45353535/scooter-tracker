package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public final class m7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f9341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f9342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f9343c = a(z4.f11627l);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f9344d = a(z4.f11628m);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f9345e = (String) a5.a(z4.f11629n, (Object) null, com.applovin.impl.sdk.k.o());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f9346f = (String) a5.a(z4.f11630o, (Object) null, com.applovin.impl.sdk.k.o());

    public m7(com.applovin.impl.sdk.k kVar) {
        this.f9341a = kVar;
        a(f());
    }

    private String f() {
        if (!((Boolean) this.f9341a.a(x4.K3)).booleanValue()) {
            this.f9341a.c(z4.f11626k);
        }
        String str = (String) this.f9341a.a(z4.f11626k);
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        this.f9341a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f9341a.O().a("AppLovinSdk", "Using identifier (" + str + ") from previous session");
        }
        return str;
    }

    public String a() {
        return this.f9344d;
    }

    public String b() {
        return this.f9345e;
    }

    public String c() {
        return this.f9343c;
    }

    public String d() {
        return this.f9346f;
    }

    public String e() {
        return this.f9342b;
    }

    private String a(z4 z4Var) {
        String str = (String) a5.a(z4Var, (Object) null, com.applovin.impl.sdk.k.o());
        if (StringUtils.isValidString(str)) {
            return str;
        }
        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
        a5.b(z4Var, lowerCase, com.applovin.impl.sdk.k.o());
        return lowerCase;
    }

    public void b(String str) {
        this.f9345e = str;
        a5.b(z4.f11629n, str, com.applovin.impl.sdk.k.o());
    }

    public void c(String str) {
        this.f9346f = str;
        a5.b(z4.f11630o, str, com.applovin.impl.sdk.k.o());
    }

    public void a(String str) {
        if (((Boolean) this.f9341a.a(x4.K3)).booleanValue()) {
            this.f9341a.b(z4.f11626k, str);
        }
        this.f9342b = str;
        this.f9341a.t().b(str, a());
    }

    public static String a(com.applovin.impl.sdk.k kVar) {
        z4 z4Var = z4.f11631p;
        String str = (String) kVar.a(z4Var);
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String strValueOf = String.valueOf(((int) (Math.random() * 100.0d)) + 1);
        kVar.b(z4Var, strValueOf);
        return strValueOf;
    }
}
