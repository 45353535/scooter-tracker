package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends a implements i {
    g(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.i
    public final void c(Bundle bundle, r rVar) throws RemoteException {
        Parcel parcelC = c();
        c.c(parcelC, bundle);
        parcelC.writeStrongBinder(rVar);
        d(6, parcelC);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.i
    public final void d(Bundle bundle, k kVar) throws RemoteException {
        Parcel parcelC = c();
        c.c(parcelC, bundle);
        parcelC.writeStrongBinder(kVar);
        d(3, parcelC);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.i
    public final void e(Bundle bundle, k kVar) throws RemoteException {
        Parcel parcelC = c();
        c.c(parcelC, bundle);
        parcelC.writeStrongBinder(kVar);
        d(2, parcelC);
    }
}
