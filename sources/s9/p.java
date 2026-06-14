package s9;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public final class p extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private RandomAccessFile f99880e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Uri f99881f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f99882g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f99883h;

    public static class a extends h {
        public a(Throwable th2, int i10) {
            super(th2, i10);
        }

        public a(String str, Throwable th2, int i10) {
            super(str, th2, i10);
        }
    }

    public p() {
        super(false);
    }

    private static RandomAccessFile g(Uri uri) throws a {
        try {
            return new RandomAccessFile((String) q9.a.e(uri.getPath()), "r");
        } catch (FileNotFoundException e10) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new a(e10, ((e10.getCause() instanceof ErrnoException) && ((ErrnoException) e10.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            throw new a(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e10, 1004);
        } catch (SecurityException e11) {
            throw new a(e11, 2006);
        } catch (RuntimeException e12) {
            throw new a(e12, 2000);
        }
    }

    @Override // s9.g
    public long b(k kVar) throws a {
        Uri uri = kVar.f99819a;
        this.f99881f = uri;
        e(kVar);
        RandomAccessFile randomAccessFileG = g(uri);
        this.f99880e = randomAccessFileG;
        try {
            randomAccessFileG.seek(kVar.f99825g);
            long length = kVar.f99826h;
            if (length == -1) {
                length = this.f99880e.length() - kVar.f99825g;
            }
            this.f99882g = length;
            if (length < 0) {
                throw new a(null, null, 2008);
            }
            this.f99883h = true;
            f(kVar);
            return this.f99882g;
        } catch (IOException e10) {
            throw new a(e10, 2000);
        }
    }

    @Override // s9.g
    public void close() {
        this.f99881f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f99880e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e10) {
                throw new a(e10, 2000);
            }
        } finally {
            this.f99880e = null;
            if (this.f99883h) {
                this.f99883h = false;
                d();
            }
        }
    }

    @Override // s9.g
    public Uri getUri() {
        return this.f99881f;
    }

    @Override // n9.h
    public int read(byte[] bArr, int i10, int i11) throws a {
        if (i11 == 0) {
            return 0;
        }
        if (this.f99882g == 0) {
            return -1;
        }
        try {
            int i12 = ((RandomAccessFile) o0.i(this.f99880e)).read(bArr, i10, (int) Math.min(this.f99882g, i11));
            if (i12 > 0) {
                this.f99882g -= (long) i12;
                c(i12);
            }
            return i12;
        } catch (IOException e10) {
            throw new a(e10, 2000);
        }
    }
}
