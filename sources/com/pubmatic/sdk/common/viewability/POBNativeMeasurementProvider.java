package com.pubmatic.sdk.common.viewability;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.viewability.POBMeasurementProvider;
import com.pubmatic.sdk.common.viewability.POBObstructionUpdateListener;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public interface POBNativeMeasurementProvider extends POBMeasurementProvider {

    public enum POBNativeAdEventType {
        LOADED,
        IMPRESSION
    }

    public interface POBOmidSessionListener {
        void onOmidSessionInitializationFailed();

        void onOmidSessionInitialized();
    }

    @Override // com.pubmatic.sdk.common.viewability.POBMeasurementProvider, com.pubmatic.sdk.common.viewability.POBObstructionUpdateListener
    /* synthetic */ void addFriendlyObstructions(@NonNull View view, @NonNull POBObstructionUpdateListener.POBFriendlyObstructionPurpose pOBFriendlyObstructionPurpose);

    @Override // com.pubmatic.sdk.common.viewability.POBMeasurementProvider
    /* synthetic */ void finishAdSession();

    @Override // com.pubmatic.sdk.common.viewability.POBMeasurementProvider
    @NonNull
    /* synthetic */ String omSDKVersion();

    @Override // com.pubmatic.sdk.common.viewability.POBMeasurementProvider
    /* synthetic */ void omidJsServiceScript(@NonNull Context context, @NonNull POBMeasurementProvider.POBScriptListener pOBScriptListener);

    @Override // com.pubmatic.sdk.common.viewability.POBMeasurementProvider, com.pubmatic.sdk.common.viewability.POBObstructionUpdateListener
    /* synthetic */ void removeFriendlyObstructions(@Nullable View view);

    @Override // com.pubmatic.sdk.common.viewability.POBMeasurementProvider
    /* synthetic */ void setTrackView(@NonNull View view);

    void signalAdEvent(@NonNull POBNativeAdEventType pOBNativeAdEventType);

    void startAdSession(@NonNull View view, @Nullable List<? extends POBVerificationScriptResource> list, @NonNull POBOmidSessionListener pOBOmidSessionListener);
}
