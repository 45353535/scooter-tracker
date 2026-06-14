package h1;

import h1.a;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class d {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f72872a;

        static {
            int[] iArr = new int[a.EnumC0890a.values().length];
            try {
                iArr[a.EnumC0890a.f72855j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f72872a = iArr;
        }
    }

    public static final String a(a.EnumC0890a enumC0890a) {
        Intrinsics.checkNotNullParameter(enumC0890a, "<this>");
        return a.f72872a[enumC0890a.ordinal()] == 1 ? a.b.f72863d.g() : a.b.f72862c.g();
    }

    public static final String b(URL url) {
        Intrinsics.checkNotNullParameter(url, "<this>");
        return url.getProtocol() + "://" + url.getHost();
    }

    public static final URL c(a.EnumC0890a enumC0890a) {
        Intrinsics.checkNotNullParameter(enumC0890a, "<this>");
        return new URL("https", a(enumC0890a), enumC0890a.g());
    }
}
