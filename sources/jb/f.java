package jb;

import n9.x;
import oa.s;
import oa.u;
import q9.d0;

/* JADX INFO: loaded from: classes12.dex */
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f85728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f85729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f85730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f85731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f85732e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f85733f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f85734g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f85735h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f85736i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f85737j = new int[255];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final d0 f85738k = new d0(255);

    f() {
    }

    public boolean a(s sVar, boolean z10) throws x {
        b();
        this.f85738k.S(27);
        if (!u.b(sVar, this.f85738k.e(), 0, 27, z10) || this.f85738k.J() != 1332176723) {
            return false;
        }
        int iH = this.f85738k.H();
        this.f85728a = iH;
        if (iH != 0) {
            if (z10) {
                return false;
            }
            throw x.d("unsupported bit stream revision");
        }
        this.f85729b = this.f85738k.H();
        this.f85730c = this.f85738k.v();
        this.f85731d = this.f85738k.x();
        this.f85732e = this.f85738k.x();
        this.f85733f = this.f85738k.x();
        int iH2 = this.f85738k.H();
        this.f85734g = iH2;
        this.f85735h = iH2 + 27;
        this.f85738k.S(iH2);
        if (!u.b(sVar, this.f85738k.e(), 0, this.f85734g, z10)) {
            return false;
        }
        for (int i10 = 0; i10 < this.f85734g; i10++) {
            this.f85737j[i10] = this.f85738k.H();
            this.f85736i += this.f85737j[i10];
        }
        return true;
    }

    public void b() {
        this.f85728a = 0;
        this.f85729b = 0;
        this.f85730c = 0L;
        this.f85731d = 0L;
        this.f85732e = 0L;
        this.f85733f = 0L;
        this.f85734g = 0;
        this.f85735h = 0;
        this.f85736i = 0;
    }

    public boolean c(s sVar) {
        return d(sVar, -1L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (r10 == (-1)) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r9.getPosition() >= r10) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r9.skip(1) == (-1)) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean d(oa.s r9, long r10) {
        /*
            r8 = this;
            long r0 = r9.getPosition()
            long r2 = r9.getPeekPosition()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L10
            r0 = r2
            goto L11
        L10:
            r0 = r1
        L11:
            q9.a.a(r0)
            q9.d0 r0 = r8.f85738k
            r3 = 4
            r0.S(r3)
        L1a:
            r4 = -1
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 == 0) goto L2b
            long r4 = r9.getPosition()
            r6 = 4
            long r4 = r4 + r6
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 >= 0) goto L51
        L2b:
            q9.d0 r4 = r8.f85738k
            byte[] r4 = r4.e()
            boolean r4 = oa.u.b(r9, r4, r1, r3, r2)
            if (r4 == 0) goto L51
            q9.d0 r0 = r8.f85738k
            r0.W(r1)
            q9.d0 r0 = r8.f85738k
            long r4 = r0.J()
            r6 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L4d
            r9.resetPeekPosition()
            return r2
        L4d:
            r9.skipFully(r2)
            goto L1a
        L51:
            if (r0 == 0) goto L5b
            long r3 = r9.getPosition()
            int r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r3 >= 0) goto L63
        L5b:
            int r3 = r9.skip(r2)
            r4 = -1
            if (r3 == r4) goto L63
            goto L51
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: jb.f.d(oa.s, long):boolean");
    }
}
