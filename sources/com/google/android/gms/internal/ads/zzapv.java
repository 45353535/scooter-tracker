package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.media3.extractor.ts.TsExtractor;
import j$.util.Objects;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
final class zzapv implements zzapn {
    final /* synthetic */ zzapx zza;
    private final zzeq zzb;
    private final SparseArray zzc;
    private final SparseIntArray zzd;
    private final int zze;

    public zzapv(zzapx zzapxVar, int i10) {
        Objects.requireNonNull(zzapxVar);
        this.zza = zzapxVar;
        this.zzb = new zzeq(new byte[5], 5);
        this.zzc = new SparseArray();
        this.zzd = new SparseIntArray();
        this.zze = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzapn
    public final void zza(zzfg zzfgVar, zzaex zzaexVar, zzaqb zzaqbVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzapn
    public final void zzb(zzer zzerVar) {
        zzapx zzapxVar;
        int i10;
        zzeq zzeqVar;
        int i11;
        int i12;
        if (zzerVar.zzs() != 2) {
            return;
        }
        zzapx zzapxVar2 = this.zza;
        zzfg zzfgVar = (zzfg) zzapxVar2.zzh().get(0);
        if ((zzerVar.zzs() & 128) != 0) {
            zzerVar.zzk(1);
            int iZzt = zzerVar.zzt();
            int i13 = 3;
            zzerVar.zzk(3);
            zzeq zzeqVar2 = this.zzb;
            zzerVar.zzl(zzeqVar2, 2);
            zzeqVar2.zzh(3);
            int i14 = 13;
            zzapxVar2.zzq(zzeqVar2.zzj(13));
            zzerVar.zzl(zzeqVar2, 2);
            int i15 = 4;
            zzeqVar2.zzh(4);
            int i16 = 12;
            zzerVar.zzk(zzeqVar2.zzj(12));
            SparseArray sparseArray = this.zzc;
            sparseArray.clear();
            SparseIntArray sparseIntArray = this.zzd;
            sparseIntArray.clear();
            int iZzd = zzerVar.zzd();
            while (iZzd > 0) {
                int i17 = 5;
                zzerVar.zzl(zzeqVar2, 5);
                int iZzj = zzeqVar2.zzj(8);
                zzeqVar2.zzh(i13);
                int iZzj2 = zzeqVar2.zzj(i14);
                zzeqVar2.zzh(i15);
                int iZzj3 = zzeqVar2.zzj(i16);
                int iZzg = zzerVar.zzg();
                int i18 = iZzg + iZzj3;
                String str = null;
                ArrayList arrayList = null;
                int i19 = -1;
                int iZzs = 0;
                while (zzerVar.zzg() < i18) {
                    int iZzs2 = zzerVar.zzs();
                    int iZzg2 = zzerVar.zzg() + zzerVar.zzs();
                    if (iZzg2 > i18) {
                        break;
                    }
                    if (iZzs2 == i17) {
                        long jZzz = zzerVar.zzz();
                        if (jZzz != 1094921523) {
                            if (jZzz != 1161904947) {
                                if (jZzz != 1094921524) {
                                    if (jZzz == 1212503619) {
                                        i12 = 36;
                                        zzapxVar = zzapxVar2;
                                        i19 = i12;
                                        i10 = iZzg2;
                                        zzeqVar = zzeqVar2;
                                        i11 = iZzd;
                                    }
                                    zzapxVar = zzapxVar2;
                                    i10 = iZzg2;
                                    zzeqVar = zzeqVar2;
                                    i11 = iZzd;
                                }
                                zzapxVar = zzapxVar2;
                                i10 = iZzg2;
                                zzeqVar = zzeqVar2;
                                i11 = iZzd;
                                i19 = 172;
                            }
                            zzapxVar = zzapxVar2;
                            zzeqVar = zzeqVar2;
                            i11 = iZzd;
                            i19 = 135;
                            i10 = iZzg2;
                        }
                        zzapxVar = zzapxVar2;
                        i10 = iZzg2;
                        zzeqVar = zzeqVar2;
                        i11 = iZzd;
                        i19 = 129;
                    } else {
                        if (iZzs2 != 106) {
                            if (iZzs2 == 122) {
                                zzapxVar = zzapxVar2;
                                zzeqVar = zzeqVar2;
                                i11 = iZzd;
                                i19 = 135;
                                i10 = iZzg2;
                            } else {
                                if (iZzs2 == 127) {
                                    int iZzs3 = zzerVar.zzs();
                                    if (iZzs3 != 21) {
                                        if (iZzs3 == 14) {
                                            i12 = 136;
                                        } else {
                                            if (iZzs3 == 33) {
                                                i12 = TsExtractor.TS_STREAM_TYPE_DTS_UHD;
                                            }
                                            zzapxVar = zzapxVar2;
                                            i10 = iZzg2;
                                            zzeqVar = zzeqVar2;
                                            i11 = iZzd;
                                        }
                                    }
                                    zzapxVar = zzapxVar2;
                                    i10 = iZzg2;
                                    zzeqVar = zzeqVar2;
                                    i11 = iZzd;
                                    i19 = 172;
                                } else if (iZzs2 == 123) {
                                    i12 = 138;
                                } else if (iZzs2 == 10) {
                                    String strTrim = zzerVar.zzK(3, StandardCharsets.UTF_8).trim();
                                    iZzs = zzerVar.zzs();
                                    zzapxVar = zzapxVar2;
                                    str = strTrim;
                                    i10 = iZzg2;
                                    zzeqVar = zzeqVar2;
                                    i11 = iZzd;
                                } else if (iZzs2 == 89) {
                                    ArrayList arrayList2 = new ArrayList();
                                    while (zzerVar.zzg() < iZzg2) {
                                        int i20 = iZzg2;
                                        String strTrim2 = zzerVar.zzK(3, StandardCharsets.UTF_8).trim();
                                        int iZzs4 = zzerVar.zzs();
                                        int i21 = iZzd;
                                        byte[] bArr = new byte[4];
                                        zzerVar.zzm(bArr, 0, 4);
                                        arrayList2.add(new zzapy(strTrim2, iZzs4, bArr));
                                        iZzd = i21;
                                        iZzg2 = i20;
                                        zzeqVar2 = zzeqVar2;
                                        zzapxVar2 = zzapxVar2;
                                    }
                                    zzapxVar = zzapxVar2;
                                    i10 = iZzg2;
                                    zzeqVar = zzeqVar2;
                                    i11 = iZzd;
                                    arrayList = arrayList2;
                                    i19 = 89;
                                } else {
                                    zzapxVar = zzapxVar2;
                                    i10 = iZzg2;
                                    zzeqVar = zzeqVar2;
                                    i11 = iZzd;
                                    if (iZzs2 == 111) {
                                        i19 = 257;
                                    }
                                }
                                zzapxVar = zzapxVar2;
                                i19 = i12;
                                i10 = iZzg2;
                                zzeqVar = zzeqVar2;
                                i11 = iZzd;
                            }
                        }
                        zzapxVar = zzapxVar2;
                        i10 = iZzg2;
                        zzeqVar = zzeqVar2;
                        i11 = iZzd;
                        i19 = 129;
                    }
                    zzerVar.zzk(i10 - zzerVar.zzg());
                    iZzd = i11;
                    zzeqVar2 = zzeqVar;
                    zzapxVar2 = zzapxVar;
                    i17 = 5;
                }
                zzapx zzapxVar3 = zzapxVar2;
                zzeq zzeqVar3 = zzeqVar2;
                int i22 = iZzd;
                zzerVar.zzh(i18);
                zzapz zzapzVar = new zzapz(i19, str, iZzs, arrayList, Arrays.copyOfRange(zzerVar.zzi(), iZzg, i18));
                if (iZzj == 6 || iZzj == 5) {
                    iZzj = zzapzVar.zza;
                }
                iZzd = i22 - (iZzj3 + 5);
                if (!zzapxVar3.zzk().get(iZzj2)) {
                    zzaqc zzaqcVarZzb = zzapxVar3.zzi().zzb(iZzj, zzapzVar);
                    sparseIntArray.put(iZzj2, iZzj2);
                    sparseArray.put(iZzj2, zzaqcVarZzb);
                }
                i15 = 4;
                zzeqVar2 = zzeqVar3;
                zzapxVar2 = zzapxVar3;
                i13 = 3;
                i14 = 13;
                i16 = 12;
            }
            zzapx zzapxVar4 = zzapxVar2;
            int size = sparseIntArray.size();
            for (int i23 = 0; i23 < size; i23++) {
                int iKeyAt = sparseIntArray.keyAt(i23);
                int iValueAt = sparseIntArray.valueAt(i23);
                zzapxVar4.zzk().put(iKeyAt, true);
                zzapxVar4.zzl().put(iValueAt, true);
                zzaqc zzaqcVar = (zzaqc) sparseArray.valueAt(i23);
                if (zzaqcVar != null) {
                    zzaqcVar.zza(zzfgVar, zzapxVar4.zzm(), new zzaqb(iZzt, iKeyAt, 8192));
                    zzapxVar4.zzj().put(iValueAt, zzaqcVar);
                }
            }
            zzapxVar4.zzj().remove(this.zze);
            zzapxVar4.zzo(0);
            if (zzapxVar4.zzn() == 0) {
                zzapxVar4.zzm().zzv();
                zzapxVar4.zzp(true);
            }
        }
    }
}
