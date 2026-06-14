package k8;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public enum g7 {
    SOURCE_IN("source_in"),
    SOURCE_ATOP("source_atop"),
    DARKEN("darken"),
    LIGHTEN("lighten"),
    MULTIPLY("multiply"),
    SCREEN("screen");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f87758c = new c(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Function1 f87759d = new Function1() { // from class: k8.g7.b
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(g7 g7Var) {
            return g7.f87758c.b(g7Var);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Function1 f87760e = new Function1() { // from class: k8.g7.a
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final g7 invoke(String str) {
            return g7.f87758c.a(str);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f87768b;

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g7 a(String str) {
            g7 g7Var = g7.SOURCE_IN;
            if (Intrinsics.areEqual(str, g7Var.f87768b)) {
                return g7Var;
            }
            g7 g7Var2 = g7.SOURCE_ATOP;
            if (Intrinsics.areEqual(str, g7Var2.f87768b)) {
                return g7Var2;
            }
            g7 g7Var3 = g7.DARKEN;
            if (Intrinsics.areEqual(str, g7Var3.f87768b)) {
                return g7Var3;
            }
            g7 g7Var4 = g7.LIGHTEN;
            if (Intrinsics.areEqual(str, g7Var4.f87768b)) {
                return g7Var4;
            }
            g7 g7Var5 = g7.MULTIPLY;
            if (Intrinsics.areEqual(str, g7Var5.f87768b)) {
                return g7Var5;
            }
            g7 g7Var6 = g7.SCREEN;
            if (Intrinsics.areEqual(str, g7Var6.f87768b)) {
                return g7Var6;
            }
            return null;
        }

        public final String b(g7 g7Var) {
            return g7Var.f87768b;
        }

        private c() {
        }
    }

    g7(String str) {
        this.f87768b = str;
    }
}
