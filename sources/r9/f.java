package r9;

import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import com.google.common.math.DoubleMath;
import j$.util.Objects;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import n9.w;

/* JADX INFO: loaded from: classes12.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f99242a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[] f99243b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f99244c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int[] f99245d = new int[10];

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f99246a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f99247b;

        public a(int i10, int i11) {
            this.f99246a = i10;
            this.f99247b = i11;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f99248a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f99249b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f99250c;

        public b(int i10, int i11, int i12) {
            this.f99248a = i10;
            this.f99249b = i11;
            this.f99250c = i12;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f99251a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f99252b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f99253c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f99254d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[] f99255e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f99256f;

        public c(int i10, boolean z10, int i11, int i12, int[] iArr, int i13) {
            this.f99251a = i10;
            this.f99252b = z10;
            this.f99253c = i11;
            this.f99254d = i12;
            this.f99255e = iArr;
            this.f99256f = i13;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImmutableList f99257a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f99258b;

        public d(List list, int[] iArr) {
            this.f99257a = ImmutableList.copyOf((Collection) list);
            this.f99258b = iArr;
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f99259a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f99260b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f99261c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f99262d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f99263e;

        public e(int i10, int i11, int i12, int i13, int i14) {
            this.f99259a = i10;
            this.f99260b = i11;
            this.f99261c = i12;
            this.f99262d = i13;
            this.f99263e = i14;
        }
    }

    /* JADX INFO: renamed from: r9.f$f, reason: collision with other inner class name */
    public static final class C1182f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImmutableList f99264a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f99265b;

        public C1182f(List list, int[] iArr) {
            this.f99264a = ImmutableList.copyOf((Collection) list);
            this.f99265b = iArr;
        }
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f99266a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f99267b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f99268c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f99269d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f99270e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f99271f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f99272g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f99273h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f99274i;

        public g(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            this.f99266a = i10;
            this.f99267b = i11;
            this.f99268c = i12;
            this.f99269d = i13;
            this.f99270e = i14;
            this.f99271f = i15;
            this.f99272g = i16;
            this.f99273h = i17;
            this.f99274i = i18;
        }
    }

    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f99275a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f99276b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c f99277c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f99278d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f99279e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f99280f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f99281g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f99282h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f99283i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final float f99284j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f99285k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f99286l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f99287m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f99288n;

        public h(b bVar, int i10, c cVar, int i11, int i12, int i13, int i14, int i15, int i16, float f10, int i17, int i18, int i19, int i20) {
            this.f99275a = bVar;
            this.f99276b = i10;
            this.f99277c = cVar;
            this.f99278d = i11;
            this.f99279e = i12;
            this.f99280f = i13;
            this.f99281g = i14;
            this.f99282h = i15;
            this.f99283i = i16;
            this.f99284j = f10;
            this.f99285k = i17;
            this.f99286l = i18;
            this.f99287m = i19;
            this.f99288n = i20;
        }
    }

    public static final class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f99289a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f99290b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f99291c;

        public i(int i10, int i11, int i12) {
            this.f99289a = i10;
            this.f99290b = i11;
            this.f99291c = i12;
        }
    }

    public static final class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImmutableList f99292a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f99293b;

        public j(List list, int[] iArr) {
            this.f99292a = ImmutableList.copyOf((Collection) list);
            this.f99293b = iArr;
        }
    }

    public static final class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f99294a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ImmutableList f99295b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f99296c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final C1182f f99297d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final j f99298e;

        public k(b bVar, List list, d dVar, C1182f c1182f, j jVar) {
            this.f99294a = bVar;
            this.f99295b = list != null ? ImmutableList.copyOf((Collection) list) : ImmutableList.of();
            this.f99296c = dVar;
            this.f99297d = c1182f;
            this.f99298e = jVar;
        }
    }

    public static final class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f99299a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f99300b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f99301c;

        public l(int i10, int i11, boolean z10) {
            this.f99299a = i10;
            this.f99300b = i11;
            this.f99301c = z10;
        }
    }

    public static final class m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f99302a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f99303b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f99304c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f99305d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f99306e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f99307f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f99308g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final float f99309h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f99310i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f99311j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final boolean f99312k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f99313l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f99314m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f99315n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final int f99316o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final boolean f99317p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final int f99318q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final int f99319r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final int f99320s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final int f99321t;

        public m(int i10, int i11, int i12, int i13, int i14, int i15, int i16, float f10, int i17, int i18, boolean z10, boolean z11, int i19, int i20, int i21, boolean z12, int i22, int i23, int i24, int i25) {
            this.f99302a = i10;
            this.f99303b = i11;
            this.f99304c = i12;
            this.f99305d = i13;
            this.f99306e = i14;
            this.f99307f = i15;
            this.f99308g = i16;
            this.f99309h = f10;
            this.f99310i = i17;
            this.f99311j = i18;
            this.f99312k = z10;
            this.f99313l = z11;
            this.f99314m = i19;
            this.f99315n = i20;
            this.f99316o = i21;
            this.f99317p = z12;
            this.f99318q = i22;
            this.f99319r = i23;
            this.f99320s = i24;
            this.f99321t = i25;
        }
    }

    public static l A(byte[] bArr, int i10, int i11) {
        return B(bArr, i10 + 1, i11);
    }

    public static l B(byte[] bArr, int i10, int i11) {
        r9.h hVar = new r9.h(bArr, i10, i11);
        int i12 = hVar.i();
        int i13 = hVar.i();
        hVar.l();
        return new l(i12, i13, hVar.e());
    }

    public static m C(byte[] bArr, int i10, int i11) {
        return D(bArr, i10 + 1, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x021f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static r9.f.m D(byte[] r32, int r33, int r34) {
        /*
            Method dump skipped, instruction units count: 612
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r9.f.D(byte[], int, int):r9.f$m");
    }

    private static void E(r9.h hVar, int i10, int[] iArr, int[] iArr2, boolean[][] zArr) {
        for (int i11 = 1; i11 < i10; i11++) {
            boolean zE = hVar.e();
            int i12 = 0;
            while (i12 < iArr[i11]) {
                if ((i12 <= 0 || !zE) ? i12 == 0 : hVar.e()) {
                    for (int i13 = 0; i13 < iArr2[i11]; i13++) {
                        if (zArr[i11][i13]) {
                            hVar.i();
                        }
                    }
                    hVar.i();
                    hVar.i();
                }
                i12++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [int] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    private static void F(r9.h hVar, boolean z10, int i10) {
        ?? r92;
        ?? r12;
        boolean zE;
        boolean zE2;
        if (z10) {
            boolean zE3 = hVar.e();
            boolean zE4 = hVar.e();
            if (zE3 || zE4) {
                zE = hVar.e();
                if (zE) {
                    hVar.m(19);
                }
                hVar.m(8);
                if (zE) {
                    hVar.m(4);
                }
                hVar.m(15);
                r12 = zE4;
                r92 = zE3;
            } else {
                zE = false;
                r12 = zE4;
                r92 = zE3;
            }
        } else {
            r92 = 0;
            r12 = 0;
            zE = false;
        }
        for (int i11 = 0; i11 <= i10; i11++) {
            boolean zE5 = hVar.e();
            if (!zE5) {
                zE5 = hVar.e();
            }
            if (zE5) {
                hVar.i();
                zE2 = false;
            } else {
                zE2 = hVar.e();
            }
            int i12 = !zE2 ? hVar.i() : 0;
            int i13 = r92 + r12;
            for (int i14 = 0; i14 < i13; i14++) {
                for (int i15 = 0; i15 <= i12; i15++) {
                    hVar.i();
                    hVar.i();
                    if (zE) {
                        hVar.i();
                        hVar.i();
                    }
                    hVar.l();
                }
            }
        }
    }

    private static void G(r9.h hVar) {
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = 0;
            while (i11 < 6) {
                int i12 = 1;
                if (hVar.e()) {
                    int iMin = Math.min(64, 1 << ((i10 << 1) + 4));
                    if (i10 > 1) {
                        hVar.h();
                    }
                    for (int i13 = 0; i13 < iMin; i13++) {
                        hVar.h();
                    }
                } else {
                    hVar.i();
                }
                if (i10 == 3) {
                    i12 = 3;
                }
                i11 += i12;
            }
        }
    }

    private static void H(r9.h hVar) {
        int i10 = hVar.i();
        int[] iArr = new int[0];
        int[] iArrCopyOf = new int[0];
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < i10; i13++) {
            if (i13 == 0 || !hVar.e()) {
                int i14 = hVar.i();
                int i15 = hVar.i();
                int[] iArr2 = new int[i14];
                int i16 = 0;
                while (i16 < i14) {
                    iArr2[i16] = (i16 > 0 ? iArr2[i16 - 1] : 0) - (hVar.i() + 1);
                    hVar.l();
                    i16++;
                }
                int[] iArr3 = new int[i15];
                int i17 = 0;
                while (i17 < i15) {
                    iArr3[i17] = (i17 > 0 ? iArr3[i17 - 1] : 0) + hVar.i() + 1;
                    hVar.l();
                    i17++;
                }
                i11 = i14;
                iArr = iArr2;
                i12 = i15;
                iArrCopyOf = iArr3;
            } else {
                int i18 = i11 + i12;
                int i19 = (1 - ((hVar.e() ? 1 : 0) * 2)) * (hVar.i() + 1);
                int i20 = i18 + 1;
                boolean[] zArr = new boolean[i20];
                for (int i21 = 0; i21 <= i18; i21++) {
                    if (hVar.e()) {
                        zArr[i21] = true;
                    } else {
                        zArr[i21] = hVar.e();
                    }
                }
                int[] iArr4 = new int[i20];
                int[] iArr5 = new int[i20];
                int i22 = 0;
                for (int i23 = i12 - 1; i23 >= 0; i23--) {
                    int i24 = iArrCopyOf[i23] + i19;
                    if (i24 < 0 && zArr[i11 + i23]) {
                        iArr4[i22] = i24;
                        i22++;
                    }
                }
                if (i19 < 0 && zArr[i18]) {
                    iArr4[i22] = i19;
                    i22++;
                }
                for (int i25 = 0; i25 < i11; i25++) {
                    int i26 = iArr[i25] + i19;
                    if (i26 < 0 && zArr[i25]) {
                        iArr4[i22] = i26;
                        i22++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr4, i22);
                int i27 = 0;
                for (int i28 = i11 - 1; i28 >= 0; i28--) {
                    int i29 = iArr[i28] + i19;
                    if (i29 > 0 && zArr[i28]) {
                        iArr5[i27] = i29;
                        i27++;
                    }
                }
                if (i19 > 0 && zArr[i18]) {
                    iArr5[i27] = i19;
                    i27++;
                }
                for (int i30 = 0; i30 < i12; i30++) {
                    int i31 = iArrCopyOf[i30] + i19;
                    if (i31 > 0 && zArr[i11 + i30]) {
                        iArr5[i27] = i31;
                        i27++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr5, i27);
                iArr = iArrCopyOf2;
                i11 = i22;
                i12 = i27;
            }
        }
    }

    private static void I(r9.h hVar) {
        int i10 = hVar.i() + 1;
        hVar.m(8);
        for (int i11 = 0; i11 < i10; i11++) {
            hVar.i();
            hVar.i();
            hVar.l();
        }
        hVar.m(20);
    }

    private static void J(r9.h hVar, int i10) {
        int iH = 8;
        int i11 = 8;
        for (int i12 = 0; i12 < i10; i12++) {
            if (iH != 0) {
                iH = ((hVar.h() + i11) + 256) % 256;
            }
            if (iH != 0) {
                i11 = iH;
            }
        }
    }

    private static void K(r9.h hVar, int i10, boolean[][] zArr) {
        int i11 = hVar.i() + 2;
        if (hVar.e()) {
            hVar.m(i11);
        } else {
            for (int i12 = 1; i12 < i10; i12++) {
                for (int i13 = 0; i13 < i12; i13++) {
                    if (zArr[i12][i13]) {
                        hVar.m(i11);
                    }
                }
            }
        }
        int i14 = hVar.i();
        for (int i15 = 1; i15 <= i14; i15++) {
            hVar.m(8);
        }
    }

    public static int L(byte[] bArr, int i10) {
        int i11;
        synchronized (f99244c) {
            int iG = 0;
            int i12 = 0;
            while (iG < i10) {
                try {
                    iG = g(bArr, iG, i10);
                    if (iG < i10) {
                        int[] iArr = f99245d;
                        if (iArr.length <= i12) {
                            f99245d = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        f99245d[i12] = iG;
                        iG += 3;
                        i12++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            i11 = i10 - i12;
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < i12; i15++) {
                int i16 = f99245d[i15] - i14;
                System.arraycopy(bArr, i14, bArr, i13, i16);
                int i17 = i13 + i16;
                int i18 = i17 + 1;
                bArr[i17] = 0;
                i13 = i17 + 2;
                bArr[i18] = 0;
                i14 += i16 + 3;
            }
            System.arraycopy(bArr, i14, bArr, i13, i11 - i13);
        }
        return i11;
    }

    private static int a(int i10, int i11, int i12, int i13) {
        return i10 - ((i11 == 1 ? 2 : 1) * (i12 + i13));
    }

    private static int b(int i10, int i11, int i12, int i13) {
        int i14 = 2;
        if (i11 != 1 && i11 != 2) {
            i14 = 1;
        }
        return i10 - (i14 * (i12 + i13));
    }

    public static void c(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    private static String d(r9.h hVar) {
        hVar.m(4);
        int iF = hVar.f(3);
        hVar.l();
        c cVarQ = q(hVar, true, iF, null);
        return q9.i.f(cVarQ.f99251a, cVarQ.f99252b, cVarQ.f99253c, cVarQ.f99254d, cVarQ.f99255e, cVarQ.f99256f);
    }

    public static int e(byte[] bArr, int i10, int i11, boolean[] zArr) {
        int i12 = i11 - i10;
        q9.a.g(i12 >= 0);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            c(zArr);
            return i10 - 3;
        }
        if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            c(zArr);
            return i10 - 2;
        }
        if (i12 > 2 && zArr[2] && bArr[i10] == 0 && bArr[i10 + 1] == 1) {
            c(zArr);
            return i10 - 1;
        }
        int i13 = i11 - 1;
        int i14 = i10 + 2;
        while (i14 < i13) {
            byte b10 = bArr[i14];
            if ((b10 & 254) == 0) {
                int i15 = i14 - 2;
                if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && b10 == 1) {
                    c(zArr);
                    return i15;
                }
                i14 -= 2;
            }
            i14 += 3;
        }
        zArr[0] = i12 <= 2 ? !(i12 != 2 ? !(zArr[1] && bArr[i13] == 1) : !(zArr[2] && bArr[i11 + (-2)] == 0 && bArr[i13] == 1)) : bArr[i11 + (-3)] == 0 && bArr[i11 + (-2)] == 0 && bArr[i13] == 1;
        zArr[1] = i12 <= 1 ? zArr[2] && bArr[i13] == 0 : bArr[i11 + (-2)] == 0 && bArr[i13] == 0;
        zArr[2] = bArr[i13] == 0;
        return i11;
    }

    private static ImmutableList f(byte[] bArr) {
        boolean[] zArr = new boolean[3];
        ImmutableList.Builder builder = ImmutableList.builder();
        int i10 = 0;
        while (i10 < bArr.length) {
            int iE = e(bArr, i10, bArr.length, zArr);
            if (iE != bArr.length) {
                builder.add(Integer.valueOf(iE));
            }
            i10 = iE + 3;
        }
        return builder.build();
    }

    private static int g(byte[] bArr, int i10, int i11) {
        while (i10 < i11 - 2) {
            if (bArr[i10] == 0 && bArr[i10 + 1] == 0 && bArr[i10 + 2] == 3) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String h(List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            byte[] bArr = (byte[]) list.get(i10);
            int length = bArr.length;
            if (length > 3) {
                ImmutableList immutableListF = f(bArr);
                for (int i11 = 0; i11 < immutableListF.size(); i11++) {
                    if (((Integer) immutableListF.get(i11)).intValue() + 3 < length) {
                        r9.h hVar = new r9.h(bArr, ((Integer) immutableListF.get(i11)).intValue() + 3, length);
                        b bVarP = p(hVar);
                        if (bVarP.f99248a == 33 && bVarP.f99249b == 0) {
                            return d(hVar);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static int i(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 126) >> 1;
    }

    public static int j(byte[] bArr, int i10) {
        return bArr[i10 + 3] & Ascii.US;
    }

    public static boolean k(byte[] bArr, int i10, int i11, io.bidmachine.media3.common.a aVar) {
        if (Objects.equals(aVar.f80561o, "video/avc")) {
            return l(bArr[i10]);
        }
        if (Objects.equals(aVar.f80561o, "video/hevc")) {
            return m(bArr, i10, i11, aVar);
        }
        return true;
    }

    public static boolean l(byte b10) {
        if (((b10 & 96) >> 5) != 0) {
            return true;
        }
        int i10 = b10 & Ascii.US;
        return (i10 == 1 || i10 == 9 || i10 == 14) ? false : true;
    }

    private static boolean m(byte[] bArr, int i10, int i11, io.bidmachine.media3.common.a aVar) {
        b bVarP = p(new r9.h(bArr, i10, i11 + i10));
        int i12 = bVarP.f99248a;
        if (i12 == 35) {
            return false;
        }
        return (i12 <= 14 && i12 % 2 == 0 && bVarP.f99250c == aVar.D - 1) ? false : true;
    }

    public static boolean n(io.bidmachine.media3.common.a aVar, byte b10) {
        return ((Objects.equals(aVar.f80561o, "video/avc") || w.b(aVar.f80557k, "video/avc")) && (b10 & Ascii.US) == 6) || ((Objects.equals(aVar.f80561o, "video/hevc") || w.b(aVar.f80557k, "video/hevc")) && ((b10 & 126) >> 1) == 39);
    }

    public static int o(io.bidmachine.media3.common.a aVar) {
        if (Objects.equals(aVar.f80561o, "video/avc")) {
            return 1;
        }
        return (Objects.equals(aVar.f80561o, "video/hevc") || w.b(aVar.f80557k, "video/hevc")) ? 2 : 0;
    }

    private static b p(r9.h hVar) {
        hVar.l();
        return new b(hVar.f(6), hVar.f(6), hVar.f(3) - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static r9.f.c q(r9.h r19, boolean r20, int r21, r9.f.c r22) {
        /*
            r0 = r19
            r1 = r21
            r2 = r22
            r3 = 6
            int[] r4 = new int[r3]
            r5 = 2
            r6 = 8
            r7 = 0
            if (r20 == 0) goto L42
            int r2 = r0.f(r5)
            boolean r8 = r0.e()
            r9 = 5
            int r9 = r0.f(r9)
            r10 = r7
            r11 = r10
        L1e:
            r12 = 32
            if (r10 >= r12) goto L2e
            boolean r12 = r0.e()
            if (r12 == 0) goto L2b
            r12 = 1
            int r12 = r12 << r10
            r11 = r11 | r12
        L2b:
            int r10 = r10 + 1
            goto L1e
        L2e:
            r10 = r7
        L2f:
            if (r10 >= r3) goto L3a
            int r12 = r0.f(r6)
            r4[r10] = r12
            int r10 = r10 + 1
            goto L2f
        L3a:
            r13 = r2
        L3b:
            r17 = r4
            r14 = r8
            r15 = r9
            r16 = r11
            goto L57
        L42:
            if (r2 == 0) goto L50
            int r3 = r2.f99251a
            boolean r8 = r2.f99252b
            int r9 = r2.f99253c
            int r11 = r2.f99254d
            int[] r4 = r2.f99255e
            r13 = r3
            goto L3b
        L50:
            r17 = r4
            r13 = r7
            r14 = r13
            r15 = r14
            r16 = r15
        L57:
            int r18 = r0.f(r6)
            r2 = r7
        L5c:
            if (r7 >= r1) goto L71
            boolean r3 = r0.e()
            if (r3 == 0) goto L66
            int r2 = r2 + 88
        L66:
            boolean r3 = r0.e()
            if (r3 == 0) goto L6e
            int r2 = r2 + 8
        L6e:
            int r7 = r7 + 1
            goto L5c
        L71:
            r0.m(r2)
            if (r1 <= 0) goto L7b
            int r6 = r6 - r1
            int r6 = r6 * r5
            r0.m(r6)
        L7b:
            r9.f$c r12 = new r9.f$c
            r12.<init>(r13, r14, r15, r16, r17, r18)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: r9.f.q(r9.h, boolean, int, r9.f$c):r9.f$c");
    }

    private static e r(r9.h hVar) {
        int i10;
        int i11;
        int iF;
        int iF2 = hVar.f(16);
        int iF3 = hVar.f(16);
        if (hVar.e()) {
            int iF4 = hVar.f(2);
            if (iF4 == 3) {
                hVar.l();
            }
            int iF5 = hVar.f(4);
            iF = hVar.f(4);
            i11 = iF5;
            i10 = iF4;
        } else {
            i10 = 0;
            i11 = 0;
            iF = 0;
        }
        if (hVar.e()) {
            int i12 = hVar.i();
            int i13 = hVar.i();
            int i14 = hVar.i();
            int i15 = hVar.i();
            iF2 = b(iF2, i10, i12, i13);
            iF3 = a(iF3, i10, i14, i15);
        }
        return new e(i10, i11, iF, iF2, iF3);
    }

    private static C1182f s(r9.h hVar, int i10) {
        int i11 = hVar.i();
        int i12 = i11 + 1;
        ImmutableList.Builder builderBuilderWithExpectedSize = ImmutableList.builderWithExpectedSize(i12);
        int[] iArr = new int[i10];
        for (int i13 = 0; i13 < i12; i13++) {
            builderBuilderWithExpectedSize.add(r(hVar));
        }
        int i14 = 1;
        if (i12 <= 1 || !hVar.e()) {
            while (i14 < i10) {
                iArr[i14] = Math.min(i14, i11);
                i14++;
            }
        } else {
            int iLog2 = DoubleMath.log2(i12, RoundingMode.CEILING);
            while (i14 < i10) {
                iArr[i14] = hVar.f(iLog2);
                i14++;
            }
        }
        return new C1182f(builderBuilderWithExpectedSize.build(), iArr);
    }

    public static g t(byte[] bArr, int i10, int i11) {
        byte b10;
        int i12 = i10 + 2;
        do {
            i11--;
            b10 = bArr[i11];
            if (b10 != 0) {
                break;
            }
        } while (i11 > i12);
        if (b10 != 0 && i11 > i12) {
            r9.h hVar = new r9.h(bArr, i12, i11 + 1);
            while (hVar.c(16)) {
                int iF = hVar.f(8);
                int i13 = 0;
                while (iF == 255) {
                    i13 += 255;
                    iF = hVar.f(8);
                }
                int i14 = i13 + iF;
                int iF2 = hVar.f(8);
                int i15 = 0;
                while (iF2 == 255) {
                    i15 += 255;
                    iF2 = hVar.f(8);
                }
                int i16 = i15 + iF2;
                if (i16 == 0 || !hVar.c(i16)) {
                    break;
                }
                if (i14 == 176) {
                    int i17 = hVar.i();
                    boolean zE = hVar.e();
                    int i18 = zE ? hVar.i() : 0;
                    int i19 = hVar.i();
                    int i20 = -1;
                    int i21 = -1;
                    int iF3 = -1;
                    int iF4 = -1;
                    int i22 = -1;
                    int iF5 = -1;
                    for (int i23 = 0; i23 <= i19; i23++) {
                        i20 = hVar.i();
                        i21 = hVar.i();
                        iF3 = hVar.f(6);
                        if (iF3 == 63) {
                            return null;
                        }
                        iF4 = hVar.f(iF3 == 0 ? Math.max(0, i17 - 30) : Math.max(0, (iF3 + i17) - 31));
                        if (zE) {
                            int iF6 = hVar.f(6);
                            if (iF6 == 63) {
                                return null;
                            }
                            i22 = iF6;
                            iF5 = hVar.f(iF6 == 0 ? Math.max(0, i18 - 30) : Math.max(0, (iF6 + i18) - 31));
                        }
                        if (hVar.e()) {
                            hVar.m(10);
                        }
                    }
                    return new g(i17, i18, i19 + 1, i20, i21, iF3, iF4, i22, iF5);
                }
            }
        }
        return null;
    }

    public static h u(byte[] bArr, int i10, int i11, k kVar) {
        return v(bArr, i10 + 2, i11, p(new r9.h(bArr, i10, i11)), kVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static r9.f.h v(byte[] r17, int r18, int r19, r9.f.b r20, r9.f.k r21) {
        /*
            Method dump skipped, instruction units count: 603
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r9.f.v(byte[], int, int, r9.f$b, r9.f$k):r9.f$h");
    }

    private static i w(r9.h hVar) {
        hVar.m(3);
        int i10 = hVar.e() ? 1 : 2;
        int iJ = n9.g.j(hVar.f(8));
        int iK = n9.g.k(hVar.f(8));
        hVar.m(8);
        return new i(iJ, i10, iK);
    }

    private static j x(r9.h hVar, int i10, int i11, int[] iArr) {
        if (!hVar.e() ? hVar.e() : true) {
            hVar.l();
        }
        boolean zE = hVar.e();
        boolean zE2 = hVar.e();
        if (zE || zE2) {
            for (int i12 = 0; i12 < i11; i12++) {
                for (int i13 = 0; i13 < iArr[i12]; i13++) {
                    boolean zE3 = zE ? hVar.e() : false;
                    boolean zE4 = zE2 ? hVar.e() : false;
                    if (zE3) {
                        hVar.m(32);
                    }
                    if (zE4) {
                        hVar.m(18);
                    }
                }
            }
        }
        boolean zE5 = hVar.e();
        int iF = zE5 ? hVar.f(4) + 1 : i10;
        ImmutableList.Builder builderBuilderWithExpectedSize = ImmutableList.builderWithExpectedSize(iF);
        int[] iArr2 = new int[i10];
        for (int i14 = 0; i14 < iF; i14++) {
            builderBuilderWithExpectedSize.add(w(hVar));
        }
        if (zE5 && iF > 1) {
            for (int i15 = 0; i15 < i10; i15++) {
                iArr2[i15] = hVar.f(4);
            }
        }
        return new j(builderBuilderWithExpectedSize.build(), iArr2);
    }

    public static k y(byte[] bArr, int i10, int i11) {
        r9.h hVar = new r9.h(bArr, i10, i11);
        return z(hVar, p(hVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static k z(r9.h hVar, b bVar) {
        int[] iArr;
        int i10;
        int i11;
        int[] iArr2;
        j jVarX;
        int i12;
        int i13;
        int i14;
        int[] iArr3;
        ImmutableList immutableList;
        int i15;
        boolean[][] zArr;
        int[] iArr4;
        int i16;
        int i17;
        hVar.m(4);
        boolean zE = hVar.e();
        boolean zE2 = hVar.e();
        int iF = hVar.f(6);
        int i18 = iF + 1;
        int iF2 = hVar.f(3);
        hVar.m(17);
        c cVarQ = q(hVar, true, iF2, null);
        boolean z10 = false;
        for (int i19 = hVar.e() ? 0 : iF2; i19 <= iF2; i19++) {
            hVar.i();
            hVar.i();
            hVar.i();
        }
        int iF3 = hVar.f(6);
        int i20 = hVar.i() + 1;
        d dVar = new d(ImmutableList.of(cVarQ), new int[1]);
        byte b10 = i18 >= 2 && i20 >= 2;
        byte b11 = zE && zE2;
        int i21 = iF3 + 1;
        byte b12 = i21 >= i18;
        if (b10 != true || b11 != true || b12 != true) {
            return new k(bVar, null, dVar, null, null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) cls, i20, i21);
        int i22 = 1;
        int[] iArr6 = new int[i20];
        int[] iArr7 = new int[i20];
        iArr5[0][0] = 0;
        iArr6[0] = 1;
        iArr7[0] = 0;
        for (int i23 = 1; i23 < i20; i23++) {
            int i24 = 0;
            for (int i25 = 0; i25 <= iF3; i25++) {
                if (hVar.e()) {
                    iArr5[i23][i24] = i25;
                    iArr7[i23] = i25;
                    i24++;
                }
                iArr6[i23] = i24;
            }
        }
        if (hVar.e()) {
            hVar.m(64);
            if (hVar.e()) {
                hVar.i();
            }
            int i26 = hVar.i();
            int i27 = 0;
            while (i27 < i26) {
                hVar.i();
                if (i27 == 0 || hVar.e()) {
                    z10 = true;
                }
                F(hVar, z10, iF2);
                i27++;
                z10 = false;
            }
        }
        if (!hVar.e()) {
            return new k(bVar, null, dVar, null, null);
        }
        hVar.b();
        c cVarQ2 = q(hVar, false, iF2, cVarQ);
        boolean zE3 = hVar.e();
        int i28 = 6;
        boolean[] zArr2 = new boolean[16];
        int i29 = 0;
        for (int i30 = 0; i30 < 16; i30++) {
            boolean zE4 = hVar.e();
            zArr2[i30] = zE4;
            if (zE4) {
                i29++;
            }
        }
        if (i29 == 0 || !zArr2[1]) {
            return new k(bVar, null, dVar, null, null);
        }
        int[] iArr8 = new int[i29];
        for (int i31 = 0; i31 < i29 - (zE3 ? 1 : 0); i31++) {
            iArr8[i31] = hVar.f(3);
        }
        int[] iArr9 = new int[i29 + 1];
        if (zE3) {
            int i32 = 1;
            while (i32 < i29) {
                int[] iArr10 = iArr9;
                for (int i33 = 0; i33 < i32; i33++) {
                    iArr10[i32] = iArr10[i32] + iArr8[i33] + 1;
                }
                i32++;
                iArr9 = iArr10;
            }
            iArr = iArr9;
            iArr[i29] = 6;
        } else {
            iArr = iArr9;
        }
        int[][] iArr11 = (int[][]) Array.newInstance((Class<?>) cls, i18, i29);
        int[] iArr12 = new int[i18];
        iArr12[0] = 0;
        boolean zE5 = hVar.e();
        int i34 = 1;
        while (i34 < i18) {
            if (zE5) {
                i17 = i34;
                iArr12[i17] = hVar.f(i28);
            } else {
                i17 = i34;
                iArr12[i17] = i17;
            }
            if (zE3) {
                for (int i35 = 0; i35 < i29; i35++) {
                    iArr11[i17][i35] = (iArr12[i17] & ((1 << iArr[r33]) - 1)) >> iArr[i35];
                }
            } else {
                int i36 = 0;
                while (i36 < i29) {
                    int i37 = i36;
                    iArr11[i17][i37] = hVar.f(iArr8[i36] + 1);
                    i36 = i37 + 1;
                }
            }
            i34 = i17 + 1;
            i28 = 6;
        }
        int[] iArr13 = new int[i21];
        int i38 = 1;
        int i39 = 0;
        while (i39 < i18) {
            iArr13[iArr12[i39]] = -1;
            int[] iArr14 = iArr13;
            int i40 = 0;
            int i41 = 0;
            while (i40 < 16) {
                if (zArr2[i40]) {
                    if (i40 == i22) {
                        iArr14[iArr12[i39]] = iArr11[i39][i41];
                    }
                    i41++;
                }
                i40++;
                i22 = 1;
            }
            if (i39 > 0) {
                int i42 = 0;
                while (true) {
                    if (i42 >= i39) {
                        i38++;
                        break;
                    }
                    int i43 = i42;
                    if (iArr14[iArr12[i39]] == iArr14[iArr12[i42]]) {
                        break;
                    }
                    i42 = i43 + 1;
                }
            }
            i39++;
            iArr13 = iArr14;
            i22 = 1;
        }
        int[] iArr15 = iArr13;
        int iF4 = hVar.f(4);
        if (i38 < 2 || iF4 == 0) {
            return new k(bVar, null, dVar, null, null);
        }
        int[] iArr16 = new int[i38];
        for (int i44 = 0; i44 < i38; i44++) {
            iArr16[i44] = hVar.f(iF4);
        }
        int[] iArr17 = new int[i21];
        int i45 = 0;
        while (i45 < i18) {
            int[] iArr18 = iArr17;
            iArr18[Math.min(iArr12[i45], iF3)] = i45;
            i45++;
            iArr17 = iArr18;
        }
        int[] iArr19 = iArr17;
        ImmutableList.Builder builder = ImmutableList.builder();
        int i46 = 0;
        while (i46 <= iF3) {
            int i47 = i38;
            int[] iArr20 = iArr7;
            int iMin = Math.min(iArr15[i46], i47 - 1);
            builder.add(new a(iArr19[i46], iMin >= 0 ? iArr16[iMin] : -1));
            i46++;
            i38 = i47;
            iArr7 = iArr20;
            iArr16 = iArr16;
        }
        int[] iArr21 = iArr7;
        ImmutableList immutableListBuild = builder.build();
        if (((a) immutableListBuild.get(0)).f99247b == -1) {
            return new k(bVar, null, dVar, null, null);
        }
        int i48 = 1;
        while (true) {
            if (i48 > iF3) {
                i10 = -1;
                i11 = -1;
                break;
            }
            i10 = -1;
            if (((a) immutableListBuild.get(i48)).f99247b != -1) {
                i11 = i48;
                break;
            }
            i48++;
        }
        if (i11 == i10) {
            return new k(bVar, null, dVar, null, null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr3 = (boolean[][]) Array.newInstance((Class<?>) cls2, i18, i18);
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls2, i18, i18);
        int i49 = 1;
        while (i49 < i18) {
            boolean[][] zArr5 = zArr4;
            for (int i50 = 0; i50 < i49; i50++) {
                boolean[] zArr6 = zArr3[i49];
                boolean[] zArr7 = zArr5[i49];
                boolean zE6 = hVar.e();
                zArr7[i50] = zE6;
                zArr6[i50] = zE6;
            }
            i49++;
            zArr4 = zArr5;
        }
        boolean[][] zArr8 = zArr4;
        for (int i51 = 1; i51 < i18; i51++) {
            int i52 = 0;
            while (i52 < iF) {
                int[] iArr22 = iArr12;
                int i53 = 0;
                while (true) {
                    if (i53 < i51) {
                        boolean[] zArr9 = zArr8[i51];
                        if (zArr9[i53] && zArr8[i53][i52]) {
                            zArr9[i52] = true;
                            break;
                        }
                        i53++;
                    }
                }
                i52++;
                iArr12 = iArr22;
            }
        }
        int[] iArr23 = iArr12;
        int[] iArr24 = new int[i21];
        for (int i54 = 0; i54 < i18; i54++) {
            int i55 = 0;
            for (int i56 = 0; i56 < i54; i56++) {
                i55 += zArr3[i54][i56] ? 1 : 0;
            }
            iArr24[iArr23[i54]] = i55;
        }
        int i57 = 0;
        for (int i58 = 0; i58 < i18; i58++) {
            if (iArr24[iArr23[i58]] == 0) {
                i57++;
            }
        }
        if (i57 > 1) {
            return new k(bVar, null, dVar, null, null);
        }
        int[] iArr25 = new int[i18];
        int[] iArr26 = new int[i20];
        if (hVar.e()) {
            iArr2 = iArr24;
            int i59 = 0;
            while (i59 < i18) {
                int i60 = i59;
                iArr25[i60] = hVar.f(3);
                i59 = i60 + 1;
            }
        } else {
            iArr2 = iArr24;
            Arrays.fill(iArr25, 0, i18, iF2);
        }
        int i61 = 0;
        while (i61 < i20) {
            int i62 = i61;
            boolean[][] zArr10 = zArr3;
            int[] iArr27 = iArr25;
            int iMax = 0;
            for (int i63 = 0; i63 < iArr6[i62]; i63++) {
                iMax = Math.max(iMax, iArr27[((a) immutableListBuild.get(iArr5[i62][i63])).f99246a]);
            }
            iArr26[i62] = iMax + 1;
            i61 = i62 + 1;
            iArr25 = iArr27;
            zArr3 = zArr10;
        }
        boolean[][] zArr11 = zArr3;
        if (hVar.e()) {
            int i64 = 0;
            while (i64 < iF) {
                int i65 = i64 + 1;
                int i66 = i65;
                while (i66 < i18) {
                    if (zArr11[i66][i64]) {
                        i16 = i64;
                        hVar.m(3);
                    } else {
                        i16 = i64;
                    }
                    i66++;
                    i64 = i16;
                }
                i64 = i65;
            }
        }
        hVar.l();
        int i67 = hVar.i() + 1;
        ImmutableList.Builder builder2 = ImmutableList.builder();
        builder2.add(cVarQ);
        if (i67 > 1) {
            builder2.add(cVarQ2);
            for (int i68 = 2; i68 < i67; i68++) {
                cVarQ2 = q(hVar, hVar.e(), iF2, cVarQ2);
                builder2.add(cVarQ2);
            }
        }
        ImmutableList immutableListBuild2 = builder2.build();
        int i69 = hVar.i() + i20;
        if (i69 > i20) {
            return new k(bVar, null, dVar, null, null);
        }
        int iF5 = hVar.f(2);
        boolean[][] zArr12 = (boolean[][]) Array.newInstance((Class<?>) cls2, i69, i21);
        int[] iArr28 = new int[i69];
        int i70 = 0;
        int[] iArr29 = new int[i69];
        int i71 = 0;
        while (i71 < i20) {
            iArr28[i71] = i70;
            iArr29[i71] = iArr21[i71];
            if (iF5 == 0) {
                i15 = i71;
                zArr = zArr12;
                immutableList = immutableListBuild2;
                iArr4 = iArr28;
                Arrays.fill(zArr12[i15], i70, iArr6[i15], true);
                iArr4[i15] = iArr6[i15];
            } else {
                immutableList = immutableListBuild2;
                i15 = i71;
                zArr = zArr12;
                iArr4 = iArr28;
                if (iF5 == 1) {
                    int i72 = iArr21[i15];
                    for (int i73 = 0; i73 < iArr6[i15]; i73++) {
                        zArr[i15][i73] = iArr5[i15][i73] == i72;
                    }
                    iArr4[i15] = 1;
                } else {
                    i70 = 0;
                    zArr[0][0] = true;
                    iArr4[0] = 1;
                    i71 = i15 + 1;
                    zArr12 = zArr;
                    iArr28 = iArr4;
                    immutableListBuild2 = immutableList;
                }
            }
            i70 = 0;
            i71 = i15 + 1;
            zArr12 = zArr;
            iArr28 = iArr4;
            immutableListBuild2 = immutableList;
        }
        ImmutableList immutableList2 = immutableListBuild2;
        boolean[][] zArr13 = zArr12;
        int[] iArr30 = iArr28;
        int[] iArr31 = new int[i21];
        int i74 = 2;
        int[] iArr32 = new int[2];
        iArr32[1] = i21;
        iArr32[i70] = i69;
        boolean[][] zArr14 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr32);
        int i75 = 1;
        int i76 = 0;
        while (i75 < i69) {
            if (iF5 == i74) {
                for (int i77 = 0; i77 < iArr6[i75]; i77++) {
                    zArr13[i75][i77] = hVar.e();
                    int i78 = iArr30[i75];
                    boolean z11 = zArr13[i75][i77];
                    iArr30[i75] = i78 + (z11 ? 1 : 0);
                    if (z11) {
                        iArr29[i75] = iArr5[i75][i77];
                    }
                }
            }
            if (i76 == 0) {
                i12 = 0;
                if (iArr5[i75][0] == 0 && zArr13[i75][0]) {
                    for (int i79 = 1; i79 < iArr6[i75]; i79++) {
                        if (iArr5[i75][i79] == i11 && zArr13[i75][i11]) {
                            i76 = i75;
                        }
                    }
                }
            } else {
                i12 = 0;
            }
            int i80 = i12;
            while (i80 < iArr6[i75]) {
                if (i67 > 1) {
                    zArr14[i75][i80] = zArr13[i75][i80];
                    i14 = i11;
                    iArr3 = iArr31;
                    i13 = i67;
                    int iLog2 = DoubleMath.log2(i67, RoundingMode.CEILING);
                    if (!zArr14[i75][i80]) {
                        int i81 = ((a) immutableListBuild.get(iArr5[i75][i80])).f99246a;
                        int i82 = i12;
                        while (true) {
                            if (i82 >= i80) {
                                break;
                            }
                            int i83 = i81;
                            if (zArr8[i83][((a) immutableListBuild.get(iArr5[i75][i82])).f99246a]) {
                                zArr14[i75][i80] = true;
                                break;
                            }
                            i82++;
                            i81 = i83;
                        }
                    }
                    if (zArr14[i75][i80]) {
                        if (i76 <= 0 || i75 != i76) {
                            hVar.m(iLog2);
                        } else {
                            iArr3[i80] = hVar.f(iLog2);
                        }
                    }
                } else {
                    i13 = i67;
                    i14 = i11;
                    iArr3 = iArr31;
                }
                i80++;
                i11 = i14;
                iArr31 = iArr3;
                i67 = i13;
            }
            int i84 = i67;
            int i85 = i11;
            int[] iArr33 = iArr31;
            if (iArr30[i75] == 1 && iArr2[iArr29[i75]] > 0) {
                hVar.l();
            }
            i75++;
            i11 = i85;
            iArr31 = iArr33;
            i67 = i84;
            i74 = 2;
        }
        int[] iArr34 = iArr31;
        if (i76 == 0) {
            return new k(bVar, null, dVar, null, null);
        }
        C1182f c1182fS = s(hVar, i18);
        hVar.m(2);
        for (int i86 = 1; i86 < i18; i86++) {
            if (iArr2[iArr23[i86]] == 0) {
                hVar.l();
            }
        }
        E(hVar, i69, iArr26, iArr6, zArr14);
        K(hVar, i18, zArr11);
        if (hVar.e()) {
            hVar.b();
            jVarX = x(hVar, i18, i20, iArr26);
        } else {
            jVarX = null;
        }
        return new k(bVar, immutableListBuild, new d(immutableList2, iArr34), c1182fS, jVarX);
    }
}
