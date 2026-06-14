package q;

/* JADX INFO: loaded from: classes5.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f98573a = new h();

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[z.h.values().length];
            iArr[z.h.FILL.ordinal()] = 1;
            iArr[z.h.FIT.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private h() {
    }

    public static final int a(int i10, int i11, int i12, int i13, z.h hVar) {
        int iMin;
        int iHighestOneBit = Integer.highestOneBit(i10 / i12);
        int iHighestOneBit2 = Integer.highestOneBit(i11 / i13);
        int i14 = a.$EnumSwitchMapping$0[hVar.ordinal()];
        if (i14 == 1) {
            iMin = Math.min(iHighestOneBit, iHighestOneBit2);
        } else {
            if (i14 != 2) {
                throw new lf.m();
            }
            iMin = Math.max(iHighestOneBit, iHighestOneBit2);
        }
        return kotlin.ranges.g.e(iMin, 1);
    }

    public static final double b(double d10, double d11, double d12, double d13, z.h hVar) {
        double d14 = d12 / d10;
        double d15 = d13 / d11;
        int i10 = a.$EnumSwitchMapping$0[hVar.ordinal()];
        if (i10 == 1) {
            return Math.max(d14, d15);
        }
        if (i10 == 2) {
            return Math.min(d14, d15);
        }
        throw new lf.m();
    }

    public static final double c(int i10, int i11, int i12, int i13, z.h hVar) {
        double d10 = ((double) i12) / ((double) i10);
        double d11 = ((double) i13) / ((double) i11);
        int i14 = a.$EnumSwitchMapping$0[hVar.ordinal()];
        if (i14 == 1) {
            return Math.max(d10, d11);
        }
        if (i14 == 2) {
            return Math.min(d10, d11);
        }
        throw new lf.m();
    }
}
