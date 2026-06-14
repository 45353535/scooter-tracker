package com.my.target;

/* JADX INFO: loaded from: classes11.dex */
public class ya {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f61108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f61109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f61110c = true;

    public ya(String str, String str2) {
        this.f61108a = str;
        this.f61109b = str2;
    }

    public static ya a(String str, String str2) {
        return new ya(str, str2);
    }

    public String b() {
        return this.f61109b;
    }

    public boolean c() {
        return this.f61110c;
    }

    public String a() {
        return this.f61108a;
    }

    public void a(boolean z10) {
        this.f61110c = z10;
    }
}
