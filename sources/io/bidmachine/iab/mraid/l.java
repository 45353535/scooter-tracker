package io.bidmachine.iab.mraid;

import net.pubnative.lite.sdk.mraid.MRAIDNativeFeature;

/* JADX INFO: loaded from: classes12.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f80239a;

    l(k kVar) {
        this.f80239a = kVar;
    }

    boolean a(String str) {
        if (str == null) {
            return true;
        }
        if (str.startsWith(MRAIDNativeFeature.SMS)) {
            return this.f80239a.d();
        }
        if (str.startsWith(MRAIDNativeFeature.TEL)) {
            return this.f80239a.f();
        }
        if (str.startsWith(MRAIDNativeFeature.CALENDAR)) {
            return this.f80239a.b();
        }
        if (str.startsWith(MRAIDNativeFeature.STORE_PICTURE)) {
            return this.f80239a.e();
        }
        return true;
    }
}
