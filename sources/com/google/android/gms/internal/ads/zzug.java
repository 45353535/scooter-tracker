package com.google.android.gms.internal.ads;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
@RequiresApi(35)
public final class zzug {
    private final HashSet zza;

    @Nullable
    private LoudnessCodecController zzb;

    public zzug() {
        throw null;
    }

    public final void zza(int i10) {
        LoudnessCodecController loudnessCodecController = this.zzb;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.zzb = null;
        }
        LoudnessCodecController loudnessCodecControllerCreate = LoudnessCodecController.create(i10, zzhaf.zza(), new zzud(this));
        this.zzb = loudnessCodecControllerCreate;
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }

    public final void zzb(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.zzb;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            zzgrc.zzi(this.zza.add(mediaCodec));
        }
    }

    public final void zzc(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!this.zza.remove(mediaCodec) || (loudnessCodecController = this.zzb) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public final void zzd() {
        this.zza.clear();
        LoudnessCodecController loudnessCodecController = this.zzb;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public zzug(zzuf zzufVar) {
        this.zza = new HashSet();
    }
}
