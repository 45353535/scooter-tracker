package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.ironsource.C4240b4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
@SafeParcelable.Class(creator = "PatternItemCreator")
@SafeParcelable.Reserved({1})
public class PatternItem extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PatternItem> CREATOR = new zzq();
    private static final String zza = "PatternItem";

    @SafeParcelable.Field(getter = "getType", id = 2)
    private final int zzb;

    @Nullable
    @SafeParcelable.Field(getter = "getLength", id = 3)
    private final Float zzc;

    @SafeParcelable.Constructor
    public PatternItem(@SafeParcelable.Param(id = 2) int i10, @Nullable @SafeParcelable.Param(id = 3) Float f10) {
        boolean z10 = true;
        if (i10 != 1 && (f10 == null || f10.floatValue() < 0.0f)) {
            z10 = false;
        }
        Preconditions.checkArgument(z10, "Invalid PatternItem: type=" + i10 + " length=" + f10);
        this.zzb = i10;
        this.zzc = f10;
    }

    @Nullable
    static List zza(@Nullable List list) {
        PatternItem dash;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PatternItem dot = (PatternItem) it.next();
            if (dot == null) {
                dot = null;
            } else {
                int i10 = dot.zzb;
                if (i10 == 0) {
                    Float f10 = dot.zzc;
                    Preconditions.checkState(f10 != null, "length must not be null.");
                    dash = new Dash(f10.floatValue());
                } else if (i10 == 1) {
                    dot = new Dot();
                } else if (i10 != 2) {
                    Log.w(zza, "Unknown PatternItem type: " + i10);
                } else {
                    Float f11 = dot.zzc;
                    Preconditions.checkState(f11 != null, "length must not be null.");
                    dash = new Gap(f11.floatValue());
                }
                dot = dash;
            }
            arrayList.add(dot);
        }
        return arrayList;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PatternItem)) {
            return false;
        }
        PatternItem patternItem = (PatternItem) obj;
        return this.zzb == patternItem.zzb && Objects.equal(this.zzc, patternItem.zzc);
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzb), this.zzc);
    }

    @NonNull
    public String toString() {
        return "[PatternItem: type=" + this.zzb + " length=" + this.zzc + C4240b4.j.f42674e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int i11 = this.zzb;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, i11);
        SafeParcelWriter.writeFloatObject(parcel, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
