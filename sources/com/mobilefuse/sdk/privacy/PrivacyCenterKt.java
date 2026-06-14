package com.mobilefuse.sdk.privacy;

import com.mobilefuse.sdk.MobileFuse;
import com.mobilefuse.sdk.MobileFuseSettings;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0004"}, d2 = {"dntFactory", "", "Lcom/mobilefuse/sdk/privacy/PrivacyCenter;", "ifaLmtFactory", "mobilefuse-sdk-core_release"}, k = 2, mv = {1, 4, 3})
public final class PrivacyCenterKt {
    public static final boolean dntFactory(@NotNull PrivacyCenter dntFactory) {
        Intrinsics.checkNotNullParameter(dntFactory, "$this$dntFactory");
        return MobileFuse.getPrivacyPreferences().isDoNotTrack();
    }

    public static final boolean ifaLmtFactory(@NotNull PrivacyCenter ifaLmtFactory) {
        Intrinsics.checkNotNullParameter(ifaLmtFactory, "$this$ifaLmtFactory");
        return MobileFuseSettings.isLimitTrackingEnabled();
    }
}
