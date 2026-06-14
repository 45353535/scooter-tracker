package com.pubmatic.sdk.common.viewability;

import android.content.Context;
import android.view.View;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.viewability.POBObstructionUpdateListener;

/* JADX INFO: loaded from: classes11.dex */
public interface POBMeasurementProvider extends POBObstructionUpdateListener {

    public interface POBScriptListener {
        public static final int SCRIPT_LOADING_ERROR = 1;

        @MainThread
        void onFailedToReceiveMeasurementScript(int i10);

        @MainThread
        void onMeasurementScriptReceived(@NonNull String str);
    }

    @Override // com.pubmatic.sdk.common.viewability.POBObstructionUpdateListener
    /* synthetic */ void addFriendlyObstructions(@NonNull View view, @NonNull POBObstructionUpdateListener.POBFriendlyObstructionPurpose pOBFriendlyObstructionPurpose);

    void finishAdSession();

    @NonNull
    String omSDKVersion();

    void omidJsServiceScript(@NonNull Context context, @NonNull POBScriptListener pOBScriptListener);

    @Override // com.pubmatic.sdk.common.viewability.POBObstructionUpdateListener
    /* synthetic */ void removeFriendlyObstructions(@Nullable View view);

    void setTrackView(@NonNull View view);
}
