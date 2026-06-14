package com.bytedance.sdk.openadsdk;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public interface ICommonDialogListener extends IInterface {

    public static class Default implements ICommonDialogListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.bytedance.sdk.openadsdk.ICommonDialogListener
        public void onDialogBtnNo() throws RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.ICommonDialogListener
        public void onDialogBtnYes() throws RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.ICommonDialogListener
        public void onDialogCancel() throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements ICommonDialogListener {

        private static class qdl implements ICommonDialogListener {
            public static ICommonDialogListener qdl;

            /* JADX INFO: renamed from: ud, reason: collision with root package name */
            private IBinder f16757ud;

            qdl(IBinder iBinder) {
                this.f16757ud = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f16757ud;
            }

            @Override // com.bytedance.sdk.openadsdk.ICommonDialogListener
            public void onDialogBtnNo() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.ICommonDialogListener");
                    if (this.f16757ud.transact(2, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onDialogBtnNo();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.ICommonDialogListener
            public void onDialogBtnYes() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.ICommonDialogListener");
                    if (this.f16757ud.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onDialogBtnYes();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.ICommonDialogListener
            public void onDialogCancel() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.ICommonDialogListener");
                    if (this.f16757ud.transact(3, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onDialogCancel();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "com.bytedance.sdk.openadsdk.ICommonDialogListener");
        }

        public static ICommonDialogListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.bytedance.sdk.openadsdk.ICommonDialogListener");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ICommonDialogListener)) ? new qdl(iBinder) : (ICommonDialogListener) iInterfaceQueryLocalInterface;
        }

        public static ICommonDialogListener getDefaultImpl() {
            return qdl.qdl;
        }

        public static boolean setDefaultImpl(ICommonDialogListener iCommonDialogListener) {
            if (qdl.qdl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iCommonDialogListener == null) {
                return false;
            }
            qdl.qdl = iCommonDialogListener;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 == 1) {
                parcel.enforceInterface("com.bytedance.sdk.openadsdk.ICommonDialogListener");
                onDialogBtnYes();
                parcel2.writeNoException();
                return true;
            }
            if (i10 == 2) {
                parcel.enforceInterface("com.bytedance.sdk.openadsdk.ICommonDialogListener");
                onDialogBtnNo();
                parcel2.writeNoException();
                return true;
            }
            if (i10 != 3) {
                if (i10 != 1598968902) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                parcel2.writeString("com.bytedance.sdk.openadsdk.ICommonDialogListener");
                return true;
            }
            parcel.enforceInterface("com.bytedance.sdk.openadsdk.ICommonDialogListener");
            onDialogCancel();
            parcel2.writeNoException();
            return true;
        }
    }

    void onDialogBtnNo() throws RemoteException;

    void onDialogBtnYes() throws RemoteException;

    void onDialogCancel() throws RemoteException;
}
