package k8;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public enum c6 {
    LINEAR("linear"),
    EASE("ease"),
    EASE_IN("ease_in"),
    EASE_OUT("ease_out"),
    EASE_IN_OUT("ease_in_out"),
    SPRING("spring");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f86613c = new c(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Function1 f86614d = new Function1() { // from class: k8.c6.b
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(c6 c6Var) {
            return c6.f86613c.b(c6Var);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Function1 f86615e = new Function1() { // from class: k8.c6.a
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final c6 invoke(String str) {
            return c6.f86613c.a(str);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f86623b;

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c6 a(String str) {
            c6 c6Var = c6.LINEAR;
            if (Intrinsics.areEqual(str, c6Var.f86623b)) {
                return c6Var;
            }
            c6 c6Var2 = c6.EASE;
            if (Intrinsics.areEqual(str, c6Var2.f86623b)) {
                return c6Var2;
            }
            c6 c6Var3 = c6.EASE_IN;
            if (Intrinsics.areEqual(str, c6Var3.f86623b)) {
                return c6Var3;
            }
            c6 c6Var4 = c6.EASE_OUT;
            if (Intrinsics.areEqual(str, c6Var4.f86623b)) {
                return c6Var4;
            }
            c6 c6Var5 = c6.EASE_IN_OUT;
            if (Intrinsics.areEqual(str, c6Var5.f86623b)) {
                return c6Var5;
            }
            c6 c6Var6 = c6.SPRING;
            if (Intrinsics.areEqual(str, c6Var6.f86623b)) {
                return c6Var6;
            }
            return null;
        }

        public final String b(c6 c6Var) {
            return c6Var.f86623b;
        }

        private c() {
        }
    }

    c6(String str) {
        this.f86623b = str;
    }
}
