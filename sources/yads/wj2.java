package yads;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class wj2 extends wn {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Resources f117494e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f117495f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Uri f117496g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AssetFileDescriptor f117497h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public FileInputStream f117498i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f117499j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f117500k;

    public wj2(Context context) {
        super(false);
        this.f117494e = context.getResources();
        this.f117495f = context.getPackageName();
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // yads.c30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(yads.h30 r17) throws yads.vj2 {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.wj2.a(yads.h30):long");
    }

    @Override // yads.y20
    public final int c(byte[] bArr, int i10, int i11) throws vj2 {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f117499j;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new vj2(null, e10, 2000);
            }
        }
        FileInputStream fileInputStream = this.f117498i;
        int i12 = w83.f117341a;
        int i13 = fileInputStream.read(bArr, i10, i11);
        if (i13 == -1) {
            if (this.f117499j == -1) {
                return -1;
            }
            throw new vj2("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j11 = this.f117499j;
        if (j11 != -1) {
            this.f117499j = j11 - ((long) i13);
        }
        c(i13);
        return i13;
    }

    @Override // yads.c30
    public final void close() {
        this.f117496g = null;
        try {
            try {
                FileInputStream fileInputStream = this.f117498i;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f117498i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f117497h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e10) {
                        throw new vj2(null, e10, 2000);
                    }
                } finally {
                    this.f117497h = null;
                    if (this.f117500k) {
                        this.f117500k = false;
                        g();
                    }
                }
            } catch (Throwable th2) {
                this.f117498i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f117497h;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f117497h = null;
                        if (this.f117500k) {
                            this.f117500k = false;
                            g();
                        }
                        throw th2;
                    } finally {
                        this.f117497h = null;
                        if (this.f117500k) {
                            this.f117500k = false;
                            g();
                        }
                    }
                } catch (IOException e11) {
                    throw new vj2(null, e11, 2000);
                }
            }
        } catch (IOException e12) {
            throw new vj2(null, e12, 2000);
        }
    }

    @Override // yads.c30
    public final Uri e() {
        return this.f117496g;
    }
}
