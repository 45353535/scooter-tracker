package com.appodeal.ads;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appodeal.ads.modules.common.internal.data.ConnectionData;

/* JADX INFO: loaded from: classes6.dex */
public interface RestrictedData {
    boolean canSendLocation();

    boolean canSendLocationType();

    boolean canSendUserSettings();

    @Nullable
    String getCity();

    @Nullable
    ConnectionData getConnectionData(@NonNull Context context);

    @Nullable
    String getCountry();

    @Nullable
    String getHttpAgent(@NonNull Context context);

    @Nullable
    @Deprecated
    String getIabConsentString();

    @NonNull
    String getIfa();

    @Nullable
    String getIp();

    @NonNull
    LocationData getLocation(@NonNull Context context);

    @Nullable
    @Deprecated
    String getUSPrivacyString();

    @Nullable
    String getUserId();

    @Nullable
    String getZip();

    boolean isLimitAdTrackingEnabled();

    boolean isParameterBlocked(String str);

    boolean isUserAgeRestricted();

    boolean isUserHasConsent();

    boolean isUserInCcpaScope();

    boolean isUserInGdprScope();

    boolean isUserProtected();
}
