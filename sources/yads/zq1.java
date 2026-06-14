package yads;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class zq1 implements bl1, al1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bl1[] f118763b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dy f118765d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public al1 f118768g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public v43 f118769h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public cy f118771j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f118766e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f118767f = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IdentityHashMap f118764c = new IdentityHashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public bl1[] f118770i = new bl1[0];

    public zq1(dy dyVar, long[] jArr, bl1... bl1VarArr) {
        this.f118765d = dyVar;
        this.f118763b = bl1VarArr;
        this.f118771j = ((ub0) dyVar).a(new ev2[0]);
        for (int i10 = 0; i10 < bl1VarArr.length; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                this.f118763b[i10] = new xq1(bl1VarArr[i10], j10);
            }
        }
    }

    @Override // yads.bl1
    public final long a(long j10, ou2 ou2Var) {
        bl1[] bl1VarArr = this.f118770i;
        return (bl1VarArr.length > 0 ? bl1VarArr[0] : this.f118763b[0]).a(j10, ou2Var);
    }

    @Override // yads.ev2
    public final boolean continueLoading(long j10) {
        if (this.f118766e.isEmpty()) {
            return this.f118771j.continueLoading(j10);
        }
        int size = this.f118766e.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((bl1) this.f118766e.get(i10)).continueLoading(j10);
        }
        return false;
    }

    @Override // yads.bl1
    public final void discardBuffer(long j10, boolean z10) {
        for (bl1 bl1Var : this.f118770i) {
            bl1Var.discardBuffer(j10, z10);
        }
    }

    @Override // yads.ev2
    public final long getBufferedPositionUs() {
        return this.f118771j.getBufferedPositionUs();
    }

    @Override // yads.ev2
    public final long getNextLoadPositionUs() {
        return this.f118771j.getNextLoadPositionUs();
    }

    @Override // yads.bl1
    public final v43 getTrackGroups() {
        v43 v43Var = this.f118769h;
        v43Var.getClass();
        return v43Var;
    }

    @Override // yads.ev2
    public final boolean isLoading() {
        return this.f118771j.isLoading();
    }

    @Override // yads.bl1
    public final void maybeThrowPrepareError() {
        for (bl1 bl1Var : this.f118763b) {
            bl1Var.maybeThrowPrepareError();
        }
    }

    @Override // yads.bl1
    public final long readDiscontinuity() {
        long j10 = -9223372036854775807L;
        for (bl1 bl1Var : this.f118770i) {
            long discontinuity = bl1Var.readDiscontinuity();
            if (discontinuity == -9223372036854775807L) {
                if (j10 != -9223372036854775807L && bl1Var.seekToUs(j10) != j10) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j10 == -9223372036854775807L) {
                for (bl1 bl1Var2 : this.f118770i) {
                    if (bl1Var2 == bl1Var) {
                        break;
                    }
                    if (bl1Var2.seekToUs(discontinuity) != discontinuity) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j10 = discontinuity;
            } else if (discontinuity != j10) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j10;
    }

    @Override // yads.ev2
    public final void reevaluateBuffer(long j10) {
        this.f118771j.reevaluateBuffer(j10);
    }

    @Override // yads.bl1
    public final long seekToUs(long j10) {
        long jSeekToUs = this.f118770i[0].seekToUs(j10);
        int i10 = 1;
        while (true) {
            bl1[] bl1VarArr = this.f118770i;
            if (i10 >= bl1VarArr.length) {
                return jSeekToUs;
            }
            if (bl1VarArr[i10].seekToUs(jSeekToUs) != jSeekToUs) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i10++;
        }
    }

    @Override // yads.dv2
    public final void a(ev2 ev2Var) {
        al1 al1Var = this.f118768g;
        al1Var.getClass();
        al1Var.a((ev2) this);
    }

    @Override // yads.al1
    public final void a(bl1 bl1Var) {
        this.f118766e.remove(bl1Var);
        if (!this.f118766e.isEmpty()) {
            return;
        }
        int i10 = 0;
        for (bl1 bl1Var2 : this.f118763b) {
            i10 += bl1Var2.getTrackGroups().f116873b;
        }
        u43[] u43VarArr = new u43[i10];
        int i11 = 0;
        int i12 = 0;
        while (true) {
            bl1[] bl1VarArr = this.f118763b;
            if (i11 < bl1VarArr.length) {
                v43 trackGroups = bl1VarArr[i11].getTrackGroups();
                int i13 = trackGroups.f116873b;
                int i14 = 0;
                while (i14 < i13) {
                    u43 u43VarA = trackGroups.a(i14);
                    u43 u43Var = new u43(i11 + StringUtils.PROCESS_POSTFIX_DELIMITER + u43VarA.f116495c, u43VarA.f116497e);
                    this.f118767f.put(u43Var, u43VarA);
                    u43VarArr[i12] = u43Var;
                    i14++;
                    i12++;
                }
                i11++;
            } else {
                this.f118769h = new v43(u43VarArr);
                al1 al1Var = this.f118768g;
                al1Var.getClass();
                al1Var.a((bl1) this);
                return;
            }
        }
    }

    @Override // yads.bl1
    public final void a(al1 al1Var, long j10) {
        this.f118768g = al1Var;
        Collections.addAll(this.f118766e, this.f118763b);
        for (bl1 bl1Var : this.f118763b) {
            bl1Var.a(this, j10);
        }
    }

    @Override // yads.bl1
    public final long a(bo0[] bo0VarArr, boolean[] zArr, iq2[] iq2VarArr, boolean[] zArr2, long j10) {
        int[] iArr = new int[bo0VarArr.length];
        int[] iArr2 = new int[bo0VarArr.length];
        for (int i10 = 0; i10 < bo0VarArr.length; i10++) {
            iq2 iq2Var = iq2VarArr[i10];
            Integer num = iq2Var == null ? null : (Integer) this.f118764c.get(iq2Var);
            iArr[i10] = num == null ? -1 : num.intValue();
            iArr2[i10] = -1;
            bo0 bo0Var = bo0VarArr[i10];
            if (bo0Var != null) {
                u43 u43Var = (u43) this.f118767f.get(bo0Var.c());
                u43Var.getClass();
                int i11 = 0;
                while (true) {
                    bl1[] bl1VarArr = this.f118763b;
                    if (i11 >= bl1VarArr.length) {
                        break;
                    }
                    int iIndexOf = bl1VarArr[i11].getTrackGroups().f116874c.indexOf(u43Var);
                    if (iIndexOf >= 0 && iIndexOf != -1) {
                        iArr2[i10] = i11;
                        break;
                    }
                    i11++;
                }
            }
        }
        this.f118764c.clear();
        int length = bo0VarArr.length;
        iq2[] iq2VarArr2 = new iq2[length];
        iq2[] iq2VarArr3 = new iq2[bo0VarArr.length];
        bo0[] bo0VarArr2 = new bo0[bo0VarArr.length];
        ArrayList arrayList = new ArrayList(this.f118763b.length);
        long j11 = j10;
        int i12 = 0;
        while (i12 < this.f118763b.length) {
            for (int i13 = 0; i13 < bo0VarArr.length; i13++) {
                iq2VarArr3[i13] = iArr[i13] == i12 ? iq2VarArr[i13] : null;
                if (iArr2[i13] == i12) {
                    bo0 bo0Var2 = bo0VarArr[i13];
                    bo0Var2.getClass();
                    u43 u43Var2 = (u43) this.f118767f.get(bo0Var2.c());
                    u43Var2.getClass();
                    bo0VarArr2[i13] = new wq1(bo0Var2, u43Var2);
                } else {
                    bo0VarArr2[i13] = null;
                }
            }
            int i14 = i12;
            long jA = this.f118763b[i12].a(bo0VarArr2, zArr, iq2VarArr3, zArr2, j11);
            if (i14 == 0) {
                j11 = jA;
            } else if (jA != j11) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i15 = 0; i15 < bo0VarArr.length; i15++) {
                if (iArr2[i15] == i14) {
                    iq2 iq2Var2 = iq2VarArr3[i15];
                    iq2Var2.getClass();
                    iq2VarArr2[i15] = iq2VarArr3[i15];
                    this.f118764c.put(iq2Var2, Integer.valueOf(i14));
                    z10 = true;
                } else if (iArr[i15] == i14 && iq2VarArr3[i15] != null) {
                    throw new IllegalStateException();
                }
            }
            if (z10) {
                arrayList.add(this.f118763b[i14]);
            }
            i12 = i14 + 1;
        }
        System.arraycopy(iq2VarArr2, 0, iq2VarArr, 0, length);
        bl1[] bl1VarArr2 = (bl1[]) arrayList.toArray(new bl1[0]);
        this.f118770i = bl1VarArr2;
        ((ub0) this.f118765d).getClass();
        this.f118771j = new cy(bl1VarArr2);
        return j11;
    }
}
