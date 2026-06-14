package org.bidon.bidmachine;

import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.adapter.DemandId;
import org.bidon.sdk.config.BidonError;

/* JADX INFO: loaded from: classes12.dex */
public abstract class d {
    public static final BidonError a(ae.a aVar, DemandId demandId) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(demandId, "demandId");
        return (Intrinsics.areEqual(aVar, ae.a.f4237g) || Intrinsics.areEqual(aVar, ae.a.f4238h) || Intrinsics.areEqual(aVar, ae.a.f4235e)) ? new BidonError.NetworkError(demandId, null, 2, null) : Intrinsics.areEqual(aVar, ae.a.f4236f) ? new BidonError.BidTimedOut(demandId) : Intrinsics.areEqual(aVar, ae.a.f4243m) ? BidonError.AdNotReady.INSTANCE : Intrinsics.areEqual(aVar, ae.a.f4244n) ? new BidonError.Expired(demandId) : aVar.e() == 103 ? BidonError.NoBid.INSTANCE : new BidonError.Unspecified(demandId, new Throwable(aVar.g()), null, 4, null);
    }

    public static final BidonError b(ae.a aVar, DemandId demandId) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(demandId, "demandId");
        return (Intrinsics.areEqual(aVar, ae.a.f4237g) || Intrinsics.areEqual(aVar, ae.a.f4238h) || Intrinsics.areEqual(aVar, ae.a.f4235e)) ? new BidonError.NetworkError(demandId, null, 2, null) : Intrinsics.areEqual(aVar, ae.a.f4236f) ? new BidonError.FillTimedOut(demandId) : Intrinsics.areEqual(aVar, ae.a.f4243m) ? BidonError.AdNotReady.INSTANCE : Intrinsics.areEqual(aVar, ae.a.f4244n) ? new BidonError.Expired(demandId) : aVar.e() == 103 ? new BidonError.NoFill(demandId) : new BidonError.Unspecified(demandId, new Throwable(aVar.g()), null, 4, null);
    }
}
