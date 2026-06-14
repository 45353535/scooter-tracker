package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.SystemClock;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContentResolver f23022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f23023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f23024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AssetFileDescriptor f23025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public FileInputStream f23026e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f23027f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f23028g;

    public f(Context context, m mVar) {
        this.f23022a = context.getContentResolver();
        this.f23023b = mVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final long a(k kVar) throws e {
        try {
            Uri uri = kVar.f23036a;
            this.f23024c = uri;
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = this.f23022a.openAssetFileDescriptor(uri, "r");
            this.f23025d = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new FileNotFoundException("Could not open file descriptor for: " + this.f23024c);
            }
            this.f23026e = new FileInputStream(this.f23025d.getFileDescriptor());
            long startOffset = this.f23025d.getStartOffset();
            if (this.f23026e.skip(kVar.f23038c + startOffset) - startOffset != kVar.f23038c) {
                throw new EOFException();
            }
            long j10 = kVar.f23039d;
            if (j10 != -1) {
                this.f23027f = j10;
            } else {
                long length = this.f23025d.getLength();
                this.f23027f = length;
                if (length == -1) {
                    long jAvailable = this.f23026e.available();
                    this.f23027f = jAvailable;
                    if (jAvailable == 0) {
                        this.f23027f = -1L;
                    }
                }
            }
            this.f23028g = true;
            m mVar = this.f23023b;
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
            return this.f23027f;
        } catch (IOException e10) {
            throw new e(e10);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final void close() {
        this.f23024c = null;
        try {
            try {
                FileInputStream fileInputStream = this.f23026e;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f23026e = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f23025d;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e10) {
                        throw new e(e10);
                    }
                } finally {
                    this.f23025d = null;
                    if (this.f23028g) {
                        this.f23028g = false;
                        m mVar = this.f23023b;
                        if (mVar != null) {
                            mVar.a();
                        }
                    }
                }
            } catch (IOException e11) {
                throw new e(e11);
            }
        } catch (Throwable th2) {
            this.f23026e = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f23025d;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f23025d = null;
                    if (this.f23028g) {
                        this.f23028g = false;
                        m mVar2 = this.f23023b;
                        if (mVar2 != null) {
                            mVar2.a();
                        }
                    }
                    throw th2;
                } catch (IOException e12) {
                    throw new e(e12);
                }
            } finally {
                this.f23025d = null;
                if (this.f23028g) {
                    this.f23028g = false;
                    m mVar3 = this.f23023b;
                    if (mVar3 != null) {
                        mVar3.a();
                    }
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final int read(byte[] bArr, int i10, int i11) throws e {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f23027f;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new e(e10);
            }
        }
        int i12 = this.f23026e.read(bArr, i10, i11);
        if (i12 == -1) {
            if (this.f23027f == -1) {
                return -1;
            }
            throw new e(new EOFException());
        }
        long j11 = this.f23027f;
        if (j11 != -1) {
            this.f23027f = j11 - ((long) i12);
        }
        m mVar = this.f23023b;
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
        return this.f23024c;
    }
}
