package yads;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class c6 implements oq {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final nq f109252i = new nq() { // from class: yads.u4
        @Override // yads.nq
        public final oq fromBundle(Bundle bundle) {
            return c6.a(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f109253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f109254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Uri[] f109255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f109256e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f109257f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f109258g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f109259h;

    public c6(long j10, int i10, int[] iArr, Uri[] uriArr, long[] jArr, long j11, boolean z10) {
        fi.a(iArr.length == uriArr.length);
        this.f109253b = j10;
        this.f109254c = i10;
        this.f109256e = iArr;
        this.f109255d = uriArr;
        this.f109257f = jArr;
        this.f109258g = j11;
        this.f109259h = z10;
    }

    public static c6 a(Bundle bundle) {
        long j10 = bundle.getLong(Integer.toString(0, 36));
        int i10 = bundle.getInt(Integer.toString(1, 36), -1);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(2, 36));
        int[] intArray = bundle.getIntArray(Integer.toString(3, 36));
        long[] longArray = bundle.getLongArray(Integer.toString(4, 36));
        long j11 = bundle.getLong(Integer.toString(5, 36));
        boolean z10 = bundle.getBoolean(Integer.toString(6, 36));
        int[] iArr = intArray;
        if (iArr == null) {
            iArr = new int[0];
        }
        Uri[] uriArr = parcelableArrayList == null ? new Uri[0] : (Uri[]) parcelableArrayList.toArray(new Uri[0]);
        if (longArray == null) {
            longArray = new long[0];
        }
        return new c6(j10, i10, iArr, uriArr, longArray, j11, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c6.class == obj.getClass()) {
            c6 c6Var = (c6) obj;
            if (this.f109253b == c6Var.f109253b && this.f109254c == c6Var.f109254c && Arrays.equals(this.f109255d, c6Var.f109255d) && Arrays.equals(this.f109256e, c6Var.f109256e) && Arrays.equals(this.f109257f, c6Var.f109257f) && this.f109258g == c6Var.f109258g && this.f109259h == c6Var.f109259h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f109254c * 31;
        long j10 = this.f109253b;
        int iHashCode = (Arrays.hashCode(this.f109257f) + ((Arrays.hashCode(this.f109256e) + ((((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Arrays.hashCode(this.f109255d)) * 31)) * 31)) * 31;
        long j11 = this.f109258g;
        return ((iHashCode + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f109259h ? 1 : 0);
    }

    public final int a(int i10) {
        int i11;
        int i12 = i10 + 1;
        while (true) {
            int[] iArr = this.f109256e;
            if (i12 >= iArr.length || this.f109259h || (i11 = iArr[i12]) == 0 || i11 == 1) {
                break;
            }
            i12++;
        }
        return i12;
    }

    public final c6 a() {
        int[] iArr = this.f109256e;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = this.f109257f;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        return new c6(this.f109253b, 0, iArrCopyOf, (Uri[]) Arrays.copyOf(this.f109255d, 0), jArrCopyOf, this.f109258g, this.f109259h);
    }
}
