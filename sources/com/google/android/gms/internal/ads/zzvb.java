package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
final class zzvb implements zzuz {
    private final int zza;

    @Nullable
    private MediaCodecInfo[] zzb;

    public zzvb(boolean z10, boolean z11, boolean z12) {
        int i10 = 1;
        if (!z10 && !z11 && !z12) {
            i10 = 0;
        }
        this.zza = i10;
    }

    private final void zzf() {
        if (this.zzb == null) {
            this.zzb = new MediaCodecList(this.zza).getCodecInfos();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final int zza() {
        zzf();
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final MediaCodecInfo zzb(int i10) {
        zzf();
        return this.zzb[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final boolean zzc() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final boolean zzd(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final boolean zze(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }
}
