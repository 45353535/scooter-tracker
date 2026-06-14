package yads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public final class tc0 implements nj0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UUID f116167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final im0 f116168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h01 f116169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f116170e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f116171f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f116172g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f116173h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final rc0 f116174i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final fe1 f116175j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final sc0 f116176k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f116177l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f116178m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Set f116179n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Set f116180o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f116181p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public km0 f116182q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public mc0 f116183r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public mc0 f116184s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Looper f116185t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Handler f116186u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f116187v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public byte[] f116188w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public wc2 f116189x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile oc0 f116190y;

    public tc0(UUID uuid, im0 im0Var, h01 h01Var, HashMap map, boolean z10, int[] iArr, boolean z11, ld0 ld0Var, long j10) {
        fi.a(uuid);
        fi.a("Use C.CLEARKEY_UUID instead", !ar.f108752b.equals(uuid));
        this.f116167b = uuid;
        this.f116168c = im0Var;
        this.f116169d = h01Var;
        this.f116170e = map;
        this.f116171f = z10;
        this.f116172g = iArr;
        this.f116173h = z11;
        this.f116175j = ld0Var;
        this.f116174i = new rc0();
        this.f116176k = new sc0(this);
        this.f116187v = 0;
        this.f116178m = new ArrayList();
        this.f116179n = yv2.a();
        this.f116180o = yv2.a();
        this.f116177l = j10;
    }

    public final hj0 a(Looper looper, jj0 jj0Var, yv0 yv0Var, boolean z10) {
        ArrayList arrayListA;
        if (this.f116190y == null) {
            this.f116190y = new oc0(this, looper);
        }
        fj0 fj0Var = yv0Var.f118401p;
        int i10 = 0;
        mc0 mc0Var = null;
        if (fj0Var == null) {
            int iD = tr1.d(yv0Var.f118398m);
            km0 km0Var = this.f116182q;
            km0Var.getClass();
            if (km0Var.b() != 2 || !gw0.f111359d) {
                int[] iArr = this.f116172g;
                while (true) {
                    if (i10 >= iArr.length) {
                        break;
                    }
                    if (iArr[i10] != iD) {
                        i10++;
                    } else if (i10 != -1 && km0Var.b() != 1) {
                        mc0 mc0Var2 = this.f116183r;
                        if (mc0Var2 == null) {
                            v31 v31Var = y31.f118068c;
                            mc0 mc0VarA = a(nk2.f113952f, true, (jj0) null, z10);
                            this.f116178m.add(mc0VarA);
                            this.f116183r = mc0VarA;
                        } else {
                            mc0Var2.b(null);
                        }
                        return this.f116183r;
                    }
                }
            }
            return null;
        }
        if (this.f116188w == null) {
            arrayListA = a(fj0Var, this.f116167b, false);
            if (arrayListA.isEmpty()) {
                pc0 pc0Var = new pc0(this.f116167b);
                uf1.b("DefaultDrmSessionMgr", uf1.a("DRM error", pc0Var));
                if (jj0Var != null) {
                    jj0Var.a(pc0Var);
                }
                return new ol0(new gj0(pc0Var, 6003));
            }
        } else {
            arrayListA = null;
        }
        if (this.f116171f) {
            Iterator it = this.f116178m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                mc0 mc0Var3 = (mc0) it.next();
                if (w83.a(mc0Var3.f113401a, arrayListA)) {
                    mc0Var = mc0Var3;
                    break;
                }
            }
        } else {
            mc0Var = this.f116184s;
        }
        if (mc0Var != null) {
            mc0Var.b(jj0Var);
            return mc0Var;
        }
        mc0 mc0VarA2 = a((List) arrayListA, false, jj0Var, z10);
        if (!this.f116171f) {
            this.f116184s = mc0VarA2;
        }
        this.f116178m.add(mc0VarA2);
        return mc0VarA2;
    }

    @Override // yads.nj0
    public final hj0 b(jj0 jj0Var, yv0 yv0Var) {
        if (this.f116181p <= 0) {
            throw new IllegalStateException();
        }
        Looper looper = this.f116185t;
        if (looper != null) {
            return a(looper, jj0Var, yv0Var, true);
        }
        throw new IllegalStateException();
    }

    @Override // yads.nj0
    public final void prepare() {
        int i10 = this.f116181p;
        this.f116181p = i10 + 1;
        if (i10 != 0) {
            return;
        }
        if (this.f116182q == null) {
            km0 km0VarA = this.f116168c.a(this.f116167b);
            this.f116182q = km0VarA;
            km0VarA.a(new nc0(this));
        } else if (this.f116177l != -9223372036854775807L) {
            for (int i11 = 0; i11 < this.f116178m.size(); i11++) {
                ((mc0) this.f116178m.get(i11)).b(null);
            }
        }
    }

    @Override // yads.nj0
    public final void release() {
        int i10 = this.f116181p - 1;
        this.f116181p = i10;
        if (i10 != 0) {
            return;
        }
        if (this.f116177l != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f116178m);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((mc0) arrayList.get(i11)).a((jj0) null);
            }
        }
        w73 it = d41.a(this.f116179n).iterator();
        while (it.hasNext()) {
            ((qc0) it.next()).release();
        }
        if (this.f116182q != null && this.f116181p == 0 && this.f116178m.isEmpty() && this.f116179n.isEmpty()) {
            km0 km0Var = this.f116182q;
            km0Var.getClass();
            km0Var.release();
            this.f116182q = null;
        }
    }

    public final mc0 a(List list, boolean z10, jj0 jj0Var) {
        this.f116182q.getClass();
        boolean z11 = this.f116173h | z10;
        UUID uuid = this.f116167b;
        km0 km0Var = this.f116182q;
        rc0 rc0Var = this.f116174i;
        sc0 sc0Var = this.f116176k;
        int i10 = this.f116187v;
        byte[] bArr = this.f116188w;
        HashMap map = this.f116170e;
        h01 h01Var = this.f116169d;
        Looper looper = this.f116185t;
        looper.getClass();
        fe1 fe1Var = this.f116175j;
        wc2 wc2Var = this.f116189x;
        wc2Var.getClass();
        mc0 mc0Var = new mc0(uuid, km0Var, rc0Var, sc0Var, list, i10, z11, z10, bArr, map, h01Var, looper, fe1Var, wc2Var);
        mc0Var.b(jj0Var);
        if (this.f116177l != -9223372036854775807L) {
            mc0Var.b(null);
        }
        return mc0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final yads.mc0 a(java.util.List r10, boolean r11, yads.jj0 r12, boolean r13) {
        /*
            r9 = this;
            yads.mc0 r0 = r9.a(r10, r11, r12)
            int r1 = r0.f113415o
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4 = 19
            r5 = 0
            r6 = 1
            if (r1 != r6) goto L56
            int r1 = yads.w83.f117341a
            if (r1 < r4) goto L24
            yads.gj0 r1 = r0.d()
            r1.getClass()
            java.lang.Throwable r1 = r1.getCause()
            boolean r1 = r1 instanceof android.media.ResourceBusyException
            if (r1 == 0) goto L56
        L24:
            java.util.Set r1 = r9.f116180o
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L56
            java.util.Set r1 = r9.f116180o
            yads.d41 r1 = yads.d41.a(r1)
            yads.w73 r1 = r1.iterator()
        L36:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L46
            java.lang.Object r7 = r1.next()
            yads.hj0 r7 = (yads.hj0) r7
            r7.a(r5)
            goto L36
        L46:
            r0.a(r12)
            long r7 = r9.f116177l
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 == 0) goto L52
            r0.a(r5)
        L52:
            yads.mc0 r0 = r9.a(r10, r11, r12)
        L56:
            int r1 = r0.f113415o
            if (r1 != r6) goto Lc4
            int r1 = yads.w83.f117341a
            if (r1 < r4) goto L6d
            yads.gj0 r1 = r0.d()
            r1.getClass()
            java.lang.Throwable r1 = r1.getCause()
            boolean r1 = r1 instanceof android.media.ResourceBusyException
            if (r1 == 0) goto Lc4
        L6d:
            if (r13 == 0) goto Lc4
            java.util.Set r13 = r9.f116179n
            boolean r13 = r13.isEmpty()
            if (r13 != 0) goto Lc4
            java.util.Set r13 = r9.f116179n
            yads.d41 r13 = yads.d41.a(r13)
            yads.w73 r13 = r13.iterator()
        L81:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L91
            java.lang.Object r1 = r13.next()
            yads.qc0 r1 = (yads.qc0) r1
            r1.release()
            goto L81
        L91:
            java.util.Set r13 = r9.f116180o
            boolean r13 = r13.isEmpty()
            if (r13 != 0) goto Lb3
            java.util.Set r13 = r9.f116180o
            yads.d41 r13 = yads.d41.a(r13)
            yads.w73 r13 = r13.iterator()
        La3:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto Lb3
            java.lang.Object r1 = r13.next()
            yads.hj0 r1 = (yads.hj0) r1
            r1.a(r5)
            goto La3
        Lb3:
            r0.a(r12)
            long r6 = r9.f116177l
            int r13 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r13 == 0) goto Lbf
            r0.a(r5)
        Lbf:
            yads.mc0 r10 = r9.a(r10, r11, r12)
            return r10
        Lc4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.tc0.a(java.util.List, boolean, yads.jj0, boolean):yads.mc0");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        return 0;
     */
    @Override // yads.nj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(yads.yv0 r6) {
        /*
            r5 = this;
            yads.km0 r0 = r5.f116182q
            r0.getClass()
            int r0 = r0.b()
            yads.fj0 r1 = r6.f118401p
            r2 = 0
            if (r1 != 0) goto L26
            java.lang.String r6 = r6.f118398m
            int r6 = yads.tr1.d(r6)
            int[] r1 = r5.f116172g
            r3 = r2
        L17:
            int r4 = r1.length
            if (r3 >= r4) goto L25
            r4 = r1[r3]
            if (r4 != r6) goto L22
            r6 = -1
            if (r3 == r6) goto L25
            goto L8a
        L22:
            int r3 = r3 + 1
            goto L17
        L25:
            return r2
        L26:
            byte[] r6 = r5.f116188w
            if (r6 == 0) goto L2b
            goto L8a
        L2b:
            java.util.UUID r6 = r5.f116167b
            r3 = 1
            java.util.ArrayList r6 = a(r1, r6, r3)
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L5d
            int r6 = r1.f110741e
            if (r6 != r3) goto L89
            yads.ej0[] r6 = r1.f110738b
            r6 = r6[r2]
            java.util.UUID r2 = yads.ar.f108752b
            boolean r6 = r6.a(r2)
            if (r6 == 0) goto L89
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r2 = "DrmInitData only contains common PSSH SchemeData. Assuming support for: "
            r6.<init>(r2)
            java.util.UUID r2 = r5.f116167b
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            java.lang.String r2 = "DefaultDrmSessionMgr"
            yads.uf1.d(r2, r6)
        L5d:
            java.lang.String r6 = r1.f110740d
            if (r6 == 0) goto L8a
            java.lang.String r1 = "cenc"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L6a
            goto L8a
        L6a:
            java.lang.String r1 = "cbcs"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L79
            int r6 = yads.w83.f117341a
            r1 = 25
            if (r6 < r1) goto L89
            goto L8a
        L79:
            java.lang.String r1 = "cbc1"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L89
            java.lang.String r1 = "cens"
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L8a
        L89:
            return r3
        L8a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.tc0.a(yads.yv0):int");
    }

    @Override // yads.nj0
    public final mj0 a(jj0 jj0Var, yv0 yv0Var) {
        if (this.f116181p > 0) {
            if (this.f116185t != null) {
                qc0 qc0Var = new qc0(this, jj0Var);
                qc0Var.a(yv0Var);
                return qc0Var;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // yads.nj0
    public final void a(Looper looper, wc2 wc2Var) {
        synchronized (this) {
            try {
                Looper looper2 = this.f116185t;
                if (looper2 == null) {
                    this.f116185t = looper;
                    this.f116186u = new Handler(looper);
                } else if (looper2 == looper) {
                    this.f116186u.getClass();
                } else {
                    throw new IllegalStateException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f116189x = wc2Var;
    }

    public static ArrayList a(fj0 fj0Var, UUID uuid, boolean z10) {
        ArrayList arrayList = new ArrayList(fj0Var.f110741e);
        for (int i10 = 0; i10 < fj0Var.f110741e; i10++) {
            ej0 ej0Var = fj0Var.f110738b[i10];
            if ((ej0Var.a(uuid) || (ar.f108753c.equals(uuid) && ej0Var.a(ar.f108752b))) && (ej0Var.f110387f != null || z10)) {
                arrayList.add(ej0Var);
            }
        }
        return arrayList;
    }
}
