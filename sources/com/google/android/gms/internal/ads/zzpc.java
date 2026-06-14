package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.util.SparseArray;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzpc implements zzmx {
    private final zzdn zza;
    private final zzbd zzb;
    private final zzbe zzc;
    private final zzpb zzd;
    private final SparseArray zze;
    private zzed zzf;
    private zzbb zzg;
    private zzdx zzh;
    private boolean zzi;

    public zzpc(zzdn zzdnVar) {
        zzdnVar.getClass();
        this.zza = zzdnVar;
        this.zzf = new zzed(zzfj.zze().getThread());
        zzbd zzbdVar = new zzbd();
        this.zzb = zzbdVar;
        this.zzc = new zzbe();
        this.zzd = new zzpb(zzbdVar);
        this.zze = new SparseArray();
    }

    private final zzmy zzad(@Nullable zzwk zzwkVar) {
        this.zzg.getClass();
        zzbf zzbfVarZze = zzwkVar == null ? null : this.zzd.zze(zzwkVar);
        if (zzwkVar != null && zzbfVarZze != null) {
            return zzaa(zzbfVarZze, zzbfVarZze.zzo(zzwkVar.zza, this.zzb).zzc, zzwkVar);
        }
        int iZzs = this.zzg.zzs();
        zzbf zzbfVarZzq = this.zzg.zzq();
        if (iZzs >= zzbfVarZzq.zza()) {
            zzbfVarZzq = zzbf.zza;
        }
        return zzaa(zzbfVarZzq, iZzs, null);
    }

    private final zzmy zzae() {
        return zzad(this.zzd.zzb());
    }

    private final zzmy zzaf() {
        return zzad(this.zzd.zzc());
    }

    private final zzmy zzag(int i10, @Nullable zzwk zzwkVar) {
        zzbb zzbbVar = this.zzg;
        zzbbVar.getClass();
        if (zzwkVar != null) {
            return this.zzd.zze(zzwkVar) != null ? zzad(zzwkVar) : zzaa(zzbf.zza, i10, zzwkVar);
        }
        zzbf zzbfVarZzq = zzbbVar.zzq();
        if (i10 >= zzbfVarZzq.zza()) {
            zzbfVarZzq = zzbf.zza;
        }
        return zzaa(zzbfVarZzq, i10, null);
    }

    private final zzmy zzah(@Nullable zzau zzauVar) {
        zzwk zzwkVar;
        return (!(zzauVar instanceof zziw) || (zzwkVar = ((zziw) zzauVar).zzh) == null) ? zzZ() : zzad(zzwkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzA() {
        if (this.zzi) {
            return;
        }
        final zzmy zzmyVarZzZ = zzZ();
        this.zzi = true;
        zzY(zzmyVarZzZ, -1, new zzdy(zzmyVarZzZ) { // from class: com.google.android.gms.internal.ads.zznm
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzB(final int i10, final int i11, final boolean z10) {
        final zzmy zzmyVarZzaf = zzaf();
        zzY(zzmyVarZzaf, IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT, new zzdy(zzmyVarZzaf, i10, i11, z10) { // from class: com.google.android.gms.internal.ads.zznx
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzC(final zzin zzinVar) {
        final zzmy zzmyVarZzaf = zzaf();
        zzY(zzmyVarZzaf, 1007, new zzdy(zzmyVarZzaf, zzinVar) { // from class: com.google.android.gms.internal.ads.zzoi
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzD(final String str, final long j10, final long j11) {
        final zzmy zzmyVarZzaf = zzaf();
        zzY(zzmyVarZzaf, 1008, new zzdy(zzmyVarZzaf, str, j11, j10) { // from class: com.google.android.gms.internal.ads.zzos
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzE(final zzv zzvVar, @Nullable final zzio zzioVar) {
        final zzmy zzmyVarZzaf = zzaf();
        zzY(zzmyVarZzaf, 1009, new zzdy() { // from class: com.google.android.gms.internal.ads.zzov
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
                ((zzna) obj).zzk(zzmyVarZzaf, zzvVar, zzioVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzF(final long j10) {
        final zzmy zzmyVarZzaf = zzaf();
        zzY(zzmyVarZzaf, 1010, new zzdy(zzmyVarZzaf, j10) { // from class: com.google.android.gms.internal.ads.zzow
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzG(final int i10, final long j10, final long j11) {
        final zzmy zzmyVarZzaf = zzaf();
        zzY(zzmyVarZzaf, 1011, new zzdy(zzmyVarZzaf, i10, j10, j11) { // from class: com.google.android.gms.internal.ads.zzox
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzH(final String str) {
        final zzmy zzmyVarZzaf = zzaf();
        zzY(zzmyVarZzaf, 1012, new zzdy(zzmyVarZzaf, str) { // from class: com.google.android.gms.internal.ads.zzoy
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzI(final zzin zzinVar) {
        final zzmy zzmyVarZzae = zzae();
        zzY(zzmyVarZzae, 1013, new zzdy(zzmyVarZzae, zzinVar) { // from class: com.google.android.gms.internal.ads.zzoz
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzJ(final Exception exc) {
        final zzmy zzmyVarZzaf = zzaf();
        zzY(zzmyVarZzaf, 1014, new zzdy(zzmyVarZzaf, exc) { // from class: com.google.android.gms.internal.ads.zznc
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzK(final Exception exc) {
        final zzmy zzmyVarZzaf = zzaf();
        zzY(zzmyVarZzaf, 1029, new zzdy(zzmyVarZzaf, exc) { // from class: com.google.android.gms.internal.ads.zznd
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzL(final zzrd zzrdVar) {
        final zzmy zzmyVarZzaf = zzaf();
        zzY(zzmyVarZzaf, 1031, new zzdy(zzmyVarZzaf, zzrdVar) { // from class: com.google.android.gms.internal.ads.zzne
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzM(final zzrd zzrdVar) {
        final zzmy zzmyVarZzaf = zzaf();
        zzY(zzmyVarZzaf, 1032, new zzdy(zzmyVarZzaf, zzrdVar) { // from class: com.google.android.gms.internal.ads.zznf
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzN(final zzin zzinVar) {
        final zzmy zzmyVarZzaf = zzaf();
        zzY(zzmyVarZzaf, 1015, new zzdy(zzmyVarZzaf, zzinVar) { // from class: com.google.android.gms.internal.ads.zznh
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzO(final String str, final long j10, final long j11) {
        final zzmy zzmyVarZzaf = zzaf();
        zzY(zzmyVarZzaf, 1016, new zzdy(zzmyVarZzaf, str, j11, j10) { // from class: com.google.android.gms.internal.ads.zzni
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzP(final zzv zzvVar, @Nullable final zzio zzioVar) {
        final zzmy zzmyVarZzaf = zzaf();
        zzY(zzmyVarZzaf, 1017, new zzdy() { // from class: com.google.android.gms.internal.ads.zznj
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
                ((zzna) obj).zzl(zzmyVarZzaf, zzvVar, zzioVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzQ(final int i10, final long j10) {
        final zzmy zzmyVarZzae = zzae();
        zzY(zzmyVarZzae, 1018, new zzdy() { // from class: com.google.android.gms.internal.ads.zznk
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
                ((zzna) obj).zzm(zzmyVarZzae, i10, j10);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzR(final String str) {
        final zzmy zzmyVarZzaf = zzaf();
        zzY(zzmyVarZzaf, 1019, new zzdy(zzmyVarZzaf, str) { // from class: com.google.android.gms.internal.ads.zznl
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzS(final zzin zzinVar) {
        final zzmy zzmyVarZzae = zzae();
        zzY(zzmyVarZzae, 1020, new zzdy() { // from class: com.google.android.gms.internal.ads.zznn
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
                ((zzna) obj).zzdh(zzmyVarZzae, zzinVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzT(final Object obj, final long j10) {
        final zzmy zzmyVarZzaf = zzaf();
        zzY(zzmyVarZzaf, 26, new zzdy() { // from class: com.google.android.gms.internal.ads.zzno
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj2) {
                ((zzna) obj2).zzo(zzmyVarZzaf, obj, j10);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzU(final long j10, final int i10) {
        final zzmy zzmyVarZzae = zzae();
        zzY(zzmyVarZzae, 1021, new zzdy(zzmyVarZzae, j10, i10) { // from class: com.google.android.gms.internal.ads.zznp
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzV(final Exception exc) {
        final zzmy zzmyVarZzaf = zzaf();
        zzY(zzmyVarZzaf, 1030, new zzdy(zzmyVarZzaf, exc) { // from class: com.google.android.gms.internal.ads.zznq
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzW(final int i10) {
        final zzmy zzmyVarZzZ = zzZ();
        zzY(zzmyVarZzZ, IronSourceError.ERROR_RV_LOAD_UNEXPECTED_CALLBACK, new zzdy(zzmyVarZzZ, i10) { // from class: com.google.android.gms.internal.ads.zznr
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final void zzX(final int i10, final long j10, final long j11) {
        final zzmy zzmyVarZzad = zzad(this.zzd.zzd());
        zzY(zzmyVarZzad, 1006, new zzdy() { // from class: com.google.android.gms.internal.ads.zzot
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
                ((zzna) obj).zzdg(zzmyVarZzad, i10, j10, j11);
            }
        });
    }

    protected final void zzY(zzmy zzmyVar, int i10, zzdy zzdyVar) {
        this.zze.put(i10, zzmyVar);
        zzed zzedVar = this.zzf;
        zzedVar.zzd(i10, zzdyVar);
        zzedVar.zze();
    }

    protected final zzmy zzZ() {
        return zzad(this.zzd.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zza(zzbb zzbbVar, zzay zzayVar) {
    }

    protected final zzmy zzaa(zzbf zzbfVar, int i10, @Nullable zzwk zzwkVar) {
        zzwk zzwkVar2 = true == zzbfVar.zzg() ? null : zzwkVar;
        long jZzb = this.zza.zzb();
        boolean z10 = zzbfVar.equals(this.zzg.zzq()) && i10 == this.zzg.zzs();
        long jZzp = 0;
        if (zzwkVar2 == null || !zzwkVar2.zzb()) {
            if (z10) {
                jZzp = this.zzg.zzA();
            } else if (!zzbfVar.zzg()) {
                long j10 = zzbfVar.zzb(i10, this.zzc, 0L).zzl;
                jZzp = zzfj.zzp(0L);
            }
        } else if (z10 && this.zzg.zzy() == zzwkVar2.zzb && this.zzg.zzz() == zzwkVar2.zzc) {
            jZzp = this.zzg.zzu();
        }
        return new zzmy(jZzb, zzbfVar, i10, zzwkVar2, jZzp, this.zzg.zzq(), this.zzg.zzs(), this.zzd.zza(), this.zzg.zzu(), this.zzg.zzw());
    }

    final /* synthetic */ void zzab(zzbb zzbbVar, zzna zznaVar, zzs zzsVar) {
        zznaVar.zzdi(zzbbVar, new zzmz(zzsVar, this.zze));
    }

    final /* synthetic */ void zzac() {
        final zzmy zzmyVarZzZ = zzZ();
        zzY(zzmyVarZzZ, 1028, new zzdy(zzmyVarZzZ) { // from class: com.google.android.gms.internal.ads.zzou
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
        this.zzf.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final void zzai(int i10, @Nullable zzwk zzwkVar, final zzwb zzwbVar, final zzwg zzwgVar, final int i11) {
        final zzmy zzmyVarZzag = zzag(i10, zzwkVar);
        zzY(zzmyVarZzag, 1000, new zzdy(zzmyVarZzag, zzwbVar, zzwgVar, i11) { // from class: com.google.android.gms.internal.ads.zznt
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final void zzaj(int i10, @Nullable zzwk zzwkVar, final zzwb zzwbVar, final zzwg zzwgVar) {
        final zzmy zzmyVarZzag = zzag(i10, zzwkVar);
        zzY(zzmyVarZzag, 1001, new zzdy(zzmyVarZzag, zzwbVar, zzwgVar) { // from class: com.google.android.gms.internal.ads.zznu
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final void zzak(int i10, @Nullable zzwk zzwkVar, final zzwb zzwbVar, final zzwg zzwgVar) {
        final zzmy zzmyVarZzag = zzag(i10, zzwkVar);
        zzY(zzmyVarZzag, 1002, new zzdy(zzmyVarZzag, zzwbVar, zzwgVar) { // from class: com.google.android.gms.internal.ads.zznv
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final void zzal(int i10, @Nullable zzwk zzwkVar, final zzwb zzwbVar, final zzwg zzwgVar, final IOException iOException, final boolean z10) {
        final zzmy zzmyVarZzag = zzag(i10, zzwkVar);
        zzY(zzmyVarZzag, 1003, new zzdy() { // from class: com.google.android.gms.internal.ads.zznw
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
                ((zzna) obj).zzh(zzmyVarZzag, zzwbVar, zzwgVar, iOException, z10);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final void zzam(int i10, @Nullable zzwk zzwkVar, final zzwg zzwgVar) {
        final zzmy zzmyVarZzag = zzag(i10, zzwkVar);
        zzY(zzmyVarZzag, 1004, new zzdy() { // from class: com.google.android.gms.internal.ads.zzny
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
                ((zzna) obj).zzdf(zzmyVarZzag, zzwgVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzb(zzbf zzbfVar, final int i10) {
        zzbb zzbbVar = this.zzg;
        zzbbVar.getClass();
        this.zzd.zzg(zzbbVar);
        final zzmy zzmyVarZzZ = zzZ();
        zzY(zzmyVarZzZ, 0, new zzdy(zzmyVarZzZ, i10) { // from class: com.google.android.gms.internal.ads.zznz
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzc(@Nullable final zzak zzakVar, final int i10) {
        final zzmy zzmyVarZzZ = zzZ();
        zzY(zzmyVarZzZ, 1, new zzdy(zzmyVarZzZ, zzakVar, i10) { // from class: com.google.android.gms.internal.ads.zzoa
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzd(final zzbn zzbnVar) {
        final zzmy zzmyVarZzZ = zzZ();
        zzY(zzmyVarZzZ, 2, new zzdy(zzmyVarZzZ, zzbnVar) { // from class: com.google.android.gms.internal.ads.zzob
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zze(final zzan zzanVar) {
        final zzmy zzmyVarZzZ = zzZ();
        zzY(zzmyVarZzZ, 14, new zzdy(zzmyVarZzZ, zzanVar) { // from class: com.google.android.gms.internal.ads.zzoo
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzf(final boolean z10) {
        final zzmy zzmyVarZzZ = zzZ();
        zzY(zzmyVarZzZ, 3, new zzdy(zzmyVarZzZ, z10) { // from class: com.google.android.gms.internal.ads.zzoc
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzg(final zzax zzaxVar) {
        final zzmy zzmyVarZzZ = zzZ();
        zzY(zzmyVarZzZ, 13, new zzdy(zzmyVarZzZ, zzaxVar) { // from class: com.google.android.gms.internal.ads.zzod
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzh(final boolean z10, final int i10) {
        final zzmy zzmyVarZzZ = zzZ();
        zzY(zzmyVarZzZ, -1, new zzdy(zzmyVarZzZ, z10, i10) { // from class: com.google.android.gms.internal.ads.zzoe
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzi(final int i10) {
        final zzmy zzmyVarZzZ = zzZ();
        zzY(zzmyVarZzZ, 4, new zzdy() { // from class: com.google.android.gms.internal.ads.zzof
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
                ((zzna) obj).zze(zzmyVarZzZ, i10);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzj(final boolean z10, final int i10) {
        final zzmy zzmyVarZzZ = zzZ();
        zzY(zzmyVarZzZ, 5, new zzdy(zzmyVarZzZ, z10, i10) { // from class: com.google.android.gms.internal.ads.zzog
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzk(final int i10) {
        final zzmy zzmyVarZzZ = zzZ();
        zzY(zzmyVarZzZ, 6, new zzdy(zzmyVarZzZ, i10) { // from class: com.google.android.gms.internal.ads.zzoh
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzl(final boolean z10) {
        final zzmy zzmyVarZzZ = zzZ();
        zzY(zzmyVarZzZ, 7, new zzdy(zzmyVarZzZ, z10) { // from class: com.google.android.gms.internal.ads.zzoj
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzm(final zzau zzauVar) {
        final zzmy zzmyVarZzah = zzah(zzauVar);
        zzY(zzmyVarZzah, 10, new zzdy() { // from class: com.google.android.gms.internal.ads.zzok
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
                ((zzna) obj).zzg(zzmyVarZzah, zzauVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzn(@Nullable final zzau zzauVar) {
        final zzmy zzmyVarZzah = zzah(zzauVar);
        zzY(zzmyVarZzah, 10, new zzdy(zzmyVarZzah, zzauVar) { // from class: com.google.android.gms.internal.ads.zzol
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzo(final zzba zzbaVar, final zzba zzbaVar2, final int i10) {
        if (i10 == 1) {
            this.zzi = false;
            i10 = 1;
        }
        zzpb zzpbVar = this.zzd;
        zzbb zzbbVar = this.zzg;
        zzbbVar.getClass();
        zzpbVar.zzf(zzbbVar);
        final zzmy zzmyVarZzZ = zzZ();
        zzY(zzmyVarZzZ, 11, new zzdy() { // from class: com.google.android.gms.internal.ads.zzom
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
                ((zzna) obj).zzde(zzmyVarZzZ, zzbaVar, zzbaVar2, i10);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzp(final zzav zzavVar) {
        final zzmy zzmyVarZzZ = zzZ();
        zzY(zzmyVarZzZ, 12, new zzdy(zzmyVarZzZ, zzavVar) { // from class: com.google.android.gms.internal.ads.zzon
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzq(final int i10) {
        final zzmy zzmyVarZzaf = zzaf();
        zzY(zzmyVarZzaf, 21, new zzdy(zzmyVarZzaf, i10) { // from class: com.google.android.gms.internal.ads.zzoq
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzr(final float f10) {
        final zzmy zzmyVarZzaf = zzaf();
        zzY(zzmyVarZzaf, 22, new zzdy(zzmyVarZzaf, f10) { // from class: com.google.android.gms.internal.ads.zzng
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzs(final boolean z10) {
        final zzmy zzmyVarZzaf = zzaf();
        zzY(zzmyVarZzaf, 23, new zzdy(zzmyVarZzaf, z10) { // from class: com.google.android.gms.internal.ads.zzop
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzt(final zzbv zzbvVar) {
        final zzmy zzmyVarZzaf = zzaf();
        zzY(zzmyVarZzaf, 25, new zzdy() { // from class: com.google.android.gms.internal.ads.zzor
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
                zzmy zzmyVar = zzmyVarZzaf;
                zzbv zzbvVar2 = zzbvVar;
                ((zzna) obj).zzp(zzmyVar, zzbvVar2);
                int i10 = zzbvVar2.zzb;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzu(final int i10, final int i11) {
        final zzmy zzmyVarZzaf = zzaf();
        zzY(zzmyVarZzaf, 24, new zzdy(zzmyVarZzaf, i10, i11) { // from class: com.google.android.gms.internal.ads.zzns
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    @CallSuper
    public final void zzv(zzna zznaVar) {
        this.zzf.zzb(zznaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    @CallSuper
    public final void zzw(zzna zznaVar) {
        this.zzf.zzc(zznaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    @CallSuper
    public final void zzx(final zzbb zzbbVar, Looper looper) {
        boolean z10 = true;
        if (this.zzg != null && !this.zzd.zzi().isEmpty()) {
            z10 = false;
        }
        zzgrc.zzi(z10);
        zzbbVar.getClass();
        this.zzg = zzbbVar;
        zzdn zzdnVar = this.zza;
        this.zzh = zzdnVar.zzd(looper, null);
        this.zzf = this.zzf.zza(looper, zzdnVar, new zzdz() { // from class: com.google.android.gms.internal.ads.zzpa
            @Override // com.google.android.gms.internal.ads.zzdz
            public final /* synthetic */ void zza(Object obj, zzs zzsVar) {
                this.zza.zzab(zzbbVar, (zzna) obj, zzsVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    @CallSuper
    public final void zzy() {
        zzdx zzdxVar = this.zzh;
        zzdxVar.getClass();
        zzdxVar.zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zznb
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzac();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzz(List list, @Nullable zzwk zzwkVar) {
        zzbb zzbbVar = this.zzg;
        zzbbVar.getClass();
        this.zzd.zzh(list, zzwkVar, zzbbVar);
    }
}
