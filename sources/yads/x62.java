package yads;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* JADX INFO: loaded from: classes4.dex */
public final class x62 extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b72 f117729a;

    public x62(b72 b72Var) {
        this.f117729a = b72Var;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        this.f117729a.a(overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
    }
}
