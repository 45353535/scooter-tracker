package com.pubmatic.sdk.openwrap.core.signal;

import android.content.Context;
import androidx.annotation.Keep;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/pubmatic/sdk/openwrap/core/signal/POBSignalGenerator;", "", "()V", "TAG", "", "generateSignal", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "biddingHost", "Lcom/pubmatic/sdk/openwrap/core/signal/POBBiddingHost;", "config", "Lcom/pubmatic/sdk/openwrap/core/signal/POBSignalConfig;", "openwrapcore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class POBSignalGenerator {

    @NotNull
    public static final POBSignalGenerator INSTANCE = new POBSignalGenerator();

    @NotNull
    private static final String TAG = "POBSignalGenerator";

    private POBSignalGenerator() {
    }

    @NotNull
    public static final String generateSignal(@NotNull Context context, @NotNull POBBiddingHost biddingHost, @NotNull POBSignalConfig config) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(biddingHost, "biddingHost");
        Intrinsics.checkNotNullParameter(config, "config");
        try {
            String strGenerateSignal = POBSignalGeneratorFactory.getSignalGenerator(biddingHost).generateSignal(context, config);
            POBLog.debug(TAG, "Generated signal for " + biddingHost + " with input data " + config + " : " + strGenerateSignal, new Object[0]);
            return strGenerateSignal;
        } catch (IllegalArgumentException e10) {
            POBLog.error(TAG, "Failed to generate signal for " + biddingHost + " with error " + e10.getMessage(), new Object[0]);
            String string = new JSONObject().toString();
            Intrinsics.checkNotNullExpressionValue(string, "JSONObject().toString()");
            return string;
        }
    }
}
