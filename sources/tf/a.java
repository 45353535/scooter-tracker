package tf;

import kotlin.random.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public class a extends sf.a {

    /* JADX INFO: renamed from: tf.a$a, reason: collision with other inner class name */
    private static final class C1312a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C1312a f105170a = new C1312a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Integer f105171b;

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
            f105171b = num;
        }

        private C1312a() {
        }
    }

    private final boolean c(int i10) {
        Integer num = C1312a.f105171b;
        return num == null || num.intValue() >= i10;
    }

    @Override // rf.a
    public d b() {
        return c(34) ? new ag.a() : super.b();
    }
}
