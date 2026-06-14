package org.bidon.meta.ext;

import com.facebook.ads.AdError;
import org.bidon.sdk.config.BidonError;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f97383a = "6.20.0.0";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f97384b = "6.20.0";

    public static final BidonError a(AdError adError) {
        Integer numValueOf = adError != null ? Integer.valueOf(adError.getErrorCode()) : null;
        if (numValueOf != null && numValueOf.intValue() == 1001) {
            return new BidonError.NoFill(org.bidon.meta.a.a());
        }
        if (numValueOf != null && numValueOf.intValue() == 2009) {
            return new BidonError.Expired(org.bidon.meta.a.a());
        }
        return new BidonError.Unspecified(org.bidon.meta.a.a(), new Throwable("Message: " + (adError != null ? adError.getErrorMessage() : null) + ". Code: " + (adError != null ? Integer.valueOf(adError.getErrorCode()) : null)), null, 4, null);
    }

    public static final String b() {
        return f97383a;
    }

    public static final String c() {
        return f97384b;
    }
}
