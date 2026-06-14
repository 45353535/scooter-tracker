package l2;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public enum a {
    MOBILE_APP_INSTALL,
    CUSTOM,
    OTHER;


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1073a f93871b = new C1073a(null);

    /* JADX INFO: renamed from: l2.a$a, reason: collision with other inner class name */
    public static final class C1073a {
        public /* synthetic */ C1073a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(String rawValue) {
            Intrinsics.checkNotNullParameter(rawValue, "rawValue");
            return Intrinsics.areEqual(rawValue, "MOBILE_APP_INSTALL") ? a.MOBILE_APP_INSTALL : Intrinsics.areEqual(rawValue, "CUSTOM_APP_EVENTS") ? a.CUSTOM : a.OTHER;
        }

        private C1073a() {
        }
    }
}
