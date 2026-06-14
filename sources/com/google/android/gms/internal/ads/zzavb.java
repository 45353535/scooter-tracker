package com.google.android.gms.internal.ads;

import j$.util.Optional;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes8.dex */
public final class zzavb {
    public final zzatw zza;
    public final zzaux zzb;
    public final zzauu zzc;
    public final zzaup zzd;

    public zzavb(zzatw zzatwVar, zzaux zzauxVar, zzaup zzaupVar) {
        int[] iArr = {343945053, 300943123, 276960570, 1098387973, 1376531620, 1545514151, 271059426, 857490000, 454333378};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        this.zza = zzatwVar;
        this.zzb = zzauxVar;
        this.zzd = zzaupVar;
        this.zzc = new zzauu((i16 + ((((i11 & (~i10)) | i12) + ((i10 & i13) | i14)) - i15)) ^ (i17 % 454333378));
    }

    public final Optional zza() {
        zzatq zzatqVar;
        try {
            ArrayDeque arrayDeque = this.zzc.zza;
            if (arrayDeque.isEmpty()) {
                throw new zzaut();
            }
            zzaur zzaurVar = (zzaur) arrayDeque.pop();
            long j10 = zzaurVar.zza;
            long j11 = zzaurVar.zzb;
            long j12 = zzaurVar.zzc;
            zzaux zzauxVar = this.zzb;
            if (zzauxVar.zzb < j11) {
                return Optional.of(zzatq.zzG);
            }
            this.zzd.zza(j10);
            if (j12 == 0) {
                while (zzauxVar.zzb > j11) {
                    zzauxVar.zzc();
                }
            }
            return Optional.empty();
        } catch (zzaun e10) {
            e = e10;
            throw new AssertionError(zzaui.zza("CEiv6BFfPnitUE+D"), e);
        } catch (zzauo e11) {
            e = e11;
            throw new AssertionError(zzaui.zza("CEiv6BFfPnitUE+D"), e);
        } catch (zzaut unused) {
            zzatqVar = zzatq.zzw;
            return Optional.of(zzatqVar);
        } catch (zzauv unused2) {
            zzatqVar = zzatq.zzG;
            return Optional.of(zzatqVar);
        }
    }
}
