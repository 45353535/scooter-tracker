package f1;

import f1.y0;
import f1.z2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l1 extends y0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f70290m = new a(null);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(z2 name, String message, String adType, String location, b1.e eVar, xc trackAd) {
        super(name, message, adType, location, eVar, y0.b.f71597b, trackAd, false, false, 0L, 0.0f, y0.a.f71593b, 1920, null);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(trackAd, "trackAd");
        if (s()) {
            c(y0.a.f71594c);
            e(true);
        }
    }

    public final boolean s() {
        z2 z2VarK = k();
        return z2VarK == z2.a.f71694e || z2VarK == z2.a.f71695f || z2VarK == z2.i.f71748d || z2VarK == z2.i.f71749e;
    }

    public /* synthetic */ l1(z2 z2Var, String str, String str2, String str3, b1.e eVar, xc xcVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2Var, str, (i10 & 4) != 0 ? "" : str2, (i10 & 8) != 0 ? "" : str3, (i10 & 16) != 0 ? null : eVar, (i10 & 32) != 0 ? new xc(null, null, null, null, null, null, null, null, 255, null) : xcVar);
    }
}
