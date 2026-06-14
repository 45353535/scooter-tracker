package s9;

import android.net.Uri;
import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private k f99808e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[] f99809f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f99810g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f99811h;

    public e() {
        super(false);
    }

    @Override // s9.g
    public long b(k kVar) throws h, n9.x {
        e(kVar);
        this.f99808e = kVar;
        Uri uriNormalizeScheme = kVar.f99819a.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        q9.a.b("data".equals(scheme), "Unsupported scheme: " + scheme);
        String[] strArrJ1 = o0.j1(uriNormalizeScheme.getSchemeSpecificPart(), StringUtils.COMMA);
        if (strArrJ1.length != 2) {
            throw n9.x.b("Unexpected URI format: " + uriNormalizeScheme, null);
        }
        String str = strArrJ1[1];
        if (strArrJ1[0].contains(";base64")) {
            try {
                this.f99809f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e10) {
                throw n9.x.b("Error while parsing Base64 encoded string: " + str, e10);
            }
        } else {
            this.f99809f = o0.u0(URLDecoder.decode(str, StandardCharsets.US_ASCII.name()));
        }
        long j10 = kVar.f99825g;
        byte[] bArr = this.f99809f;
        if (j10 > bArr.length) {
            this.f99809f = null;
            throw new h(2008);
        }
        int i10 = (int) j10;
        this.f99810g = i10;
        int length = bArr.length - i10;
        this.f99811h = length;
        long j11 = kVar.f99826h;
        if (j11 != -1) {
            this.f99811h = (int) Math.min(length, j11);
        }
        f(kVar);
        long j12 = kVar.f99826h;
        return j12 != -1 ? j12 : this.f99811h;
    }

    @Override // s9.g
    public void close() {
        if (this.f99809f != null) {
            this.f99809f = null;
            d();
        }
        this.f99808e = null;
    }

    @Override // s9.g
    public Uri getUri() {
        k kVar = this.f99808e;
        if (kVar != null) {
            return kVar.f99819a;
        }
        return null;
    }

    @Override // n9.h
    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f99811h;
        if (i12 == 0) {
            return -1;
        }
        int iMin = Math.min(i11, i12);
        System.arraycopy(o0.i(this.f99809f), this.f99810g, bArr, i10, iMin);
        this.f99810g += iMin;
        this.f99811h -= iMin;
        c(iMin);
        return iMin;
    }
}
