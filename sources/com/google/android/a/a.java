package com.google.android.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes7.dex */
public class a implements IInterface {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final IBinder f24107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f24108c = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService";

    protected a(IBinder iBinder) {
        this.f24107b = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f24107b;
    }

    protected final Parcel c() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f24108c);
        return parcelObtain;
    }

    protected final Parcel d(Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f24107b.transact(1, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e10) {
                parcelObtain.recycle();
                throw e10;
            }
        } finally {
            parcel.recycle();
        }
    }
}
