package ga;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes12.dex */
final class i1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q9.l f72357c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray f72356b = new SparseArray();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f72355a = -1;

    public i1(q9.l lVar) {
        this.f72357c = lVar;
    }

    public void a(int i10, Object obj) {
        if (this.f72355a == -1) {
            q9.a.g(this.f72356b.size() == 0);
            this.f72355a = 0;
        }
        if (this.f72356b.size() > 0) {
            SparseArray sparseArray = this.f72356b;
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            q9.a.a(i10 >= iKeyAt);
            if (iKeyAt == i10) {
                q9.l lVar = this.f72357c;
                SparseArray sparseArray2 = this.f72356b;
                lVar.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f72356b.append(i10, obj);
    }

    public void b() {
        for (int i10 = 0; i10 < this.f72356b.size(); i10++) {
            this.f72357c.accept(this.f72356b.valueAt(i10));
        }
        this.f72355a = -1;
        this.f72356b.clear();
    }

    public void c(int i10) {
        for (int size = this.f72356b.size() - 1; size >= 0 && i10 < this.f72356b.keyAt(size); size--) {
            this.f72357c.accept(this.f72356b.valueAt(size));
            this.f72356b.removeAt(size);
        }
        this.f72355a = this.f72356b.size() > 0 ? Math.min(this.f72355a, this.f72356b.size() - 1) : -1;
    }

    public void d(int i10) {
        int i11 = 0;
        while (i11 < this.f72356b.size() - 1) {
            int i12 = i11 + 1;
            if (i10 < this.f72356b.keyAt(i12)) {
                return;
            }
            this.f72357c.accept(this.f72356b.valueAt(i11));
            this.f72356b.removeAt(i11);
            int i13 = this.f72355a;
            if (i13 > 0) {
                this.f72355a = i13 - 1;
            }
            i11 = i12;
        }
    }

    public Object e(int i10) {
        if (this.f72355a == -1) {
            this.f72355a = 0;
        }
        while (true) {
            int i11 = this.f72355a;
            if (i11 <= 0 || i10 >= this.f72356b.keyAt(i11)) {
                break;
            }
            this.f72355a--;
        }
        while (this.f72355a < this.f72356b.size() - 1 && i10 >= this.f72356b.keyAt(this.f72355a + 1)) {
            this.f72355a++;
        }
        return this.f72356b.valueAt(this.f72355a);
    }

    public Object f() {
        return this.f72356b.valueAt(r0.size() - 1);
    }

    public boolean g() {
        return this.f72356b.size() == 0;
    }
}
