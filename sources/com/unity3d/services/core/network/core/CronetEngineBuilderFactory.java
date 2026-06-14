package com.unity3d.services.core.network.core;

import android.content.Context;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.net.CronetEngine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/unity3d/services/core/network/core/CronetEngineBuilderFactory;", "", "()V", "createCronetEngineBuilder", "Lorg/chromium/net/CronetEngine$Builder;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CronetEngineBuilderFactory {
    @NotNull
    public final CronetEngine.Builder createCronetEngineBuilder(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new CronetEngine.Builder(context);
    }
}
