package com.appodeal.ads.adapters.bidon.ext;

import com.appodeal.ads.ext.JsonArrayBuilder;
import com.appodeal.ads.ext.JsonObjectBuilder;
import com.appodeal.ads.ext.JsonObjectBuilderKt;
import com.appodeal.ads.modules.common.internal.adunit.ImpressionLevelData;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.revenue.RevenuePrecision;
import com.appodeal.ads.utils.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.bidon.sdk.ads.Ad;
import org.bidon.sdk.ads.AdUnitInfo;
import org.bidon.sdk.ads.AuctionInfo;
import org.bidon.sdk.config.BidonError;
import org.bidon.sdk.logs.analytic.AdValue;
import org.bidon.sdk.logs.analytic.Precision;
import org.bidon.sdk.stats.models.BidType;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class f {
    public static final ImpressionLevelData a(final Ad ad2, AdValue adValue, boolean z10) {
        String currencyCode;
        RevenuePrecision revenuePrecision;
        Precision precision;
        Intrinsics.checkNotNullParameter(ad2, "<this>");
        try {
            double adRevenue = adValue != null ? adValue.getAdRevenue() * ((double) 1000) : ad2.getPrice();
            double adRevenue2 = adValue != null ? adValue.getAdRevenue() : ad2.getPrice() / 1000;
            if (adValue == null || (currencyCode = adValue.getCurrency()) == null) {
                currencyCode = ad2.getCurrencyCode();
            }
            String str = currencyCode;
            if (adValue == null || (precision = adValue.getPrecision()) == null) {
                revenuePrecision = null;
            } else {
                int i10 = a.f12124a[precision.ordinal()];
                revenuePrecision = i10 != 1 ? i10 != 2 ? RevenuePrecision.Undefined : RevenuePrecision.Estimated : RevenuePrecision.Exact;
            }
            return new ImpressionLevelData(null, Double.valueOf(adRevenue), Double.valueOf(adRevenue2), str, revenuePrecision, ad2.getNetworkName(), JsonObjectBuilderKt.jsonObject(new Function1() { // from class: com.appodeal.ads.adapters.bidon.ext.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return f.d(ad2, (JsonObjectBuilder) obj);
                }
            }), z10, 1, null);
        } catch (Exception e10) {
            Log.log(e10);
            return null;
        }
    }

    public static final LoadingError b(BidonError bidonError) {
        Intrinsics.checkNotNullParameter(bidonError, "<this>");
        if (bidonError instanceof BidonError.AdFormatIsNotSupported) {
            return LoadingError.AdTypeNotSupportedInAdapter;
        }
        if ((bidonError instanceof BidonError.FillTimedOut) || (bidonError instanceof BidonError.BidTimedOut)) {
            return LoadingError.TimeoutError;
        }
        if (bidonError instanceof BidonError.Expired) {
            return LoadingError.RequestVerificationFailed;
        }
        if (bidonError instanceof BidonError.InternalServerSdkError) {
            return LoadingError.ServerError;
        }
        if (bidonError instanceof BidonError.NetworkError) {
            return LoadingError.ConnectionError;
        }
        if (Intrinsics.areEqual(bidonError, BidonError.NoAppropriateAdUnitId.INSTANCE) || Intrinsics.areEqual(bidonError, BidonError.AppKeyIsInvalid.INSTANCE)) {
            return LoadingError.IncorrectAdunit;
        }
        if ((bidonError instanceof BidonError.NoBid) || (bidonError instanceof BidonError.NoFill) || Intrinsics.areEqual(bidonError, BidonError.NoRoundResults.INSTANCE) || Intrinsics.areEqual(bidonError, BidonError.NoAuctionResults.INSTANCE)) {
            return LoadingError.NoFill;
        }
        if (Intrinsics.areEqual(bidonError, BidonError.AuctionInProgress.INSTANCE) || Intrinsics.areEqual(bidonError, BidonError.AdNotReady.INSTANCE) || (bidonError instanceof BidonError.Unspecified) || Intrinsics.areEqual(bidonError, BidonError.NoContextFound.INSTANCE) || Intrinsics.areEqual(bidonError, BidonError.SdkNotInitialized.INSTANCE)) {
            return LoadingError.InternalError;
        }
        if (Intrinsics.areEqual(bidonError, BidonError.AuctionCancelled.INSTANCE)) {
            return LoadingError.Canceled;
        }
        if (bidonError instanceof BidonError.IncorrectAdUnit) {
            return LoadingError.IncorrectAdunit;
        }
        throw new m();
    }

    public static final String c(final AuctionInfo auctionInfo) {
        Intrinsics.checkNotNullParameter(auctionInfo, "<this>");
        String string = JsonObjectBuilderKt.jsonObject(new Function1() { // from class: com.appodeal.ads.adapters.bidon.ext.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f.g(auctionInfo, (JsonObjectBuilder) obj);
            }
        }).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static final Unit d(Ad ad2, JsonObjectBuilder jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "$this$jsonObject");
        jsonObject.hasValue("network_name", ad2.getNetworkName());
        jsonObject.hasValue("dsp_name", ad2.getDsp());
        jsonObject.hasValue("ad_unit_id", ad2.getAdUnit().getUid());
        jsonObject.hasObject("credentials", ad2.getAdUnit().getExtra());
        return Unit.f93236a;
    }

    public static final Unit e(AdUnitInfo adUnitInfo, JsonObjectBuilder jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "$this$jsonObject");
        try {
            Result.Companion companion = Result.f93230c;
            jsonObject.hasValue("network_name", adUnitInfo.getDemandId());
            jsonObject.hasValue("ad_load_state", adUnitInfo.getStatus());
            jsonObject.hasValue("bidding", Boolean.valueOf(Intrinsics.areEqual(adUnitInfo.getBidType(), BidType.RTB.getCode())));
            Long fillStartTs = adUnitInfo.getFillStartTs();
            Long fillFinishTs = adUnitInfo.getFillFinishTs();
            jsonObject.hasValue("latency", (fillStartTs == null || fillFinishTs == null) ? null : Long.valueOf((fillFinishTs.longValue() - fillStartTs.longValue()) / ((long) 1000)));
            String ext = adUnitInfo.getExt();
            if (ext == null) {
                ext = "";
            }
            jsonObject.hasObject("credentials", new JSONObject(ext));
            Result.b(Unit.f93236a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            Result.b(kotlin.d.a(th2));
        }
        return Unit.f93236a;
    }

    public static final Unit f(AuctionInfo auctionInfo, JsonArrayBuilder jsonArray) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(jsonArray, "$this$jsonArray");
        List<AdUnitInfo> adUnits = auctionInfo.getAdUnits();
        ArrayList arrayList2 = null;
        if (adUnits != null) {
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(adUnits, 10));
            Iterator<T> it = adUnits.iterator();
            while (it.hasNext()) {
                arrayList.add(h((AdUnitInfo) it.next()));
            }
        } else {
            arrayList = null;
        }
        jsonArray.putValues(arrayList);
        List<AdUnitInfo> noBids = auctionInfo.getNoBids();
        if (noBids != null) {
            arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(noBids, 10));
            Iterator<T> it2 = noBids.iterator();
            while (it2.hasNext()) {
                arrayList2.add(h((AdUnitInfo) it2.next()));
            }
        }
        jsonArray.putValues(arrayList2);
        return Unit.f93236a;
    }

    public static final Unit g(final AuctionInfo auctionInfo, JsonObjectBuilder jsonObject) {
        Long l10;
        Long l11;
        Intrinsics.checkNotNullParameter(jsonObject, "$this$jsonObject");
        try {
            Result.Companion companion = Result.f93230c;
            List<AdUnitInfo> adUnits = auctionInfo.getAdUnits();
            Long lValueOf = null;
            if (adUnits != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = adUnits.iterator();
                while (it.hasNext()) {
                    Long fillFinishTs = ((AdUnitInfo) it.next()).getFillFinishTs();
                    if (fillFinishTs != null) {
                        arrayList.add(fillFinishTs);
                    }
                }
                l10 = (Long) CollectionsKt.maxOrNull((Iterable) arrayList);
            } else {
                l10 = null;
            }
            List<AdUnitInfo> adUnits2 = auctionInfo.getAdUnits();
            if (adUnits2 != null) {
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it2 = adUnits2.iterator();
                while (it2.hasNext()) {
                    Long fillStartTs = ((AdUnitInfo) it2.next()).getFillStartTs();
                    if (fillStartTs != null) {
                        arrayList2.add(fillStartTs);
                    }
                }
                l11 = (Long) CollectionsKt.minOrNull((Iterable) arrayList2);
            } else {
                l11 = null;
            }
            jsonObject.hasValue("waterfall_name", auctionInfo.getAuctionConfigurationUid());
            if (l11 != null && l10 != null) {
                lValueOf = Long.valueOf((l10.longValue() - l11.longValue()) / ((long) 1000));
            }
            jsonObject.hasValue("waterfall_latency", lValueOf);
            jsonObject.hasArray("network_responses", JsonObjectBuilderKt.jsonArray(new Function1() { // from class: com.appodeal.ads.adapters.bidon.ext.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return f.f(auctionInfo, (JsonArrayBuilder) obj);
                }
            }));
            Result.b(Unit.f93236a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            Result.b(kotlin.d.a(th2));
        }
        return Unit.f93236a;
    }

    public static final JSONObject h(final AdUnitInfo adUnitInfo) {
        return JsonObjectBuilderKt.jsonObject(new Function1() { // from class: com.appodeal.ads.adapters.bidon.ext.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f.e(adUnitInfo, (JsonObjectBuilder) obj);
            }
        });
    }

    public static final JSONObject i(JSONObject jSONObject, String idfa) throws JSONException {
        Intrinsics.checkNotNullParameter(idfa, "idfa");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject.put("appodeal_idfa", idfa);
        return jSONObject;
    }
}
