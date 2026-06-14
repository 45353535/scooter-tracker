package org.bidon.sdk.auction.ext;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.ads.AdType;
import org.bidon.sdk.auction.models.AdUnit;
import org.bidon.sdk.auction.models.AuctionResponse;
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"printWaterfall", "", "Lorg/bidon/sdk/auction/models/AuctionResponse;", "adType", "Lorg/bidon/sdk/ads/AdType;", "bidon_productionRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ExtKt {
    public static final void printWaterfall(@NotNull final AuctionResponse auctionResponse, @NotNull AdType adType) {
        String strJoinToString$default;
        Intrinsics.checkNotNullParameter(auctionResponse, "<this>");
        Intrinsics.checkNotNullParameter(adType, "adType");
        List<AdUnit> adUnits = auctionResponse.getAdUnits();
        if (adUnits == null || (strJoinToString$default = CollectionsKt.joinToString$default(adUnits, IOUtils.LINE_SEPARATOR_UNIX, null, null, 0, null, new Function1() { // from class: org.bidon.sdk.auction.ext.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ExtKt.printWaterfall$lambda$0(auctionResponse, (AdUnit) obj);
            }
        }, 30, null)) == null) {
            return;
        }
        LogExtKt.logInfo(adType + " auction waterfall", IOUtils.LINE_SEPARATOR_UNIX + strJoinToString$default);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence printWaterfall$lambda$0(AuctionResponse auctionResponse, AdUnit adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        return "#" + auctionResponse.getAdUnits().indexOf(adUnit) + " " + adUnit;
    }
}
