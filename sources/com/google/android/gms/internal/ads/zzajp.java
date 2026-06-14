package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzajp implements zzaeu {
    public static final /* synthetic */ int zza = 0;
    private final zzer zzb;
    private final zzafr zzc;
    private final zzafn zzd;
    private final zzafp zze;
    private final zzagh zzf;
    private zzaex zzg;
    private zzagh zzh;
    private zzagh zzi;
    private int zzj;

    @Nullable
    private zzap zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private int zzp;
    private zzajr zzq;
    private boolean zzr;

    public zzajp() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0234  */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45, types: [com.google.android.gms.internal.ads.zzafy] */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v50, types: [com.google.android.gms.internal.ads.zzafy, com.google.android.gms.internal.ads.zzajr] */
    /* JADX WARN: Type inference failed for: r2v63 */
    /* JADX WARN: Type inference failed for: r2v64 */
    /* JADX WARN: Type inference failed for: r2v65 */
    /* JADX WARN: Type inference failed for: r5v24, types: [com.google.android.gms.internal.ads.zzaex] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zzi(com.google.android.gms.internal.ads.zzaev r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 762
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajp.zzi(com.google.android.gms.internal.ads.zzaev):int");
    }

    private final long zzj(long j10) {
        return this.zzl + ((j10 * 1000000) / ((long) this.zzc.zzd));
    }

    private final boolean zzk(zzaev zzaevVar, boolean z10) throws IOException {
        int iZzm;
        int i10;
        int iZza;
        zzaevVar.zzl();
        if (zzaevVar.zzn() == 0) {
            zzap zzapVarZza = this.zze.zza(zzaevVar, null, 131072);
            this.zzk = zzapVarZza;
            if (zzapVarZza != null) {
                this.zzd.zza(zzapVarZza);
            }
            iZzm = (int) zzaevVar.zzm();
            if (!z10) {
                zzaevVar.zzf(iZzm);
            }
            i10 = 0;
        } else {
            iZzm = 0;
            i10 = 0;
        }
        int i11 = i10;
        int i12 = i11;
        while (true) {
            if (!zzl(zzaevVar)) {
                zzer zzerVar = this.zzb;
                zzerVar.zzh(0);
                int iZzB = zzerVar.zzB();
                if ((i10 == 0 || zzn(iZzB, i10)) && (iZza = zzafs.zza(iZzB)) != -1) {
                    i11++;
                    if (i11 != 1) {
                        if (i11 == 4) {
                            break;
                        }
                    } else {
                        this.zzc.zza(iZzB);
                        i10 = iZzB;
                    }
                    zzaevVar.zzk(iZza - 4);
                } else {
                    int i13 = i12 + 1;
                    if (i12 == 131072) {
                        if (z10) {
                            return false;
                        }
                        zzm();
                        throw new EOFException();
                    }
                    if (z10) {
                        zzaevVar.zzl();
                        zzaevVar.zzk(iZzm + i13);
                    } else {
                        zzaevVar.zzf(1);
                    }
                    i11 = 0;
                    i12 = i13;
                    i10 = 0;
                }
            } else if (i11 <= 0) {
                zzm();
                throw new EOFException();
            }
        }
        if (z10) {
            zzaevVar.zzf(iZzm + i12);
        } else {
            zzaevVar.zzl();
        }
        this.zzj = i10;
        return true;
    }

    private final boolean zzl(zzaev zzaevVar) throws IOException {
        zzajr zzajrVar = this.zzq;
        if (zzajrVar != null) {
            long jZzf = zzajrVar.zzf();
            if (jZzf != -1 && zzaevVar.zzm() > jZzf - 4) {
                return true;
            }
        }
        try {
            return !zzaevVar.zzh(this.zzb.zzi(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final void zzm() {
        zzajr zzajrVar = this.zzq;
        if ((zzajrVar instanceof zzajk) && zzajrVar.zzb()) {
            long j10 = this.zzo;
            if (j10 == -1 || j10 == this.zzq.zzf()) {
                return;
            }
            this.zzq = ((zzajk) this.zzq).zzh(this.zzo);
            zzaex zzaexVar = this.zzg;
            zzaexVar.getClass();
            zzaexVar.zzw(this.zzq);
            this.zzh.getClass();
            this.zzq.zza();
        }
    }

    private static boolean zzn(int i10, long j10) {
        return ((long) (i10 & (-128000))) == (j10 & (-128000));
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) throws IOException {
        return zzk(zzaevVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public /* synthetic */ List zzb() {
        return k.a(this);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        this.zzg = zzaexVar;
        zzagh zzaghVarZzu = zzaexVar.zzu(0, 1);
        this.zzh = zzaghVarZzu;
        this.zzi = zzaghVarZzu;
        this.zzg.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) throws Throwable {
        this.zzh.getClass();
        String str = zzfj.zza;
        int iZzi = zzi(zzaevVar);
        if (iZzi == -1 && (this.zzq instanceof zzajl)) {
            if (this.zzq.zza() != zzj(this.zzm)) {
                throw null;
            }
        }
        return iZzi;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j10, long j11) {
        this.zzj = 0;
        this.zzl = -9223372036854775807L;
        this.zzm = 0L;
        this.zzp = 0;
        this.zzo = -1L;
        if (this.zzq instanceof zzajl) {
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public /* synthetic */ zzaeu zzg() {
        return k.b(this);
    }

    public final void zzh() {
        this.zzr = true;
    }

    public zzajp(int i10) {
        this.zzb = new zzer(10);
        this.zzc = new zzafr();
        this.zzd = new zzafn();
        this.zzl = -9223372036854775807L;
        this.zze = new zzafp();
        zzaer zzaerVar = new zzaer();
        this.zzf = zzaerVar;
        this.zzi = zzaerVar;
        this.zzo = -1L;
    }
}
