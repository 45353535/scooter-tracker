package s9;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class x implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f99901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f99902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Uri f99903c = Uri.EMPTY;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f99904d = Collections.EMPTY_MAP;

    public x(g gVar) {
        this.f99901a = (g) q9.a.e(gVar);
    }

    @Override // s9.g
    public void a(y yVar) {
        q9.a.e(yVar);
        this.f99901a.a(yVar);
    }

    @Override // s9.g
    public long b(k kVar) {
        this.f99903c = kVar.f99819a;
        this.f99904d = Collections.EMPTY_MAP;
        try {
            return this.f99901a.b(kVar);
        } finally {
            Uri uri = getUri();
            if (uri != null) {
                this.f99903c = uri;
            }
            this.f99904d = getResponseHeaders();
        }
    }

    public long c() {
        return this.f99902b;
    }

    @Override // s9.g
    public void close() {
        this.f99901a.close();
    }

    public Uri d() {
        return this.f99903c;
    }

    public Map e() {
        return this.f99904d;
    }

    public void f() {
        this.f99902b = 0L;
    }

    @Override // s9.g
    public Map getResponseHeaders() {
        return this.f99901a.getResponseHeaders();
    }

    @Override // s9.g
    public Uri getUri() {
        return this.f99901a.getUri();
    }

    @Override // n9.h
    public int read(byte[] bArr, int i10, int i11) {
        int i12 = this.f99901a.read(bArr, i10, i11);
        if (i12 != -1) {
            this.f99902b += (long) i12;
        }
        return i12;
    }
}
