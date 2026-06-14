package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes8.dex */
public final class zzgz extends zzgt {

    @Nullable
    private zzhf zza;

    @Nullable
    private byte[] zzb;
    private int zzc;
    private int zzd;

    public zzgz() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.zzd;
        if (i12 == 0) {
            return -1;
        }
        int iMin = Math.min(i11, i12);
        byte[] bArr2 = this.zzb;
        String str = zzfj.zza;
        System.arraycopy(bArr2, this.zzc, bArr, i10, iMin);
        this.zzc += iMin;
        this.zzd -= iMin;
        zzh(iMin);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final long zzb(zzhf zzhfVar) throws IOException {
        zzf(zzhfVar);
        this.zza = zzhfVar;
        Uri uriNormalizeScheme = zzhfVar.zza.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        zzgrc.zzf("data".equals(scheme), "Unsupported scheme: %s", scheme);
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        String str = zzfj.zza;
        String[] strArrSplit = schemeSpecificPart.split(StringUtils.COMMA, -1);
        if (strArrSplit.length != 2) {
            throw zzat.zza("Unexpected URI format: ".concat(String.valueOf(uriNormalizeScheme)), null);
        }
        String str2 = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.zzb = Base64.decode(str2, 0);
            } catch (IllegalArgumentException e10) {
                throw zzat.zza("Error while parsing Base64 encoded string: ".concat(String.valueOf(str2)), e10);
            }
        } else {
            this.zzb = URLDecoder.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        long j10 = zzhfVar.zze;
        int length = this.zzb.length;
        if (j10 > length) {
            this.zzb = null;
            throw new zzhc(2008);
        }
        int i10 = (int) j10;
        this.zzc = i10;
        int i11 = length - i10;
        this.zzd = i11;
        long j11 = zzhfVar.zzf;
        if (j11 != -1) {
            this.zzd = (int) Math.min(i11, j11);
        }
        zzg(zzhfVar);
        return j11 != -1 ? j11 : this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    @Nullable
    public final Uri zzc() {
        zzhf zzhfVar = this.zza;
        if (zzhfVar != null) {
            return zzhfVar.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzd() {
        if (this.zzb != null) {
            this.zzb = null;
            zzi();
        }
        this.zza = null;
    }
}
