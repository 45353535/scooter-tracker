package org.bidon.sdk.auction.models;

import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v0;
import org.bidon.sdk.utils.json.JsonParser;
import org.bidon.sdk.utils.json.JsonParsers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lorg/bidon/sdk/auction/models/AuctionResponseParser;", "Lorg/bidon/sdk/utils/json/JsonParser;", "Lorg/bidon/sdk/auction/models/AuctionResponse;", "<init>", "()V", "parseOrNull", "jsonString", "", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AuctionResponseParser implements JsonParser<AuctionResponse> {
    @Override // org.bidon.sdk.utils.json.JsonParser
    @Nullable
    public AuctionResponse parseOrNull(@NotNull String jsonString) {
        Object objB;
        List listBuild;
        List listBuild2;
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        try {
            Result.Companion companion = Result.f93230c;
            JSONObject jSONObject = new JSONObject(jsonString);
            JsonParsers jsonParsers = JsonParsers.INSTANCE;
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("ad_units");
            if (jSONArrayOptJSONArray == null) {
                listBuild = null;
            } else {
                Object obj = JsonParsers.parsersFactories.get(v0.b(AdUnit.class));
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.bidon.sdk.utils.json.JsonParsers.ParserFactory<T of org.bidon.sdk.utils.json.JsonParsers.parseList>");
                JsonParser parserFactory = ((JsonParsers.ParserFactory) obj).getInstance();
                List listCreateListBuilder = CollectionsKt.createListBuilder();
                int length = jSONArrayOptJSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    String string = jSONArrayOptJSONArray.getJSONObject(i10).toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    Object orNull = parserFactory.parseOrNull(string);
                    if (orNull != null) {
                        listCreateListBuilder.add(orNull);
                    }
                }
                listBuild = CollectionsKt.build(listCreateListBuilder);
            }
            JsonParsers jsonParsers2 = JsonParsers.INSTANCE;
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("no_bids");
            if (jSONArrayOptJSONArray2 == null) {
                listBuild2 = null;
            } else {
                Object obj2 = JsonParsers.parsersFactories.get(v0.b(AdUnit.class));
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type org.bidon.sdk.utils.json.JsonParsers.ParserFactory<T of org.bidon.sdk.utils.json.JsonParsers.parseList>");
                JsonParser parserFactory2 = ((JsonParsers.ParserFactory) obj2).getInstance();
                List listCreateListBuilder2 = CollectionsKt.createListBuilder();
                int length2 = jSONArrayOptJSONArray2.length();
                for (int i11 = 0; i11 < length2; i11++) {
                    String string2 = jSONArrayOptJSONArray2.getJSONObject(i11).toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    Object orNull2 = parserFactory2.parseOrNull(string2);
                    if (orNull2 != null) {
                        listCreateListBuilder2.add(orNull2);
                    }
                }
                listBuild2 = CollectionsKt.build(listCreateListBuilder2);
            }
            double dOptDouble = jSONObject.optDouble("auction_pricefloor");
            String string3 = jSONObject.getString("auction_id");
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            objB = Result.b(new AuctionResponse(listBuild, listBuild2, dOptDouble, string3, jSONObject.optLong("auction_timeout", 30000L), Long.valueOf(jSONObject.optLong("auction_configuration_id")), jSONObject.optString("auction_configuration_uid"), jSONObject.optBoolean("external_win_notifications", false)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(d.a(th2));
        }
        return (AuctionResponse) (Result.i(objB) ? null : objB);
    }
}
