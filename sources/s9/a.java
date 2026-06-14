package s9;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.collection.SieveCacheKt;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AssetManager f99793e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Uri f99794f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private InputStream f99795g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f99796h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f99797i;

    /* JADX INFO: renamed from: s9.a$a, reason: collision with other inner class name */
    public static final class C1192a extends h {
        public C1192a(Throwable th2, int i10) {
            super(th2, i10);
        }
    }

    public a(Context context) {
        super(false);
        this.f99793e = context.getAssets();
    }

    @Override // s9.g
    public long b(k kVar) throws C1192a {
        try {
            Uri uri = kVar.f99819a;
            this.f99794f = uri;
            String strSubstring = (String) q9.a.e(uri.getPath());
            if (strSubstring.startsWith("/android_asset/")) {
                strSubstring = strSubstring.substring(15);
            } else if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            e(kVar);
            InputStream inputStreamOpen = this.f99793e.open(strSubstring, 1);
            this.f99795g = inputStreamOpen;
            if (inputStreamOpen.skip(kVar.f99825g) < kVar.f99825g) {
                throw new C1192a(null, 2008);
            }
            long j10 = kVar.f99826h;
            if (j10 != -1) {
                this.f99796h = j10;
            } else {
                long jAvailable = this.f99795g.available();
                this.f99796h = jAvailable;
                if (jAvailable == SieveCacheKt.NodeLinkMask) {
                    this.f99796h = -1L;
                }
            }
            this.f99797i = true;
            f(kVar);
            return this.f99796h;
        } catch (C1192a e10) {
            throw e10;
        } catch (IOException e11) {
            throw new C1192a(e11, e11 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // s9.g
    public void close() {
        this.f99794f = null;
        try {
            try {
                InputStream inputStream = this.f99795g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e10) {
                throw new C1192a(e10, 2000);
            }
        } finally {
            this.f99795g = null;
            if (this.f99797i) {
                this.f99797i = false;
                d();
            }
        }
    }

    @Override // s9.g
    public Uri getUri() {
        return this.f99794f;
    }

    @Override // n9.h
    public int read(byte[] bArr, int i10, int i11) throws C1192a {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f99796h;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new C1192a(e10, 2000);
            }
        }
        int i12 = ((InputStream) o0.i(this.f99795g)).read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        long j11 = this.f99796h;
        if (j11 != -1) {
            this.f99796h = j11 - ((long) i12);
        }
        c(i12);
        return i12;
    }
}
