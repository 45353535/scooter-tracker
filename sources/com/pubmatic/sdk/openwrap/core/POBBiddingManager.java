package com.pubmatic.sdk.openwrap.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.base.POBBaseBidder;
import com.pubmatic.sdk.common.base.POBBidderListener;
import com.pubmatic.sdk.common.base.POBBidderResult;
import com.pubmatic.sdk.common.base.POBBidding;
import com.pubmatic.sdk.common.models.POBAdResponse;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class POBBiddingManager extends POBBaseBidder<POBBid> implements POBBidderListener<POBBid> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final POBBidding f62769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private POBAdResponse f62770c;

    public POBBiddingManager(@NonNull POBBidding<POBBid> pOBBidding) {
        this.f62769b = pOBBidding;
        pOBBidding.setBidderListener(this);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type com.pubmatic.sdk.common.base.POBBidding to com.pubmatic.sdk.openwrap.core.POBBiddingManager for r6v1 'this'  com.pubmatic.sdk.common.base.POBBidding
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    private void a(com.pubmatic.sdk.common.base.POBBidding r7) {
        /*
            r6 = this;
            r0 = 0
            java.lang.String r1 = r7.getIdentifier()
            java.util.Map r7 = r7.getBidderResults()
            java.lang.Object r7 = r7.get(r1)
            com.pubmatic.sdk.common.base.POBBidderResult r7 = (com.pubmatic.sdk.common.base.POBBidderResult) r7
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            if (r7 == 0) goto L3c
            com.pubmatic.sdk.common.network.POBNetworkResult r3 = r7.getNetworkResult()
            if (r3 == 0) goto L2f
            java.lang.String r3 = r3.toString()
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r0] = r1
            r1 = 1
            r4[r1] = r3
            java.lang.String r1 = "POBBiddingManager"
            java.lang.String r3 = "Network result for bidder %s is : %s"
            com.pubmatic.sdk.common.log.POBLog.info(r1, r3, r4)
        L2f:
            com.pubmatic.sdk.common.models.POBAdResponse r7 = r7.getAdResponse()
            if (r7 == 0) goto L3c
            java.util.List r7 = r7.getBids()
            r2.addAll(r7)
        L3c:
            com.pubmatic.sdk.common.base.POBBidderListener<T extends com.pubmatic.sdk.common.base.POBAdDescriptor> r7 = r6.bidderListener
            if (r7 == 0) goto Lae
            boolean r7 = r2.isEmpty()
            if (r7 != 0) goto Lab
            com.pubmatic.sdk.common.base.POBBidding r7 = r6.f62769b
            com.pubmatic.sdk.common.models.POBAdResponse r7 = r7.getAdResponse()
            if (r7 == 0) goto L55
            com.pubmatic.sdk.common.base.POBBidding r7 = r6.f62769b
            com.pubmatic.sdk.common.models.POBAdResponse r7 = r7.getAdResponse()
            goto L59
        L55:
            com.pubmatic.sdk.common.models.POBAdResponse r7 = com.pubmatic.sdk.common.models.POBAdResponse.defaultResponse()
        L59:
            java.util.List r1 = r7.getBids()
            boolean r7 = r7.isSendAllBidsEnabled()
            r3 = 0
            if (r7 == 0) goto L8b
            java.util.Iterator r7 = r1.iterator()
        L68:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L7b
            java.lang.Object r4 = r7.next()
            com.pubmatic.sdk.openwrap.core.POBBid r4 = (com.pubmatic.sdk.openwrap.core.POBBid) r4
            boolean r5 = r4.isServerSideAuctionWinner()
            if (r5 == 0) goto L68
            r3 = r4
        L7b:
            if (r3 != 0) goto L98
            boolean r7 = r1.isEmpty()
            if (r7 != 0) goto L98
            java.lang.Object r7 = r1.get(r0)
            r3 = r7
            com.pubmatic.sdk.openwrap.core.POBBid r3 = (com.pubmatic.sdk.openwrap.core.POBBid) r3
            goto L98
        L8b:
            boolean r7 = r2.isEmpty()
            if (r7 != 0) goto L98
            java.lang.Object r7 = r2.get(r0)
            r3 = r7
            com.pubmatic.sdk.openwrap.core.POBBid r3 = (com.pubmatic.sdk.openwrap.core.POBBid) r3
        L98:
            if (r3 == 0) goto La4
            com.pubmatic.sdk.common.models.POBAdResponse r7 = r6.a(r3, r1)
            com.pubmatic.sdk.common.base.POBBidderListener<T extends com.pubmatic.sdk.common.base.POBAdDescriptor> r0 = r6.bidderListener
            r0.onBidsFetched(r6, r7)
            goto La7
        La4:
            r6.a()
        La7:
            r2.clear()
            return
        Lab:
            r6.a()
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pubmatic.sdk.openwrap.core.POBBiddingManager.a(com.pubmatic.sdk.common.base.POBBidding):void");
    }

    @Nullable
    public static POBBid getWinningBid(@Nullable POBAdResponse<POBBid> pOBAdResponse) {
        if (pOBAdResponse != null) {
            return (POBBid) pOBAdResponse.getWinningBid();
        }
        return null;
    }

    @Override // com.pubmatic.sdk.common.base.POBBaseBidder, com.pubmatic.sdk.common.base.POBBidding
    public void destroy() {
        this.f62769b.destroy();
    }

    @Override // com.pubmatic.sdk.common.base.POBBaseBidder, com.pubmatic.sdk.common.base.POBBidding
    @Nullable
    public POBAdResponse<POBBid> getAdResponse() {
        return this.f62770c;
    }

    @Override // com.pubmatic.sdk.common.base.POBBaseBidder, com.pubmatic.sdk.common.base.POBBidding
    @NonNull
    public Map<String, POBBidderResult<POBBid>> getBidderResults() {
        return this.f62769b.getBidderResults();
    }

    @Override // com.pubmatic.sdk.common.base.POBBidderListener
    public void onBidsFailed(@NonNull POBBidding<POBBid> pOBBidding, @NonNull POBError pOBError) {
        a(pOBBidding);
    }

    @Override // com.pubmatic.sdk.common.base.POBBidderListener
    public void onBidsFetched(@NonNull POBBidding<POBBid> pOBBidding, @NonNull POBAdResponse<POBBid> pOBAdResponse) {
        a(pOBBidding);
    }

    @Override // com.pubmatic.sdk.common.base.POBBaseBidder, com.pubmatic.sdk.common.base.POBBidding
    public void requestBid() {
        this.f62769b.requestBid();
    }

    private POBAdResponse a(POBBid pOBBid, List list) {
        POBAdResponse.Builder builder = new POBAdResponse.Builder(list);
        builder.setWinningBid(pOBBid);
        POBAdResponse adResponse = this.f62769b.getAdResponse();
        if (adResponse != null) {
            builder.setRefreshInterval(adResponse.getRefreshInterval());
            builder.setSendAllBidsState(adResponse.isSendAllBidsEnabled());
            builder.setNbrCode(adResponse.getNbrCode());
        } else {
            builder.setRefreshInterval(30);
        }
        builder.setServerSidePartnerBids(list);
        POBAdResponse pOBAdResponseBuild = builder.build();
        this.f62770c = pOBAdResponseBuild;
        return pOBAdResponseBuild;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type com.pubmatic.sdk.common.base.POBBidding to com.pubmatic.sdk.openwrap.core.POBBiddingManager for r5v1 'this'  com.pubmatic.sdk.common.base.POBBidding
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    private void a() {
        /*
            r5 = this;
            r0 = 0
            r1 = 1
            com.pubmatic.sdk.common.base.POBBidding r2 = r5.f62769b
            java.util.Map r2 = r2.getBidderResults()
            com.pubmatic.sdk.common.base.POBBidding r3 = r5.f62769b
            java.lang.String r3 = r3.getIdentifier()
            java.lang.Object r2 = r2.get(r3)
            com.pubmatic.sdk.common.base.POBBidderResult r2 = (com.pubmatic.sdk.common.base.POBBidderResult) r2
            if (r2 == 0) goto L57
            com.pubmatic.sdk.common.models.POBAdResponse r3 = r2.getAdResponse()
            if (r3 == 0) goto L35
            java.lang.Integer r4 = r3.getNbrCode()
            if (r4 == 0) goto L35
            java.util.Locale r2 = java.util.Locale.getDefault()
            java.lang.Integer r3 = r3.getNbrCode()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r3
            java.lang.String r0 = "No ads available, reason(NBR): %s"
            java.lang.String r0 = java.lang.String.format(r2, r0, r1)
            goto L59
        L35:
            com.pubmatic.sdk.common.POBError r3 = r2.getError()
            if (r3 == 0) goto L57
            com.pubmatic.sdk.common.base.POBBidding r3 = r5.f62769b
            java.lang.String r3 = r3.getIdentifier()
            com.pubmatic.sdk.common.POBError r2 = r2.getError()
            java.lang.String r2 = r2.toString()
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r0] = r3
            r4[r1] = r2
            java.lang.String r0 = " %s : %s"
            java.lang.String r0 = java.lang.String.format(r0, r4)
            goto L59
        L57:
            java.lang.String r0 = "No Ads available from any bidder"
        L59:
            com.pubmatic.sdk.common.base.POBBidderListener<T extends com.pubmatic.sdk.common.base.POBAdDescriptor> r1 = r5.bidderListener
            if (r1 == 0) goto L67
            com.pubmatic.sdk.common.POBError r2 = new com.pubmatic.sdk.common.POBError
            r3 = 1002(0x3ea, float:1.404E-42)
            r2.<init>(r3, r0)
            r1.onBidsFailed(r5, r2)
        L67:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pubmatic.sdk.openwrap.core.POBBiddingManager.a():void");
    }
}
