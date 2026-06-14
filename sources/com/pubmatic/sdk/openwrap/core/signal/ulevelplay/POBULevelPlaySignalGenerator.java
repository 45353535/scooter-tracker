package com.pubmatic.sdk.openwrap.core.signal.ulevelplay;

import android.content.Context;
import android.util.Base64;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.pubmatic.sdk.openwrap.core.signal.POBSignalConfig;
import com.pubmatic.sdk.openwrap.core.signal.POBSignalGeneration;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\n"}, d2 = {"Lcom/pubmatic/sdk/openwrap/core/signal/ulevelplay/POBULevelPlaySignalGenerator;", "Lcom/pubmatic/sdk/openwrap/core/signal/POBSignalGeneration;", "()V", "generateSignal", "", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "config", "Lcom/pubmatic/sdk/openwrap/core/signal/POBSignalConfig;", y.f66058y, "openwrapcore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class POBULevelPlaySignalGenerator implements POBSignalGeneration {
    @Override // com.pubmatic.sdk.openwrap.core.signal.POBSignalGeneration
    @NotNull
    public String generateSignal(@NotNull Context context, @NotNull POBSignalConfig config) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        try {
            byte[] bytes = new POBULevelPlaySignalBuilder(context, config).build().getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            String strEncodeToString = Base64.encodeToString(bytes, 0);
            Intrinsics.checkNotNullExpressionValue(strEncodeToString, "{\n            // build e…Base64.DEFAULT)\n        }");
            return strEncodeToString;
        } catch (AssertionError e10) {
            POBLog.debug("POBULevelPlaySignalGenerator", "Error generating signal: " + e10.getMessage(), new Object[0]);
            return "";
        }
    }
}
