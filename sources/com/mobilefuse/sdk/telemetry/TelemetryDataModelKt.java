package com.mobilefuse.sdk.telemetry;

import io.sentry.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0004"}, d2 = {"isTheSameActionType", "", "Lcom/mobilefuse/sdk/telemetry/TelemetryActionType;", "other", "mobilefuse-sdk-telemetry_release"}, k = 2, mv = {1, 4, 3})
public final class TelemetryDataModelKt {
    public static final boolean isTheSameActionType(@NotNull TelemetryActionType isTheSameActionType, @NotNull TelemetryActionType other) {
        Intrinsics.checkNotNullParameter(isTheSameActionType, "$this$isTheSameActionType");
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.areEqual(isTheSameActionType.getCategory(), other.getCategory()) && new Regex(StringsKt.W(other.getMessage(), "%s", v7.DEFAULT_PROPAGATION_TARGETS, false, 4, null)).a(isTheSameActionType.getMessage()) && new Regex(StringsKt.W(other.getLogExtraMessage(), "%s", v7.DEFAULT_PROPAGATION_TARGETS, false, 4, null)).a(isTheSameActionType.getLogExtraMessage());
    }
}
