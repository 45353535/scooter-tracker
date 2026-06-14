package w4;

import android.content.Context;
import x4.x;

/* JADX INFO: loaded from: classes10.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f107458a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f107459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f107460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f107461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f107462e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    String f107463f;

    public d(Context context) {
        j(context);
    }

    public String a() {
        return this.f107461d;
    }

    public String b() {
        return this.f107462e;
    }

    public int c() {
        return this.f107460c;
    }

    public int d() {
        return this.f107459b;
    }

    public int e() {
        return this.f107458a;
    }

    public String f() {
        return this.f107463f;
    }

    public void g(String str) {
        this.f107461d = str;
    }

    public void h(String str) {
        this.f107462e = str;
    }

    public void i(int i10) {
        this.f107460c = i10;
    }

    public void j(Context context) {
        this.f107459b = x.h(context);
        this.f107460c = x.f(context);
        this.f107461d = x.e(context);
        this.f107462e = x.i(context);
        this.f107463f = x.j(context);
    }

    public void k(int i10) {
        this.f107459b = i10;
    }

    public void l(int i10) {
        this.f107458a = i10;
    }

    public void m(String str) {
        this.f107463f = str;
    }
}
