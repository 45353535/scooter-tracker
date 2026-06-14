package ab;

import com.google.common.base.Ascii;
import com.google.common.primitives.Ints;
import com.ironsource.C4240b4;
import com.ironsource.mediationsdk.logger.IronSourceError;
import n9.t;
import n9.u;
import n9.v;

/* JADX INFO: loaded from: classes12.dex */
public abstract class b implements v.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4184b;

    public b(String str, String str2) {
        this.f4183a = Ascii.toUpperCase(str);
        this.f4184b = str2;
    }

    @Override // n9.v.a
    public void a(t.b bVar) {
        String str = this.f4183a;
        str.getClass();
        switch (str) {
            case "TOTALTRACKS":
                Integer numTryParse = Ints.tryParse(this.f4184b);
                if (numTryParse != null) {
                    bVar.r0(numTryParse);
                    break;
                }
                break;
            case "TOTALDISCS":
                Integer numTryParse2 = Ints.tryParse(this.f4184b);
                if (numTryParse2 != null) {
                    bVar.q0(numTryParse2);
                    break;
                }
                break;
            case "TRACKNUMBER":
                Integer numTryParse3 = Ints.tryParse(this.f4184b);
                if (numTryParse3 != null) {
                    bVar.s0(numTryParse3);
                    break;
                }
                break;
            case "ALBUM":
                bVar.P(this.f4184b);
                break;
            case "GENRE":
                bVar.c0(this.f4184b);
                break;
            case "TITLE":
                bVar.p0(this.f4184b);
                break;
            case "DESCRIPTION":
                bVar.W(this.f4184b);
                break;
            case "DISCNUMBER":
                Integer numTryParse4 = Ints.tryParse(this.f4184b);
                if (numTryParse4 != null) {
                    bVar.X(numTryParse4);
                    break;
                }
                break;
            case "ALBUMARTIST":
                bVar.O(this.f4184b);
                break;
            case "ARTIST":
                bVar.Q(this.f4184b);
                break;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f4183a.equals(bVar.f4183a) && this.f4184b.equals(bVar.f4184b)) {
                return true;
            }
        }
        return false;
    }

    @Override // n9.v.a
    public /* synthetic */ byte[] getWrappedMetadataBytes() {
        return u.a(this);
    }

    @Override // n9.v.a
    public /* synthetic */ io.bidmachine.media3.common.a getWrappedMetadataFormat() {
        return u.b(this);
    }

    public int hashCode() {
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f4183a.hashCode()) * 31) + this.f4184b.hashCode();
    }

    public String toString() {
        return "VC: " + this.f4183a + C4240b4.j.f42668b + this.f4184b;
    }
}
