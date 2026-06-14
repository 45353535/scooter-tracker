package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzajg {
    public byte[] zzO;
    public zzagi zzU;
    public boolean zzW;
    public zzagh zzY;
    public zzv zzZ;
    public boolean zza;
    public int zzaa;
    private int zzab;
    public String zzb;
    public String zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;
    public boolean zzh;
    public byte[] zzi;
    public zzagg zzj;
    public byte[] zzk;
    public zzq zzl;
    public int zzm = -1;
    public int zzn = -1;
    public int zzo = -1;
    public int zzp = -1;
    public int zzq = -1;
    public int zzr = 0;
    public int zzs = -1;
    public float zzt = 0.0f;
    public float zzu = 0.0f;
    public float zzv = 0.0f;
    public byte[] zzw = null;
    public int zzx = -1;
    public boolean zzy = false;
    public int zzz = -1;
    public int zzA = -1;
    public int zzB = -1;
    public int zzC = 1000;
    public int zzD = 200;
    public float zzE = -1.0f;
    public float zzF = -1.0f;
    public float zzG = -1.0f;
    public float zzH = -1.0f;
    public float zzI = -1.0f;
    public float zzJ = -1.0f;
    public float zzK = -1.0f;
    public float zzL = -1.0f;
    public float zzM = -1.0f;
    public float zzN = -1.0f;
    public int zzP = 1;
    public int zzQ = -1;
    public int zzR = 8000;
    public long zzS = 0;
    public long zzT = 0;
    public boolean zzV = false;
    public boolean zzX = true;
    private String zzac = "eng";

    protected zzajg() {
    }

    private static Pair zzf(zzer zzerVar) throws zzat {
        try {
            zzerVar.zzk(16);
            long jZzA = zzerVar.zzA();
            if (jZzA == 1482049860) {
                return new Pair("video/divx", null);
            }
            if (jZzA == 859189832) {
                return new Pair("video/3gpp", null);
            }
            if (jZzA != 826496599) {
                zzee.zzc("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair("video/x-unknown", null);
            }
            int iZzg = zzerVar.zzg() + 20;
            byte[] bArrZzi = zzerVar.zzi();
            while (true) {
                int length = bArrZzi.length;
                if (iZzg >= length - 4) {
                    throw zzat.zzb("Failed to find FourCC VC1 initialization data", null);
                }
                int i10 = iZzg + 1;
                if (bArrZzi[iZzg] == 0 && bArrZzi[i10] == 0 && bArrZzi[iZzg + 2] == 1 && bArrZzi[iZzg + 3] == 15) {
                    return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArrZzi, iZzg, length)));
                }
                iZzg = i10;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzat.zzb("Error parsing FourCC private data", null);
        }
    }

    private static List zzg(byte[] bArr) throws zzat {
        int i10;
        int i11;
        try {
            if (bArr[0] != 2) {
                throw zzat.zzb("Error parsing vorbis codec private", null);
            }
            int i12 = 0;
            int i13 = 1;
            while (true) {
                int i14 = bArr[i13];
                i13++;
                i10 = i14 & 255;
                if (i10 != 255) {
                    break;
                }
                i12 += 255;
            }
            int i15 = i12 + i10;
            int i16 = 0;
            while (true) {
                int i17 = bArr[i13];
                i13++;
                i11 = i17 & 255;
                if (i11 != 255) {
                    break;
                }
                i16 += 255;
            }
            int i18 = i16 + i11;
            if (bArr[i13] != 1) {
                throw zzat.zzb("Error parsing vorbis codec private", null);
            }
            byte[] bArr2 = new byte[i15];
            System.arraycopy(bArr, i13, bArr2, 0, i15);
            int i19 = i13 + i15;
            if (bArr[i19] != 3) {
                throw zzat.zzb("Error parsing vorbis codec private", null);
            }
            int i20 = i19 + i18;
            if (bArr[i20] != 5) {
                throw zzat.zzb("Error parsing vorbis codec private", null);
            }
            int length = bArr.length - i20;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, i20, bArr3, 0, length);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(bArr2);
            arrayList.add(bArr3);
            return arrayList;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzat.zzb("Error parsing vorbis codec private", null);
        }
    }

    private static boolean zzh(zzer zzerVar) throws zzat {
        try {
            int iZzu = zzerVar.zzu();
            if (iZzu == 1) {
                return true;
            }
            if (iZzu == 65534) {
                zzerVar.zzh(24);
                if (zzerVar.zzD() == zzajh.zzf.getMostSignificantBits()) {
                    if (zzerVar.zzD() == zzajh.zzf.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzat.zzb("Error parsing MS/ACM codec private", null);
        }
    }

    private final byte[] zzi(String str) throws zzat {
        byte[] bArr = this.zzk;
        if (bArr != null) {
            return bArr;
        }
        throw zzat.zzb("Missing CodecPrivate for codec ".concat(String.valueOf(str)), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:107:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0633  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(int r20) throws com.google.android.gms.internal.ads.zzat {
        /*
            Method dump skipped, instruction units count: 1834
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajg.zza(int):void");
    }

    final /* synthetic */ void zzb() {
        this.zzY.getClass();
    }

    final /* synthetic */ int zzc() {
        return this.zzab;
    }

    final /* synthetic */ void zzd(int i10) {
        this.zzab = i10;
    }

    final /* synthetic */ void zze(String str) {
        this.zzac = str;
    }
}
