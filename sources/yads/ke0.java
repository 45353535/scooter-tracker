package yads;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class ke0 implements oq {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final nq f112690e = new nq() { // from class: yads.hc
        @Override // yads.nq
        public final oq fromBundle(Bundle bundle) {
            return ke0.a(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f112691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f112692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f112693d;

    public ke0(int i10, int i11, int[] iArr) {
        this.f112691b = i10;
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        this.f112692c = iArrCopyOf;
        this.f112693d = i11;
        Arrays.sort(iArrCopyOf);
    }

    public static ke0 a(Bundle bundle) {
        int i10 = bundle.getInt(Integer.toString(0, 36), -1);
        int[] intArray = bundle.getIntArray(Integer.toString(1, 36));
        int i11 = bundle.getInt(Integer.toString(2, 36), -1);
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException();
        }
        intArray.getClass();
        return new ke0(i10, i11, intArray);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ke0.class == obj.getClass()) {
            ke0 ke0Var = (ke0) obj;
            if (this.f112691b == ke0Var.f112691b && Arrays.equals(this.f112692c, ke0Var.f112692c) && this.f112693d == ke0Var.f112693d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.f112692c) + (this.f112691b * 31)) * 31) + this.f112693d;
    }
}
