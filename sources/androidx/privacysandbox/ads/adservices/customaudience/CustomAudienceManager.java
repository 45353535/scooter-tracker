package androidx.privacysandbox.ads.adservices.customaudience;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.RequiresPermission;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo;
import androidx.privacysandbox.ads.adservices.internal.BackCompatManager;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\tH§@¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\fH§@¢\u0006\u0002\u0010\r¨\u0006\u000f"}, d2 = {"Landroidx/privacysandbox/ads/adservices/customaudience/CustomAudienceManager;", "", "()V", "fetchAndJoinCustomAudience", "", "request", "Landroidx/privacysandbox/ads/adservices/customaudience/FetchAndJoinCustomAudienceRequest;", "(Landroidx/privacysandbox/ads/adservices/customaudience/FetchAndJoinCustomAudienceRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "joinCustomAudience", "Landroidx/privacysandbox/ads/adservices/customaudience/JoinCustomAudienceRequest;", "(Landroidx/privacysandbox/ads/adservices/customaudience/JoinCustomAudienceRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "leaveCustomAudience", "Landroidx/privacysandbox/ads/adservices/customaudience/LeaveCustomAudienceRequest;", "(Landroidx/privacysandbox/ads/adservices/customaudience/LeaveCustomAudienceRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.taurusx.tax.f.y.f66058y, "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class CustomAudienceManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/privacysandbox/ads/adservices/customaudience/CustomAudienceManager$Companion;", "", "()V", "obtain", "Landroidx/privacysandbox/ads/adservices/customaudience/CustomAudienceManager;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        @Nullable
        public final CustomAudienceManager obtain(@NotNull final Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            AdServicesInfo adServicesInfo = AdServicesInfo.INSTANCE;
            if (adServicesInfo.adServicesVersion() >= 4) {
                return new CustomAudienceManagerApi33Ext4Impl(context);
            }
            if (adServicesInfo.extServicesVersionS() >= 9) {
                return (CustomAudienceManager) BackCompatManager.INSTANCE.getManager(context, "CustomAudienceManager", new Function1<Context, CustomAudienceManagerApi31Ext9Impl>() { // from class: androidx.privacysandbox.ads.adservices.customaudience.CustomAudienceManager$Companion$obtain$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final CustomAudienceManagerApi31Ext9Impl invoke(Context it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return new CustomAudienceManagerApi31Ext9Impl(context);
                    }
                });
            }
            return null;
        }

        private Companion() {
        }
    }

    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    @Nullable
    public static final CustomAudienceManager obtain(@NotNull Context context) {
        return INSTANCE.obtain(context);
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @ExperimentalFeatures.Ext10OptIn
    @Nullable
    public abstract Object fetchAndJoinCustomAudience(@NotNull FetchAndJoinCustomAudienceRequest fetchAndJoinCustomAudienceRequest, @NotNull Continuation continuation);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @Nullable
    public abstract Object joinCustomAudience(@NotNull JoinCustomAudienceRequest joinCustomAudienceRequest, @NotNull Continuation continuation);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @Nullable
    public abstract Object leaveCustomAudience(@NotNull LeaveCustomAudienceRequest leaveCustomAudienceRequest, @NotNull Continuation continuation);
}
