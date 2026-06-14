package com.amazon.aps.ads.util;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.amazon.aps.ads.ApsLog;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0001\u001a\u0012\u0010\b\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0001\u001a\u0012\u0010\t\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0001\u001a8\u0010\n\u001a\u00020\u0006*\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00012\u000e\u0010\b\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011\u001a8\u0010\u0012\u001a\u00020\u0006*\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00012\u000e\u0010\b\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011\u001a(\u0010\n\u001a\u00020\u0006*\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0013"}, d2 = {"TAG", "", "", "getTAG", "(Ljava/lang/Object;)Ljava/lang/String;", "d", "", PglCryptUtils.KEY_MESSAGE, EidRequestBuilder.REQUEST_FIELD_EMAIL, CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "logEvent", "severity", "Lcom/amazon/aps/shared/analytics/APSEventSeverity;", "eventType", "Lcom/amazon/aps/shared/analytics/APSEventType;", "errorDetails", "Ljava/lang/Exception;", "Lkotlin/Exception;", "remoteLog", "aps-sdk_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ApsAdExtensionsKt {
    public static final void d(@NotNull Object obj, @NotNull String message) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        Intrinsics.checkNotNullParameter(message, "message");
        ApsLog.d(getTAG(obj), message);
    }

    public static final void e(@NotNull Object obj, @NotNull String message) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        Intrinsics.checkNotNullParameter(message, "message");
        ApsLog.d(getTAG(obj), message);
    }

    @NotNull
    public static final String getTAG(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        String simpleName = obj.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    public static final void i(@NotNull Object obj, @NotNull String message) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        Intrinsics.checkNotNullParameter(message, "message");
        ApsLog.d(getTAG(obj), message);
    }

    public static final void logEvent(@NotNull Object obj, @Nullable APSEventSeverity aPSEventSeverity, @Nullable APSEventType aPSEventType, @Nullable String str, @Nullable Exception exc) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        APSAnalytics.logEvent(aPSEventSeverity, aPSEventType, str, exc);
    }

    public static final void remoteLog(@NotNull Object obj, @Nullable APSEventSeverity aPSEventSeverity, @Nullable APSEventType aPSEventType, @Nullable String str, @Nullable Exception exc) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        APSAnalytics.logEvent(aPSEventSeverity, aPSEventType, str, exc);
    }

    public static final void logEvent(@NotNull Object obj, @Nullable APSEventSeverity aPSEventSeverity, @Nullable APSEventType aPSEventType, @Nullable String str) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        APSAnalytics.logEvent(aPSEventSeverity, aPSEventType, str);
    }
}
