package com.mobilefuse.sdk.mraid;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.Utils;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.y;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/mobilefuse/sdk/mraid/MraidFeatureDetection;", "", "()V", y.f66058y, "mobilefuse-sdk-mraid_release"}, k = 1, mv = {1, 4, 3})
public final class MraidFeatureDetection {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static boolean initialized;
    private static boolean locationSupport;
    private static boolean smsSupport;
    private static boolean telSupport;
    private static boolean vpaidSupported;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0007R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR,\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048\u0006@BX\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR,\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048\u0006@BX\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\tR,\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048\u0006@BX\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0013\u0010\u0002\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR,\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048\u0006@BX\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0017\u0010\u0002\u001a\u0004\b\u0018\u0010\u0007\"\u0004\b\u0019\u0010\t¨\u0006\u001e"}, d2 = {"Lcom/mobilefuse/sdk/mraid/MraidFeatureDetection$Companion;", "", "()V", "<set-?>", "", "initialized", "getInitialized", "()Z", "setInitialized", "(Z)V", "locationSupport", "getLocationSupport$annotations", "getLocationSupport", "setLocationSupport", "smsSupport", "getSmsSupport$annotations", "getSmsSupport", "setSmsSupport", "telSupport", "getTelSupport$annotations", "getTelSupport", "setTelSupport", "vpaidSupported", "getVpaidSupported$annotations", "getVpaidSupported", "setVpaidSupported", MobileAdsBridgeBase.initializeMethodName, "", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "mobilefuse-sdk-mraid_release"}, k = 1, mv = {1, 4, 3})
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ void getLocationSupport$annotations() {
        }

        public static /* synthetic */ void getSmsSupport$annotations() {
        }

        public static /* synthetic */ void getTelSupport$annotations() {
        }

        public static /* synthetic */ void getVpaidSupported$annotations() {
        }

        private final void setInitialized(boolean z10) {
            MraidFeatureDetection.initialized = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void setLocationSupport(boolean z10) {
            MraidFeatureDetection.locationSupport = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void setSmsSupport(boolean z10) {
            MraidFeatureDetection.smsSupport = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void setTelSupport(boolean z10) {
            MraidFeatureDetection.telSupport = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void setVpaidSupported(boolean z10) {
            MraidFeatureDetection.vpaidSupported = z10;
        }

        public final boolean getInitialized() {
            return MraidFeatureDetection.initialized;
        }

        public final boolean getLocationSupport() {
            return MraidFeatureDetection.locationSupport;
        }

        public final boolean getSmsSupport() {
            return MraidFeatureDetection.smsSupport;
        }

        public final boolean getTelSupport() {
            return MraidFeatureDetection.telSupport;
        }

        public final boolean getVpaidSupported() {
            return MraidFeatureDetection.vpaidSupported;
        }

        public final void initialize(@NotNull final Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (getInitialized()) {
                return;
            }
            setInitialized(true);
            new Thread(new Runnable() { // from class: com.mobilefuse.sdk.mraid.MraidFeatureDetection$Companion$initialize$1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        MraidFeatureDetection.INSTANCE.setSmsSupport(Utils.hasIntent(context, new Intent("android.intent.action.VIEW", Uri.parse("sms:0123456789"))));
                    } catch (Throwable th2) {
                        StabilityHelper.logException(MraidFeatureDetection.INSTANCE, th2);
                    }
                    try {
                        MraidFeatureDetection.INSTANCE.setTelSupport(Utils.hasIntent(context, new Intent("android.intent.action.VIEW", Uri.parse("tel:0123456789"))));
                    } catch (Throwable th3) {
                        StabilityHelper.logException(MraidFeatureDetection.INSTANCE, th3);
                    }
                    try {
                        MraidFeatureDetection.INSTANCE.setLocationSupport(Utils.hasManifestPermission(context, "android.permission.ACCESS_FINE_LOCATION") || Utils.hasManifestPermission(context, "android.permission.ACCESS_COARSE_LOCATION"));
                    } catch (Throwable th4) {
                        StabilityHelper.logException(MraidFeatureDetection.INSTANCE, th4);
                    }
                }
            }).start();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final boolean getLocationSupport() {
        return locationSupport;
    }

    public static final boolean getSmsSupport() {
        return smsSupport;
    }

    public static final boolean getTelSupport() {
        return telSupport;
    }

    public static final boolean getVpaidSupported() {
        return vpaidSupported;
    }

    public static final void initialize(@NotNull Context context) {
        INSTANCE.initialize(context);
    }

    private static final void setLocationSupport(boolean z10) {
        locationSupport = z10;
    }

    private static final void setSmsSupport(boolean z10) {
        smsSupport = z10;
    }

    private static final void setTelSupport(boolean z10) {
        telSupport = z10;
    }

    private static final void setVpaidSupported(boolean z10) {
        vpaidSupported = z10;
    }
}
