package n9;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public final class f0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f95292f = o0.C0(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f95293g = o0.C0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f95294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f95295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f95296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.bidmachine.media3.common.a[] f95297d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f95298e;

    public f0(io.bidmachine.media3.common.a... aVarArr) {
        this("", aVarArr);
    }

    private static void c(String str, String str2, String str3, int i10) {
        q9.u.d("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i10 + ")"));
    }

    private static String d(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    private static int e(int i10) {
        return i10 | 16384;
    }

    private void f() {
        String strD = d(this.f95297d[0].f80550d);
        int iE = e(this.f95297d[0].f80552f);
        int i10 = 1;
        while (true) {
            io.bidmachine.media3.common.a[] aVarArr = this.f95297d;
            if (i10 >= aVarArr.length) {
                return;
            }
            if (!strD.equals(d(aVarArr[i10].f80550d))) {
                io.bidmachine.media3.common.a[] aVarArr2 = this.f95297d;
                c("languages", aVarArr2[0].f80550d, aVarArr2[i10].f80550d, i10);
                return;
            } else {
                if (iE != e(this.f95297d[i10].f80552f)) {
                    c("role flags", Integer.toBinaryString(this.f95297d[0].f80552f), Integer.toBinaryString(this.f95297d[i10].f80552f), i10);
                    return;
                }
                i10++;
            }
        }
    }

    public io.bidmachine.media3.common.a a(int i10) {
        return this.f95297d[i10];
    }

    public int b(io.bidmachine.media3.common.a aVar) {
        int i10 = 0;
        while (true) {
            io.bidmachine.media3.common.a[] aVarArr = this.f95297d;
            if (i10 >= aVarArr.length) {
                return -1;
            }
            if (aVar == aVarArr[i10]) {
                return i10;
            }
            i10++;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f0.class == obj.getClass()) {
            f0 f0Var = (f0) obj;
            if (this.f95295b.equals(f0Var.f95295b) && Arrays.equals(this.f95297d, f0Var.f95297d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f95298e == 0) {
            this.f95298e = ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f95295b.hashCode()) * 31) + Arrays.hashCode(this.f95297d);
        }
        return this.f95298e;
    }

    public String toString() {
        return this.f95295b + ": " + Arrays.toString(this.f95297d);
    }

    public f0(String str, io.bidmachine.media3.common.a... aVarArr) {
        q9.a.a(aVarArr.length > 0);
        this.f95295b = str;
        this.f95297d = aVarArr;
        this.f95294a = aVarArr.length;
        int iK = w.k(aVarArr[0].f80561o);
        this.f95296c = iK == -1 ? w.k(aVarArr[0].f80560n) : iK;
        f();
    }
}
