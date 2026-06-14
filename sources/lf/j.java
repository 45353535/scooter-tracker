package lf;

import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public class j {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[l.values().length];
            try {
                iArr[l.f94209b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.f94210c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l.f94211d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static Lazy a(Function0 initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        DefaultConstructorMarker defaultConstructorMarker = null;
        return new p(initializer, defaultConstructorMarker, 2, defaultConstructorMarker);
    }

    public static Lazy b(l mode, Function0 initializer) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        int i10 = a.$EnumSwitchMapping$0[mode.ordinal()];
        int i11 = 2;
        if (i10 == 1) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            return new p(initializer, defaultConstructorMarker, i11, defaultConstructorMarker);
        }
        if (i10 == 2) {
            return new o(initializer);
        }
        if (i10 == 3) {
            return new b0(initializer);
        }
        throw new m();
    }
}
