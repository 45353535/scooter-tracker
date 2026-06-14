package com.applovin.impl;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f11095a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f11096b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Collection f11097c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f11098d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static a f11099e = null;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f11100a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f11101b = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private EnumC0184a f11102c = EnumC0184a.NOT_SET;

        /* JADX INFO: renamed from: com.applovin.impl.v$a$a, reason: collision with other inner class name */
        public enum EnumC0184a {
            NOT_SET("dnt_not_set"),
            ON("dnt_on"),
            OFF("dnt_off");


            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f11107a;

            EnumC0184a(String str) {
                this.f11107a = str;
            }

            public String b() {
                return this.f11107a;
            }
        }

        protected boolean a(Object obj) {
            return obj instanceof a;
        }

        public EnumC0184a b() {
            return this.f11102c;
        }

        public boolean c() {
            return this.f11100a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!aVar.a(this) || c() != aVar.c()) {
                return false;
            }
            String strA = a();
            String strA2 = aVar.a();
            if (strA != null ? !strA.equals(strA2) : strA2 != null) {
                return false;
            }
            EnumC0184a enumC0184aB = b();
            EnumC0184a enumC0184aB2 = aVar.b();
            return enumC0184aB != null ? enumC0184aB.equals(enumC0184aB2) : enumC0184aB2 == null;
        }

        public int hashCode() {
            int i10 = c() ? 79 : 97;
            String strA = a();
            int iHashCode = ((i10 + 59) * 59) + (strA == null ? 43 : strA.hashCode());
            EnumC0184a enumC0184aB = b();
            return (iHashCode * 59) + (enumC0184aB != null ? enumC0184aB.hashCode() : 43);
        }

        public String toString() {
            return "AdvertisingInfoCollector.AdvertisingIdInformation(adTrackingLimited=" + c() + ", advertisingId=" + a() + ", dntCode=" + b() + ")";
        }

        public void a(boolean z10) {
            this.f11100a = z10;
        }

        public void a(String str) {
            this.f11101b = str;
        }

        public void a(EnumC0184a enumC0184a) {
            this.f11102c = enumC0184a;
        }

        public String a() {
            return this.f11101b;
        }
    }

    private static a a(Context context) {
        a aVar;
        HashSet hashSet;
        n7.a();
        Object obj = f11096b;
        synchronized (obj) {
            try {
                if (f11098d) {
                    return f11099e;
                }
                Collection collection = f11097c;
                boolean zIsEmpty = collection.isEmpty();
                CountDownLatch countDownLatch = new CountDownLatch(1);
                collection.add(countDownLatch);
                if (zIsEmpty) {
                    a aVarC = c(context);
                    synchronized (obj) {
                        f11098d = true;
                        f11099e = aVarC;
                        hashSet = new HashSet(collection);
                        collection.clear();
                    }
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        ((CountDownLatch) it.next()).countDown();
                    }
                }
                try {
                    if (!countDownLatch.await(60L, TimeUnit.SECONDS)) {
                        com.applovin.impl.sdk.o.h("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }: collection timeout");
                    }
                } catch (InterruptedException e10) {
                    com.applovin.impl.sdk.o.c("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }", e10);
                }
                synchronized (f11096b) {
                    aVar = f11099e;
                }
                return aVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static a b(Context context) {
        return a(context);
    }

    private static a c(Context context) {
        a aVarCollectGoogleAdvertisingInfo = collectGoogleAdvertisingInfo(context);
        if (aVarCollectGoogleAdvertisingInfo == null) {
            aVarCollectGoogleAdvertisingInfo = collectFireOSAdvertisingInfo(context);
        }
        return aVarCollectGoogleAdvertisingInfo == null ? new a() : aVarCollectGoogleAdvertisingInfo;
    }

    @Nullable
    private static a collectFireOSAdvertisingInfo(Context context) {
        if (f11095a) {
            try {
                ContentResolver contentResolver = context.getContentResolver();
                a aVar = new a();
                aVar.a(StringUtils.emptyIfNull(Settings.Secure.getString(contentResolver, "advertising_id")));
                boolean z10 = Settings.Secure.getInt(contentResolver, CommonUrlParts.LIMIT_AD_TRACKING) != 0;
                aVar.a(z10);
                aVar.a(z10 ? a.EnumC0184a.ON : a.EnumC0184a.OFF);
                return aVar;
            } catch (Settings.SettingNotFoundException e10) {
                com.applovin.impl.sdk.o.c("DataCollector", "Unable to determine if Fire OS limited ad tracking is turned on", e10);
            } catch (Throwable th2) {
                com.applovin.impl.sdk.o.c("DataCollector", "Unable to collect Fire OS IDFA", th2);
            }
        }
        f11095a = false;
        return null;
    }

    @Nullable
    private static a collectGoogleAdvertisingInfo(Context context) {
        n7.a();
        if (!a()) {
            if (AppLovinSdkUtils.isFireOS(context)) {
                return null;
            }
            com.applovin.impl.sdk.o.h("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }");
            return null;
        }
        try {
            a aVar = new a();
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            boolean zIsLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled();
            aVar.a(zIsLimitAdTrackingEnabled);
            aVar.a(zIsLimitAdTrackingEnabled ? a.EnumC0184a.ON : a.EnumC0184a.OFF);
            aVar.a(advertisingIdInfo.getId());
            return aVar;
        } catch (Throwable th2) {
            if (AppLovinSdkUtils.isFireOS(context)) {
                return null;
            }
            com.applovin.impl.sdk.o.c("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }", th2);
            return null;
        }
    }

    public static boolean a() {
        return n7.a("com.google.android.gms.ads.identifier.AdvertisingIdClient");
    }
}
