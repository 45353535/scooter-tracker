package yads;

import android.net.Uri;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes4.dex */
public final class lj2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f113120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f113121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f113122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f113123d;

    public lj2(String str, long j10, long j11) {
        this.f113122c = str == null ? "" : str;
        this.f113120a = j10;
        this.f113121b = j11;
    }

    public final lj2 a(lj2 lj2Var, String str) {
        String strA = b83.a(str, this.f113122c);
        if (lj2Var == null || !strA.equals(b83.a(str, lj2Var.f113122c))) {
            return null;
        }
        long j10 = this.f113121b;
        if (j10 != -1) {
            long j11 = this.f113120a;
            if (j11 + j10 == lj2Var.f113120a) {
                long j12 = lj2Var.f113121b;
                return new lj2(strA, j11, j12 != -1 ? j10 + j12 : -1L);
            }
        }
        long j13 = lj2Var.f113121b;
        if (j13 == -1) {
            return null;
        }
        long j14 = lj2Var.f113120a;
        if (j14 + j13 == this.f113120a) {
            return new lj2(strA, j14, j10 != -1 ? j13 + j10 : -1L);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lj2.class == obj.getClass()) {
            lj2 lj2Var = (lj2) obj;
            if (this.f113120a == lj2Var.f113120a && this.f113121b == lj2Var.f113121b && this.f113122c.equals(lj2Var.f113122c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f113123d == 0) {
            this.f113123d = this.f113122c.hashCode() + ((((((int) this.f113120a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + ((int) this.f113121b)) * 31);
        }
        return this.f113123d;
    }

    public final String toString() {
        return "RangedUri(referenceUri=" + this.f113122c + ", start=" + this.f113120a + ", length=" + this.f113121b + ")";
    }

    public final Uri a(String str) {
        return Uri.parse(b83.a(str, this.f113122c));
    }
}
