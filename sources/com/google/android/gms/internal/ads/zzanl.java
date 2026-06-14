package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Rect;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
final class zzanl {
    private boolean zzb;
    private boolean zzc;
    private int[] zzd;
    private int zze;
    private int zzf;

    @Nullable
    private Rect zzg;
    private final int[] zza = new int[4];
    private int zzh = -1;
    private int zzi = -1;

    private static int zze(int[] iArr, int i10) {
        if (i10 >= iArr.length) {
            i10 = 0;
        }
        return iArr[i10];
    }

    private static int zzf(int i10, int i11) {
        return (i10 & ViewCompat.MEASURED_SIZE_MASK) | ((i11 * 17) << 24);
    }

    private final void zzg(zzeq zzeqVar, boolean z10, Rect rect, int[] iArr) {
        int i10;
        int i11;
        int i12 = !z10 ? 1 : 0;
        int iWidth = rect.width();
        int i13 = i12 * iWidth;
        int iHeight = rect.height();
        while (true) {
            int i14 = 0;
            do {
                int iZzj = 0;
                for (int i15 = 1; iZzj < i15 && i15 <= 64; i15 <<= 2) {
                    if (zzeqVar.zzc() < 4) {
                        i10 = -1;
                        i11 = 0;
                        break;
                    }
                    iZzj = (iZzj << 4) | zzeqVar.zzj(4);
                }
                i10 = iZzj & 3;
                i11 = iZzj < 4 ? iWidth : iZzj >> 2;
                int iMin = Math.min(i11, iWidth - i14);
                if (iMin > 0) {
                    int i16 = i13 + iMin;
                    Arrays.fill(iArr, i13, i16, this.zza[i10]);
                    i14 += iMin;
                    i13 = i16;
                }
            } while (i14 < iWidth);
            i12 += 2;
            if (i12 >= iHeight) {
                return;
            }
            i13 = i12 * iWidth;
            zzeqVar.zzm();
        }
    }

    public final void zza(String str) {
        int i10;
        String strTrim = str.trim();
        String str2 = zzfj.zza;
        for (String str3 : strTrim.split("\\r?\\n", -1)) {
            if (str3.startsWith("palette: ")) {
                String[] strArrSplit = str3.substring(9).split(StringUtils.COMMA, -1);
                this.zzd = new int[strArrSplit.length];
                for (int i11 = 0; i11 < strArrSplit.length; i11++) {
                    int[] iArr = this.zzd;
                    try {
                        i10 = Integer.parseInt(strArrSplit[i11].trim(), 16);
                    } catch (RuntimeException unused) {
                        i10 = 0;
                    }
                    iArr[i11] = i10;
                }
            } else if (str3.startsWith("size: ")) {
                String[] strArrSplit2 = str3.substring(6).trim().split("x", -1);
                if (strArrSplit2.length == 2) {
                    try {
                        this.zze = Integer.parseInt(strArrSplit2[0]);
                        this.zzf = Integer.parseInt(strArrSplit2[1]);
                        this.zzb = true;
                    } catch (RuntimeException e10) {
                        zzee.zzd("VobsubParser", "Parsing IDX failed", e10);
                    }
                }
            }
        }
    }

    public final void zzb(zzer zzerVar) {
        int[] iArr = this.zzd;
        if (iArr == null || !this.zzb) {
            return;
        }
        zzerVar.zzk(zzerVar.zzt() - 2);
        int iZzt = zzerVar.zzt();
        while (zzerVar.zzg() < iZzt && zzerVar.zzd() > 0) {
            switch (zzerVar.zzs()) {
                case 0:
                case 1:
                case 2:
                    break;
                case 3:
                    if (zzerVar.zzd() < 2) {
                        return;
                    }
                    int iZzs = zzerVar.zzs();
                    int iZzs2 = zzerVar.zzs();
                    int[] iArr2 = this.zza;
                    iArr2[3] = zze(iArr, iZzs >> 4);
                    iArr2[2] = zze(iArr, iZzs & 15);
                    iArr2[1] = zze(iArr, iZzs2 >> 4);
                    iArr2[0] = zze(iArr, iZzs2 & 15);
                    this.zzc = true;
                    break;
                case 4:
                    if (zzerVar.zzd() < 2 || !this.zzc) {
                        return;
                    }
                    int iZzs3 = zzerVar.zzs();
                    int iZzs4 = zzerVar.zzs();
                    int[] iArr3 = this.zza;
                    iArr3[3] = zzf(iArr3[3], iZzs3 >> 4);
                    iArr3[2] = zzf(iArr3[2], iZzs3 & 15);
                    iArr3[1] = zzf(iArr3[1], iZzs4 >> 4);
                    iArr3[0] = zzf(iArr3[0], iZzs4 & 15);
                    break;
                case 5:
                    if (zzerVar.zzd() < 6) {
                        return;
                    }
                    int iZzs5 = zzerVar.zzs();
                    int iZzs6 = zzerVar.zzs();
                    int i10 = iZzs6 >> 4;
                    int iZzs7 = ((iZzs6 & 15) << 8) | zzerVar.zzs();
                    int iZzs8 = zzerVar.zzs();
                    int iZzs9 = zzerVar.zzs();
                    this.zzg = new Rect((iZzs5 << 4) | i10, (iZzs8 << 4) | (iZzs9 >> 4), iZzs7 + 1, (((iZzs9 & 15) << 8) | zzerVar.zzs()) + 1);
                    break;
                case 6:
                    if (zzerVar.zzd() < 4) {
                        return;
                    }
                    this.zzh = zzerVar.zzt();
                    this.zzi = zzerVar.zzt();
                    break;
                default:
                    return;
            }
        }
    }

    @Nullable
    public final zzcx zzc(zzer zzerVar) {
        Rect rect;
        if (this.zzd == null || !this.zzb || !this.zzc || (rect = this.zzg) == null || this.zzh == -1 || this.zzi == -1 || rect.width() < 2 || this.zzg.height() < 2) {
            return null;
        }
        Rect rect2 = this.zzg;
        int[] iArr = new int[rect2.width() * rect2.height()];
        zzeq zzeqVar = new zzeq();
        zzerVar.zzh(this.zzh);
        zzeqVar.zza(zzerVar);
        zzg(zzeqVar, true, rect2, iArr);
        zzerVar.zzh(this.zzi);
        zzeqVar.zza(zzerVar);
        zzg(zzeqVar, false, rect2, iArr);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888);
        zzcw zzcwVar = new zzcw();
        zzcwVar.zzc(bitmapCreateBitmap);
        zzcwVar.zzi(rect2.left / this.zze);
        zzcwVar.zzj(0);
        zzcwVar.zzf(rect2.top / this.zzf, 0);
        zzcwVar.zzg(0);
        zzcwVar.zzm(rect2.width() / this.zze);
        zzcwVar.zzn(rect2.height() / this.zzf);
        return zzcwVar.zzr();
    }

    public final void zzd() {
        this.zzc = false;
        this.zzg = null;
        this.zzh = -1;
        this.zzi = -1;
    }
}
