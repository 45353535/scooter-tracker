package yads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes4.dex */
public final class bz extends wn {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ContentResolver f109148e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Uri f109149f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AssetFileDescriptor f109150g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public FileInputStream f109151h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f109152i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f109153j;

    public bz(Context context) {
        super(false);
        this.f109148e = context.getContentResolver();
    }

    @Override // yads.c30
    public final long a(h30 h30Var) throws az {
        int i10;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            try {
                Uri uri = h30Var.f111452a;
                this.f109149f = uri;
                h();
                if ("content".equals(h30Var.f111452a.getScheme())) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    assetFileDescriptorOpenAssetFileDescriptor = this.f109148e.openTypedAssetFileDescriptor(uri, "*/*", bundle);
                } else {
                    assetFileDescriptorOpenAssetFileDescriptor = this.f109148e.openAssetFileDescriptor(uri, "r");
                }
                this.f109150g = assetFileDescriptorOpenAssetFileDescriptor;
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    i10 = 2000;
                    try {
                        throw new az(new IOException("Could not open file descriptor for: " + uri), 2000);
                    } catch (IOException e10) {
                        e = e10;
                        throw new az(e, e instanceof FileNotFoundException ? 2005 : i10);
                    }
                }
                long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                this.f109151h = fileInputStream;
                if (length != -1 && h30Var.f111457f > length) {
                    throw new az(null, 2008);
                }
                long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                long jSkip = fileInputStream.skip(h30Var.f111457f + startOffset) - startOffset;
                if (jSkip != h30Var.f111457f) {
                    throw new az(null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.f109152i = -1L;
                    } else {
                        long jPosition = size - channel.position();
                        this.f109152i = jPosition;
                        if (jPosition < 0) {
                            throw new az(null, 2008);
                        }
                    }
                } else {
                    long j10 = length - jSkip;
                    this.f109152i = j10;
                    if (j10 < 0) {
                        throw new az(null, 2008);
                    }
                }
                long jMin = h30Var.f111458g;
                if (jMin != -1) {
                    long j11 = this.f109152i;
                    if (j11 != -1) {
                        jMin = Math.min(j11, jMin);
                    }
                    this.f109152i = jMin;
                }
                this.f109153j = true;
                b(h30Var);
                long j12 = h30Var.f111458g;
                return j12 != -1 ? j12 : this.f109152i;
            } catch (az e11) {
                throw e11;
            }
        } catch (IOException e12) {
            e = e12;
            i10 = 2000;
        }
    }

    @Override // yads.y20
    public final int c(byte[] bArr, int i10, int i11) throws az {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f109152i;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new az(e10, 2000);
            }
        }
        FileInputStream fileInputStream = this.f109151h;
        int i12 = w83.f117341a;
        int i13 = fileInputStream.read(bArr, i10, i11);
        if (i13 == -1) {
            return -1;
        }
        long j11 = this.f109152i;
        if (j11 != -1) {
            this.f109152i = j11 - ((long) i13);
        }
        c(i13);
        return i13;
    }

    @Override // yads.c30
    public final void close() {
        this.f109149f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f109151h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f109151h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f109150g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e10) {
                        throw new az(e10, 2000);
                    }
                } finally {
                    this.f109150g = null;
                    if (this.f109153j) {
                        this.f109153j = false;
                        g();
                    }
                }
            } catch (Throwable th2) {
                this.f109151h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f109150g;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f109150g = null;
                        if (this.f109153j) {
                            this.f109153j = false;
                            g();
                        }
                        throw th2;
                    } finally {
                        this.f109150g = null;
                        if (this.f109153j) {
                            this.f109153j = false;
                            g();
                        }
                    }
                } catch (IOException e11) {
                    throw new az(e11, 2000);
                }
            }
        } catch (IOException e12) {
            throw new az(e12, 2000);
        }
    }

    @Override // yads.c30
    public final Uri e() {
        return this.f109149f;
    }
}
