package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zziax implements zzieu {
    private final zziaw zza;

    private zziax(zziaw zziawVar) {
        zzice.zza(zziawVar, "output");
        this.zza = zziawVar;
        zziawVar.zze = this;
    }

    public static zziax zza(zziaw zziawVar) {
        Object obj = zziawVar.zze;
        return obj != null ? (zziax) obj : new zziax(zziawVar);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzA(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzicq)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzh(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            zziaw zziawVar = this.zza;
            zziawVar.zzH(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                i12 += 8;
            }
            zziawVar.zzs(i12);
            while (i11 < list.size()) {
                zziawVar.zzv(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzicq zzicqVar = (zzicq) list;
        if (!z10) {
            while (i11 < zzicqVar.size()) {
                this.zza.zzh(i10, zzicqVar.zzc(i11));
                i11++;
            }
            return;
        }
        zziaw zziawVar2 = this.zza;
        zziawVar2.zzH(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzicqVar.size(); i15++) {
            zzicqVar.zzc(i15);
            i14 += 8;
        }
        zziawVar2.zzs(i14);
        while (i11 < zzicqVar.size()) {
            zziawVar2.zzv(zzicqVar.zzc(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzB(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzibi)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzK(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                    i11++;
                }
                return;
            }
            zziaw zziawVar = this.zza;
            zziawVar.zzH(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Float) list.get(i13)).getClass();
                i12 += 4;
            }
            zziawVar.zzs(i12);
            while (i11 < list.size()) {
                zziawVar.zzt(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        zzibi zzibiVar = (zzibi) list;
        if (!z10) {
            while (i11 < zzibiVar.size()) {
                this.zza.zzK(i10, Float.floatToRawIntBits(zzibiVar.zzf(i11)));
                i11++;
            }
            return;
        }
        zziaw zziawVar2 = this.zza;
        zziawVar2.zzH(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzibiVar.size(); i15++) {
            zzibiVar.zzf(i15);
            i14 += 4;
        }
        zziawVar2.zzs(i14);
        while (i11 < zzibiVar.size()) {
            zziawVar2.zzt(Float.floatToRawIntBits(zzibiVar.zzf(i11)));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzC(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zziay)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzh(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                    i11++;
                }
                return;
            }
            zziaw zziawVar = this.zza;
            zziawVar.zzH(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Double) list.get(i13)).getClass();
                i12 += 8;
            }
            zziawVar.zzs(i12);
            while (i11 < list.size()) {
                zziawVar.zzv(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        zziay zziayVar = (zziay) list;
        if (!z10) {
            while (i11 < zziayVar.size()) {
                this.zza.zzh(i10, Double.doubleToRawLongBits(zziayVar.zzf(i11)));
                i11++;
            }
            return;
        }
        zziaw zziawVar2 = this.zza;
        zziawVar2.zzH(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zziayVar.size(); i15++) {
            zziayVar.zzf(i15);
            i14 += 8;
        }
        zziawVar2.zzs(i14);
        while (i11 < zziayVar.size()) {
            zziawVar2.zzv(Double.doubleToRawLongBits(zziayVar.zzf(i11)));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzD(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzibs)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzI(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            zziaw zziawVar = this.zza;
            zziawVar.zzH(i10, 2);
            int iZzB = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzB += zziaw.zzB(((Integer) list.get(i12)).intValue());
            }
            zziawVar.zzs(iZzB);
            while (i11 < list.size()) {
                zziawVar.zzr(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzibs zzibsVar = (zzibs) list;
        if (!z10) {
            while (i11 < zzibsVar.size()) {
                this.zza.zzI(i10, zzibsVar.zzf(i11));
                i11++;
            }
            return;
        }
        zziaw zziawVar2 = this.zza;
        zziawVar2.zzH(i10, 2);
        int iZzB2 = 0;
        for (int i13 = 0; i13 < zzibsVar.size(); i13++) {
            iZzB2 += zziaw.zzB(zzibsVar.zzf(i13));
        }
        zziawVar2.zzs(iZzB2);
        while (i11 < zzibsVar.size()) {
            zziawVar2.zzr(zzibsVar.zzf(i11));
            i11++;
        }
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
    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzE(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zziad)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzi(i10, ((Boolean) list.get(i11)).booleanValue());
                    i11++;
                }
                return;
            }
            zziaw zziawVar = this.zza;
            zziawVar.zzH(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Boolean) list.get(i13)).getClass();
                i12++;
            }
            zziawVar.zzs(i12);
            while (i11 < list.size()) {
                zziawVar.zzq(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
                i11++;
            }
            return;
        }
        zziad zziadVar = (zziad) list;
        if (!z10) {
            while (i11 < zziadVar.size()) {
                this.zza.zzi(i10, zziadVar.zzf(i11));
                i11++;
            }
            return;
        }
        zziaw zziawVar2 = this.zza;
        zziawVar2.zzH(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zziadVar.size(); i15++) {
            zziadVar.zzf(i15);
            i14++;
        }
        zziawVar2.zzs(i14);
        while (i11 < zziadVar.size()) {
            zziawVar2.zzq(zziadVar.zzf(i11) ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzF(int i10, List list) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzicn)) {
            while (i11 < list.size()) {
                this.zza.zzj(i10, (String) list.get(i11));
                i11++;
            }
            return;
        }
        zzicn zzicnVar = (zzicn) list;
        while (i11 < list.size()) {
            Object objZzc = zzicnVar.zzc();
            if (objZzc instanceof String) {
                this.zza.zzj(i10, (String) objZzc);
            } else {
                this.zza.zzk(i10, (zzian) objZzc);
            }
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzG(int i10, List list) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.zza.zzk(i10, (zzian) list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzH(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzibs)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzJ(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            zziaw zziawVar = this.zza;
            zziawVar.zzH(i10, 2);
            int iZzA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzA += zziaw.zzA(((Integer) list.get(i12)).intValue());
            }
            zziawVar.zzs(iZzA);
            while (i11 < list.size()) {
                zziawVar.zzs(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzibs zzibsVar = (zzibs) list;
        if (!z10) {
            while (i11 < zzibsVar.size()) {
                this.zza.zzJ(i10, zzibsVar.zzf(i11));
                i11++;
            }
            return;
        }
        zziaw zziawVar2 = this.zza;
        zziawVar2.zzH(i10, 2);
        int iZzA2 = 0;
        for (int i13 = 0; i13 < zzibsVar.size(); i13++) {
            iZzA2 += zziaw.zzA(zzibsVar.zzf(i13));
        }
        zziawVar2.zzs(iZzA2);
        while (i11 < zzibsVar.size()) {
            zziawVar2.zzs(zzibsVar.zzf(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzI(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzibs)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzK(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            zziaw zziawVar = this.zza;
            zziawVar.zzH(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            zziawVar.zzs(i12);
            while (i11 < list.size()) {
                zziawVar.zzt(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzibs zzibsVar = (zzibs) list;
        if (!z10) {
            while (i11 < zzibsVar.size()) {
                this.zza.zzK(i10, zzibsVar.zzf(i11));
                i11++;
            }
            return;
        }
        zziaw zziawVar2 = this.zza;
        zziawVar2.zzH(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzibsVar.size(); i15++) {
            zzibsVar.zzf(i15);
            i14 += 4;
        }
        zziawVar2.zzs(i14);
        while (i11 < zzibsVar.size()) {
            zziawVar2.zzt(zzibsVar.zzf(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzJ(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzicq)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzh(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            zziaw zziawVar = this.zza;
            zziawVar.zzH(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                i12 += 8;
            }
            zziawVar.zzs(i12);
            while (i11 < list.size()) {
                zziawVar.zzv(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzicq zzicqVar = (zzicq) list;
        if (!z10) {
            while (i11 < zzicqVar.size()) {
                this.zza.zzh(i10, zzicqVar.zzc(i11));
                i11++;
            }
            return;
        }
        zziaw zziawVar2 = this.zza;
        zziawVar2.zzH(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzicqVar.size(); i15++) {
            zzicqVar.zzc(i15);
            i14 += 8;
        }
        zziawVar2.zzs(i14);
        while (i11 < zzicqVar.size()) {
            zziawVar2.zzv(zzicqVar.zzc(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzK(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzibs)) {
            if (!z10) {
                while (i11 < list.size()) {
                    zziaw zziawVar = this.zza;
                    int iIntValue = ((Integer) list.get(i11)).intValue();
                    zziawVar.zzJ(i10, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i11++;
                }
                return;
            }
            zziaw zziawVar2 = this.zza;
            zziawVar2.zzH(i10, 2);
            int iZzA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                int iIntValue2 = ((Integer) list.get(i12)).intValue();
                iZzA += zziaw.zzA((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            zziawVar2.zzs(iZzA);
            while (i11 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i11)).intValue();
                zziawVar2.zzs((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i11++;
            }
            return;
        }
        zzibs zzibsVar = (zzibs) list;
        if (!z10) {
            while (i11 < zzibsVar.size()) {
                zziaw zziawVar3 = this.zza;
                int iZzf = zzibsVar.zzf(i11);
                zziawVar3.zzJ(i10, (iZzf >> 31) ^ (iZzf + iZzf));
                i11++;
            }
            return;
        }
        zziaw zziawVar4 = this.zza;
        zziawVar4.zzH(i10, 2);
        int iZzA2 = 0;
        for (int i13 = 0; i13 < zzibsVar.size(); i13++) {
            int iZzf2 = zzibsVar.zzf(i13);
            iZzA2 += zziaw.zzA((iZzf2 >> 31) ^ (iZzf2 + iZzf2));
        }
        zziawVar4.zzs(iZzA2);
        while (i11 < zzibsVar.size()) {
            int iZzf3 = zzibsVar.zzf(i11);
            zziawVar4.zzs((iZzf3 >> 31) ^ (iZzf3 + iZzf3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzL(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzicq)) {
            if (!z10) {
                while (i11 < list.size()) {
                    zziaw zziawVar = this.zza;
                    long jLongValue = ((Long) list.get(i11)).longValue();
                    zziawVar.zzL(i10, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i11++;
                }
                return;
            }
            zziaw zziawVar2 = this.zza;
            zziawVar2.zzH(i10, 2);
            int iZzB = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                long jLongValue2 = ((Long) list.get(i12)).longValue();
                iZzB += zziaw.zzB((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            zziawVar2.zzs(iZzB);
            while (i11 < list.size()) {
                long jLongValue3 = ((Long) list.get(i11)).longValue();
                zziawVar2.zzu((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i11++;
            }
            return;
        }
        zzicq zzicqVar = (zzicq) list;
        if (!z10) {
            while (i11 < zzicqVar.size()) {
                zziaw zziawVar3 = this.zza;
                long jZzc = zzicqVar.zzc(i11);
                zziawVar3.zzL(i10, (jZzc >> 63) ^ (jZzc + jZzc));
                i11++;
            }
            return;
        }
        zziaw zziawVar4 = this.zza;
        zziawVar4.zzH(i10, 2);
        int iZzB2 = 0;
        for (int i13 = 0; i13 < zzicqVar.size(); i13++) {
            long jZzc2 = zzicqVar.zzc(i13);
            iZzB2 += zziaw.zzB((jZzc2 >> 63) ^ (jZzc2 + jZzc2));
        }
        zziawVar4.zzs(iZzB2);
        while (i11 < zzicqVar.size()) {
            long jZzc3 = zzicqVar.zzc(i11);
            zziawVar4.zzu((jZzc3 >> 63) ^ (jZzc3 + jZzc3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzM(int i10, zzicu zzicuVar, Map map) throws IOException {
        for (Map.Entry entry : map.entrySet()) {
            zziaw zziawVar = this.zza;
            zziawVar.zzH(i10, 2);
            zziawVar.zzs(zzicv.zzc(zzicuVar, entry.getKey(), entry.getValue()));
            zzicv.zzb(zziawVar, zzicuVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzb(int i10, int i11) throws IOException {
        this.zza.zzK(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzc(int i10, long j10) throws IOException {
        this.zza.zzL(i10, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzd(int i10, long j10) throws IOException {
        this.zza.zzh(i10, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zze(int i10, float f10) throws IOException {
        this.zza.zzK(i10, Float.floatToRawIntBits(f10));
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzf(int i10, double d10) throws IOException {
        this.zza.zzh(i10, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzg(int i10, int i11) throws IOException {
        this.zza.zzI(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzh(int i10, long j10) throws IOException {
        this.zza.zzL(i10, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzi(int i10, int i11) throws IOException {
        this.zza.zzI(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzj(int i10, long j10) throws IOException {
        this.zza.zzh(i10, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzk(int i10, int i11) throws IOException {
        this.zza.zzK(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzl(int i10, boolean z10) throws IOException {
        this.zza.zzi(i10, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzm(int i10, String str) throws IOException {
        this.zza.zzj(i10, str);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzn(int i10, zzian zzianVar) throws IOException {
        this.zza.zzk(i10, zzianVar);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzo(int i10, int i11) throws IOException {
        this.zza.zzJ(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzp(int i10, int i11) throws IOException {
        this.zza.zzJ(i10, (i11 >> 31) ^ (i11 + i11));
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzq(int i10, long j10) throws IOException {
        this.zza.zzL(i10, (j10 >> 63) ^ (j10 + j10));
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzr(int i10, Object obj, zzidu zziduVar) throws IOException {
        zziaw zziawVar = this.zza;
        zzhzw zzhzwVar = (zzhzw) obj;
        zziawVar.zzH(i10, 2);
        zziawVar.zzs(zzhzwVar.zzaT(zziduVar));
        zziduVar.zzf(zzhzwVar, this);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzs(int i10, Object obj, zzidu zziduVar) throws IOException {
        zziaw zziawVar = this.zza;
        zziawVar.zzH(i10, 3);
        zziduVar.zzf((zzhzw) obj, this);
        zziawVar.zzH(i10, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    @Deprecated
    public final void zzt(int i10) throws IOException {
        this.zza.zzH(i10, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    @Deprecated
    public final void zzu(int i10) throws IOException {
        this.zza.zzH(i10, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzv(int i10, Object obj) throws IOException {
        if (obj instanceof zzian) {
            this.zza.zzo(i10, (zzian) obj);
        } else {
            this.zza.zzn(i10, (zzidc) obj);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzw(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzibs)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzI(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            zziaw zziawVar = this.zza;
            zziawVar.zzH(i10, 2);
            int iZzB = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzB += zziaw.zzB(((Integer) list.get(i12)).intValue());
            }
            zziawVar.zzs(iZzB);
            while (i11 < list.size()) {
                zziawVar.zzr(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzibs zzibsVar = (zzibs) list;
        if (!z10) {
            while (i11 < zzibsVar.size()) {
                this.zza.zzI(i10, zzibsVar.zzf(i11));
                i11++;
            }
            return;
        }
        zziaw zziawVar2 = this.zza;
        zziawVar2.zzH(i10, 2);
        int iZzB2 = 0;
        for (int i13 = 0; i13 < zzibsVar.size(); i13++) {
            iZzB2 += zziaw.zzB(zzibsVar.zzf(i13));
        }
        zziawVar2.zzs(iZzB2);
        while (i11 < zzibsVar.size()) {
            zziawVar2.zzr(zzibsVar.zzf(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzx(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzibs)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzK(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            zziaw zziawVar = this.zza;
            zziawVar.zzH(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            zziawVar.zzs(i12);
            while (i11 < list.size()) {
                zziawVar.zzt(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzibs zzibsVar = (zzibs) list;
        if (!z10) {
            while (i11 < zzibsVar.size()) {
                this.zza.zzK(i10, zzibsVar.zzf(i11));
                i11++;
            }
            return;
        }
        zziaw zziawVar2 = this.zza;
        zziawVar2.zzH(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzibsVar.size(); i15++) {
            zzibsVar.zzf(i15);
            i14 += 4;
        }
        zziawVar2.zzs(i14);
        while (i11 < zzibsVar.size()) {
            zziawVar2.zzt(zzibsVar.zzf(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzy(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzicq)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzL(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            zziaw zziawVar = this.zza;
            zziawVar.zzH(i10, 2);
            int iZzB = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzB += zziaw.zzB(((Long) list.get(i12)).longValue());
            }
            zziawVar.zzs(iZzB);
            while (i11 < list.size()) {
                zziawVar.zzu(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzicq zzicqVar = (zzicq) list;
        if (!z10) {
            while (i11 < zzicqVar.size()) {
                this.zza.zzL(i10, zzicqVar.zzc(i11));
                i11++;
            }
            return;
        }
        zziaw zziawVar2 = this.zza;
        zziawVar2.zzH(i10, 2);
        int iZzB2 = 0;
        for (int i13 = 0; i13 < zzicqVar.size(); i13++) {
            iZzB2 += zziaw.zzB(zzicqVar.zzc(i13));
        }
        zziawVar2.zzs(iZzB2);
        while (i11 < zzicqVar.size()) {
            zziawVar2.zzu(zzicqVar.zzc(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzz(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzicq)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzL(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            zziaw zziawVar = this.zza;
            zziawVar.zzH(i10, 2);
            int iZzB = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzB += zziaw.zzB(((Long) list.get(i12)).longValue());
            }
            zziawVar.zzs(iZzB);
            while (i11 < list.size()) {
                zziawVar.zzu(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzicq zzicqVar = (zzicq) list;
        if (!z10) {
            while (i11 < zzicqVar.size()) {
                this.zza.zzL(i10, zzicqVar.zzc(i11));
                i11++;
            }
            return;
        }
        zziaw zziawVar2 = this.zza;
        zziawVar2.zzH(i10, 2);
        int iZzB2 = 0;
        for (int i13 = 0; i13 < zzicqVar.size(); i13++) {
            iZzB2 += zziaw.zzB(zzicqVar.zzc(i13));
        }
        zziawVar2.zzs(iZzB2);
        while (i11 < zzicqVar.size()) {
            zziawVar2.zzu(zzicqVar.zzc(i11));
            i11++;
        }
    }
}
