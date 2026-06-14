package io.bidmachine;

import android.util.Pair;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lio/bidmachine/AdResponseCacheParamsAdapter;", "Lv8/c;", "Lio/bidmachine/u;", "Lv8/a;", "cacheParamsAccessor", "<init>", "(Lv8/a;)V", "input", "", "", "", "getCacheParams", "(Lio/bidmachine/u;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lv8/a;", "bidmachine-android-sdk_bh_3_5_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AdResponseCacheParamsAdapter implements v8.c {

    @NotNull
    private final v8.a cacheParamsAccessor;

    public AdResponseCacheParamsAdapter(@NotNull v8.a cacheParamsAccessor) {
        Intrinsics.checkNotNullParameter(cacheParamsAccessor, "cacheParamsAccessor");
        this.cacheParamsAccessor = cacheParamsAccessor;
    }

    @Override // v8.c
    @Nullable
    public Object getCacheParams(@NotNull u uVar, @NotNull Continuation continuation) {
        try {
            v8.a aVar = this.cacheParamsAccessor;
            AdRequestParameters adRequestParameters = uVar.B();
            Intrinsics.checkNotNullExpressionValue(adRequestParameters, "adRequestParameters");
            List<Pair> listA = aVar.a(adRequestParameters);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listA, 10));
            for (Pair pair : listA) {
                arrayList.add(MapsKt.mapOf(TuplesKt.to("price", pair.first), TuplesKt.to(CommonUrlParts.REQUEST_ID, pair.second)));
            }
            Map mapCreateMapBuilder = MapsKt.createMapBuilder();
            String responseId = uVar.f81958o;
            Intrinsics.checkNotNullExpressionValue(responseId, "responseId");
            mapCreateMapBuilder.put(CommonUrlParts.REQUEST_ID, responseId);
            mapCreateMapBuilder.put("is_bid_cached", kotlin.coroutines.jvm.internal.b.a(uVar.K()));
            mapCreateMapBuilder.put("price", kotlin.coroutines.jvm.internal.b.b(uVar.F()));
            if (!arrayList.isEmpty()) {
                mapCreateMapBuilder.put(Reporting.EventType.CACHE, arrayList);
            }
            return MapsKt.mapOf(TuplesKt.to("ad_response_cache", MapsKt.build(mapCreateMapBuilder)));
        } catch (Exception unused) {
            return MapsKt.emptyMap();
        }
    }
}
