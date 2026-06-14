package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;

/* JADX INFO: loaded from: classes12.dex */
public final class Ff implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Bundle bundle = parcel.readBundle(I6.class.getClassLoader());
        return new Gf((ContentValues) bundle.getParcelable("CFG_KEY_PROCESS_ENVIRONMENT"), (ResultReceiver) bundle.getParcelable("CFG_KEY_PROCESS_ENVIRONMENT_RECEIVER"));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new Gf[i10];
    }
}
