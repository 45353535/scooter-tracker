package com.pubmatic.sdk.openwrap.core.signal;

import android.content.Context;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/pubmatic/sdk/openwrap/core/signal/POBSignalGeneration;", "", "generateSignal", "", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "config", "Lcom/pubmatic/sdk/openwrap/core/signal/POBSignalConfig;", "openwrapcore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface POBSignalGeneration {
    @NotNull
    String generateSignal(@NotNull Context context, @NotNull POBSignalConfig config);
}
