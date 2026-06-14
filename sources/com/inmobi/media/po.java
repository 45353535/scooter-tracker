package com.inmobi.media;

import com.taurusx.tax.y.z.w.s;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class po implements ro {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.ads.network.common.model.Ad f39320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3903n9 f39321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f39322c;

    public po(com.inmobi.media.ads.network.common.model.Ad ad2, C3903n9 c3903n9) {
        Intrinsics.checkNotNullParameter("l1", s.z.f67720z);
        this.f39320a = ad2;
        this.f39321b = c3903n9;
        this.f39322c = new AtomicBoolean(false);
    }

    @Override // com.inmobi.media.ro
    public final String a(double d10) {
        if (!this.f39322c.compareAndSet(false, true)) {
            C3903n9 c3903n9 = this.f39321b;
            if (c3903n9 == null) {
                return "win/loss notification already triggered";
            }
            c3903n9.b("l1", "Win/Loss notification already triggered");
            return "win/loss notification already triggered";
        }
        try {
            com.inmobi.media.ads.network.common.model.Ad ad2 = this.f39320a;
            List listA = ad2 != null ? AbstractC4186yi.a(ad2, "win_beacon") : null;
            if (listA != null && !listA.isEmpty()) {
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    String url = H3.a((String) it.next(), MapsKt.mapOf(TuplesKt.to("${AUCTION_MIN_TO_WIN}", String.valueOf(d10)), TuplesKt.to("${AUCTION_MINIMUM_BID_TO_WIN}", String.valueOf(d10))));
                    C4121w3 c4121w3 = C4121w3.f39816a;
                    C3903n9 c3903n92 = this.f39321b;
                    Intrinsics.checkNotNullParameter(url, "url");
                    C4121w3.a(url, true, c3903n92);
                }
                if (d10 > 0.0d) {
                    return null;
                }
                C3903n9 c3903n93 = this.f39321b;
                if (c3903n93 == null) {
                    return "notification triggering with invalid params";
                }
                c3903n93.b("l1", "Win notification triggered with invalid minBidToWin: " + d10);
                return "notification triggering with invalid params";
            }
            C3903n9 c3903n94 = this.f39321b;
            if (c3903n94 == null) {
                return "no win/loss notification url";
            }
            c3903n94.b("l1", "Win beacon URLs not found or empty");
            return "no win/loss notification url";
        } catch (Exception e10) {
            C3903n9 c3903n95 = this.f39321b;
            if (c3903n95 == null) {
                return "win notification failed internally";
            }
            c3903n95.a("l1", "Exception in notifyWin", e10);
            return "win notification failed internally";
        }
    }

    @Override // com.inmobi.media.ro
    public final String a(int i10, double d10) {
        if (this.f39322c.compareAndSet(false, true)) {
            try {
                com.inmobi.media.ads.network.common.model.Ad ad2 = this.f39320a;
                List listA = ad2 != null ? AbstractC4186yi.a(ad2, "loss_beacon") : null;
                if (listA != null && !listA.isEmpty()) {
                    Iterator it = listA.iterator();
                    while (it.hasNext()) {
                        String url = H3.a((String) it.next(), MapsKt.mapOf(TuplesKt.to("${AUCTION_LOSS}", String.valueOf(i10)), TuplesKt.to("${AUCTION_PRICE}", String.valueOf(d10))));
                        C4121w3 c4121w3 = C4121w3.f39816a;
                        C3903n9 c3903n9 = this.f39321b;
                        Intrinsics.checkNotNullParameter(url, "url");
                        C4121w3.a(url, true, c3903n9);
                    }
                    if (i10 > 0 && d10 > 0.0d) {
                        return null;
                    }
                    C3903n9 c3903n92 = this.f39321b;
                    if (c3903n92 != null) {
                        c3903n92.b("l1", "Loss notification triggered with invalid params - lossReason: " + i10 + ", auctionPrice: " + d10);
                        return "notification triggering with invalid params";
                    }
                    return "notification triggering with invalid params";
                }
                C3903n9 c3903n93 = this.f39321b;
                if (c3903n93 != null) {
                    c3903n93.b("l1", "Loss beacon URLs not found or empty");
                    return "no win/loss notification url";
                }
                return "no win/loss notification url";
            } catch (Exception e10) {
                C3903n9 c3903n94 = this.f39321b;
                if (c3903n94 != null) {
                    c3903n94.a("l1", "Exception in notifyLoss", e10);
                    return "loss notification failed internally";
                }
                return "loss notification failed internally";
            }
        }
        C3903n9 c3903n95 = this.f39321b;
        if (c3903n95 != null) {
            c3903n95.b("l1", "Win/Loss notification already triggered");
            return "win/loss notification already triggered";
        }
        return "win/loss notification already triggered";
    }
}
