package com.google.android.gms.internal.consent_sdk;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zzpw implements zztb {
    private final zzpv zza;

    private zzpw(zzpv zzpvVar) {
        byte[] bArr = zzqs.zzb;
        this.zza = zzpvVar;
        zzpvVar.zze = this;
    }

    public static zzpw zza(zzpv zzpvVar) {
        Object obj = zzpvVar.zze;
        return obj != null ? (zzpw) obj : new zzpw(zzpvVar);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzA(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzre)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzl(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            zzpv zzpvVar = this.zza;
            zzpvVar.zzu(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                i12 += 8;
            }
            zzpvVar.zzw(i12);
            while (i11 < list.size()) {
                zzpvVar.zzm(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzre zzreVar = (zzre) list;
        if (!z10) {
            while (i11 < zzreVar.size()) {
                this.zza.zzl(i10, zzreVar.zze(i11));
                i11++;
            }
            return;
        }
        zzpv zzpvVar2 = this.zza;
        zzpvVar2.zzu(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzreVar.size(); i15++) {
            zzreVar.zze(i15);
            i14 += 8;
        }
        zzpvVar2.zzw(i14);
        while (i11 < zzreVar.size()) {
            zzpvVar2.zzm(zzreVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzB(int i10, int i11) throws IOException {
        this.zza.zzv(i10, (i11 >> 31) ^ (i11 + i11));
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzC(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzqn)) {
            if (!z10) {
                while (i11 < list.size()) {
                    zzpv zzpvVar = this.zza;
                    int iIntValue = ((Integer) list.get(i11)).intValue();
                    zzpvVar.zzv(i10, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i11++;
                }
                return;
            }
            zzpv zzpvVar2 = this.zza;
            zzpvVar2.zzu(i10, 2);
            int iZzC = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                int iIntValue2 = ((Integer) list.get(i12)).intValue();
                iZzC += zzpv.zzC((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            zzpvVar2.zzw(iZzC);
            while (i11 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i11)).intValue();
                zzpvVar2.zzw((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i11++;
            }
            return;
        }
        zzqn zzqnVar = (zzqn) list;
        if (!z10) {
            while (i11 < zzqnVar.size()) {
                zzpv zzpvVar3 = this.zza;
                int iZze = zzqnVar.zze(i11);
                zzpvVar3.zzv(i10, (iZze >> 31) ^ (iZze + iZze));
                i11++;
            }
            return;
        }
        zzpv zzpvVar4 = this.zza;
        zzpvVar4.zzu(i10, 2);
        int iZzC2 = 0;
        for (int i13 = 0; i13 < zzqnVar.size(); i13++) {
            int iZze2 = zzqnVar.zze(i13);
            iZzC2 += zzpv.zzC((iZze2 >> 31) ^ (iZze2 + iZze2));
        }
        zzpvVar4.zzw(iZzC2);
        while (i11 < zzqnVar.size()) {
            int iZze3 = zzqnVar.zze(i11);
            zzpvVar4.zzw((iZze3 >> 31) ^ (iZze3 + iZze3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzD(int i10, long j10) throws IOException {
        this.zza.zzx(i10, (j10 >> 63) ^ (j10 + j10));
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzE(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzre)) {
            if (!z10) {
                while (i11 < list.size()) {
                    zzpv zzpvVar = this.zza;
                    long jLongValue = ((Long) list.get(i11)).longValue();
                    zzpvVar.zzx(i10, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i11++;
                }
                return;
            }
            zzpv zzpvVar2 = this.zza;
            zzpvVar2.zzu(i10, 2);
            int iZzD = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                long jLongValue2 = ((Long) list.get(i12)).longValue();
                iZzD += zzpv.zzD((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            zzpvVar2.zzw(iZzD);
            while (i11 < list.size()) {
                long jLongValue3 = ((Long) list.get(i11)).longValue();
                zzpvVar2.zzy((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i11++;
            }
            return;
        }
        zzre zzreVar = (zzre) list;
        if (!z10) {
            while (i11 < zzreVar.size()) {
                zzpv zzpvVar3 = this.zza;
                long jZze = zzreVar.zze(i11);
                zzpvVar3.zzx(i10, (jZze >> 63) ^ (jZze + jZze));
                i11++;
            }
            return;
        }
        zzpv zzpvVar4 = this.zza;
        zzpvVar4.zzu(i10, 2);
        int iZzD2 = 0;
        for (int i13 = 0; i13 < zzreVar.size(); i13++) {
            long jZze2 = zzreVar.zze(i13);
            iZzD2 += zzpv.zzD((jZze2 >> 63) ^ (jZze2 + jZze2));
        }
        zzpvVar4.zzw(iZzD2);
        while (i11 < zzreVar.size()) {
            long jZze3 = zzreVar.zze(i11);
            zzpvVar4.zzy((jZze3 >> 63) ^ (jZze3 + jZze3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzF(int i10, String str) throws IOException {
        this.zza.zzs(i10, str);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzG(int i10, List list) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzrb)) {
            while (i11 < list.size()) {
                this.zza.zzs(i10, (String) list.get(i11));
                i11++;
            }
            return;
        }
        zzrb zzrbVar = (zzrb) list;
        while (i11 < list.size()) {
            Object objZza = zzrbVar.zza();
            if (objZza instanceof String) {
                this.zza.zzs(i10, (String) objZza);
            } else {
                this.zza.zzh(i10, (zzpm) objZza);
            }
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzH(int i10, int i11) throws IOException {
        this.zza.zzv(i10, i11);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzI(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzqn)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzv(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            zzpv zzpvVar = this.zza;
            zzpvVar.zzu(i10, 2);
            int iZzC = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzC += zzpv.zzC(((Integer) list.get(i12)).intValue());
            }
            zzpvVar.zzw(iZzC);
            while (i11 < list.size()) {
                zzpvVar.zzw(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzqn zzqnVar = (zzqn) list;
        if (!z10) {
            while (i11 < zzqnVar.size()) {
                this.zza.zzv(i10, zzqnVar.zze(i11));
                i11++;
            }
            return;
        }
        zzpv zzpvVar2 = this.zza;
        zzpvVar2.zzu(i10, 2);
        int iZzC2 = 0;
        for (int i13 = 0; i13 < zzqnVar.size(); i13++) {
            iZzC2 += zzpv.zzC(zzqnVar.zze(i13));
        }
        zzpvVar2.zzw(iZzC2);
        while (i11 < zzqnVar.size()) {
            zzpvVar2.zzw(zzqnVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzJ(int i10, long j10) throws IOException {
        this.zza.zzx(i10, j10);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzK(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzre)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzx(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            zzpv zzpvVar = this.zza;
            zzpvVar.zzu(i10, 2);
            int iZzD = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzD += zzpv.zzD(((Long) list.get(i12)).longValue());
            }
            zzpvVar.zzw(iZzD);
            while (i11 < list.size()) {
                zzpvVar.zzy(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzre zzreVar = (zzre) list;
        if (!z10) {
            while (i11 < zzreVar.size()) {
                this.zza.zzx(i10, zzreVar.zze(i11));
                i11++;
            }
            return;
        }
        zzpv zzpvVar2 = this.zza;
        zzpvVar2.zzu(i10, 2);
        int iZzD2 = 0;
        for (int i13 = 0; i13 < zzreVar.size(); i13++) {
            iZzD2 += zzpv.zzD(zzreVar.zze(i13));
        }
        zzpvVar2.zzw(iZzD2);
        while (i11 < zzreVar.size()) {
            zzpvVar2.zzy(zzreVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzb(int i10, boolean z10) throws IOException {
        this.zza.zzK(i10, z10);
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
    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzc(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzpd)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzK(i10, ((Boolean) list.get(i11)).booleanValue());
                    i11++;
                }
                return;
            }
            zzpv zzpvVar = this.zza;
            zzpvVar.zzu(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Boolean) list.get(i13)).getClass();
                i12++;
            }
            zzpvVar.zzw(i12);
            while (i11 < list.size()) {
                zzpvVar.zzJ(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
                i11++;
            }
            return;
        }
        zzpd zzpdVar = (zzpd) list;
        if (!z10) {
            while (i11 < zzpdVar.size()) {
                this.zza.zzK(i10, zzpdVar.zze(i11));
                i11++;
            }
            return;
        }
        zzpv zzpvVar2 = this.zza;
        zzpvVar2.zzu(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzpdVar.size(); i15++) {
            zzpdVar.zze(i15);
            i14++;
        }
        zzpvVar2.zzw(i14);
        while (i11 < zzpdVar.size()) {
            zzpvVar2.zzJ(zzpdVar.zze(i11) ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzd(int i10, zzpm zzpmVar) throws IOException {
        this.zza.zzh(i10, zzpmVar);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zze(int i10, List list) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.zza.zzh(i10, (zzpm) list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzf(int i10, double d10) throws IOException {
        this.zza.zzl(i10, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzg(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzpx)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzl(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                    i11++;
                }
                return;
            }
            zzpv zzpvVar = this.zza;
            zzpvVar.zzu(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Double) list.get(i13)).getClass();
                i12 += 8;
            }
            zzpvVar.zzw(i12);
            while (i11 < list.size()) {
                zzpvVar.zzm(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        zzpx zzpxVar = (zzpx) list;
        if (!z10) {
            while (i11 < zzpxVar.size()) {
                this.zza.zzl(i10, Double.doubleToRawLongBits(zzpxVar.zze(i11)));
                i11++;
            }
            return;
        }
        zzpv zzpvVar2 = this.zza;
        zzpvVar2.zzu(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzpxVar.size(); i15++) {
            zzpxVar.zze(i15);
            i14 += 8;
        }
        zzpvVar2.zzw(i14);
        while (i11 < zzpxVar.size()) {
            zzpvVar2.zzm(Double.doubleToRawLongBits(zzpxVar.zze(i11)));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzh(int i10, int i11) throws IOException {
        this.zza.zzn(i10, i11);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzi(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzqn)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzn(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            zzpv zzpvVar = this.zza;
            zzpvVar.zzu(i10, 2);
            int iZzD = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzD += zzpv.zzD(((Integer) list.get(i12)).intValue());
            }
            zzpvVar.zzw(iZzD);
            while (i11 < list.size()) {
                zzpvVar.zzo(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzqn zzqnVar = (zzqn) list;
        if (!z10) {
            while (i11 < zzqnVar.size()) {
                this.zza.zzn(i10, zzqnVar.zze(i11));
                i11++;
            }
            return;
        }
        zzpv zzpvVar2 = this.zza;
        zzpvVar2.zzu(i10, 2);
        int iZzD2 = 0;
        for (int i13 = 0; i13 < zzqnVar.size(); i13++) {
            iZzD2 += zzpv.zzD(zzqnVar.zze(i13));
        }
        zzpvVar2.zzw(iZzD2);
        while (i11 < zzqnVar.size()) {
            zzpvVar2.zzo(zzqnVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzj(int i10, int i11) throws IOException {
        this.zza.zzj(i10, i11);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzk(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzqn)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzj(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            zzpv zzpvVar = this.zza;
            zzpvVar.zzu(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            zzpvVar.zzw(i12);
            while (i11 < list.size()) {
                zzpvVar.zzk(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzqn zzqnVar = (zzqn) list;
        if (!z10) {
            while (i11 < zzqnVar.size()) {
                this.zza.zzj(i10, zzqnVar.zze(i11));
                i11++;
            }
            return;
        }
        zzpv zzpvVar2 = this.zza;
        zzpvVar2.zzu(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzqnVar.size(); i15++) {
            zzqnVar.zze(i15);
            i14 += 4;
        }
        zzpvVar2.zzw(i14);
        while (i11 < zzqnVar.size()) {
            zzpvVar2.zzk(zzqnVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzl(int i10, long j10) throws IOException {
        this.zza.zzl(i10, j10);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzm(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzre)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzl(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            zzpv zzpvVar = this.zza;
            zzpvVar.zzu(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                i12 += 8;
            }
            zzpvVar.zzw(i12);
            while (i11 < list.size()) {
                zzpvVar.zzm(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzre zzreVar = (zzre) list;
        if (!z10) {
            while (i11 < zzreVar.size()) {
                this.zza.zzl(i10, zzreVar.zze(i11));
                i11++;
            }
            return;
        }
        zzpv zzpvVar2 = this.zza;
        zzpvVar2.zzu(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzreVar.size(); i15++) {
            zzreVar.zze(i15);
            i14 += 8;
        }
        zzpvVar2.zzw(i14);
        while (i11 < zzreVar.size()) {
            zzpvVar2.zzm(zzreVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzn(int i10, float f10) throws IOException {
        this.zza.zzj(i10, Float.floatToRawIntBits(f10));
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzo(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzqh)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzj(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                    i11++;
                }
                return;
            }
            zzpv zzpvVar = this.zza;
            zzpvVar.zzu(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Float) list.get(i13)).getClass();
                i12 += 4;
            }
            zzpvVar.zzw(i12);
            while (i11 < list.size()) {
                zzpvVar.zzk(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        zzqh zzqhVar = (zzqh) list;
        if (!z10) {
            while (i11 < zzqhVar.size()) {
                this.zza.zzj(i10, Float.floatToRawIntBits(zzqhVar.zze(i11)));
                i11++;
            }
            return;
        }
        zzpv zzpvVar2 = this.zza;
        zzpvVar2.zzu(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzqhVar.size(); i15++) {
            zzqhVar.zze(i15);
            i14 += 4;
        }
        zzpvVar2.zzw(i14);
        while (i11 < zzqhVar.size()) {
            zzpvVar2.zzk(Float.floatToRawIntBits(zzqhVar.zze(i11)));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzp(int i10, Object obj, zzsa zzsaVar) throws IOException {
        zzpv zzpvVar = this.zza;
        zzpvVar.zzu(i10, 3);
        zzsaVar.zzf((zzpa) obj, this);
        zzpvVar.zzu(i10, 4);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzq(int i10, int i11) throws IOException {
        this.zza.zzn(i10, i11);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzr(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzqn)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzn(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            zzpv zzpvVar = this.zza;
            zzpvVar.zzu(i10, 2);
            int iZzD = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzD += zzpv.zzD(((Integer) list.get(i12)).intValue());
            }
            zzpvVar.zzw(iZzD);
            while (i11 < list.size()) {
                zzpvVar.zzo(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzqn zzqnVar = (zzqn) list;
        if (!z10) {
            while (i11 < zzqnVar.size()) {
                this.zza.zzn(i10, zzqnVar.zze(i11));
                i11++;
            }
            return;
        }
        zzpv zzpvVar2 = this.zza;
        zzpvVar2.zzu(i10, 2);
        int iZzD2 = 0;
        for (int i13 = 0; i13 < zzqnVar.size(); i13++) {
            iZzD2 += zzpv.zzD(zzqnVar.zze(i13));
        }
        zzpvVar2.zzw(iZzD2);
        while (i11 < zzqnVar.size()) {
            zzpvVar2.zzo(zzqnVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzs(int i10, long j10) throws IOException {
        this.zza.zzx(i10, j10);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzt(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzre)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzx(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            zzpv zzpvVar = this.zza;
            zzpvVar.zzu(i10, 2);
            int iZzD = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzD += zzpv.zzD(((Long) list.get(i12)).longValue());
            }
            zzpvVar.zzw(iZzD);
            while (i11 < list.size()) {
                zzpvVar.zzy(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzre zzreVar = (zzre) list;
        if (!z10) {
            while (i11 < zzreVar.size()) {
                this.zza.zzx(i10, zzreVar.zze(i11));
                i11++;
            }
            return;
        }
        zzpv zzpvVar2 = this.zza;
        zzpvVar2.zzu(i10, 2);
        int iZzD2 = 0;
        for (int i13 = 0; i13 < zzreVar.size(); i13++) {
            iZzD2 += zzpv.zzD(zzreVar.zze(i13));
        }
        zzpvVar2.zzw(iZzD2);
        while (i11 < zzreVar.size()) {
            zzpvVar2.zzy(zzreVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzu(int i10, zzri zzriVar, Map map) throws IOException {
        for (Map.Entry entry : map.entrySet()) {
            zzpv zzpvVar = this.zza;
            zzpvVar.zzu(i10, 2);
            zzpvVar.zzw(zzrj.zzb(zzriVar, entry.getKey(), entry.getValue()));
            Object key = entry.getKey();
            Object value = entry.getValue();
            zzqf.zzi(zzpvVar, zzriVar.zza, 1, key);
            zzqf.zzi(zzpvVar, zzriVar.zzb, 2, value);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzv(int i10, Object obj, zzsa zzsaVar) throws IOException {
        zzpv zzpvVar = this.zza;
        zzpa zzpaVar = (zzpa) obj;
        zzpvVar.zzu(i10, 2);
        zzpvVar.zzw(zzpaVar.zzj(zzsaVar));
        zzsaVar.zzf(zzpaVar, this);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzw(int i10, Object obj) throws IOException {
        if (obj instanceof zzpm) {
            this.zza.zzr(i10, (zzpm) obj);
        } else {
            this.zza.zzq(i10, (zzrq) obj);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzx(int i10, int i11) throws IOException {
        this.zza.zzj(i10, i11);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzy(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzqn)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzj(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            zzpv zzpvVar = this.zza;
            zzpvVar.zzu(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            zzpvVar.zzw(i12);
            while (i11 < list.size()) {
                zzpvVar.zzk(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzqn zzqnVar = (zzqn) list;
        if (!z10) {
            while (i11 < zzqnVar.size()) {
                this.zza.zzj(i10, zzqnVar.zze(i11));
                i11++;
            }
            return;
        }
        zzpv zzpvVar2 = this.zza;
        zzpvVar2.zzu(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzqnVar.size(); i15++) {
            zzqnVar.zze(i15);
            i14 += 4;
        }
        zzpvVar2.zzw(i14);
        while (i11 < zzqnVar.size()) {
            zzpvVar2.zzk(zzqnVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzz(int i10, long j10) throws IOException {
        this.zza.zzl(i10, j10);
    }
}
