package com.inmobi.media;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public abstract class qo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f39412a = new LinkedHashMap();

    public static final String a(C4142x adComponent, double d10) {
        Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        LinkedHashMap linkedHashMap = f39412a;
        Integer numValueOf = Integer.valueOf(System.identityHashCode(adComponent));
        Object atomicBoolean = linkedHashMap.get(numValueOf);
        if (atomicBoolean == null) {
            atomicBoolean = new AtomicBoolean(false);
            linkedHashMap.put(numValueOf, atomicBoolean);
        }
        if (!((AtomicBoolean) atomicBoolean).compareAndSet(false, true)) {
            C3903n9 c3903n9 = adComponent.f39882a.f39145c;
            if (c3903n9 == null) {
                return "win/loss notification already triggered";
            }
            c3903n9.b("NativeWinLossBeacon", "Win/Loss notification already triggered");
            return "win/loss notification already triggered";
        }
        try {
            ArrayList arrayListA = AbstractC4197z4.a(adComponent.f39883b, "win_beacon");
            if (arrayListA.isEmpty()) {
                C3903n9 c3903n92 = adComponent.f39882a.f39145c;
                if (c3903n92 == null) {
                    return "no win/loss notification url";
                }
                c3903n92.b("NativeWinLossBeacon", "Win beacon URLs not found or empty");
                return "no win/loss notification url";
            }
            Iterator it = arrayListA.iterator();
            while (it.hasNext()) {
                String url = H3.a((String) it.next(), MapsKt.mapOf(TuplesKt.to("${AUCTION_MIN_TO_WIN}", String.valueOf(d10)), TuplesKt.to("${AUCTION_MINIMUM_BID_TO_WIN}", String.valueOf(d10))));
                C4121w3 c4121w3 = C4121w3.f39816a;
                C3903n9 c3903n93 = adComponent.f39882a.f39145c;
                Intrinsics.checkNotNullParameter(url, "url");
                C4121w3.a(url, true, c3903n93);
            }
            if (d10 > 0.0d) {
                return null;
            }
            C3903n9 c3903n94 = adComponent.f39882a.f39145c;
            if (c3903n94 == null) {
                return "notification triggering with invalid params";
            }
            c3903n94.b("NativeWinLossBeacon", "Win notification triggered with invalid minBidToWin: " + d10);
            return "notification triggering with invalid params";
        } catch (Exception e10) {
            C3903n9 c3903n95 = adComponent.f39882a.f39145c;
            if (c3903n95 == null) {
                return "win notification failed internally";
            }
            c3903n95.a("NativeWinLossBeacon", "Exception in notifyWin", e10);
            return "win notification failed internally";
        }
    }

    public static final String a(C4142x adComponent, int i10, double d10) {
        Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        LinkedHashMap linkedHashMap = f39412a;
        Integer numValueOf = Integer.valueOf(System.identityHashCode(adComponent));
        Object atomicBoolean = linkedHashMap.get(numValueOf);
        if (atomicBoolean == null) {
            atomicBoolean = new AtomicBoolean(false);
            linkedHashMap.put(numValueOf, atomicBoolean);
        }
        if (((AtomicBoolean) atomicBoolean).compareAndSet(false, true)) {
            try {
                ArrayList arrayListA = AbstractC4197z4.a(adComponent.f39883b, "loss_beacon");
                if (arrayListA.isEmpty()) {
                    C3903n9 c3903n9 = adComponent.f39882a.f39145c;
                    if (c3903n9 != null) {
                        c3903n9.b("NativeWinLossBeacon", "Loss beacon URLs not found or empty");
                        return "no win/loss notification url";
                    }
                    return "no win/loss notification url";
                }
                Iterator it = arrayListA.iterator();
                while (it.hasNext()) {
                    String url = H3.a((String) it.next(), MapsKt.mapOf(TuplesKt.to("${AUCTION_LOSS}", String.valueOf(i10)), TuplesKt.to("${AUCTION_PRICE}", String.valueOf(d10))));
                    C4121w3 c4121w3 = C4121w3.f39816a;
                    C3903n9 c3903n92 = adComponent.f39882a.f39145c;
                    Intrinsics.checkNotNullParameter(url, "url");
                    C4121w3.a(url, true, c3903n92);
                }
                if (i10 > 0 && d10 > 0.0d) {
                    return null;
                }
                C3903n9 c3903n93 = adComponent.f39882a.f39145c;
                if (c3903n93 != null) {
                    c3903n93.b("NativeWinLossBeacon", "Loss notification triggered with invalid params - lossReason: " + i10 + ", auctionPrice: " + d10);
                    return "notification triggering with invalid params";
                }
                return "notification triggering with invalid params";
            } catch (Exception e10) {
                C3903n9 c3903n94 = adComponent.f39882a.f39145c;
                if (c3903n94 != null) {
                    c3903n94.a("NativeWinLossBeacon", "Exception in notifyLoss", e10);
                    return "loss notification failed internally";
                }
                return "loss notification failed internally";
            }
        }
        C3903n9 c3903n95 = adComponent.f39882a.f39145c;
        if (c3903n95 != null) {
            c3903n95.b("NativeWinLossBeacon", "Win/Loss notification already triggered");
            return "win/loss notification already triggered";
        }
        return "win/loss notification already triggered";
    }
}
