package org.bidon.bigoads.ext;

import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.config.BidonError;
import sg.bigo.ads.BigoAdSdk;
import sg.bigo.ads.api.AdError;

/* JADX INFO: loaded from: classes12.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f97176a = "5.6.2.0";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f97177b;

    static {
        String sDKVersionName = BigoAdSdk.getSDKVersionName();
        Intrinsics.checkNotNullExpressionValue(sDKVersionName, "getSDKVersionName(...)");
        f97177b = sDKVersionName;
    }

    public static final BidonError a(AdError adError) {
        Intrinsics.checkNotNullParameter(adError, "<this>");
        int code = adError.getCode();
        if (code != 1014) {
            if (code == 2000) {
                return new BidonError.Expired(org.bidon.bigoads.a.a());
            }
            if (code != 2003 && code != 2004) {
                switch (code) {
                    case 1000:
                        return BidonError.SdkNotInitialized.INSTANCE;
                    case 1001:
                    case 1003:
                        return new BidonError.NetworkError(org.bidon.bigoads.a.a(), adError.getMessage());
                    case 1002:
                        break;
                    case 1004:
                        return new BidonError.NoFill(org.bidon.bigoads.a.a());
                    case 1005:
                        return new BidonError.InternalServerSdkError(adError.getMessage());
                    case 1006:
                        break;
                    case 1007:
                        return BidonError.AppKeyIsInvalid.INSTANCE;
                    default:
                        return new BidonError.Unspecified(org.bidon.bigoads.a.a(), new Throwable("Message: " + adError.getMessage() + ". Code: " + adError.getCode()), null, 4, null);
                }
            }
            return BidonError.AdNotReady.INSTANCE;
        }
        return BidonError.NoAppropriateAdUnitId.INSTANCE;
    }

    public static final String b() {
        return f97176a;
    }

    public static final String c() {
        return f97177b;
    }
}
