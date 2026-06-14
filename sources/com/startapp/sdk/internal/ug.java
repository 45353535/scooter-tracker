package com.startapp.sdk.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class ug extends u6 {
    public static final Parcelable.Creator<ug> CREATOR = new tg();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f65350f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f65351g;

    public ug() {
        this.f65350f = 0.9f;
        this.f65351g = 0.6f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.startapp.sdk.internal.u6, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeFloat(this.f65350f);
        parcel.writeFloat(this.f65351g);
    }

    public ug(Parcel parcel) {
        super(parcel);
        this.f65350f = parcel.readFloat();
        this.f65351g = parcel.readFloat();
    }
}
