package org.bidon.ironsource.impl;

import com.ironsource.mediationsdk.logger.IronSourceError;
import org.bidon.sdk.config.BidonError;

/* JADX INFO: loaded from: classes12.dex */
public abstract class a {
    public static final BidonError a(IronSourceError ironSourceError) {
        Integer numValueOf = ironSourceError != null ? Integer.valueOf(ironSourceError.getErrorCode()) : null;
        if ((numValueOf != null && numValueOf.intValue() == 509) || ((numValueOf != null && numValueOf.intValue() == 606) || ((numValueOf != null && numValueOf.intValue() == 1024) || ((numValueOf != null && numValueOf.intValue() == 1035) || ((numValueOf != null && numValueOf.intValue() == 1058) || ((numValueOf != null && numValueOf.intValue() == 1158) || ((numValueOf != null && numValueOf.intValue() == 621) || ((numValueOf != null && numValueOf.intValue() == 1022) || ((numValueOf != null && numValueOf.intValue() == 1023) || ((numValueOf != null && numValueOf.intValue() == 1026) || ((numValueOf != null && numValueOf.intValue() == 1027) || ((numValueOf != null && numValueOf.intValue() == 1036) || ((numValueOf != null && numValueOf.intValue() == 1037) || ((numValueOf != null && numValueOf.intValue() == 1050) || ((numValueOf != null && numValueOf.intValue() == 1053) || (numValueOf != null && numValueOf.intValue() == 1056)))))))))))))))) {
            return new BidonError.NoFill(org.bidon.ironsource.a.a());
        }
        if ((numValueOf != null && numValueOf.intValue() == 608) || ((numValueOf != null && numValueOf.intValue() == 609) || ((numValueOf != null && numValueOf.intValue() == 1032) || ((numValueOf != null && numValueOf.intValue() == 1033) || ((numValueOf != null && numValueOf.intValue() == 1052) || ((numValueOf != null && numValueOf.intValue() == 1055) || ((numValueOf != null && numValueOf.intValue() == 1006) || (numValueOf != null && numValueOf.intValue() == 7113)))))))) {
            return new BidonError.FillTimedOut(org.bidon.ironsource.a.a());
        }
        if (numValueOf != null && numValueOf.intValue() == 520) {
            return new BidonError.NetworkError(org.bidon.ironsource.a.a(), null, 2, null);
        }
        if (numValueOf != null && numValueOf.intValue() == 1057) {
            return new BidonError.Expired(org.bidon.ironsource.a.a());
        }
        if ((numValueOf != null && numValueOf.intValue() == 1051) || ((numValueOf != null && numValueOf.intValue() == 1054) || (numValueOf != null && numValueOf.intValue() == 7202))) {
            return BidonError.AdNotReady.INSTANCE;
        }
        return new BidonError.Unspecified(org.bidon.ironsource.a.a(), new Throwable("Message: " + (ironSourceError != null ? ironSourceError.getErrorMessage() : null) + ". Code: " + (ironSourceError != null ? Integer.valueOf(ironSourceError.getErrorCode()) : null)), null, 4, null);
    }
}
