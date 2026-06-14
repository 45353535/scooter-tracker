package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class zzuq extends Exception {

    @Nullable
    public final String zza;
    public final boolean zzb;

    @Nullable
    public final zzun zzc;

    @Nullable
    public final String zzd;

    public zzuq(zzv zzvVar, @Nullable Throwable th2, boolean z10, int i10) {
        String string = zzvVar.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 25 + string.length());
        sb2.append("Decoder init failed: [");
        sb2.append(i10);
        sb2.append("], ");
        sb2.append(string);
        String string2 = sb2.toString();
        String str = zzvVar.zzo;
        int iAbs = Math.abs(i10);
        StringBuilder sb3 = new StringBuilder(String.valueOf(iAbs).length() + 60);
        sb3.append("androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_");
        sb3.append(iAbs);
        this(string2, th2, str, false, null, sb3.toString(), null);
    }

    final /* synthetic */ zzuq zza(zzuq zzuqVar) {
        return new zzuq(getMessage(), getCause(), this.zza, false, this.zzc, this.zzd, zzuqVar);
    }

    public zzuq(zzv zzvVar, @Nullable Throwable th2, boolean z10, zzun zzunVar) {
        String str = zzunVar.zza;
        int length = str.length();
        String string = zzvVar.toString();
        StringBuilder sb2 = new StringBuilder(length + 23 + string.length());
        sb2.append("Decoder init failed: ");
        sb2.append(str);
        sb2.append(", ");
        sb2.append(string);
        this(sb2.toString(), th2, zzvVar.zzo, false, zzunVar, th2 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th2).getDiagnosticInfo() : null, null);
    }

    private zzuq(@Nullable String str, @Nullable Throwable th2, @Nullable String str2, boolean z10, @Nullable zzun zzunVar, @Nullable String str3, @Nullable zzuq zzuqVar) {
        super(str, th2);
        this.zza = str2;
        this.zzb = false;
        this.zzc = zzunVar;
        this.zzd = str3;
    }
}
