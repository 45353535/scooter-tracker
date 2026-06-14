package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
@SafeParcelable.Class(creator = "PrfExtensionCreator")
public final class zzai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzai> CREATOR = new zzaj();

    @NonNull
    @SafeParcelable.Field(getter = "getEvaluationPoints", id = 1)
    private final byte[][] zza;

    @SafeParcelable.Constructor
    public zzai(@NonNull @SafeParcelable.Param(id = 1) byte[][] bArr) {
        Preconditions.checkArgument(bArr != null);
        Preconditions.checkArgument(1 == ((bArr.length & 1) ^ 1));
        int i10 = 0;
        while (i10 < bArr.length) {
            Preconditions.checkArgument(i10 == 0 || bArr[i10] != null);
            int i11 = i10 + 1;
            Preconditions.checkArgument(bArr[i11] != null);
            int length = bArr[i11].length;
            Preconditions.checkArgument(length == 32 || length == 64);
            i10 += 2;
        }
        this.zza = bArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof zzai) {
            return Arrays.deepEquals(this.zza, ((zzai) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (byte[] bArr : this.zza) {
            iHashCode ^= Objects.hashCode(bArr);
        }
        return iHashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArrayArray(parcel, 1, this.zza, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
