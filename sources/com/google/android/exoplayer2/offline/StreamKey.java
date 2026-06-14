package com.google.android.exoplayer2.offline;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class StreamKey implements Comparable<StreamKey>, Parcelable {
    public static final Parcelable.Creator<StreamKey> CREATOR = new Parcelable.Creator<StreamKey>() { // from class: com.google.android.exoplayer2.offline.StreamKey.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public StreamKey createFromParcel(Parcel parcel) {
            return new StreamKey(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public StreamKey[] newArray(int i10) {
            return new StreamKey[i10];
        }
    };
    public final int groupIndex;
    public final int periodIndex;
    public final int streamIndex;

    @Deprecated
    public final int trackIndex;

    public StreamKey(int i10, int i11) {
        this(0, i10, i11);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && StreamKey.class == obj.getClass()) {
            StreamKey streamKey = (StreamKey) obj;
            if (this.periodIndex == streamKey.periodIndex && this.groupIndex == streamKey.groupIndex && this.streamIndex == streamKey.streamIndex) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.periodIndex * 31) + this.groupIndex) * 31) + this.streamIndex;
    }

    public String toString() {
        return this.periodIndex + "." + this.groupIndex + "." + this.streamIndex;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.periodIndex);
        parcel.writeInt(this.groupIndex);
        parcel.writeInt(this.streamIndex);
    }

    public StreamKey(int i10, int i11, int i12) {
        this.periodIndex = i10;
        this.groupIndex = i11;
        this.streamIndex = i12;
        this.trackIndex = i12;
    }

    @Override // java.lang.Comparable
    public int compareTo(StreamKey streamKey) {
        int i10 = this.periodIndex - streamKey.periodIndex;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.groupIndex - streamKey.groupIndex;
        return i11 == 0 ? this.streamIndex - streamKey.streamIndex : i11;
    }

    StreamKey(Parcel parcel) {
        this.periodIndex = parcel.readInt();
        this.groupIndex = parcel.readInt();
        int i10 = parcel.readInt();
        this.streamIndex = i10;
        this.trackIndex = i10;
    }
}
