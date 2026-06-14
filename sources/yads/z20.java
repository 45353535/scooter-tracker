package yads;

import android.net.Uri;
import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.URLDecoder;

/* JADX INFO: loaded from: classes4.dex */
public final class z20 extends wn {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h30 f118515e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f118516f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f118517g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f118518h;

    public z20() {
        super(false);
    }

    @Override // yads.c30
    public final long a(h30 h30Var) throws d30, ba2 {
        h();
        this.f118515e = h30Var;
        Uri uri = h30Var.f111452a;
        String scheme = uri.getScheme();
        fi.a("Unsupported scheme: " + scheme, "data".equals(scheme));
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        int i10 = w83.f117341a;
        String[] strArrSplit = schemeSpecificPart.split(StringUtils.COMMA, -1);
        if (strArrSplit.length != 2) {
            throw new ba2("Unexpected URI format: " + uri, null, true, 0);
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f118516f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e10) {
                throw new ba2("Error while parsing Base64 encoded string: " + str, e10, true, 0);
            }
        } else {
            this.f118516f = w83.c(URLDecoder.decode(str, st.f115923a.name()));
        }
        long j10 = h30Var.f111457f;
        byte[] bArr = this.f118516f;
        if (j10 > bArr.length) {
            this.f118516f = null;
            throw new d30(2008);
        }
        int i11 = (int) j10;
        this.f118517g = i11;
        int length = bArr.length - i11;
        this.f118518h = length;
        long j11 = h30Var.f111458g;
        if (j11 != -1) {
            this.f118518h = (int) Math.min(length, j11);
        }
        b(h30Var);
        long j12 = h30Var.f111458g;
        return j12 != -1 ? j12 : this.f118518h;
    }

    @Override // yads.y20
    public final int c(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f118518h;
        if (i12 == 0) {
            return -1;
        }
        int iMin = Math.min(i11, i12);
        byte[] bArr2 = this.f118516f;
        int i13 = w83.f117341a;
        System.arraycopy(bArr2, this.f118517g, bArr, i10, iMin);
        this.f118517g += iMin;
        this.f118518h -= iMin;
        c(iMin);
        return iMin;
    }

    @Override // yads.c30
    public final void close() {
        if (this.f118516f != null) {
            this.f118516f = null;
            g();
        }
        this.f118515e = null;
    }

    @Override // yads.c30
    public final Uri e() {
        h30 h30Var = this.f118515e;
        if (h30Var != null) {
            return h30Var.f111452a;
        }
        return null;
    }
}
