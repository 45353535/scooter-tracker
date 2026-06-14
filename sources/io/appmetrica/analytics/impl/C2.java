package io.appmetrica.analytics.impl;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@DoNotInline
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Lio/appmetrica/analytics/impl/C2;", "", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Lio/appmetrica/analytics/impl/l2;", "converter", "Lio/appmetrica/analytics/impl/F2;", "a", "<init>", "()V", "analytics_binaryProdRelease"}, k = 1, mv = {1, 6, 0})
@TargetApi(28)
public final class C2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C2 f75602a = new C2();

    private C2() {
    }

    @NotNull
    public static final F2 a(@NotNull Context context, @NotNull final C5236l2 converter) {
        return new F2((E2) SystemServiceUtils.accessSystemServiceByNameSafely(context, "usagestats", "getting app standby bucket", "usageStatsManager", new FunctionWithThrowable() { // from class: io.appmetrica.analytics.impl.dp
            @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
            public final Object apply(Object obj) {
                return C2.a(converter, (UsageStatsManager) obj);
            }
        }), (Boolean) SystemServiceUtils.accessSystemServiceByNameSafely(context, "activity", "getting is background restricted", "activityManager", new FunctionWithThrowable() { // from class: io.appmetrica.analytics.impl.ep
            @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
            public final Object apply(Object obj) {
                return C2.a((ActivityManager) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final E2 a(C5236l2 c5236l2, UsageStatsManager usageStatsManager) {
        int appStandbyBucket = usageStatsManager.getAppStandbyBucket();
        c5236l2.getClass();
        if (!AndroidUtils.isApiAchieved(28)) {
            return null;
        }
        if (AndroidUtils.isApiAchieved(30) && appStandbyBucket == 45) {
            return E2.RESTRICTED;
        }
        if (appStandbyBucket == 5) {
            return E2.EXEMPTED;
        }
        if (appStandbyBucket == 10) {
            return E2.ACTIVE;
        }
        if (appStandbyBucket == 30) {
            return E2.FREQUENT;
        }
        if (appStandbyBucket == 20) {
            return E2.WORKING_SET;
        }
        if (appStandbyBucket == 40) {
            return E2.RARE;
        }
        return E2.UNKNOWN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean a(ActivityManager activityManager) {
        return Boolean.valueOf(activityManager.isBackgroundRestricted());
    }
}
