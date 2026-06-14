package eb;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import q9.d0;
import q9.j0;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends eb.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f69015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f69016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f69017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f69018d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f69019e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f69020f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f69021g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f69022h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f69023i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f69024j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f69025k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f69026l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f69027m;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f69028a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f69029b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f69030c;

        private b(int i10, long j10, long j11) {
            this.f69028a = i10;
            this.f69029b = j10;
            this.f69030c = j11;
        }
    }

    private d(long j10, boolean z10, boolean z11, boolean z12, boolean z13, long j11, long j12, List list, boolean z14, long j13, int i10, int i11, int i12) {
        this.f69015a = j10;
        this.f69016b = z10;
        this.f69017c = z11;
        this.f69018d = z12;
        this.f69019e = z13;
        this.f69020f = j11;
        this.f69021g = j12;
        this.f69022h = DesugarCollections.unmodifiableList(list);
        this.f69023i = z14;
        this.f69024j = j13;
        this.f69025k = i10;
        this.f69026l = i11;
        this.f69027m = i12;
    }

    static d b(d0 d0Var, long j10, j0 j0Var) {
        List list;
        long j11;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        int iH;
        int iH2;
        boolean z14;
        int i11;
        long jC;
        long J = d0Var.J();
        boolean z15 = (d0Var.H() & 128) != 0;
        List list2 = Collections.EMPTY_LIST;
        long J2 = -9223372036854775807L;
        if (z15) {
            list = list2;
            j11 = -9223372036854775807L;
            z10 = false;
            z11 = false;
            z12 = false;
            z13 = false;
            i10 = 0;
            iH = 0;
            iH2 = 0;
        } else {
            int iH3 = d0Var.H();
            boolean z16 = (iH3 & 128) != 0;
            boolean z17 = (iH3 & 64) != 0;
            boolean z18 = (iH3 & 32) != 0;
            boolean z19 = (iH3 & 16) != 0;
            long jC2 = (!z17 || z19) ? -9223372036854775807L : g.c(d0Var, j10);
            if (!z17) {
                int iH4 = d0Var.H();
                ArrayList arrayList = new ArrayList(iH4);
                int i12 = 0;
                while (i12 < iH4) {
                    int iH5 = d0Var.H();
                    if (z19) {
                        i11 = iH4;
                        jC = -9223372036854775807L;
                    } else {
                        i11 = iH4;
                        jC = g.c(d0Var, j10);
                    }
                    arrayList.add(new b(iH5, jC, j0Var.b(jC)));
                    i12++;
                    iH4 = i11;
                }
                list2 = arrayList;
            }
            if (z18) {
                long jH = d0Var.H();
                boolean z20 = (128 & jH) != 0;
                J2 = ((((jH & 1) << 32) | d0Var.J()) * 1000) / 90;
                z14 = z20;
            } else {
                z14 = false;
            }
            int iP = d0Var.P();
            long j12 = jC2;
            j11 = J2;
            J2 = j12;
            iH = d0Var.H();
            iH2 = d0Var.H();
            i10 = iP;
            z13 = z14;
            z10 = z16;
            z11 = z17;
            list = list2;
            z12 = z19;
        }
        return new d(J, z15, z10, z11, z12, J2, j0Var.b(J2), list, z13, j11, i10, iH, iH2);
    }

    @Override // eb.b
    public String toString() {
        return "SCTE-35 SpliceInsertCommand { programSplicePts=" + this.f69020f + ", programSplicePlaybackPositionUs= " + this.f69021g + " }";
    }
}
