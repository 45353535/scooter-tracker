package com.mobilefuse.sdk.video;

import com.mobilefuse.sdk.video.ClickthroughBehaviour;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u0002*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004¨\u0006\b"}, d2 = {"canAcceptSource", "", "Lcom/mobilefuse/sdk/video/ClickthroughBehaviour;", "source", "", "fromValue", "Lcom/mobilefuse/sdk/video/ClickthroughBehaviour$Companion;", "value", "mobilefuse-sdk-common_release"}, k = 2, mv = {1, 4, 3})
public final class ClickthroughBehaviourKt {
    public static final boolean canAcceptSource(@NotNull ClickthroughBehaviour canAcceptSource, @NotNull String source) {
        Intrinsics.checkNotNullParameter(canAcceptSource, "$this$canAcceptSource");
        Intrinsics.checkNotNullParameter(source, "source");
        return canAcceptSource.getAcceptableSources$mobilefuse_sdk_common_release().contains(source);
    }

    @Nullable
    public static final ClickthroughBehaviour fromValue(@NotNull ClickthroughBehaviour.Companion fromValue, @NotNull String value) {
        Intrinsics.checkNotNullParameter(fromValue, "$this$fromValue");
        Intrinsics.checkNotNullParameter(value, "value");
        for (ClickthroughBehaviour clickthroughBehaviour : ClickthroughBehaviour.values()) {
            if (Intrinsics.areEqual(clickthroughBehaviour.getValue(), value)) {
                return clickthroughBehaviour;
            }
        }
        return null;
    }
}
