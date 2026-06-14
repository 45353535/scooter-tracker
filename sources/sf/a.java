package sf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public class a extends rf.a {

    /* JADX INFO: renamed from: sf.a$a, reason: collision with other inner class name */
    private static final class C1200a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C1200a f100043a = new C1200a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Integer f100044b;

        static {
            Object obj;
            Integer num = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            Integer num2 = obj instanceof Integer ? (Integer) obj : null;
            if (num2 != null && num2.intValue() > 0) {
                num = num2;
            }
            f100044b = num;
        }

        private C1200a() {
        }
    }

    private final boolean c(int i10) {
        Integer num = C1200a.f100044b;
        return num == null || num.intValue() >= i10;
    }

    @Override // rf.a
    public void a(Throwable cause, Throwable exception) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        Intrinsics.checkNotNullParameter(exception, "exception");
        if (c(19)) {
            cause.addSuppressed(exception);
        } else {
            super.a(cause, exception);
        }
    }
}
