package pg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements j, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s f98323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f98324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private m f98325d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f98326e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f98327f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f98328g;

    public h(s upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        this.f98323b = upstream;
        a buffer = upstream.getBuffer();
        this.f98324c = buffer;
        this.f98325d = buffer.q();
        m mVarQ = buffer.q();
        this.f98326e = mVarQ != null ? mVarQ.f() : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        if (r3 == r4.f()) goto L15;
     */
    @Override // pg.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long L(pg.a r7, long r8) {
        /*
            r6 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            boolean r0 = r6.f98327f
            if (r0 != 0) goto La8
            r0 = 0
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 < 0) goto L88
            pg.m r3 = r6.f98325d
            if (r3 == 0) goto L35
            pg.a r4 = r6.f98324c
            pg.m r4 = r4.q()
            if (r3 != r4) goto L2d
            int r3 = r6.f98326e
            pg.a r4 = r6.f98324c
            pg.m r4 = r4.q()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            int r4 = r4.f()
            if (r3 != r4) goto L2d
            goto L35
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Peek source is invalid because upstream source was used"
            r7.<init>(r8)
            throw r7
        L35:
            if (r2 != 0) goto L38
            return r0
        L38:
            pg.s r0 = r6.f98323b
            long r1 = r6.f98328g
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.request(r1)
            if (r0 != 0) goto L48
            r7 = -1
            return r7
        L48:
            pg.m r0 = r6.f98325d
            if (r0 != 0) goto L6b
            pg.a r0 = r6.f98324c
            pg.m r0 = r0.q()
            if (r0 == 0) goto L6b
            pg.a r0 = r6.f98324c
            pg.m r0 = r0.q()
            r6.f98325d = r0
            pg.a r0 = r6.f98324c
            pg.m r0 = r0.q()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r0 = r0.f()
            r6.f98326e = r0
        L6b:
            pg.a r0 = r6.f98324c
            long r0 = r0.s()
            long r2 = r6.f98328g
            long r0 = r0 - r2
            long r8 = java.lang.Math.min(r8, r0)
            pg.a r0 = r6.f98324c
            long r2 = r6.f98328g
            long r4 = r2 + r8
            r1 = r7
            r0.o(r1, r2, r4)
            long r0 = r6.f98328g
            long r0 = r0 + r8
            r6.f98328g = r0
            return r8
        L88:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "byteCount ("
            r7.append(r0)
            r7.append(r8)
            java.lang.String r8 = ") < 0"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        La8:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Source is closed."
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: pg.h.L(pg.a, long):long");
    }

    @Override // pg.j, java.lang.AutoCloseable
    public void close() {
        this.f98327f = true;
    }
}
