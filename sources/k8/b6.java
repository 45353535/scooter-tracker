package k8;

import com.adjust.sdk.Constants;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.utils.svgparser.utils.SVGParserImpl;

/* JADX INFO: loaded from: classes12.dex */
public enum b6 {
    NORMAL(Constants.NORMAL),
    REVERSE("reverse"),
    ALTERNATE(SVGParserImpl.XML_STYLESHEET_ATTR_ALTERNATE),
    ALTERNATE_REVERSE("alternate_reverse");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f86438c = new c(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Function1 f86439d = new Function1() { // from class: k8.b6.b
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(b6 b6Var) {
            return b6.f86438c.b(b6Var);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Function1 f86440e = new Function1() { // from class: k8.b6.a
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b6 invoke(String str) {
            return b6.f86438c.a(str);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f86446b;

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b6 a(String str) {
            b6 b6Var = b6.NORMAL;
            if (Intrinsics.areEqual(str, b6Var.f86446b)) {
                return b6Var;
            }
            b6 b6Var2 = b6.REVERSE;
            if (Intrinsics.areEqual(str, b6Var2.f86446b)) {
                return b6Var2;
            }
            b6 b6Var3 = b6.ALTERNATE;
            if (Intrinsics.areEqual(str, b6Var3.f86446b)) {
                return b6Var3;
            }
            b6 b6Var4 = b6.ALTERNATE_REVERSE;
            if (Intrinsics.areEqual(str, b6Var4.f86446b)) {
                return b6Var4;
            }
            return null;
        }

        public final String b(b6 b6Var) {
            return b6Var.f86446b;
        }

        private c() {
        }
    }

    b6(String str) {
        this.f86446b = str;
    }
}
