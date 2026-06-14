package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.Nullable;
import j$.util.Objects;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes8.dex */
public final class zzgy extends zzgt {
    private final ContentResolver zza;

    @Nullable
    private Uri zzb;

    @Nullable
    private AssetFileDescriptor zzc;

    @Nullable
    private FileInputStream zzd;
    private long zze;
    private boolean zzf;

    public zzgy(Context context) {
        super(false);
        this.zza = context.getContentResolver();
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i10, int i11) throws zzgx {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.zze;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new zzgx(e10, 2000);
            }
        }
        FileInputStream fileInputStream = this.zzd;
        String str = zzfj.zza;
        int i12 = fileInputStream.read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        long j11 = this.zze;
        if (j11 != -1) {
            this.zze = j11 - ((long) i12);
        }
        zzh(i12);
        return i12;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final long zzb(zzhf zzhfVar) throws zzgx {
        int i10;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        long jPosition;
        try {
            try {
                Uri uriNormalizeScheme = zzhfVar.zza.normalizeScheme();
                this.zzb = uriNormalizeScheme;
                zzf(zzhfVar);
                if (Objects.equals(uriNormalizeScheme.getScheme(), "content")) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    assetFileDescriptorOpenAssetFileDescriptor = this.zza.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
                } else {
                    assetFileDescriptorOpenAssetFileDescriptor = this.zza.openAssetFileDescriptor(uriNormalizeScheme, "r");
                }
                this.zzc = assetFileDescriptorOpenAssetFileDescriptor;
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    String strValueOf = String.valueOf(uriNormalizeScheme);
                    StringBuilder sb2 = new StringBuilder(strValueOf.length() + 36);
                    sb2.append("Could not open file descriptor for: ");
                    sb2.append(strValueOf);
                    IOException iOException = new IOException(sb2.toString());
                    i10 = 2000;
                    try {
                        throw new zzgx(iOException, 2000);
                    } catch (IOException e10) {
                        e = e10;
                        throw new zzgx(e, true != (e instanceof FileNotFoundException) ? i10 : 2005);
                    }
                }
                long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                this.zzd = fileInputStream;
                if (length != -1 && zzhfVar.zze > length) {
                    throw new zzgx(null, 2008);
                }
                long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                long j10 = zzhfVar.zze;
                long jSkip = fileInputStream.skip(startOffset + j10) - startOffset;
                if (jSkip != j10) {
                    throw new zzgx(null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.zze = -1L;
                        jPosition = -1;
                    } else {
                        jPosition = size - channel.position();
                        this.zze = jPosition;
                        if (jPosition < 0) {
                            throw new zzgx(null, 2008);
                        }
                    }
                } else {
                    long j11 = length - jSkip;
                    this.zze = j11;
                    if (j11 < 0) {
                        throw new zzgx(null, 2008);
                    }
                    jPosition = j11;
                }
                long j12 = zzhfVar.zzf;
                if (j12 != -1) {
                    this.zze = jPosition == -1 ? j12 : Math.min(jPosition, j12);
                }
                this.zzf = true;
                zzg(zzhfVar);
                return j12 != -1 ? j12 : this.zze;
            } catch (zzgx e11) {
                throw e11;
            }
        } catch (IOException e12) {
            e = e12;
            i10 = 2000;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    @Nullable
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzd() throws zzgx {
        this.zzb = null;
        try {
            try {
                try {
                    FileInputStream fileInputStream = this.zzd;
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    this.zzd = null;
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.zzc;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                        this.zzc = null;
                        if (this.zzf) {
                            this.zzf = false;
                            zzi();
                        }
                    } catch (IOException e10) {
                        throw new zzgx(e10, 2000);
                    }
                } catch (Throwable th2) {
                    this.zzd = null;
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.zzc;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.zzc = null;
                        if (this.zzf) {
                            this.zzf = false;
                            zzi();
                        }
                        throw th2;
                    } catch (IOException e11) {
                        throw new zzgx(e11, 2000);
                    }
                }
            } catch (Throwable th3) {
                this.zzc = null;
                if (this.zzf) {
                    this.zzf = false;
                    zzi();
                }
                throw th3;
            }
        } catch (IOException e12) {
            throw new zzgx(e12, 2000);
        }
    }
}
