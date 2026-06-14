package k8;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public enum f9 {
    TOP("top"),
    CENTER("center"),
    BOTTOM("bottom"),
    BASELINE("baseline"),
    SPACE_BETWEEN("space-between"),
    SPACE_AROUND("space-around"),
    SPACE_EVENLY("space-evenly");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f87449c = new c(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Function1 f87450d = new Function1() { // from class: k8.f9.b
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(f9 f9Var) {
            return f9.f87449c.b(f9Var);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Function1 f87451e = new Function1() { // from class: k8.f9.a
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final f9 invoke(String str) {
            return f9.f87449c.a(str);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f87460b;

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f9 a(String str) {
            f9 f9Var = f9.TOP;
            if (Intrinsics.areEqual(str, f9Var.f87460b)) {
                return f9Var;
            }
            f9 f9Var2 = f9.CENTER;
            if (Intrinsics.areEqual(str, f9Var2.f87460b)) {
                return f9Var2;
            }
            f9 f9Var3 = f9.BOTTOM;
            if (Intrinsics.areEqual(str, f9Var3.f87460b)) {
                return f9Var3;
            }
            f9 f9Var4 = f9.BASELINE;
            if (Intrinsics.areEqual(str, f9Var4.f87460b)) {
                return f9Var4;
            }
            f9 f9Var5 = f9.SPACE_BETWEEN;
            if (Intrinsics.areEqual(str, f9Var5.f87460b)) {
                return f9Var5;
            }
            f9 f9Var6 = f9.SPACE_AROUND;
            if (Intrinsics.areEqual(str, f9Var6.f87460b)) {
                return f9Var6;
            }
            f9 f9Var7 = f9.SPACE_EVENLY;
            if (Intrinsics.areEqual(str, f9Var7.f87460b)) {
                return f9Var7;
            }
            return null;
        }

        public final String b(f9 f9Var) {
            return f9Var.f87460b;
        }

        private c() {
        }
    }

    f9(String str) {
        this.f87460b = str;
    }
}
