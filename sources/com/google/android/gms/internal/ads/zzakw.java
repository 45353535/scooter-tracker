package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzakw implements zzaeu {
    public static final /* synthetic */ int zza = 0;
    private int zzA;

    @Nullable
    private zzahv zzB;
    private final zzamd zzb;
    private final int zzc;
    private final zzer zzd;
    private final zzer zze;
    private final zzer zzf;
    private final zzer zzg;
    private final ArrayDeque zzh;
    private final zzala zzi;
    private final List zzj;
    private zzguf zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private int zzo;

    @Nullable
    private zzer zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private boolean zzu;
    private boolean zzv;
    private long zzw;
    private zzaex zzx;
    private zzakv[] zzy;

    @Nullable
    private long[][] zzz;

    @Deprecated
    public zzakw() {
        this(zzamd.zza, 16);
    }

    static /* synthetic */ long zzh(zzalf zzalfVar, long j10, long j11) {
        int iZzl = zzl(zzalfVar, j10);
        return iZzl == -1 ? j11 : Math.min(zzalfVar.zzc[iZzl], j11);
    }

    private final void zzj() {
        this.zzl = 0;
        this.zzo = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzk(long r43) throws com.google.android.gms.internal.ads.zzat {
        /*
            Method dump skipped, instruction units count: 752
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakw.zzk(long):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzl(zzalf zzalfVar, long j10) {
        int iZza = zzalfVar.zza(j10);
        return iZza == -1 ? zzalfVar.zzb(j10) : iZza;
    }

    private static int zzm(int i10) {
        if (i10 != 1751476579) {
            return i10 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) throws IOException {
        zzagc zzagcVarZzb = zzalb.zzb(zzaevVar, (this.zzc & 2) != 0);
        this.zzk = zzagcVarZzb != null ? zzguf.zzj(zzagcVarZzb) : zzguf.zzi();
        return zzagcVarZzb == null;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final /* synthetic */ List zzb() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        if ((this.zzc & 16) == 0) {
            zzaexVar = new zzamg(zzaexVar, this.zzb);
        }
        this.zzx = zzaexVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01e4, code lost:
    
        if (j$.util.Objects.equals(r5, "audio/mpeg") == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01e6, code lost:
    
        r2 = r10.zzf;
        r4 = r37.zzf;
        r4.zza(4);
        r38.zzi(r4.zzi(), 0, 4);
        r38.zzl();
        r5 = new com.google.android.gms.internal.ads.zzafr();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0206, code lost:
    
        if (r5.zza(r4.zzB()) == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0210, code lost:
    
        if (j$.util.Objects.equals(r2.zzo, r5.zzb) != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0212, code lost:
    
        r2 = r2.zza();
        r4 = r5.zzb;
        r4.getClass();
        r2.zzm(r4);
        r2 = r2.zzM();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0222, code lost:
    
        r9.zzz(r2);
        r10.zzf = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0229, code lost:
    
        if (r14 == null) goto L328;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x022b, code lost:
    
        r14.zzb(r38);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x022e, code lost:
    
        r2 = r37.zzs;
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        zzj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0230, code lost:
    
        if (r2 >= r3) goto L327;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0232, code lost:
    
        r2 = r9.zza(r38, r3 - r2, false);
        r37.zzr += r2;
        r37.zzs += r2;
        r37.zzt -= r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0249, code lost:
    
        r16 = r15.zzf[r11];
        r1 = r15.zzg[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0253, code lost:
    
        if (r37.zzu != false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0255, code lost:
    
        r1 = r1 | androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0258, code lost:
    
        if (r14 == null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x025a, code lost:
    
        r15 = r9;
        r14.zzc(r15, r16, r1, r18, 0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x026f, code lost:
    
        if ((r11 + 1) != r15.zzb) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0271, code lost:
    
        r14.zzd(r15, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0276, code lost:
    
        r9.zze(r16, r1, r18, 0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0284, code lost:
    
        r10.zze++;
        r37.zzq = -1;
        r37.zzr = 0;
        r37.zzs = 0;
        r37.zzt = 0;
        r37.zzu = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0296, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0297, code lost:
    
        r39.zza = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0299, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x029a, code lost:
    
        r3 = r37.zzn - ((long) r37.zzo);
        r5 = r38.zzn() + r3;
        r7 = r37.zzp;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02ad, code lost:
    
        if (r7 == null) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02af, code lost:
    
        r38.zzc(r7.zzi(), r37.zzo, (int) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02bb, code lost:
    
        if (r37.zzm != 1718909296) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02bd, code lost:
    
        r37.zzv = true;
        r7.zzh(8);
        r3 = zzm(r7.zzB());
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02cb, code lost:
    
        if (r3 == 0) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        r7 = r38.zzn();
        r14 = r37.zzq;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02ce, code lost:
    
        r7.zzk(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02d6, code lost:
    
        if (r7.zzd() <= 0) goto L316;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02d8, code lost:
    
        r3 = zzm(r7.zzB());
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02e0, code lost:
    
        if (r3 == 0) goto L318;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02e3, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02e4, code lost:
    
        r37.zzA = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02e6, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        if (r14 != (-1)) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02e8, code lost:
    
        r3 = r37.zzh;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02ee, code lost:
    
        if (r3.isEmpty() != false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02f0, code lost:
    
        ((com.google.android.gms.internal.ads.zzfu) r3.peek()).zza(new com.google.android.gms.internal.ads.zzfv(r37.zzm, r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0303, code lost:
    
        if (r37.zzv != false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x030a, code lost:
    
        if (r37.zzm != 1835295092) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x030c, code lost:
    
        r37.zzA = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0311, code lost:
    
        if (r3 >= android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_REPEAT_MODE) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        r21 = r6;
        r28 = r21 == true ? 1 : 0;
        r26 = -1;
        r27 = -1;
        r19 = Long.MAX_VALUE;
        r22 = Long.MAX_VALUE;
        r24 = Long.MAX_VALUE;
        r14 = 0;
        r29 = android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
        r21 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0313, code lost:
    
        r38.zzf((int) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0318, code lost:
    
        r39.zza = r38.zzn() + r3;
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0320, code lost:
    
        zzk(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0323, code lost:
    
        if (r3 == false) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0329, code lost:
    
        if (r37.zzl == 2) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x032b, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        r15 = r37.zzy;
        r31 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        if (r14 >= r15.length) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        r10 = r15[r14];
        r11 = r10.zze;
        r10 = r10.zzb;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        if (r11 != r10.zzb) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        r15 = r10.zzc[r11];
        r10 = r37.zzz;
        r10.getClass();
        r33 = r10[r14][r11];
        r15 = r15 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
    
        if (r15 < r31) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
    
        if (r15 < android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_REPEAT_MODE) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0070, code lost:
    
        r10 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0072, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
    
        if (r10 != 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        if (r28 != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
    
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
    
        r11 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007b, code lost:
    
        if (r10 != r11) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007f, code lost:
    
        if (r15 >= r24) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0081, code lost:
    
        r28 = r10;
        r27 = r14;
        r24 = r15;
        r22 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008a, code lost:
    
        r28 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008e, code lost:
    
        if (r33 >= r19) goto L321;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0090, code lost:
    
        r21 = r10;
        r26 = r14;
        r19 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0096, code lost:
    
        r14 = r14 + r6;
        r10 = r31;
        r21 = r21;
        r28 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009c, code lost:
    
        if (r19 == Long.MAX_VALUE) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009e, code lost:
    
        if (r21 == 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a7, code lost:
    
        if (r22 < (r19 + 10485760)) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a9, code lost:
    
        r14 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ac, code lost:
    
        r14 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ae, code lost:
    
        r37.zzq = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b0, code lost:
    
        if (r14 != (-1)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b2, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b3, code lost:
    
        r31 = 0;
        r29 = android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b8, code lost:
    
        r10 = r37.zzy[r14];
        r14 = r10.zzc;
        r11 = r10.zze;
        r15 = r10.zzb;
        r19 = r14;
        r13 = r15.zzc[r11] + r37.zzw;
        r12 = r15.zzd;
        r17 = r12[r11];
        r23 = false;
        r14 = r10.zzd;
        r20 = 4;
        r7 = (r13 - r7) + ((long) r37.zzr);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e1, code lost:
    
        if (r7 < r31) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e5, code lost:
    
        if (r7 < r29) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00eb, code lost:
    
        r2 = r10.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f0, code lost:
    
        if (r2.zzh != 1) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f2, code lost:
    
        r7 = r7 + 8;
        r17 = r17 - 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f7, code lost:
    
        r3 = r17;
        r38.zzf((int) r7);
        r4 = r2.zzg;
        r5 = r4.zzo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0107, code lost:
    
        if (j$.util.Objects.equals(r5, "video/avc") != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0109, code lost:
    
        j$.util.Objects.equals(r5, "video/hevc");
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x010e, code lost:
    
        r37.zzu = true;
        r2 = r2.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0113, code lost:
    
        if (r2 == 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0115, code lost:
    
        r5 = r37.zze;
        r7 = r5.zzi();
        r7[0] = 0;
        r7[1] = 0;
        r7[2] = 0;
        r6 = 4 - r2;
        r3 = r3 + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0126, code lost:
    
        if (r37.zzs >= r3) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0128, code lost:
    
        r8 = r37.zzt;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x012a, code lost:
    
        if (r8 != 0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x012e, code lost:
    
        if (r37.zzu != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (r7 == r6) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x013a, code lost:
    
        if ((com.google.android.gms.internal.ads.zzgm.zzc(r4) + r2) > (r12[r11] - r37.zzr)) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x013c, code lost:
    
        r8 = com.google.android.gms.internal.ads.zzgm.zzc(r4);
        r9 = r2 + r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0143, code lost:
    
        r9 = r2;
        r8 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0146, code lost:
    
        r38.zzc(r7, r6, r9);
        r37.zzr += r9;
        r9 = r23;
        r5.zzh(r9);
        r13 = r5.zzB();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0157, code lost:
    
        if (r13 < 0) goto L324;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0159, code lost:
    
        r37.zzt = r13 - r8;
        r13 = r37.zzd;
        r13.zzh(r9);
        r17 = r2;
        r9 = r19;
        r2 = r20;
        r9.zzc(r13, r2);
        r37.zzs += r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x016f, code lost:
    
        if (r8 <= 0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0171, code lost:
    
        r9.zzc(r5, r8);
        r37.zzs += r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x017d, code lost:
    
        if (com.google.android.gms.internal.ads.zzgm.zzd(r7, r2, r8, r4) == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r7 == 2) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x017f, code lost:
    
        r37.zzu = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0182, code lost:
    
        r19 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0184, code lost:
    
        r2 = r17;
        r20 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0188, code lost:
    
        r23 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x018b, code lost:
    
        r20 = r2;
        r19 = r9;
        r2 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0199, code lost:
    
        throw com.google.android.gms.internal.ads.zzat.zzb("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x019a, code lost:
    
        r17 = r2;
        r8 = r19.zza(r38, r8, r23);
        r37.zzr += r8;
        r37.zzs += r8;
        r37.zzt -= r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b4, code lost:
    
        r9 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01b6, code lost:
    
        r18 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r37.zzi.zzb(r38, r39, r37.zzj);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01ba, code lost:
    
        r9 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01c2, code lost:
    
        if ("audio/ac4".equals(r5) == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01c6, code lost:
    
        if (r37.zzs != 0) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01c8, code lost:
    
        r2 = r37.zzf;
        com.google.android.gms.internal.ads.zzady.zzc(r3, r2);
        r13 = 7;
        r9.zzc(r2, 7);
        r37.zzs += 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01d7, code lost:
    
        r13 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01d8, code lost:
    
        r3 = r3 + r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01dc, code lost:
    
        if (r10.zzf == null) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if (r39.zza != 0) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v6 */
    /* JADX WARN: Type inference failed for: r21v7 */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r28v2 */
    /* JADX WARN: Type inference failed for: r28v3 */
    /* JADX WARN: Type inference failed for: r28v4 */
    /* JADX WARN: Type inference failed for: r28v5 */
    /* JADX WARN: Type inference failed for: r28v7 */
    /* JADX WARN: Type inference failed for: r38v0, types: [com.google.android.gms.internal.ads.zzaev, com.google.android.gms.internal.ads.zzj] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v31 */
    @Override // com.google.android.gms.internal.ads.zzaeu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzd(com.google.android.gms.internal.ads.zzaev r38, com.google.android.gms.internal.ads.zzafv r39) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakw.zzd(com.google.android.gms.internal.ads.zzaev, com.google.android.gms.internal.ads.zzafv):int");
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j10, long j11) {
        this.zzh.clear();
        this.zzo = 0;
        this.zzq = -1;
        this.zzr = 0;
        this.zzs = 0;
        this.zzt = 0;
        this.zzu = false;
        if (j10 == 0) {
            if (this.zzl != 3) {
                zzj();
                return;
            } else {
                this.zzi.zza();
                this.zzj.clear();
                return;
            }
        }
        for (zzakv zzakvVar : this.zzy) {
            zzalf zzalfVar = zzakvVar.zzb;
            int iZza = zzalfVar.zza(j11);
            if (iZza == -1) {
                iZza = zzalfVar.zzb(j11);
            }
            zzakvVar.zze = iZza;
            zzagi zzagiVar = zzakvVar.zzd;
            if (zzagiVar != null) {
                zzagiVar.zza();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public /* synthetic */ zzaeu zzg() {
        return k.b(this);
    }

    public zzakw(zzamd zzamdVar, int i10) {
        this.zzb = zzamdVar;
        this.zzc = i10;
        this.zzk = zzguf.zzi();
        this.zzl = (i10 & 4) != 0 ? 3 : 0;
        this.zzi = new zzala();
        this.zzj = new ArrayList();
        this.zzg = new zzer(16);
        this.zzh = new ArrayDeque();
        this.zzd = new zzer(zzgm.zza);
        this.zze = new zzer(6);
        this.zzf = new zzer();
        this.zzq = -1;
        this.zzx = zzaex.zza;
        this.zzy = new zzakv[0];
    }
}
