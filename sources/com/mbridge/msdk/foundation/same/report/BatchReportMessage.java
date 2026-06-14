package com.mbridge.msdk.foundation.same.report;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public class BatchReportMessage implements Parcelable {
    public static final Parcelable.Creator<BatchReportMessage> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f48777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f48778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f48779c;

    class a implements Parcelable.Creator<BatchReportMessage> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BatchReportMessage createFromParcel(Parcel parcel) {
            return new BatchReportMessage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BatchReportMessage[] newArray(int i10) {
            return new BatchReportMessage[i10];
        }
    }

    public BatchReportMessage(String str, String str2, long j10) {
        this.f48779c = str;
        this.f48777a = str2;
        this.f48778b = j10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getReportMessage() {
        return this.f48777a;
    }

    public long getTimestamp() {
        return this.f48778b;
    }

    public String getUuid() {
        return this.f48779c;
    }

    public void setReportMessage(String str) {
        this.f48777a = str;
    }

    public void setTimestamp(long j10) {
        this.f48778b = j10;
    }

    public void setUuid(String str) {
        this.f48779c = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f48779c);
        parcel.writeString(this.f48777a);
        parcel.writeLong(this.f48778b);
    }

    protected BatchReportMessage(Parcel parcel) {
        this.f48779c = parcel.readString();
        this.f48777a = parcel.readString();
        this.f48778b = parcel.readLong();
    }
}
