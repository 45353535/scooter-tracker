package ka;

import java.util.Arrays;
import ka.b;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public final class h implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f93065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f93066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f93067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f93068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f93069e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f93070f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a[] f93071g;

    public h(boolean z10, int i10) {
        this(z10, i10, 0);
    }

    @Override // ka.b
    public synchronized void a(a aVar) {
        a[] aVarArr = this.f93071g;
        int i10 = this.f93070f;
        this.f93070f = i10 + 1;
        aVarArr[i10] = aVar;
        this.f93069e--;
        notifyAll();
    }

    @Override // ka.b
    public synchronized a allocate() {
        a aVar;
        try {
            this.f93069e++;
            int i10 = this.f93070f;
            if (i10 > 0) {
                a[] aVarArr = this.f93071g;
                int i11 = i10 - 1;
                this.f93070f = i11;
                aVar = (a) q9.a.e(aVarArr[i11]);
                this.f93071g[this.f93070f] = null;
            } else {
                aVar = new a(new byte[this.f93066b], 0);
                int i12 = this.f93069e;
                a[] aVarArr2 = this.f93071g;
                if (i12 > aVarArr2.length) {
                    this.f93071g = (a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return aVar;
    }

    @Override // ka.b
    public synchronized void b(b.a aVar) {
        while (aVar != null) {
            try {
                a[] aVarArr = this.f93071g;
                int i10 = this.f93070f;
                this.f93070f = i10 + 1;
                aVarArr[i10] = aVar.getAllocation();
                this.f93069e--;
                aVar = aVar.next();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        notifyAll();
    }

    public synchronized int c() {
        return this.f93069e * this.f93066b;
    }

    public synchronized void d() {
        if (this.f93065a) {
            e(0);
        }
    }

    public synchronized void e(int i10) {
        boolean z10 = i10 < this.f93068d;
        this.f93068d = i10;
        if (z10) {
            trim();
        }
    }

    @Override // ka.b
    public int getIndividualAllocationLength() {
        return this.f93066b;
    }

    @Override // ka.b
    public synchronized void trim() {
        try {
            int i10 = 0;
            int iMax = Math.max(0, o0.k(this.f93068d, this.f93066b) - this.f93069e);
            int i11 = this.f93070f;
            if (iMax >= i11) {
                return;
            }
            if (this.f93067c != null) {
                int i12 = i11 - 1;
                while (i10 <= i12) {
                    a aVar = (a) q9.a.e(this.f93071g[i10]);
                    if (aVar.f93055a == this.f93067c) {
                        i10++;
                    } else {
                        a aVar2 = (a) q9.a.e(this.f93071g[i12]);
                        if (aVar2.f93055a != this.f93067c) {
                            i12--;
                        } else {
                            a[] aVarArr = this.f93071g;
                            aVarArr[i10] = aVar2;
                            aVarArr[i12] = aVar;
                            i12--;
                            i10++;
                        }
                    }
                }
                iMax = Math.max(iMax, i10);
                if (iMax >= this.f93070f) {
                    return;
                }
            }
            Arrays.fill(this.f93071g, iMax, this.f93070f, (Object) null);
            this.f93070f = iMax;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public h(boolean z10, int i10, int i11) {
        q9.a.a(i10 > 0);
        q9.a.a(i11 >= 0);
        this.f93065a = z10;
        this.f93066b = i10;
        this.f93070f = i11;
        this.f93071g = new a[i11 + 100];
        if (i11 <= 0) {
            this.f93067c = null;
            return;
        }
        this.f93067c = new byte[i11 * i10];
        for (int i12 = 0; i12 < i11; i12++) {
            this.f93071g[i12] = new a(this.f93067c, i12 * i10);
        }
    }
}
