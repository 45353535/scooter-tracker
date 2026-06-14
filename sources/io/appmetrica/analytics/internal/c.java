package io.appmetrica.analytics.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements IAppMetricaService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f78678a;

    public c(IBinder iBinder) {
        this.f78678a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f78678a;
    }

    @Override // io.appmetrica.analytics.internal.IAppMetricaService
    public final void pauseUserSession(Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IAppMetricaService.DESCRIPTOR);
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f78678a.transact(2, parcelObtain, null, 1);
            parcelObtain.recycle();
        } catch (Throwable th2) {
            parcelObtain.recycle();
            throw th2;
        }
    }

    @Override // io.appmetrica.analytics.internal.IAppMetricaService
    public final void reportData(int i10, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IAppMetricaService.DESCRIPTOR);
            parcelObtain.writeInt(i10);
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f78678a.transact(3, parcelObtain, null, 1);
            parcelObtain.recycle();
        } catch (Throwable th2) {
            parcelObtain.recycle();
            throw th2;
        }
    }

    @Override // io.appmetrica.analytics.internal.IAppMetricaService
    public final void resumeUserSession(Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IAppMetricaService.DESCRIPTOR);
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f78678a.transact(1, parcelObtain, null, 1);
            parcelObtain.recycle();
        } catch (Throwable th2) {
            parcelObtain.recycle();
            throw th2;
        }
    }
}
