package com.my.target;

/* JADX INFO: loaded from: classes11.dex */
public class h0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h0 f59787e = new h0(o.f60433i, "empty", "empty");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o f59788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f59789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f59790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f59791d = true;

    public h0(o oVar, String str, String str2) {
        this.f59788a = oVar;
        this.f59789b = str;
        this.f59790c = str2;
    }

    public void a(o oVar) {
        this.f59788a = oVar;
    }

    public boolean b() {
        return this.f59791d;
    }

    public void c(int i10, int i11, String str) {
        a(i10, 1, i11, str);
    }

    public o a() {
        return this.f59788a;
    }

    public void b(int i10, int i11) {
        a(i10, 1, i11, null);
    }

    public void a(int i10, int i11, String str) {
        a(i10, 0, i11, str);
    }

    public void b(int i10, int i11, String str) {
        a(i10, 3, i11, str);
    }

    public void a(int i10, int i11) {
        a(i10, 3, i11, null);
    }

    public final void a(int i10, int i11, int i12, String str) {
        this.f59788a.f60439f.a(this, i10, i11, i12, str, (String) null);
    }
}
