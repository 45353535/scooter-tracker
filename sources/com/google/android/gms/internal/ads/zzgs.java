package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.collection.SieveCacheKt;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes8.dex */
public final class zzgs extends zzgt {
    private final AssetManager zza;

    @Nullable
    private Uri zzb;

    @Nullable
    private InputStream zzc;
    private long zzd;
    private boolean zze;

    public zzgs(Context context) {
        super(false);
        this.zza = context.getAssets();
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i10, int i11) throws zzgr {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.zzd;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new zzgr(e10, 2000);
            }
        }
        InputStream inputStream = this.zzc;
        String str = zzfj.zza;
        int i12 = inputStream.read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        long j11 = this.zzd;
        if (j11 != -1) {
            this.zzd = j11 - ((long) i12);
        }
        zzh(i12);
        return i12;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final long zzb(zzhf zzhfVar) throws zzgr {
        try {
            Uri uri = zzhfVar.zza;
            this.zzb = uri;
            String path = uri.getPath();
            if (path == null) {
                throw null;
            }
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            zzf(zzhfVar);
            InputStream inputStreamOpen = this.zza.open(path, 1);
            this.zzc = inputStreamOpen;
            long j10 = zzhfVar.zze;
            if (inputStreamOpen.skip(j10) < j10) {
                throw new zzgr(null, 2008);
            }
            long j11 = zzhfVar.zzf;
            if (j11 != -1) {
                this.zzd = j11;
            } else {
                long jAvailable = this.zzc.available();
                this.zzd = jAvailable;
                if (jAvailable == SieveCacheKt.NodeLinkMask) {
                    this.zzd = -1L;
                }
            }
            this.zze = true;
            zzg(zzhfVar);
            return this.zzd;
        } catch (zzgr e10) {
            throw e10;
        } catch (IOException e11) {
            throw new zzgr(e11, true != (e11 instanceof FileNotFoundException) ? 2000 : 2005);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    @Nullable
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzd() throws zzgr {
        this.zzb = null;
        try {
            try {
                InputStream inputStream = this.zzc;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.zzc = null;
                if (this.zze) {
                    this.zze = false;
                    zzi();
                }
            } catch (IOException e10) {
                throw new zzgr(e10, 2000);
            }
        } catch (Throwable th2) {
            this.zzc = null;
            if (this.zze) {
                this.zze = false;
                zzi();
            }
            throw th2;
        }
    }
}
