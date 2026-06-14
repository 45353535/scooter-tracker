package ub;

import android.text.TextUtils;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f105374f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f105376h;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f105383o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f105369a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f105370b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Set f105371c = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f105372d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f105373e = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f105375g = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f105377i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f105378j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f105379k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f105380l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f105381m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f105382n = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f105384p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f105385q = false;

    private static int B(int i10, String str, String str2, int i11) {
        if (str.isEmpty() || i10 == -1) {
            return i10;
        }
        if (str.equals(str2)) {
            return i10 + i11;
        }
        return -1;
    }

    public c A(boolean z10) {
        this.f105379k = z10 ? 1 : 0;
        return this;
    }

    public int a() {
        if (this.f105377i) {
            return this.f105376h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public boolean b() {
        return this.f105385q;
    }

    public int c() {
        if (this.f105375g) {
            return this.f105374f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public String d() {
        return this.f105373e;
    }

    public float e() {
        return this.f105383o;
    }

    public int f() {
        return this.f105382n;
    }

    public int g() {
        return this.f105384p;
    }

    public int h(String str, String str2, Set set, String str3) {
        if (this.f105369a.isEmpty() && this.f105370b.isEmpty() && this.f105371c.isEmpty() && this.f105372d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iB = B(B(B(0, this.f105369a, str, 1073741824), this.f105370b, str2, 2), this.f105372d, str3, 4);
        if (iB == -1 || !set.containsAll(this.f105371c)) {
            return 0;
        }
        return iB + (this.f105371c.size() * 4);
    }

    public int i() {
        int i10 = this.f105380l;
        if (i10 == -1 && this.f105381m == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f105381m == 1 ? 2 : 0);
    }

    public boolean j() {
        return this.f105377i;
    }

    public boolean k() {
        return this.f105375g;
    }

    public boolean l() {
        return this.f105378j == 1;
    }

    public boolean m() {
        return this.f105379k == 1;
    }

    public c n(int i10) {
        this.f105376h = i10;
        this.f105377i = true;
        return this;
    }

    public c o(boolean z10) {
        this.f105380l = z10 ? 1 : 0;
        return this;
    }

    public c p(boolean z10) {
        this.f105385q = z10;
        return this;
    }

    public c q(int i10) {
        this.f105374f = i10;
        this.f105375g = true;
        return this;
    }

    public c r(String str) {
        this.f105373e = str == null ? null : Ascii.toLowerCase(str);
        return this;
    }

    public c s(float f10) {
        this.f105383o = f10;
        return this;
    }

    public c t(int i10) {
        this.f105382n = i10;
        return this;
    }

    public c u(boolean z10) {
        this.f105381m = z10 ? 1 : 0;
        return this;
    }

    public c v(int i10) {
        this.f105384p = i10;
        return this;
    }

    public void w(String[] strArr) {
        this.f105371c = new HashSet(Arrays.asList(strArr));
    }

    public void x(String str) {
        this.f105369a = str;
    }

    public void y(String str) {
        this.f105370b = str;
    }

    public void z(String str) {
        this.f105372d = str;
    }
}
