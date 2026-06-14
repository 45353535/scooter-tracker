package com.pubmatic.sdk.common;

import android.content.Context;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/pubmatic/sdk/common/POBCrashAnalysing;", "", MobileAdsBridgeBase.initializeMethodName, "", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "invalidate", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface POBCrashAnalysing {
    void initialize(@NotNull Context context);

    void invalidate();
}
