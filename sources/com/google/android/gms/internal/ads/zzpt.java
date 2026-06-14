package com.google.android.gms.internal.ads;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzpt extends AudioDeviceCallback {
    final /* synthetic */ zzpx zza;

    /* synthetic */ zzpt(zzpx zzpxVar, byte[] bArr) {
        Objects.requireNonNull(zzpxVar);
        this.zza = zzpxVar;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        zzpx zzpxVar = this.zza;
        zzpxVar.zzf(zzps.zza(zzpxVar.zzg(), zzpxVar.zzj(), zzpxVar.zzh()));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        String str = zzfj.zza;
        int length = audioDeviceInfoArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            zzpx zzpxVar = this.zza;
            if (Objects.equals(audioDeviceInfoArr[i10], zzpxVar.zzh())) {
                zzpxVar.zzi(null);
                break;
            }
            i10++;
        }
        zzpx zzpxVar2 = this.zza;
        zzpxVar2.zzf(zzps.zza(zzpxVar2.zzg(), zzpxVar2.zzj(), zzpxVar2.zzh()));
    }
}
