package vh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d0 implements l0, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f106808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f106809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private g0 f106810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f106811e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f106812f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f106813g;

    public d0(g upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        this.f106808b = upstream;
        e buffer = upstream.getBuffer();
        this.f106809c = buffer;
        g0 g0Var = buffer.f106814b;
        this.f106810d = g0Var;
        this.f106811e = g0Var != null ? g0Var.f106834b : -1;
    }

    @Override // vh.l0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f106812f = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r3 == r4.f106834b) goto L15;
     */
    @Override // vh.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long read(vh.e r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L74
            boolean r3 = r8.f106812f
            if (r3 != 0) goto L6c
            vh.g0 r3 = r8.f106810d
            if (r3 == 0) goto L2b
            vh.e r4 = r8.f106809c
            vh.g0 r4 = r4.f106814b
            if (r3 != r4) goto L23
            int r3 = r8.f106811e
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            int r4 = r4.f106834b
            if (r3 != r4) goto L23
            goto L2b
        L23:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            r9.<init>(r10)
            throw r9
        L2b:
            if (r2 != 0) goto L2e
            return r0
        L2e:
            vh.g r0 = r8.f106808b
            long r1 = r8.f106813g
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.request(r1)
            if (r0 != 0) goto L3e
            r9 = -1
            return r9
        L3e:
            vh.g0 r0 = r8.f106810d
            if (r0 != 0) goto L51
            vh.e r0 = r8.f106809c
            vh.g0 r0 = r0.f106814b
            if (r0 == 0) goto L51
            r8.f106810d = r0
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r0 = r0.f106834b
            r8.f106811e = r0
        L51:
            vh.e r0 = r8.f106809c
            long r0 = r0.e0()
            long r2 = r8.f106813g
            long r0 = r0 - r2
            long r6 = java.lang.Math.min(r10, r0)
            vh.e r2 = r8.f106809c
            long r4 = r8.f106813g
            r3 = r9
            r2.s(r3, r4, r6)
            long r9 = r8.f106813g
            long r9 = r9 + r6
            r8.f106813g = r9
            return r6
        L6c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            r9.<init>(r10)
            throw r9
        L74:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "byteCount < 0: "
            r9.append(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: vh.d0.read(vh.e, long):long");
    }

    @Override // vh.l0
    public m0 timeout() {
        return this.f106808b.timeout();
    }
}
