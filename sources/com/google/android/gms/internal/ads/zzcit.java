package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class zzcit extends zzcfv implements zzhz, zzna {
    public static final /* synthetic */ int zza = 0;
    private final Context zzb;
    private final zzcid zzc;
    private final zzaaa zzd;
    private final zzcgd zze;
    private final WeakReference zzf;
    private final zzxt zzg;

    @Nullable
    private zzjh zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private zzcfu zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private final String zzo;
    private final int zzp;

    @Nullable
    private Integer zzr;
    private final ArrayList zzs;

    @Nullable
    private volatile zzcig zzt;
    private final Object zzq = new Object();
    private final Set zzu = new HashSet();

    /* JADX WARN: Removed duplicated region for block: B:22:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzcit(android.content.Context r4, com.google.android.gms.internal.ads.zzcgd r5, com.google.android.gms.internal.ads.zzcge r6, @androidx.annotation.Nullable java.lang.Integer r7) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcit.<init>(android.content.Context, com.google.android.gms.internal.ads.zzcgd, com.google.android.gms.internal.ads.zzcge, java.lang.Integer):void");
    }

    private final boolean zzY() {
        return this.zzt != null && this.zzt.zzl();
    }

    public final void finalize() {
        zzcfv.zzf().decrementAndGet();
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzA(int i10) {
        Iterator it = this.zzu.iterator();
        while (it.hasNext()) {
            zzcic zzcicVar = (zzcic) ((WeakReference) it.next()).get();
            if (zzcicVar != null) {
                zzcicVar.zzk(i10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final boolean zzB() {
        return this.zzh != null;
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final int zzC() {
        return this.zzh.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final long zzD() {
        return this.zzh.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzE(boolean z10) {
        this.zzh.zzj(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzF(int i10) {
        this.zzc.zzk(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzG(int i10) {
        this.zzc.zzl(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final long zzH() {
        return this.zzh.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final long zzI() {
        if (zzY()) {
            return 0L;
        }
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final long zzJ() {
        if (zzY() && this.zzt.zzm()) {
            return Math.min(this.zzl, this.zzt.zzo());
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final long zzK() {
        if (zzY()) {
            return this.zzt.zzp();
        }
        synchronized (this.zzq) {
            while (true) {
                ArrayList arrayList = this.zzs;
                if (!arrayList.isEmpty()) {
                    long j10 = this.zzn;
                    Map mapZzj = ((zzhu) arrayList.remove(0)).zzj();
                    long j11 = 0;
                    if (mapZzj != null) {
                        Iterator it = mapZzj.entrySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Map.Entry entry = (Map.Entry) it.next();
                            if (entry != null) {
                                try {
                                    if (entry.getKey() != null && zzgql.zze("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                        j11 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                        break;
                                    }
                                } catch (NumberFormatException unused) {
                                    continue;
                                }
                            }
                        }
                    }
                    this.zzn = j10 + j11;
                }
            }
        }
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final int zzL() {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzM(boolean z10) {
        if (this.zzh == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            this.zzh.zzF();
            if (i10 >= 2) {
                return;
            }
            zzaaa zzaaaVar = this.zzd;
            zzzk zzzkVarZzd = zzaaaVar.zzc().zzd();
            zzzkVarZzd.zzy(i10, !z10);
            zzaaaVar.zzf(zzzkVarZzd);
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final long zzN() {
        return this.zzh.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final long zzO() {
        return this.zzl;
    }

    @VisibleForTesting
    final zzwm zzR(Uri uri) {
        zzz zzzVar = new zzz();
        zzzVar.zzb(uri);
        zzak zzakVarZzc = zzzVar.zzc();
        zzxt zzxtVar = this.zzg;
        zzxtVar.zza(this.zze.zzf);
        return zzxtVar.zzb(zzakVarZzc);
    }

    final /* synthetic */ zzhb zzS(String str, boolean z10) {
        zzcit zzcitVar = true != z10 ? null : this;
        zzcgd zzcgdVar = this.zze;
        return new zzciw(str, zzcitVar, zzcgdVar.zzd, zzcgdVar.zze, zzcgdVar.zzm, zzcgdVar.zzn);
    }

    final /* synthetic */ zzhb zzT(String str, boolean z10) {
        zzhi zzhiVar = new zzhi();
        zzhiVar.zzb(str);
        zzhiVar.zzf(true != z10 ? null : this);
        zzcgd zzcgdVar = this.zze;
        zzhiVar.zzc(zzcgdVar.zzd);
        zzhiVar.zzd(zzcgdVar.zze);
        zzhiVar.zze(true);
        return zzhiVar.zza();
    }

    final /* synthetic */ zzhb zzU(String str, boolean z10) {
        zzcit zzcitVar = true != z10 ? null : this;
        zzcgd zzcgdVar = this.zze;
        zzcic zzcicVar = new zzcic(str, zzcitVar, zzcgdVar.zzd, zzcgdVar.zze, zzcgdVar.zzh);
        this.zzu.add(new WeakReference(zzcicVar));
        return zzcicVar;
    }

    final /* synthetic */ zzhb zzV(zzha zzhaVar) {
        zzhb zzhbVarZza = zzhaVar.zza();
        zzcie zzcieVar = new zzcie() { // from class: com.google.android.gms.internal.ads.zzcir
            @Override // com.google.android.gms.internal.ads.zzcie
            public final /* synthetic */ void zza(boolean z10, long j10) {
                this.zza.zzX(z10, j10);
            }
        };
        return new zzcig(this.zzb, zzhbVarZza, this.zzo, this.zzp, this, zzcieVar);
    }

    final /* synthetic */ zzml[] zzW(Handler handler, zzadm zzadmVar, zzrc zzrcVar, zzyq zzyqVar, zzvi zzviVar) {
        zzuw zzuwVar = zzuw.zzb;
        Context context = this.zzb;
        zzta zztaVar = new zzta(context, new zzuc(context, null, null), zzuwVar, false, handler, zzrcVar, new zzsp(context).zza());
        zzaca zzacaVar = new zzaca(context);
        zzacaVar.zza(zzuwVar);
        zzacaVar.zzb(handler);
        zzacaVar.zzc(zzadmVar);
        return new zzml[]{zztaVar, zzacaVar.zzd()};
    }

    final /* synthetic */ void zzX(boolean z10, long j10) {
        zzcfu zzcfuVar = this.zzk;
        if (zzcfuVar != null) {
            zzcfuVar.zzr(z10, j10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhz
    public final void zza(zzhb zzhbVar, zzhf zzhfVar, boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzhz
    public final void zzb(zzhb zzhbVar, zzhf zzhfVar, boolean z10) {
        if (zzhbVar instanceof zzhu) {
            synchronized (this.zzq) {
                this.zzs.add((zzhu) zzhbVar);
            }
        } else if (zzhbVar instanceof zzcig) {
            this.zzt = (zzcig) zzhbVar;
            final zzcge zzcgeVar = (zzcge) this.zzf.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcw)).booleanValue() && zzcgeVar != null && this.zzt.zzk()) {
                final HashMap map = new HashMap();
                map.put("gcacheHit", String.valueOf(this.zzt.zzm()));
                map.put("gcacheDownloaded", String.valueOf(this.zzt.zzn()));
                com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcis
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        int i10 = zzcit.zza;
                        zzcgeVar.zze("onGcacheInfoEvent", map);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhz
    public final void zzc(zzhb zzhbVar, zzhf zzhfVar, boolean z10, int i10) {
        this.zzl += i10;
    }

    @Override // com.google.android.gms.internal.ads.zzhz
    public final void zzd(zzhb zzhbVar, zzhf zzhfVar, boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public /* synthetic */ void zzde(zzmy zzmyVar, zzba zzbaVar, zzba zzbaVar2, int i10) {
        q1.a(this, zzmyVar, zzbaVar, zzbaVar2, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public /* synthetic */ void zzdf(zzmy zzmyVar, zzwg zzwgVar) {
        q1.b(this, zzmyVar, zzwgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public /* synthetic */ void zzdg(zzmy zzmyVar, int i10, long j10, long j11) {
        q1.c(this, zzmyVar, i10, j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public /* synthetic */ void zzdh(zzmy zzmyVar, zzin zzinVar) {
        q1.d(this, zzmyVar, zzinVar);
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public /* synthetic */ void zzdi(zzbb zzbbVar, zzmz zzmzVar) {
        q1.e(this, zzbbVar, zzmzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zze(zzmy zzmyVar, int i10) {
        zzcfu zzcfuVar = this.zzk;
        if (zzcfuVar != null) {
            zzcfuVar.zzs(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzg(zzmy zzmyVar, zzau zzauVar) {
        zzcfu zzcfuVar = this.zzk;
        if (zzcfuVar != null) {
            zzcfuVar.zzu("onPlayerError", zzauVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzh(zzmy zzmyVar, zzwb zzwbVar, zzwg zzwgVar, IOException iOException, boolean z10) {
        zzcfu zzcfuVar = this.zzk;
        if (zzcfuVar != null) {
            if (this.zze.zzj) {
                zzcfuVar.zzv("onLoadException", iOException);
            } else {
                zzcfuVar.zzu("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    @Nullable
    public final Integer zzj() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzk(zzmy zzmyVar, zzv zzvVar, @Nullable zzio zzioVar) {
        zzcge zzcgeVar = (zzcge) this.zzf.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcw)).booleanValue() || zzcgeVar == null) {
            return;
        }
        HashMap map = new HashMap();
        String str = zzvVar.zzn;
        if (str != null) {
            map.put("audioMime", str);
        }
        String str2 = zzvVar.zzo;
        if (str2 != null) {
            map.put("audioSampleMime", str2);
        }
        String str3 = zzvVar.zzk;
        if (str3 != null) {
            map.put("audioCodec", str3);
        }
        zzcgeVar.zze("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzl(zzmy zzmyVar, zzv zzvVar, @Nullable zzio zzioVar) {
        zzcge zzcgeVar = (zzcge) this.zzf.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcw)).booleanValue() || zzcgeVar == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("frameRate", String.valueOf(zzvVar.zzz));
        map.put("bitRate", String.valueOf(zzvVar.zzj));
        int i10 = zzvVar.zzv;
        int i11 = zzvVar.zzw;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 1 + String.valueOf(i11).length());
        sb2.append(i10);
        sb2.append("x");
        sb2.append(i11);
        map.put("resolution", sb2.toString());
        String str = zzvVar.zzn;
        if (str != null) {
            map.put("videoMime", str);
        }
        String str2 = zzvVar.zzo;
        if (str2 != null) {
            map.put("videoSampleMime", str2);
        }
        String str3 = zzvVar.zzk;
        if (str3 != null) {
            map.put("videoCodec", str3);
        }
        zzcgeVar.zze("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzm(zzmy zzmyVar, int i10, long j10) {
        this.zzm += i10;
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzn(@Nullable Integer num) {
        this.zzr = num;
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzo(zzmy zzmyVar, Object obj, long j10) {
        zzcfu zzcfuVar = this.zzk;
        if (zzcfuVar != null) {
            zzcfuVar.zzD();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzp(zzmy zzmyVar, zzbv zzbvVar) {
        zzcfu zzcfuVar = this.zzk;
        if (zzcfuVar != null) {
            zzcfuVar.zzt(zzbvVar.zzb, zzbvVar.zzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzq(Uri[] uriArr, String str) {
        zzr(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzr(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z10) {
        zzwm zzxbVar;
        if (this.zzh != null) {
            this.zzi = byteBuffer;
            this.zzj = z10;
            int length = uriArr.length;
            if (length == 1) {
                zzxbVar = zzR(uriArr[0]);
            } else {
                zzwm[] zzwmVarArr = new zzwm[length];
                for (int i10 = 0; i10 < uriArr.length; i10++) {
                    zzwmVarArr[i10] = zzR(uriArr[i10]);
                }
                zzxbVar = new zzxb(false, false, new zzvv(), zzwmVarArr);
            }
            this.zzh.zzG(zzxbVar);
            this.zzh.zzg();
            zzcfv.zzi().incrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzs(zzcfu zzcfuVar) {
        this.zzk = zzcfuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzt() {
        zzjh zzjhVar = this.zzh;
        if (zzjhVar != null) {
            zzjhVar.zzE(this);
            this.zzh.zzH();
            this.zzh = null;
            zzcfv.zzi().decrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzu(Surface surface, boolean z10) {
        zzjh zzjhVar = this.zzh;
        if (zzjhVar != null) {
            zzjhVar.zzC(surface);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzv(float f10, boolean z10) {
        zzjh zzjhVar = this.zzh;
        if (zzjhVar != null) {
            zzjhVar.zzB(f10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzw() {
        this.zzh.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzx(long j10) {
        this.zzh.zzb(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzy(int i10) {
        this.zzc.zzm(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzz(int i10) {
        this.zzc.zzn(i10);
    }
}
