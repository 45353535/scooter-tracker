package com.my.target;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class y5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f61078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f61079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f61080c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f61083f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public t f61084g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f61082e = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f61085h = 10000;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f61086i = 0.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final za f61081d = za.a(h0.f59787e);

    public y5(String str, String str2, String str3) {
        this.f61078a = str;
        this.f61079b = str2;
        this.f61080c = str3;
    }

    public static y5 a(String str, String str2, String str3) {
        return new y5(str, str2, str3);
    }

    public String b() {
        return this.f61078a;
    }

    public Map c() {
        return new HashMap(this.f61082e);
    }

    public String d() {
        return this.f61083f;
    }

    public String e() {
        return this.f61079b;
    }

    public float f() {
        return this.f61086i;
    }

    public t g() {
        return this.f61084g;
    }

    public za h() {
        return this.f61081d;
    }

    public int i() {
        return this.f61085h;
    }

    public boolean j() {
        return "myTarget".equals(this.f61078a);
    }

    public String a() {
        return this.f61080c;
    }

    public void a(String str) {
        this.f61083f = str;
    }

    public void a(int i10) {
        this.f61085h = i10;
    }

    public void a(float f10) {
        this.f61086i = f10;
    }

    public void a(t tVar) {
        this.f61084g = tVar;
    }

    public void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str2 == null) {
            this.f61082e.remove(str);
        } else {
            this.f61082e.put(str, str2);
        }
    }
}
