package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.ads.network.common.model.AdResponse;
import com.inmobi.media.ads.network.common.model.AdSet;
import com.inmobi.media.ads.network.common.model.MetaInfo;
import j$.util.Objects;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes9.dex */
public abstract class V0 {
    public static void a(AdResponse adResponse, C3903n9 c3903n9, Function1 onFetchEvent) {
        MetaInfo metaInfo;
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(onFetchEvent, "onFetchEvent");
        Objects.toString(adResponse);
        AdSet adSet = (AdSet) CollectionsKt.getOrNull(adResponse.getAdSets(), 0);
        if (StringsKt.v1(adResponse.getRequestId()).toString().length() == 0) {
            throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new Ni(MapsKt.mutableMapOf(TuplesKt.to("errorCode", (short) 2208))));
        }
        if (adResponse.getAdSets().isEmpty()) {
            throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NO_FILL), new Pi((short) 54));
        }
        if (adSet == null) {
            throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new Pi((short) 2364));
        }
        if (adSet.getAds().isEmpty()) {
            throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NO_FILL), new Pi((short) 54));
        }
        com.inmobi.media.ads.network.common.model.Ad ad2 = (com.inmobi.media.ads.network.common.model.Ad) CollectionsKt.getOrNull(adSet.getAds(), 0);
        String creativeType = (ad2 == null || (metaInfo = ad2.getMetaInfo()) == null) ? null : metaInfo.getCreativeType();
        Map mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("isRewarded", Boolean.valueOf(adSet.getIsRewarded())));
        if (creativeType != null) {
            mapMutableMapOf.put("creativeType", creativeType);
        }
        onFetchEvent.invoke(new Oi(mapMutableMapOf));
        a(adSet.getAdSetId(), adSet.getIsRewarded());
        a(adSet, c3903n9);
    }

    public static void a(String str, boolean z10) {
        if (str.length() == 0) {
            throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new Ni(MapsKt.mutableMapOf(TuplesKt.to("errorCode", (short) 2231), TuplesKt.to("isRewarded", Boolean.valueOf(z10)))));
        }
    }

    public static void a(AdSet adSet, C3903n9 c3903n9) {
        int i10 = 0;
        Objects.toString(adSet);
        if (adSet.getAds().peekFirst() != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (Object obj : adSet.getAds()) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                com.inmobi.media.ads.network.common.model.Ad ad2 = (com.inmobi.media.ads.network.common.model.Ad) obj;
                if (i10 == 0) {
                    a(ad2);
                } else {
                    try {
                        a(ad2);
                        Unit unit = Unit.f93236a;
                    } catch (Y e10) {
                        if (c3903n9 != null) {
                            c3903n9.b("AdResponseValidator", "validateAdObjects Exception: (Index: " + i10 + ") - " + e10);
                        }
                        linkedHashSet.add(ad2);
                    }
                }
                i10 = i11;
            }
            adSet.getAds().removeAll(linkedHashSet);
            return;
        }
        throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new Ni(MapsKt.mutableMapOf(TuplesKt.to("errorCode", (short) 2116), TuplesKt.to("isRewarded", Boolean.valueOf(adSet.getIsRewarded())))));
    }

    public static void a(com.inmobi.media.ads.network.common.model.Ad ad2) {
        Objects.toString(ad2);
        if (ad2.getImpressionId().length() != 0) {
            String type = ad2.getMarkupType();
            Intrinsics.checkNotNullParameter(type, "type");
            if ((Intrinsics.areEqual(type, "html") || Intrinsics.areEqual(type, "inmobiJson") || Intrinsics.areEqual(type, "htmlUrl")) && !Intrinsics.areEqual(ad2.getMarkupType(), "unknown")) {
                try {
                    ad2.getPubContent().a();
                    return;
                } catch (IllegalArgumentException unused) {
                    throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new Ni(MapsKt.mutableMapOf(TuplesKt.to("errorCode", (short) 2163))));
                }
            }
            throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new Ni(MapsKt.mutableMapOf(TuplesKt.to("errorCode", (short) 2163))));
        }
        HashMap map = new HashMap();
        map.put("errorCode", (short) 2230);
        throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new Ni(map));
    }
}
