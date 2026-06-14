package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes9.dex */
public class a implements IInterface {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final IBinder f28755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f28756c;

    protected a(IBinder iBinder, String str) {
        this.f28755b = iBinder;
        this.f28756c = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f28755b;
    }

    protected final Parcel c() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f28756c);
        return parcelObtain;
    }

    protected final void d(int i10, Parcel parcel) {
        try {
            this.f28755b.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
