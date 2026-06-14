package io.appmetrica.analytics.impl;

import android.annotation.TargetApi;
import android.content.Context;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.sl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@DoNotInline
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\t"}, d2 = {"Lio/appmetrica/analytics/impl/sl;", "", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "", "Lio/appmetrica/analytics/impl/ml;", "a", "<init>", "()V", "analytics_binaryProdRelease"}, k = 1, mv = {1, 6, 0})
@TargetApi(23)
public final class C5429sl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C5429sl f78245a = new C5429sl();

    private C5429sl() {
    }

    @NotNull
    public static final List<C5280ml> a(@NotNull Context context) {
        List<SubscriptionInfo> list = (List) SystemServiceUtils.accessSystemServiceByNameSafely(context, "telephony_subscription_service", "getting active subcription info list", "SubscriptionManager", new FunctionWithThrowable() { // from class: io.appmetrica.analytics.impl.vq
            @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
            public final Object apply(Object obj) {
                return C5429sl.a((SubscriptionManager) obj);
            }
        });
        if (list == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (SubscriptionInfo subscriptionInfo : list) {
            Integer numA = AndroidUtils.isApiAchieved(29) ? C5454tl.a(subscriptionInfo) : Integer.valueOf(subscriptionInfo.getMcc());
            Integer numB = AndroidUtils.isApiAchieved(29) ? C5454tl.b(subscriptionInfo) : Integer.valueOf(subscriptionInfo.getMnc());
            boolean z10 = subscriptionInfo.getDataRoaming() == 1;
            CharSequence carrierName = subscriptionInfo.getCarrierName();
            arrayList.add(new C5280ml(numA, numB, z10, carrierName != null ? carrierName.toString() : null));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List a(SubscriptionManager subscriptionManager) {
        return subscriptionManager.getActiveSubscriptionInfoList();
    }
}
