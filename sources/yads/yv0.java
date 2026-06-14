package yads;

import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class yv0 implements oq {
    public static final yv0 H = new yv0(new xv0());
    public static final nq I = new nq() { // from class: yads.l71
        @Override // yads.nq
        public final oq fromBundle(Bundle bundle) {
            return yv0.a(bundle);
        }
    };
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public int G;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f118387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f118388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f118389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f118390e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f118391f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f118392g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f118393h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f118394i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f118395j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final fr1 f118396k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f118397l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f118398m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f118399n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List f118400o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final fj0 f118401p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f118402q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f118403r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f118404s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float f118405t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f118406u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float f118407v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final byte[] f118408w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f118409x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ww f118410y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f118411z;

    public yv0(xv0 xv0Var) {
        this.f118387b = xv0Var.f117972a;
        this.f118388c = xv0Var.f117973b;
        this.f118389d = w83.e(xv0Var.f117974c);
        this.f118390e = xv0Var.f117975d;
        this.f118391f = xv0Var.f117976e;
        int i10 = xv0Var.f117977f;
        this.f118392g = i10;
        int i11 = xv0Var.f117978g;
        this.f118393h = i11;
        this.f118394i = i11 != -1 ? i11 : i10;
        this.f118395j = xv0Var.f117979h;
        this.f118396k = xv0Var.f117980i;
        this.f118397l = xv0Var.f117981j;
        this.f118398m = xv0Var.f117982k;
        this.f118399n = xv0Var.f117983l;
        List list = xv0Var.f117984m;
        this.f118400o = list == null ? Collections.EMPTY_LIST : list;
        fj0 fj0Var = xv0Var.f117985n;
        this.f118401p = fj0Var;
        this.f118402q = xv0Var.f117986o;
        this.f118403r = xv0Var.f117987p;
        this.f118404s = xv0Var.f117988q;
        this.f118405t = xv0Var.f117989r;
        int i12 = xv0Var.f117990s;
        this.f118406u = i12 == -1 ? 0 : i12;
        float f10 = xv0Var.f117991t;
        this.f118407v = f10 == -1.0f ? 1.0f : f10;
        this.f118408w = xv0Var.f117992u;
        this.f118409x = xv0Var.f117993v;
        this.f118410y = xv0Var.f117994w;
        this.f118411z = xv0Var.f117995x;
        this.A = xv0Var.f117996y;
        this.B = xv0Var.f117997z;
        int i13 = xv0Var.A;
        this.C = i13 == -1 ? 0 : i13;
        int i14 = xv0Var.B;
        this.D = i14 != -1 ? i14 : 0;
        this.E = xv0Var.C;
        int i15 = xv0Var.D;
        if (i15 != 0 || fj0Var == null) {
            this.F = i15;
        } else {
            this.F = 1;
        }
    }

    public final int a() {
        int i10;
        int i11 = this.f118403r;
        if (i11 == -1 || (i10 = this.f118404s) == -1) {
            return -1;
        }
        return i11 * i10;
    }

    public final boolean equals(Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj != null && yv0.class == obj.getClass()) {
            yv0 yv0Var = (yv0) obj;
            int i11 = this.G;
            if ((i11 == 0 || (i10 = yv0Var.G) == 0 || i11 == i10) && this.f118390e == yv0Var.f118390e && this.f118391f == yv0Var.f118391f && this.f118392g == yv0Var.f118392g && this.f118393h == yv0Var.f118393h && this.f118399n == yv0Var.f118399n && this.f118402q == yv0Var.f118402q && this.f118403r == yv0Var.f118403r && this.f118404s == yv0Var.f118404s && this.f118406u == yv0Var.f118406u && this.f118409x == yv0Var.f118409x && this.f118411z == yv0Var.f118411z && this.A == yv0Var.A && this.B == yv0Var.B && this.C == yv0Var.C && this.D == yv0Var.D && this.E == yv0Var.E && this.F == yv0Var.F && Float.compare(this.f118405t, yv0Var.f118405t) == 0 && Float.compare(this.f118407v, yv0Var.f118407v) == 0 && w83.a(this.f118387b, yv0Var.f118387b) && w83.a(this.f118388c, yv0Var.f118388c) && w83.a(this.f118395j, yv0Var.f118395j) && w83.a(this.f118397l, yv0Var.f118397l) && w83.a(this.f118398m, yv0Var.f118398m) && w83.a(this.f118389d, yv0Var.f118389d) && Arrays.equals(this.f118408w, yv0Var.f118408w) && w83.a(this.f118396k, yv0Var.f118396k) && w83.a(this.f118410y, yv0Var.f118410y) && w83.a(this.f118401p, yv0Var.f118401p) && a(yv0Var)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.G == 0) {
            String str = this.f118387b;
            int iHashCode = ((str == null ? 0 : str.hashCode()) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
            String str2 = this.f118388c;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f118389d;
            int iHashCode3 = (((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f118390e) * 31) + this.f118391f) * 31) + this.f118392g) * 31) + this.f118393h) * 31;
            String str4 = this.f118395j;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            fr1 fr1Var = this.f118396k;
            int iHashCode5 = (iHashCode4 + (fr1Var == null ? 0 : Arrays.hashCode(fr1Var.f110835b))) * 31;
            String str5 = this.f118397l;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f118398m;
            this.G = ((((((((((((((((Float.floatToIntBits(this.f118407v) + ((((Float.floatToIntBits(this.f118405t) + ((((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f118399n) * 31) + ((int) this.f118402q)) * 31) + this.f118403r) * 31) + this.f118404s) * 31)) * 31) + this.f118406u) * 31)) * 31) + this.f118409x) * 31) + this.f118411z) * 31) + this.A) * 31) + this.B) * 31) + this.C) * 31) + this.D) * 31) + this.E) * 31) + this.F;
        }
        return this.G;
    }

    public final String toString() {
        return "Format(" + this.f118387b + ", " + this.f118388c + ", " + this.f118397l + ", " + this.f118398m + ", " + this.f118395j + ", " + this.f118394i + ", " + this.f118389d + ", [" + this.f118403r + ", " + this.f118404s + ", " + this.f118405t + "], [" + this.f118411z + ", " + this.A + "])";
    }

    public final boolean a(yv0 yv0Var) {
        if (this.f118400o.size() != yv0Var.f118400o.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f118400o.size(); i10++) {
            if (!Arrays.equals((byte[]) this.f118400o.get(i10), (byte[]) yv0Var.f118400o.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public static yv0 a(Bundle bundle) {
        xv0 xv0Var = new xv0();
        if (bundle != null) {
            ClassLoader classLoader = pq.class.getClassLoader();
            int i10 = w83.f117341a;
            bundle.setClassLoader(classLoader);
        }
        int i11 = 0;
        String string = bundle.getString(Integer.toString(0, 36));
        yv0 yv0Var = H;
        String str = yv0Var.f118387b;
        if (string == null) {
            string = str;
        }
        xv0Var.f117972a = string;
        String string2 = bundle.getString(Integer.toString(1, 36));
        String str2 = yv0Var.f118388c;
        if (string2 == null) {
            string2 = str2;
        }
        xv0Var.f117973b = string2;
        String string3 = bundle.getString(Integer.toString(2, 36));
        String str3 = yv0Var.f118389d;
        if (string3 == null) {
            string3 = str3;
        }
        xv0Var.f117974c = string3;
        xv0Var.f117975d = bundle.getInt(Integer.toString(3, 36), yv0Var.f118390e);
        xv0Var.f117976e = bundle.getInt(Integer.toString(4, 36), yv0Var.f118391f);
        xv0Var.f117977f = bundle.getInt(Integer.toString(5, 36), yv0Var.f118392g);
        xv0Var.f117978g = bundle.getInt(Integer.toString(6, 36), yv0Var.f118393h);
        String string4 = bundle.getString(Integer.toString(7, 36));
        String str4 = yv0Var.f118395j;
        if (string4 == null) {
            string4 = str4;
        }
        xv0Var.f117979h = string4;
        fr1 fr1Var = (fr1) bundle.getParcelable(Integer.toString(8, 36));
        fr1 fr1Var2 = yv0Var.f118396k;
        if (fr1Var == null) {
            fr1Var = fr1Var2;
        }
        xv0Var.f117980i = fr1Var;
        String string5 = bundle.getString(Integer.toString(9, 36));
        String str5 = yv0Var.f118397l;
        if (string5 == null) {
            string5 = str5;
        }
        xv0Var.f117981j = string5;
        String string6 = bundle.getString(Integer.toString(10, 36));
        String str6 = yv0Var.f118398m;
        if (string6 == null) {
            string6 = str6;
        }
        xv0Var.f117982k = string6;
        xv0Var.f117983l = bundle.getInt(Integer.toString(11, 36), yv0Var.f118399n);
        ArrayList arrayList = new ArrayList();
        while (true) {
            byte[] byteArray = bundle.getByteArray(Integer.toString(12, 36) + "_" + Integer.toString(i11, 36));
            if (byteArray == null) {
                break;
            }
            arrayList.add(byteArray);
            i11++;
        }
        xv0Var.f117984m = arrayList;
        xv0Var.f117985n = (fj0) bundle.getParcelable(Integer.toString(13, 36));
        String string7 = Integer.toString(14, 36);
        yv0 yv0Var2 = H;
        xv0Var.f117986o = bundle.getLong(string7, yv0Var2.f118402q);
        xv0Var.f117987p = bundle.getInt(Integer.toString(15, 36), yv0Var2.f118403r);
        xv0Var.f117988q = bundle.getInt(Integer.toString(16, 36), yv0Var2.f118404s);
        xv0Var.f117989r = bundle.getFloat(Integer.toString(17, 36), yv0Var2.f118405t);
        xv0Var.f117990s = bundle.getInt(Integer.toString(18, 36), yv0Var2.f118406u);
        xv0Var.f117991t = bundle.getFloat(Integer.toString(19, 36), yv0Var2.f118407v);
        xv0Var.f117992u = bundle.getByteArray(Integer.toString(20, 36));
        xv0Var.f117993v = bundle.getInt(Integer.toString(21, 36), yv0Var2.f118409x);
        Bundle bundle2 = bundle.getBundle(Integer.toString(22, 36));
        if (bundle2 != null) {
            xv0Var.f117994w = (ww) ww.f117611g.fromBundle(bundle2);
        }
        xv0Var.f117995x = bundle.getInt(Integer.toString(23, 36), yv0Var2.f118411z);
        xv0Var.f117996y = bundle.getInt(Integer.toString(24, 36), yv0Var2.A);
        xv0Var.f117997z = bundle.getInt(Integer.toString(25, 36), yv0Var2.B);
        xv0Var.A = bundle.getInt(Integer.toString(26, 36), yv0Var2.C);
        xv0Var.B = bundle.getInt(Integer.toString(27, 36), yv0Var2.D);
        xv0Var.C = bundle.getInt(Integer.toString(28, 36), yv0Var2.E);
        xv0Var.D = bundle.getInt(Integer.toString(29, 36), yv0Var2.F);
        return new yv0(xv0Var);
    }
}
