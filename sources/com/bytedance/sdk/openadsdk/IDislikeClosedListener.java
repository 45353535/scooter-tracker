package com.bytedance.sdk.openadsdk;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public interface IDislikeClosedListener extends IInterface {

    public static class Default implements IDislikeClosedListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.bytedance.sdk.openadsdk.IDislikeClosedListener
        public void onItemClickClosed() throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IDislikeClosedListener {

        private static class qdl implements IDislikeClosedListener {
            public static IDislikeClosedListener qdl;

            /* JADX INFO: renamed from: ud, reason: collision with root package name */
            private IBinder f16759ud;

            qdl(IBinder iBinder) {
                this.f16759ud = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f16759ud;
            }

            @Override // com.bytedance.sdk.openadsdk.IDislikeClosedListener
            public void onItemClickClosed() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IDislikeClosedListener");
                    if (this.f16759ud.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onItemClickClosed();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "com.bytedance.sdk.openadsdk.IDislikeClosedListener");
        }

        public static IDislikeClosedListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.bytedance.sdk.openadsdk.IDislikeClosedListener");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IDislikeClosedListener)) ? new qdl(iBinder) : (IDislikeClosedListener) iInterfaceQueryLocalInterface;
        }

        public static IDislikeClosedListener getDefaultImpl() {
            return qdl.qdl;
        }

        public static boolean setDefaultImpl(IDislikeClosedListener iDislikeClosedListener) {
            if (qdl.qdl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iDislikeClosedListener == null) {
                return false;
            }
            qdl.qdl = iDislikeClosedListener;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 != 1) {
                if (i10 != 1598968902) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                parcel2.writeString("com.bytedance.sdk.openadsdk.IDislikeClosedListener");
                return true;
            }
            parcel.enforceInterface("com.bytedance.sdk.openadsdk.IDislikeClosedListener");
            onItemClickClosed();
            parcel2.writeNoException();
            return true;
        }
    }

    void onItemClickClosed() throws RemoteException;
}
