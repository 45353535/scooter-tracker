package yads;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.collection.SieveCacheKt;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class ri extends wn {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AssetManager f115453e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Uri f115454f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InputStream f115455g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f115456h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f115457i;

    public ri(Context context) {
        super(false);
        this.f115453e = context.getAssets();
    }

    @Override // yads.c30
    public final long a(h30 h30Var) throws qi {
        try {
            Uri uri = h30Var.f111452a;
            this.f115454f = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            h();
            InputStream inputStreamOpen = this.f115453e.open(path, 1);
            this.f115455g = inputStreamOpen;
            if (inputStreamOpen.skip(h30Var.f111457f) < h30Var.f111457f) {
                throw new qi(null, 2008);
            }
            long j10 = h30Var.f111458g;
            if (j10 != -1) {
                this.f115456h = j10;
            } else {
                long jAvailable = this.f115455g.available();
                this.f115456h = jAvailable;
                if (jAvailable == SieveCacheKt.NodeLinkMask) {
                    this.f115456h = -1L;
                }
            }
            this.f115457i = true;
            b(h30Var);
            return this.f115456h;
        } catch (qi e10) {
            throw e10;
        } catch (IOException e11) {
            throw new qi(e11, e11 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // yads.y20
    public final int c(byte[] bArr, int i10, int i11) throws qi {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f115456h;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new qi(e10, 2000);
            }
        }
        InputStream inputStream = this.f115455g;
        int i12 = w83.f117341a;
        int i13 = inputStream.read(bArr, i10, i11);
        if (i13 == -1) {
            return -1;
        }
        long j11 = this.f115456h;
        if (j11 != -1) {
            this.f115456h = j11 - ((long) i13);
        }
        c(i13);
        return i13;
    }

    @Override // yads.c30
    public final void close() {
        this.f115454f = null;
        try {
            try {
                InputStream inputStream = this.f115455g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e10) {
                throw new qi(e10, 2000);
            }
        } finally {
            this.f115455g = null;
            if (this.f115457i) {
                this.f115457i = false;
                g();
            }
        }
    }

    @Override // yads.c30
    public final Uri e() {
        return this.f115454f;
    }
}
