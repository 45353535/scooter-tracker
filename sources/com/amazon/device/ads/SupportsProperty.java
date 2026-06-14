package com.amazon.device.ads;

import net.pubnative.lite.sdk.mraid.MRAIDNativeFeature;

/* JADX INFO: loaded from: classes5.dex */
class SupportsProperty extends MraidDictionaryProperty {
    SupportsProperty() {
        super("supports");
        try {
            this.data.put(MRAIDNativeFeature.TEL, SDKUtilities.isTelSupported());
            this.data.put(MRAIDNativeFeature.SMS, false);
            this.data.put(MRAIDNativeFeature.CALENDAR, false);
            this.data.put(MRAIDNativeFeature.STORE_PICTURE, false);
            this.data.put(MRAIDNativeFeature.INLINE_VIDEO, false);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
