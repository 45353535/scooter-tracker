package rf;

import java.lang.reflect.Method;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: rf.a$a, reason: collision with other inner class name */
    private static final class C1184a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C1184a f99462a = new C1184a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Method f99463b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Method f99464c;

        static {
            Method method;
            Method method2;
            Method[] methods = Throwable.class.getMethods();
            Intrinsics.checkNotNull(methods);
            int length = methods.length;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                method = null;
                if (i11 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i11];
                if (Intrinsics.areEqual(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
                    if (Intrinsics.areEqual(ArraysKt.singleOrNull(parameterTypes), Throwable.class)) {
                        break;
                    }
                }
                i11++;
            }
            f99463b = method2;
            int length2 = methods.length;
            while (true) {
                if (i10 >= length2) {
                    break;
                }
                Method method3 = methods[i10];
                if (Intrinsics.areEqual(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
                i10++;
            }
            f99464c = method;
        }

        private C1184a() {
        }
    }

    public void a(Throwable cause, Throwable exception) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        Intrinsics.checkNotNullParameter(exception, "exception");
        Method method = C1184a.f99463b;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }

    public d b() {
        return new kotlin.random.b();
    }
}
