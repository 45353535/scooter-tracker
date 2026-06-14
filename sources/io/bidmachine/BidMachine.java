package io.bidmachine;

import android.content.Context;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import io.bidmachine.AdPlacementConfig;
import io.bidmachine.AdRequest;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class BidMachine {
    public static final String NAME = "BidMachine";
    private static final String TAG = "BidMachine";
    public static final String VERSION = "3.5.0";

    @NonNull
    @WorkerThread
    @Deprecated
    public static String getBidToken(@NonNull Context context, @NonNull AdsFormat adsFormat) {
        return getBidToken(context, new AdPlacementConfig.Builder(adsFormat.toAdFormat()).build());
    }

    @Nullable
    public static Object getExtrasParam(@NonNull Context context, @NonNull String str) {
        return ExtraParamsManager.get().getPublic(context, str);
    }

    public static void initialize(@NonNull Context context, @NonNull String str) {
        initialize(context, str, null);
    }

    public static boolean isInitialized() {
        return j2.e().C();
    }

    public static void registerAdRequestListener(@NonNull AdRequest.AdRequestListener<?> adRequestListener) {
        io.bidmachine.core.a.c("BidMachine", "registerAdRequestListener");
        j2.e().J(adRequestListener);
    }

    public static void registerNetworks(@NonNull NetworkConfig... networkConfigArr) {
        io.bidmachine.core.a.c("BidMachine", "registerNetworks with NetworkConfig array");
        NetworkRegistry.registerNetworks(networkConfigArr);
    }

    public static void setConsentConfig(final boolean z10, @Nullable final String str) {
        io.bidmachine.core.a.b("BidMachine", new ce.b() { // from class: io.bidmachine.h1
            @Override // ce.b
            public final Object get() {
                return String.format("setConsentConfig - %s, %s", Boolean.valueOf(z10), str);
            }
        });
        j2.e().w().r(z10, str);
    }

    public static void setCoppa(@Nullable final Boolean bool) {
        io.bidmachine.core.a.b("BidMachine", new ce.b() { // from class: io.bidmachine.d1
            @Override // ce.b
            public final Object get() {
                return String.format("setCoppa - %s", bool);
            }
        });
        j2.e().w().s(bool);
    }

    public static void setEndpoint(@NonNull final String str) {
        io.bidmachine.core.a.b("BidMachine", new ce.b() { // from class: io.bidmachine.i1
            @Override // ce.b
            public final Object get() {
                return String.format("setEndpoint - %s", str);
            }
        });
        UrlProvider.setEndpoint(str);
    }

    public static void setGPP(@Nullable final String str, @Nullable final List<Integer> list) {
        io.bidmachine.core.a.b("BidMachine", new ce.b() { // from class: io.bidmachine.e1
            @Override // ce.b
            public final Object get() {
                return String.format("setGPP - %s, [%s]", str, io.bidmachine.core.h.P(list));
            }
        });
        j2.e().w().t(str, list);
    }

    public static void setLoggingEnabled(boolean z10) {
        if (Debugger.isLoggingLock()) {
            io.bidmachine.core.a.c("BidMachine", "setLoggingEnabled skipped");
            return;
        }
        if (z10) {
            io.bidmachine.core.a.j(true);
            io.bidmachine.core.a.c("BidMachine", "setLoggingEnabled - true");
        } else {
            io.bidmachine.core.a.c("BidMachine", "setLoggingEnabled - false");
            io.bidmachine.core.a.j(false);
        }
        NetworkRegistry.setLoggingEnabled(z10);
    }

    public static void setPublisher(@Nullable Publisher publisher) {
        io.bidmachine.core.a.c("BidMachine", "setPublisher");
        j2.e().L(publisher);
    }

    public static void setSubjectToGDPR(@Nullable final Boolean bool) {
        io.bidmachine.core.a.b("BidMachine", new ce.b() { // from class: io.bidmachine.l1
            @Override // ce.b
            public final Object get() {
                return String.format("setSubjectToGDPR - %s", bool);
            }
        });
        j2.e().w().u(bool);
    }

    public static void setTargetingParams(@Nullable TargetingParams targetingParams) {
        io.bidmachine.core.a.c("BidMachine", "setTargetingParams");
        j2.e().M(targetingParams);
    }

    public static void setTestMode(final boolean z10) {
        if (Debugger.isTestModeLock()) {
            io.bidmachine.core.a.c("BidMachine", "setTestMode skipped");
        } else {
            io.bidmachine.core.a.b("BidMachine", new ce.b() { // from class: io.bidmachine.g1
                @Override // ce.b
                public final Object get() {
                    return String.format("setTestMode - %s", Boolean.valueOf(z10));
                }
            });
            j2.e().N(z10);
        }
    }

    public static void setUSPrivacyString(@Nullable final String str) {
        io.bidmachine.core.a.b("BidMachine", new ce.b() { // from class: io.bidmachine.j1
            @Override // ce.b
            public final Object get() {
                return String.format("setUSPrivacyString - %s", str);
            }
        });
        j2.e().w().v(str);
    }

    public static void unregisterAdRequestListener(@NonNull AdRequest.AdRequestListener<?> adRequestListener) {
        io.bidmachine.core.a.c("BidMachine", "unregisterAdRequestListener");
        j2.e().O(adRequestListener);
    }

    @NonNull
    @WorkerThread
    public static String getBidToken(@NonNull Context context, @NonNull AdPlacementConfig adPlacementConfig) {
        final String strF = u2.f(context.getApplicationContext(), adPlacementConfig);
        io.bidmachine.core.a.b("BidMachine", new ce.b() { // from class: io.bidmachine.f1
            @Override // ce.b
            public final Object get() {
                return String.format("getBidToken - %s", strF);
            }
        });
        return strF;
    }

    public static void initialize(@NonNull Context context, @NonNull final String str, @Nullable InitializationCallback initializationCallback) {
        io.bidmachine.core.a.b("BidMachine", new ce.b() { // from class: io.bidmachine.m1
            @Override // ce.b
            public final Object get() {
                return String.format("initialize - %s", str);
            }
        });
        j2.e().y(context, str, initializationCallback);
    }

    @WorkerThread
    public static void registerNetworks(@NonNull Context context, @NonNull String str) {
        io.bidmachine.core.a.c("BidMachine", "registerNetworks with JSON string");
        NetworkRegistry.registerNetworks(context, str);
    }

    @AnyThread
    @Deprecated
    public static void getBidToken(@NonNull Context context, @NonNull AdsFormat adsFormat, @NonNull BidTokenCallback bidTokenCallback) {
        getBidToken(context, new AdPlacementConfig.Builder(adsFormat.toAdFormat()).build(), bidTokenCallback);
    }

    @AnyThread
    public static void getBidToken(@NonNull Context context, @NonNull final AdPlacementConfig adPlacementConfig, @NonNull final BidTokenCallback bidTokenCallback) {
        final Context applicationContext = context.getApplicationContext();
        BidTokenTaskManager.execute(new Runnable() { // from class: io.bidmachine.k1
            @Override // java.lang.Runnable
            public final void run() {
                bidTokenCallback.onCollected(BidMachine.getBidToken(applicationContext, adPlacementConfig));
            }
        });
    }

    public static void registerNetworks(@NonNull Context context, @NonNull String str, @Nullable NetworkRegistryCallback networkRegistryCallback) {
        io.bidmachine.core.a.c("BidMachine", "registerNetworks with JSON string");
        NetworkRegistry.registerNetworks(context, str, networkRegistryCallback);
    }
}
