package eb;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import q9.d0;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends eb.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f69031a;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f69032a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f69033b;

        private b(int i10, long j10) {
            this.f69032a = i10;
            this.f69033b = j10;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f69034a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f69035b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f69036c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f69037d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f69038e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List f69039f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f69040g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f69041h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f69042i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f69043j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f69044k;

        private c(long j10, boolean z10, boolean z11, boolean z12, List list, long j11, boolean z13, long j12, int i10, int i11, int i12) {
            this.f69034a = j10;
            this.f69035b = z10;
            this.f69036c = z11;
            this.f69037d = z12;
            this.f69039f = DesugarCollections.unmodifiableList(list);
            this.f69038e = j11;
            this.f69040g = z13;
            this.f69041h = j12;
            this.f69042i = i10;
            this.f69043j = i11;
            this.f69044k = i12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c b(d0 d0Var) {
            boolean z10;
            ArrayList arrayList;
            boolean z11;
            boolean z12;
            long j10;
            boolean z13;
            long j11;
            int i10;
            int i11;
            int iH;
            boolean z14;
            long J;
            long J2 = d0Var.J();
            boolean z15 = true;
            if ((d0Var.H() & 128) != 0) {
                z10 = true;
            } else {
                z10 = true;
                z15 = false;
            }
            ArrayList arrayList2 = new ArrayList();
            if (z15) {
                arrayList = arrayList2;
                z11 = false;
                z12 = false;
                j10 = -9223372036854775807L;
                z13 = false;
                j11 = -9223372036854775807L;
                i10 = 0;
                i11 = 0;
                iH = 0;
            } else {
                int iH2 = d0Var.H();
                boolean z16 = (iH2 & 128) != 0 ? z10 : false;
                boolean z17 = (iH2 & 64) != 0 ? z10 : false;
                boolean z18 = (iH2 & 32) != 0 ? z10 : false;
                long J3 = z17 ? d0Var.J() : -9223372036854775807L;
                if (!z17) {
                    int iH3 = d0Var.H();
                    ArrayList arrayList3 = new ArrayList(iH3);
                    int i12 = 0;
                    while (i12 < iH3) {
                        arrayList3.add(new b(d0Var.H(), d0Var.J()));
                        i12++;
                        iH3 = iH3;
                    }
                    arrayList2 = arrayList3;
                }
                if (z18) {
                    long jH = d0Var.H();
                    boolean z19 = (128 & jH) != 0;
                    J = ((((jH & 1) << 32) | d0Var.J()) * 1000) / 90;
                    z14 = z19;
                } else {
                    z14 = false;
                    J = -9223372036854775807L;
                }
                int iP = d0Var.P();
                int iH4 = d0Var.H();
                boolean z20 = z16;
                z13 = z14;
                z11 = z20;
                iH = d0Var.H();
                long j12 = J3;
                i10 = iP;
                i11 = iH4;
                long j13 = J;
                arrayList = arrayList2;
                z12 = z17;
                j10 = j12;
                j11 = j13;
            }
            return new c(J2, z15, z11, z12, arrayList, j10, z13, j11, i10, i11, iH);
        }
    }

    private f(List list) {
        this.f69031a = DesugarCollections.unmodifiableList(list);
    }

    static f b(d0 d0Var) {
        int iH = d0Var.H();
        ArrayList arrayList = new ArrayList(iH);
        for (int i10 = 0; i10 < iH; i10++) {
            arrayList.add(c.b(d0Var));
        }
        return new f(arrayList);
    }
}
