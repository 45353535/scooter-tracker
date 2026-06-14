package com.google.android.gms.internal.ads;

import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes8.dex */
final class zzaov {
    private final zzagh zza;
    private long zzb;
    private boolean zzc;
    private int zzd;
    private long zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private long zzk;
    private long zzl;
    private boolean zzm;

    public zzaov(zzagh zzaghVar) {
        this.zza = zzaghVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void zze(int i10) {
        long j10 = this.zzl;
        if (j10 != -9223372036854775807L) {
            long j11 = this.zzb;
            long j12 = this.zzk;
            if (j11 == j12) {
                return;
            }
            int i11 = (int) (j11 - j12);
            this.zza.zze(j10, this.zzm ? 1 : 0, i11, i10, null);
        }
    }

    public final void zza() {
        this.zzf = false;
        this.zzg = false;
        this.zzh = false;
        this.zzi = false;
        this.zzj = false;
    }

    public final void zzb(long j10, int i10, int i11, long j11, boolean z10) {
        this.zzg = false;
        this.zzh = false;
        this.zze = j11;
        this.zzd = 0;
        this.zzb = j10;
        if (i11 >= 32 && i11 != 40) {
            if (this.zzi && !this.zzj) {
                if (z10) {
                    zze(i10);
                }
                this.zzi = false;
            }
            if (i11 <= 35 || i11 == 39) {
                this.zzh = !this.zzj;
                this.zzj = true;
            }
        }
        boolean z11 = i11 >= 16 && i11 <= 21;
        this.zzc = z11;
        this.zzf = z11 || i11 <= 9;
    }

    public final void zzc(byte[] bArr, int i10, int i11) {
        if (this.zzf) {
            int i12 = this.zzd;
            int i13 = (i10 + 2) - i12;
            if (i13 >= i11) {
                this.zzd = i12 + (i11 - i10);
            } else {
                this.zzg = (bArr[i13] & UnsignedBytes.MAX_POWER_OF_TWO) != 0;
                this.zzf = false;
            }
        }
    }

    public final void zzd(long j10, int i10, boolean z10) {
        if (this.zzj && this.zzg) {
            this.zzm = this.zzc;
            this.zzj = false;
        } else if (this.zzh || this.zzg) {
            if (z10 && this.zzi) {
                zze(i10 + ((int) (j10 - this.zzb)));
            }
            this.zzk = this.zzb;
            this.zzl = this.zze;
            this.zzm = this.zzc;
            this.zzi = true;
        }
    }
}
