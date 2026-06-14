package ga;

import android.net.Uri;
import n9.e0;
import n9.r;

/* JADX INFO: loaded from: classes12.dex */
public final class f1 extends n9.e0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Object f72275r = new Object();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final n9.r f72276s = new r.c().c("SinglePeriodTimeline").f(Uri.EMPTY).a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f72277e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f72278f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f72279g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f72280h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f72281i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f72282j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f72283k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f72284l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f72285m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f72286n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Object f72287o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final n9.r f72288p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final r.g f72289q;

    public f1(long j10, boolean z10, boolean z11, boolean z12, Object obj, n9.r rVar) {
        this(j10, j10, 0L, 0L, z10, z11, z12, obj, rVar);
    }

    @Override // n9.e0
    public int b(Object obj) {
        return f72275r.equals(obj) ? 0 : -1;
    }

    @Override // n9.e0
    public e0.b g(int i10, e0.b bVar, boolean z10) {
        q9.a.c(i10, 0, 1);
        return bVar.s(null, z10 ? f72275r : null, 0, this.f72280h, -this.f72282j);
    }

    @Override // n9.e0
    public int i() {
        return 1;
    }

    @Override // n9.e0
    public Object m(int i10) {
        q9.a.c(i10, 0, 1);
        return f72275r;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e A[PHI: r1
  0x002e: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v6 long) binds: [B:3:0x000d, B:5:0x0011, B:7:0x0017, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // n9.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public n9.e0.c o(int r25, n9.e0.c r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 0
            r2 = 1
            r3 = r25
            q9.a.c(r3, r1, r2)
            long r1 = r0.f72283k
            boolean r14 = r0.f72285m
            if (r14 == 0) goto L2e
            boolean r3 = r0.f72286n
            if (r3 != 0) goto L2e
            r3 = 0
            int r3 = (r27 > r3 ? 1 : (r27 == r3 ? 0 : -1))
            if (r3 == 0) goto L2e
            long r3 = r0.f72281i
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L27
        L24:
            r16 = r5
            goto L30
        L27:
            long r1 = r1 + r27
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L2e
            goto L24
        L2e:
            r16 = r1
        L30:
            java.lang.Object r4 = n9.e0.c.f95261q
            n9.r r5 = r0.f72288p
            java.lang.Object r6 = r0.f72287o
            long r7 = r0.f72277e
            long r9 = r0.f72278f
            long r11 = r0.f72279g
            boolean r13 = r0.f72284l
            n9.r$g r15 = r0.f72289q
            long r1 = r0.f72281i
            r21 = 0
            r18 = r1
            long r1 = r0.f72282j
            r20 = 0
            r3 = r26
            r22 = r1
            n9.e0$c r1 = r3.g(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ga.f1.o(int, n9.e0$c, long):n9.e0$c");
    }

    @Override // n9.e0
    public int p() {
        return 1;
    }

    public f1(long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, Object obj, n9.r rVar) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j10, j11, j12, j13, z10, z11, false, obj, rVar, z12 ? rVar.f95457d : null);
    }

    public f1(long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z10, boolean z11, boolean z12, Object obj, n9.r rVar, r.g gVar) {
        this.f72277e = j10;
        this.f72278f = j11;
        this.f72279g = j12;
        this.f72280h = j13;
        this.f72281i = j14;
        this.f72282j = j15;
        this.f72283k = j16;
        this.f72284l = z10;
        this.f72285m = z11;
        this.f72286n = z12;
        this.f72287o = obj;
        this.f72288p = (n9.r) q9.a.e(rVar);
        this.f72289q = gVar;
    }
}
