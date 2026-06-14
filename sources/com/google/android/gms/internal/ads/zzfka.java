package com.google.android.gms.internal.ads;

import android.util.Base64;
import androidx.annotation.VisibleForTesting;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfka {
    @VisibleForTesting
    public zzfka() {
        try {
            zzhbx.zza();
        } catch (GeneralSecurityException e10) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to Configure Aead. ".concat(e10.toString()));
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "CryptoUtils.registerAead");
        }
    }

    public static final String zza() {
        byte[] byteArray;
        try {
            zzhbk zzhbkVarZzf = zzhbk.zzf(zzhbc.zzb(zzhkc.zza().zzc("AES128_GCM")));
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                zzhav.zzb(zzhbkVarZzf, zzhau.zzb(byteArrayOutputStream));
                byteArray = byteArrayOutputStream.toByteArray();
            } catch (IOException unused) {
                throw new GeneralSecurityException("Serialize keyset failed");
            }
        } catch (GeneralSecurityException e10) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to generate key".concat(e10.toString()));
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "CryptoUtils.generateKey");
            byteArray = new byte[0];
        }
        return Base64.encodeToString(byteArray, 11);
    }

    public static final String zzb(byte[] bArr, byte[] bArr2, String str, zzdxt zzdxtVar) {
        zzhbk zzhbkVarZzc;
        if (str != null && (zzhbkVarZzc = zzc(str)) != null) {
            try {
                byte[] bArrZza = ((zzhas) zzhbkVarZzc.zzg(zzhif.zza(), zzhas.class)).zza(bArr, bArr2);
                zzdxtVar.zzc().put(ApsMetricsDataMap.APSMETRICS_FIELD_SCREENSIZE, "1");
                return new String(bArrZza, "UTF-8");
            } catch (UnsupportedEncodingException | UnsupportedOperationException | GeneralSecurityException e10) {
                com.google.android.gms.ads.internal.util.zze.zza("Failed to decrypt ".concat(e10.toString()));
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "CryptoUtils.decrypt");
                zzdxtVar.zzc().put("dsf", e10.toString());
            }
        }
        return null;
    }

    private static final zzhbk zzc(String str) {
        try {
            try {
                return zzhav.zza(zzhat.zza(Base64.decode(str, 11)));
            } catch (IOException unused) {
                throw new GeneralSecurityException("Parse keyset failed");
            }
        } catch (GeneralSecurityException e10) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to get keysethandle".concat(e10.toString()));
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "CryptoUtils.getHandle");
            return null;
        }
    }
}
