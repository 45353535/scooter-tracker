package yads;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public final class mc0 implements hj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f113401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final km0 f113402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gc0 f113403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hc0 f113404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f113405e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f113406f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f113407g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f113408h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final mz f113409i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final fe1 f113410j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final wc2 f113411k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h01 f113412l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final UUID f113413m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final kc0 f113414n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f113415o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f113416p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public HandlerThread f113417q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ic0 f113418r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public w10 f113419s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public gj0 f113420t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public byte[] f113421u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public byte[] f113422v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public gm0 f113423w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public jm0 f113424x;

    public mc0(UUID uuid, km0 km0Var, rc0 rc0Var, sc0 sc0Var, List list, int i10, boolean z10, boolean z11, byte[] bArr, HashMap map, h01 h01Var, Looper looper, fe1 fe1Var, wc2 wc2Var) {
        if (i10 == 1 || i10 == 3) {
            fi.a(bArr);
        }
        this.f113413m = uuid;
        this.f113403c = rc0Var;
        this.f113404d = sc0Var;
        this.f113402b = km0Var;
        this.f113405e = i10;
        this.f113406f = z10;
        this.f113407g = z11;
        if (bArr != null) {
            this.f113422v = bArr;
            this.f113401a = null;
        } else {
            this.f113401a = DesugarCollections.unmodifiableList((List) fi.a(list));
        }
        this.f113408h = map;
        this.f113412l = h01Var;
        this.f113409i = new mz();
        this.f113410j = fe1Var;
        this.f113411k = wc2Var;
        this.f113415o = 2;
        this.f113414n = new kc0(this, looper);
    }

    public final void a(uy uyVar) {
        Set set;
        mz mzVar = this.f113409i;
        synchronized (mzVar.f113658b) {
            set = mzVar.f113660d;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            uyVar.accept((jj0) it.next());
        }
    }

    @Override // yads.hj0
    public final void b(jj0 jj0Var) {
        if (this.f113416p < 0) {
            uf1.b("DefaultDrmSession", "Session reference count less than zero: " + this.f113416p);
            this.f113416p = 0;
        }
        if (jj0Var != null) {
            mz mzVar = this.f113409i;
            synchronized (mzVar.f113658b) {
                try {
                    ArrayList arrayList = new ArrayList(mzVar.f113661e);
                    arrayList.add(jj0Var);
                    mzVar.f113661e = DesugarCollections.unmodifiableList(arrayList);
                    Integer num = (Integer) mzVar.f113659c.get(jj0Var);
                    if (num == null) {
                        HashSet hashSet = new HashSet(mzVar.f113660d);
                        hashSet.add(jj0Var);
                        mzVar.f113660d = DesugarCollections.unmodifiableSet(hashSet);
                    }
                    mzVar.f113659c.put(jj0Var, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
                } finally {
                }
            }
        }
        int i10 = this.f113416p + 1;
        this.f113416p = i10;
        if (i10 == 1) {
            if (this.f113415o != 2) {
                throw new IllegalStateException();
            }
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f113417q = handlerThread;
            handlerThread.start();
            this.f113418r = new ic0(this, this.f113417q.getLooper());
            if (g()) {
                a(true);
            }
        } else if (jj0Var != null && f() && this.f113409i.a(jj0Var) == 1) {
            jj0Var.a(this.f113415o);
        }
        sc0 sc0Var = (sc0) this.f113404d;
        tc0 tc0Var = sc0Var.f115747a;
        if (tc0Var.f116177l != -9223372036854775807L) {
            tc0Var.f116180o.remove(this);
            Handler handler = sc0Var.f115747a.f116186u;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override // yads.hj0
    public final int c() {
        return this.f113415o;
    }

    @Override // yads.hj0
    public final gj0 d() {
        if (this.f113415o == 1) {
            return this.f113420t;
        }
        return null;
    }

    @Override // yads.hj0
    public final w10 e() {
        return this.f113419s;
    }

    public final boolean f() {
        int i10 = this.f113415o;
        return i10 == 3 || i10 == 4;
    }

    public final boolean g() {
        if (f()) {
            return true;
        }
        try {
            byte[] bArrC = this.f113402b.c();
            this.f113421u = bArrC;
            this.f113402b.a(bArrC, this.f113411k);
            this.f113419s = this.f113402b.d(this.f113421u);
            final int i10 = 3;
            this.f113415o = 3;
            a(new uy() { // from class: yads.rm
                @Override // yads.uy
                public final void accept(Object obj) {
                    ((jj0) obj).a(i10);
                }
            });
            this.f113421u.getClass();
            return true;
        } catch (NotProvisionedException unused) {
            rc0 rc0Var = (rc0) this.f113403c;
            rc0Var.f115400a.add(this);
            if (rc0Var.f115401b == null) {
                rc0Var.f115401b = this;
                jm0 jm0VarA = this.f113402b.a();
                this.f113424x = jm0VarA;
                ic0 ic0Var = this.f113418r;
                int i11 = w83.f117341a;
                jm0VarA.getClass();
                ic0Var.getClass();
                ic0Var.obtainMessage(0, new jc0(ge1.f111170a.getAndIncrement(), true, SystemClock.elapsedRealtime(), jm0VarA)).sendToTarget();
            }
            return false;
        } catch (Exception e10) {
            a(1, e10);
            return false;
        }
    }

    public final Map h() {
        byte[] bArr = this.f113421u;
        if (bArr == null) {
            return null;
        }
        return this.f113402b.a(bArr);
    }

    public final void a(boolean z10) {
        Pair pair;
        String str;
        long jMin;
        if (this.f113407g) {
            return;
        }
        byte[] bArr = this.f113421u;
        int i10 = w83.f117341a;
        int i11 = this.f113405e;
        if (i11 != 0 && i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                this.f113422v.getClass();
                this.f113421u.getClass();
                a(this.f113422v, 3, z10);
                return;
            }
            byte[] bArr2 = this.f113422v;
            if (bArr2 != null) {
                try {
                    this.f113402b.a(bArr, bArr2);
                } catch (Exception e10) {
                    a(1, e10);
                    return;
                }
            }
            a(bArr, 2, z10);
            return;
        }
        byte[] bArr3 = this.f113422v;
        if (bArr3 == null) {
            a(bArr, 1, z10);
            return;
        }
        if (this.f113415o != 4) {
            try {
                this.f113402b.a(bArr, bArr3);
            } catch (Exception e11) {
                a(1, e11);
                return;
            }
        }
        if (ar.f108754d.equals(this.f113413m)) {
            Map mapH = h();
            if (mapH == null) {
                pair = null;
            } else {
                long j10 = -9223372036854775807L;
                try {
                    str = (String) mapH.get("LicenseDurationRemaining");
                } catch (NumberFormatException unused) {
                }
                long j11 = str != null ? Long.parseLong(str) : -9223372036854775807L;
                Long lValueOf = Long.valueOf(j11);
                try {
                    String str2 = (String) mapH.get("PlaybackDurationRemaining");
                    if (str2 != null) {
                        j10 = Long.parseLong(str2);
                    }
                } catch (NumberFormatException unused2) {
                }
                pair = new Pair(lValueOf, Long.valueOf(j10));
            }
            pair.getClass();
            jMin = Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
        } else {
            jMin = Long.MAX_VALUE;
        }
        if (this.f113405e == 0 && jMin <= 60) {
            uf1.a("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + jMin);
            a(bArr, 2, z10);
            return;
        }
        if (jMin <= 0) {
            a(2, new wc1());
        } else {
            this.f113415o = 4;
            a(new uy() { // from class: yads.gm
                @Override // yads.uy
                public final void accept(Object obj) {
                    ((jj0) obj).c();
                }
            });
        }
    }

    @Override // yads.hj0
    public final UUID b() {
        return this.f113413m;
    }

    public final void a(Object obj, Object obj2) {
        if (obj == this.f113423w && f()) {
            this.f113423w = null;
            if (obj2 instanceof Exception) {
                Exception exc = (Exception) obj2;
                if (exc instanceof NotProvisionedException) {
                    rc0 rc0Var = (rc0) this.f113403c;
                    rc0Var.f115400a.add(this);
                    if (rc0Var.f115401b != null) {
                        return;
                    }
                    rc0Var.f115401b = this;
                    jm0 jm0VarA = this.f113402b.a();
                    this.f113424x = jm0VarA;
                    ic0 ic0Var = this.f113418r;
                    int i10 = w83.f117341a;
                    jm0VarA.getClass();
                    ic0Var.getClass();
                    ic0Var.obtainMessage(0, new jc0(ge1.f111170a.getAndIncrement(), true, SystemClock.elapsedRealtime(), jm0VarA)).sendToTarget();
                    return;
                }
                a(2, exc);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f113405e == 3) {
                    km0 km0Var = this.f113402b;
                    byte[] bArr2 = this.f113422v;
                    int i11 = w83.f117341a;
                    km0Var.b(bArr2, bArr);
                    a(new uy() { // from class: yads.hm
                        @Override // yads.uy
                        public final void accept(Object obj3) {
                            ((jj0) obj3).b();
                        }
                    });
                    return;
                }
                byte[] bArrB = this.f113402b.b(this.f113421u, bArr);
                int i12 = this.f113405e;
                if ((i12 == 2 || (i12 == 0 && this.f113422v != null)) && bArrB != null && bArrB.length != 0) {
                    this.f113422v = bArrB;
                }
                this.f113415o = 4;
                a(new uy() { // from class: yads.im
                    @Override // yads.uy
                    public final void accept(Object obj3) {
                        ((jj0) obj3).a();
                    }
                });
            } catch (Exception e10) {
                if (e10 instanceof NotProvisionedException) {
                    rc0 rc0Var2 = (rc0) this.f113403c;
                    rc0Var2.f115400a.add(this);
                    if (rc0Var2.f115401b != null) {
                        return;
                    }
                    rc0Var2.f115401b = this;
                    jm0 jm0VarA2 = this.f113402b.a();
                    this.f113424x = jm0VarA2;
                    ic0 ic0Var2 = this.f113418r;
                    int i13 = w83.f117341a;
                    jm0VarA2.getClass();
                    ic0Var2.getClass();
                    ic0Var2.obtainMessage(0, new jc0(ge1.f111170a.getAndIncrement(), true, SystemClock.elapsedRealtime(), jm0VarA2)).sendToTarget();
                    return;
                }
                a(1, e10);
            }
        }
    }

    @Override // yads.hj0
    public final boolean a() {
        return this.f113406f;
    }

    public final void a(byte[] bArr, int i10, boolean z10) {
        try {
            gm0 gm0VarA = this.f113402b.a(bArr, this.f113401a, i10, this.f113408h);
            this.f113423w = gm0VarA;
            ic0 ic0Var = this.f113418r;
            int i11 = w83.f117341a;
            gm0VarA.getClass();
            ic0Var.getClass();
            ic0Var.obtainMessage(1, new jc0(ge1.f111170a.getAndIncrement(), z10, SystemClock.elapsedRealtime(), gm0VarA)).sendToTarget();
        } catch (Exception e10) {
            if (e10 instanceof NotProvisionedException) {
                rc0 rc0Var = (rc0) this.f113403c;
                rc0Var.f115400a.add(this);
                if (rc0Var.f115401b != null) {
                    return;
                }
                rc0Var.f115401b = this;
                jm0 jm0VarA = this.f113402b.a();
                this.f113424x = jm0VarA;
                ic0 ic0Var2 = this.f113418r;
                int i12 = w83.f117341a;
                jm0VarA.getClass();
                ic0Var2.getClass();
                ic0Var2.obtainMessage(0, new jc0(ge1.f111170a.getAndIncrement(), true, SystemClock.elapsedRealtime(), jm0VarA)).sendToTarget();
                return;
            }
            a(1, e10);
        }
    }

    @Override // yads.hj0
    public final void a(jj0 jj0Var) {
        int i10 = this.f113416p;
        if (i10 <= 0) {
            uf1.b("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.f113416p = i11;
        if (i11 == 0) {
            this.f113415o = 0;
            kc0 kc0Var = this.f113414n;
            int i12 = w83.f117341a;
            kc0Var.removeCallbacksAndMessages(null);
            ic0 ic0Var = this.f113418r;
            synchronized (ic0Var) {
                ic0Var.removeCallbacksAndMessages(null);
                ic0Var.f111955a = true;
            }
            this.f113418r = null;
            this.f113417q.quit();
            this.f113417q = null;
            this.f113419s = null;
            this.f113420t = null;
            this.f113423w = null;
            this.f113424x = null;
            byte[] bArr = this.f113421u;
            if (bArr != null) {
                this.f113402b.b(bArr);
                this.f113421u = null;
            }
        }
        if (jj0Var != null) {
            this.f113409i.b(jj0Var);
            if (this.f113409i.a(jj0Var) == 0) {
                jj0Var.d();
            }
        }
        ((sc0) this.f113404d).a(this, this.f113416p);
    }

    @Override // yads.hj0
    public final boolean a(String str) {
        km0 km0Var = this.f113402b;
        byte[] bArr = this.f113421u;
        if (bArr != null) {
            return km0Var.a(str, bArr);
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(int r6, final java.lang.Exception r7) {
        /*
            r5 = this;
            yads.gj0 r0 = new yads.gj0
            int r1 = yads.w83.f117341a
            r2 = 21
            r3 = 1
            if (r1 < r2) goto L14
            boolean r2 = yads.qj0.a(r7)
            if (r2 == 0) goto L14
            int r6 = yads.qj0.b(r7)
            goto L5a
        L14:
            r2 = 23
            if (r1 < r2) goto L1f
            boolean r2 = yads.rj0.a(r7)
            if (r2 == 0) goto L1f
            goto L4c
        L1f:
            r2 = 18
            if (r1 < r2) goto L2a
            boolean r4 = yads.pj0.b(r7)
            if (r4 == 0) goto L2a
            goto L58
        L2a:
            if (r1 < r2) goto L35
            boolean r1 = yads.pj0.a(r7)
            if (r1 == 0) goto L35
            r6 = 6007(0x1777, float:8.418E-42)
            goto L5a
        L35:
            boolean r1 = r7 instanceof yads.y73
            if (r1 == 0) goto L3c
            r6 = 6001(0x1771, float:8.409E-42)
            goto L5a
        L3c:
            boolean r1 = r7 instanceof yads.pc0
            if (r1 == 0) goto L43
            r6 = 6003(0x1773, float:8.412E-42)
            goto L5a
        L43:
            boolean r1 = r7 instanceof yads.wc1
            if (r1 == 0) goto L4a
            r6 = 6008(0x1778, float:8.419E-42)
            goto L5a
        L4a:
            if (r6 != r3) goto L4f
        L4c:
            r6 = 6006(0x1776, float:8.416E-42)
            goto L5a
        L4f:
            r1 = 2
            if (r6 != r1) goto L55
            r6 = 6004(0x1774, float:8.413E-42)
            goto L5a
        L55:
            r1 = 3
            if (r6 != r1) goto L7a
        L58:
            r6 = 6002(0x1772, float:8.41E-42)
        L5a:
            r0.<init>(r7, r6)
            r5.f113420t = r0
            java.lang.String r6 = "DRM session error"
            java.lang.String r6 = yads.uf1.a(r6, r7)
            java.lang.String r0 = "DefaultDrmSession"
            yads.uf1.b(r0, r6)
            yads.wm r6 = new yads.wm
            r6.<init>()
            r5.a(r6)
            int r6 = r5.f113415o
            r7 = 4
            if (r6 == r7) goto L79
            r5.f113415o = r3
        L79:
            return
        L7a:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.mc0.a(int, java.lang.Exception):void");
    }
}
