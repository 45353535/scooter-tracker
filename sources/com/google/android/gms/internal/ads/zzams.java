package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import androidx.work.WorkInfo;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
final class zzams {
    private final zzer zza = new zzer();
    private final int[] zzb = new int[256];
    private boolean zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    @Nullable
    public final zzcx zza() {
        int i10;
        if (this.zzd == 0 || this.zze == 0 || this.zzh == 0 || this.zzi == 0) {
            return null;
        }
        zzer zzerVar = this.zza;
        if (zzerVar.zze() == 0 || zzerVar.zzg() != zzerVar.zze() || !this.zzc) {
            return null;
        }
        zzerVar.zzh(0);
        int i11 = this.zzh * this.zzi;
        int[] iArr = new int[i11];
        int i12 = 0;
        while (i12 < i11) {
            int iZzs = zzerVar.zzs();
            if (iZzs != 0) {
                i10 = i12 + 1;
                iArr[i12] = this.zzb[iZzs];
            } else {
                int iZzs2 = zzerVar.zzs();
                if (iZzs2 != 0) {
                    int iZzs3 = iZzs2 & 63;
                    if ((iZzs2 & 64) != 0) {
                        iZzs3 = (iZzs3 << 8) | zzerVar.zzs();
                    }
                    i10 = iZzs3 + i12;
                    Arrays.fill(iArr, i12, i10, (iZzs2 & 128) == 0 ? this.zzb[0] : this.zzb[zzerVar.zzs()]);
                }
            }
            i12 = i10;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, this.zzh, this.zzi, Bitmap.Config.ARGB_8888);
        zzcw zzcwVar = new zzcw();
        zzcwVar.zzc(bitmapCreateBitmap);
        zzcwVar.zzi(this.zzf / this.zzd);
        zzcwVar.zzj(0);
        zzcwVar.zzf(this.zzg / this.zze, 0);
        zzcwVar.zzg(0);
        zzcwVar.zzm(this.zzh / this.zzd);
        zzcwVar.zzn(this.zzi / this.zze);
        return zzcwVar.zzr();
    }

    public final void zzb() {
        this.zzd = 0;
        this.zze = 0;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = 0;
        this.zza.zza(0);
        this.zzc = false;
    }

    final /* synthetic */ void zzc(zzer zzerVar, int i10) {
        if (i10 % 5 != 2) {
            return;
        }
        zzer zzerVar2 = zzerVar;
        zzerVar2.zzk(2);
        int[] iArr = this.zzb;
        Arrays.fill(iArr, 0);
        int i11 = i10 / 5;
        int i12 = 0;
        while (i12 < i11) {
            int iZzs = zzerVar2.zzs();
            int iZzs2 = zzerVar2.zzs();
            int iZzs3 = zzerVar2.zzs();
            int iZzs4 = zzerVar2.zzs();
            int iZzs5 = zzerVar2.zzs();
            double d10 = iZzs2;
            int i13 = iZzs3 + WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
            int i14 = iZzs4 + WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
            int i15 = iZzs5 << 24;
            String str = zzfj.zza;
            double d11 = i13;
            double d12 = i14;
            iArr[iZzs] = (Math.max(0, Math.min((int) (d10 + (1.402d * d11)), 255)) << 16) | i15 | (Math.max(0, Math.min((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 255)) << 8) | Math.max(0, Math.min((int) (d10 + (d12 * 1.772d)), 255));
            i12++;
            zzerVar2 = zzerVar;
        }
        this.zzc = true;
    }

    final /* synthetic */ void zzd(zzer zzerVar, int i10) {
        int iZzx;
        if (i10 < 4) {
            return;
        }
        zzerVar.zzk(3);
        int i11 = i10 - 4;
        if ((zzerVar.zzs() & 128) != 0) {
            if (i11 < 7 || (iZzx = zzerVar.zzx()) < 4) {
                return;
            }
            this.zzh = zzerVar.zzt();
            this.zzi = zzerVar.zzt();
            this.zza.zza(iZzx - 4);
            i11 = i10 - 11;
        }
        zzer zzerVar2 = this.zza;
        int iZzg = zzerVar2.zzg();
        int iZze = zzerVar2.zze();
        if (iZzg >= iZze || i11 <= 0) {
            return;
        }
        int iMin = Math.min(i11, iZze - iZzg);
        zzerVar.zzm(zzerVar2.zzi(), iZzg, iMin);
        zzerVar2.zzh(iZzg + iMin);
    }

    final /* synthetic */ void zze(zzer zzerVar, int i10) {
        if (i10 < 19) {
            return;
        }
        this.zzd = zzerVar.zzt();
        this.zze = zzerVar.zzt();
        zzerVar.zzk(11);
        this.zzf = zzerVar.zzt();
        this.zzg = zzerVar.zzt();
    }
}
