package f1;

import f1.y0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class oc extends y0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f70736m = new a(null);

    public static final class a {
        public a() {
        }

        public final oc a(z2 name, String message) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(message, "message");
            return new oc(name, message, null, null, null, 28, null);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc(z2 name, String message, String adType, String location, b1.e eVar) {
        super(name, message, adType, location, eVar, y0.b.f71599d, null, false, false, 0L, 0.0f, y0.a.f71594c, 1984, null);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(location, "location");
    }

    public static final oc s(z2 z2Var, String str) {
        return f70736m.a(z2Var, str);
    }

    public /* synthetic */ oc(z2 z2Var, String str, String str2, String str3, b1.e eVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2Var, str, (i10 & 4) != 0 ? "" : str2, (i10 & 8) != 0 ? "" : str3, (i10 & 16) != 0 ? null : eVar);
    }
}
