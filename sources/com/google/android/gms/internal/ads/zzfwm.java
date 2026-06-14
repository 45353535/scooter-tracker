package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes8.dex */
@SafeParcelable.Class(creator = "GassResponseParcelCreator")
public final class zzfwm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfwm> CREATOR = new zzfwn();

    @SafeParcelable.VersionField(id = 1)
    public final int zza;

    @SafeParcelable.Field(getter = "getAfmaSignalsAsBytes", id = 2, type = "byte[]")
    private zzaxg zzb = null;
    private byte[] zzc;

    @SafeParcelable.Constructor
    zzfwm(@SafeParcelable.Param(id = 1) int i10, @SafeParcelable.Param(id = 2) byte[] bArr) {
        this.zza = i10;
        this.zzc = bArr;
        zzb();
    }

    private final void zzb() {
        zzaxg zzaxgVar = this.zzb;
        if (zzaxgVar != null || this.zzc == null) {
            if (zzaxgVar == null || this.zzc != null) {
                if (zzaxgVar != null && this.zzc != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (zzaxgVar != null || this.zzc != null) {
                    throw new IllegalStateException("Impossible");
                }
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i11);
        byte[] bArrZzaN = this.zzc;
        if (bArrZzaN == null) {
            bArrZzaN = this.zzb.zzaN();
        }
        SafeParcelWriter.writeByteArray(parcel, 2, bArrZzaN, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final zzaxg zza() {
        if (this.zzb == null) {
            try {
                this.zzb = zzaxg.zzi(this.zzc, zzibb.zza());
                this.zzc = null;
            } catch (zzicg | NullPointerException e10) {
                throw new IllegalStateException(e10);
            }
        }
        zzb();
        return this.zzb;
    }
}
