package y9;

import android.net.Uri;
import com.ironsource.mediationsdk.logger.IronSourceError;
import q9.l0;

/* JADX INFO: loaded from: classes12.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f108451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f108452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f108453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f108454d;

    public i(String str, long j10, long j11) {
        this.f108453c = str == null ? "" : str;
        this.f108451a = j10;
        this.f108452b = j11;
    }

    public i a(i iVar, String str) {
        String strC = c(str);
        i iVar2 = null;
        if (iVar != null && strC.equals(iVar.c(str))) {
            long j10 = this.f108452b;
            if (j10 != -1) {
                long j11 = this.f108451a;
                if (j11 + j10 == iVar.f108451a) {
                    long j12 = iVar.f108452b;
                    return new i(strC, j11, j12 != -1 ? j10 + j12 : -1L);
                }
            }
            long j13 = iVar.f108452b;
            if (j13 != -1) {
                long j14 = iVar.f108451a;
                if (j14 + j13 == this.f108451a) {
                    iVar2 = new i(strC, j14, j10 != -1 ? j13 + j10 : -1L);
                }
            }
        }
        return iVar2;
    }

    public Uri b(String str) {
        return l0.f(str, this.f108453c);
    }

    public String c(String str) {
        return l0.e(str, this.f108453c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f108451a == iVar.f108451a && this.f108452b == iVar.f108452b && this.f108453c.equals(iVar.f108453c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f108454d == 0) {
            this.f108454d = ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + ((int) this.f108451a)) * 31) + ((int) this.f108452b)) * 31) + this.f108453c.hashCode();
        }
        return this.f108454d;
    }

    public String toString() {
        return "RangedUri(referenceUri=" + this.f108453c + ", start=" + this.f108451a + ", length=" + this.f108452b + ")";
    }
}
