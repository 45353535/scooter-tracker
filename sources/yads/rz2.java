package yads;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes4.dex */
public final class rz2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uy f115652c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f115651b = new SparseArray();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f115650a = -1;

    public rz2(uy uyVar) {
        this.f115652c = uyVar;
    }

    public final void a(int i10) {
        for (int size = this.f115651b.size() - 1; size >= 0 && i10 < this.f115651b.keyAt(size); size--) {
            this.f115652c.accept(this.f115651b.valueAt(size));
            this.f115651b.removeAt(size);
        }
        this.f115650a = this.f115651b.size() > 0 ? Math.min(this.f115650a, this.f115651b.size() - 1) : -1;
    }

    public final void b(int i10) {
        int i11 = 0;
        while (i11 < this.f115651b.size() - 1) {
            int i12 = i11 + 1;
            if (i10 < this.f115651b.keyAt(i12)) {
                return;
            }
            this.f115652c.accept(this.f115651b.valueAt(i11));
            this.f115651b.removeAt(i11);
            int i13 = this.f115650a;
            if (i13 > 0) {
                this.f115650a = i13 - 1;
            }
            i11 = i12;
        }
    }

    public final Object c(int i10) {
        if (this.f115650a == -1) {
            this.f115650a = 0;
        }
        while (true) {
            int i11 = this.f115650a;
            if (i11 <= 0 || i10 >= this.f115651b.keyAt(i11)) {
                break;
            }
            this.f115650a--;
        }
        while (this.f115650a < this.f115651b.size() - 1 && i10 >= this.f115651b.keyAt(this.f115650a + 1)) {
            this.f115650a++;
        }
        return this.f115651b.valueAt(this.f115650a);
    }
}
