package yads;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class a63 implements oq {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final nq f108580g = new nq() { // from class: yads.w2
        @Override // yads.nq
        public final oq fromBundle(Bundle bundle) {
            return a63.a(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f108581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u43 f108582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f108583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f108584e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean[] f108585f;

    public a63(u43 u43Var, boolean z10, int[] iArr, boolean[] zArr) {
        int i10 = u43Var.f116494b;
        this.f108581b = i10;
        boolean z11 = false;
        fi.a(i10 == iArr.length && i10 == zArr.length);
        this.f108582c = u43Var;
        if (z10 && i10 > 1) {
            z11 = true;
        }
        this.f108583d = z11;
        this.f108584e = (int[]) iArr.clone();
        this.f108585f = (boolean[]) zArr.clone();
    }

    public final int a() {
        return this.f108582c.f116496d;
    }

    public final boolean b() {
        for (boolean z10 : this.f108585f) {
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a63.class == obj.getClass()) {
            a63 a63Var = (a63) obj;
            if (this.f108583d == a63Var.f108583d && this.f108582c.equals(a63Var.f108582c) && Arrays.equals(this.f108584e, a63Var.f108584e) && Arrays.equals(this.f108585f, a63Var.f108585f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f108585f) + ((Arrays.hashCode(this.f108584e) + (((this.f108582c.hashCode() * 31) + (this.f108583d ? 1 : 0)) * 31)) * 31);
    }

    public static a63 a(Bundle bundle) {
        nq nqVar = u43.f116493g;
        Bundle bundle2 = bundle.getBundle(Integer.toString(0, 36));
        bundle2.getClass();
        u43 u43Var = (u43) nqVar.fromBundle(bundle2);
        int[] intArray = bundle.getIntArray(Integer.toString(1, 36));
        int[] iArr = new int[u43Var.f116494b];
        if (intArray == null) {
            intArray = iArr;
        }
        boolean[] booleanArray = bundle.getBooleanArray(Integer.toString(3, 36));
        boolean[] zArr = new boolean[u43Var.f116494b];
        if (booleanArray == null) {
            booleanArray = zArr;
        }
        return new a63(u43Var, bundle.getBoolean(Integer.toString(4, 36), false), intArray, booleanArray);
    }
}
