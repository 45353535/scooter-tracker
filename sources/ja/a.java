package ja;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Multimap;
import com.google.common.collect.MultimapBuilder;
import ja.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import n9.f0;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public class a extends c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ka.e f85552i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f85553j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f85554k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f85555l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f85556m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f85557n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final float f85558o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final float f85559p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ImmutableList f85560q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final q9.h f85561r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f85562s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f85563t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f85564u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f85565v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private ha.m f85566w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f85567x;

    /* JADX INFO: renamed from: ja.a$a, reason: collision with other inner class name */
    public static final class C1021a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f85568a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f85569b;

        public C1021a(long j10, long j11) {
            this.f85568a = j10;
            this.f85569b = j11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1021a)) {
                return false;
            }
            C1021a c1021a = (C1021a) obj;
            return this.f85568a == c1021a.f85568a && this.f85569b == c1021a.f85569b;
        }

        public int hashCode() {
            return (((int) this.f85568a) * 31) + ((int) this.f85569b);
        }
    }

    public static class b implements r.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f85570a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f85571b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f85572c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f85573d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f85574e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f85575f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final float f85576g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final q9.h f85577h;

        public b() {
            this(10000, 25000, 25000, 0.7f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
        @Override // ja.r.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final ja.r[] a(ja.r.a[] r10, ka.e r11, ga.f0.b r12, n9.e0 r13) {
            /*
                r9 = this;
                com.google.common.collect.ImmutableList r12 = ja.a.e(r10)
                int r13 = r10.length
                ja.r[] r13 = new ja.r[r13]
                r0 = 0
                r1 = r0
            L9:
                int r2 = r10.length
                if (r1 >= r2) goto L40
                r2 = r10[r1]
                if (r2 == 0) goto L15
                int[] r5 = r2.f85681b
                int r3 = r5.length
                if (r3 != 0) goto L17
            L15:
                r7 = r11
                goto L3c
            L17:
                int r3 = r5.length
                r4 = 1
                if (r3 != r4) goto L28
                ja.s r3 = new ja.s
                n9.f0 r4 = r2.f85680a
                r5 = r5[r0]
                int r2 = r2.f85682c
                r3.<init>(r4, r5, r2)
                r7 = r11
                goto L3a
            L28:
                n9.f0 r4 = r2.f85680a
                int r6 = r2.f85682c
                java.lang.Object r2 = r12.get(r1)
                r8 = r2
                com.google.common.collect.ImmutableList r8 = (com.google.common.collect.ImmutableList) r8
                r3 = r9
                r7 = r11
                ja.a r11 = r3.b(r4, r5, r6, r7, r8)
                r3 = r11
            L3a:
                r13[r1] = r3
            L3c:
                int r1 = r1 + 1
                r11 = r7
                goto L9
            L40:
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: ja.a.b.a(ja.r$a[], ka.e, ga.f0$b, n9.e0):ja.r[]");
        }

        protected a b(f0 f0Var, int[] iArr, int i10, ka.e eVar, ImmutableList immutableList) {
            return new a(f0Var, iArr, i10, eVar, this.f85570a, this.f85571b, this.f85572c, this.f85573d, this.f85574e, this.f85575f, this.f85576g, immutableList, this.f85577h);
        }

        public b(int i10, int i11, int i12, float f10) {
            this(i10, i11, i12, 1279, 719, f10, 0.75f, q9.h.f98789a);
        }

        public b(int i10, int i11, int i12, int i13, int i14, float f10, float f11, q9.h hVar) {
            this.f85570a = i10;
            this.f85571b = i11;
            this.f85572c = i12;
            this.f85573d = i13;
            this.f85574e = i14;
            this.f85575f = f10;
            this.f85576g = f11;
            this.f85577h = hVar;
        }
    }

    protected a(f0 f0Var, int[] iArr, int i10, ka.e eVar, long j10, long j11, long j12, int i11, int i12, float f10, float f11, List list, q9.h hVar) {
        long j13;
        super(f0Var, iArr, i10);
        if (j12 < j10) {
            q9.u.h("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j13 = j10;
        } else {
            j13 = j12;
        }
        this.f85552i = eVar;
        this.f85553j = j10 * 1000;
        this.f85554k = j11 * 1000;
        this.f85555l = j13 * 1000;
        this.f85556m = i11;
        this.f85557n = i12;
        this.f85558o = f10;
        this.f85559p = f11;
        this.f85560q = ImmutableList.copyOf((Collection) list);
        this.f85561r = hVar;
        this.f85562s = 1.0f;
        this.f85564u = 0;
        this.f85565v = -9223372036854775807L;
        this.f85567x = -2147483647L;
    }

    private static void f(List list, long[] jArr) {
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            ImmutableList.Builder builder = (ImmutableList.Builder) list.get(i10);
            if (builder != null) {
                builder.add(new C1021a(j10, jArr[i10]));
            }
        }
    }

    private int h(long j10, long j11) {
        long j12 = j(j11);
        int i10 = 0;
        for (int i11 = 0; i11 < this.f85579b; i11++) {
            if (j10 == Long.MIN_VALUE || !isTrackExcluded(i11, j10)) {
                io.bidmachine.media3.common.a format = getFormat(i11);
                if (g(format, format.f80556j, j12)) {
                    return i11;
                }
                i10 = i11;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static ImmutableList i(r.a[] aVarArr) {
        ArrayList arrayList = new ArrayList();
        for (r.a aVar : aVarArr) {
            if (aVar == null || aVar.f85681b.length <= 1) {
                arrayList.add(null);
            } else {
                ImmutableList.Builder builder = ImmutableList.builder();
                builder.add(new C1021a(0L, 0L));
                arrayList.add(builder);
            }
        }
        long[][] jArrN = n(aVarArr);
        int[] iArr = new int[jArrN.length];
        long[] jArr = new long[jArrN.length];
        for (int i10 = 0; i10 < jArrN.length; i10++) {
            long[] jArr2 = jArrN[i10];
            jArr[i10] = jArr2.length == 0 ? 0L : jArr2[0];
        }
        f(arrayList, jArr);
        ImmutableList immutableListO = o(jArrN);
        for (int i11 = 0; i11 < immutableListO.size(); i11++) {
            int iIntValue = ((Integer) immutableListO.get(i11)).intValue();
            int i12 = iArr[iIntValue] + 1;
            iArr[iIntValue] = i12;
            jArr[iIntValue] = jArrN[iIntValue][i12];
            f(arrayList, jArr);
        }
        for (int i13 = 0; i13 < aVarArr.length; i13++) {
            if (arrayList.get(i13) != null) {
                jArr[i13] = jArr[i13] * 2;
            }
        }
        f(arrayList, jArr);
        ImmutableList.Builder builder2 = ImmutableList.builder();
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            ImmutableList.Builder builder3 = (ImmutableList.Builder) arrayList.get(i14);
            builder2.add(builder3 == null ? ImmutableList.of() : builder3.build());
        }
        return builder2.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private long j(long j10) {
        long jP = p(j10);
        if (this.f85560q.isEmpty()) {
            return jP;
        }
        int i10 = 1;
        while (i10 < this.f85560q.size() - 1 && ((C1021a) this.f85560q.get(i10)).f85568a < jP) {
            i10++;
        }
        C1021a c1021a = (C1021a) this.f85560q.get(i10 - 1);
        C1021a c1021a2 = (C1021a) this.f85560q.get(i10);
        long j11 = c1021a.f85568a;
        float f10 = (jP - j11) / (c1021a2.f85568a - j11);
        return c1021a.f85569b + ((long) (f10 * (c1021a2.f85569b - r2)));
    }

    private long k(List list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        ha.m mVar = (ha.m) Iterables.getLast(list);
        long j10 = mVar.f73010g;
        if (j10 != -9223372036854775807L) {
            long j11 = mVar.f73011h;
            if (j11 != -9223372036854775807L) {
                return j11 - j10;
            }
        }
        return -9223372036854775807L;
    }

    private long m(ha.n[] nVarArr, List list) {
        int i10 = this.f85563t;
        if (i10 < nVarArr.length && nVarArr[i10].next()) {
            ha.n nVar = nVarArr[this.f85563t];
            return nVar.getChunkEndTimeUs() - nVar.getChunkStartTimeUs();
        }
        for (ha.n nVar2 : nVarArr) {
            if (nVar2.next()) {
                return nVar2.getChunkEndTimeUs() - nVar2.getChunkStartTimeUs();
            }
        }
        return k(list);
    }

    private static long[][] n(r.a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            r.a aVar = aVarArr[i10];
            if (aVar == null) {
                jArr[i10] = new long[0];
            } else {
                jArr[i10] = new long[aVar.f85681b.length];
                int i11 = 0;
                while (true) {
                    int[] iArr = aVar.f85681b;
                    if (i11 >= iArr.length) {
                        break;
                    }
                    long j10 = aVar.f85680a.a(iArr[i11]).f80556j;
                    long[] jArr2 = jArr[i10];
                    if (j10 == -1) {
                        j10 = 0;
                    }
                    jArr2[i11] = j10;
                    i11++;
                }
                Arrays.sort(jArr[i10]);
            }
        }
        return jArr;
    }

    private static ImmutableList o(long[][] jArr) {
        Multimap multimapBuild = MultimapBuilder.treeKeys().arrayListValues().build();
        for (int i10 = 0; i10 < jArr.length; i10++) {
            long[] jArr2 = jArr[i10];
            if (jArr2.length > 1) {
                int length = jArr2.length;
                double[] dArr = new double[length];
                int i11 = 0;
                while (true) {
                    long[] jArr3 = jArr[i10];
                    double dLog = 0.0d;
                    if (i11 >= jArr3.length) {
                        break;
                    }
                    long j10 = jArr3[i11];
                    if (j10 != -1) {
                        dLog = Math.log(j10);
                    }
                    dArr[i11] = dLog;
                    i11++;
                }
                int i12 = length - 1;
                double d10 = dArr[i12] - dArr[0];
                int i13 = 0;
                while (i13 < i12) {
                    double d11 = dArr[i13];
                    i13++;
                    multimapBuild.put(Double.valueOf(d10 == 0.0d ? 1.0d : (((d11 + dArr[i13]) * 0.5d) - dArr[0]) / d10), Integer.valueOf(i10));
                }
            }
        }
        return ImmutableList.copyOf(multimapBuild.values());
    }

    private long p(long j10) {
        long bitrateEstimate = this.f85552i.getBitrateEstimate();
        this.f85567x = bitrateEstimate;
        long j11 = (long) (bitrateEstimate * this.f85558o);
        long timeToFirstByteEstimateUs = this.f85552i.getTimeToFirstByteEstimateUs();
        if (timeToFirstByteEstimateUs == -9223372036854775807L || j10 == -9223372036854775807L) {
            return (long) (j11 / this.f85562s);
        }
        float f10 = j10;
        return (long) ((j11 * Math.max((f10 / this.f85562s) - timeToFirstByteEstimateUs, 0.0f)) / f10);
    }

    private long q(long j10, long j11) {
        if (j10 == -9223372036854775807L) {
            return this.f85553j;
        }
        if (j11 != -9223372036854775807L) {
            j10 -= j11;
        }
        return Math.min((long) (j10 * this.f85559p), this.f85553j);
    }

    @Override // ja.r
    public void b(long j10, long j11, long j12, List list, ha.n[] nVarArr) {
        long jElapsedRealtime = this.f85561r.elapsedRealtime();
        long jM = m(nVarArr, list);
        int i10 = this.f85564u;
        if (i10 == 0) {
            this.f85564u = 1;
            this.f85563t = h(jElapsedRealtime, jM);
            return;
        }
        int i11 = this.f85563t;
        int iA = list.isEmpty() ? -1 : a(((ha.m) Iterables.getLast(list)).f73007d);
        if (iA != -1) {
            i10 = ((ha.m) Iterables.getLast(list)).f73008e;
            i11 = iA;
        }
        int iH = h(jElapsedRealtime, jM);
        if (iH != i11 && !isTrackExcluded(i11, jElapsedRealtime)) {
            io.bidmachine.media3.common.a format = getFormat(i11);
            io.bidmachine.media3.common.a format2 = getFormat(iH);
            long jQ = q(j12, jM);
            int i12 = format2.f80556j;
            int i13 = format.f80556j;
            if ((i12 > i13 && j11 < jQ) || (i12 < i13 && j11 >= this.f85554k)) {
                iH = i11;
            }
        }
        if (iH != i11) {
            i10 = 3;
        }
        this.f85564u = i10;
        this.f85563t = iH;
    }

    @Override // ja.c, ja.r
    public void disable() {
        this.f85566w = null;
    }

    @Override // ja.c, ja.r
    public void enable() {
        this.f85565v = -9223372036854775807L;
        this.f85566w = null;
    }

    @Override // ja.c, ja.r
    public int evaluateQueueSize(long j10, List list) {
        int i10;
        int i11;
        long jElapsedRealtime = this.f85561r.elapsedRealtime();
        if (!r(jElapsedRealtime, list)) {
            return list.size();
        }
        this.f85565v = jElapsedRealtime;
        this.f85566w = list.isEmpty() ? null : (ha.m) Iterables.getLast(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jL0 = o0.l0(((ha.m) list.get(size - 1)).f73010g - j10, this.f85562s);
        long jL = l();
        if (jL0 >= jL) {
            io.bidmachine.media3.common.a format = getFormat(h(jElapsedRealtime, k(list)));
            for (int i12 = 0; i12 < size; i12++) {
                ha.m mVar = (ha.m) list.get(i12);
                io.bidmachine.media3.common.a aVar = mVar.f73007d;
                if (o0.l0(mVar.f73010g - j10, this.f85562s) >= jL && aVar.f80556j < format.f80556j && (i10 = aVar.f80569w) != -1 && i10 <= this.f85557n && (i11 = aVar.f80568v) != -1 && i11 <= this.f85556m && i10 < format.f80569w) {
                    return i12;
                }
            }
        }
        return size;
    }

    protected boolean g(io.bidmachine.media3.common.a aVar, int i10, long j10) {
        return ((long) i10) <= j10;
    }

    @Override // ja.r
    public int getSelectedIndex() {
        return this.f85563t;
    }

    @Override // ja.r
    public Object getSelectionData() {
        return null;
    }

    @Override // ja.r
    public int getSelectionReason() {
        return this.f85564u;
    }

    protected long l() {
        return this.f85555l;
    }

    @Override // ja.c, ja.r
    public void onPlaybackSpeed(float f10) {
        this.f85562s = f10;
    }

    protected boolean r(long j10, List list) {
        long j11 = this.f85565v;
        if (j11 == -9223372036854775807L || j10 - j11 >= 1000) {
            return true;
        }
        return (list.isEmpty() || ((ha.m) Iterables.getLast(list)).equals(this.f85566w)) ? false : true;
    }
}
