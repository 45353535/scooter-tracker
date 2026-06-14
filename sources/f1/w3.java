package f1;

import f1.y0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class w3 extends y0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f71435m = new a(null);

    public static final class a {
        public a() {
        }

        public final w3 a(z2 name, String message) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(message, "message");
            return new w3(name, message, null, null, null, null, 60, null);
        }

        public final w3 b(z2 name, String message, String adType, String location) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(adType, "adType");
            Intrinsics.checkNotNullParameter(location, "location");
            return new w3(name, message, adType, location, null, null, 48, null);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(z2 name, String message, String adType, String location, b1.e eVar, xc trackAd) {
        super(name, message, adType, location, eVar, y0.b.f71598c, trackAd, false, false, 0L, 0.0f, y0.a.f71594c, 1920, null);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(trackAd, "trackAd");
    }

    public static final w3 s(z2 z2Var, String str) {
        return f71435m.a(z2Var, str);
    }

    public static final w3 t(z2 z2Var, String str, String str2, String str3) {
        return f71435m.b(z2Var, str, str2, str3);
    }

    public /* synthetic */ w3(z2 z2Var, String str, String str2, String str3, b1.e eVar, xc xcVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2Var, str, (i10 & 4) != 0 ? "" : str2, (i10 & 8) != 0 ? "" : str3, (i10 & 16) != 0 ? null : eVar, (i10 & 32) != 0 ? new xc(null, null, null, null, null, null, null, null, 255, null) : xcVar);
    }
}
