package ab;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import n9.t;
import n9.u;
import n9.v;
import n9.w;
import q9.d0;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements v.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4179e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f4180f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f4181g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f4182h;

    public a(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f4175a = i10;
        this.f4176b = str;
        this.f4177c = str2;
        this.f4178d = i11;
        this.f4179e = i12;
        this.f4180f = i13;
        this.f4181g = i14;
        this.f4182h = bArr;
    }

    public static a b(d0 d0Var) {
        int iQ = d0Var.q();
        String strU = w.u(d0Var.F(d0Var.q(), StandardCharsets.US_ASCII));
        String strE = d0Var.E(d0Var.q());
        int iQ2 = d0Var.q();
        int iQ3 = d0Var.q();
        int iQ4 = d0Var.q();
        int iQ5 = d0Var.q();
        int iQ6 = d0Var.q();
        byte[] bArr = new byte[iQ6];
        d0Var.l(bArr, 0, iQ6);
        return new a(iQ, strU, strE, iQ2, iQ3, iQ4, iQ5, bArr);
    }

    @Override // n9.v.a
    public void a(t.b bVar) {
        bVar.K(this.f4182h, this.f4175a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f4175a == aVar.f4175a && this.f4176b.equals(aVar.f4176b) && this.f4177c.equals(aVar.f4177c) && this.f4178d == aVar.f4178d && this.f4179e == aVar.f4179e && this.f4180f == aVar.f4180f && this.f4181g == aVar.f4181g && Arrays.equals(this.f4182h, aVar.f4182h)) {
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
        return ((((((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f4175a) * 31) + this.f4176b.hashCode()) * 31) + this.f4177c.hashCode()) * 31) + this.f4178d) * 31) + this.f4179e) * 31) + this.f4180f) * 31) + this.f4181g) * 31) + Arrays.hashCode(this.f4182h);
    }

    public String toString() {
        return "Picture: mimeType=" + this.f4176b + ", description=" + this.f4177c;
    }
}
