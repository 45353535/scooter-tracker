package w9;

import com.google.common.primitives.Ints;
import q9.o0;
import w9.b0;

/* JADX INFO: loaded from: classes12.dex */
public class d0 implements b0.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final int f107673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f107674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final int f107675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final int f107676e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final int f107677f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f107678g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f107679h;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f107680a = 250000;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f107681b = 750000;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f107682c = 4;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f107683d = 250000;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f107684e = 50000000;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f107685f = 2;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f107686g = 4;

        public d0 h() {
            return new d0(this);
        }
    }

    protected d0(a aVar) {
        this.f107673b = aVar.f107680a;
        this.f107674c = aVar.f107681b;
        this.f107675d = aVar.f107682c;
        this.f107676e = aVar.f107683d;
        this.f107677f = aVar.f107684e;
        this.f107678g = aVar.f107685f;
        this.f107679h = aVar.f107686g;
    }

    protected static int a(int i10, int i11, int i12) {
        return Ints.checkedCast(((((long) i10) * ((long) i11)) * ((long) i12)) / 1000000);
    }

    protected static int c(int i10) {
        if (i10 == 20) {
            return 63750;
        }
        if (i10 == 30) {
            return 2250000;
        }
        switch (i10) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i10) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        throw new IllegalArgumentException();
                }
        }
    }

    protected int b(int i10, int i11, int i12, int i13, int i14, int i15) {
        if (i12 == 0) {
            return f(i10, i14, i13);
        }
        if (i12 == 1) {
            return d(i11);
        }
        if (i12 == 2) {
            return e(i11, i15);
        }
        throw new IllegalArgumentException();
    }

    protected int d(int i10) {
        return Ints.checkedCast((((long) this.f107677f) * ((long) c(i10))) / 1000000);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected int e(int r4, int r5) {
        /*
            r3 = this;
            int r0 = r3.f107676e
            r1 = 5
            r2 = 8
            if (r4 != r1) goto Lb
            int r1 = r3.f107678g
        L9:
            int r0 = r0 * r1
            goto L10
        Lb:
            if (r4 != r2) goto L10
            int r1 = r3.f107679h
            goto L9
        L10:
            r1 = -1
            if (r5 == r1) goto L1a
            java.math.RoundingMode r4 = java.math.RoundingMode.CEILING
            int r4 = com.google.common.math.IntMath.divide(r5, r2, r4)
            goto L1e
        L1a:
            int r4 = c(r4)
        L1e:
            long r0 = (long) r0
            long r4 = (long) r4
            long r0 = r0 * r4
            r4 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 / r4
            int r4 = com.google.common.primitives.Ints.checkedCast(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: w9.d0.e(int, int):int");
    }

    protected int f(int i10, int i11, int i12) {
        return o0.p(i10 * this.f107675d, a(this.f107673b, i11, i12), a(this.f107674c, i11, i12));
    }

    @Override // w9.b0.e
    public int getBufferSizeInBytes(int i10, int i11, int i12, int i13, int i14, int i15, double d10) {
        return (((Math.max(i10, (int) (((double) b(i10, i11, i12, i13, i14, i15)) * d10)) + i13) - 1) / i13) * i13;
    }
}
