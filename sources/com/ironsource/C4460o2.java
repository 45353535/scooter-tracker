package com.ironsource;

import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.o2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4460o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f44517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f44518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f44519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f44520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f44521e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f44522f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f44523g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f44524h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f44525i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f44526j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f44527k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f44528l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f44529m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ArrayList<String> f44530n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f44531o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f44532p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f44533q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f44534r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f44535s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f44536t;

    public C4460o2() {
        this.f44518b = "";
        this.f44519c = "";
        this.f44520d = "";
        this.f44525i = 0L;
        this.f44526j = 0L;
        this.f44527k = 0L;
        this.f44528l = 0L;
        this.f44529m = true;
        this.f44530n = new ArrayList<>();
        this.f44523g = 0;
        this.f44531o = false;
        this.f44532p = false;
        this.f44533q = 1;
    }

    public String a() {
        return this.f44518b;
    }

    public long b() {
        return this.f44526j;
    }

    public int c() {
        return this.f44522f;
    }

    public int d() {
        return this.f44533q;
    }

    public boolean e() {
        return this.f44529m;
    }

    public ArrayList<String> f() {
        return this.f44530n;
    }

    public int g() {
        return this.f44521e;
    }

    public boolean h() {
        return this.f44517a;
    }

    public int i() {
        return this.f44523g;
    }

    public long j() {
        return this.f44527k;
    }

    public long k() {
        return this.f44525i;
    }

    public long l() {
        return this.f44528l;
    }

    public long m() {
        return this.f44524h;
    }

    public boolean n() {
        return this.f44536t;
    }

    public boolean o() {
        return this.f44531o;
    }

    public boolean p() {
        return this.f44532p;
    }

    public boolean q() {
        return this.f44535s;
    }

    public boolean r() {
        return this.f44534r;
    }

    public String a(boolean z10) {
        return z10 ? this.f44520d : this.f44519c;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f44530n.add(str);
    }

    C4460o2(String str, String str2, String str3, int i10, int i11, long j10, long j11, long j12, long j13, long j14, boolean z10, int i12, boolean z11, boolean z12, boolean z13, int i13, boolean z14, boolean z15, boolean z16) {
        this.f44518b = str;
        this.f44519c = str2;
        this.f44520d = str3;
        this.f44521e = i10;
        this.f44522f = i11;
        this.f44524h = j10;
        this.f44517a = z13;
        this.f44525i = j11;
        this.f44526j = j12;
        this.f44527k = j13;
        this.f44528l = j14;
        this.f44529m = z10;
        this.f44523g = i12;
        this.f44530n = new ArrayList<>();
        this.f44531o = z11;
        this.f44532p = z12;
        this.f44533q = i13;
        this.f44534r = z14;
        this.f44535s = z15;
        this.f44536t = z16;
    }
}
