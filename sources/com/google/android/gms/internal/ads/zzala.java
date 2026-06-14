package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
final class zzala {
    private static final zzgrr zza = zzgrr.zza(zzgqq.zzc(':'));
    private static final zzgrr zzb = zzgrr.zza(zzgqq.zzc('*'));
    private final List zzc = new ArrayList();
    private int zzd = 0;
    private int zze;

    public final void zza() {
        this.zzc.clear();
        this.zzd = 0;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final int zzb(zzaev zzaevVar, zzafv zzafvVar, List list) throws IOException {
        int i10;
        byte b10;
        char c10;
        int i11 = this.zzd;
        if (i11 == 0) {
            long jZzo = zzaevVar.zzo();
            zzafvVar.zza = (jZzo == -1 || jZzo < 8) ? 0L : jZzo - 8;
            this.zzd = 1;
            return 1;
        }
        int i12 = 2;
        if (i11 != 1) {
            short s10 = 2817;
            short s11 = 2816;
            short s12 = 2192;
            if (i11 != 2) {
                long jZzn = zzaevVar.zzn();
                int iZzo = (int) ((zzaevVar.zzo() - zzaevVar.zzn()) - ((long) this.zze));
                zzer zzerVar = new zzer(iZzo);
                zzaevVar.zzc(zzerVar.zzi(), 0, iZzo);
                int i13 = 0;
                while (true) {
                    List list2 = this.zzc;
                    if (i13 >= list2.size()) {
                        zzafvVar.zza = 0L;
                        return 1;
                    }
                    zzakz zzakzVar = (zzakz) list2.get(i13);
                    zzerVar.zzh((int) (zzakzVar.zza - jZzn));
                    zzerVar.zzk(4);
                    int iZzC = zzerVar.zzC();
                    Charset charset = StandardCharsets.UTF_8;
                    String strZzK = zzerVar.zzK(iZzC, charset);
                    switch (strZzK.hashCode()) {
                        case -1711564334:
                            b10 = strZzK.equals("SlowMotion_Data") ? (byte) 0 : (byte) -1;
                            break;
                        case -1332107749:
                            b10 = strZzK.equals("Super_SlowMotion_Edit_Data") ? (byte) 3 : (byte) -1;
                            break;
                        case -1251387154:
                            b10 = strZzK.equals("Super_SlowMotion_Data") ? (byte) 1 : (byte) -1;
                            break;
                        case -830665521:
                            b10 = strZzK.equals("Super_SlowMotion_Deflickering_On") ? (byte) 4 : (byte) -1;
                            break;
                        case 1760745220:
                            b10 = strZzK.equals("Super_SlowMotion_BGM") ? (byte) 2 : (byte) -1;
                            break;
                        default:
                            b10 = -1;
                            break;
                    }
                    if (b10 == 0) {
                        c10 = 2192;
                    } else if (b10 == 1) {
                        c10 = 2816;
                    } else if (b10 == 2) {
                        c10 = 2817;
                    } else if (b10 == 3) {
                        c10 = 2819;
                    } else {
                        if (b10 != 4) {
                            throw zzat.zzb("Invalid SEF name", null);
                        }
                        c10 = 2820;
                    }
                    int i14 = zzakzVar.zzb - (iZzC + 8);
                    if (c10 == 2192) {
                        ArrayList arrayList = new ArrayList();
                        List listZze = zzb.zze(zzerVar.zzK(i14, charset));
                        for (int i15 = 0; i15 < listZze.size(); i15++) {
                            List listZze2 = zza.zze((CharSequence) listZze.get(i15));
                            if (listZze2.size() != 3) {
                                throw zzat.zzb(null, null);
                            }
                            try {
                                arrayList.add(new zzaiv(Long.parseLong((String) listZze2.get(0)), Long.parseLong((String) listZze2.get(1)), 1 << (Integer.parseInt((String) listZze2.get(2)) - 1)));
                            } catch (NumberFormatException e10) {
                                throw zzat.zzb(null, e10);
                            }
                        }
                        list.add(new zzaiw(arrayList));
                    } else if (c10 != 2816 && c10 != 2817 && c10 != 2819 && c10 != 2820) {
                        throw new IllegalStateException();
                    }
                    i13++;
                }
            } else {
                long jZzo2 = zzaevVar.zzo();
                int i16 = this.zze - 20;
                zzer zzerVar2 = new zzer(i16);
                zzaevVar.zzc(zzerVar2.zzi(), 0, i16);
                int i17 = 0;
                while (i17 < i16 / 12) {
                    zzerVar2.zzk(i12);
                    short sZzw = zzerVar2.zzw();
                    if (sZzw == s12 || sZzw == s11 || sZzw == s10 || sZzw == 2819 || sZzw == 2820) {
                        i10 = i16;
                        this.zzc.add(new zzakz(sZzw, (jZzo2 - ((long) this.zze)) - ((long) zzerVar2.zzC()), zzerVar2.zzC()));
                    } else {
                        zzerVar2.zzk(8);
                        i10 = i16;
                    }
                    i17++;
                    i16 = i10;
                    i12 = 2;
                    s10 = 2817;
                    s11 = 2816;
                    s12 = 2192;
                }
                List list3 = this.zzc;
                if (list3.isEmpty()) {
                    zzafvVar.zza = 0L;
                } else {
                    this.zzd = 3;
                    zzafvVar.zza = ((zzakz) list3.get(0)).zza;
                }
            }
        } else {
            zzer zzerVar3 = new zzer(8);
            zzaevVar.zzc(zzerVar3.zzi(), 0, 8);
            this.zze = zzerVar3.zzC() + 8;
            if (zzerVar3.zzB() != 1397048916) {
                zzafvVar.zza = 0L;
            } else {
                zzafvVar.zza = zzaevVar.zzn() - ((long) (this.zze - 12));
                this.zzd = 2;
            }
        }
        return 1;
    }
}
