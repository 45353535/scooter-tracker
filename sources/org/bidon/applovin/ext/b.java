package org.bidon.applovin.ext;

import com.applovin.sdk.AppLovinSdk;
import org.bidon.sdk.config.BidonError;

/* JADX INFO: loaded from: classes12.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f97082a = "13.5.1.0";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f97083b = AppLovinSdk.VERSION;

    public static final BidonError a(int i10) {
        if (i10 == 204) {
            return new BidonError.NoFill(org.bidon.applovin.a.a());
        }
        return new BidonError.Unspecified(org.bidon.applovin.a.a(), new Throwable("Code: " + i10), null, 4, null);
    }

    public static final String b() {
        return f97082a;
    }

    public static final String c() {
        return f97083b;
    }
}
