package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import androidx.core.view.ViewCompat;
import androidx.work.WorkInfo;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzamr implements zzamf {
    private static final byte[] zza = {0, 7, 8, Ascii.SI};
    private static final byte[] zzb = {0, 119, -120, -1};
    private static final byte[] zzc = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    private final Paint zzd;
    private final Paint zze;
    private final Canvas zzf;
    private final zzamk zzg;
    private final zzamj zzh;
    private final zzamq zzi;
    private Bitmap zzj;

    public zzamr(List list) {
        zzer zzerVar = new zzer((byte[]) list.get(0));
        int iZzt = zzerVar.zzt();
        int iZzt2 = zzerVar.zzt();
        Paint paint = new Paint();
        this.zzd = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.zze = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.zzf = new Canvas();
        this.zzg = new zzamk(719, 575, 0, 719, 0, 575);
        this.zzh = new zzamj(0, zzd(), zze(), zzf());
        this.zzi = new zzamq(iZzt, iZzt2);
    }

    private static zzamj zzb(zzeq zzeqVar, int i10) {
        int iZzj;
        int iZzj2;
        int iZzj3;
        int iZzj4;
        int i11 = 8;
        int iZzj5 = zzeqVar.zzj(8);
        zzeqVar.zzh(8);
        int[] iArrZzd = zzd();
        int[] iArrZze = zze();
        int[] iArrZzf = zzf();
        int i12 = i10 - 2;
        while (i12 > 0) {
            int iZzj6 = zzeqVar.zzj(i11);
            int iZzj7 = zzeqVar.zzj(i11);
            int[] iArr = (iZzj7 & 128) != 0 ? iArrZzd : (iZzj7 & 64) != 0 ? iArrZze : iArrZzf;
            if ((iZzj7 & 1) != 0) {
                iZzj3 = zzeqVar.zzj(i11);
                iZzj4 = zzeqVar.zzj(i11);
                iZzj = zzeqVar.zzj(i11);
                iZzj2 = zzeqVar.zzj(i11);
                i12 -= 6;
            } else {
                int iZzj8 = zzeqVar.zzj(6) << 2;
                int iZzj9 = zzeqVar.zzj(4) << 4;
                i12 -= 4;
                iZzj = zzeqVar.zzj(4) << 4;
                iZzj2 = zzeqVar.zzj(2) << 6;
                iZzj3 = iZzj8;
                iZzj4 = iZzj9;
            }
            if (iZzj3 == 0) {
                iZzj2 = 255;
            }
            if (iZzj3 == 0) {
                iZzj = 0;
            }
            if (iZzj3 == 0) {
                iZzj4 = 0;
            }
            int i13 = iZzj + WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
            double d10 = iZzj3;
            String str = zzfj.zza;
            double d11 = iZzj4 + WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
            double d12 = i13;
            iArr[iZzj6] = zzg((byte) (255 - (iZzj2 & 255)), Math.max(0, Math.min((int) (d10 + (1.402d * d11)), 255)), Math.max(0, Math.min((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 255)), Math.max(0, Math.min((int) (d10 + (d12 * 1.772d)), 255)));
            iZzj5 = iZzj5;
            i11 = 8;
        }
        return new zzamj(iZzj5, iArrZzd, iArrZze, iArrZzf);
    }

    private static zzaml zzc(zzeq zzeqVar) {
        byte[] bArr;
        int iZzj = zzeqVar.zzj(16);
        zzeqVar.zzh(4);
        int iZzj2 = zzeqVar.zzj(2);
        boolean zZzi = zzeqVar.zzi();
        zzeqVar.zzh(1);
        byte[] bArr2 = zzfj.zzb;
        if (iZzj2 != 1) {
            if (iZzj2 == 0) {
                int iZzj3 = zzeqVar.zzj(16);
                int iZzj4 = zzeqVar.zzj(16);
                if (iZzj3 > 0) {
                    bArr2 = new byte[iZzj3];
                    zzeqVar.zzn(bArr2, 0, iZzj3);
                }
                if (iZzj4 > 0) {
                    bArr = new byte[iZzj4];
                    zzeqVar.zzn(bArr, 0, iZzj4);
                }
            }
            return new zzaml(iZzj, zZzi, bArr2, bArr);
        }
        zzeqVar.zzh(zzeqVar.zzj(8) * 16);
        bArr = bArr2;
        return new zzaml(iZzj, zZzi, bArr2, bArr);
    }

    private static int[] zzd() {
        return new int[]{0, -1, ViewCompat.MEASURED_STATE_MASK, -8421505};
    }

    private static int[] zze() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            int i11 = i10 & 4;
            int i12 = i10 & 2;
            int i13 = i10 & 1;
            if (i10 < 8) {
                iArr[i10] = zzg(255, 1 != i13 ? 0 : 255, i12 != 0 ? 255 : 0, i11 != 0 ? 255 : 0);
            } else {
                iArr[i10] = zzg(255, 1 != i13 ? 0 : 127, i12 != 0 ? 127 : 0, i11 == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] zzf() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            if (i10 < 8) {
                iArr[i10] = zzg(63, 1 != (i10 & 1) ? 0 : 255, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) == 0 ? 0 : 255);
            } else {
                int i11 = i10 & 136;
                if (i11 == 0) {
                    iArr[i10] = zzg(255, (1 != (i10 & 1) ? 0 : 85) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 8) {
                    iArr[i10] = zzg(127, (1 != (i10 & 1) ? 0 : 85) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 128) {
                    iArr[i10] = zzg(255, (1 != (i10 & 1) ? 0 : 43) + 127 + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + 127 + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + 127 + ((i10 & 64) == 0 ? 0 : 85));
                } else if (i11 == 136) {
                    iArr[i10] = zzg(255, (1 != (i10 & 1) ? 0 : 43) + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + ((i10 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    private static int zzg(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0201 A[LOOP:3: B:89:0x0163->B:122:0x0201, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void zzh(byte[] r22, int[] r23, int r24, int r25, int r26, @androidx.annotation.Nullable android.graphics.Paint r27, android.graphics.Canvas r28) {
        /*
            Method dump skipped, instruction units count: 546
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamr.zzh(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    private static byte[] zzi(int i10, int i11, zzeq zzeqVar) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) zzeqVar.zzj(i11);
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zza(byte[] bArr, int i10, int i11, zzame zzameVar, zzdr zzdrVar) {
        boolean z10;
        zzalx zzalxVar;
        Canvas canvas;
        char c10;
        char c11;
        char c12;
        int i12;
        zzamq zzamqVar;
        Canvas canvas2;
        int i13;
        int i14;
        int i15;
        zzamo zzamoVar;
        int iZzj;
        int iZzj2;
        int iZzj3;
        int iZzj4;
        int i16;
        int iZzj5;
        zzeq zzeqVar = new zzeq(bArr, i10 + i11);
        zzeqVar.zzf(i10);
        while (true) {
            z10 = true;
            if (zzeqVar.zzc() >= 48 && zzeqVar.zzj(8) == 15) {
                zzamq zzamqVar2 = this.zzi;
                int iZzj6 = zzeqVar.zzj(8);
                int iZzj7 = zzeqVar.zzj(16);
                int iZzj8 = zzeqVar.zzj(16);
                int iZze = zzeqVar.zze() + iZzj8;
                if (iZzj8 * 8 > zzeqVar.zzc()) {
                    zzee.zzc("DvbParser", "Data field length exceeds limit");
                    zzeqVar.zzh(zzeqVar.zzc());
                } else {
                    switch (iZzj6) {
                        case 16:
                            if (iZzj7 == zzamqVar2.zza) {
                                zzamm zzammVar = zzamqVar2.zzi;
                                int iZzj9 = zzeqVar.zzj(8);
                                int iZzj10 = zzeqVar.zzj(4);
                                int iZzj11 = zzeqVar.zzj(2);
                                zzeqVar.zzh(2);
                                SparseArray sparseArray = new SparseArray();
                                for (int i17 = iZzj8 - 2; i17 > 0; i17 -= 6) {
                                    int iZzj12 = zzeqVar.zzj(8);
                                    zzeqVar.zzh(8);
                                    sparseArray.put(iZzj12, new zzamn(zzeqVar.zzj(16), zzeqVar.zzj(16)));
                                }
                                zzamm zzammVar2 = new zzamm(iZzj9, iZzj10, iZzj11, sparseArray);
                                if (zzammVar2.zzb != 0) {
                                    zzamqVar2.zzi = zzammVar2;
                                    zzamqVar2.zzc.clear();
                                    zzamqVar2.zzd.clear();
                                    zzamqVar2.zze.clear();
                                } else if (zzammVar != null) {
                                    if (zzammVar.zza != zzammVar2.zza) {
                                        zzamqVar2.zzi = zzammVar2;
                                    }
                                }
                            }
                            break;
                        case 17:
                            zzamm zzammVar3 = zzamqVar2.zzi;
                            if (iZzj7 == zzamqVar2.zza && zzammVar3 != null) {
                                int iZzj13 = zzeqVar.zzj(8);
                                zzeqVar.zzh(4);
                                boolean zZzi = zzeqVar.zzi();
                                zzeqVar.zzh(3);
                                int iZzj14 = zzeqVar.zzj(16);
                                int iZzj15 = zzeqVar.zzj(16);
                                int iZzj16 = zzeqVar.zzj(3);
                                int iZzj17 = zzeqVar.zzj(3);
                                zzeqVar.zzh(2);
                                int iZzj18 = zzeqVar.zzj(8);
                                int iZzj19 = zzeqVar.zzj(8);
                                int iZzj20 = zzeqVar.zzj(4);
                                int iZzj21 = zzeqVar.zzj(2);
                                zzeqVar.zzh(2);
                                int i18 = iZzj8 - 10;
                                SparseArray sparseArray2 = new SparseArray();
                                while (i18 > 0) {
                                    int iZzj22 = zzeqVar.zzj(16);
                                    int iZzj23 = zzeqVar.zzj(2);
                                    int iZzj24 = zzeqVar.zzj(2);
                                    int iZzj25 = zzeqVar.zzj(12);
                                    zzeqVar.zzh(4);
                                    int iZzj26 = zzeqVar.zzj(12);
                                    int i19 = i18 - 6;
                                    if (iZzj23 == 1) {
                                        i18 -= 8;
                                        iZzj = zzeqVar.zzj(8);
                                        iZzj2 = zzeqVar.zzj(8);
                                    } else if (iZzj23 == 2) {
                                        iZzj23 = 2;
                                        i18 -= 8;
                                        iZzj = zzeqVar.zzj(8);
                                        iZzj2 = zzeqVar.zzj(8);
                                    } else {
                                        i18 = i19;
                                        iZzj = 0;
                                        iZzj2 = 0;
                                    }
                                    sparseArray2.put(iZzj22, new zzamp(iZzj23, iZzj24, iZzj25, iZzj26, iZzj, iZzj2));
                                }
                                zzamo zzamoVar2 = new zzamo(iZzj13, zZzi, iZzj14, iZzj15, iZzj16, iZzj17, iZzj18, iZzj19, iZzj20, iZzj21, sparseArray2);
                                if (zzammVar3.zzb == 0 && (zzamoVar = (zzamo) zzamqVar2.zzc.get(zzamoVar2.zza)) != null) {
                                    int i20 = 0;
                                    while (true) {
                                        SparseArray sparseArray3 = zzamoVar.zzj;
                                        if (i20 < sparseArray3.size()) {
                                            zzamoVar2.zzj.put(sparseArray3.keyAt(i20), (zzamp) sparseArray3.valueAt(i20));
                                            i20++;
                                        }
                                    }
                                }
                                zzamqVar2.zzc.put(zzamoVar2.zza, zzamoVar2);
                            }
                            break;
                        case 18:
                            if (iZzj7 == zzamqVar2.zza) {
                                zzamj zzamjVarZzb = zzb(zzeqVar, iZzj8);
                                zzamqVar2.zzd.put(zzamjVarZzb.zza, zzamjVarZzb);
                            } else if (iZzj7 == zzamqVar2.zzb) {
                                zzamj zzamjVarZzb2 = zzb(zzeqVar, iZzj8);
                                zzamqVar2.zzf.put(zzamjVarZzb2.zza, zzamjVarZzb2);
                            }
                            break;
                        case 19:
                            if (iZzj7 == zzamqVar2.zza) {
                                zzaml zzamlVarZzc = zzc(zzeqVar);
                                zzamqVar2.zze.put(zzamlVarZzc.zza, zzamlVarZzc);
                            } else if (iZzj7 == zzamqVar2.zzb) {
                                zzaml zzamlVarZzc2 = zzc(zzeqVar);
                                zzamqVar2.zzg.put(zzamlVarZzc2.zza, zzamlVarZzc2);
                            }
                            break;
                        case 20:
                            if (iZzj7 == zzamqVar2.zza) {
                                zzeqVar.zzh(4);
                                boolean zZzi2 = zzeqVar.zzi();
                                zzeqVar.zzh(3);
                                int iZzj27 = zzeqVar.zzj(16);
                                int iZzj28 = zzeqVar.zzj(16);
                                if (zZzi2) {
                                    int iZzj29 = zzeqVar.zzj(16);
                                    iZzj3 = zzeqVar.zzj(16);
                                    iZzj5 = zzeqVar.zzj(16);
                                    iZzj4 = zzeqVar.zzj(16);
                                    i16 = iZzj29;
                                } else {
                                    iZzj3 = iZzj27;
                                    iZzj4 = iZzj28;
                                    i16 = 0;
                                    iZzj5 = 0;
                                }
                                zzamqVar2.zzh = new zzamk(iZzj27, iZzj28, i16, iZzj3, iZzj5, iZzj4);
                            }
                            break;
                    }
                    zzeqVar.zzo(iZze - zzeqVar.zze());
                }
            }
        }
        zzamq zzamqVar3 = this.zzi;
        zzamm zzammVar4 = zzamqVar3.zzi;
        if (zzammVar4 == null) {
            zzalxVar = new zzalx(zzguf.zzi(), -9223372036854775807L, -9223372036854775807L);
        } else {
            zzamk zzamkVar = zzamqVar3.zzh;
            if (zzamkVar == null) {
                zzamkVar = this.zzg;
            }
            Bitmap bitmap = this.zzj;
            if (bitmap == null || zzamkVar.zza + 1 != bitmap.getWidth() || zzamkVar.zzb + 1 != this.zzj.getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(zzamkVar.zza + 1, zzamkVar.zzb + 1, Bitmap.Config.ARGB_8888);
                this.zzj = bitmapCreateBitmap;
                this.zzf.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray4 = zzammVar4.zzc;
            int i21 = 0;
            while (i21 < sparseArray4.size()) {
                Canvas canvas3 = this.zzf;
                canvas3.save();
                zzamn zzamnVar = (zzamn) sparseArray4.valueAt(i21);
                zzamo zzamoVar3 = (zzamo) zzamqVar3.zzc.get(sparseArray4.keyAt(i21));
                int i22 = zzamnVar.zza + zzamkVar.zzc;
                int i23 = zzamnVar.zzb + zzamkVar.zze;
                int i24 = zzamoVar3.zzc;
                int i25 = i22 + i24;
                boolean z11 = z10;
                int iMin = Math.min(i25, zzamkVar.zzd);
                int i26 = zzamoVar3.zzd;
                int i27 = i23 + i26;
                canvas3.clipRect(i22, i23, iMin, Math.min(i27, zzamkVar.zzf));
                int i28 = zzamoVar3.zzf;
                zzamj zzamjVar = (zzamj) zzamqVar3.zzd.get(i28);
                if (zzamjVar == null && (zzamjVar = (zzamj) zzamqVar3.zzf.get(i28)) == null) {
                    zzamjVar = this.zzh;
                }
                SparseArray sparseArray5 = zzamoVar3.zzj;
                SparseArray sparseArray6 = sparseArray4;
                int i29 = i21;
                int i30 = 0;
                while (i30 < sparseArray5.size()) {
                    int iKeyAt = sparseArray5.keyAt(i30);
                    int i31 = i30;
                    zzamp zzampVar = (zzamp) sparseArray5.valueAt(i30);
                    SparseArray sparseArray7 = sparseArray5;
                    zzaml zzamlVar = (zzaml) zzamqVar3.zze.get(iKeyAt);
                    if (zzamlVar == null) {
                        zzamlVar = (zzaml) zzamqVar3.zzg.get(iKeyAt);
                    }
                    if (zzamlVar != null) {
                        Paint paint = zzamlVar.zzb ? null : this.zzd;
                        i14 = i24;
                        int i32 = zzamoVar3.zze;
                        zzamqVar = zzamqVar3;
                        int i33 = zzampVar.zza + i22;
                        int i34 = i23 + zzampVar.zzb;
                        canvas2 = canvas3;
                        i13 = i22;
                        int[] iArr = i32 == 3 ? zzamjVar.zzd : i32 == 2 ? zzamjVar.zzc : zzamjVar.zzb;
                        i15 = i25;
                        zzh(zzamlVar.zzc, iArr, i32, i33, i34, paint, canvas2);
                        zzh(zzamlVar.zzd, iArr, i32, i33, i34 + 1, paint, canvas2);
                    } else {
                        zzamqVar = zzamqVar3;
                        canvas2 = canvas3;
                        i13 = i22;
                        i14 = i24;
                        i15 = i25;
                    }
                    i22 = i13;
                    i25 = i15;
                    i30 = i31 + 1;
                    i24 = i14;
                    canvas3 = canvas2;
                    sparseArray5 = sparseArray7;
                    zzamqVar3 = zzamqVar;
                }
                zzamq zzamqVar4 = zzamqVar3;
                Canvas canvas4 = canvas3;
                int i35 = i22;
                int i36 = i24;
                int i37 = i25;
                float f10 = i23;
                float f11 = i35;
                if (zzamoVar3.zzb) {
                    int i38 = zzamoVar3.zze;
                    if (i38 == 3) {
                        i12 = zzamjVar.zzd[zzamoVar3.zzg];
                        c12 = 2;
                    } else {
                        c12 = 2;
                        i12 = i38 == 2 ? zzamjVar.zzc[zzamoVar3.zzh] : zzamjVar.zzb[zzamoVar3.zzi];
                    }
                    Paint paint2 = this.zze;
                    paint2.setColor(i12);
                    float f12 = i37;
                    c11 = c12;
                    c10 = 3;
                    canvas = canvas4;
                    canvas.drawRect(f11, f10, f12, i27, paint2);
                } else {
                    canvas = canvas4;
                    c10 = 3;
                    c11 = 2;
                }
                zzcw zzcwVar = new zzcw();
                zzcwVar.zzc(Bitmap.createBitmap(this.zzj, i35, i23, i36, i26));
                float f13 = zzamkVar.zza;
                zzcwVar.zzi(f11 / f13);
                zzcwVar.zzj(0);
                float f14 = zzamkVar.zzb;
                zzcwVar.zzf(f10 / f14, 0);
                zzcwVar.zzg(0);
                zzcwVar.zzm(i36 / f13);
                zzcwVar.zzn(i26 / f14);
                arrayList.add(zzcwVar.zzr());
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                i21 = i29 + 1;
                z10 = z11;
                zzamqVar3 = zzamqVar4;
                sparseArray4 = sparseArray6;
            }
            zzalxVar = new zzalx(arrayList, -9223372036854775807L, -9223372036854775807L);
        }
        zzdrVar.zza(zzalxVar);
    }
}
