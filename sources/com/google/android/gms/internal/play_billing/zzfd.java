package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zzfd implements zzit {
    private final zzfc zza;

    private zzfd(zzfc zzfcVar) {
        byte[] bArr = zzga.zzb;
        this.zza = zzfcVar;
        zzfcVar.zza = this;
    }

    public static zzfd zza(zzfc zzfcVar) {
        Object obj = zzfcVar.zza;
        return obj != null ? (zzfd) obj : new zzfd(zzfcVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzA(int i10, long j10) throws IOException {
        this.zza.zzj(i10, j10);
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzB(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzgp)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzj(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            zzfc zzfcVar = this.zza;
            zzfcVar.zzs(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                i12 += 8;
            }
            zzfcVar.zzu(i12);
            while (i11 < list.size()) {
                zzfcVar.zzk(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzgp zzgpVar = (zzgp) list;
        if (!z10) {
            while (i11 < zzgpVar.size()) {
                this.zza.zzj(i10, zzgpVar.zze(i11));
                i11++;
            }
            return;
        }
        zzfc zzfcVar2 = this.zza;
        zzfcVar2.zzs(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzgpVar.size(); i15++) {
            zzgpVar.zze(i15);
            i14 += 8;
        }
        zzfcVar2.zzu(i14);
        while (i11 < zzgpVar.size()) {
            zzfcVar2.zzk(zzgpVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzC(int i10, int i11) throws IOException {
        this.zza.zzt(i10, (i11 >> 31) ^ (i11 + i11));
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzD(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzfv)) {
            if (!z10) {
                while (i11 < list.size()) {
                    zzfc zzfcVar = this.zza;
                    int iIntValue = ((Integer) list.get(i11)).intValue();
                    zzfcVar.zzt(i10, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i11++;
                }
                return;
            }
            zzfc zzfcVar2 = this.zza;
            zzfcVar2.zzs(i10, 2);
            int iZzy = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                int iIntValue2 = ((Integer) list.get(i12)).intValue();
                iZzy += zzfc.zzy((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            zzfcVar2.zzu(iZzy);
            while (i11 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i11)).intValue();
                zzfcVar2.zzu((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i11++;
            }
            return;
        }
        zzfv zzfvVar = (zzfv) list;
        if (!z10) {
            while (i11 < zzfvVar.size()) {
                zzfc zzfcVar3 = this.zza;
                int iZze = zzfvVar.zze(i11);
                zzfcVar3.zzt(i10, (iZze >> 31) ^ (iZze + iZze));
                i11++;
            }
            return;
        }
        zzfc zzfcVar4 = this.zza;
        zzfcVar4.zzs(i10, 2);
        int iZzy2 = 0;
        for (int i13 = 0; i13 < zzfvVar.size(); i13++) {
            int iZze2 = zzfvVar.zze(i13);
            iZzy2 += zzfc.zzy((iZze2 >> 31) ^ (iZze2 + iZze2));
        }
        zzfcVar4.zzu(iZzy2);
        while (i11 < zzfvVar.size()) {
            int iZze3 = zzfvVar.zze(i11);
            zzfcVar4.zzu((iZze3 >> 31) ^ (iZze3 + iZze3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzE(int i10, long j10) throws IOException {
        this.zza.zzv(i10, (j10 >> 63) ^ (j10 + j10));
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzF(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzgp)) {
            if (!z10) {
                while (i11 < list.size()) {
                    zzfc zzfcVar = this.zza;
                    long jLongValue = ((Long) list.get(i11)).longValue();
                    zzfcVar.zzv(i10, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i11++;
                }
                return;
            }
            zzfc zzfcVar2 = this.zza;
            zzfcVar2.zzs(i10, 2);
            int iZzz = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                long jLongValue2 = ((Long) list.get(i12)).longValue();
                iZzz += zzfc.zzz((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            zzfcVar2.zzu(iZzz);
            while (i11 < list.size()) {
                long jLongValue3 = ((Long) list.get(i11)).longValue();
                zzfcVar2.zzw((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i11++;
            }
            return;
        }
        zzgp zzgpVar = (zzgp) list;
        if (!z10) {
            while (i11 < zzgpVar.size()) {
                zzfc zzfcVar3 = this.zza;
                long jZze = zzgpVar.zze(i11);
                zzfcVar3.zzv(i10, (jZze >> 63) ^ (jZze + jZze));
                i11++;
            }
            return;
        }
        zzfc zzfcVar4 = this.zza;
        zzfcVar4.zzs(i10, 2);
        int iZzz2 = 0;
        for (int i13 = 0; i13 < zzgpVar.size(); i13++) {
            long jZze2 = zzgpVar.zze(i13);
            iZzz2 += zzfc.zzz((jZze2 >> 63) ^ (jZze2 + jZze2));
        }
        zzfcVar4.zzu(iZzz2);
        while (i11 < zzgpVar.size()) {
            long jZze3 = zzgpVar.zze(i11);
            zzfcVar4.zzw((jZze3 >> 63) ^ (jZze3 + jZze3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    @Deprecated
    public final void zzG(int i10) throws IOException {
        this.zza.zzs(i10, 3);
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzH(int i10, String str) throws IOException {
        this.zza.zzq(i10, str);
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzI(int i10, List list) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzgj)) {
            while (i11 < list.size()) {
                this.zza.zzq(i10, (String) list.get(i11));
                i11++;
            }
            return;
        }
        zzgj zzgjVar = (zzgj) list;
        while (i11 < list.size()) {
            Object objZza = zzgjVar.zza();
            if (objZza instanceof String) {
                this.zza.zzq(i10, (String) objZza);
            } else {
                this.zza.zzf(i10, (zzev) objZza);
            }
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzJ(int i10, int i11) throws IOException {
        this.zza.zzt(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzK(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzfv)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzt(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            zzfc zzfcVar = this.zza;
            zzfcVar.zzs(i10, 2);
            int iZzy = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzy += zzfc.zzy(((Integer) list.get(i12)).intValue());
            }
            zzfcVar.zzu(iZzy);
            while (i11 < list.size()) {
                zzfcVar.zzu(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzfv zzfvVar = (zzfv) list;
        if (!z10) {
            while (i11 < zzfvVar.size()) {
                this.zza.zzt(i10, zzfvVar.zze(i11));
                i11++;
            }
            return;
        }
        zzfc zzfcVar2 = this.zza;
        zzfcVar2.zzs(i10, 2);
        int iZzy2 = 0;
        for (int i13 = 0; i13 < zzfvVar.size(); i13++) {
            iZzy2 += zzfc.zzy(zzfvVar.zze(i13));
        }
        zzfcVar2.zzu(iZzy2);
        while (i11 < zzfvVar.size()) {
            zzfcVar2.zzu(zzfvVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzL(int i10, long j10) throws IOException {
        this.zza.zzv(i10, j10);
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzM(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzgp)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzv(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            zzfc zzfcVar = this.zza;
            zzfcVar.zzs(i10, 2);
            int iZzz = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzz += zzfc.zzz(((Long) list.get(i12)).longValue());
            }
            zzfcVar.zzu(iZzz);
            while (i11 < list.size()) {
                zzfcVar.zzw(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzgp zzgpVar = (zzgp) list;
        if (!z10) {
            while (i11 < zzgpVar.size()) {
                this.zza.zzv(i10, zzgpVar.zze(i11));
                i11++;
            }
            return;
        }
        zzfc zzfcVar2 = this.zza;
        zzfcVar2.zzs(i10, 2);
        int iZzz2 = 0;
        for (int i13 = 0; i13 < zzgpVar.size(); i13++) {
            iZzz2 += zzfc.zzz(zzgpVar.zze(i13));
        }
        zzfcVar2.zzu(iZzz2);
        while (i11 < zzgpVar.size()) {
            zzfcVar2.zzw(zzgpVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzb(int i10, boolean z10) throws IOException {
        this.zza.zzd(i10, z10);
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
    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzc(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzel)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzd(i10, ((Boolean) list.get(i11)).booleanValue());
                    i11++;
                }
                return;
            }
            zzfc zzfcVar = this.zza;
            zzfcVar.zzs(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Boolean) list.get(i13)).getClass();
                i12++;
            }
            zzfcVar.zzu(i12);
            while (i11 < list.size()) {
                zzfcVar.zzb(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
                i11++;
            }
            return;
        }
        zzel zzelVar = (zzel) list;
        if (!z10) {
            while (i11 < zzelVar.size()) {
                this.zza.zzd(i10, zzelVar.zzf(i11));
                i11++;
            }
            return;
        }
        zzfc zzfcVar2 = this.zza;
        zzfcVar2.zzs(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzelVar.size(); i15++) {
            zzelVar.zzf(i15);
            i14++;
        }
        zzfcVar2.zzu(i14);
        while (i11 < zzelVar.size()) {
            zzfcVar2.zzb(zzelVar.zzf(i11) ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzd(int i10, zzev zzevVar) throws IOException {
        this.zza.zzf(i10, zzevVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zze(int i10, List list) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.zza.zzf(i10, (zzev) list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzf(int i10, double d10) throws IOException {
        this.zza.zzj(i10, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzg(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzfe)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzj(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                    i11++;
                }
                return;
            }
            zzfc zzfcVar = this.zza;
            zzfcVar.zzs(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Double) list.get(i13)).getClass();
                i12 += 8;
            }
            zzfcVar.zzu(i12);
            while (i11 < list.size()) {
                zzfcVar.zzk(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        zzfe zzfeVar = (zzfe) list;
        if (!z10) {
            while (i11 < zzfeVar.size()) {
                this.zza.zzj(i10, Double.doubleToRawLongBits(zzfeVar.zze(i11)));
                i11++;
            }
            return;
        }
        zzfc zzfcVar2 = this.zza;
        zzfcVar2.zzs(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzfeVar.size(); i15++) {
            zzfeVar.zze(i15);
            i14 += 8;
        }
        zzfcVar2.zzu(i14);
        while (i11 < zzfeVar.size()) {
            zzfcVar2.zzk(Double.doubleToRawLongBits(zzfeVar.zze(i11)));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    @Deprecated
    public final void zzh(int i10) throws IOException {
        this.zza.zzs(i10, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzi(int i10, int i11) throws IOException {
        this.zza.zzl(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzj(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzfv)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzl(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            zzfc zzfcVar = this.zza;
            zzfcVar.zzs(i10, 2);
            int iZzz = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzz += zzfc.zzz(((Integer) list.get(i12)).intValue());
            }
            zzfcVar.zzu(iZzz);
            while (i11 < list.size()) {
                zzfcVar.zzm(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzfv zzfvVar = (zzfv) list;
        if (!z10) {
            while (i11 < zzfvVar.size()) {
                this.zza.zzl(i10, zzfvVar.zze(i11));
                i11++;
            }
            return;
        }
        zzfc zzfcVar2 = this.zza;
        zzfcVar2.zzs(i10, 2);
        int iZzz2 = 0;
        for (int i13 = 0; i13 < zzfvVar.size(); i13++) {
            iZzz2 += zzfc.zzz(zzfvVar.zze(i13));
        }
        zzfcVar2.zzu(iZzz2);
        while (i11 < zzfvVar.size()) {
            zzfcVar2.zzm(zzfvVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzk(int i10, int i11) throws IOException {
        this.zza.zzh(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzl(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzfv)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzh(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            zzfc zzfcVar = this.zza;
            zzfcVar.zzs(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            zzfcVar.zzu(i12);
            while (i11 < list.size()) {
                zzfcVar.zzi(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzfv zzfvVar = (zzfv) list;
        if (!z10) {
            while (i11 < zzfvVar.size()) {
                this.zza.zzh(i10, zzfvVar.zze(i11));
                i11++;
            }
            return;
        }
        zzfc zzfcVar2 = this.zza;
        zzfcVar2.zzs(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzfvVar.size(); i15++) {
            zzfvVar.zze(i15);
            i14 += 4;
        }
        zzfcVar2.zzu(i14);
        while (i11 < zzfvVar.size()) {
            zzfcVar2.zzi(zzfvVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzm(int i10, long j10) throws IOException {
        this.zza.zzj(i10, j10);
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzn(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzgp)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzj(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            zzfc zzfcVar = this.zza;
            zzfcVar.zzs(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                i12 += 8;
            }
            zzfcVar.zzu(i12);
            while (i11 < list.size()) {
                zzfcVar.zzk(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzgp zzgpVar = (zzgp) list;
        if (!z10) {
            while (i11 < zzgpVar.size()) {
                this.zza.zzj(i10, zzgpVar.zze(i11));
                i11++;
            }
            return;
        }
        zzfc zzfcVar2 = this.zza;
        zzfcVar2.zzs(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzgpVar.size(); i15++) {
            zzgpVar.zze(i15);
            i14 += 8;
        }
        zzfcVar2.zzu(i14);
        while (i11 < zzgpVar.size()) {
            zzfcVar2.zzk(zzgpVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzo(int i10, float f10) throws IOException {
        this.zza.zzh(i10, Float.floatToRawIntBits(f10));
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzp(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzfo)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzh(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                    i11++;
                }
                return;
            }
            zzfc zzfcVar = this.zza;
            zzfcVar.zzs(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Float) list.get(i13)).getClass();
                i12 += 4;
            }
            zzfcVar.zzu(i12);
            while (i11 < list.size()) {
                zzfcVar.zzi(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        zzfo zzfoVar = (zzfo) list;
        if (!z10) {
            while (i11 < zzfoVar.size()) {
                this.zza.zzh(i10, Float.floatToRawIntBits(zzfoVar.zze(i11)));
                i11++;
            }
            return;
        }
        zzfc zzfcVar2 = this.zza;
        zzfcVar2.zzs(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzfoVar.size(); i15++) {
            zzfoVar.zze(i15);
            i14 += 4;
        }
        zzfcVar2.zzu(i14);
        while (i11 < zzfoVar.size()) {
            zzfcVar2.zzi(Float.floatToRawIntBits(zzfoVar.zze(i11)));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzq(int i10, Object obj, zzhl zzhlVar) throws IOException {
        zzfc zzfcVar = this.zza;
        zzfcVar.zzs(i10, 3);
        zzhlVar.zzi((zzeg) obj, this);
        zzfcVar.zzs(i10, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzr(int i10, int i11) throws IOException {
        this.zza.zzl(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzs(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzfv)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzl(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            zzfc zzfcVar = this.zza;
            zzfcVar.zzs(i10, 2);
            int iZzz = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzz += zzfc.zzz(((Integer) list.get(i12)).intValue());
            }
            zzfcVar.zzu(iZzz);
            while (i11 < list.size()) {
                zzfcVar.zzm(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzfv zzfvVar = (zzfv) list;
        if (!z10) {
            while (i11 < zzfvVar.size()) {
                this.zza.zzl(i10, zzfvVar.zze(i11));
                i11++;
            }
            return;
        }
        zzfc zzfcVar2 = this.zza;
        zzfcVar2.zzs(i10, 2);
        int iZzz2 = 0;
        for (int i13 = 0; i13 < zzfvVar.size(); i13++) {
            iZzz2 += zzfc.zzz(zzfvVar.zze(i13));
        }
        zzfcVar2.zzu(iZzz2);
        while (i11 < zzfvVar.size()) {
            zzfcVar2.zzm(zzfvVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzt(int i10, long j10) throws IOException {
        this.zza.zzv(i10, j10);
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzu(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzgp)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzv(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            zzfc zzfcVar = this.zza;
            zzfcVar.zzs(i10, 2);
            int iZzz = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzz += zzfc.zzz(((Long) list.get(i12)).longValue());
            }
            zzfcVar.zzu(iZzz);
            while (i11 < list.size()) {
                zzfcVar.zzw(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzgp zzgpVar = (zzgp) list;
        if (!z10) {
            while (i11 < zzgpVar.size()) {
                this.zza.zzv(i10, zzgpVar.zze(i11));
                i11++;
            }
            return;
        }
        zzfc zzfcVar2 = this.zza;
        zzfcVar2.zzs(i10, 2);
        int iZzz2 = 0;
        for (int i13 = 0; i13 < zzgpVar.size(); i13++) {
            iZzz2 += zzfc.zzz(zzgpVar.zze(i13));
        }
        zzfcVar2.zzu(iZzz2);
        while (i11 < zzgpVar.size()) {
            zzfcVar2.zzw(zzgpVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzv(int i10, zzgt zzgtVar, Map map) throws IOException {
        for (Map.Entry entry : map.entrySet()) {
            zzfc zzfcVar = this.zza;
            zzfcVar.zzs(i10, 2);
            zzfcVar.zzu(zzgu.zzb(zzgtVar, entry.getKey(), entry.getValue()));
            zzgu.zze(zzfcVar, zzgtVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzw(int i10, Object obj, zzhl zzhlVar) throws IOException {
        zzfc zzfcVar = this.zza;
        zzeg zzegVar = (zzeg) obj;
        zzfcVar.zzs(i10, 2);
        zzfcVar.zzu(zzegVar.zzi(zzhlVar));
        zzhlVar.zzi(zzegVar, this);
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzx(int i10, Object obj) throws IOException {
        if (obj instanceof zzev) {
            this.zza.zzp(i10, (zzev) obj);
        } else {
            this.zza.zzo(i10, (zzhb) obj);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzy(int i10, int i11) throws IOException {
        this.zza.zzh(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzz(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzfv)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzh(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            zzfc zzfcVar = this.zza;
            zzfcVar.zzs(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            zzfcVar.zzu(i12);
            while (i11 < list.size()) {
                zzfcVar.zzi(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzfv zzfvVar = (zzfv) list;
        if (!z10) {
            while (i11 < zzfvVar.size()) {
                this.zza.zzh(i10, zzfvVar.zze(i11));
                i11++;
            }
            return;
        }
        zzfc zzfcVar2 = this.zza;
        zzfcVar2.zzs(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzfvVar.size(); i15++) {
            zzfvVar.zze(i15);
            i14 += 4;
        }
        zzfcVar2.zzu(i14);
        while (i11 < zzfvVar.size()) {
            zzfcVar2.zzi(zzfvVar.zze(i11));
            i11++;
        }
    }
}
