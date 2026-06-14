package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes9.dex */
public final class l extends a implements n {
    l(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.n
    public final void c(Bundle bundle, r rVar) throws RemoteException {
        Parcel parcelC = c();
        c.c(parcelC, bundle);
        parcelC.writeStrongBinder(rVar);
        d(3, parcelC);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.n
    public final void d(Bundle bundle, p pVar) throws RemoteException {
        Parcel parcelC = c();
        c.c(parcelC, bundle);
        parcelC.writeStrongBinder(pVar);
        d(2, parcelC);
    }
}
