package re;

import kotlin.jvm.internal.v0;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ze.a f99461a;

    static {
        KType kTypeO;
        KClass kClassB = v0.b(ff.a.class);
        try {
            kTypeO = v0.o(ff.a.class);
        } catch (Throwable unused) {
            kTypeO = null;
        }
        f99461a = new ze.a("BodyTypeAttributeKey", new ff.a(kClassB, kTypeO));
    }

    public static final ze.a a() {
        return f99461a;
    }
}
