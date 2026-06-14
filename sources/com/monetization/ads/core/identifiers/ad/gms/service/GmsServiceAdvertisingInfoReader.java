package com.monetization.ads.core.identifiers.ad.gms.service;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yads.ae;
import yads.lb1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/monetization/ads/core/identifiers/ad/gms/service/GmsServiceAdvertisingInfoReader;", "Lyads/ae;", "Landroid/os/IInterface;", "Landroid/os/IBinder;", "asBinder", "()Landroid/os/IBinder;", "", "readAdvertisingId", "()Ljava/lang/String;", "", "readAdTrackingLimited", "()Ljava/lang/Boolean;", "binder", "<init>", "(Landroid/os/IBinder;)V", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0})
public final class GmsServiceAdvertisingInfoReader implements ae, IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IBinder f58976a;

    public GmsServiceAdvertisingInfoReader(@NotNull IBinder iBinder) {
        this.f58976a = iBinder;
    }

    @Override // android.os.IInterface
    @NotNull
    public IBinder asBinder() {
        return this.f58976a;
    }

    @Override // yads.ae
    @Nullable
    public Boolean readAdTrackingLimited() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z10 = true;
                parcelObtain.writeInt(1);
                this.f58976a.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                if (parcelObtain2.readInt() == 0) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            } catch (Throwable unused) {
                boolean z11 = lb1.f113032a;
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return null;
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // yads.ae
    @Nullable
    public String readAdvertisingId() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f58976a.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        } catch (Throwable unused) {
            boolean z10 = lb1.f113032a;
            parcelObtain2.recycle();
            parcelObtain.recycle();
            return null;
        }
    }
}
