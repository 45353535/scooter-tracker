package com.pubmatic.sdk.common.viewability;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBDataType$POBVideoAdEventType;
import com.pubmatic.sdk.common.viewability.POBMeasurementProvider;
import com.pubmatic.sdk.common.viewability.POBObstructionUpdateListener;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public interface POBVideoMeasurementProvider extends POBMeasurementProvider {

    public interface POBOmidSessionListener {
        void onOmidSessionInitialized();
    }

    public enum POBVideoAdErrorType {
        GENERIC,
        VIDEO
    }

    public enum POBVideoPlayerState {
        FULLSCREEN,
        MINIMIZED,
        COLLAPSED,
        NORMAL,
        EXPANDED
    }

    @Override // com.pubmatic.sdk.common.viewability.POBMeasurementProvider, com.pubmatic.sdk.common.viewability.POBObstructionUpdateListener
    /* synthetic */ void addFriendlyObstructions(@NonNull View view, @NonNull POBObstructionUpdateListener.POBFriendlyObstructionPurpose pOBFriendlyObstructionPurpose);

    @Override // com.pubmatic.sdk.common.viewability.POBMeasurementProvider
    /* synthetic */ void finishAdSession();

    void impressionOccurred();

    void loaded(boolean z10, float f10);

    @Override // com.pubmatic.sdk.common.viewability.POBMeasurementProvider
    @NonNull
    /* synthetic */ String omSDKVersion();

    @Override // com.pubmatic.sdk.common.viewability.POBMeasurementProvider
    /* synthetic */ void omidJsServiceScript(@NonNull Context context, @NonNull POBMeasurementProvider.POBScriptListener pOBScriptListener);

    @Override // com.pubmatic.sdk.common.viewability.POBMeasurementProvider, com.pubmatic.sdk.common.viewability.POBObstructionUpdateListener
    /* synthetic */ void removeFriendlyObstructions(@Nullable View view);

    @Override // com.pubmatic.sdk.common.viewability.POBMeasurementProvider
    /* synthetic */ void setTrackView(@NonNull View view);

    void signalAdEvent(@NonNull POBDataType$POBVideoAdEventType pOBDataType$POBVideoAdEventType);

    void signalError(@NonNull POBVideoAdErrorType pOBVideoAdErrorType, @NonNull String str);

    void signalPlayerStateChange(@NonNull POBVideoPlayerState pOBVideoPlayerState);

    void start(float f10, float f11);

    void startAdSession(View view, @NonNull List<POBVerificationScriptResource> list, @NonNull POBOmidSessionListener pOBOmidSessionListener);
}
