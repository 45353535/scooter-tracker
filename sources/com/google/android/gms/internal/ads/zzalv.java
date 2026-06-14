package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
final class zzalv extends zzalt {

    @Nullable
    private zzalu zza;
    private int zzb;
    private boolean zzc;

    @Nullable
    private zzagm zzd;

    @Nullable
    private zzagk zze;

    zzalv() {
    }

    @Override // com.google.android.gms.internal.ads.zzalt
    protected final void zza(boolean z10) {
        super.zza(z10);
        if (z10) {
            this.zza = null;
            this.zzd = null;
            this.zze = null;
        }
        this.zzb = 0;
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzalt
    protected final long zzb(zzer zzerVar) {
        if ((zzerVar.zzi()[0] & 1) == 1) {
            return -1L;
        }
        byte b10 = zzerVar.zzi()[0];
        zzalu zzaluVar = this.zza;
        zzaluVar.getClass();
        int i10 = !zzaluVar.zzd[(b10 >> 1) & (255 >>> (8 - zzaluVar.zze))].zza ? zzaluVar.zza.zze : zzaluVar.zza.zzf;
        int i11 = this.zzc ? (this.zzb + i10) / 4 : 0;
        if (zzerVar.zzj() < zzerVar.zze() + 4) {
            byte[] bArrCopyOf = Arrays.copyOf(zzerVar.zzi(), zzerVar.zze() + 4);
            zzerVar.zzb(bArrCopyOf, bArrCopyOf.length);
        } else {
            zzerVar.zzf(zzerVar.zze() + 4);
        }
        long j10 = i11;
        byte[] bArrZzi = zzerVar.zzi();
        bArrZzi[zzerVar.zze() - 4] = (byte) (j10 & 255);
        bArrZzi[zzerVar.zze() - 3] = (byte) ((j10 >>> 8) & 255);
        bArrZzi[zzerVar.zze() - 2] = (byte) ((j10 >>> 16) & 255);
        bArrZzi[zzerVar.zze() - 1] = (byte) ((j10 >>> 24) & 255);
        this.zzc = true;
        this.zzb = i10;
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.zzalt
    protected final boolean zzc(zzer zzerVar, long j10, zzalr zzalrVar) throws IOException {
        zzalu zzaluVar;
        int i10;
        int iZzb;
        int i11;
        int[] iArr;
        int i12;
        long jFloor;
        if (this.zza != null) {
            zzalrVar.zza.getClass();
            return false;
        }
        zzagm zzagmVar = this.zzd;
        int i13 = 1;
        if (zzagmVar == null) {
            zzagn.zzd(1, zzerVar, false);
            int iZzI = zzerVar.zzI();
            int iZzs = zzerVar.zzs();
            int iZzI2 = zzerVar.zzI();
            int iZzC = zzerVar.zzC();
            int i14 = iZzC <= 0 ? -1 : iZzC;
            int iZzC2 = zzerVar.zzC();
            int i15 = iZzC2 <= 0 ? -1 : iZzC2;
            int iZzC3 = zzerVar.zzC();
            int i16 = iZzC3 <= 0 ? -1 : iZzC3;
            int iZzs2 = zzerVar.zzs();
            this.zzd = new zzagm(iZzI, iZzs, iZzI2, i14, i15, i16, (int) Math.pow(2.0d, iZzs2 & 15), (int) Math.pow(2.0d, (iZzs2 & 240) >> 4), 1 == (zzerVar.zzs() & 1), Arrays.copyOf(zzerVar.zzi(), zzerVar.zze()));
        } else {
            int i17 = 4;
            zzagk zzagkVar = this.zze;
            if (zzagkVar == null) {
                this.zze = zzagn.zzb(zzerVar, true, true);
            } else {
                byte[] bArr = new byte[zzerVar.zze()];
                System.arraycopy(zzerVar.zzi(), 0, bArr, 0, zzerVar.zze());
                int i18 = zzagmVar.zza;
                int i19 = 5;
                zzagn.zzd(5, zzerVar, false);
                int iZzs3 = zzerVar.zzs() + 1;
                zzagj zzagjVar = new zzagj(zzerVar.zzi());
                zzagjVar.zzc(zzerVar.zzg() * 8);
                int i20 = 0;
                while (true) {
                    int i21 = 2;
                    int i22 = 16;
                    if (i20 >= iZzs3) {
                        int i23 = i13;
                        int i24 = 6;
                        int iZzb2 = zzagjVar.zzb(6) + i23;
                        for (int i25 = 0; i25 < iZzb2; i25++) {
                            if (zzagjVar.zzb(16) != 0) {
                                throw zzat.zzb("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int iZzb3 = zzagjVar.zzb(6) + i23;
                        int i26 = 0;
                        while (true) {
                            int i27 = 3;
                            if (i26 < iZzb3) {
                                int iZzb4 = zzagjVar.zzb(i22);
                                if (iZzb4 == 0) {
                                    int i28 = 8;
                                    zzagjVar.zzc(8);
                                    zzagjVar.zzc(16);
                                    zzagjVar.zzc(16);
                                    zzagjVar.zzc(6);
                                    zzagjVar.zzc(8);
                                    int iZzb5 = zzagjVar.zzb(4) + 1;
                                    int i29 = 0;
                                    while (i29 < iZzb5) {
                                        zzagjVar.zzc(i28);
                                        i29++;
                                        i28 = 8;
                                    }
                                } else {
                                    if (iZzb4 != i23) {
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(iZzb4).length() + 41);
                                        sb2.append("floor type greater than 1 not decodable: ");
                                        sb2.append(iZzb4);
                                        throw zzat.zzb(sb2.toString(), null);
                                    }
                                    int iZzb6 = zzagjVar.zzb(5);
                                    int[] iArr2 = new int[iZzb6];
                                    int i30 = -1;
                                    for (int i31 = 0; i31 < iZzb6; i31++) {
                                        int iZzb7 = zzagjVar.zzb(4);
                                        iArr2[i31] = iZzb7;
                                        if (iZzb7 > i30) {
                                            i30 = iZzb7;
                                        }
                                    }
                                    int i32 = i30 + 1;
                                    int[] iArr3 = new int[i32];
                                    int i33 = 0;
                                    while (i33 < i32) {
                                        int i34 = 1;
                                        iArr3[i33] = zzagjVar.zzb(i27) + 1;
                                        int iZzb8 = zzagjVar.zzb(2);
                                        if (iZzb8 > 0) {
                                            i11 = 8;
                                            zzagjVar.zzc(8);
                                        } else {
                                            i11 = 8;
                                        }
                                        int i35 = i32;
                                        int i36 = 0;
                                        while (true) {
                                            int i37 = i34 << iZzb8;
                                            iArr = iArr2;
                                            if (i36 < i37) {
                                                zzagjVar.zzc(i11);
                                                i36++;
                                                iArr2 = iArr;
                                                i11 = 8;
                                                i34 = 1;
                                            }
                                        }
                                        i33++;
                                        iArr2 = iArr;
                                        i32 = i35;
                                        i27 = 3;
                                    }
                                    int[] iArr4 = iArr2;
                                    zzagjVar.zzc(2);
                                    int iZzb9 = zzagjVar.zzb(4);
                                    int i38 = 0;
                                    int i39 = 0;
                                    for (int i40 = 0; i40 < iZzb6; i40++) {
                                        i38 += iArr3[iArr4[i40]];
                                        while (i39 < i38) {
                                            zzagjVar.zzc(iZzb9);
                                            i39++;
                                        }
                                    }
                                }
                                i26++;
                                i24 = 6;
                                i22 = 16;
                                i23 = 1;
                            } else {
                                int i41 = 1;
                                int iZzb10 = zzagjVar.zzb(i24) + 1;
                                int i42 = 0;
                                while (i42 < iZzb10) {
                                    if (zzagjVar.zzb(16) > 2) {
                                        throw zzat.zzb("residueType greater than 2 is not decodable", null);
                                    }
                                    zzagjVar.zzc(24);
                                    zzagjVar.zzc(24);
                                    zzagjVar.zzc(24);
                                    int iZzb11 = zzagjVar.zzb(i24) + i41;
                                    int i43 = 8;
                                    zzagjVar.zzc(8);
                                    int[] iArr5 = new int[iZzb11];
                                    for (int i44 = 0; i44 < iZzb11; i44++) {
                                        iArr5[i44] = ((zzagjVar.zza() ? zzagjVar.zzb(5) : 0) * 8) + zzagjVar.zzb(3);
                                    }
                                    int i45 = 0;
                                    while (i45 < iZzb11) {
                                        int i46 = 0;
                                        while (i46 < i43) {
                                            if ((iArr5[i45] & (1 << i46)) != 0) {
                                                zzagjVar.zzc(i43);
                                            }
                                            i46++;
                                            i43 = 8;
                                        }
                                        i45++;
                                        i43 = 8;
                                    }
                                    i42++;
                                    i24 = 6;
                                    i41 = 1;
                                }
                                int iZzb12 = zzagjVar.zzb(i24) + 1;
                                for (int i47 = 0; i47 < iZzb12; i47++) {
                                    int iZzb13 = zzagjVar.zzb(16);
                                    if (iZzb13 != 0) {
                                        StringBuilder sb3 = new StringBuilder(String.valueOf(iZzb13).length() + 41);
                                        sb3.append("mapping type other than 0 not supported: ");
                                        sb3.append(iZzb13);
                                        zzee.zze("VorbisUtil", sb3.toString());
                                    } else {
                                        if (zzagjVar.zza()) {
                                            i10 = 1;
                                            iZzb = zzagjVar.zzb(4) + 1;
                                        } else {
                                            i10 = 1;
                                            iZzb = 1;
                                        }
                                        if (zzagjVar.zza()) {
                                            int iZzb14 = zzagjVar.zzb(8) + i10;
                                            for (int i48 = 0; i48 < iZzb14; i48++) {
                                                int i49 = i18 - 1;
                                                zzagjVar.zzc(zzagn.zza(i49));
                                                zzagjVar.zzc(zzagn.zza(i49));
                                            }
                                        }
                                        if (zzagjVar.zzb(2) != 0) {
                                            throw zzat.zzb("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (iZzb > 1) {
                                            for (int i50 = 0; i50 < i18; i50++) {
                                                zzagjVar.zzc(4);
                                            }
                                        }
                                        for (int i51 = 0; i51 < iZzb; i51++) {
                                            zzagjVar.zzc(8);
                                            zzagjVar.zzc(8);
                                            zzagjVar.zzc(8);
                                        }
                                    }
                                }
                                int iZzb15 = zzagjVar.zzb(6);
                                int i52 = iZzb15 + 1;
                                zzagl[] zzaglVarArr = new zzagl[i52];
                                for (int i53 = 0; i53 < i52; i53++) {
                                    zzaglVarArr[i53] = new zzagl(zzagjVar.zza(), zzagjVar.zzb(16), zzagjVar.zzb(16), zzagjVar.zzb(8));
                                }
                                if (!zzagjVar.zza()) {
                                    throw zzat.zzb("framing bit after modes not set as expected", null);
                                }
                                zzaluVar = new zzalu(zzagmVar, zzagkVar, bArr, zzaglVarArr, zzagn.zza(iZzb15));
                            }
                        }
                    } else {
                        if (zzagjVar.zzb(24) != 5653314) {
                            int iZzd = zzagjVar.zzd();
                            StringBuilder sb4 = new StringBuilder(String.valueOf(iZzd).length() + 55);
                            sb4.append("expected code book to start with [0x56, 0x43, 0x42] at ");
                            sb4.append(iZzd);
                            throw zzat.zzb(sb4.toString(), null);
                        }
                        int iZzb16 = zzagjVar.zzb(16);
                        int iZzb17 = zzagjVar.zzb(24);
                        if (zzagjVar.zza()) {
                            zzagjVar.zzc(i19);
                            for (int iZzb18 = 0; iZzb18 < iZzb17; iZzb18 += zzagjVar.zzb(zzagn.zza(iZzb17 - iZzb18))) {
                            }
                        } else {
                            boolean zZza = zzagjVar.zza();
                            for (int i54 = 0; i54 < iZzb17; i54++) {
                                if (!zZza) {
                                    zzagjVar.zzc(i19);
                                } else if (zzagjVar.zza()) {
                                    zzagjVar.zzc(i19);
                                }
                            }
                        }
                        int i55 = i17;
                        int iZzb19 = zzagjVar.zzb(i55);
                        if (iZzb19 > 2) {
                            StringBuilder sb5 = new StringBuilder(String.valueOf(iZzb19).length() + 42);
                            sb5.append("lookup type greater than 2 not decodable: ");
                            sb5.append(iZzb19);
                            throw zzat.zzb(sb5.toString(), null);
                        }
                        if (iZzb19 != i13) {
                            if (iZzb19 != 2) {
                                i12 = i13;
                            }
                            i20++;
                            i13 = i12;
                            i17 = 4;
                            i19 = 5;
                        } else {
                            i21 = iZzb19;
                        }
                        zzagjVar.zzc(32);
                        zzagjVar.zzc(32);
                        int iZzb20 = zzagjVar.zzb(i55) + i13;
                        zzagjVar.zzc(i13);
                        if (i21 != i13) {
                            i12 = i13;
                            jFloor = ((long) iZzb16) * ((long) iZzb17);
                        } else if (iZzb16 != 0) {
                            i12 = i13;
                            jFloor = (long) Math.floor(Math.pow(iZzb17, 1.0d / ((double) iZzb16)));
                        } else {
                            i12 = i13;
                            jFloor = 0;
                        }
                        zzagjVar.zzc((int) (jFloor * ((long) iZzb20)));
                        i20++;
                        i13 = i12;
                        i17 = 4;
                        i19 = 5;
                    }
                }
            }
        }
        zzaluVar = null;
        this.zza = zzaluVar;
        if (zzaluVar == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        zzagm zzagmVar2 = zzaluVar.zza;
        arrayList.add(zzagmVar2.zzg);
        arrayList.add(zzaluVar.zzc);
        zzap zzapVarZzc = zzagn.zzc(zzguf.zzr(zzaluVar.zzb.zza));
        zzt zztVar = new zzt();
        zztVar.zzl("audio/ogg");
        zztVar.zzm("audio/vorbis");
        zztVar.zzh(zzagmVar2.zzd);
        zztVar.zzi(zzagmVar2.zzc);
        zztVar.zzE(zzagmVar2.zza);
        zztVar.zzF(zzagmVar2.zzb);
        zztVar.zzp(arrayList);
        zztVar.zzk(zzapVarZzc);
        zzalrVar.zza = zztVar.zzM();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzalt
    protected final void zzj(long j10) {
        super.zzj(j10);
        this.zzc = j10 != 0;
        zzagm zzagmVar = this.zzd;
        this.zzb = zzagmVar != null ? zzagmVar.zze : 0;
    }
}
