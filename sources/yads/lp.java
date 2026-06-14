package yads;

/* JADX INFO: loaded from: classes4.dex */
public abstract class lp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fp f113182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kp f113183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public hp f113184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f113185d;

    public lp(ip ipVar, kp kpVar, long j10, long j11, long j12, long j13, long j14, int i10) {
        this.f113183b = kpVar;
        this.f113185d = i10;
        this.f113182a = new fp(ipVar, j10, j11, j12, j13, j14);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c9, code lost:
    
        if (r8 != r4) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cb, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00cc, code lost:
    
        r20.f108980a = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ce, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(yads.yc0 r19, yads.be2 r20) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.lp.a(yads.yc0, yads.be2):int");
    }

    public final void a(long j10) {
        hp hpVar = this.f113184c;
        if (hpVar == null || hpVar.f111654a != j10) {
            long jA = this.f113182a.f110819a.a(j10);
            fp fpVar = this.f113182a;
            this.f113184c = new hp(j10, jA, fpVar.f110821c, fpVar.f110822d, fpVar.f110823e, fpVar.f110824f, fpVar.f110825g);
        }
    }
}
