package androidx.privacysandbox.ads.adservices.measurement;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RestrictTo;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/MeasurementManagerApi33Ext5Impl;", "Landroidx/privacysandbox/ads/adservices/measurement/MeasurementManagerImplCommon;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "(Landroid/content/Context;)V", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"NewApi", "ClassVerificationFailure"})
@RequiresExtension(extension = 1000000, version = 5)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class MeasurementManagerApi33Ext5Impl extends MeasurementManagerImplCommon {
    /* JADX WARN: Illegal instructions before constructor call */
    public MeasurementManagerApi33Ext5Impl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService((Class<Object>) j.a());
        Intrinsics.checkNotNullExpressionValue(systemService, "context.getSystemService…ementManager::class.java)");
        super(k.a(systemService));
    }
}
