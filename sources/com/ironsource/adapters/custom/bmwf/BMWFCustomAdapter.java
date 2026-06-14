package com.ironsource.adapters.custom.bmwf;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.metadata.MetaData;
import com.ironsource.mediationsdk.metadata.MetaDataUtils;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseAdapter;
import io.bidmachine.BidMachine;
import io.bidmachine.InitializationCallback;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class BMWFCustomAdapter extends LevelPlayBaseAdapter {
    private static void notifyOnInitFailed(int i10, @Nullable String str, @Nullable NetworkInitializationListener networkInitializationListener) {
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitFailed(i10, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void notifyOnInitSuccess(@Nullable NetworkInitializationListener networkInitializationListener) {
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitSuccess();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface
    @NonNull
    public String getAdapterVersion() {
        return BuildConfig.VERSION_NAME;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface
    @Nullable
    public String getNetworkSDKVersion() {
        return "3.5.0";
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface
    public void init(@NonNull AdData adData, @NonNull Context context, @Nullable final NetworkInitializationListener networkInitializationListener) {
        if (BidMachine.isInitialized()) {
            notifyOnInitSuccess(networkInitializationListener);
            return;
        }
        Map<String, Object> configuration = adData.getConfiguration();
        if (configuration == null) {
            notifyOnInitFailed(1002, "Configuration not found", networkInitializationListener);
            return;
        }
        String string = BMUtils.getString(configuration, BMConstants.SOURCE_ID);
        if (TextUtils.isEmpty(string)) {
            notifyOnInitFailed(1002, "SourceId not found", networkInitializationListener);
        } else {
            BidMachine.initialize(context, string, new InitializationCallback() { // from class: com.ironsource.adapters.custom.bmwf.a
                @Override // io.bidmachine.InitializationCallback
                public final void onInitialized() {
                    BMWFCustomAdapter.notifyOnInitSuccess(networkInitializationListener);
                }
            });
        }
    }

    @Override // com.unity3d.mediation.adapters.levelplay.LevelPlayBaseAdapter, com.ironsource.mediationsdk.adunit.adapter.BaseAdapter, com.ironsource.mediationsdk.adunit.adapter.AdapterDebugInterface
    public void setAdapterDebug(boolean z10) {
        BidMachine.setLoggingEnabled(z10);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.BaseAdapter, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterConsentInterface
    public void setConsent(boolean z10) {
        BidMachine.setSubjectToGDPR(Boolean.TRUE);
        BidMachine.setConsentConfig(z10, null);
    }

    @Override // com.unity3d.mediation.adapters.levelplay.LevelPlayBaseAdapter, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface
    public void setMetaData(String str, List<String> list) {
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return;
        }
        String str2 = list.get(0);
        if (MetaDataUtils.isValidCCPAMetaData(str, str2)) {
            BidMachine.setUSPrivacyString(MetaDataUtils.getMetaDataBooleanValue(str2) ? BMConstants.BM_CCPA_NO_CONSENT_VALUE : BMConstants.BM_CCPA_CONSENT_VALUE);
            return;
        }
        String valueForType = MetaDataUtils.formatValueForType(str2, MetaData.MetaDataValueTypes.META_DATA_VALUE_BOOLEAN);
        if (MetaDataUtils.isValidMetaData(str, BMConstants.BM_COPPA, valueForType)) {
            BidMachine.setCoppa(Boolean.valueOf(MetaDataUtils.getMetaDataBooleanValue(valueForType)));
        } else if (MetaDataUtils.isValidMetaData(str, "is_child_directed", valueForType)) {
            BidMachine.setCoppa(Boolean.valueOf(MetaDataUtils.getMetaDataBooleanValue(valueForType)));
        }
    }
}
