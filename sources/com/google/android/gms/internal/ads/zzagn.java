package com.google.android.gms.internal.ads;

import android.util.Base64;
import androidx.annotation.Nullable;
import com.ironsource.C4240b4;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzagn {
    public static int zza(int i10) {
        int i11 = 0;
        while (i10 > 0) {
            i10 >>>= 1;
            i11++;
        }
        return i11;
    }

    public static zzagk zzb(zzer zzerVar, boolean z10, boolean z11) throws zzat {
        if (z10) {
            zzd(3, zzerVar, false);
        }
        String strZzK = zzerVar.zzK((int) zzerVar.zzA(), StandardCharsets.UTF_8);
        int length = strZzK.length();
        long jZzA = zzerVar.zzA();
        String[] strArr = new String[(int) jZzA];
        int length2 = length + 15;
        for (int i10 = 0; i10 < jZzA; i10++) {
            String strZzK2 = zzerVar.zzK((int) zzerVar.zzA(), StandardCharsets.UTF_8);
            strArr[i10] = strZzK2;
            length2 = length2 + 4 + strZzK2.length();
        }
        if (z11 && (zzerVar.zzs() & 1) == 0) {
            throw zzat.zzb("framing bit expected to be set", null);
        }
        return new zzagk(strZzK, strArr, length2 + 1);
    }

    @Nullable
    public static zzap zzc(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = (String) list.get(i10);
            String str2 = zzfj.zza;
            String[] strArrSplit = str.split(C4240b4.j.f42668b, 2);
            if (strArrSplit.length != 2) {
                zzee.zzc("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(zzaia.zzb(new zzer(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e10) {
                    zzee.zzd("VorbisUtil", "Failed to parse vorbis picture", e10);
                }
            } else {
                arrayList.add(new zzaiy(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzap(arrayList);
    }

    public static boolean zzd(int i10, zzer zzerVar, boolean z10) throws zzat {
        if (zzerVar.zzd() < 7) {
            if (z10) {
                return false;
            }
            int iZzd = zzerVar.zzd();
            StringBuilder sb2 = new StringBuilder(String.valueOf(iZzd).length() + 18);
            sb2.append("too short header: ");
            sb2.append(iZzd);
            throw zzat.zzb(sb2.toString(), null);
        }
        if (zzerVar.zzs() != i10) {
            if (z10) {
                return false;
            }
            throw zzat.zzb("expected header type ".concat(String.valueOf(Integer.toHexString(i10))), null);
        }
        if (zzerVar.zzs() == 118 && zzerVar.zzs() == 111 && zzerVar.zzs() == 114 && zzerVar.zzs() == 98 && zzerVar.zzs() == 105 && zzerVar.zzs() == 115) {
            return true;
        }
        if (z10) {
            return false;
        }
        throw zzat.zzb("expected characters 'vorbis'", null);
    }
}
