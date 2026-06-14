package yads;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class at {
    public static final int[] A;
    public static final boolean[] B;
    public static final int[] C;
    public static final int[] D;
    public static final int[] E;
    public static final int[] F;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f108772w = a(2, 2, 2, 0);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f108773x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f108774y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f108775z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f108776a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SpannableStringBuilder f108777b = new SpannableStringBuilder();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f108778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f108779d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f108780e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f108781f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f108782g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f108783h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f108784i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f108785j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f108786k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f108787l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f108788m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f108789n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f108790o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f108791p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f108792q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f108793r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f108794s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f108795t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f108796u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f108797v;

    static {
        int iA = a(0, 0, 0, 0);
        f108773x = iA;
        int iA2 = a(0, 0, 0, 3);
        f108774y = new int[]{0, 0, 0, 0, 0, 2, 0};
        f108775z = new int[]{0, 0, 0, 0, 0, 0, 2};
        A = new int[]{3, 3, 3, 3, 3, 3, 1};
        B = new boolean[]{false, false, false, true, true, true, false};
        C = new int[]{iA, iA2, iA, iA, iA2, iA, iA};
        D = new int[]{0, 1, 2, 3, 4, 3, 4};
        E = new int[]{0, 0, 0, 0, 0, 3, 3};
        F = new int[]{iA, iA, iA, iA, iA, iA2, iA2};
    }

    public at() {
        b();
    }

    public final void a(char c10) {
        if (c10 != '\n') {
            this.f108777b.append(c10);
            return;
        }
        this.f108776a.add(a());
        this.f108777b.clear();
        if (this.f108791p != -1) {
            this.f108791p = 0;
        }
        if (this.f108792q != -1) {
            this.f108792q = 0;
        }
        if (this.f108793r != -1) {
            this.f108793r = 0;
        }
        if (this.f108795t != -1) {
            this.f108795t = 0;
        }
        while (true) {
            if ((!this.f108786k || this.f108776a.size() < this.f108785j) && this.f108776a.size() < 15) {
                return;
            } else {
                this.f108776a.remove(0);
            }
        }
    }

    public final void b() {
        this.f108776a.clear();
        this.f108777b.clear();
        this.f108791p = -1;
        this.f108792q = -1;
        this.f108793r = -1;
        this.f108795t = -1;
        this.f108797v = 0;
        this.f108778c = false;
        this.f108779d = false;
        this.f108780e = 4;
        this.f108781f = false;
        this.f108782g = 0;
        this.f108783h = 0;
        this.f108784i = 0;
        this.f108785j = 15;
        this.f108786k = true;
        this.f108787l = 0;
        this.f108788m = 0;
        this.f108789n = 0;
        int i10 = f108773x;
        this.f108790o = i10;
        this.f108794s = f108772w;
        this.f108796u = i10;
    }

    public static int a(int i10, int i11, int i12, int i13) {
        fi.a(i10, 4);
        fi.a(i11, 4);
        fi.a(i12, 4);
        fi.a(i13, 4);
        return Color.argb(i13 != 2 ? i13 != 3 ? 255 : 0 : 127, i10 > 1 ? 255 : 0, i11 > 1 ? 255 : 0, i12 > 1 ? 255 : 0);
    }

    public final void a(boolean z10, boolean z11) {
        if (this.f108791p != -1) {
            if (!z10) {
                this.f108777b.setSpan(new StyleSpan(2), this.f108791p, this.f108777b.length(), 33);
                this.f108791p = -1;
            }
        } else if (z10) {
            this.f108791p = this.f108777b.length();
        }
        if (this.f108792q == -1) {
            if (z11) {
                this.f108792q = this.f108777b.length();
            }
        } else {
            if (z11) {
                return;
            }
            this.f108777b.setSpan(new UnderlineSpan(), this.f108792q, this.f108777b.length(), 33);
            this.f108792q = -1;
        }
    }

    public final void a(int i10, int i11) {
        if (this.f108793r != -1 && this.f108794s != i10) {
            this.f108777b.setSpan(new ForegroundColorSpan(this.f108794s), this.f108793r, this.f108777b.length(), 33);
        }
        if (i10 != f108772w) {
            this.f108793r = this.f108777b.length();
            this.f108794s = i10;
        }
        if (this.f108795t != -1 && this.f108796u != i11) {
            this.f108777b.setSpan(new BackgroundColorSpan(this.f108796u), this.f108795t, this.f108777b.length(), 33);
        }
        if (i11 != f108773x) {
            this.f108795t = this.f108777b.length();
            this.f108796u = i11;
        }
    }

    public final SpannableString a() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f108777b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f108791p != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f108791p, length, 33);
            }
            if (this.f108792q != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f108792q, length, 33);
            }
            if (this.f108793r != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f108794s), this.f108793r, length, 33);
            }
            if (this.f108795t != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f108796u), this.f108795t, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }
}
