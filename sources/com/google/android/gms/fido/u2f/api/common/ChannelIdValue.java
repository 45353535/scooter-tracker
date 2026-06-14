package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@SafeParcelable.Class(creator = "ChannelIdValueCreator")
@SafeParcelable.Reserved({1})
@Deprecated
public class ChannelIdValue extends AbstractSafeParcelable {

    @SafeParcelable.Field(getter = "getTypeAsInt", id = 2, type = "int")
    private final ChannelIdValueType zza;

    @SafeParcelable.Field(getter = "getStringValue", id = 3)
    private final String zzb;

    @SafeParcelable.Field(getter = "getObjectValueAsString", id = 4)
    private final String zzc;

    @NonNull
    public static final Parcelable.Creator<ChannelIdValue> CREATOR = new zzb();

    @NonNull
    public static final ChannelIdValue ABSENT = new ChannelIdValue();

    @NonNull
    public static final ChannelIdValue UNAVAILABLE = new ChannelIdValue("unavailable");

    @NonNull
    public static final ChannelIdValue UNUSED = new ChannelIdValue("unused");

    public enum ChannelIdValueType implements Parcelable {
        ABSENT(0),
        STRING(1),
        OBJECT(2);


        @NonNull
        public static final Parcelable.Creator<ChannelIdValueType> CREATOR = new zza();
        private final int zzb;

        ChannelIdValueType(int i10) {
            this.zzb = i10;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            parcel.writeInt(this.zzb);
        }
    }

    public static class UnsupportedChannelIdValueTypeException extends Exception {
        public UnsupportedChannelIdValueTypeException(int i10) {
            super(String.format("ChannelIdValueType %s not supported", Integer.valueOf(i10)));
        }
    }

    private ChannelIdValue() {
        this.zza = ChannelIdValueType.ABSENT;
        this.zzc = null;
        this.zzb = null;
    }

    @NonNull
    public static ChannelIdValueType toChannelIdValueType(int i10) throws UnsupportedChannelIdValueTypeException {
        for (ChannelIdValueType channelIdValueType : ChannelIdValueType.values()) {
            if (i10 == channelIdValueType.zzb) {
                return channelIdValueType;
            }
        }
        throw new UnsupportedChannelIdValueTypeException(i10);
    }

    public boolean equals(@NonNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelIdValue)) {
            return false;
        }
        ChannelIdValue channelIdValue = (ChannelIdValue) obj;
        if (!this.zza.equals(channelIdValue.zza)) {
            return false;
        }
        int iOrdinal = this.zza.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal == 1) {
            return this.zzb.equals(channelIdValue.zzb);
        }
        if (iOrdinal != 2) {
            return false;
        }
        return this.zzc.equals(channelIdValue.zzc);
    }

    @NonNull
    public JSONObject getObjectValue() {
        if (this.zzc == null) {
            return null;
        }
        try {
            return new JSONObject(this.zzc);
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    @NonNull
    public String getObjectValueAsString() {
        return this.zzc;
    }

    @NonNull
    public String getStringValue() {
        return this.zzb;
    }

    @NonNull
    public ChannelIdValueType getType() {
        return this.zza;
    }

    public int getTypeAsInt() {
        return this.zza.zzb;
    }

    public int hashCode() {
        int i10;
        int iHashCode;
        int iHashCode2 = this.zza.hashCode() + 31;
        int iOrdinal = this.zza.ordinal();
        if (iOrdinal == 1) {
            i10 = iHashCode2 * 31;
            iHashCode = this.zzb.hashCode();
        } else {
            if (iOrdinal != 2) {
                return iHashCode2;
            }
            i10 = iHashCode2 * 31;
            iHashCode = this.zzc.hashCode();
        }
        return i10 + iHashCode;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, getTypeAsInt());
        SafeParcelWriter.writeString(parcel, 3, getStringValue(), false);
        SafeParcelWriter.writeString(parcel, 4, getObjectValueAsString(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    ChannelIdValue(@SafeParcelable.Param(id = 2) int i10, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) String str2) {
        try {
            this.zza = toChannelIdValueType(i10);
            this.zzb = str;
            this.zzc = str2;
        } catch (UnsupportedChannelIdValueTypeException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    private ChannelIdValue(String str) {
        this.zzb = (String) Preconditions.checkNotNull(str);
        this.zza = ChannelIdValueType.STRING;
        this.zzc = null;
    }

    public ChannelIdValue(@NonNull JSONObject jSONObject) {
        this.zzc = (String) Preconditions.checkNotNull(jSONObject.toString());
        this.zza = ChannelIdValueType.OBJECT;
        this.zzb = null;
    }
}
