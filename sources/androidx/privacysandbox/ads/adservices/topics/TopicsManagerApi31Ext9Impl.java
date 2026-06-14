package androidx.privacysandbox.ads.adservices.topics;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RestrictTo;
import b.d;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/TopicsManagerApi31Ext9Impl;", "Landroidx/privacysandbox/ads/adservices/topics/TopicsManagerImplCommon;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "<init>", "(Landroid/content/Context;)V", "Landroidx/privacysandbox/ads/adservices/topics/GetTopicsRequest;", "request", "Lb/a;", "convertRequest$ads_adservices_release", "(Landroidx/privacysandbox/ads/adservices/topics/GetTopicsRequest;)Lb/a;", "convertRequest", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"NewApi", "ClassVerificationFailure"})
@RequiresExtension(extension = 31, version = 9)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class TopicsManagerApi31Ext9Impl extends TopicsManagerImplCommon {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopicsManagerApi31Ext9Impl(@NotNull Context context) {
        super(null);
        Intrinsics.checkNotNullParameter(context, "context");
        d.a(context);
        Intrinsics.checkNotNullExpressionValue(null, "get(context)");
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon
    @NotNull
    public b.a convertRequest$ads_adservices_release(@NotNull GetTopicsRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        GetTopicsRequestHelper.INSTANCE.convertRequestWithRecordObservation$ads_adservices_release(request);
        return null;
    }
}
