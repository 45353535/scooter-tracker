package androidx.privacysandbox.ads.adservices.topics;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RestrictTo;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import b.b;
import b.d;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0011¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/TopicsManagerApi33Ext11Impl;", "Landroidx/privacysandbox/ads/adservices/topics/TopicsManagerImplCommon;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "<init>", "(Landroid/content/Context;)V", "Landroidx/privacysandbox/ads/adservices/topics/GetTopicsRequest;", "request", "Lb/a;", "convertRequest$ads_adservices_release", "(Landroidx/privacysandbox/ads/adservices/topics/GetTopicsRequest;)Lb/a;", "convertRequest", "Lb/b;", "response", "Landroidx/privacysandbox/ads/adservices/topics/GetTopicsResponse;", "convertResponse$ads_adservices_release", "(Lb/b;)Landroidx/privacysandbox/ads/adservices/topics/GetTopicsResponse;", "convertResponse", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"NewApi", "ClassVerificationFailure"})
@RequiresExtension(extension = 1000000, version = 11)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class TopicsManagerApi33Ext11Impl extends TopicsManagerImplCommon {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopicsManagerApi33Ext11Impl(@NotNull Context context) {
        super(null);
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService((Class<Object>) d.class);
        Intrinsics.checkNotNullExpressionValue(systemService, "context.getSystemService…opicsManager::class.java)");
        a.a(systemService);
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon
    @NotNull
    public b.a convertRequest$ads_adservices_release(@NotNull GetTopicsRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        GetTopicsRequestHelper.INSTANCE.convertRequestWithRecordObservation$ads_adservices_release(request);
        return null;
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon
    @ExperimentalFeatures.Ext11OptIn
    @NotNull
    public GetTopicsResponse convertResponse$ads_adservices_release(@NotNull b response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return GetTopicsResponseHelper.INSTANCE.convertResponseWithEncryptedTopics$ads_adservices_release(response);
    }
}
