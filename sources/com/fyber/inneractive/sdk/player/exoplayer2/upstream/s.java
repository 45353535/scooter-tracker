package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;
import android.os.SystemClock;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes7.dex */
public final class s implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f23083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RandomAccessFile f23084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f23085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f23086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f23087e;

    public s(m mVar) {
        this.f23083a = mVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final long a(k kVar) throws r {
        try {
            this.f23085c = kVar.f23036a;
            RandomAccessFile randomAccessFile = new RandomAccessFile(kVar.f23036a.getPath(), "r");
            this.f23084b = randomAccessFile;
            randomAccessFile.seek(kVar.f23038c);
            long length = kVar.f23039d;
            if (length == -1) {
                length = this.f23084b.length() - kVar.f23038c;
            }
            this.f23086d = length;
            if (length < 0) {
                throw new EOFException();
            }
            this.f23087e = true;
            m mVar = this.f23083a;
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
            return this.f23086d;
        } catch (IOException e10) {
            throw new r(e10);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final void close() {
        this.f23085c = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f23084b;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e10) {
                throw new r(e10);
            }
        } finally {
            this.f23084b = null;
            if (this.f23087e) {
                this.f23087e = false;
                m mVar = this.f23083a;
                if (mVar != null) {
                    mVar.a();
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final int read(byte[] bArr, int i10, int i11) throws r {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f23086d;
        if (j10 == 0) {
            return -1;
        }
        try {
            int i12 = this.f23084b.read(bArr, i10, (int) Math.min(j10, i11));
            if (i12 > 0) {
                long j11 = i12;
                this.f23086d -= j11;
                m mVar = this.f23083a;
                if (mVar != null) {
                    synchronized (mVar) {
                        mVar.f23050d += j11;
                    }
                    return i12;
                }
            }
            return i12;
        } catch (IOException e10) {
            throw new r(e10);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final Uri a() {
        return this.f23085c;
    }
}
