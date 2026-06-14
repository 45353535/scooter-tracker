package net.pubnative.lite.sdk.mraid.internal;

import android.content.Context;
import java.util.ArrayList;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.mraid.MRAIDNativeFeature;

/* JADX INFO: loaded from: classes3.dex */
public class MRAIDNativeFeatureManager {
    private static final String TAG = "MRAIDNativeFeatureManager";
    private final Context context;
    private final ArrayList<String> supportedNativeFeatures;

    public MRAIDNativeFeatureManager(Context context, ArrayList<String> arrayList) {
        this.context = context;
        this.supportedNativeFeatures = arrayList;
    }

    public ArrayList<String> getSupportedNativeFeatures() {
        return this.supportedNativeFeatures;
    }

    public boolean isCalendarSupported() {
        boolean z10 = this.supportedNativeFeatures.contains(MRAIDNativeFeature.CALENDAR) && this.context.checkCallingOrSelfPermission("android.permission.WRITE_CALENDAR") == 0;
        MRAIDLog.d(TAG, "isCalendarSupported " + z10);
        return z10;
    }

    public boolean isInlineVideoSupported() {
        boolean zContains = this.supportedNativeFeatures.contains(MRAIDNativeFeature.INLINE_VIDEO);
        MRAIDLog.d(TAG, "isInlineVideoSupported " + zContains);
        return zContains;
    }

    public boolean isLocationSupported() {
        boolean z10 = this.supportedNativeFeatures.contains("location") && HyBid.isLocationTrackingEnabled() && (this.context.checkCallingOrSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0 || this.context.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0);
        MRAIDLog.d(TAG, "isLocationSupported " + z10);
        return z10;
    }

    public boolean isSmsSupported() {
        boolean z10 = this.supportedNativeFeatures.contains(MRAIDNativeFeature.SMS) && this.context.checkCallingOrSelfPermission("android.permission.SEND_SMS") == 0;
        MRAIDLog.d(TAG, "isSmsSupported " + z10);
        return z10;
    }

    public boolean isStorePictureSupported() {
        boolean zContains = this.supportedNativeFeatures.contains(MRAIDNativeFeature.STORE_PICTURE);
        MRAIDLog.d(TAG, "isStorePictureSupported " + zContains);
        return zContains;
    }

    public boolean isTelSupported() {
        boolean z10 = this.supportedNativeFeatures.contains(MRAIDNativeFeature.TEL) && this.context.checkCallingOrSelfPermission("android.permission.CALL_PHONE") == 0;
        MRAIDLog.d(TAG, "isTelSupported " + z10);
        return z10;
    }
}
