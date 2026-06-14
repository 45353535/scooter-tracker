package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.SystemClock;
import androidx.collection.SieveCacheKt;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AssetManager f23008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f23009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f23010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InputStream f23011d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f23012e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f23013f;

    public d(Context context, m mVar) {
        this.f23008a = context.getAssets();
        this.f23009b = mVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final long a(k kVar) throws c {
        try {
            Uri uri = kVar.f23036a;
            this.f23010c = uri;
            String path = uri.getPath();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            InputStream inputStreamOpen = this.f23008a.open(path, 1);
            this.f23011d = inputStreamOpen;
            if (inputStreamOpen.skip(kVar.f23038c) < kVar.f23038c) {
                throw new EOFException();
            }
            long j10 = kVar.f23039d;
            if (j10 != -1) {
                this.f23012e = j10;
            } else {
                long jAvailable = this.f23011d.available();
                this.f23012e = jAvailable;
                if (jAvailable == SieveCacheKt.NodeLinkMask) {
                    this.f23012e = -1L;
                }
            }
            this.f23013f = true;
            m mVar = this.f23009b;
            if (mVar != null) {
                synchronized (mVar) {
                    try {
                        if (mVar.f23048b == 0) {
                            mVar.f23049c = SystemClock.elapsedRealtime();
                        }
                        mVar.f23048b++;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return this.f23012e;
        } catch (IOException e10) {
            throw new c(e10);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final void close() {
        this.f23010c = null;
        try {
            try {
                InputStream inputStream = this.f23011d;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e10) {
                throw new c(e10);
            }
        } finally {
            this.f23011d = null;
            if (this.f23013f) {
                this.f23013f = false;
                m mVar = this.f23009b;
                if (mVar != null) {
                    mVar.a();
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final int read(byte[] bArr, int i10, int i11) throws c {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f23012e;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new c(e10);
            }
        }
        int i12 = this.f23011d.read(bArr, i10, i11);
        if (i12 == -1) {
            if (this.f23012e == -1) {
                return -1;
            }
            throw new c(new EOFException());
        }
        long j11 = this.f23012e;
        if (j11 != -1) {
            this.f23012e = j11 - ((long) i12);
        }
        m mVar = this.f23009b;
        if (mVar == null) {
            return i12;
        }
        synchronized (mVar) {
            mVar.f23050d += (long) i12;
        }
        return i12;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final Uri a() {
        return this.f23010c;
    }
}
