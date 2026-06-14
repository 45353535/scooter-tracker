package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.common.MimeTypes;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
final class zzami implements zzagh {
    private final zzagh zza;
    private final zzamd zzb;

    @Nullable
    private zzamf zzg;
    private zzv zzh;
    private boolean zzi;
    private int zzd = 0;
    private int zze = 0;
    private byte[] zzf = zzfj.zzb;
    private final zzer zzc = new zzer();

    public zzami(zzagh zzaghVar, zzamd zzamdVar) {
        this.zza = zzaghVar;
        this.zzb = zzamdVar;
    }

    private final void zzi(int i10) {
        int length = this.zzf.length;
        int i11 = this.zze;
        if (length - i11 >= i10) {
            return;
        }
        int i12 = i11 - this.zzd;
        int iMax = Math.max(i12 + i12, i10 + i12);
        byte[] bArr = this.zzf;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.zzd, bArr2, 0, i12);
        this.zzd = 0;
        this.zze = i12;
        this.zzf = bArr2;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public /* synthetic */ void zzN(long j10) {
        m.a(this, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public /* synthetic */ int zza(zzj zzjVar, int i10, boolean z10) {
        return m.b(this, zzjVar, i10, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final int zzb(zzj zzjVar, int i10, boolean z10, int i11) throws IOException {
        if (this.zzg == null) {
            return this.zza.zzb(zzjVar, i10, z10, 0);
        }
        zzi(i10);
        int iZza = zzjVar.zza(this.zzf, this.zze, i10);
        if (iZza != -1) {
            this.zze += iZza;
            return iZza;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public /* synthetic */ void zzc(zzer zzerVar, int i10) {
        m.c(this, zzerVar, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzd(zzer zzerVar, int i10, int i11) {
        if (this.zzg == null) {
            this.zza.zzd(zzerVar, i10, i11);
            return;
        }
        zzi(i10);
        zzerVar.zzm(this.zzf, this.zze, i10);
        this.zze += i10;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zze(final long j10, final int i10, int i11, int i12, @Nullable zzagg zzaggVar) {
        if (this.zzg == null) {
            this.zza.zze(j10, i10, i11, i12, zzaggVar);
            return;
        }
        zzgrc.zzb(zzaggVar == null, "DRM on subtitles is not supported");
        int i13 = (this.zze - i12) - i11;
        try {
            this.zzg.zza(this.zzf, i13, i11, zzame.zza(), new zzdr() { // from class: com.google.android.gms.internal.ads.zzamh
                @Override // com.google.android.gms.internal.ads.zzdr
                public final /* synthetic */ void zza(Object obj) {
                    this.zza.zzh(j10, i10, (zzalx) obj);
                }
            });
        } catch (RuntimeException e10) {
            if (!this.zzi) {
                throw e10;
            }
            zzee.zzd("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e10);
        }
        int i14 = i13 + i11;
        this.zzd = i14;
        if (i14 == this.zze) {
            this.zzd = 0;
            this.zze = 0;
        }
    }

    public final void zzf(boolean z10) {
        this.zzi = true;
    }

    final /* synthetic */ void zzh(long j10, int i10, zzalx zzalxVar) {
        this.zzh.getClass();
        zzguf zzgufVar = zzalxVar.zza;
        long j11 = zzalxVar.zzc;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(zzgufVar.size());
        Iterator<E> it = zzgufVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((zzcx) it.next()).zzb());
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, arrayList);
        bundle.putLong("d", j11);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        zzer zzerVar = this.zzc;
        int length = bArrMarshall.length;
        zzerVar.zzb(bArrMarshall, length);
        zzagh zzaghVar = this.zza;
        zzaghVar.zzc(zzerVar, length);
        long j12 = zzalxVar.zzb;
        if (j12 == -9223372036854775807L) {
            zzgrc.zzi(this.zzh.zzt == Long.MAX_VALUE);
        } else {
            long j13 = this.zzh.zzt;
            j10 = j13 == Long.MAX_VALUE ? j10 + j12 : j12 + j13;
        }
        zzaghVar.zze(j10, i10 | 1, length, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzz(zzv zzvVar) {
        String str = zzvVar.zzo;
        str.getClass();
        zzgrc.zza(zzas.zzf(str) == 3);
        if (!zzvVar.equals(this.zzh)) {
            this.zzh = zzvVar;
            zzamd zzamdVar = this.zzb;
            this.zzg = zzamdVar.zza(zzvVar) ? zzamdVar.zzc(zzvVar) : null;
        }
        if (this.zzg == null) {
            this.zza.zzz(zzvVar);
            return;
        }
        zzagh zzaghVar = this.zza;
        zzt zztVarZza = zzvVar.zza();
        zztVarZza.zzm(MimeTypes.APPLICATION_MEDIA3_CUES);
        zztVarZza.zzj(str);
        zztVarZza.zzr(Long.MAX_VALUE);
        zztVarZza.zzK(this.zzb.zzb(zzvVar));
        zzaghVar.zzz(zztVarZza.zzM());
    }
}
