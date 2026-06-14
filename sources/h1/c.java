package h1;

import f1.ga;
import h1.a;
import java.net.URL;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class c implements h1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ga f72870a;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f72871a;

        static {
            int[] iArr = new int[a.EnumC0890a.values().length];
            try {
                iArr[a.EnumC0890a.f72851f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.EnumC0890a.f72853h.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.EnumC0890a.f72850e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f72871a = iArr;
        }
    }

    public c(ga sdkConfiguration) {
        Intrinsics.checkNotNullParameter(sdkConfiguration, "sdkConfiguration");
        this.f72870a = sdkConfiguration;
    }

    @Override // h1.a
    public URL a(a.EnumC0890a endPoint) {
        Intrinsics.checkNotNullParameter(endPoint, "endPoint");
        URL urlB = b(endPoint);
        return urlB == null ? d.c(endPoint) : urlB;
    }

    public final URL b(a.EnumC0890a enumC0890a) {
        int i10 = a.f72871a[enumC0890a.ordinal()];
        if (i10 == 1) {
            String str = String.format("webview/%s/interstitial/get", Arrays.copyOf(new Object[]{this.f72870a.f69921y}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return c(enumC0890a, str);
        }
        if (i10 == 2) {
            String str2 = String.format("webview/%s/reward/get", Arrays.copyOf(new Object[]{this.f72870a.f69921y}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            return c(enumC0890a, str2);
        }
        if (i10 != 3) {
            return null;
        }
        String webviewPrefetchEndpoint = this.f72870a.f69922z;
        Intrinsics.checkNotNullExpressionValue(webviewPrefetchEndpoint, "webviewPrefetchEndpoint");
        return c(enumC0890a, webviewPrefetchEndpoint);
    }

    public final URL c(a.EnumC0890a enumC0890a, String str) {
        return new URL("https", d.a(enumC0890a), "/" + str);
    }
}
