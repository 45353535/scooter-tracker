package org.bidon.sdk.auction.usecases.impl;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.bidon.sdk.adapter.DemandAd;
import org.bidon.sdk.auction.AdTypeParam;
import org.bidon.sdk.auction.ResultsCollector;
import org.bidon.sdk.auction.models.AdUnit;
import org.bidon.sdk.auction.models.TokenInfo;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lorg/bidon/sdk/auction/models/AuctionResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@e(c = "org.bidon.sdk.auction.usecases.impl.ExecuteAuctionUseCaseImpl$invoke$2$result$1", f = "ExecuteAuctionUseCaseImpl.kt", l = {113}, m = "invokeSuspend")
final class ExecuteAuctionUseCaseImpl$invoke$2$result$1 extends k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ AdTypeParam $adTypeParam;
    final /* synthetic */ List<AdUnit> $adUnits;
    final /* synthetic */ long $auctionConfigurationId;
    final /* synthetic */ String $auctionConfigurationUid;
    final /* synthetic */ String $auctionId;
    final /* synthetic */ DemandAd $demandAd;
    final /* synthetic */ boolean $externalWinNotificationsEnabled;
    final /* synthetic */ double $pricefloor;
    final /* synthetic */ ResultsCollector $resultsCollector;
    final /* synthetic */ ExecuteAuctionUseCaseImpl $this_runCatching;
    final /* synthetic */ Map<String, TokenInfo> $tokens;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExecuteAuctionUseCaseImpl$invoke$2$result$1(ExecuteAuctionUseCaseImpl executeAuctionUseCaseImpl, List<AdUnit> list, Map<String, TokenInfo> map, double d10, ResultsCollector resultsCollector, DemandAd demandAd, String str, long j10, String str2, boolean z10, AdTypeParam adTypeParam, Continuation continuation) {
        super(2, continuation);
        this.$this_runCatching = executeAuctionUseCaseImpl;
        this.$adUnits = list;
        this.$tokens = map;
        this.$pricefloor = d10;
        this.$resultsCollector = resultsCollector;
        this.$demandAd = demandAd;
        this.$auctionId = str;
        this.$auctionConfigurationId = j10;
        this.$auctionConfigurationUid = str2;
        this.$externalWinNotificationsEnabled = z10;
        this.$adTypeParam = adTypeParam;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new ExecuteAuctionUseCaseImpl$invoke$2$result$1(this.$this_runCatching, this.$adUnits, this.$tokens, this.$pricefloor, this.$resultsCollector, this.$demandAd, this.$auctionId, this.$auctionConfigurationId, this.$auctionConfigurationUid, this.$externalWinNotificationsEnabled, this.$adTypeParam, continuation);
    }

    /* JADX WARN: Path cross not found for [B:27:0x0108, B:30:0x0125], limit reached: 74 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x024e A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x009c -> B:49:0x01c7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0166 -> B:40:0x0169). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x01ca -> B:49:0x01c7). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 591
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bidon.sdk.auction.usecases.impl.ExecuteAuctionUseCaseImpl$invoke$2$result$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((ExecuteAuctionUseCaseImpl$invoke$2$result$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
