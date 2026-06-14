package io.appmetrica.analytics.impl;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.adjust.sdk.Constants;
import com.ironsource.C4257c4;
import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.appmetrica.analytics.networktasks.internal.IParamsAppender;
import io.bidmachine.ads.networks.adaptiverendering.AdaptiveRenderingConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.bm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C4998bm implements IParamsAppender {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5298ne f76926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC5496vd f76927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ob f76928c = new Ob();

    public C4998bm(@NonNull C5298ne c5298ne, @NonNull InterfaceC5496vd interfaceC5496vd) {
        this.f76926a = c5298ne;
        this.f76927b = interfaceC5496vd;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.IParamsAppender
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void appendParams(@NonNull Uri.Builder builder, @NonNull C5101fm c5101fm) {
        C5424sg c5424sg;
        builder.path("analytics/startup");
        builder.appendQueryParameter(this.f76926a.a(CommonUrlParts.DEVICE_ID), c5101fm.getDeviceId());
        a(builder, C5468ua.H.h(), this.f76928c);
        builder.appendQueryParameter(this.f76926a.a(CommonUrlParts.APP_SET_ID), c5101fm.getAppSetId());
        builder.appendQueryParameter(this.f76926a.a(CommonUrlParts.APP_SET_ID_SCOPE), c5101fm.getAppSetIdScope());
        builder.appendQueryParameter(this.f76926a.a(CommonUrlParts.APP_PLATFORM), c5101fm.getAppPlatform());
        builder.appendQueryParameter(this.f76926a.a(CommonUrlParts.PROTOCOL_VERSION), c5101fm.getProtocolVersion());
        builder.appendQueryParameter(this.f76926a.a(CommonUrlParts.ANALYTICS_SDK_VERSION_NAME), c5101fm.getAnalyticsSdkVersionName());
        builder.appendQueryParameter(this.f76926a.a("model"), c5101fm.getModel());
        builder.appendQueryParameter(this.f76926a.a(CommonUrlParts.MANUFACTURER), c5101fm.getManufacturer());
        builder.appendQueryParameter(this.f76926a.a(CommonUrlParts.OS_VERSION), c5101fm.getOsVersion());
        builder.appendQueryParameter(this.f76926a.a(CommonUrlParts.SCREEN_WIDTH), String.valueOf(c5101fm.getScreenWidth()));
        builder.appendQueryParameter(this.f76926a.a(CommonUrlParts.SCREEN_HEIGHT), String.valueOf(c5101fm.getScreenHeight()));
        builder.appendQueryParameter(this.f76926a.a(CommonUrlParts.SCREEN_DPI), String.valueOf(c5101fm.getScreenDpi()));
        builder.appendQueryParameter(this.f76926a.a(CommonUrlParts.SCALE_FACTOR), String.valueOf(c5101fm.getScaleFactor()));
        builder.appendQueryParameter(this.f76926a.a(CommonUrlParts.LOCALE), c5101fm.getLocale());
        builder.appendQueryParameter(this.f76926a.a(CommonUrlParts.DEVICE_TYPE), c5101fm.getDeviceType());
        builder.appendQueryParameter(this.f76926a.a("queries"), String.valueOf(1));
        builder.appendQueryParameter(this.f76926a.a("query_hosts"), String.valueOf(2));
        String strA = this.f76926a.a(AdaptiveRenderingConfig.NATIVE_FEATURES_KEY);
        List<String> listH = ((Ck) this.f76927b).h();
        String[] strArr = {this.f76926a.a("permissions_collecting"), this.f76926a.a("features_collecting"), this.f76926a.a("google_aid"), this.f76926a.a("huawei_oaid"), this.f76926a.a("sim_info"), this.f76926a.a("ssl_pinning")};
        ArrayList arrayList = new ArrayList(listH);
        arrayList.addAll(Arrays.asList(strArr));
        builder.appendQueryParameter(strA, StringUtils.wrapFeatures((String[]) arrayList.toArray(new String[0])));
        builder.appendQueryParameter(this.f76926a.a("app_id"), c5101fm.getPackageName());
        builder.appendQueryParameter(this.f76926a.a("app_debuggable"), ((U5) c5101fm).f76556a);
        if (c5101fm.f77181l) {
            String str = c5101fm.f77182m;
            if (!TextUtils.isEmpty(str)) {
                builder.appendQueryParameter(this.f76926a.a("country_init"), str);
            }
        } else {
            builder.appendQueryParameter(this.f76926a.a("detect_locale"), String.valueOf(1));
        }
        C5586z3 c5586z3 = c5101fm.f77178i;
        if (!no.a(c5586z3.f78603a)) {
            builder.appendQueryParameter(this.f76926a.a("distribution_customization"), String.valueOf(1));
            builder.appendQueryParameter(this.f76926a.a("clids_set"), Jm.a(c5586z3.f78603a));
            int iOrdinal = c5586z3.f78604b.ordinal();
            builder.appendQueryParameter(this.f76926a.a("clids_set_source"), iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? "" : "retail" : "satellite" : "api");
            String str2 = c5101fm.f77175f;
            String str3 = c5101fm.f77176g;
            if (TextUtils.isEmpty(str2) && (c5424sg = c5101fm.f77184o.f78081b) != null) {
                str2 = c5424sg.f78236a;
                str3 = c5424sg.f78239d.f78156a;
            }
            if (!TextUtils.isEmpty(str2)) {
                builder.appendQueryParameter(this.f76926a.a(Constants.INSTALL_REFERRER), str2);
                if (str3 == null) {
                    str3 = "null";
                }
                builder.appendQueryParameter(this.f76926a.a("install_referrer_source"), str3);
            }
        }
        String uuid = c5101fm.getUuid();
        if (!TextUtils.isEmpty(uuid)) {
            builder.appendQueryParameter(this.f76926a.a(CommonUrlParts.UUID), uuid);
        }
        builder.appendQueryParameter(this.f76926a.a("time"), String.valueOf(1));
        builder.appendQueryParameter(this.f76926a.a("stat_sending"), String.valueOf(1));
        builder.appendQueryParameter(this.f76926a.a("retry_policy"), String.valueOf(1));
        builder.appendQueryParameter(this.f76926a.a("cache_control"), String.valueOf(1));
        builder.appendQueryParameter(this.f76926a.a("permissions_collecting"), String.valueOf(1));
        builder.appendQueryParameter(this.f76926a.a("app_system_flag"), ((U5) c5101fm).f76557b);
        builder.appendQueryParameter(this.f76926a.a(C4257c4.f42799c), String.valueOf(1));
        builder.appendQueryParameter(this.f76926a.a("startup_update"), String.valueOf(1));
        builder.appendQueryParameter(this.f76926a.a("external_attribution"), String.valueOf(1));
        Map<String, Integer> mapD = ((Ck) this.f76927b).d();
        for (String str4 : mapD.keySet()) {
            builder.appendQueryParameter(str4, String.valueOf(mapD.get(str4)));
        }
    }

    public final void a(@NonNull Uri.Builder builder, @NonNull DataSendingRestrictionController dataSendingRestrictionController, @NonNull Ob ob2) {
        ob2.getClass();
        AdvertisingIdsHolder identifiers = C5468ua.H.c().getIdentifiers();
        if (identifiers != null && !dataSendingRestrictionController.isRestrictedForSdk()) {
            AdTrackingInfoResult google = identifiers.getGoogle();
            if (!google.isValid()) {
                builder.appendQueryParameter(this.f76926a.a(CommonUrlParts.ADV_ID), "");
            } else {
                builder.appendQueryParameter(this.f76926a.a(CommonUrlParts.ADV_ID), google.mAdTrackingInfo.advId);
            }
            AdTrackingInfoResult huawei = identifiers.getHuawei();
            if (!huawei.isValid()) {
                builder.appendQueryParameter(this.f76926a.a(CommonUrlParts.HUAWEI_OAID), "");
            } else {
                builder.appendQueryParameter(this.f76926a.a(CommonUrlParts.HUAWEI_OAID), huawei.mAdTrackingInfo.advId);
            }
            AdTrackingInfoResult yandex = identifiers.getYandex();
            if (!yandex.isValid()) {
                builder.appendQueryParameter(this.f76926a.a(CommonUrlParts.YANDEX_ADV_ID), "");
                return;
            } else {
                builder.appendQueryParameter(this.f76926a.a(CommonUrlParts.YANDEX_ADV_ID), yandex.mAdTrackingInfo.advId);
                return;
            }
        }
        builder.appendQueryParameter(this.f76926a.a(CommonUrlParts.ADV_ID), "");
        builder.appendQueryParameter(this.f76926a.a(CommonUrlParts.HUAWEI_OAID), "");
        builder.appendQueryParameter(this.f76926a.a(CommonUrlParts.YANDEX_ADV_ID), "");
    }
}
