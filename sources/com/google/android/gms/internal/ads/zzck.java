package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzck {
    private final zzguf zza;
    private final List zzb = new ArrayList();
    private ByteBuffer[] zzc = new ByteBuffer[0];
    private boolean zzd;

    public zzck(zzguf zzgufVar) {
        this.zza = zzgufVar;
        zzcl zzclVar = zzcl.zza;
        this.zzd = false;
    }

    private final void zzi(ByteBuffer byteBuffer) {
        boolean z10;
        do {
            int i10 = 0;
            z10 = false;
            while (i10 <= zzj()) {
                if (!this.zzc[i10].hasRemaining()) {
                    List list = this.zzb;
                    zzco zzcoVar = (zzco) list.get(i10);
                    if (!zzcoVar.zzg()) {
                        ByteBuffer byteBuffer2 = i10 > 0 ? this.zzc[i10 - 1] : byteBuffer.hasRemaining() ? byteBuffer : zzco.zza;
                        long jRemaining = byteBuffer2.remaining();
                        zzcoVar.zzd(byteBuffer2);
                        this.zzc[i10] = zzcoVar.zzf();
                        boolean z11 = true;
                        if (jRemaining - ((long) byteBuffer2.remaining()) <= 0 && !this.zzc[i10].hasRemaining()) {
                            z11 = false;
                        }
                        z10 |= z11;
                    } else if (!this.zzc[i10].hasRemaining() && i10 < zzj()) {
                        ((zzco) list.get(i10 + 1)).zze();
                    }
                }
                i10++;
            }
        } while (z10);
    }

    private final int zzj() {
        return this.zzc.length - 1;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzck)) {
            return false;
        }
        zzguf zzgufVar = this.zza;
        int size = zzgufVar.size();
        zzguf zzgufVar2 = ((zzck) obj).zza;
        if (size != zzgufVar2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < zzgufVar.size(); i10++) {
            if (zzgufVar.get(i10) != zzgufVar2.get(i10)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final zzcl zza(zzcl zzclVar) throws zzcn {
        if (zzclVar.equals(zzcl.zza)) {
            throw new zzcn("Unhandled input format:", zzclVar);
        }
        int i10 = 0;
        while (true) {
            zzguf zzgufVar = this.zza;
            if (i10 >= zzgufVar.size()) {
                return zzclVar;
            }
            zzco zzcoVar = (zzco) zzgufVar.get(i10);
            zzcl zzclVarZzb = zzcoVar.zzb(zzclVar);
            if (zzcoVar.zzc()) {
                zzgrc.zzi(!zzclVarZzb.equals(r0));
                zzclVar = zzclVarZzb;
            }
            i10++;
        }
    }

    public final void zzb(zzcm zzcmVar) {
        List list = this.zzb;
        list.clear();
        this.zzd = false;
        long jZza = zzcmVar.zzb;
        int i10 = 0;
        while (true) {
            zzguf zzgufVar = this.zza;
            if (i10 >= zzgufVar.size()) {
                break;
            }
            zzco zzcoVar = (zzco) zzgufVar.get(i10);
            zzcoVar.zzi(new zzcm(jZza));
            if (zzcoVar.zzc()) {
                jZza = zzcoVar.zza(jZza);
                zzgrc.zzi(jZza >= 0);
                list.add(zzcoVar);
            }
            i10++;
        }
        this.zzc = new ByteBuffer[list.size()];
        for (int i11 = 0; i11 <= zzj(); i11++) {
            this.zzc[i11] = ((zzco) list.get(i11)).zzf();
        }
    }

    public final boolean zzc() {
        return !this.zzb.isEmpty();
    }

    public final void zzd(ByteBuffer byteBuffer) {
        if (!zzc() || this.zzd) {
            return;
        }
        zzi(byteBuffer);
    }

    public final ByteBuffer zze() {
        if (!zzc()) {
            return zzco.zza;
        }
        ByteBuffer byteBuffer = this.zzc[zzj()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        zzi(zzco.zza);
        return this.zzc[zzj()];
    }

    public final void zzf() {
        if (!zzc() || this.zzd) {
            return;
        }
        this.zzd = true;
        ((zzco) this.zzb.get(0)).zze();
    }

    public final boolean zzg() {
        return this.zzd && ((zzco) this.zzb.get(zzj())).zzg() && !this.zzc[zzj()].hasRemaining();
    }

    public final void zzh() {
        int i10 = 0;
        while (true) {
            zzguf zzgufVar = this.zza;
            if (i10 >= zzgufVar.size()) {
                this.zzc = new ByteBuffer[0];
                zzcl zzclVar = zzcl.zza;
                this.zzd = false;
                return;
            } else {
                zzco zzcoVar = (zzco) zzgufVar.get(i10);
                zzcoVar.zzi(zzcm.zza);
                zzcoVar.zzj();
                i10++;
            }
        }
    }
}
