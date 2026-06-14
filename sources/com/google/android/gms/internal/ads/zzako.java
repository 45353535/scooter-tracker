package com.google.android.gms.internal.ads;

import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.common.base.Ascii;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzako implements zzaeu {
    private static final byte[] zza = {-94, 57, 79, 82, 90, -101, 79, Ascii.DC4, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final zzv zzb;
    private long zzA;
    private long zzB;

    @Nullable
    private zzakn zzC;
    private int zzD;
    private int zzE;
    private int zzF;
    private boolean zzG;
    private boolean zzH;
    private zzaex zzI;
    private zzagh[] zzJ;
    private zzagh[] zzK;
    private boolean zzL;
    private long zzM;
    private final zzamd zzc;
    private final int zzd;
    private final List zze;
    private final SparseArray zzf;
    private final zzer zzg;
    private final zzer zzh;
    private final zzer zzi;
    private final byte[] zzj;
    private final zzer zzk;
    private final zzahz zzl;
    private final zzer zzm;
    private final ArrayDeque zzn;
    private final ArrayDeque zzo;
    private final zzgq zzp;
    private final zzaej zzq;
    private zzguf zzr;
    private int zzs;
    private int zzt;
    private long zzu;
    private int zzv;

    @Nullable
    private zzer zzw;
    private long zzx;
    private int zzy;
    private long zzz;

    static {
        zzt zztVar = new zzt();
        zztVar.zzm("application/x-emsg");
        zzb = zztVar.zzM();
    }

    @Deprecated
    public zzako() {
        this(zzamd.zza, 32, null, null, zzguf.zzi(), null);
    }

    private final void zzi() {
        this.zzs = 0;
        this.zzv = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:309:0x07b6, code lost:
    
        zzi();
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x07b9, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0276  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzj(long r59) throws com.google.android.gms.internal.ads.zzat {
        /*
            Method dump skipped, instruction units count: 1978
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzako.zzj(long):void");
    }

    private static int zzk(int i10) throws zzat {
        if (i10 >= 0) {
            return i10;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 27);
        sb2.append("Unexpected negative value: ");
        sb2.append(i10);
        throw zzat.zzb(sb2.toString(), null);
    }

    private static void zzl(zzer zzerVar, int i10, zzale zzaleVar) throws zzat {
        zzerVar.zzh(i10 + 8);
        int iZzB = zzerVar.zzB();
        int i11 = zzakh.zza;
        if ((iZzB & 1) != 0) {
            throw zzat.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z10 = (iZzB & 2) != 0;
        int iZzH = zzerVar.zzH();
        if (iZzH == 0) {
            Arrays.fill(zzaleVar.zzl, 0, zzaleVar.zze, false);
            return;
        }
        int i12 = zzaleVar.zze;
        if (iZzH != i12) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(iZzH).length() + 58 + String.valueOf(i12).length());
            sb2.append("Senc sample count ");
            sb2.append(iZzH);
            sb2.append(" is different from fragment sample count");
            sb2.append(i12);
            throw zzat.zzb(sb2.toString(), null);
        }
        Arrays.fill(zzaleVar.zzl, 0, iZzH, z10);
        zzaleVar.zza(zzerVar.zzd());
        zzer zzerVar2 = zzaleVar.zzn;
        zzerVar.zzm(zzerVar2.zzi(), 0, zzerVar2.zze());
        zzerVar2.zzh(0);
        zzaleVar.zzo = false;
    }

    private static Pair zzm(zzer zzerVar, long j10) throws zzat {
        long jZzJ;
        long jZzJ2;
        zzer zzerVar2 = zzerVar;
        zzerVar2.zzh(8);
        int iZza = zzakh.zza(zzerVar2.zzB());
        zzerVar2.zzk(4);
        long jZzz = zzerVar2.zzz();
        if (iZza == 0) {
            jZzJ = zzerVar2.zzz();
            jZzJ2 = zzerVar2.zzz();
        } else {
            jZzJ = zzerVar2.zzJ();
            jZzJ2 = zzerVar2.zzJ();
        }
        long j11 = j10 + jZzJ2;
        long jZzt = zzfj.zzt(jZzJ, 1000000L, jZzz, RoundingMode.DOWN);
        zzerVar2.zzk(2);
        int iZzt = zzerVar2.zzt();
        int[] iArr = new int[iZzt];
        long[] jArr = new long[iZzt];
        long[] jArr2 = new long[iZzt];
        long[] jArr3 = new long[iZzt];
        long j12 = j11;
        long j13 = jZzt;
        int i10 = 0;
        while (i10 < iZzt) {
            int iZzB = zzerVar2.zzB();
            if ((Integer.MIN_VALUE & iZzB) != 0) {
                throw zzat.zzb("Unhandled indirect reference", null);
            }
            long jZzz2 = zzerVar2.zzz();
            iArr[i10] = iZzB & Integer.MAX_VALUE;
            jArr[i10] = j12;
            jArr3[i10] = j13;
            jZzJ += jZzz2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            long jZzt2 = zzfj.zzt(jZzJ, 1000000L, jZzz, RoundingMode.DOWN);
            jArr4[i10] = jZzt2 - jArr5[i10];
            zzerVar2.zzk(4);
            j12 += (long) iArr[i10];
            i10++;
            zzerVar2 = zzerVar;
            iZzt = iZzt;
            j13 = jZzt2;
            jArr2 = jArr4;
            jArr3 = jArr5;
        }
        return Pair.create(Long.valueOf(jZzt), new zzaei(iArr, jArr, jArr2, jArr3));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0156  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.zzq zzn(java.util.List r19) {
        /*
            Method dump skipped, instruction units count: 371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzako.zzn(java.util.List):com.google.android.gms.internal.ads.zzq");
    }

    private static final zzaki zzo(SparseArray sparseArray, int i10) {
        if (sparseArray.size() == 1) {
            return (zzaki) sparseArray.valueAt(0);
        }
        zzaki zzakiVar = (zzaki) sparseArray.get(i10);
        zzakiVar.getClass();
        return zzakiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) throws IOException {
        zzagc zzagcVarZza = zzalb.zza(zzaevVar);
        this.zzr = zzagcVarZza != null ? zzguf.zzj(zzagcVarZza) : zzguf.zzi();
        return zzagcVarZza == null;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final /* synthetic */ List zzb() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        int i10;
        int i11 = this.zzd;
        if ((i11 & 32) == 0) {
            zzaexVar = new zzamg(zzaexVar, this.zzc);
        }
        this.zzI = zzaexVar;
        zzi();
        zzagh[] zzaghVarArr = new zzagh[2];
        this.zzJ = zzaghVarArr;
        int i12 = 100;
        int i13 = 0;
        if ((i11 & 4) != 0) {
            zzaghVarArr[0] = this.zzI.zzu(100, 5);
            i10 = 1;
            i12 = 101;
        } else {
            i10 = 0;
        }
        zzagh[] zzaghVarArr2 = (zzagh[]) zzfj.zzb(this.zzJ, i10);
        this.zzJ = zzaghVarArr2;
        for (zzagh zzaghVar : zzaghVarArr2) {
            zzaghVar.zzz(zzb);
        }
        List list = this.zze;
        this.zzK = new zzagh[list.size()];
        while (i13 < this.zzK.length) {
            zzagh zzaghVarZzu = this.zzI.zzu(i12, 3);
            zzaghVarZzu.zzz((zzv) list.get(i13));
            this.zzK[i13] = zzaghVarZzu;
            i13++;
            i12++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01eb, code lost:
    
        r30.zzG = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01fe, code lost:
    
        throw com.google.android.gms.internal.ads.zzat.zzb("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0201, code lost:
    
        if (r30.zzH == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0203, code lost:
    
        r7 = r30.zzi;
        r7.zza(r4);
        r31.zzc(r7.zzi(), 0, r30.zzF);
        r6.zzc(r7, r30.zzF);
        r4 = r30.zzF;
        r32 = r5;
        r5 = com.google.android.gms.internal.ads.zzgm.zza(r7.zzi(), r7.zze());
        r7.zzh(0);
        r7.zzf(r5);
        r5 = r3.zzg.zzq;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0232, code lost:
    
        if (r5 != (-1)) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0234, code lost:
    
        r5 = r30.zzp;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x023a, code lost:
    
        if (r5.zzb() == 0) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x023c, code lost:
    
        r5.zza(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0240, code lost:
    
        r9 = r30.zzp;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0246, code lost:
    
        if (r9.zzb() == r5) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0248, code lost:
    
        r9.zza(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x024b, code lost:
    
        r5 = r30.zzp;
        r5.zzc(r10, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0256, code lost:
    
        if ((r2.zzg() & 4) == 0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0258, code lost:
    
        r5.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x025c, code lost:
    
        r32 = r5;
        r4 = r6.zza(r31, r4, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0263, code lost:
    
        r30.zzE += r4;
        r30.zzF -= r4;
        r5 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0270, code lost:
    
        r1 = r2.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0276, code lost:
    
        if (r30.zzG != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0278, code lost:
    
        r1 = r1 | androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x027b, code lost:
    
        r22 = r1;
        r1 = r2.zzj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0281, code lost:
    
        if (r1 == null) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0283, code lost:
    
        r25 = r1.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0288, code lost:
    
        r25 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x028a, code lost:
    
        r6.zze(r10, r22, r30.zzD, 0, r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0297, code lost:
    
        r1 = r30.zzo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x029d, code lost:
    
        if (r1.isEmpty() != false) goto L444;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x029f, code lost:
    
        r1 = (com.google.android.gms.internal.ads.zzakm) r1.removeFirst();
        r3 = r30.zzy;
        r8 = r1.zzc;
        r30.zzy = r3 - r8;
        r3 = r1.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02b0, code lost:
    
        if (r1.zzb == false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02b2, code lost:
    
        r3 = r3 + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02b4, code lost:
    
        r5 = r3;
        r1 = r30.zzJ;
        r3 = r1.length;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02b9, code lost:
    
        if (r11 >= r3) goto L447;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02bb, code lost:
    
        r1[r11].zze(r5, 1, r8, r30.zzy, null);
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02cb, code lost:
    
        if (r2.zzh() != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02cd, code lost:
    
        r30.zzC = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02d0, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02d1, code lost:
    
        r30.zzs = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02d5, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x057c, code lost:
    
        throw com.google.android.gms.internal.ads.zzat.zzc("Atom size less than header length (unsupported).");
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009c, code lost:
    
        r5 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009f, code lost:
    
        if (r30.zzs != 3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a1, code lost:
    
        r30.zzD = r2.zzf();
        r3 = r2.zzd.zza.zzg.zzo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b5, code lost:
    
        if (j$.util.Objects.equals(r3, "video/avc") != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b7, code lost:
    
        j$.util.Objects.equals(r3, "video/hevc");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bc, code lost:
    
        r30.zzG = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c2, code lost:
    
        if (r2.zzf >= r2.zzi) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c4, code lost:
    
        r31.zzf(r30.zzD);
        r1 = r2.zzj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cd, code lost:
    
        if (r1 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d0, code lost:
    
        r3 = r2.zzb;
        r5 = r3.zzn;
        r1 = r1.zzd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d6, code lost:
    
        if (r1 == 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d8, code lost:
    
        r5.zzk(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e1, code lost:
    
        if (r3.zzb(r2.zzf) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e3, code lost:
    
        r5.zzk(r5.zzt() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f0, code lost:
    
        if (r2.zzh() != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f2, code lost:
    
        r30.zzC = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f4, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00fd, code lost:
    
        if (r2.zzd.zza.zzh != 1) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ff, code lost:
    
        r30.zzD -= 8;
        r31.zzf(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0116, code lost:
    
        if ("audio/ac4".equals(r2.zzd.zza.zzg.zzo) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0118, code lost:
    
        r30.zzE = r2.zzi(r30.zzD, 7);
        r3 = r30.zzD;
        r8 = r30.zzk;
        com.google.android.gms.internal.ads.zzady.zzc(r3, r8);
        r2.zza.zzc(r8, 7);
        r3 = r30.zzE + 7;
        r30.zzE = r3;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0134, code lost:
    
        r6 = 0;
        r3 = r2.zzi(r30.zzD, 0);
        r30.zzE = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x013d, code lost:
    
        r30.zzD += r3;
        r30.zzs = 4;
        r30.zzF = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0146, code lost:
    
        r3 = r2.zzd.zza;
        r6 = r2.zza;
        r10 = r2.zzd();
        r8 = r3.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0152, code lost:
    
        if (r8 != 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0154, code lost:
    
        r3 = r30.zzE;
        r5 = r30.zzD;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0158, code lost:
    
        if (r3 >= r5) goto L443;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x015a, code lost:
    
        r30.zzE += r6.zza(r31, r5 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0166, code lost:
    
        r13 = r30.zzh;
        r14 = r13.zzi();
        r14[0] = 0;
        r14[1] = 0;
        r14[r17] = 0;
        r12 = 4 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0179, code lost:
    
        if (r30.zzE >= r30.zzD) goto L448;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x017b, code lost:
    
        r4 = r30.zzF;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x017d, code lost:
    
        if (r4 != 0) goto L449;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0182, code lost:
    
        if (r30.zzK.length > 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0186, code lost:
    
        if (r30.zzG != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0189, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x018b, code lost:
    
        r4 = com.google.android.gms.internal.ads.zzgm.zzc(r3.zzg);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0198, code lost:
    
        if ((r8 + r4) <= (r30.zzD - r30.zzE)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x019b, code lost:
    
        r31.zzc(r14, r12, r8 + r4);
        r13.zzh(0);
        r9 = r13.zzB();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01a8, code lost:
    
        if (r9 < 0) goto L450;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01aa, code lost:
    
        r30.zzF = r9 - r4;
        r9 = r30.zzg;
        r9.zzh(0);
        r6.zzc(r9, r5);
        r30.zzE += r5;
        r30.zzD += r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01c2, code lost:
    
        if (r30.zzK.length <= 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01c4, code lost:
    
        if (r4 <= 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01ce, code lost:
    
        if (com.google.android.gms.internal.ads.zzgm.zzb(r3.zzg, r14[r5]) == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01d0, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01d2, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01d3, code lost:
    
        r30.zzH = r7;
        r6.zzc(r13, r4);
        r30.zzE += r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01dd, code lost:
    
        if (r4 <= 0) goto L451;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e1, code lost:
    
        if (r30.zzG != false) goto L452;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01e9, code lost:
    
        if (com.google.android.gms.internal.ads.zzgm.zzd(r14, r5, r4, r3.zzg) == false) goto L453;
     */
    @Override // com.google.android.gms.internal.ads.zzaeu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzd(com.google.android.gms.internal.ads.zzaev r31, com.google.android.gms.internal.ads.zzafv r32) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1919
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzako.zzd(com.google.android.gms.internal.ads.zzaev, com.google.android.gms.internal.ads.zzafv):int");
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j10, long j11) {
        SparseArray sparseArray = this.zzf;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((zzakn) sparseArray.valueAt(i10)).zzc();
        }
        this.zzo.clear();
        this.zzy = 0;
        this.zzp.zzd();
        this.zzz = j11;
        this.zzn.clear();
        zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public /* synthetic */ zzaeu zzg() {
        return k.b(this);
    }

    final /* synthetic */ void zzh(long j10, zzer zzerVar) {
        zzaeh.zza(j10, zzerVar, this.zzK);
    }

    public zzako(zzamd zzamdVar, int i10, @Nullable zzfg zzfgVar, @Nullable zzalc zzalcVar, List list, @Nullable zzagh zzaghVar) {
        this.zzc = zzamdVar;
        this.zzd = i10;
        this.zze = DesugarCollections.unmodifiableList(list);
        this.zzl = new zzahz();
        this.zzm = new zzer(16);
        this.zzg = new zzer(zzgm.zza);
        this.zzh = new zzer(6);
        this.zzi = new zzer();
        byte[] bArr = new byte[16];
        this.zzj = bArr;
        this.zzk = new zzer(bArr);
        this.zzn = new ArrayDeque();
        this.zzo = new ArrayDeque();
        this.zzf = new SparseArray();
        this.zzr = zzguf.zzi();
        this.zzA = -9223372036854775807L;
        this.zzz = -9223372036854775807L;
        this.zzB = -9223372036854775807L;
        this.zzI = zzaex.zza;
        this.zzJ = new zzagh[0];
        this.zzK = new zzagh[0];
        this.zzp = new zzgq(new zzgp() { // from class: com.google.android.gms.internal.ads.zzakl
            @Override // com.google.android.gms.internal.ads.zzgp
            public final /* synthetic */ void zza(long j10, zzer zzerVar) {
                this.zza.zzh(j10, zzerVar);
            }
        });
        this.zzq = new zzaej();
        this.zzM = -1L;
    }
}
