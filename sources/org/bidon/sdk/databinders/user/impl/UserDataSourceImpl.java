package org.bidon.sdk.databinders.user.impl;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.bidon.sdk.databinders.user.AdvertisingData;
import org.bidon.sdk.databinders.user.AdvertisingProfile;
import org.bidon.sdk.databinders.user.TrackingAuthorizationStatus;
import org.bidon.sdk.databinders.user.UserDataSource;
import org.bidon.sdk.utils.keyvaluestorage.KeyValueStorage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0096@¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000bH\u0096@¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lorg/bidon/sdk/databinders/user/impl/UserDataSourceImpl;", "Lorg/bidon/sdk/databinders/user/UserDataSource;", "keyValueStorage", "Lorg/bidon/sdk/utils/keyvaluestorage/KeyValueStorage;", "advertisingData", "Lorg/bidon/sdk/databinders/user/AdvertisingData;", "appSetIdReceiver", "Lorg/bidon/sdk/databinders/user/impl/AppSetIdReceiver;", "<init>", "(Lorg/bidon/sdk/utils/keyvaluestorage/KeyValueStorage;Lorg/bidon/sdk/databinders/user/AdvertisingData;Lorg/bidon/sdk/databinders/user/impl/AppSetIdReceiver;)V", "getTrackingAuthorizationStatus", "", "getApplicationId", "getAdvertisingId", "getAppSetId", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAppSetIdScope", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UserDataSourceImpl implements UserDataSource {

    @NotNull
    private final AdvertisingData advertisingData;

    @NotNull
    private final AppSetIdReceiver appSetIdReceiver;

    @NotNull
    private final KeyValueStorage keyValueStorage;

    public UserDataSourceImpl(@NotNull KeyValueStorage keyValueStorage, @NotNull AdvertisingData advertisingData, @NotNull AppSetIdReceiver appSetIdReceiver) {
        Intrinsics.checkNotNullParameter(keyValueStorage, "keyValueStorage");
        Intrinsics.checkNotNullParameter(advertisingData, "advertisingData");
        Intrinsics.checkNotNullParameter(appSetIdReceiver, "appSetIdReceiver");
        this.keyValueStorage = keyValueStorage;
        this.advertisingData = advertisingData;
        this.appSetIdReceiver = appSetIdReceiver;
    }

    @Override // org.bidon.sdk.databinders.user.UserDataSource
    @NotNull
    public String getAdvertisingId() {
        AdvertisingProfile advertisingProfile = this.advertisingData.getAdvertisingProfile();
        if (advertisingProfile instanceof AdvertisingProfile.Amazon) {
            return ((AdvertisingProfile.Amazon) advertisingProfile).getAdvertisingId();
        }
        if (advertisingProfile instanceof AdvertisingProfile.Google) {
            return ((AdvertisingProfile.Google) advertisingProfile).getAdvertisingId();
        }
        if (advertisingProfile instanceof AdvertisingProfile.Huawei) {
            return ((AdvertisingProfile.Huawei) advertisingProfile).getAdvertisingId();
        }
        if (Intrinsics.areEqual(advertisingProfile, AdvertisingProfile.Denied.INSTANCE)) {
            return "00000000-0000-0000-0000-000000000000";
        }
        throw new m();
    }

    @Override // org.bidon.sdk.databinders.user.UserDataSource
    @Nullable
    public Object getAppSetId(@NotNull Continuation continuation) {
        return this.appSetIdReceiver.getAppSetId(continuation);
    }

    @Override // org.bidon.sdk.databinders.user.UserDataSource
    @Nullable
    public Object getAppSetIdScope(@NotNull Continuation continuation) {
        return this.appSetIdReceiver.getAppSetIdScope(continuation);
    }

    @Override // org.bidon.sdk.databinders.user.UserDataSource
    @NotNull
    public String getApplicationId() {
        return this.keyValueStorage.getApplicationId();
    }

    @Override // org.bidon.sdk.databinders.user.UserDataSource
    @NotNull
    public String getTrackingAuthorizationStatus() {
        boolean zIsLimitAdTrackingEnabled;
        AdvertisingProfile advertisingProfile = this.advertisingData.getAdvertisingProfile();
        if (advertisingProfile instanceof AdvertisingProfile.Amazon) {
            zIsLimitAdTrackingEnabled = ((AdvertisingProfile.Amazon) advertisingProfile).isLimitAdTrackingEnabled();
        } else if (advertisingProfile instanceof AdvertisingProfile.Google) {
            zIsLimitAdTrackingEnabled = ((AdvertisingProfile.Google) advertisingProfile).isLimitAdTrackingEnabled();
        } else {
            if (!(advertisingProfile instanceof AdvertisingProfile.Huawei)) {
                if (Intrinsics.areEqual(advertisingProfile, AdvertisingProfile.Denied.INSTANCE)) {
                    return TrackingAuthorizationStatus.Denied.getCode();
                }
                throw new m();
            }
            zIsLimitAdTrackingEnabled = ((AdvertisingProfile.Huawei) advertisingProfile).isLimitAdTrackingEnabled();
        }
        return zIsLimitAdTrackingEnabled ? TrackingAuthorizationStatus.Restricted.getCode() : TrackingAuthorizationStatus.Authorized.getCode();
    }
}
