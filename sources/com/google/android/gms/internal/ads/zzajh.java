package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.collection.SieveCacheKt;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.common.primitives.UnsignedBytes;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes8.dex */
public final class zzajh implements zzaeu {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] zzc;
    private static final byte[] zzd;
    private static final byte[] zze;
    private static final UUID zzf;
    private static final Map zzg;
    private long zzA;
    private long zzB;
    private boolean zzC;
    private boolean zzD;

    @Nullable
    private zzajg zzE;
    private boolean zzF;
    private int zzG;
    private long zzH;
    private final SparseArray zzI;
    private boolean zzJ;
    private long zzK;
    private int zzL;
    private long zzM;
    private long zzN;
    private int zzO;
    private boolean zzP;
    private long zzQ;
    private long zzR;
    private long zzS;
    private boolean zzT;
    private int zzU;
    private long zzV;
    private long zzW;
    private int zzX;
    private int zzY;
    private int[] zzZ;
    private int zzaa;
    private int zzab;
    private int zzac;
    private int zzad;
    private boolean zzae;
    private long zzaf;
    private int zzag;
    private int zzah;
    private int zzai;
    private boolean zzaj;
    private boolean zzak;
    private boolean zzal;
    private int zzam;
    private byte zzan;
    private boolean zzao;
    private zzaex zzap;
    private final zzaja zzaq;
    private final zzajj zzh;
    private final SparseArray zzi;
    private final boolean zzj;
    private final boolean zzk;
    private final zzamd zzl;
    private final zzer zzm;
    private final zzer zzn;
    private final zzer zzo;
    private final zzer zzp;
    private final zzer zzq;
    private final zzer zzr;
    private final zzer zzs;
    private final zzer zzt;
    private final zzer zzu;
    private final zzer zzv;
    private ByteBuffer zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    static {
        String str = zzfj.zza;
        zzc = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        zzd = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        zze = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        zzf = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", 180);
        map.put("htc_video_rotA-270", 270);
        zzg = DesugarCollections.unmodifiableMap(map);
    }

    @Deprecated
    public zzajh() {
        this(new zzaja(), 2, zzamd.zza);
    }

    private static int[] zzA(@Nullable int[] iArr, int i10) {
        if (iArr == null) {
            return new int[i10];
        }
        int length = iArr.length;
        return length >= i10 ? iArr : new int[Math.max(length + length, i10)];
    }

    private final void zzB() {
        if (!this.zzD) {
            return;
        }
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.zzi;
            if (i10 >= sparseArray.size()) {
                zzaex zzaexVar = this.zzap;
                zzaexVar.getClass();
                zzaexVar.zzv();
                this.zzD = false;
                return;
            }
            if (((zzajg) sparseArray.valueAt(i10)).zzV) {
                return;
            } else {
                i10++;
            }
        }
    }

    private final void zzq(int i10) throws zzat {
        if (this.zzE != null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 32);
        sb2.append("Element ");
        sb2.append(i10);
        sb2.append(" must be in a TrackEntry");
        throw zzat.zzb(sb2.toString(), null);
    }

    private final void zzr(int i10) throws zzat {
        if (this.zzJ) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 26);
        sb2.append("Element ");
        sb2.append(i10);
        sb2.append(" must be in a Cues");
        throw zzat.zzb(sb2.toString(), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzs(com.google.android.gms.internal.ads.zzajg r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajh.zzs(com.google.android.gms.internal.ads.zzajg, long, int, int, int):void");
    }

    private final void zzt(zzaev zzaevVar, int i10) throws IOException {
        zzer zzerVar = this.zzo;
        if (zzerVar.zze() >= i10) {
            return;
        }
        if (zzerVar.zzj() < i10) {
            int iZzj = zzerVar.zzj();
            zzerVar.zzc(Math.max(iZzj + iZzj, i10));
        }
        zzaevVar.zzc(zzerVar.zzi(), zzerVar.zze(), i10 - zzerVar.zze());
        zzerVar.zzf(i10);
    }

    private final int zzu(zzaev zzaevVar, zzajg zzajgVar, int i10, boolean z10) throws IOException {
        int i11;
        String str = zzajgVar.zzc;
        if ("S_TEXT/UTF8".equals(str)) {
            zzw(zzaevVar, zzb, i10);
            int i12 = this.zzah;
            zzv();
            return i12;
        }
        if ("S_TEXT/ASS".equals(str) || "S_TEXT/SSA".equals(str)) {
            zzw(zzaevVar, zzd, i10);
            int i13 = this.zzah;
            zzv();
            return i13;
        }
        if ("S_TEXT/WEBVTT".equals(str)) {
            zzw(zzaevVar, zze, i10);
            int i14 = this.zzah;
            zzv();
            return i14;
        }
        if (zzajgVar.zzV) {
            zzajgVar.zzZ.getClass();
            int i15 = zzaet.zza;
            zzer zzerVar = new zzer(i10);
            if (zzaevVar.zzh(zzerVar.zzi(), 0, i10, true)) {
                zzaevVar.zzl();
                if (zzaet.zza(zzerVar.zzr()) == 1 && zzerVar.zzd() >= 10) {
                    byte[] bArr = new byte[10];
                    zzerVar.zzm(bArr, 0, 10);
                    zzerVar.zzh(0);
                    int iZzc = zzaet.zzc(bArr);
                    if (zzerVar.zzd() >= iZzc + 4) {
                        zzerVar.zzk(iZzc);
                        if (zzaet.zza(zzerVar.zzB()) == 2) {
                            zzt zztVarZza = zzajgVar.zzZ.zza();
                            zztVarZza.zzm("audio/vnd.dts.hd");
                            zzajgVar.zzZ = zztVarZza.zzM();
                        }
                    }
                }
            }
            zzajgVar.zzY.zzz(zzajgVar.zzZ);
            zzajgVar.zzV = false;
            zzB();
        }
        zzagh zzaghVar = zzajgVar.zzY;
        if (!this.zzaj) {
            if (zzajgVar.zzh) {
                this.zzac &= -1073741825;
                if (!this.zzak) {
                    zzer zzerVar2 = this.zzo;
                    zzaevVar.zzc(zzerVar2.zzi(), 0, 1);
                    this.zzag++;
                    if ((zzerVar2.zzi()[0] & UnsignedBytes.MAX_POWER_OF_TWO) == 128) {
                        throw zzat.zzb("Extension bit is set in signal byte", null);
                    }
                    this.zzan = zzerVar2.zzi()[0];
                    this.zzak = true;
                }
                byte b10 = this.zzan;
                if ((b10 & 1) == 1) {
                    int i16 = b10 & 2;
                    this.zzac |= 1073741824;
                    if (!this.zzao) {
                        zzer zzerVar3 = this.zzt;
                        zzaevVar.zzc(zzerVar3.zzi(), 0, 8);
                        this.zzag += 8;
                        this.zzao = true;
                        zzer zzerVar4 = this.zzo;
                        zzerVar4.zzi()[0] = (byte) ((i16 != 2 ? 0 : 128) | 8);
                        zzerVar4.zzh(0);
                        zzaghVar.zzd(zzerVar4, 1, 1);
                        this.zzah++;
                        zzerVar3.zzh(0);
                        zzaghVar.zzd(zzerVar3, 8, 1);
                        this.zzah += 8;
                    }
                    if (i16 == 2) {
                        if (!this.zzal) {
                            zzer zzerVar5 = this.zzo;
                            zzaevVar.zzc(zzerVar5.zzi(), 0, 1);
                            this.zzag++;
                            zzerVar5.zzh(0);
                            this.zzam = zzerVar5.zzs();
                            this.zzal = true;
                        }
                        int i17 = this.zzam * 4;
                        zzer zzerVar6 = this.zzo;
                        zzerVar6.zza(i17);
                        zzaevVar.zzc(zzerVar6.zzi(), 0, i17);
                        this.zzag += i17;
                        int i18 = (this.zzam >> 1) + 1;
                        int i19 = (i18 * 6) + 2;
                        ByteBuffer byteBuffer = this.zzw;
                        if (byteBuffer == null || byteBuffer.capacity() < i19) {
                            this.zzw = ByteBuffer.allocate(i19);
                        }
                        this.zzw.position(0);
                        this.zzw.putShort((short) i18);
                        int i20 = 0;
                        int i21 = 0;
                        while (true) {
                            i11 = this.zzam;
                            if (i20 >= i11) {
                                break;
                            }
                            int iZzH = zzerVar6.zzH();
                            int i22 = iZzH - i21;
                            if (i20 % 2 == 0) {
                                this.zzw.putShort((short) i22);
                            } else {
                                this.zzw.putInt(i22);
                            }
                            i20++;
                            i21 = iZzH;
                        }
                        int i23 = (i10 - this.zzag) - i21;
                        if ((i11 & 1) == 1) {
                            this.zzw.putInt(i23);
                        } else {
                            this.zzw.putShort((short) i23);
                            this.zzw.putInt(0);
                        }
                        zzer zzerVar7 = this.zzu;
                        zzerVar7.zzb(this.zzw.array(), i19);
                        zzaghVar.zzd(zzerVar7, i19, 1);
                        this.zzah += i19;
                    }
                }
            } else {
                byte[] bArr2 = zzajgVar.zzi;
                if (bArr2 != null) {
                    this.zzr.zzb(bArr2, bArr2.length);
                }
            }
            if (!"A_OPUS".equals(zzajgVar.zzc) ? zzajgVar.zzg > 0 : z10) {
                this.zzac |= 268435456;
                this.zzv.zza(0);
                int iZze = (this.zzr.zze() + i10) - this.zzag;
                zzer zzerVar8 = this.zzo;
                zzerVar8.zza(4);
                zzerVar8.zzi()[0] = (byte) ((iZze >> 24) & 255);
                zzerVar8.zzi()[1] = (byte) ((iZze >> 16) & 255);
                zzerVar8.zzi()[2] = (byte) ((iZze >> 8) & 255);
                zzerVar8.zzi()[3] = (byte) (iZze & 255);
                zzaghVar.zzd(zzerVar8, 4, 2);
                this.zzah += 4;
            }
            this.zzaj = true;
        }
        zzer zzerVar9 = this.zzr;
        int iZze2 = i10 + zzerVar9.zze();
        String str2 = zzajgVar.zzc;
        if (!"V_MPEG4/ISO/AVC".equals(str2) && !"V_MPEGH/ISO/HEVC".equals(str2)) {
            if (zzajgVar.zzU != null) {
                zzgrc.zzi(zzerVar9.zze() == 0);
                zzajgVar.zzU.zzb(zzaevVar);
            }
            while (true) {
                int i24 = this.zzag;
                if (i24 >= iZze2) {
                    break;
                }
                int iZzy = zzy(zzaevVar, zzaghVar, iZze2 - i24);
                this.zzag += iZzy;
                this.zzah += iZzy;
            }
        } else {
            zzer zzerVar10 = this.zzn;
            byte[] bArrZzi = zzerVar10.zzi();
            bArrZzi[0] = 0;
            bArrZzi[1] = 0;
            bArrZzi[2] = 0;
            int i25 = zzajgVar.zzaa;
            int i26 = 4 - i25;
            while (this.zzag < iZze2) {
                int i27 = this.zzai;
                if (i27 == 0) {
                    int iMin = Math.min(i25, zzerVar9.zzd());
                    zzaevVar.zzc(bArrZzi, i26 + iMin, i25 - iMin);
                    if (iMin > 0) {
                        zzerVar9.zzm(bArrZzi, i26, iMin);
                    }
                    this.zzag += i25;
                    zzerVar10.zzh(0);
                    this.zzai = zzerVar10.zzH();
                    zzer zzerVar11 = this.zzm;
                    zzerVar11.zzh(0);
                    zzaghVar.zzc(zzerVar11, 4);
                    this.zzah += 4;
                } else {
                    int iZzy2 = zzy(zzaevVar, zzaghVar, i27);
                    this.zzag += iZzy2;
                    this.zzah += iZzy2;
                    this.zzai -= iZzy2;
                }
            }
        }
        if ("A_VORBIS".equals(zzajgVar.zzc)) {
            zzer zzerVar12 = this.zzp;
            zzerVar12.zzh(0);
            zzaghVar.zzc(zzerVar12, 4);
            this.zzah += 4;
        }
        int i28 = this.zzah;
        zzv();
        return i28;
    }

    private final void zzv() {
        this.zzag = 0;
        this.zzah = 0;
        this.zzai = 0;
        this.zzaj = false;
        this.zzak = false;
        this.zzal = false;
        this.zzam = 0;
        this.zzan = (byte) 0;
        this.zzao = false;
        this.zzr.zza(0);
    }

    private final void zzw(zzaev zzaevVar, byte[] bArr, int i10) throws IOException {
        int length = bArr.length;
        int i11 = length + i10;
        zzer zzerVar = this.zzs;
        if (zzerVar.zzj() < i11) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i11 + i10);
            zzerVar.zzb(bArrCopyOf, bArrCopyOf.length);
        } else {
            System.arraycopy(bArr, 0, zzerVar.zzi(), 0, length);
        }
        zzaevVar.zzc(zzerVar.zzi(), length, i10);
        zzerVar.zzh(0);
        zzerVar.zzf(i11);
    }

    private static byte[] zzx(long j10, String str, long j11) {
        zzgrc.zza(j10 != -9223372036854775807L);
        Locale locale = Locale.US;
        int i10 = (int) (j10 / 3600000000L);
        Integer numValueOf = Integer.valueOf(i10);
        long j12 = j10 - (((long) i10) * 3600000000L);
        int i11 = (int) (j12 / 60000000);
        Integer numValueOf2 = Integer.valueOf(i11);
        long j13 = j12 - (((long) i11) * 60000000);
        int i12 = (int) (j13 / 1000000);
        String str2 = String.format(locale, str, numValueOf, numValueOf2, Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (((long) i12) * 1000000)) / j11)));
        String str3 = zzfj.zza;
        return str2.getBytes(StandardCharsets.UTF_8);
    }

    private final int zzy(zzaev zzaevVar, zzagh zzaghVar, int i10) throws IOException {
        zzer zzerVar = this.zzr;
        int iZzd = zzerVar.zzd();
        if (iZzd <= 0) {
            return zzaghVar.zza(zzaevVar, i10, false);
        }
        int iMin = Math.min(i10, iZzd);
        zzaghVar.zzc(zzerVar, iMin);
        return iMin;
    }

    private final long zzz(long j10) throws zzat {
        long j11 = this.zzz;
        if (j11 != -9223372036854775807L) {
            return zzfj.zzt(j10, j11, 1000L, RoundingMode.DOWN);
        }
        throw zzat.zzb("Can't scale timecode prior to timecodeScale being set.", null);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) throws IOException {
        return new zzaji().zza(zzaevVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public /* synthetic */ List zzb() {
        return k.a(this);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        if (this.zzk) {
            zzaexVar = new zzamg(zzaexVar, this.zzl);
        }
        this.zzap = zzaexVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) throws IOException {
        int i10 = 0;
        this.zzT = false;
        while (!this.zzT) {
            if (this.zzaq.zzc(zzaevVar)) {
                long jZzn = zzaevVar.zzn();
                if (this.zzP) {
                    this.zzR = jZzn;
                    zzafvVar.zza = this.zzQ;
                    this.zzP = false;
                    return 1;
                }
                if (this.zzF) {
                    long j10 = this.zzR;
                    if (j10 != -1) {
                        zzafvVar.zza = j10;
                        this.zzR = -1L;
                        return 1;
                    }
                }
            } else {
                while (true) {
                    SparseArray sparseArray = this.zzi;
                    if (i10 >= sparseArray.size()) {
                        return -1;
                    }
                    zzajg zzajgVar = (zzajg) sparseArray.valueAt(i10);
                    zzajgVar.zzb();
                    zzagi zzagiVar = zzajgVar.zzU;
                    if (zzagiVar != null) {
                        zzagiVar.zzd(zzajgVar.zzY, zzajgVar.zzj);
                    }
                    i10++;
                }
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    @CallSuper
    public final void zze(long j10, long j11) {
        this.zzS = -9223372036854775807L;
        int i10 = 0;
        this.zzU = 0;
        this.zzaq.zzb();
        this.zzh.zza();
        zzv();
        this.zzJ = false;
        this.zzK = -9223372036854775807L;
        this.zzL = -1;
        this.zzM = -1L;
        this.zzN = -1L;
        if (!this.zzF) {
            this.zzI.clear();
        }
        while (true) {
            SparseArray sparseArray = this.zzi;
            if (i10 >= sparseArray.size()) {
                return;
            }
            zzagi zzagiVar = ((zzajg) sparseArray.valueAt(i10)).zzU;
            if (zzagiVar != null) {
                zzagiVar.zza();
            }
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public /* synthetic */ zzaeu zzg() {
        return k.b(this);
    }

    @CallSuper
    protected final void zzh(int i10, long j10, long j11) throws zzat {
        zzaex zzaexVar = this.zzap;
        zzaexVar.getClass();
        if (i10 == 160) {
            this.zzae = false;
            this.zzaf = 0L;
            return;
        }
        if (i10 == 174) {
            zzajg zzajgVar = new zzajg();
            this.zzE = zzajgVar;
            zzajgVar.zza = this.zzC;
            return;
        }
        if (i10 == 183) {
            if (this.zzF) {
                return;
            }
            zzr(i10);
            this.zzL = -1;
            this.zzM = -1L;
            this.zzN = -1L;
            return;
        }
        if (i10 == 187) {
            if (this.zzF) {
                return;
            }
            zzr(i10);
            this.zzK = -9223372036854775807L;
            return;
        }
        if (i10 == 19899) {
            this.zzG = -1;
            this.zzH = -1L;
            return;
        }
        if (i10 == 20533) {
            zzq(i10);
            this.zzE.zzh = true;
            return;
        }
        if (i10 == 21968) {
            zzq(i10);
            this.zzE.zzy = true;
            return;
        }
        if (i10 == 408125543) {
            long j12 = this.zzy;
            if (j12 != -1 && j12 != j10) {
                throw zzat.zzb("Multiple Segment elements not supported", null);
            }
            this.zzy = j10;
            this.zzx = j11;
            return;
        }
        if (i10 == 475249515) {
            if (this.zzF) {
                return;
            }
            this.zzJ = true;
        } else if (i10 == 524531317 && !this.zzF) {
            if (this.zzj && this.zzQ != -1) {
                this.zzP = true;
            } else {
                zzaexVar.zzw(new zzafx(this.zzB, 0L));
                this.zzF = true;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0064, code lost:
    
        r24 = -9223372036854775807L;
        r26 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a2, code lost:
    
        r40.zzap.zzw(new com.google.android.gms.internal.ads.zzafx(r40.zzB, 0));
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0190  */
    @androidx.annotation.CallSuper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void zzi(int r41) throws com.google.android.gms.internal.ads.zzat {
        /*
            Method dump skipped, instruction units count: 1630
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajh.zzi(int):void");
    }

    @CallSuper
    protected final void zzj(int i10, long j10) throws zzat {
        boolean z10;
        if (i10 == 240) {
            if (this.zzF) {
                return;
            }
            zzr(i10);
            if (this.zzN == -1) {
                this.zzN = j10;
                return;
            }
            return;
        }
        if (i10 == 241) {
            if (this.zzF) {
                return;
            }
            zzr(i10);
            if (this.zzM == -1) {
                this.zzM = j10;
                return;
            }
            return;
        }
        if (i10 == 20529) {
            if (j10 == 0) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 35);
            sb2.append("ContentEncodingOrder ");
            sb2.append(j10);
            sb2.append(" not supported");
            throw zzat.zzb(sb2.toString(), null);
        }
        if (i10 == 20530) {
            if (j10 == 1) {
                return;
            }
            StringBuilder sb3 = new StringBuilder(String.valueOf(j10).length() + 35);
            sb3.append("ContentEncodingScope ");
            sb3.append(j10);
            sb3.append(" not supported");
            throw zzat.zzb(sb3.toString(), null);
        }
        switch (i10) {
            case MRAID_JS_WRITE_FAILED_VALUE:
                int i11 = (int) j10;
                if (i11 == 1) {
                    zzq(i10);
                    this.zzE.zze = 2;
                    return;
                }
                if (i11 == 2) {
                    zzq(i10);
                    this.zzE.zze = 1;
                    return;
                } else if (i11 == 17) {
                    zzq(i10);
                    this.zzE.zze = 3;
                    return;
                } else if (i11 != 33) {
                    zzq(i10);
                    this.zzE.zze = -1;
                    return;
                } else {
                    zzq(i10);
                    this.zzE.zze = 5;
                    return;
                }
            case 136:
                z10 = j10 == 1;
                zzq(i10);
                this.zzE.zzX = z10;
                return;
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
                this.zzW = zzz(j10);
                return;
            case 159:
                zzq(i10);
                this.zzE.zzP = (int) j10;
                return;
            case 176:
                zzq(i10);
                this.zzE.zzm = (int) j10;
                return;
            case 179:
                if (this.zzF) {
                    return;
                }
                zzr(i10);
                this.zzK = zzz(j10);
                return;
            case 186:
                zzq(i10);
                this.zzE.zzn = (int) j10;
                return;
            case AD_RESPONSE_EMPTY_VALUE:
                zzq(i10);
                this.zzE.zzd = (int) j10;
                return;
            case 231:
                this.zzS = zzz(j10);
                return;
            case 238:
                this.zzad = (int) j10;
                return;
            case 247:
                if (this.zzF) {
                    return;
                }
                zzr(i10);
                this.zzL = (int) j10;
                return;
            case 251:
                this.zzae = true;
                return;
            case 16871:
                zzq(i10);
                this.zzE.zzd((int) j10);
                return;
            case 16980:
                if (j10 == 3) {
                    return;
                }
                StringBuilder sb4 = new StringBuilder(String.valueOf(j10).length() + 30);
                sb4.append("ContentCompAlgo ");
                sb4.append(j10);
                sb4.append(" not supported");
                throw zzat.zzb(sb4.toString(), null);
            case 17029:
                if (j10 < 1 || j10 > 2) {
                    StringBuilder sb5 = new StringBuilder(String.valueOf(j10).length() + 33);
                    sb5.append("DocTypeReadVersion ");
                    sb5.append(j10);
                    sb5.append(" not supported");
                    throw zzat.zzb(sb5.toString(), null);
                }
                return;
            case 17143:
                if (j10 == 1) {
                    return;
                }
                StringBuilder sb6 = new StringBuilder(String.valueOf(j10).length() + 30);
                sb6.append("EBMLReadVersion ");
                sb6.append(j10);
                sb6.append(" not supported");
                throw zzat.zzb(sb6.toString(), null);
            case 18401:
                if (j10 == 5) {
                    return;
                }
                StringBuilder sb7 = new StringBuilder(String.valueOf(j10).length() + 29);
                sb7.append("ContentEncAlgo ");
                sb7.append(j10);
                sb7.append(" not supported");
                throw zzat.zzb(sb7.toString(), null);
            case 18408:
                if (j10 == 1) {
                    return;
                }
                StringBuilder sb8 = new StringBuilder(String.valueOf(j10).length() + 36);
                sb8.append("AESSettingsCipherMode ");
                sb8.append(j10);
                sb8.append(" not supported");
                throw zzat.zzb(sb8.toString(), null);
            case 21420:
                this.zzH = j10 + this.zzy;
                return;
            case 21432:
                int i12 = (int) j10;
                zzq(i10);
                if (i12 == 0) {
                    this.zzE.zzx = 0;
                    return;
                }
                if (i12 == 1) {
                    this.zzE.zzx = 2;
                    return;
                } else if (i12 == 3) {
                    this.zzE.zzx = 1;
                    return;
                } else {
                    if (i12 != 15) {
                        return;
                    }
                    this.zzE.zzx = 3;
                    return;
                }
            case 21680:
                zzq(i10);
                this.zzE.zzp = (int) j10;
                return;
            case 21682:
                zzq(i10);
                this.zzE.zzr = (int) j10;
                return;
            case 21690:
                zzq(i10);
                this.zzE.zzq = (int) j10;
                return;
            case 21930:
                z10 = j10 == 1;
                zzq(i10);
                this.zzE.zzW = z10;
                return;
            case 21938:
                zzq(i10);
                zzajg zzajgVar = this.zzE;
                zzajgVar.zzy = true;
                zzajgVar.zzo = (int) j10;
                return;
            case 21998:
                zzq(i10);
                this.zzE.zzg = (int) j10;
                return;
            case 22186:
                zzq(i10);
                this.zzE.zzS = j10;
                return;
            case 22203:
                zzq(i10);
                this.zzE.zzT = j10;
                return;
            case 25188:
                zzq(i10);
                this.zzE.zzQ = (int) j10;
                return;
            case 30114:
                this.zzaf = j10;
                return;
            case 30321:
                int i13 = (int) j10;
                zzq(i10);
                if (i13 == 0) {
                    this.zzE.zzs = 0;
                    return;
                }
                if (i13 == 1) {
                    this.zzE.zzs = 1;
                    return;
                } else if (i13 == 2) {
                    this.zzE.zzs = 2;
                    return;
                } else {
                    if (i13 != 3) {
                        return;
                    }
                    this.zzE.zzs = 3;
                    return;
                }
            case 2352003:
                zzq(i10);
                this.zzE.zzf = (int) j10;
                return;
            case 2807729:
                this.zzz = j10;
                return;
            default:
                switch (i10) {
                    case 21945:
                        int i14 = (int) j10;
                        zzq(i10);
                        if (i14 == 1) {
                            this.zzE.zzB = 2;
                            return;
                        } else {
                            if (i14 != 2) {
                                return;
                            }
                            this.zzE.zzB = 1;
                            return;
                        }
                    case 21946:
                        zzq(i10);
                        int iZzc = zzi.zzc((int) j10);
                        if (iZzc != -1) {
                            this.zzE.zzA = iZzc;
                            return;
                        }
                        return;
                    case 21947:
                        zzq(i10);
                        this.zzE.zzy = true;
                        int iZzb = zzi.zzb((int) j10);
                        if (iZzb != -1) {
                            this.zzE.zzz = iZzb;
                            return;
                        }
                        return;
                    case 21948:
                        zzq(i10);
                        this.zzE.zzC = (int) j10;
                        return;
                    case 21949:
                        zzq(i10);
                        this.zzE.zzD = (int) j10;
                        return;
                    default:
                        return;
                }
        }
    }

    @CallSuper
    protected final void zzk(int i10, double d10) throws zzat {
        if (i10 == 181) {
            zzq(i10);
            this.zzE.zzR = (int) d10;
            return;
        }
        if (i10 == 17545) {
            this.zzA = (long) d10;
            return;
        }
        switch (i10) {
            case 21969:
                zzq(i10);
                this.zzE.zzE = (float) d10;
                break;
            case 21970:
                zzq(i10);
                this.zzE.zzF = (float) d10;
                break;
            case 21971:
                zzq(i10);
                this.zzE.zzG = (float) d10;
                break;
            case 21972:
                zzq(i10);
                this.zzE.zzH = (float) d10;
                break;
            case 21973:
                zzq(i10);
                this.zzE.zzI = (float) d10;
                break;
            case 21974:
                zzq(i10);
                this.zzE.zzJ = (float) d10;
                break;
            case 21975:
                zzq(i10);
                this.zzE.zzK = (float) d10;
                break;
            case 21976:
                zzq(i10);
                this.zzE.zzL = (float) d10;
                break;
            case 21977:
                zzq(i10);
                this.zzE.zzM = (float) d10;
                break;
            case 21978:
                zzq(i10);
                this.zzE.zzN = (float) d10;
                break;
            default:
                switch (i10) {
                    case 30323:
                        zzq(i10);
                        this.zzE.zzt = (float) d10;
                        break;
                    case 30324:
                        zzq(i10);
                        this.zzE.zzu = (float) d10;
                        break;
                    case 30325:
                        zzq(i10);
                        this.zzE.zzv = (float) d10;
                        break;
                }
                break;
        }
    }

    @CallSuper
    protected final void zzl(int i10, String str) throws zzat {
        if (i10 == 134) {
            zzq(i10);
            this.zzE.zzc = str;
            return;
        }
        if (i10 != 17026) {
            if (i10 == 21358) {
                zzq(i10);
                this.zzE.zzb = str;
                return;
            } else {
                if (i10 != 2274716) {
                    return;
                }
                zzq(i10);
                this.zzE.zze(str);
                return;
            }
        }
        if ("webm".equals(str) || "matroska".equals(str)) {
            this.zzC = Objects.equals(str, "webm");
            return;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 22);
        sb2.append("DocType ");
        sb2.append(str);
        sb2.append(" not supported");
        throw zzat.zzb(sb2.toString(), null);
    }

    @CallSuper
    protected final void zzm(int i10, int i11, zzaev zzaevVar) throws IOException {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        long j10;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23 = i10;
        int i24 = 2;
        int i25 = 1;
        int i26 = 0;
        if (i23 != 161 && i23 != 163) {
            if (i23 == 165) {
                if (this.zzU != 2) {
                    return;
                }
                zzajg zzajgVar = (zzajg) this.zzi.get(this.zzaa);
                if (this.zzad != 4 || !"V_VP9".equals(zzajgVar.zzc)) {
                    zzaevVar.zzf(i11);
                    return;
                }
                zzer zzerVar = this.zzv;
                zzerVar.zza(i11);
                zzaevVar.zzc(zzerVar.zzi(), 0, i11);
                return;
            }
            if (i23 == 16877) {
                zzq(i10);
                zzajg zzajgVar2 = this.zzE;
                if (zzajgVar2.zzc() != 1685485123 && zzajgVar2.zzc() != 1685480259) {
                    zzaevVar.zzf(i11);
                    return;
                }
                byte[] bArr = new byte[i11];
                zzajgVar2.zzO = bArr;
                zzaevVar.zzc(bArr, 0, i11);
                return;
            }
            if (i23 == 16981) {
                zzq(i10);
                byte[] bArr2 = new byte[i11];
                this.zzE.zzi = bArr2;
                zzaevVar.zzc(bArr2, 0, i11);
                return;
            }
            if (i23 == 18402) {
                byte[] bArr3 = new byte[i11];
                zzaevVar.zzc(bArr3, 0, i11);
                zzq(i10);
                this.zzE.zzj = new zzagg(1, bArr3, 0, 0);
                return;
            }
            if (i23 == 21419) {
                zzer zzerVar2 = this.zzq;
                Arrays.fill(zzerVar2.zzi(), (byte) 0);
                zzaevVar.zzc(zzerVar2.zzi(), 4 - i11, i11);
                zzerVar2.zzh(0);
                this.zzG = (int) zzerVar2.zzz();
                return;
            }
            if (i23 == 25506) {
                zzq(i10);
                byte[] bArr4 = new byte[i11];
                this.zzE.zzk = bArr4;
                zzaevVar.zzc(bArr4, 0, i11);
                return;
            }
            if (i23 != 30322) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i23).length() + 15);
                sb2.append("Unexpected id: ");
                sb2.append(i23);
                throw zzat.zzb(sb2.toString(), null);
            }
            zzq(i10);
            byte[] bArr5 = new byte[i11];
            this.zzE.zzw = bArr5;
            zzaevVar.zzc(bArr5, 0, i11);
            return;
        }
        int i27 = 8;
        if (this.zzU == 0) {
            zzajj zzajjVar = this.zzh;
            this.zzaa = (int) zzajjVar.zzb(zzaevVar, false, true, 8);
            this.zzab = zzajjVar.zzc();
            this.zzW = -9223372036854775807L;
            this.zzU = 1;
            this.zzo.zza(0);
        }
        zzajg zzajgVar3 = (zzajg) this.zzi.get(this.zzaa);
        if (zzajgVar3 == null) {
            zzaevVar.zzf(i11 - this.zzab);
            this.zzU = 0;
            return;
        }
        zzajgVar3.zzb();
        if (this.zzU == 1) {
            zzt(zzaevVar, 3);
            zzer zzerVar3 = this.zzo;
            int i28 = (zzerVar3.zzi()[2] & 6) >> 1;
            if (i28 == 0) {
                this.zzY = 1;
                int[] iArrZzA = zzA(this.zzZ, 1);
                this.zzZ = iArrZzA;
                iArrZzA[0] = (i11 - this.zzab) - 3;
            } else {
                zzt(zzaevVar, 4);
                int i29 = (zzerVar3.zzi()[3] & 255) + 1;
                this.zzY = i29;
                int[] iArrZzA2 = zzA(this.zzZ, i29);
                this.zzZ = iArrZzA2;
                if (i28 == 2) {
                    int i30 = (i11 - this.zzab) - 4;
                    int i31 = this.zzY;
                    Arrays.fill(iArrZzA2, 0, i31, i30 / i31);
                } else {
                    if (i28 != 1) {
                        if (i28 != 3) {
                            throw zzat.zzb("Unexpected lacing value: 2", null);
                        }
                        int i32 = 0;
                        int i33 = 0;
                        int i34 = 4;
                        while (true) {
                            int i35 = this.zzY - 1;
                            if (i32 >= i35) {
                                i13 = i24;
                                i14 = i25;
                                i15 = i26;
                                this.zzZ[i35] = ((i11 - this.zzab) - i34) - i33;
                                break;
                            }
                            this.zzZ[i32] = i26;
                            int i36 = i34 + 1;
                            zzt(zzaevVar, i36);
                            if (zzerVar3.zzi()[i34] == 0) {
                                throw zzat.zzb("No valid varint length mask found", null);
                            }
                            int i37 = i26;
                            while (true) {
                                if (i26 >= i27) {
                                    i16 = i24;
                                    i17 = i25;
                                    i18 = i27;
                                    j10 = 0;
                                    break;
                                }
                                i18 = i27;
                                int i38 = i25 << (7 - i26);
                                if ((zzerVar3.zzi()[i34] & i38) != 0) {
                                    i36 += i26;
                                    zzt(zzaevVar, i36);
                                    int i39 = i34 + 1;
                                    int i40 = zzerVar3.zzi()[i34] & 255 & (~i38);
                                    int i41 = i24;
                                    j10 = i40;
                                    i16 = i41;
                                    int i42 = i39;
                                    while (i42 < i36) {
                                        j10 = (j10 << i18) | ((long) (zzerVar3.zzi()[i42] & 255));
                                        i25 = i25;
                                        i42++;
                                        i26 = i26;
                                    }
                                    i17 = i25;
                                    int i43 = i26;
                                    if (i32 > 0) {
                                        j10 -= (1 << ((i43 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i26++;
                                    i27 = i18;
                                }
                            }
                            if (j10 < SieveCacheKt.NodeMetaAndPreviousMask || j10 > SieveCacheKt.NodeLinkMask) {
                                break;
                            }
                            int[] iArr = this.zzZ;
                            int i44 = (int) j10;
                            if (i32 != 0) {
                                i44 += iArr[i32 - 1];
                            }
                            iArr[i32] = i44;
                            i33 += i44;
                            i32++;
                            i34 = i36;
                            i26 = i37;
                            i24 = i16;
                            i27 = i18;
                            i25 = i17;
                        }
                        throw zzat.zzb("EBML lacing sample size out of range.", null);
                    }
                    int i45 = 0;
                    int i46 = 0;
                    int i47 = 4;
                    while (true) {
                        i19 = this.zzY - 1;
                        if (i45 >= i19) {
                            break;
                        }
                        this.zzZ[i45] = 0;
                        while (true) {
                            i20 = i47 + 1;
                            zzt(zzaevVar, i20);
                            int i48 = zzerVar3.zzi()[i47] & 255;
                            int[] iArr2 = this.zzZ;
                            i21 = iArr2[i45] + i48;
                            iArr2[i45] = i21;
                            if (i48 != 255) {
                                break;
                            } else {
                                i47 = i20;
                            }
                        }
                        i46 += i21;
                        i45++;
                        i47 = i20;
                    }
                    this.zzZ[i19] = ((i11 - this.zzab) - i47) - i46;
                }
            }
            i13 = 2;
            i14 = 1;
            i15 = 0;
            this.zzV = this.zzS + zzz((zzerVar3.zzi()[i15] << 8) | (zzerVar3.zzi()[i14] & 255));
            if (zzajgVar3.zze == i14) {
                i22 = 1;
                this.zzac = i22;
                this.zzU = i13;
                this.zzX = i15;
                i12 = 163;
            } else {
                if (i23 != 163) {
                    i22 = i15;
                } else if ((zzerVar3.zzi()[i13] & UnsignedBytes.MAX_POWER_OF_TWO) == 128) {
                    i23 = 163;
                    i22 = 1;
                } else {
                    i22 = i15;
                    i23 = 163;
                }
                this.zzac = i22;
                this.zzU = i13;
                this.zzX = i15;
                i12 = 163;
            }
        } else {
            i12 = 163;
        }
        if (i23 == i12) {
            while (true) {
                int i49 = this.zzX;
                if (i49 >= this.zzY) {
                    this.zzU = 0;
                    return;
                }
                int iZzu = zzu(zzaevVar, zzajgVar3, this.zzZ[i49], false);
                zzajg zzajgVar4 = zzajgVar3;
                zzs(zzajgVar4, this.zzV + ((long) ((this.zzX * zzajgVar3.zzf) / 1000)), this.zzac, iZzu, 0);
                this.zzX++;
                zzajgVar3 = zzajgVar4;
            }
        } else {
            while (true) {
                int i50 = this.zzX;
                if (i50 >= this.zzY) {
                    return;
                }
                int[] iArr3 = this.zzZ;
                iArr3[i50] = zzu(zzaevVar, zzajgVar3, iArr3[i50], true);
                this.zzX++;
            }
        }
    }

    zzajh(zzaja zzajaVar, int i10, zzamd zzamdVar) {
        this.zzy = -1L;
        this.zzz = -9223372036854775807L;
        this.zzA = -9223372036854775807L;
        this.zzB = -9223372036854775807L;
        this.zzK = -9223372036854775807L;
        this.zzL = -1;
        this.zzM = -1L;
        this.zzN = -1L;
        this.zzO = -1;
        this.zzQ = -1L;
        this.zzR = -1L;
        this.zzS = -9223372036854775807L;
        this.zzaq = zzajaVar;
        zzajaVar.zza(new zzajc(this, null));
        this.zzl = zzamdVar;
        this.zzI = new SparseArray();
        this.zzj = 1 == ((i10 & 1) ^ 1);
        this.zzk = (i10 & 2) == 0;
        this.zzh = new zzajj();
        this.zzi = new SparseArray();
        this.zzo = new zzer(4);
        this.zzp = new zzer(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzq = new zzer(4);
        this.zzm = new zzer(zzgm.zza);
        this.zzn = new zzer(4);
        this.zzr = new zzer();
        this.zzs = new zzer();
        this.zzt = new zzer(8);
        this.zzu = new zzer();
        this.zzv = new zzer();
        this.zzZ = new int[1];
        this.zzD = true;
    }

    public zzajh(zzamd zzamdVar, int i10) {
        this(new zzaja(), 0, zzamdVar);
    }
}
