package com.monetization.ads.core.identifiers.ad.huawei;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.taurusx.tax.g.q0.c.w;
import com.unity3d.services.core.di.ServiceProvider;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0001\nR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00038fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078fX¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/monetization/ads/core/identifiers/ad/huawei/OpenDeviceIdentifierService;", "Landroid/os/IInterface;", CommonUrlParts.HUAWEI_OAID, "", "getOaid", "()Ljava/lang/String;", "oaidTrackLimited", "", "getOaidTrackLimited", "()Z", "Stub", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface OpenDeviceIdentifierService extends IInterface {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/monetization/ads/core/identifiers/ad/huawei/OpenDeviceIdentifierService$Stub;", "Landroid/os/Binder;", "Lcom/monetization/ads/core/identifiers/ad/huawei/OpenDeviceIdentifierService;", "Proxy", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0})
    public static abstract class Stub extends Binder implements OpenDeviceIdentifierService {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int f58977b = 0;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/monetization/ads/core/identifiers/ad/huawei/OpenDeviceIdentifierService$Stub$Proxy;", "Lcom/monetization/ads/core/identifiers/ad/huawei/OpenDeviceIdentifierService;", "Landroid/os/IBinder;", "asBinder", "()Landroid/os/IBinder;", "", "getOaid", "()Ljava/lang/String;", CommonUrlParts.HUAWEI_OAID, "", "getOaidTrackLimited", "()Z", "oaidTrackLimited", ServiceProvider.NAMED_REMOTE, "<init>", "(Landroid/os/IBinder;)V", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0})
        public static final class Proxy implements OpenDeviceIdentifierService {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final IBinder f58978a;

            public Proxy(@NotNull IBinder iBinder) {
                this.f58978a = iBinder;
            }

            @Override // android.os.IInterface
            @NotNull
            public IBinder asBinder() {
                return this.f58978a;
            }

            @Override // com.monetization.ads.core.identifiers.ad.huawei.OpenDeviceIdentifierService
            @Nullable
            public String getOaid() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(w.AbstractBinderC0801w.f66300z);
                    this.f58978a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.monetization.ads.core.identifiers.ad.huawei.OpenDeviceIdentifierService
            public boolean getOaidTrackLimited() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(w.AbstractBinderC0801w.f66300z);
                    this.f58978a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }

    @Nullable
    String getOaid() throws RemoteException;

    boolean getOaidTrackLimited() throws RemoteException;
}
