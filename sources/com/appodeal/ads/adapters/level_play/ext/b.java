package com.appodeal.ads.adapters.level_play.ext;

import com.appodeal.ads.ext.JsonObjectBuilder;
import com.appodeal.ads.ext.JsonObjectBuilderKt;
import com.appodeal.ads.ext.LogExtKt;
import com.appodeal.ads.modules.common.internal.adunit.ImpressionLevelData;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.revenue.RevenuePrecision;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.Result;
import kotlin.Unit;
import kotlin.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class b {
    public static final ImpressionLevelData a(LevelPlayAdInfo levelPlayAdInfo) {
        Object objB;
        RevenuePrecision revenuePrecision;
        Intrinsics.checkNotNullParameter(levelPlayAdInfo, "<this>");
        try {
            Result.Companion companion = Result.f93230c;
            double revenue = levelPlayAdInfo.getRevenue();
            String precision = levelPlayAdInfo.getPrecision();
            Intrinsics.checkNotNullExpressionValue(precision, "getPrecision(...)");
            Double dValueOf = Double.valueOf(((double) 1000) * revenue);
            Double dValueOf2 = Double.valueOf(revenue);
            int iHashCode = precision.hashCode();
            if (iHashCode == 65757) {
                revenuePrecision = precision.equals("BID") ? RevenuePrecision.Exact : RevenuePrecision.Undefined;
                objB = Result.b(new ImpressionLevelData(null, dValueOf, dValueOf2, "USD", revenuePrecision, levelPlayAdInfo.getAdNetwork(), d(levelPlayAdInfo, revenue, precision), false, 129, null));
            } else if (iHashCode != 66944) {
                if (iHashCode == 2508000 && precision.equals("RATE")) {
                    revenuePrecision = RevenuePrecision.PublisherDefined;
                    objB = Result.b(new ImpressionLevelData(null, dValueOf, dValueOf2, "USD", revenuePrecision, levelPlayAdInfo.getAdNetwork(), d(levelPlayAdInfo, revenue, precision), false, 129, null));
                } else {
                    objB = Result.b(new ImpressionLevelData(null, dValueOf, dValueOf2, "USD", revenuePrecision, levelPlayAdInfo.getAdNetwork(), d(levelPlayAdInfo, revenue, precision), false, 129, null));
                }
            } else if (precision.equals("CPM")) {
                revenuePrecision = RevenuePrecision.Estimated;
                objB = Result.b(new ImpressionLevelData(null, dValueOf, dValueOf2, "USD", revenuePrecision, levelPlayAdInfo.getAdNetwork(), d(levelPlayAdInfo, revenue, precision), false, 129, null));
            } else {
                objB = Result.b(new ImpressionLevelData(null, dValueOf, dValueOf2, "USD", revenuePrecision, levelPlayAdInfo.getAdNetwork(), d(levelPlayAdInfo, revenue, precision), false, 129, null));
            }
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(d.a(th2));
        }
        if (Result.i(objB)) {
            objB = null;
        }
        return (ImpressionLevelData) objB;
    }

    public static final LoadingError b(LevelPlayAdError levelPlayAdError) {
        Intrinsics.checkNotNullParameter(levelPlayAdError, "<this>");
        switch (levelPlayAdError.getErrorCode()) {
            case LevelPlayAdError.ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED /* 624 */:
            case LevelPlayAdError.ERROR_CODE_INVALID_AD_UNIT_ID /* 626 */:
                return LoadingError.IncorrectAdunit;
            case LevelPlayAdError.ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK /* 625 */:
                return LoadingError.InternalError;
            case LevelPlayAdError.ERROR_CODE_LOAD_FAILED_ALREADY_CALLED /* 627 */:
                return LoadingError.RequestError;
            case LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK /* 628 */:
            case LevelPlayAdError.ERROR_CODE_LOAD_WHILE_SHOW /* 629 */:
            case LevelPlayAdError.ERROR_CODE_SHOW_WHILE_SHOW /* 630 */:
            case LevelPlayAdError.ERROR_CODE_SHOW_WHILE_LOAD /* 631 */:
                return LoadingError.ShowFailed;
            default:
                return LoadingError.NoFill;
        }
    }

    public static final Unit c(LevelPlayAdInfo levelPlayAdInfo, double d10, String str, JsonObjectBuilder jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "$this$jsonObject");
        try {
            Result.Companion companion = Result.f93230c;
            jsonObject.hasValue("ad_unit_id", levelPlayAdInfo.getAdUnitId());
            jsonObject.hasValue(FirebaseAnalytics.Param.AD_UNIT_NAME, levelPlayAdInfo.getAdUnitName());
            jsonObject.hasValue(Reporting.Key.AD_SIZE, levelPlayAdInfo.getAdSize());
            jsonObject.hasValue("ad_format", levelPlayAdInfo.getAdFormat());
            jsonObject.hasValue("placement_name", levelPlayAdInfo.getPlacementName());
            jsonObject.hasValue("auction_id", levelPlayAdInfo.getAuctionId());
            jsonObject.hasValue("country", levelPlayAdInfo.getCountry());
            jsonObject.hasValue("ab", levelPlayAdInfo.getAb());
            jsonObject.hasValue("segment_name", levelPlayAdInfo.getSegmentName());
            jsonObject.hasValue("ad_network", levelPlayAdInfo.getAdNetwork());
            jsonObject.hasValue("instance_name", levelPlayAdInfo.getInstanceName());
            jsonObject.hasValue("instance_id", levelPlayAdInfo.getInstanceId());
            jsonObject.hasValue("revenue", Double.valueOf(d10));
            jsonObject.hasValue("precision", str);
            jsonObject.hasValue("encrypted_ecpm", levelPlayAdInfo.getEncryptedCPM());
            jsonObject.hasValue("creative_id", levelPlayAdInfo.getCreativeId());
            Result.b(Unit.f93236a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            Result.b(d.a(th2));
        }
        return Unit.f93236a;
    }

    public static final JSONObject d(final LevelPlayAdInfo levelPlayAdInfo, final double d10, final String str) {
        JSONObject jsonObject = JsonObjectBuilderKt.jsonObject(new Function1() { // from class: com.appodeal.ads.adapters.level_play.ext.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b.c(levelPlayAdInfo, d10, str, (JsonObjectBuilder) obj);
            }
        });
        String string = jsonObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        LogExtKt.logInternal$default("LevelPlayAdExt", string, null, 4, null);
        return jsonObject;
    }
}
