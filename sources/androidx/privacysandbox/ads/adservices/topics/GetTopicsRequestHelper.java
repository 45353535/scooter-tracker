package androidx.privacysandbox.ads.adservices.topics;

import android.annotation.SuppressLint;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RestrictTo;
import b.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\n\u0010\b¨\u0006\f"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/GetTopicsRequestHelper;", "", "<init>", "()V", "Landroidx/privacysandbox/ads/adservices/topics/GetTopicsRequest;", "request", "Lb/a;", "convertRequestWithRecordObservation$ads_adservices_release", "(Landroidx/privacysandbox/ads/adservices/topics/GetTopicsRequest;)Lb/a;", "convertRequestWithRecordObservation", "convertRequestWithoutRecordObservation$ads_adservices_release", "convertRequestWithoutRecordObservation", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"ClassVerificationFailure"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class GetTopicsRequestHelper {

    @NotNull
    public static final GetTopicsRequestHelper INSTANCE = new GetTopicsRequestHelper();

    private GetTopicsRequestHelper() {
    }

    @RequiresExtension.Container({@RequiresExtension(extension = 1000000, version = 5), @RequiresExtension(extension = 31, version = 9)})
    @NotNull
    public final b.a convertRequestWithRecordObservation$ads_adservices_release(@NotNull GetTopicsRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        new a.C0123a().b(request.getAdsSdkName()).c(request.getShouldRecordObservation()).a();
        Intrinsics.checkNotNullExpressionValue(null, "Builder()\n            .s…ion)\n            .build()");
        return null;
    }

    @RequiresExtension.Container({@RequiresExtension(extension = 1000000, version = 4), @RequiresExtension(extension = 31, version = 9)})
    @NotNull
    public final b.a convertRequestWithoutRecordObservation$ads_adservices_release(@NotNull GetTopicsRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        new a.C0123a().b(request.getAdsSdkName()).a();
        Intrinsics.checkNotNullExpressionValue(null, "Builder()\n            .s…ame)\n            .build()");
        return null;
    }
}
