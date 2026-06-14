package yads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class oc implements qk0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final byte[] f114254v = {73, 68, 51};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f114255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v92 f114256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w92 f114257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f114258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f114259e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public z43 f114260f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public z43 f114261g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f114262h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f114263i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f114264j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f114265k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f114266l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f114267m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f114268n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f114269o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f114270p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f114271q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f114272r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f114273s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public z43 f114274t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f114275u;

    public oc() {
        this(null, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x0291, code lost:
    
        r20.f114269o = (r14 & 8) >> 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0299, code lost:
    
        if ((r14 & 1) != 0) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x029b, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x029d, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x029e, code lost:
    
        r20.f114265k = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x02a2, code lost:
    
        if (r20.f114266l != false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02a4, code lost:
    
        r20.f114262h = 1;
        r20.f114263i = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02a9, code lost:
    
        r20.f114262h = r16;
        r20.f114263i = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x02af, code lost:
    
        r21.e(r10);
        r4 = r12;
        r3 = 7;
        r5 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x020e, code lost:
    
        r12 = -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x020e A[EDGE_INSN: B:159:0x020e->B:69:0x020e BREAK  A[LOOP:1: B:51:0x01b1->B:183:0x01b1], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0236  */
    @Override // yads.qk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(yads.w92 r21) throws yads.ba2 {
        /*
            Method dump skipped, instruction units count: 788
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.oc.a(yads.w92):void");
    }

    @Override // yads.qk0
    public final void b() {
    }

    public final void c() {
        this.f114262h = 0;
        this.f114263i = 0;
        this.f114264j = 256;
    }

    public oc(String str, boolean z10) {
        this.f114256b = new v92(new byte[7]);
        this.f114257c = new w92(Arrays.copyOf(f114254v, 10));
        c();
        this.f114267m = -1;
        this.f114268n = -1;
        this.f114271q = -9223372036854775807L;
        this.f114273s = -9223372036854775807L;
        this.f114255a = z10;
        this.f114258d = str;
    }

    @Override // yads.qk0
    public final void a(ap0 ap0Var, y63 y63Var) {
        y63Var.a();
        y63Var.b();
        this.f114259e = y63Var.f118107e;
        y63Var.b();
        z43 z43VarA = ap0Var.a(y63Var.f118106d, 1);
        this.f114260f = z43VarA;
        this.f114274t = z43VarA;
        if (this.f114255a) {
            y63Var.a();
            y63Var.b();
            z43 z43VarA2 = ap0Var.a(y63Var.f118106d, 5);
            this.f114261g = z43VarA2;
            xv0 xv0Var = new xv0();
            y63Var.b();
            xv0Var.f117972a = y63Var.f118107e;
            xv0Var.f117982k = "application/id3";
            z43VarA2.a(new yv0(xv0Var));
            return;
        }
        this.f114261g = new wj0();
    }

    @Override // yads.qk0
    public final void a(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f114273s = j10;
        }
    }

    @Override // yads.qk0
    public final void a() {
        this.f114273s = -9223372036854775807L;
        this.f114266l = false;
        c();
    }
}
