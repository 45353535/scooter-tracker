package k8;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public enum z5 {
    TOP("top"),
    CENTER("center"),
    BOTTOM("bottom"),
    BASELINE("baseline");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f92901c = new c(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Function1 f92902d = new Function1() { // from class: k8.z5.b
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(z5 z5Var) {
            return z5.f92901c.b(z5Var);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Function1 f92903e = new Function1() { // from class: k8.z5.a
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final z5 invoke(String str) {
            return z5.f92901c.a(str);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f92909b;

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final z5 a(String str) {
            z5 z5Var = z5.TOP;
            if (Intrinsics.areEqual(str, z5Var.f92909b)) {
                return z5Var;
            }
            z5 z5Var2 = z5.CENTER;
            if (Intrinsics.areEqual(str, z5Var2.f92909b)) {
                return z5Var2;
            }
            z5 z5Var3 = z5.BOTTOM;
            if (Intrinsics.areEqual(str, z5Var3.f92909b)) {
                return z5Var3;
            }
            z5 z5Var4 = z5.BASELINE;
            if (Intrinsics.areEqual(str, z5Var4.f92909b)) {
                return z5Var4;
            }
            return null;
        }

        public final String b(z5 z5Var) {
            return z5Var.f92909b;
        }

        private c() {
        }
    }

    z5(String str) {
        this.f92909b = str;
    }
}
