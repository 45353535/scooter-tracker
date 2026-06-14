package k8;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public enum e9 {
    LEFT("left"),
    CENTER("center"),
    RIGHT("right"),
    START("start"),
    END("end"),
    SPACE_BETWEEN("space-between"),
    SPACE_AROUND("space-around"),
    SPACE_EVENLY("space-evenly");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f87185c = new c(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Function1 f87186d = new Function1() { // from class: k8.e9.b
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(e9 e9Var) {
            return e9.f87185c.b(e9Var);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Function1 f87187e = new Function1() { // from class: k8.e9.a
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final e9 invoke(String str) {
            return e9.f87185c.a(str);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f87197b;

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e9 a(String str) {
            e9 e9Var = e9.LEFT;
            if (Intrinsics.areEqual(str, e9Var.f87197b)) {
                return e9Var;
            }
            e9 e9Var2 = e9.CENTER;
            if (Intrinsics.areEqual(str, e9Var2.f87197b)) {
                return e9Var2;
            }
            e9 e9Var3 = e9.RIGHT;
            if (Intrinsics.areEqual(str, e9Var3.f87197b)) {
                return e9Var3;
            }
            e9 e9Var4 = e9.START;
            if (Intrinsics.areEqual(str, e9Var4.f87197b)) {
                return e9Var4;
            }
            e9 e9Var5 = e9.END;
            if (Intrinsics.areEqual(str, e9Var5.f87197b)) {
                return e9Var5;
            }
            e9 e9Var6 = e9.SPACE_BETWEEN;
            if (Intrinsics.areEqual(str, e9Var6.f87197b)) {
                return e9Var6;
            }
            e9 e9Var7 = e9.SPACE_AROUND;
            if (Intrinsics.areEqual(str, e9Var7.f87197b)) {
                return e9Var7;
            }
            e9 e9Var8 = e9.SPACE_EVENLY;
            if (Intrinsics.areEqual(str, e9Var8.f87197b)) {
                return e9Var8;
            }
            return null;
        }

        public final String b(e9 e9Var) {
            return e9Var.f87197b;
        }

        private c() {
        }
    }

    e9(String str) {
        this.f87197b = str;
    }
}
