package oa;

import android.util.Base64;
import com.google.common.collect.ImmutableList;
import com.ironsource.C4240b4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public abstract class v0 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f96657a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String[] f96658b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f96659c;

        public a(String str, String[] strArr, int i10) {
            this.f96657a = str;
            this.f96658b = strArr;
            this.f96659c = i10;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f96660a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f96661b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f96662c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f96663d;

        public b(boolean z10, int i10, int i11, int i12) {
            this.f96660a = z10;
            this.f96661b = i10;
            this.f96662c = i11;
            this.f96663d = i12;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f96664a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f96665b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f96666c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f96667d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f96668e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f96669f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f96670g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f96671h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f96672i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final byte[] f96673j;

        public c(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10, byte[] bArr) {
            this.f96664a = i10;
            this.f96665b = i11;
            this.f96666c = i12;
            this.f96667d = i13;
            this.f96668e = i14;
            this.f96669f = i15;
            this.f96670g = i16;
            this.f96671h = i17;
            this.f96672i = z10;
            this.f96673j = bArr;
        }
    }

    public static int[] a(int i10) {
        if (i10 == 3) {
            return new int[]{0, 2, 1};
        }
        if (i10 == 5) {
            return new int[]{0, 2, 1, 3, 4};
        }
        if (i10 == 6) {
            return new int[]{0, 2, 1, 5, 3, 4};
        }
        if (i10 == 7) {
            return new int[]{0, 2, 1, 6, 5, 3, 4};
        }
        if (i10 != 8) {
            return null;
        }
        return new int[]{0, 2, 1, 7, 5, 6, 3, 4};
    }

    public static int b(int i10) {
        int i11 = 0;
        while (i10 > 0) {
            i11++;
            i10 >>>= 1;
        }
        return i11;
    }

    private static long c(long j10, long j11) {
        return (long) Math.floor(Math.pow(j10, 1.0d / j11));
    }

    public static n9.v d(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = (String) list.get(i10);
            String[] strArrK1 = q9.o0.k1(str, C4240b4.j.f42668b);
            if (strArrK1.length != 2) {
                q9.u.h("VorbisUtil", "Failed to parse Vorbis comment: " + str);
            } else if (strArrK1[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(ab.a.b(new q9.d0(Base64.decode(strArrK1[1], 0))));
                } catch (RuntimeException e10) {
                    q9.u.i("VorbisUtil", "Failed to parse vorbis picture", e10);
                }
            } else {
                arrayList.add(new fb.a(strArrK1[0], strArrK1[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new n9.v(arrayList);
    }

    public static ImmutableList e(byte[] bArr) {
        q9.d0 d0Var = new q9.d0(bArr);
        d0Var.X(1);
        int i10 = 0;
        while (d0Var.a() > 0 && d0Var.j() == 255) {
            i10 += 255;
            d0Var.X(1);
        }
        int iH = i10 + d0Var.H();
        int i11 = 0;
        while (d0Var.a() > 0 && d0Var.j() == 255) {
            i11 += 255;
            d0Var.X(1);
        }
        int iH2 = i11 + d0Var.H();
        byte[] bArr2 = new byte[iH];
        int iF = d0Var.f();
        System.arraycopy(bArr, iF, bArr2, 0, iH);
        int i12 = iF + iH + iH2;
        int length = bArr.length - i12;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr, i12, bArr3, 0, length);
        return ImmutableList.of(bArr2, bArr3);
    }

    private static void f(u0 u0Var) throws n9.x {
        int iD = u0Var.d(6) + 1;
        for (int i10 = 0; i10 < iD; i10++) {
            int iD2 = u0Var.d(16);
            if (iD2 == 0) {
                u0Var.e(8);
                u0Var.e(16);
                u0Var.e(16);
                u0Var.e(6);
                u0Var.e(8);
                int iD3 = u0Var.d(4) + 1;
                for (int i11 = 0; i11 < iD3; i11++) {
                    u0Var.e(8);
                }
            } else {
                if (iD2 != 1) {
                    throw n9.x.a("floor type greater than 1 not decodable: " + iD2, null);
                }
                int iD4 = u0Var.d(5);
                int[] iArr = new int[iD4];
                int i12 = -1;
                for (int i13 = 0; i13 < iD4; i13++) {
                    int iD5 = u0Var.d(4);
                    iArr[i13] = iD5;
                    if (iD5 > i12) {
                        i12 = iD5;
                    }
                }
                int i14 = i12 + 1;
                int[] iArr2 = new int[i14];
                for (int i15 = 0; i15 < i14; i15++) {
                    iArr2[i15] = u0Var.d(3) + 1;
                    int iD6 = u0Var.d(2);
                    if (iD6 > 0) {
                        u0Var.e(8);
                    }
                    for (int i16 = 0; i16 < (1 << iD6); i16++) {
                        u0Var.e(8);
                    }
                }
                u0Var.e(2);
                int iD7 = u0Var.d(4);
                int i17 = 0;
                int i18 = 0;
                for (int i19 = 0; i19 < iD4; i19++) {
                    i17 += iArr2[iArr[i19]];
                    while (i18 < i17) {
                        u0Var.e(iD7);
                        i18++;
                    }
                }
            }
        }
    }

    private static void g(int i10, u0 u0Var) throws n9.x {
        int iD = u0Var.d(6) + 1;
        for (int i11 = 0; i11 < iD; i11++) {
            int iD2 = u0Var.d(16);
            if (iD2 != 0) {
                q9.u.c("VorbisUtil", "mapping type other than 0 not supported: " + iD2);
            } else {
                int iD3 = u0Var.c() ? u0Var.d(4) + 1 : 1;
                if (u0Var.c()) {
                    int iD4 = u0Var.d(8) + 1;
                    for (int i12 = 0; i12 < iD4; i12++) {
                        int i13 = i10 - 1;
                        u0Var.e(b(i13));
                        u0Var.e(b(i13));
                    }
                }
                if (u0Var.d(2) != 0) {
                    throw n9.x.a("to reserved bits must be zero after mapping coupling steps", null);
                }
                if (iD3 > 1) {
                    for (int i14 = 0; i14 < i10; i14++) {
                        u0Var.e(4);
                    }
                }
                for (int i15 = 0; i15 < iD3; i15++) {
                    u0Var.e(8);
                    u0Var.e(8);
                    u0Var.e(8);
                }
            }
        }
    }

    private static b[] h(u0 u0Var) {
        int iD = u0Var.d(6) + 1;
        b[] bVarArr = new b[iD];
        for (int i10 = 0; i10 < iD; i10++) {
            bVarArr[i10] = new b(u0Var.c(), u0Var.d(16), u0Var.d(16), u0Var.d(8));
        }
        return bVarArr;
    }

    private static void i(u0 u0Var) throws n9.x {
        int iD = u0Var.d(6) + 1;
        for (int i10 = 0; i10 < iD; i10++) {
            if (u0Var.d(16) > 2) {
                throw n9.x.a("residueType greater than 2 is not decodable", null);
            }
            u0Var.e(24);
            u0Var.e(24);
            u0Var.e(24);
            int iD2 = u0Var.d(6) + 1;
            u0Var.e(8);
            int[] iArr = new int[iD2];
            for (int i11 = 0; i11 < iD2; i11++) {
                iArr[i11] = ((u0Var.c() ? u0Var.d(5) : 0) * 8) + u0Var.d(3);
            }
            for (int i12 = 0; i12 < iD2; i12++) {
                for (int i13 = 0; i13 < 8; i13++) {
                    if ((iArr[i12] & (1 << i13)) != 0) {
                        u0Var.e(8);
                    }
                }
            }
        }
    }

    public static a j(q9.d0 d0Var) {
        return k(d0Var, true, true);
    }

    public static a k(q9.d0 d0Var, boolean z10, boolean z11) throws n9.x {
        if (z10) {
            o(3, d0Var, false);
        }
        String strE = d0Var.E((int) d0Var.x());
        int length = strE.length();
        long jX = d0Var.x();
        String[] strArr = new String[(int) jX];
        int length2 = length + 15;
        for (int i10 = 0; i10 < jX; i10++) {
            String strE2 = d0Var.E((int) d0Var.x());
            strArr[i10] = strE2;
            length2 = length2 + 4 + strE2.length();
        }
        if (z11 && (d0Var.H() & 1) == 0) {
            throw n9.x.a("framing bit expected to be set", null);
        }
        return new a(strE, strArr, length2 + 1);
    }

    public static c l(q9.d0 d0Var) throws n9.x {
        o(1, d0Var, false);
        int iY = d0Var.y();
        int iH = d0Var.H();
        int iY2 = d0Var.y();
        int iU = d0Var.u();
        if (iU <= 0) {
            iU = -1;
        }
        int iU2 = d0Var.u();
        if (iU2 <= 0) {
            iU2 = -1;
        }
        int iU3 = d0Var.u();
        if (iU3 <= 0) {
            iU3 = -1;
        }
        int iH2 = d0Var.H();
        return new c(iY, iH, iY2, iU, iU2, iU3, (int) Math.pow(2.0d, iH2 & 15), (int) Math.pow(2.0d, (iH2 & 240) >> 4), (d0Var.H() & 1) > 0, Arrays.copyOf(d0Var.e(), d0Var.g()));
    }

    public static b[] m(q9.d0 d0Var, int i10) throws n9.x {
        o(5, d0Var, false);
        int iH = d0Var.H() + 1;
        u0 u0Var = new u0(d0Var.e());
        u0Var.e(d0Var.f() * 8);
        for (int i11 = 0; i11 < iH; i11++) {
            n(u0Var);
        }
        int iD = u0Var.d(6) + 1;
        for (int i12 = 0; i12 < iD; i12++) {
            if (u0Var.d(16) != 0) {
                throw n9.x.a("placeholder of time domain transforms not zeroed out", null);
            }
        }
        f(u0Var);
        i(u0Var);
        g(i10, u0Var);
        b[] bVarArrH = h(u0Var);
        if (u0Var.c()) {
            return bVarArrH;
        }
        throw n9.x.a("framing bit after modes not set as expected", null);
    }

    private static void n(u0 u0Var) throws n9.x {
        if (u0Var.d(24) != 5653314) {
            throw n9.x.a("expected code book to start with [0x56, 0x43, 0x42] at " + u0Var.b(), null);
        }
        int iD = u0Var.d(16);
        int iD2 = u0Var.d(24);
        int iD3 = 0;
        if (u0Var.c()) {
            u0Var.e(5);
            while (iD3 < iD2) {
                iD3 += u0Var.d(b(iD2 - iD3));
            }
        } else {
            boolean zC = u0Var.c();
            while (iD3 < iD2) {
                if (!zC) {
                    u0Var.e(5);
                } else if (u0Var.c()) {
                    u0Var.e(5);
                }
                iD3++;
            }
        }
        int iD4 = u0Var.d(4);
        if (iD4 > 2) {
            throw n9.x.a("lookup type greater than 2 not decodable: " + iD4, null);
        }
        if (iD4 == 1 || iD4 == 2) {
            u0Var.e(32);
            u0Var.e(32);
            int iD5 = u0Var.d(4) + 1;
            u0Var.e(1);
            u0Var.e((int) ((iD4 == 1 ? iD != 0 ? c(iD2, iD) : 0L : ((long) iD) * ((long) iD2)) * ((long) iD5)));
        }
    }

    public static boolean o(int i10, q9.d0 d0Var, boolean z10) throws n9.x {
        if (d0Var.a() < 7) {
            if (z10) {
                return false;
            }
            throw n9.x.a("too short header: " + d0Var.a(), null);
        }
        if (d0Var.H() != i10) {
            if (z10) {
                return false;
            }
            throw n9.x.a("expected header type " + Integer.toHexString(i10), null);
        }
        if (d0Var.H() == 118 && d0Var.H() == 111 && d0Var.H() == 114 && d0Var.H() == 98 && d0Var.H() == 105 && d0Var.H() == 115) {
            return true;
        }
        if (z10) {
            return false;
        }
        throw n9.x.a("expected characters 'vorbis'", null);
    }
}
