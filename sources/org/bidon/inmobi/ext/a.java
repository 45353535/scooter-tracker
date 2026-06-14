package org.bidon.inmobi.ext;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.sdk.InMobiSdk;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.config.BidonError;

/* JADX INFO: loaded from: classes12.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f97289a = "11.1.0.0";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f97290b = InMobiSdk.getVersion();

    /* JADX INFO: renamed from: org.bidon.inmobi.ext.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C1126a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InMobiAdRequestStatus.StatusCode.values().length];
            try {
                iArr[InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InMobiAdRequestStatus.StatusCode.NO_FILL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final BidonError a(InMobiAdRequestStatus inMobiAdRequestStatus) {
        Intrinsics.checkNotNullParameter(inMobiAdRequestStatus, "<this>");
        int i10 = C1126a.$EnumSwitchMapping$0[inMobiAdRequestStatus.getStatusCode().ordinal()];
        if (i10 == 1) {
            return new BidonError.NetworkError(org.bidon.inmobi.a.a(), inMobiAdRequestStatus.getCom.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE java.lang.String());
        }
        if (i10 == 2) {
            return new BidonError.NoFill(org.bidon.inmobi.a.a());
        }
        if (i10 == 3) {
            return new BidonError.Expired(org.bidon.inmobi.a.a());
        }
        if (i10 == 4) {
            return new BidonError.FillTimedOut(org.bidon.inmobi.a.a());
        }
        return new BidonError.Unspecified(org.bidon.inmobi.a.a(), new Throwable("Message: " + inMobiAdRequestStatus.getCom.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE java.lang.String() + ". Code: " + inMobiAdRequestStatus.getStatusCode().name()), null, 4, null);
    }

    public static final String b() {
        return f97289a;
    }

    public static final String c() {
        return f97290b;
    }
}
