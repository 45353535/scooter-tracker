package l0;

import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f93724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f93725b;

    public d(float[] fArr, int[] iArr) {
        this.f93724a = fArr;
        this.f93725b = iArr;
    }

    private void a(d dVar) {
        int i10 = 0;
        while (true) {
            int[] iArr = dVar.f93725b;
            if (i10 >= iArr.length) {
                return;
            }
            this.f93724a[i10] = dVar.f93724a[i10];
            this.f93725b[i10] = iArr[i10];
            i10++;
        }
    }

    private int c(float f10) {
        int iBinarySearch = Arrays.binarySearch(this.f93724a, f10);
        if (iBinarySearch >= 0) {
            return this.f93725b[iBinarySearch];
        }
        int i10 = -(iBinarySearch + 1);
        if (i10 == 0) {
            return this.f93725b[0];
        }
        int[] iArr = this.f93725b;
        if (i10 == iArr.length - 1) {
            return iArr[iArr.length - 1];
        }
        float[] fArr = this.f93724a;
        int i11 = i10 - 1;
        float f11 = fArr[i11];
        return q0.e.c((f10 - f11) / (fArr[i10] - f11), iArr[i11], iArr[i10]);
    }

    public d b(float[] fArr) {
        int[] iArr = new int[fArr.length];
        for (int i10 = 0; i10 < fArr.length; i10++) {
            iArr[i10] = c(fArr[i10]);
        }
        return new d(fArr, iArr);
    }

    public int[] d() {
        return this.f93725b;
    }

    public float[] e() {
        return this.f93724a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            d dVar = (d) obj;
            if (Arrays.equals(this.f93724a, dVar.f93724a) && Arrays.equals(this.f93725b, dVar.f93725b)) {
                return true;
            }
        }
        return false;
    }

    public int f() {
        return this.f93725b.length;
    }

    public void g(d dVar, d dVar2, float f10) {
        int[] iArr;
        if (dVar.equals(dVar2)) {
            a(dVar);
            return;
        }
        if (f10 <= 0.0f) {
            a(dVar);
            return;
        }
        if (f10 >= 1.0f) {
            a(dVar2);
            return;
        }
        if (dVar.f93725b.length != dVar2.f93725b.length) {
            throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + dVar.f93725b.length + " vs " + dVar2.f93725b.length + ")");
        }
        int i10 = 0;
        while (true) {
            iArr = dVar.f93725b;
            if (i10 >= iArr.length) {
                break;
            }
            this.f93724a[i10] = q0.l.i(dVar.f93724a[i10], dVar2.f93724a[i10], f10);
            this.f93725b[i10] = q0.e.c(f10, dVar.f93725b[i10], dVar2.f93725b[i10]);
            i10++;
        }
        int length = iArr.length;
        while (true) {
            float[] fArr = this.f93724a;
            if (length >= fArr.length) {
                return;
            }
            int[] iArr2 = dVar.f93725b;
            fArr[length] = fArr[iArr2.length - 1];
            int[] iArr3 = this.f93725b;
            iArr3[length] = iArr3[iArr2.length - 1];
            length++;
        }
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f93724a) * 31) + Arrays.hashCode(this.f93725b);
    }
}
