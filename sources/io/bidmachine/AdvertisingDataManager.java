package io.bidmachine;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.huawei.hms.ads.identifier.AdvertisingIdClient;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes12.dex */
abstract class AdvertisingDataManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f79110a = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List f79111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static b f79112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static AdvertisingData f79113d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f79114e;

    public static class AdvertisingData {

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @Nullable
        private final String f79115id;
        private final boolean limitAdTrackingEnabled;

        public AdvertisingData(@Nullable String str, boolean z10) {
            this.f79115id = str;
            this.limitAdTrackingEnabled = z10;
        }

        @Nullable
        public String getId() {
            return this.f79115id;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.limitAdTrackingEnabled;
        }
    }

    private static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f79116a = new AtomicBoolean(true);

        private boolean b() {
            return this.f79116a.get();
        }

        protected abstract AdvertisingData a(Context context);

        public AdvertisingData c(Context context) {
            if (!b()) {
                return null;
            }
            try {
                return a(context);
            } catch (NoClassDefFoundError e10) {
                d(false);
                io.bidmachine.core.a.p(e10);
                return null;
            } catch (Throwable th2) {
                io.bidmachine.core.a.p(th2);
                return null;
            }
        }

        protected void d(boolean z10) {
            this.f79116a.set(z10);
        }
    }

    private static class c extends b {
        private c() {
        }

        @Override // io.bidmachine.AdvertisingDataManager.b
        protected AdvertisingData a(Context context) {
            try {
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
                if (advertisingIdInfo != null) {
                    return new AdvertisingData(advertisingIdInfo.getId(), advertisingIdInfo.isLimitAdTrackingEnabled());
                }
                return null;
            } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException unused) {
                d(false);
                return null;
            }
        }
    }

    private static class d extends b {
        private d() {
        }

        @Override // io.bidmachine.AdvertisingDataManager.b
        protected AdvertisingData a(Context context) {
            AdvertisingIdClient.Info advertisingIdInfo = com.huawei.hms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(context);
            if (advertisingIdInfo != null) {
                return new AdvertisingData(advertisingIdInfo.getId(), advertisingIdInfo.isLimitAdTrackingEnabled());
            }
            return null;
        }
    }

    static {
        ArrayList arrayList = new ArrayList(2);
        f79111b = arrayList;
        arrayList.add(new c());
        arrayList.add(new d());
    }

    static String a(Context context, boolean z10) {
        if (z10) {
            return "00000000-0000-0000-0000-000000000000";
        }
        AdvertisingData advertisingData = f79113d;
        String id2 = advertisingData != null ? advertisingData.getId() : null;
        return (TextUtils.isEmpty(id2) || "00000000-0000-0000-0000-000000000000".equals(id2)) ? c(context) : id2;
    }

    static boolean b() {
        AdvertisingData advertisingData = f79113d;
        return advertisingData != null && advertisingData.isLimitAdTrackingEnabled();
    }

    private static String c(Context context) {
        if (!TextUtils.isEmpty(f79114e)) {
            return f79114e;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("ad_core_preferences", 0);
        String strE = pd.y.e(sharedPreferences, CommonUrlParts.UUID, null);
        f79114e = strE;
        if (!TextUtils.isEmpty(strE)) {
            return f79114e;
        }
        f79114e = f79110a;
        sharedPreferences.edit().putString(CommonUrlParts.UUID, f79114e).apply();
        return f79114e;
    }

    static void d(Context context) {
        b bVar = f79112c;
        if (bVar != null) {
            AdvertisingData advertisingDataC = bVar.c(context);
            if (advertisingDataC != null) {
                f79113d = advertisingDataC;
                return;
            }
            return;
        }
        for (b bVar2 : f79111b) {
            AdvertisingData advertisingDataC2 = bVar2.c(context);
            if (advertisingDataC2 != null) {
                f79112c = bVar2;
                f79113d = advertisingDataC2;
                return;
            }
        }
    }
}
