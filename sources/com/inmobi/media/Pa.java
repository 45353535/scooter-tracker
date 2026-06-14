package com.inmobi.media;

import android.os.SystemClock;
import com.adjust.sdk.Constants;
import com.amazon.device.ads.DtbConstants;
import com.inmobi.media.core.config.models.TelemetryConfig;
import java.util.LinkedHashMap;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Pa {
    public static void a(Na funnelState, Ya ya2, Integer num, Function2 function2) {
        Intrinsics.checkNotNullParameter(funnelState, "funnelState");
        if (ya2 == null || funnelState.f37440c <= ya2.f38041e) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("plType", ya2.f38037a.f38108c);
        linkedHashMap.put("impressionId", ya2.f38037a.f38107b);
        linkedHashMap.put("plId", Long.valueOf(ya2.f38037a.f38106a));
        linkedHashMap.put("adType", ya2.f38037a.f38109d);
        linkedHashMap.put("markupType", ya2.f38037a.f38110e);
        linkedHashMap.put("creativeType", ya2.f38037a.f38111f);
        linkedHashMap.put("metadataBlob", ya2.f38037a.f38112g);
        linkedHashMap.put("isRewarded", Boolean.valueOf(ya2.f38037a.f38113h));
        String str = ya2.f38042f;
        if (str == null) {
            str = ya2.f38037a.f38114i;
        }
        linkedHashMap.put("trigger", str);
        linkedHashMap.put("urlType", ya2.f38038b);
        if (num != null) {
            linkedHashMap.put("errorCode", num);
        }
        long j10 = ya2.f38040d;
        if (j10 != 0) {
            CoroutineScope coroutineScope = AbstractC3790il.f38771a;
            linkedHashMap.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
        }
        ya2.f38041e = funnelState.f37440c;
        eg.i.d(A9.f36557c, null, null, new Oa(linkedHashMap, funnelState, null), 3, null);
        int i10 = ya2.f38039c;
        C3774i4 c3774i4 = Y3.f38021a;
        Intrinsics.checkNotNullParameter(TelemetryConfig.class, "clazz");
        if (i10 > ((TelemetryConfig) Y3.f38021a.a(TelemetryConfig.class)).getLpConfig().getMaxFunnelsToTrackPerAd() || function2 == null) {
            return;
        }
        String str2 = funnelState.f37439b;
        String str3 = ya2.f38042f;
        if (str3 == null) {
            str3 = ya2.f38037a.f38114i;
        }
        function2.invoke(str2, MapsKt.mapOf(TuplesKt.to("$OPENMODE", str3), TuplesKt.to("$URLTYPE", ya2.f38038b)));
    }

    public static String a(String str) {
        if (str == null || str.length() == 0 || !StringsKt.g0(str, "://", false, 2, null)) {
            return "invalid";
        }
        if (StringsKt.Y(str, "inmobideeplink://", true)) {
            return "inmobideeplink";
        }
        if (StringsKt.Y(str, "inmobinativebrowser://", true)) {
            return "inmobinativebrowser";
        }
        if (StringsKt.Y(str, DtbConstants.HTTPS, true)) {
            return "https";
        }
        if (StringsKt.Y(str, "http://", true)) {
            return "http";
        }
        return StringsKt.Y(str, com.taurusx.tax.g.f0.f66125c, true) ? "market" : Constants.DEEPLINK;
    }
}
