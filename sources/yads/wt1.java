package yads;

import android.net.Uri;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class wt1 implements xo0, nu2 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f117574i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f117575j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f117576k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public w92 f117577l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f117579n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f117580o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f117581p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long[][] f117584s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f117585t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f117586u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f117587v;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f117573h = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final tu2 f117571f = new tu2();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f117572g = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w92 f117569d = new w92(16);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayDeque f117570e = new ArrayDeque();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w92 f117566a = new w92(pw1.f114801a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w92 f117567b = new w92(4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w92 f117568c = new w92();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f117578m = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ap0 f117582q = ap0.f108745a;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public vt1[] f117583r = new vt1[0];

    static {
        new cp0() { // from class: yads.ct0
            @Override // yads.cp0
            public final xo0[] a() {
                return wt1.d();
            }

            @Override // yads.cp0
            public /* synthetic */ xo0[] a(Uri uri, Map map) {
                return f5.a(this, uri, map);
            }
        };
    }

    public static /* synthetic */ r43 a(r43 r43Var) {
        return r43Var;
    }

    public static xo0[] d() {
        return new xo0[]{new wt1()};
    }

    @Override // yads.nu2
    public final boolean b() {
        return true;
    }

    @Override // yads.nu2
    public final long c() {
        return this.f117586u;
    }

    @Override // yads.xo0
    public final void release() {
    }

    @Override // yads.xo0
    public final void a(ap0 ap0Var) {
        this.f117582q = ap0Var;
    }

    @Override // yads.nu2
    public final lu2 b(long j10) {
        long jMin;
        long jMin2;
        long j11;
        boolean z10;
        int i10;
        long j12;
        long j13;
        int iA;
        long j14 = j10;
        vt1[] vt1VarArr = this.f117583r;
        if (vt1VarArr.length == 0) {
            pu2 pu2Var = pu2.f114788c;
            return new lu2(pu2Var, pu2Var);
        }
        int i11 = this.f117585t;
        boolean z11 = false;
        int i12 = -1;
        if (i11 != -1) {
            a53 a53Var = vt1VarArr[i11].f117182b;
            int iB = w83.b(a53Var.f108571f, j14, false);
            while (true) {
                if (iB < 0) {
                    iB = -1;
                    break;
                }
                if ((a53Var.f108572g[iB] & 1) != 0) {
                    break;
                }
                iB--;
            }
            if (iB == -1) {
                iB = a53Var.a(j14);
            }
            if (iB == -1) {
                pu2 pu2Var2 = pu2.f114788c;
                return new lu2(pu2Var2, pu2Var2);
            }
            long j15 = a53Var.f108571f[iB];
            jMin = a53Var.f108568c[iB];
            if (j15 >= j14 || iB >= a53Var.f108567b - 1 || (iA = a53Var.a(j14)) == -1 || iA == iB) {
                j13 = -1;
                j11 = -9223372036854775807L;
            } else {
                j11 = a53Var.f108571f[iA];
                j13 = a53Var.f108568c[iA];
            }
            jMin2 = j13;
            j14 = j15;
        } else {
            jMin = Long.MAX_VALUE;
            jMin2 = -1;
            j11 = -9223372036854775807L;
        }
        int i13 = 0;
        while (true) {
            vt1[] vt1VarArr2 = this.f117583r;
            if (i13 >= vt1VarArr2.length) {
                break;
            }
            if (i13 != this.f117585t) {
                a53 a53Var2 = vt1VarArr2[i13].f117182b;
                int iB2 = w83.b(a53Var2.f108571f, j14, z11);
                while (true) {
                    if (iB2 < 0) {
                        j12 = -9223372036854775807L;
                        iB2 = i12;
                        break;
                    }
                    j12 = -9223372036854775807L;
                    if ((a53Var2.f108572g[iB2] & 1) != 0) {
                        break;
                    }
                    iB2--;
                }
                if (iB2 == i12) {
                    iB2 = a53Var2.a(j14);
                }
                if (iB2 != i12) {
                    jMin = Math.min(a53Var2.f108568c[iB2], jMin);
                }
                if (j11 != j12) {
                    z10 = false;
                    int iB3 = w83.b(a53Var2.f108571f, j11, false);
                    while (true) {
                        if (iB3 < 0) {
                            iB3 = -1;
                            break;
                        }
                        if ((a53Var2.f108572g[iB3] & 1) != 0) {
                            break;
                        }
                        iB3--;
                    }
                    i10 = -1;
                    if (iB3 == -1) {
                        iB3 = a53Var2.a(j11);
                    }
                    if (iB3 != -1) {
                        jMin2 = Math.min(a53Var2.f108568c[iB3], jMin2);
                    }
                } else {
                    z10 = false;
                    i10 = -1;
                }
            } else {
                z10 = z11;
                i10 = i12;
            }
            i13++;
            i12 = i10;
            z11 = z10;
        }
        pu2 pu2Var3 = new pu2(j14, jMin);
        return j11 == -9223372036854775807L ? new lu2(pu2Var3, pu2Var3) : new lu2(pu2Var3, new pu2(j11, jMin2));
    }

    public final void c(long j10) {
        while (!this.f117570e.isEmpty() && ((nj) this.f117570e.peek()).f113919b == j10) {
            nj njVar = (nj) this.f117570e.pop();
            if (njVar.f114688a == 1836019574) {
                a(njVar);
                this.f117570e.clear();
                this.f117573h = 2;
            } else if (!this.f117570e.isEmpty()) {
                ((nj) this.f117570e.peek()).f113921d.add(njVar);
            }
        }
        if (this.f117573h != 2) {
            this.f117573h = 0;
            this.f117576k = 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01db, code lost:
    
        if (r0 != 7631467) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01e2, code lost:
    
        if (r0 == 6516589) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01e7, code lost:
    
        if (r0 != 7828084) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01ee, code lost:
    
        if (r0 != 6578553) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01f0, code lost:
    
        r0 = yads.lr1.b(r6, r4, "TDRC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01fb, code lost:
    
        if (r0 != 4280916) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01fd, code lost:
    
        r0 = yads.lr1.b(r6, r4, "TPE1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0208, code lost:
    
        if (r0 != 7630703) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x020a, code lost:
    
        r0 = yads.lr1.b(r6, r4, "TSSE");
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0215, code lost:
    
        if (r0 != 6384738) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0217, code lost:
    
        r0 = yads.lr1.b(r6, r4, "TALB");
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0222, code lost:
    
        if (r0 != 7108978) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0224, code lost:
    
        r0 = yads.lr1.b(r6, r4, "USLT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x022f, code lost:
    
        if (r0 != 6776174) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0231, code lost:
    
        r0 = yads.lr1.b(r6, r4, "TCON");
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x023a, code lost:
    
        if (r0 != 6779504) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x023c, code lost:
    
        r0 = yads.lr1.b(r6, r4, "TIT1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0244, code lost:
    
        yads.uf1.a("MetadataUtil", "Skipped unknown metadata entry: " + yads.pj.a(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0257, code lost:
    
        r4.e(r13);
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x025c, code lost:
    
        r0 = yads.lr1.b(r6, r4, "TCOM");
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0264, code lost:
    
        r0 = yads.lr1.b(r6, r4, "TIT2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x026f, code lost:
    
        if (r6 == null) goto L315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0271, code lost:
    
        r10.add(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0274, code lost:
    
        r8 = r28;
        r23 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0280, code lost:
    
        r4.e(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0283, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0284, code lost:
    
        r28 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x028a, code lost:
    
        if (r10.isEmpty() == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x028d, code lost:
    
        r10 = new yads.fr1(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0076, code lost:
    
        r4.e(r9);
        r9 = r9 + r13;
        r4.e(r4.f117357b + 8);
        r10 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
    
        r13 = r4.f117357b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0088, code lost:
    
        if (r13 >= r9) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008a, code lost:
    
        r13 = r4.b() + r13;
        r6 = r4.b();
        r7 = (r6 >> 24) & 255;
        r28 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a2, code lost:
    
        if (r7 == 169) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a6, code lost:
    
        if (r7 != 253) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ae, code lost:
    
        if (r6 != 1735291493) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b0, code lost:
    
        r4.e(r4.f117357b + 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00be, code lost:
    
        if (r4.b() != 1684108385) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c0, code lost:
    
        r4.e(r4.f117357b + 8);
        r0 = r4.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00cc, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cf, code lost:
    
        yads.uf1.d("MetadataUtil", "Failed to parse uint8 attribute value");
        r0 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d5, code lost:
    
        if (r0 <= 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d7, code lost:
    
        r6 = yads.lr1.f113193a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00db, code lost:
    
        if (r0 > 192) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00dd, code lost:
    
        r0 = r6[r0 - 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e2, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e3, code lost:
    
        if (r0 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e5, code lost:
    
        r6 = new yads.k33("TCON", null, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ed, code lost:
    
        yads.uf1.d("MetadataUtil", "Failed to parse standard genre code");
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00fa, code lost:
    
        if (r6 != 1684632427) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00fc, code lost:
    
        r0 = yads.lr1.a(r6, r4, "TPOS");
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0106, code lost:
    
        if (r6 != 1953655662) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0108, code lost:
    
        r0 = yads.lr1.a(r6, r4, "TRCK");
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0112, code lost:
    
        if (r6 != 1953329263) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0114, code lost:
    
        r0 = yads.lr1.a(r6, "TBPM", r4, r23, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x011d, code lost:
    
        r6 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0120, code lost:
    
        r0 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0125, code lost:
    
        if (r6 != 1668311404) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0127, code lost:
    
        r6 = yads.lr1.a(r6, "TCMP", r4, r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0133, code lost:
    
        if (r6 != 1668249202) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0135, code lost:
    
        r6 = yads.lr1.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x013e, code lost:
    
        if (r6 != 1631670868) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0140, code lost:
    
        r0 = yads.lr1.b(r6, r4, "TPE2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x014a, code lost:
    
        if (r6 != 1936682605) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x014c, code lost:
    
        r0 = yads.lr1.b(r6, r4, "TSOT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0156, code lost:
    
        if (r6 != 1936679276) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0158, code lost:
    
        r0 = yads.lr1.b(r6, r4, "TSO2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0162, code lost:
    
        if (r6 != 1936679282) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0164, code lost:
    
        r0 = yads.lr1.b(r6, r4, "TSOA");
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x016e, code lost:
    
        if (r6 != 1936679265) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0170, code lost:
    
        r0 = yads.lr1.b(r6, r4, "TSOP");
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x017a, code lost:
    
        if (r6 != 1936679791) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x017c, code lost:
    
        r0 = yads.lr1.b(r6, r4, "TSOC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0186, code lost:
    
        if (r6 != 1920233063) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0188, code lost:
    
        r0 = yads.lr1.a(r6, "ITUNESADVISORY", r4, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0194, code lost:
    
        if (r6 != 1885823344) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0196, code lost:
    
        r0 = yads.lr1.a(r6, "ITUNESGAPLESS", r4, false, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01a2, code lost:
    
        if (r6 != 1936683886) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a4, code lost:
    
        r0 = yads.lr1.b(r6, r4, "TVSHOWSORT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01af, code lost:
    
        if (r6 != 1953919848) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01b1, code lost:
    
        r0 = yads.lr1.b(r6, r4, "TVSHOW");
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01bc, code lost:
    
        if (r6 != 757935405) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01be, code lost:
    
        r6 = yads.lr1.b(r13, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01c4, code lost:
    
        r0 = 16777215 & r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01cb, code lost:
    
        if (r0 != 6516084) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01cd, code lost:
    
        r6 = yads.lr1.a(r6, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01d6, code lost:
    
        if (r0 == 7233901) goto L131;
     */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0437  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(yads.nj r30) {
        /*
            Method dump skipped, instruction units count: 1586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.wt1.a(yads.nj):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01e2, code lost:
    
        throw new java.lang.IllegalStateException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01e3, code lost:
    
        r4 = r40.b();
        r6 = r3.f116394c - 20;
        r7 = new yads.w92(r6);
        r40.b(r7.f117356a, 0, r6);
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01f9, code lost:
    
        if (r0 >= (r6 / 12)) goto L408;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01fb, code lost:
    
        r7.e(r7.f117357b + 2);
        r8 = r7.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x020e, code lost:
    
        if (r8 == 2192) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0210, code lost:
    
        if (r8 == 2816) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0214, code lost:
    
        if (r8 == 2817) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0218, code lost:
    
        if (r8 == 2819) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x021a, code lost:
    
        if (r8 == 2820) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x021c, code lost:
    
        r7.e(r7.f117357b + 8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x022a, code lost:
    
        r3.f116392a.add(new yads.su2(r7.d(), (r4 - ((long) r3.f116394c)) - ((long) r7.d())));
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0243, code lost:
    
        r0 = r0 + (r14 ? 1 : 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x024b, code lost:
    
        if (r3.f116392a.isEmpty() == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        if (r15 == r8) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x024d, code lost:
    
        r41.f108980a = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0252, code lost:
    
        r3.f116393b = 3;
        r41.f108980a = ((yads.su2) r3.f116392a.get(0)).f115955a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0263, code lost:
    
        r4 = new yads.w92(8);
        r40.b(r4.f117356a, r9, 8);
        r3.f116394c = r4.d() + 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0280, code lost:
    
        if (r4.b() == 1397048916) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0282, code lost:
    
        r41.f108980a = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0287, code lost:
    
        r41.f108980a = r40.a() - ((long) (r3.f116394c - 12));
        r3.f116393b = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0297, code lost:
    
        r4 = r40.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x029d, code lost:
    
        if (r4 == (-1)) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02a1, code lost:
    
        if (r4 >= 8) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        if (r15 != r7) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02a4, code lost:
    
        r4 = r4 - 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02a7, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02a9, code lost:
    
        r41.f108980a = r4;
        r3.f116393b = r14 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02b3, code lost:
    
        if (r41.f108980a != 0) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02b5, code lost:
    
        r39.f117573h = 0;
        r39.f117576k = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02ba, code lost:
    
        return r14 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02c0, code lost:
    
        throw new java.lang.IllegalStateException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001f, code lost:
    
        r3 = r39.f117571f;
        r15 = r39.f117572g;
        r11 = r3.f116393b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02c1, code lost:
    
        r25 = 4;
        r5 = r40.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02cc, code lost:
    
        if (r39.f117578m != (-1)) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02ce, code lost:
    
        r7 = r14 ? 1 : 0;
        r13 = r7 ? 1 : 0;
        r3 = -1;
        r9 = -1;
        r10 = 0;
        r11 = Long.MAX_VALUE;
        r15 = Long.MAX_VALUE;
        r32 = Long.MAX_VALUE;
        r7 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02e7, code lost:
    
        r8 = r39.f117583r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02ea, code lost:
    
        if (r10 >= r8.length) goto L411;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02ec, code lost:
    
        r4 = r8[r10];
        r8 = r4.f117185e;
        r4 = r4.f117182b;
        r34 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02f6, code lost:
    
        if (r8 != r4.f108567b) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02f9, code lost:
    
        r35 = r4.f108568c[r8];
        r4 = r39.f117584s;
        r14 = yads.w83.f117341a;
        r37 = r4[r10][r8];
        r35 = r35 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x030b, code lost:
    
        if (r35 < 0) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        if (r11 == 0) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x030f, code lost:
    
        if (r35 < android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_REPEAT_MODE) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0312, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0314, code lost:
    
        r4 = r34 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0316, code lost:
    
        if (r4 != false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0318, code lost:
    
        if (r7 != false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x031a, code lost:
    
        if (r4 != r7) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x031e, code lost:
    
        if (r35 >= r32) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
    
        if (r11 == r14) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0320, code lost:
    
        r7 = r4;
        r9 = r10;
        r32 = r35;
        r15 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0328, code lost:
    
        if (r37 >= r11) goto L413;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x032a, code lost:
    
        r13 = r4;
        r3 = r10;
        r11 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x032e, code lost:
    
        r10 = r10 + 1;
        r14 = r34 ? 1 : 0;
        r7 = r7;
        r13 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0334, code lost:
    
        r34 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0338, code lost:
    
        if (r11 == Long.MAX_VALUE) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x033a, code lost:
    
        if (r13 == false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0342, code lost:
    
        if (r15 >= (r11 + 10485760)) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        r13 = 2192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0344, code lost:
    
        r3 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0345, code lost:
    
        r39.f117578m = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0348, code lost:
    
        if (r3 != (-1)) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x034a, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x034b, code lost:
    
        r34 = r14 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x034d, code lost:
    
        r3 = r39.f117583r[r39.f117578m];
        r7 = r3.f117183c;
        r4 = r3.f117185e;
        r8 = r3.f117182b;
        r10 = r8.f108568c[r4];
        r8 = r8.f108569d[r4];
        r9 = r3.f117184d;
        r5 = (r10 - r5) + ((long) r39.f117579n);
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x036d, code lost:
    
        if (r5 < 0) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0371, code lost:
    
        if (r5 < android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_REPEAT_MODE) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        if (r11 == r8) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x037b, code lost:
    
        if (r3.f117181a.f115312g != r34) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x037d, code lost:
    
        r5 = r5 + 8;
        r8 = r8 - 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0381, code lost:
    
        r40.a((int) r5);
        r2 = r3.f117181a;
        r5 = r2.f115315j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0389, code lost:
    
        if (r5 == 0) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x038b, code lost:
    
        r2 = r39.f117567b.f117356a;
        r2[0] = 0;
        r2[1] = 0;
        r2[2] = 0;
        r13 = 4 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x039f, code lost:
    
        if (r39.f117580o >= r8) goto L415;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x03a1, code lost:
    
        r6 = r39.f117581p;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x03a3, code lost:
    
        if (r6 != 0) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        if (r11 != r7) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x03a5, code lost:
    
        r40.b(r2, r13, r5);
        r39.f117579n += r5;
        r39.f117567b.e(0);
        r6 = r39.f117567b.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x03b9, code lost:
    
        if (r6 < 0) goto L416;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x03bb, code lost:
    
        r39.f117581p = r6;
        r39.f117566a.e(0);
        r10 = r25;
        r7.a(r10, r39.f117566a);
        r39.f117580o += r10;
        r8 = r8 + r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x03cf, code lost:
    
        r25 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x03db, code lost:
    
        throw new yads.ba2("Invalid NAL length", null, true, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x03dc, code lost:
    
        r6 = r7.a(r40, r6, false);
        r39.f117579n += r6;
        r39.f117580o += r6;
        r39.f117581p -= r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x03f1, code lost:
    
        r11 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x03fd, code lost:
    
        if ("audio/ac4".equals(r2.f115311f.f118398m) == false) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        r16 = r40.a();
        r7 = (int) ((r40.b() - r40.a()) - ((long) r3.f116394c));
        r8 = new byte[r7];
        r40.b(r8, r9, r7);
        r0 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0401, code lost:
    
        if (r39.f117580o != 0) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0403, code lost:
    
        yads.l0.a(r8, r39.f117568c);
        r5 = 7;
        r7.a(7, r39.f117568c);
        r39.f117580o += 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0415, code lost:
    
        r5 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0417, code lost:
    
        r8 = r8 + r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0419, code lost:
    
        if (r9 == null) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x041b, code lost:
    
        r9.a(r40);
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x041e, code lost:
    
        r2 = r39.f117580o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0420, code lost:
    
        if (r2 >= r8) goto L419;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0422, code lost:
    
        r2 = r7.a(r40, r8 - r2, false);
        r39.f117579n += r2;
        r39.f117580o += r2;
        r39.f117581p -= r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0439, code lost:
    
        r0 = r3.f117182b;
        r5 = r0.f108571f[r4];
        r10 = r0.f108572g[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0443, code lost:
    
        if (r9 == null) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0445, code lost:
    
        r9.a(r7, r5, r10, r11, 0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0459, code lost:
    
        if ((r4 + 1) != r3.f117182b.f108567b) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x045d, code lost:
    
        if (r9.f113335c <= 0) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x045f, code lost:
    
        r7.a(r9.f113336d, r9.f113337e, r9.f113338f, r9.f113339g, null);
        r9.f113335c = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x046f, code lost:
    
        r7.a(r5, r10, r11, 0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0475, code lost:
    
        r3.f117185e++;
        r39.f117578m = -1;
        r39.f117579n = 0;
        r39.f117580o = 0;
        r39.f117581p = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0487, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
    
        if (r0 >= r3.f116392a.size()) goto L392;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0488, code lost:
    
        r41.f108980a = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x048a, code lost:
    
        return r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x048b, code lost:
    
        r12 = r7;
        r6 = r39.f117575j - ((long) r39.f117576k);
        r8 = r40.a() + r6;
        r4 = r39.f117577l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x049a, code lost:
    
        if (r4 == null) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x049c, code lost:
    
        r40.b(r4.f117356a, r39.f117576k, (int) r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x04a6, code lost:
    
        if (r39.f117574i != 1718909296) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x04a8, code lost:
    
        r4.e(8);
        r3 = r4.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x04b4, code lost:
    
        if (r3 == 1751476579) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x04b9, code lost:
    
        if (r3 == 1903435808) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        r11 = (yads.su2) r3.f116392a.get(r0);
        r9 = (int) (r11.f115955a - r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x04bb, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x04bd, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x04bf, code lost:
    
        r3 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x04c0, code lost:
    
        if (r3 == 0) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x04c9, code lost:
    
        r4.e(r4.f117357b + 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x04d7, code lost:
    
        if ((r4.f117358c - r4.f117357b) <= 0) goto L387;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x04d9, code lost:
    
        r3 = r4.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x04e3, code lost:
    
        if (r3 == 1751476579) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        if (r9 < 0) goto L393;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x04e5, code lost:
    
        if (r3 == 1903435808) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x04e7, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x04e9, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x04eb, code lost:
    
        r3 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x04ec, code lost:
    
        if (r3 == 0) goto L391;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x04ef, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x04f6, code lost:
    
        r39.f117587v = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0505, code lost:
    
        if (r39.f117570e.isEmpty() != false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        if (r9 > r7) goto L394;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0507, code lost:
    
        ((yads.nj) r39.f117570e.peek()).f113920c.add(new yads.oj(r39.f117574i, r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0524, code lost:
    
        if (r6 >= android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_REPEAT_MODE) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x0526, code lost:
    
        r40.a((int) r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x052a, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x052c, code lost:
    
        r41.f108980a = r40.a() + r6;
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0534, code lost:
    
        c(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0537, code lost:
    
        if (r3 == false) goto L373;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x053c, code lost:
    
        if (r39.f117573h == 2) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
    
        r10 = r9 + 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x053e, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
    
        if (r10 < 0) goto L395;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
    
        if (r10 > r7) goto L396;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006e, code lost:
    
        r5 = ((r8[r9 + 5] & 255) << 8) | (r8[r10] & 255);
        r10 = r9 + 7;
        r5 = r5 | ((r8[r9 + 6] & 255) << 16);
        r9 = r9 + 8;
        r5 = r5 | ((r8[r10] & 255) << 24);
        r6 = yads.st.f115925c;
        r10 = new java.lang.String(r8, r9, r5, r6);
        r9 = r9 + r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009b, code lost:
    
        switch(r10.hashCode()) {
            case -1711564334: goto L47;
            case -1332107749: goto L43;
            case -1251387154: goto L39;
            case -830665521: goto L35;
            case 1760745220: goto L31;
            default: goto L30;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009e, code lost:
    
        r10 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a6, code lost:
    
        if (r10.equals("Super_SlowMotion_BGM") != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x068e, code lost:
    
        r7 = r40.a();
        r13 = r39.f117575j;
        r4 = r39.f117576k;
        r7 = (r7 + r13) - r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x069b, code lost:
    
        if (r13 == r4) goto L358;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a9, code lost:
    
        r10 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x06a2, code lost:
    
        if (r39.f117574i != 1835365473) goto L356;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x06a4, code lost:
    
        r39.f117568c.c(8);
        r40.a(r39.f117568c.f117356a, 0, 8);
        r3 = r39.f117568c;
        r4 = yads.wj.f117481a;
        r4 = r3.f117357b;
        r9 = r4 + 4;
        r3.e(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x06c7, code lost:
    
        if (r3.b() == 1751411826) goto L355;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x06c9, code lost:
    
        r4 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x06ca, code lost:
    
        r3.e(r4);
        r40.a(r39.f117568c.f117357b);
        r40.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x06e6, code lost:
    
        r39.f117570e.push(new yads.nj(r39.f117574i, r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x06f9, code lost:
    
        if (r39.f117575j != r39.f117576k) goto L362;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x06fb, code lost:
    
        c(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b2, code lost:
    
        if (r10.equals("Super_SlowMotion_Deflickering_On") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x0544, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b5, code lost:
    
        r10 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bd, code lost:
    
        if (r10.equals("Super_SlowMotion_Data") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c0, code lost:
    
        r10 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c8, code lost:
    
        if (r10.equals("Super_SlowMotion_Edit_Data") != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cb, code lost:
    
        r10 = r14 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d3, code lost:
    
        if (r10.equals("SlowMotion_Data") != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d6, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d7, code lost:
    
        switch(r10) {
            case 0: goto L58;
            case 1: goto L57;
            case 2: goto L56;
            case 3: goto L55;
            case 4: goto L54;
            default: goto L397;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e1, code lost:
    
        throw new yads.ba2("Invalid SEF name", null, r14, r14 ? 1 : 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e2, code lost:
    
        r10 = 2817;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e5, code lost:
    
        r10 = 2820;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e8, code lost:
    
        r10 = 2816;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00eb, code lost:
    
        r10 = 2819;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ee, code lost:
    
        r10 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ef, code lost:
    
        r11 = r11.f115956b - (r5 + 8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f4, code lost:
    
        if (r10 == r13) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00f8, code lost:
    
        if (r10 == 2816) goto L401;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00fc, code lost:
    
        if (r10 == 2817) goto L402;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0100, code lost:
    
        if (r10 == 2819) goto L403;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0104, code lost:
    
        if (r10 != 2820) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x010d, code lost:
    
        throw new java.lang.IllegalStateException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x010e, code lost:
    
        r5 = new java.util.ArrayList();
        r10 = new java.lang.String(r8, r9, r11, r6);
        r6 = yads.tu2.f116391e;
        r6.getClass();
        r9 = r6.f111818b;
        r9.getClass();
        r11 = new yads.g03(r9, r6, r10);
        r6 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0130, code lost:
    
        if (r11.hasNext() == false) goto L405;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0132, code lost:
    
        r6.add((java.lang.String) r11.next());
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x013c, code lost:
    
        r6 = j$.util.DesugarCollections.unmodifiableList(r6);
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0145, code lost:
    
        if (r9 >= r6.size()) goto L406;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0147, code lost:
    
        r10 = yads.tu2.f116390d;
        r11 = (java.lang.CharSequence) r6.get(r9);
        r10.getClass();
        r11.getClass();
        r12 = r10.f111818b;
        r12.getClass();
        r13 = new yads.g03(r12, r10, r11);
        r10 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0168, code lost:
    
        if (r13.hasNext() == false) goto L407;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x016a, code lost:
    
        r10.add((java.lang.String) r13.next());
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0174, code lost:
    
        r10 = j$.util.DesugarCollections.unmodifiableList(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x017d, code lost:
    
        if (r10.size() != 3) goto L399;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0180, code lost:
    
        r5.add(new yads.qy2((r14 ? 1 : 0) << (java.lang.Integer.parseInt((java.lang.String) r10.get(2)) - (r14 ? 1 : 0)), java.lang.Long.parseLong((java.lang.String) r10.get(0)), java.lang.Long.parseLong((java.lang.String) r10.get(r14 ? 1 : 0))));
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01ac, code lost:
    
        r9 = r9 + (r14 ? 1 : 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b0, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01b6, code lost:
    
        throw new yads.ba2(null, r0, r14, r14 ? 1 : 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01bc, code lost:
    
        throw new yads.ba2(null, null, r14, r14 ? 1 : 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01bd, code lost:
    
        r15.add(new yads.ry2(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01c5, code lost:
    
        r0 = r0 + (r14 ? 1 : 0);
        r13 = 2192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01d0, code lost:
    
        throw new java.lang.IllegalArgumentException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01d6, code lost:
    
        throw new java.lang.IllegalArgumentException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01d7, code lost:
    
        r41.f108980a = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
    
        if (r15 == r14) goto L222;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r34v0 */
    /* JADX WARN: Type inference failed for: r34v1, types: [int] */
    /* JADX WARN: Type inference failed for: r34v5 */
    @Override // yads.xo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(yads.yo0 r40, yads.be2 r41) throws yads.ba2 {
        /*
            Method dump skipped, instruction units count: 1844
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.wt1.a(yads.yo0, yads.be2):int");
    }

    @Override // yads.xo0
    public final void a(long j10, long j11) {
        this.f117570e.clear();
        this.f117576k = 0;
        this.f117578m = -1;
        this.f117579n = 0;
        this.f117580o = 0;
        this.f117581p = 0;
        if (j10 == 0) {
            if (this.f117573h != 3) {
                this.f117573h = 0;
                this.f117576k = 0;
                return;
            } else {
                tu2 tu2Var = this.f117571f;
                tu2Var.f116392a.clear();
                tu2Var.f116393b = 0;
                this.f117572g.clear();
                return;
            }
        }
        for (vt1 vt1Var : this.f117583r) {
            a53 a53Var = vt1Var.f117182b;
            int iB = w83.b(a53Var.f108571f, j11, false);
            while (true) {
                if (iB < 0) {
                    iB = -1;
                    break;
                } else if ((a53Var.f108572g[iB] & 1) != 0) {
                    break;
                } else {
                    iB--;
                }
            }
            if (iB == -1) {
                iB = a53Var.a(j11);
            }
            vt1Var.f117185e = iB;
            m63 m63Var = vt1Var.f117184d;
            if (m63Var != null) {
                m63Var.f113334b = false;
                m63Var.f113335c = 0;
            }
        }
    }

    @Override // yads.xo0
    public final boolean a(yo0 yo0Var) {
        return ez2.a(yo0Var, false, false);
    }
}
