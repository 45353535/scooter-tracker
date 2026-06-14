package com.appodeal.ads.services.adjust.collector;

import com.adjust.sdk.AdjustAttribution;
import com.appodeal.ads.ext.MapExtKt;
import com.appodeal.ads.modules.common.internal.service.ServiceData;
import com.taurusx.tax.y.z.w.z;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.analytics.Reporting;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdjustAttribution f14531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14532b;

    public a(AdjustAttribution attribution, String attributionId) {
        Intrinsics.checkNotNullParameter(attribution, "attribution");
        Intrinsics.checkNotNullParameter(attributionId, "attributionId");
        this.f14531a = attribution;
        this.f14532b = attributionId;
    }

    public final ServiceData.Adjust a() {
        String str = this.f14532b;
        AdjustAttribution adjustAttribution = this.f14531a;
        Intrinsics.checkNotNullParameter(adjustAttribution, "<this>");
        String str2 = adjustAttribution.trackerToken;
        if (str2 == null || str2.length() <= 0) {
            str2 = null;
        }
        Pair pair = TuplesKt.to("tracker_token", str2);
        String str3 = adjustAttribution.trackerName;
        if (str3 == null || str3.length() <= 0) {
            str3 = null;
        }
        Pair pair2 = TuplesKt.to("tracker_name", str3);
        String str4 = adjustAttribution.network;
        if (str4 == null || str4.length() <= 0) {
            str4 = null;
        }
        Pair pair3 = TuplesKt.to("network", str4);
        String str5 = adjustAttribution.campaign;
        if (str5 == null || str5.length() <= 0) {
            str5 = null;
        }
        Pair pair4 = TuplesKt.to("campaign", str5);
        String str6 = adjustAttribution.adgroup;
        if (str6 == null || str6.length() <= 0) {
            str6 = null;
        }
        Pair pair5 = TuplesKt.to("adgroup", str6);
        String str7 = adjustAttribution.creative;
        if (str7 == null || str7.length() <= 0) {
            str7 = null;
        }
        Pair pair6 = TuplesKt.to(Reporting.Key.CREATIVE, str7);
        String str8 = adjustAttribution.clickLabel;
        if (str8 == null || str8.length() <= 0) {
            str8 = null;
        }
        Pair pair7 = TuplesKt.to("click_label", str8);
        Pair pair8 = TuplesKt.to(z.C0835z.f67724y, (str == null || str.length() <= 0) ? null : str);
        String str9 = adjustAttribution.costType;
        if (str9 == null || str9.length() <= 0) {
            str9 = null;
        }
        Pair pair9 = TuplesKt.to("cost_type", str9);
        Double d10 = adjustAttribution.costAmount;
        if (d10 == null || Double.isNaN(d10.doubleValue())) {
            d10 = null;
        }
        Pair pair10 = TuplesKt.to("cost_amount", d10);
        String str10 = adjustAttribution.costCurrency;
        if (str10 == null || str10.length() <= 0) {
            str10 = null;
        }
        Pair pair11 = TuplesKt.to("cost_currency", str10);
        String str11 = adjustAttribution.fbInstallReferrer;
        if (str11 == null || str11.length() <= 0) {
            str11 = null;
        }
        return new ServiceData.Adjust(str, MapExtKt.filterNotNullValues(MapsKt.mapOf(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, TuplesKt.to("fb_install_referrer", str11))));
    }

    public final AdjustAttribution b() {
        return this.f14531a;
    }

    public final String c() {
        return this.f14532b;
    }
}
