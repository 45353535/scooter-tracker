package k8;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public enum y5 {
    LEFT("left"),
    CENTER("center"),
    RIGHT("right"),
    START("start"),
    END("end");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f92618c = new c(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Function1 f92619d = new Function1() { // from class: k8.y5.b
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(y5 y5Var) {
            return y5.f92618c.b(y5Var);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Function1 f92620e = new Function1() { // from class: k8.y5.a
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final y5 invoke(String str) {
            return y5.f92618c.a(str);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f92627b;

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final y5 a(String str) {
            y5 y5Var = y5.LEFT;
            if (Intrinsics.areEqual(str, y5Var.f92627b)) {
                return y5Var;
            }
            y5 y5Var2 = y5.CENTER;
            if (Intrinsics.areEqual(str, y5Var2.f92627b)) {
                return y5Var2;
            }
            y5 y5Var3 = y5.RIGHT;
            if (Intrinsics.areEqual(str, y5Var3.f92627b)) {
                return y5Var3;
            }
            y5 y5Var4 = y5.START;
            if (Intrinsics.areEqual(str, y5Var4.f92627b)) {
                return y5Var4;
            }
            y5 y5Var5 = y5.END;
            if (Intrinsics.areEqual(str, y5Var5.f92627b)) {
                return y5Var5;
            }
            return null;
        }

        public final String b(y5 y5Var) {
            return y5Var.f92627b;
        }

        private c() {
        }
    }

    y5(String str) {
        this.f92627b = str;
    }
}
