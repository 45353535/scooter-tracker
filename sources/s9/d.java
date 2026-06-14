package s9;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ContentResolver f99802e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Uri f99803f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private AssetFileDescriptor f99804g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private FileInputStream f99805h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f99806i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f99807j;

    public static class a extends h {
        public a(IOException iOException, int i10) {
            super(iOException, i10);
        }
    }

    public d(Context context) {
        super(false);
        this.f99802e = context.getContentResolver();
    }

    @Override // s9.g
    public long b(k kVar) throws a {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            Uri uriNormalizeScheme = kVar.f99819a.normalizeScheme();
            this.f99803f = uriNormalizeScheme;
            e(kVar);
            if ("content".equals(uriNormalizeScheme.getScheme())) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                assetFileDescriptorOpenAssetFileDescriptor = this.f99802e.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
            } else {
                assetFileDescriptorOpenAssetFileDescriptor = this.f99802e.openAssetFileDescriptor(uriNormalizeScheme, "r");
            }
            this.f99804g = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new a(new IOException("Could not open file descriptor for: " + uriNormalizeScheme), 2000);
            }
            long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
            this.f99805h = fileInputStream;
            if (length != -1 && kVar.f99825g > length) {
                throw new a(null, 2008);
            }
            long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
            long jSkip = fileInputStream.skip(kVar.f99825g + startOffset) - startOffset;
            if (jSkip != kVar.f99825g) {
                throw new a(null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.f99806i = -1L;
                } else {
                    long jPosition = size - channel.position();
                    this.f99806i = jPosition;
                    if (jPosition < 0) {
                        throw new a(null, 2008);
                    }
                }
            } else {
                long j10 = length - jSkip;
                this.f99806i = j10;
                if (j10 < 0) {
                    throw new a(null, 2008);
                }
            }
            long jMin = kVar.f99826h;
            if (jMin != -1) {
                long j11 = this.f99806i;
                if (j11 != -1) {
                    jMin = Math.min(j11, jMin);
                }
                this.f99806i = jMin;
            }
            this.f99807j = true;
            f(kVar);
            long j12 = kVar.f99826h;
            return j12 != -1 ? j12 : this.f99806i;
        } catch (a e10) {
            throw e10;
        } catch (IOException e11) {
            throw new a(e11, e11 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // s9.g
    public void close() {
        this.f99803f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f99805h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f99805h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f99804g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e10) {
                        throw new a(e10, 2000);
                    }
                } finally {
                    this.f99804g = null;
                    if (this.f99807j) {
                        this.f99807j = false;
                        d();
                    }
                }
            } catch (Throwable th2) {
                this.f99805h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f99804g;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f99804g = null;
                        if (this.f99807j) {
                            this.f99807j = false;
                            d();
                        }
                        throw th2;
                    } finally {
                        this.f99804g = null;
                        if (this.f99807j) {
                            this.f99807j = false;
                            d();
                        }
                    }
                } catch (IOException e11) {
                    throw new a(e11, 2000);
                }
            }
        } catch (IOException e12) {
            throw new a(e12, 2000);
        }
    }

    @Override // s9.g
    public Uri getUri() {
        return this.f99803f;
    }

    @Override // n9.h
    public int read(byte[] bArr, int i10, int i11) throws a {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f99806i;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new a(e10, 2000);
            }
        }
        int i12 = ((FileInputStream) o0.i(this.f99805h)).read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        long j11 = this.f99806i;
        if (j11 != -1) {
            this.f99806i = j11 - ((long) i12);
        }
        c(i12);
        return i12;
    }
}
