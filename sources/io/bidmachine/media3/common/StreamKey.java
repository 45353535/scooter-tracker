package io.bidmachine.media3.common;

import android.os.Parcel;
import android.os.Parcelable;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public final class StreamKey implements Comparable<StreamKey>, Parcelable {
    public static final Parcelable.Creator<StreamKey> CREATOR = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f80516e = o0.C0(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f80517f = o0.C0(1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f80518g = o0.C0(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f80519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f80520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f80521d;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public StreamKey createFromParcel(Parcel parcel) {
            return new StreamKey(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public StreamKey[] newArray(int i10) {
            return new StreamKey[i10];
        }
    }

    public StreamKey(int i10, int i11, int i12) {
        this.f80519b = i10;
        this.f80520c = i11;
        this.f80521d = i12;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(StreamKey streamKey) {
        int i10 = this.f80519b - streamKey.f80519b;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.f80520c - streamKey.f80520c;
        return i11 == 0 ? this.f80521d - streamKey.f80521d : i11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && StreamKey.class == obj.getClass()) {
            StreamKey streamKey = (StreamKey) obj;
            if (this.f80519b == streamKey.f80519b && this.f80520c == streamKey.f80520c && this.f80521d == streamKey.f80521d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.f80519b * 31) + this.f80520c) * 31) + this.f80521d;
    }

    public String toString() {
        return this.f80519b + "." + this.f80520c + "." + this.f80521d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f80519b);
        parcel.writeInt(this.f80520c);
        parcel.writeInt(this.f80521d);
    }

    StreamKey(Parcel parcel) {
        this.f80519b = parcel.readInt();
        this.f80520c = parcel.readInt();
        this.f80521d = parcel.readInt();
    }
}
