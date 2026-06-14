package yads;

import android.text.Layout;

/* JADX INFO: loaded from: classes4.dex */
public final class i73 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f111894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f111895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f111896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f111897d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f111898e;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f111904k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f111905l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Layout.Alignment f111908o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Layout.Alignment f111909p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public h33 f111911r;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f111899f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f111900g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f111901h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f111902i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f111903j = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f111906m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f111907n = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f111910q = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f111912s = Float.MAX_VALUE;

    public final i73 a(i73 i73Var) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (i73Var != null) {
            if (!this.f111896c && i73Var.f111896c) {
                this.f111895b = i73Var.f111895b;
                this.f111896c = true;
            }
            if (this.f111901h == -1) {
                this.f111901h = i73Var.f111901h;
            }
            if (this.f111902i == -1) {
                this.f111902i = i73Var.f111902i;
            }
            if (this.f111894a == null && (str = i73Var.f111894a) != null) {
                this.f111894a = str;
            }
            if (this.f111899f == -1) {
                this.f111899f = i73Var.f111899f;
            }
            if (this.f111900g == -1) {
                this.f111900g = i73Var.f111900g;
            }
            if (this.f111907n == -1) {
                this.f111907n = i73Var.f111907n;
            }
            if (this.f111908o == null && (alignment2 = i73Var.f111908o) != null) {
                this.f111908o = alignment2;
            }
            if (this.f111909p == null && (alignment = i73Var.f111909p) != null) {
                this.f111909p = alignment;
            }
            if (this.f111910q == -1) {
                this.f111910q = i73Var.f111910q;
            }
            if (this.f111903j == -1) {
                this.f111903j = i73Var.f111903j;
                this.f111904k = i73Var.f111904k;
            }
            if (this.f111911r == null) {
                this.f111911r = i73Var.f111911r;
            }
            if (this.f111912s == Float.MAX_VALUE) {
                this.f111912s = i73Var.f111912s;
            }
            if (!this.f111898e && i73Var.f111898e) {
                this.f111897d = i73Var.f111897d;
                this.f111898e = true;
            }
            if (this.f111906m == -1 && (i10 = i73Var.f111906m) != -1) {
                this.f111906m = i10;
            }
        }
        return this;
    }
}
