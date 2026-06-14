package ga;

import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.ironsource.mediationsdk.logger.IronSourceError;
import ga.c0;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.media3.common.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
final class p0 implements c0, c0.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c0[] f72397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean[] f72398c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final j f72400e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private c0.a f72403h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private m1 f72404i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private d1 f72406k;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayList f72401f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap f72402g = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final IdentityHashMap f72399d = new IdentityHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private c0[] f72405j = new c0[0];

    private static final class a implements ja.r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ja.r f72407a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final n9.f0 f72408b;

        public a(ja.r rVar, n9.f0 f0Var) {
            this.f72407a = rVar;
            this.f72408b = f0Var;
        }

        @Override // ja.u
        public int a(io.bidmachine.media3.common.a aVar) {
            return this.f72407a.indexOf(this.f72408b.b(aVar));
        }

        @Override // ja.r
        public void b(long j10, long j11, long j12, List list, ha.n[] nVarArr) {
            this.f72407a.b(j10, j11, j12, list, nVarArr);
        }

        @Override // ja.r
        public boolean c(long j10, ha.e eVar, List list) {
            return this.f72407a.c(j10, eVar, list);
        }

        @Override // ja.r
        public void disable() {
            this.f72407a.disable();
        }

        @Override // ja.r
        public void enable() {
            this.f72407a.enable();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f72407a.equals(aVar.f72407a) && this.f72408b.equals(aVar.f72408b);
        }

        @Override // ja.r
        public int evaluateQueueSize(long j10, List list) {
            return this.f72407a.evaluateQueueSize(j10, list);
        }

        @Override // ja.r
        public boolean excludeTrack(int i10, long j10) {
            return this.f72407a.excludeTrack(i10, j10);
        }

        @Override // ja.u
        public io.bidmachine.media3.common.a getFormat(int i10) {
            return this.f72408b.a(this.f72407a.getIndexInTrackGroup(i10));
        }

        @Override // ja.u
        public int getIndexInTrackGroup(int i10) {
            return this.f72407a.getIndexInTrackGroup(i10);
        }

        @Override // ja.r
        public io.bidmachine.media3.common.a getSelectedFormat() {
            return this.f72408b.a(this.f72407a.getSelectedIndexInTrackGroup());
        }

        @Override // ja.r
        public int getSelectedIndex() {
            return this.f72407a.getSelectedIndex();
        }

        @Override // ja.r
        public int getSelectedIndexInTrackGroup() {
            return this.f72407a.getSelectedIndexInTrackGroup();
        }

        @Override // ja.r
        public Object getSelectionData() {
            return this.f72407a.getSelectionData();
        }

        @Override // ja.r
        public int getSelectionReason() {
            return this.f72407a.getSelectionReason();
        }

        @Override // ja.u
        public n9.f0 getTrackGroup() {
            return this.f72408b;
        }

        public int hashCode() {
            return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f72408b.hashCode()) * 31) + this.f72407a.hashCode();
        }

        @Override // ja.u
        public int indexOf(int i10) {
            return this.f72407a.indexOf(i10);
        }

        @Override // ja.r
        public boolean isTrackExcluded(int i10, long j10) {
            return this.f72407a.isTrackExcluded(i10, j10);
        }

        @Override // ja.u
        public int length() {
            return this.f72407a.length();
        }

        @Override // ja.r
        public void onDiscontinuity() {
            this.f72407a.onDiscontinuity();
        }

        @Override // ja.r
        public void onPlayWhenReadyChanged(boolean z10) {
            this.f72407a.onPlayWhenReadyChanged(z10);
        }

        @Override // ja.r
        public void onPlaybackSpeed(float f10) {
            this.f72407a.onPlaybackSpeed(f10);
        }

        @Override // ja.r
        public void onRebuffer() {
            this.f72407a.onRebuffer();
        }
    }

    public p0(j jVar, long[] jArr, c0... c0VarArr) {
        this.f72400e = jVar;
        this.f72397b = c0VarArr;
        this.f72406k = jVar.empty();
        this.f72398c = new boolean[c0VarArr.length];
        for (int i10 = 0; i10 < c0VarArr.length; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                this.f72398c[i10] = true;
                this.f72397b[i10] = new j1(c0VarArr[i10], j10);
            }
        }
    }

    @Override // ga.c0, ga.d1
    public boolean a(io.bidmachine.media3.exoplayer.l1 l1Var) {
        if (this.f72401f.isEmpty()) {
            return this.f72406k.a(l1Var);
        }
        int size = this.f72401f.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((c0) this.f72401f.get(i10)).a(l1Var);
        }
        return false;
    }

    @Override // ga.c0
    public long b(long j10, u9.m0 m0Var) {
        c0[] c0VarArr = this.f72405j;
        return (c0VarArr.length > 0 ? c0VarArr[0] : this.f72397b[0]).b(j10, m0Var);
    }

    @Override // ga.c0
    public void c(c0.a aVar, long j10) {
        this.f72403h = aVar;
        Collections.addAll(this.f72401f, this.f72397b);
        for (c0 c0Var : this.f72397b) {
            c0Var.c(this, j10);
        }
    }

    @Override // ga.c0
    public void discardBuffer(long j10, boolean z10) {
        for (c0 c0Var : this.f72405j) {
            c0Var.discardBuffer(j10, z10);
        }
    }

    @Override // ga.c0.a
    public void f(c0 c0Var) {
        this.f72401f.remove(c0Var);
        if (!this.f72401f.isEmpty()) {
            return;
        }
        int i10 = 0;
        for (c0 c0Var2 : this.f72397b) {
            i10 += c0Var2.getTrackGroups().f72380a;
        }
        n9.f0[] f0VarArr = new n9.f0[i10];
        int i11 = 0;
        int i12 = 0;
        while (true) {
            c0[] c0VarArr = this.f72397b;
            if (i11 >= c0VarArr.length) {
                this.f72404i = new m1(f0VarArr);
                ((c0.a) q9.a.e(this.f72403h)).f(this);
                return;
            }
            m1 trackGroups = c0VarArr[i11].getTrackGroups();
            int i13 = trackGroups.f72380a;
            int i14 = 0;
            while (i14 < i13) {
                n9.f0 f0VarB = trackGroups.b(i14);
                io.bidmachine.media3.common.a[] aVarArr = new io.bidmachine.media3.common.a[f0VarB.f95294a];
                for (int i15 = 0; i15 < f0VarB.f95294a; i15++) {
                    io.bidmachine.media3.common.a aVarA = f0VarB.a(i15);
                    a.b bVarB = aVarA.b();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i11);
                    sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
                    String str = aVarA.f80547a;
                    if (str == null) {
                        str = "";
                    }
                    sb2.append(str);
                    aVarArr[i15] = bVarB.f0(sb2.toString()).N();
                }
                n9.f0 f0Var = new n9.f0(i11 + StringUtils.PROCESS_POSTFIX_DELIMITER + f0VarB.f95295b, aVarArr);
                this.f72402g.put(f0Var, f0VarB);
                f0VarArr[i12] = f0Var;
                i14++;
                i12++;
            }
            i11++;
        }
    }

    public c0 g(int i10) {
        return this.f72398c[i10] ? ((j1) this.f72397b[i10]).e() : this.f72397b[i10];
    }

    @Override // ga.c0, ga.d1
    public long getBufferedPositionUs() {
        return this.f72406k.getBufferedPositionUs();
    }

    @Override // ga.c0, ga.d1
    public long getNextLoadPositionUs() {
        return this.f72406k.getNextLoadPositionUs();
    }

    @Override // ga.c0
    public m1 getTrackGroups() {
        return (m1) q9.a.e(this.f72404i);
    }

    @Override // ga.d1.a
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void d(c0 c0Var) {
        ((c0.a) q9.a.e(this.f72403h)).d(this);
    }

    @Override // ga.c0, ga.d1
    public boolean isLoading() {
        return this.f72406k.isLoading();
    }

    @Override // ga.c0
    public long j(ja.r[] rVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j10) {
        int[] iArr = new int[rVarArr.length];
        int[] iArr2 = new int[rVarArr.length];
        int i10 = 0;
        for (int i11 = 0; i11 < rVarArr.length; i11++) {
            c1 c1Var = c1VarArr[i11];
            Integer num = c1Var == null ? null : (Integer) this.f72399d.get(c1Var);
            iArr[i11] = num == null ? -1 : num.intValue();
            ja.r rVar = rVarArr[i11];
            if (rVar != null) {
                String str = rVar.getTrackGroup().f95295b;
                iArr2[i11] = Integer.parseInt(str.substring(0, str.indexOf(StringUtils.PROCESS_POSTFIX_DELIMITER)));
            } else {
                iArr2[i11] = -1;
            }
        }
        this.f72399d.clear();
        int length = rVarArr.length;
        c1[] c1VarArr2 = new c1[length];
        c1[] c1VarArr3 = new c1[rVarArr.length];
        ja.r[] rVarArr2 = new ja.r[rVarArr.length];
        ArrayList arrayList = new ArrayList(this.f72397b.length);
        long j11 = j10;
        int i12 = 0;
        while (i12 < this.f72397b.length) {
            for (int i13 = i10; i13 < rVarArr.length; i13++) {
                c1VarArr3[i13] = iArr[i13] == i12 ? c1VarArr[i13] : null;
                if (iArr2[i13] == i12) {
                    ja.r rVar2 = (ja.r) q9.a.e(rVarArr[i13]);
                    rVarArr2[i13] = new a(rVar2, (n9.f0) q9.a.e((n9.f0) this.f72402g.get(rVar2.getTrackGroup())));
                } else {
                    rVarArr2[i13] = null;
                }
            }
            int i14 = i12;
            long j12 = this.f72397b[i12].j(rVarArr2, zArr, c1VarArr3, zArr2, j11);
            if (i14 == 0) {
                j11 = j12;
            } else if (j12 != j11) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i15 = 0; i15 < rVarArr.length; i15++) {
                if (iArr2[i15] == i14) {
                    c1 c1Var2 = (c1) q9.a.e(c1VarArr3[i15]);
                    c1VarArr2[i15] = c1VarArr3[i15];
                    this.f72399d.put(c1Var2, Integer.valueOf(i14));
                    z10 = true;
                } else if (iArr[i15] == i14) {
                    q9.a.g(c1VarArr3[i15] == null);
                }
            }
            if (z10) {
                arrayList.add(this.f72397b[i14]);
            }
            i12 = i14 + 1;
            i10 = 0;
        }
        int i16 = i10;
        System.arraycopy(c1VarArr2, i16, c1VarArr, i16, length);
        this.f72405j = (c0[]) arrayList.toArray(new c0[i16]);
        this.f72406k = this.f72400e.create(arrayList, Lists.transform(arrayList, new Function() { // from class: ga.o0
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                return ((c0) obj).getTrackGroups().c();
            }
        }));
        return j11;
    }

    @Override // ga.c0
    public void maybeThrowPrepareError() {
        for (c0 c0Var : this.f72397b) {
            c0Var.maybeThrowPrepareError();
        }
    }

    @Override // ga.c0
    public long readDiscontinuity() {
        long j10 = -9223372036854775807L;
        for (c0 c0Var : this.f72405j) {
            long discontinuity = c0Var.readDiscontinuity();
            if (discontinuity == -9223372036854775807L) {
                if (j10 != -9223372036854775807L && c0Var.seekToUs(j10) != j10) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j10 == -9223372036854775807L) {
                for (c0 c0Var2 : this.f72405j) {
                    if (c0Var2 == c0Var) {
                        break;
                    }
                    if (c0Var2.seekToUs(discontinuity) != discontinuity) {
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

    @Override // ga.c0, ga.d1
    public void reevaluateBuffer(long j10) {
        this.f72406k.reevaluateBuffer(j10);
    }

    @Override // ga.c0
    public long seekToUs(long j10) {
        long jSeekToUs = this.f72405j[0].seekToUs(j10);
        int i10 = 1;
        while (true) {
            c0[] c0VarArr = this.f72405j;
            if (i10 >= c0VarArr.length) {
                return jSeekToUs;
            }
            if (c0VarArr[i10].seekToUs(jSeekToUs) != jSeekToUs) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i10++;
        }
    }
}
