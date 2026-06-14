package yads;

import android.net.Uri;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes4.dex */
public final class nt0 extends wn {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RandomAccessFile f114022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Uri f114023f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f114024g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f114025h;

    public nt0() {
        super(false);
    }

    @Override // yads.c30
    public final long a(h30 h30Var) throws mt0 {
        Uri uri = h30Var.f111452a;
        this.f114023f = uri;
        h();
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f114022e = randomAccessFile;
            try {
                randomAccessFile.seek(h30Var.f111457f);
                long length = h30Var.f111458g;
                if (length == -1) {
                    length = this.f114022e.length() - h30Var.f111457f;
                }
                this.f114024g = length;
                if (length < 0) {
                    throw new mt0(null, null, 2008);
                }
                this.f114025h = true;
                b(h30Var);
                return this.f114024g;
            } catch (IOException e10) {
                throw new mt0(e10, 2000);
            }
        } catch (FileNotFoundException e11) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new mt0(e11, (w83.f117341a < 21 || !kt0.a(e11.getCause())) ? 2005 : 2006);
            }
            throw new mt0("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=" + uri.getPath() + ",query=" + uri.getQuery() + ",fragment=" + uri.getFragment(), e11, 1004);
        } catch (SecurityException e12) {
            throw new mt0(e12, 2006);
        } catch (RuntimeException e13) {
            throw new mt0(e13, 2000);
        }
    }

    @Override // yads.y20
    public final int c(byte[] bArr, int i10, int i11) throws mt0 {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f114024g;
        if (j10 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f114022e;
            int i12 = w83.f117341a;
            int i13 = randomAccessFile.read(bArr, i10, (int) Math.min(j10, i11));
            if (i13 > 0) {
                this.f114024g -= (long) i13;
                c(i13);
            }
            return i13;
        } catch (IOException e10) {
            throw new mt0(e10, 2000);
        }
    }

    @Override // yads.c30
    public final void close() {
        this.f114023f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f114022e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e10) {
                throw new mt0(e10, 2000);
            }
        } finally {
            this.f114022e = null;
            if (this.f114025h) {
                this.f114025h = false;
                g();
            }
        }
    }

    @Override // yads.c30
    public final Uri e() {
        return this.f114023f;
    }
}
