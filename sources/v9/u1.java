package v9;

import android.util.Base64;
import com.google.common.base.Supplier;
import ga.f0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import n9.e0;
import v9.b2;
import v9.c;

/* JADX INFO: loaded from: classes12.dex */
public final class u1 implements b2 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Supplier f106003i = new Supplier() { // from class: v9.t1
        @Override // com.google.common.base.Supplier
        public final Object get() {
            return u1.l();
        }
    };

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Random f106004j = new Random();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e0.c f106005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e0.b f106006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap f106007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Supplier f106008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b2.a f106009e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private n9.e0 f106010f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f106011g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f106012h;

    private final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f106013a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f106014b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f106015c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private f0.b f106016d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f106017e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f106018f;

        public a(String str, int i10, f0.b bVar) {
            this.f106013a = str;
            this.f106014b = i10;
            this.f106015c = bVar == null ? -1L : bVar.f72273d;
            if (bVar == null || !bVar.b()) {
                return;
            }
            this.f106016d = bVar;
        }

        private int l(n9.e0 e0Var, n9.e0 e0Var2, int i10) {
            if (i10 >= e0Var.p()) {
                if (i10 < e0Var2.p()) {
                    return i10;
                }
                return -1;
            }
            e0Var.n(i10, u1.this.f106005a);
            for (int i11 = u1.this.f106005a.f95284n; i11 <= u1.this.f106005a.f95285o; i11++) {
                int iB = e0Var2.b(e0Var.m(i11));
                if (iB != -1) {
                    return e0Var2.f(iB, u1.this.f106006b).f95256c;
                }
            }
            return -1;
        }

        public boolean i(int i10, f0.b bVar) {
            if (bVar == null) {
                return i10 == this.f106014b;
            }
            f0.b bVar2 = this.f106016d;
            return bVar2 == null ? !bVar.b() && bVar.f72273d == this.f106015c : bVar.f72273d == bVar2.f72273d && bVar.f72271b == bVar2.f72271b && bVar.f72272c == bVar2.f72272c;
        }

        public boolean j(c.a aVar) {
            f0.b bVar = aVar.f105851d;
            if (bVar == null) {
                return this.f106014b != aVar.f105850c;
            }
            long j10 = this.f106015c;
            if (j10 == -1) {
                return false;
            }
            if (bVar.f72273d > j10) {
                return true;
            }
            if (this.f106016d == null) {
                return false;
            }
            int iB = aVar.f105849b.b(bVar.f72270a);
            int iB2 = aVar.f105849b.b(this.f106016d.f72270a);
            f0.b bVar2 = aVar.f105851d;
            if (bVar2.f72273d < this.f106016d.f72273d || iB < iB2) {
                return false;
            }
            if (iB > iB2) {
                return true;
            }
            if (!bVar2.b()) {
                int i10 = aVar.f105851d.f72274e;
                return i10 == -1 || i10 > this.f106016d.f72271b;
            }
            f0.b bVar3 = aVar.f105851d;
            int i11 = bVar3.f72271b;
            int i12 = bVar3.f72272c;
            f0.b bVar4 = this.f106016d;
            int i13 = bVar4.f72271b;
            return i11 > i13 || (i11 == i13 && i12 > bVar4.f72272c);
        }

        public void k(int i10, f0.b bVar) {
            if (this.f106015c != -1 || i10 != this.f106014b || bVar == null || bVar.f72273d < u1.this.m()) {
                return;
            }
            this.f106015c = bVar.f72273d;
        }

        public boolean m(n9.e0 e0Var, n9.e0 e0Var2) {
            int iL = l(e0Var, e0Var2, this.f106014b);
            this.f106014b = iL;
            if (iL == -1) {
                return false;
            }
            f0.b bVar = this.f106016d;
            return bVar == null || e0Var2.b(bVar.f72270a) != -1;
        }
    }

    public u1() {
        this(f106003i);
    }

    private void k(a aVar) {
        if (aVar.f106015c != -1) {
            this.f106012h = aVar.f106015c;
        }
        this.f106011g = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String l() {
        byte[] bArr = new byte[12];
        f106004j.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long m() {
        a aVar = (a) this.f106007c.get(this.f106011g);
        return (aVar == null || aVar.f106015c == -1) ? this.f106012h + 1 : aVar.f106015c;
    }

    private a n(int i10, f0.b bVar) {
        a aVar = null;
        long j10 = Long.MAX_VALUE;
        for (a aVar2 : this.f106007c.values()) {
            aVar2.k(i10, bVar);
            if (aVar2.i(i10, bVar)) {
                long j11 = aVar2.f106015c;
                if (j11 == -1 || j11 < j10) {
                    aVar = aVar2;
                    j10 = j11;
                } else if (j11 == j10 && ((a) q9.o0.i(aVar)).f106016d != null && aVar2.f106016d != null) {
                    aVar = aVar2;
                }
            }
        }
        if (aVar != null) {
            return aVar;
        }
        String str = (String) this.f106008d.get();
        a aVar3 = new a(str, i10, bVar);
        this.f106007c.put(str, aVar3);
        return aVar3;
    }

    private void o(c.a aVar) {
        if (aVar.f105849b.q()) {
            String str = this.f106011g;
            if (str != null) {
                k((a) q9.a.e((a) this.f106007c.get(str)));
                return;
            }
            return;
        }
        a aVar2 = (a) this.f106007c.get(this.f106011g);
        a aVarN = n(aVar.f105850c, aVar.f105851d);
        this.f106011g = aVarN.f106013a;
        c(aVar);
        f0.b bVar = aVar.f105851d;
        if (bVar == null || !bVar.b()) {
            return;
        }
        if (aVar2 != null && aVar2.f106015c == aVar.f105851d.f72273d && aVar2.f106016d != null && aVar2.f106016d.f72271b == aVar.f105851d.f72271b && aVar2.f106016d.f72272c == aVar.f105851d.f72272c) {
            return;
        }
        f0.b bVar2 = aVar.f105851d;
        this.f106009e.i(aVar, n(aVar.f105850c, new f0.b(bVar2.f72270a, bVar2.f72273d)).f106013a, aVarN.f106013a);
    }

    @Override // v9.b2
    public synchronized String a(n9.e0 e0Var, f0.b bVar) {
        return n(e0Var.h(bVar.f72270a, this.f106006b).f95256c, bVar).f106013a;
    }

    @Override // v9.b2
    public synchronized void b(c.a aVar, int i10) {
        try {
            q9.a.e(this.f106009e);
            boolean z10 = i10 == 0;
            Iterator it = this.f106007c.values().iterator();
            while (it.hasNext()) {
                a aVar2 = (a) it.next();
                if (aVar2.j(aVar)) {
                    it.remove();
                    if (aVar2.f106017e) {
                        boolean zEquals = aVar2.f106013a.equals(this.f106011g);
                        boolean z11 = z10 && zEquals && aVar2.f106018f;
                        if (zEquals) {
                            k(aVar2);
                        }
                        this.f106009e.u0(aVar, aVar2.f106013a, z11);
                    }
                }
            }
            o(aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // v9.b2
    public synchronized void c(c.a aVar) {
        q9.a.e(this.f106009e);
        if (aVar.f105849b.q()) {
            return;
        }
        f0.b bVar = aVar.f105851d;
        if (bVar != null) {
            if (bVar.f72273d < m()) {
                return;
            }
            a aVar2 = (a) this.f106007c.get(this.f106011g);
            if (aVar2 != null && aVar2.f106015c == -1 && aVar2.f106014b != aVar.f105850c) {
                return;
            }
        }
        a aVarN = n(aVar.f105850c, aVar.f105851d);
        if (this.f106011g == null) {
            this.f106011g = aVarN.f106013a;
        }
        f0.b bVar2 = aVar.f105851d;
        if (bVar2 != null && bVar2.b()) {
            f0.b bVar3 = aVar.f105851d;
            f0.b bVar4 = new f0.b(bVar3.f72270a, bVar3.f72273d, bVar3.f72271b);
            a aVarN2 = n(aVar.f105850c, bVar4);
            if (!aVarN2.f106017e) {
                aVarN2.f106017e = true;
                aVar.f105849b.h(aVar.f105851d.f72270a, this.f106006b);
                this.f106009e.n0(new c.a(aVar.f105848a, aVar.f105849b, aVar.f105850c, bVar4, Math.max(0L, q9.o0.q1(this.f106006b.f(aVar.f105851d.f72271b)) + this.f106006b.m()), aVar.f105853f, aVar.f105854g, aVar.f105855h, aVar.f105856i, aVar.f105857j), aVarN2.f106013a);
            }
        }
        if (!aVarN.f106017e) {
            aVarN.f106017e = true;
            this.f106009e.n0(aVar, aVarN.f106013a);
        }
        if (aVarN.f106013a.equals(this.f106011g) && !aVarN.f106018f) {
            aVarN.f106018f = true;
            this.f106009e.d(aVar, aVarN.f106013a);
        }
    }

    @Override // v9.b2
    public synchronized void d(c.a aVar) {
        b2.a aVar2;
        try {
            String str = this.f106011g;
            if (str != null) {
                k((a) q9.a.e((a) this.f106007c.get(str)));
            }
            Iterator it = this.f106007c.values().iterator();
            while (it.hasNext()) {
                a aVar3 = (a) it.next();
                it.remove();
                if (aVar3.f106017e && (aVar2 = this.f106009e) != null) {
                    aVar2.u0(aVar, aVar3.f106013a, false);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // v9.b2
    public synchronized void e(c.a aVar) {
        try {
            q9.a.e(this.f106009e);
            n9.e0 e0Var = this.f106010f;
            this.f106010f = aVar.f105849b;
            Iterator it = this.f106007c.values().iterator();
            while (it.hasNext()) {
                a aVar2 = (a) it.next();
                if (!aVar2.m(e0Var, this.f106010f) || aVar2.j(aVar)) {
                    it.remove();
                    if (aVar2.f106017e) {
                        if (aVar2.f106013a.equals(this.f106011g)) {
                            k(aVar2);
                        }
                        this.f106009e.u0(aVar, aVar2.f106013a, false);
                    }
                }
            }
            o(aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // v9.b2
    public void f(b2.a aVar) {
        this.f106009e = aVar;
    }

    @Override // v9.b2
    public synchronized String getActiveSessionId() {
        return this.f106011g;
    }

    public u1(Supplier supplier) {
        this.f106008d = supplier;
        this.f106005a = new e0.c();
        this.f106006b = new e0.b();
        this.f106007c = new HashMap();
        this.f106010f = n9.e0.f95245a;
        this.f106012h = -1L;
    }
}
