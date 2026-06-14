package com.mbridge.msdk.config.component.load.downloader;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public class DownloadProgress implements Parcelable {
    public static final Parcelable.Creator<DownloadProgress> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f46927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f46928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f46929c;

    class a implements Parcelable.Creator<DownloadProgress> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DownloadProgress createFromParcel(Parcel parcel) {
            return new DownloadProgress(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DownloadProgress[] newArray(int i10) {
            return new DownloadProgress[i10];
        }
    }

    public DownloadProgress(long j10, long j11, int i10) {
        this.f46927a = j10;
        this.f46929c = j11;
        this.f46928b = i10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getCurrent() {
        return this.f46927a;
    }

    public int getCurrentDownloadRate() {
        return this.f46928b;
    }

    public long getTotal() {
        return this.f46929c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f46927a);
        parcel.writeLong(this.f46929c);
        parcel.writeInt(this.f46928b);
    }

    protected DownloadProgress(Parcel parcel) {
        this.f46927a = parcel.readLong();
        this.f46929c = parcel.readLong();
        this.f46928b = parcel.readInt();
    }
}
