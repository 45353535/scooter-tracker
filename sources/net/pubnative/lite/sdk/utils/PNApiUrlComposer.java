package net.pubnative.lite.sdk.utils;

import android.net.Uri;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.applovin.impl.uc;
import com.ironsource.D5;
import com.ironsource.N6;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.bidmachine.ProtoExtConstants;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.pubnative.lite.sdk.models.PNAdRequest;
import net.pubnative.lite.sdk.models.Topic;
import net.pubnative.lite.sdk.models.bidstream.BidParam;
import net.pubnative.lite.sdk.models.bidstream.Signal;

/* JADX INFO: loaded from: classes3.dex */
public final class PNApiUrlComposer {
    private static Uri buildUri(String str, PNAdRequest pNAdRequest) {
        String strValueOf;
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        builderBuildUpon.appendPath("api");
        builderBuildUpon.appendPath("v3");
        builderBuildUpon.appendPath("native");
        if (!TextUtils.isEmpty(pNAdRequest.appToken)) {
            builderBuildUpon.appendQueryParameter("apptoken", pNAdRequest.appToken);
        }
        if (!TextUtils.isEmpty(pNAdRequest.os)) {
            builderBuildUpon.appendQueryParameter("os", pNAdRequest.os);
        }
        if (!TextUtils.isEmpty(pNAdRequest.osver)) {
            builderBuildUpon.appendQueryParameter("osver", pNAdRequest.osver);
        }
        if (!TextUtils.isEmpty(pNAdRequest.devicemodel)) {
            builderBuildUpon.appendQueryParameter(D5.f40567n, pNAdRequest.devicemodel);
        }
        if (!TextUtils.isEmpty(pNAdRequest.make)) {
            builderBuildUpon.appendQueryParameter(N6.f41422t, pNAdRequest.make);
        }
        if (!TextUtils.isEmpty(pNAdRequest.deviceHeight)) {
            builderBuildUpon.appendQueryParameter("dh", pNAdRequest.deviceHeight);
        }
        if (!TextUtils.isEmpty(pNAdRequest.deviceWidth)) {
            builderBuildUpon.appendQueryParameter("dw", pNAdRequest.deviceWidth);
        }
        if (!TextUtils.isEmpty(pNAdRequest.orientation)) {
            builderBuildUpon.appendQueryParameter("scro", pNAdRequest.orientation);
        }
        if (!TextUtils.isEmpty(pNAdRequest.ppi)) {
            builderBuildUpon.appendQueryParameter("ppi", pNAdRequest.ppi);
        }
        if (!TextUtils.isEmpty(pNAdRequest.pxratio)) {
            builderBuildUpon.appendQueryParameter("pxratio", pNAdRequest.pxratio);
        }
        if (!TextUtils.isEmpty(pNAdRequest.js)) {
            builderBuildUpon.appendQueryParameter("js", pNAdRequest.js);
        }
        if (!TextUtils.isEmpty(pNAdRequest.soundSetting)) {
            builderBuildUpon.appendQueryParameter("aud", pNAdRequest.soundSetting);
        }
        if (!TextUtils.isEmpty(pNAdRequest.dnt)) {
            builderBuildUpon.appendQueryParameter("dnt", pNAdRequest.dnt);
        }
        if (!TextUtils.isEmpty(pNAdRequest.al)) {
            builderBuildUpon.appendQueryParameter(CampaignEx.JSON_KEY_AD_AL, pNAdRequest.al);
        }
        if (!TextUtils.isEmpty(pNAdRequest.width)) {
            builderBuildUpon.appendQueryParameter(POBCoreNativeConstants.NATIVE_IMAGE_WIDTH, pNAdRequest.width);
        }
        if (!TextUtils.isEmpty(pNAdRequest.height)) {
            builderBuildUpon.appendQueryParameter("h", pNAdRequest.height);
        }
        if (!TextUtils.isEmpty(pNAdRequest.f95870mf)) {
            builderBuildUpon.appendQueryParameter("mf", pNAdRequest.f95870mf);
        }
        if (!TextUtils.isEmpty(pNAdRequest.f95869af)) {
            builderBuildUpon.appendQueryParameter(ApsMetricsDataMap.APSMETRICS_FIELD_ADFORMAT, pNAdRequest.f95869af);
        }
        if (!TextUtils.isEmpty(pNAdRequest.zoneId)) {
            builderBuildUpon.appendQueryParameter("zoneid", pNAdRequest.zoneId);
        }
        if (!TextUtils.isEmpty(pNAdRequest.testMode)) {
            builderBuildUpon.appendQueryParameter("test", pNAdRequest.testMode);
        }
        if (!TextUtils.isEmpty(pNAdRequest.locale)) {
            builderBuildUpon.appendQueryParameter(CommonUrlParts.LOCALE, pNAdRequest.locale);
        }
        if (!TextUtils.isEmpty(pNAdRequest.language)) {
            builderBuildUpon.appendQueryParameter("language", pNAdRequest.language);
        }
        if (!TextUtils.isEmpty(pNAdRequest.langb)) {
            builderBuildUpon.appendQueryParameter("langb", pNAdRequest.langb);
        }
        if (!TextUtils.isEmpty(pNAdRequest.latitude)) {
            builderBuildUpon.appendQueryParameter(N6.f41419s, pNAdRequest.latitude);
        }
        if (!TextUtils.isEmpty(pNAdRequest.longitude)) {
            builderBuildUpon.appendQueryParameter(Constants.LONG, pNAdRequest.longitude);
        }
        if (!TextUtils.isEmpty(pNAdRequest.gender)) {
            builderBuildUpon.appendQueryParameter("gender", pNAdRequest.gender);
        }
        if (!TextUtils.isEmpty(pNAdRequest.age)) {
            builderBuildUpon.appendQueryParameter("age", pNAdRequest.age);
        }
        if (!TextUtils.isEmpty(pNAdRequest.bundleid)) {
            builderBuildUpon.appendQueryParameter("bundleid", pNAdRequest.bundleid);
        }
        if (!TextUtils.isEmpty(pNAdRequest.keywords)) {
            builderBuildUpon.appendQueryParameter("keywords", pNAdRequest.keywords);
        }
        if (!TextUtils.isEmpty(pNAdRequest.coppa)) {
            builderBuildUpon.appendQueryParameter("coppa", pNAdRequest.coppa);
        }
        if (!TextUtils.isEmpty(pNAdRequest.gid)) {
            builderBuildUpon.appendQueryParameter("gid", pNAdRequest.gid);
        }
        if (!TextUtils.isEmpty(pNAdRequest.gidmd5)) {
            builderBuildUpon.appendQueryParameter("gidmd5", pNAdRequest.gidmd5);
        }
        if (!TextUtils.isEmpty(pNAdRequest.gidsha1)) {
            builderBuildUpon.appendQueryParameter("gidsha1", pNAdRequest.gidsha1);
        }
        if (!TextUtils.isEmpty(pNAdRequest.displaymanager)) {
            builderBuildUpon.appendQueryParameter("displaymanager", pNAdRequest.displaymanager);
        }
        if (!TextUtils.isEmpty(pNAdRequest.displaymanagerver)) {
            builderBuildUpon.appendQueryParameter("displaymanagerver", pNAdRequest.displaymanagerver);
        }
        if (!TextUtils.isEmpty(pNAdRequest.omidpn)) {
            builderBuildUpon.appendQueryParameter(ProtoExtConstants.Source.OMID_PN, pNAdRequest.omidpn);
        }
        if (!TextUtils.isEmpty(pNAdRequest.omidpv)) {
            builderBuildUpon.appendQueryParameter(ProtoExtConstants.Source.OMID_PV, pNAdRequest.omidpv);
        }
        if (!TextUtils.isEmpty(pNAdRequest.rv)) {
            builderBuildUpon.appendQueryParameter("rv", pNAdRequest.rv);
        }
        if (!TextUtils.isEmpty(pNAdRequest.usprivacy)) {
            builderBuildUpon.appendQueryParameter("usprivacy", pNAdRequest.usprivacy);
        }
        if (!TextUtils.isEmpty(pNAdRequest.userconsent)) {
            builderBuildUpon.appendQueryParameter("userconsent", pNAdRequest.userconsent);
        }
        if (!TextUtils.isEmpty(pNAdRequest.gppstring)) {
            builderBuildUpon.appendQueryParameter(EidRequestBuilder.REQUEST_FIELD_GPP, pNAdRequest.gppstring);
        }
        if (!TextUtils.isEmpty(pNAdRequest.gppsid)) {
            builderBuildUpon.appendQueryParameter("gppsid", pNAdRequest.gppsid);
        }
        if (!TextUtils.isEmpty(pNAdRequest.carrier)) {
            builderBuildUpon.appendQueryParameter(N6.Q0, pNAdRequest.carrier);
        }
        if (!TextUtils.isEmpty(pNAdRequest.connectiontype)) {
            builderBuildUpon.appendQueryParameter(D5.f40558e, pNAdRequest.connectiontype);
        }
        if (!TextUtils.isEmpty(pNAdRequest.mccmnc)) {
            builderBuildUpon.appendQueryParameter("mccmnc", pNAdRequest.mccmnc);
        }
        if (!TextUtils.isEmpty(pNAdRequest.mccmncsim)) {
            builderBuildUpon.appendQueryParameter("mccmncsim", pNAdRequest.mccmncsim);
        }
        if (!TextUtils.isEmpty(pNAdRequest.geofetch)) {
            builderBuildUpon.appendQueryParameter("geofetch", pNAdRequest.geofetch);
        }
        if (!TextUtils.isEmpty(pNAdRequest.sua)) {
            builderBuildUpon.appendQueryParameter("sua", pNAdRequest.sua);
        }
        if (!TextUtils.isEmpty(pNAdRequest.f95868ae)) {
            builderBuildUpon.appendQueryParameter(ApsMetricsDataMap.APSMETRICS_FIELD_ADAPTEREVENT, pNAdRequest.f95868ae);
        }
        if (!TextUtils.isEmpty(pNAdRequest.protocol)) {
            builderBuildUpon.appendQueryParameter("protocol", pNAdRequest.protocol);
        }
        if (!TextUtils.isEmpty(pNAdRequest.api)) {
            builderBuildUpon.appendQueryParameter("api", pNAdRequest.api);
        }
        if (!TextUtils.isEmpty(pNAdRequest.impdepth)) {
            builderBuildUpon.appendQueryParameter("impdepth", pNAdRequest.impdepth);
        }
        if (!TextUtils.isEmpty(pNAdRequest.ageofapp)) {
            builderBuildUpon.appendQueryParameter("ageofapp", pNAdRequest.ageofapp);
        }
        if (!TextUtils.isEmpty(pNAdRequest.sessionduration)) {
            builderBuildUpon.appendQueryParameter("sessionduration", pNAdRequest.sessionduration);
        }
        String strConcat = "";
        if (!pNAdRequest.getSignals().isEmpty()) {
            for (Signal signal : pNAdRequest.getSignals()) {
                for (Field field : signal.getClass().getDeclaredFields()) {
                    BidParam bidParam = (BidParam) field.getAnnotation(BidParam.class);
                    if (bidParam != null) {
                        try {
                            if (Iterable.class.isAssignableFrom(field.getType())) {
                                String strValueOf2 = String.valueOf(field.get(signal));
                                strValueOf = strValueOf2.substring(1, strValueOf2.length() - 1).replaceAll("\\s+", "");
                            } else {
                                strValueOf = String.valueOf(field.get(signal));
                            }
                            if (!TextUtils.isEmpty(strValueOf) && !strValueOf.equals("null") && !TextUtils.isEmpty(bidParam.name())) {
                                builderBuildUpon.appendQueryParameter(bidParam.name(), strValueOf);
                            }
                        } catch (IllegalAccessException unused) {
                        }
                    }
                }
            }
        }
        List<Topic> list = pNAdRequest.topics;
        if (list != null && !list.isEmpty()) {
            HashMap map = new HashMap();
            for (Topic topic : pNAdRequest.topics) {
                String strConcat2 = String.valueOf(topic.getTaxonomyVersion()).concat(StringUtils.COMMA).concat(topic.getTaxonomyVersionName().replaceAll("\\s", "+"));
                if (!map.containsKey(strConcat2)) {
                    map.put(strConcat2, new ArrayList());
                }
                ArrayList arrayList = (ArrayList) map.get(strConcat2);
                Objects.requireNonNull(arrayList);
                arrayList.add(String.valueOf(topic.getId()));
            }
            for (Map.Entry entry : map.entrySet()) {
                strConcat = strConcat.concat((String) entry.getKey()).concat(StringUtils.COMMA).concat(uc.a(StringUtils.COMMA, (ArrayList) entry.getValue())).concat("_");
            }
            builderBuildUpon.appendQueryParameter("psut", strConcat.substring(0, strConcat.length() - 1));
        }
        if (!TextUtils.isEmpty(pNAdRequest.f95871vg)) {
            builderBuildUpon.appendQueryParameter("vg", pNAdRequest.f95871vg);
        }
        if (!TextUtils.isEmpty(pNAdRequest.hver)) {
            builderBuildUpon.appendQueryParameter("hver", pNAdRequest.hver);
        }
        return builderBuildUpon.build();
    }

    public static String buildUrl(String str, PNAdRequest pNAdRequest) {
        return buildUri(str, pNAdRequest).toString();
    }

    public static String getUrlQuery(String str, PNAdRequest pNAdRequest) {
        return buildUri(str, pNAdRequest).getQuery();
    }
}
