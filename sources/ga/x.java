package ga;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
final class x implements s9.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s9.g f72516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f72517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f72518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f72519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f72520e;

    public interface a {
        void a(q9.d0 d0Var);
    }

    public x(s9.g gVar, int i10, a aVar) {
        q9.a.a(i10 > 0);
        this.f72516a = gVar;
        this.f72517b = i10;
        this.f72518c = aVar;
        this.f72519d = new byte[1];
        this.f72520e = i10;
    }

    private boolean c() {
        if (this.f72516a.read(this.f72519d, 0, 1) == -1) {
            return false;
        }
        int i10 = (this.f72519d[0] & 255) << 4;
        if (i10 == 0) {
            return true;
        }
        byte[] bArr = new byte[i10];
        int i11 = i10;
        int i12 = 0;
        while (i11 > 0) {
            int i13 = this.f72516a.read(bArr, i12, i11);
            if (i13 == -1) {
                return false;
            }
            i12 += i13;
            i11 -= i13;
        }
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        if (i10 > 0) {
            this.f72518c.a(new q9.d0(bArr, i10));
        }
        return true;
    }

    @Override // s9.g
    public void a(s9.y yVar) {
        q9.a.e(yVar);
        this.f72516a.a(yVar);
    }

    @Override // s9.g
    public long b(s9.k kVar) {
        throw new UnsupportedOperationException();
    }

    @Override // s9.g
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // s9.g
    public Map getResponseHeaders() {
        return this.f72516a.getResponseHeaders();
    }

    @Override // s9.g
    public Uri getUri() {
        return this.f72516a.getUri();
    }

    @Override // n9.h
    public int read(byte[] bArr, int i10, int i11) {
        if (this.f72520e == 0) {
            if (!c()) {
                return -1;
            }
            this.f72520e = this.f72517b;
        }
        int i12 = this.f72516a.read(bArr, i10, Math.min(this.f72520e, i11));
        if (i12 != -1) {
            this.f72520e -= i12;
        }
        return i12;
    }
}
