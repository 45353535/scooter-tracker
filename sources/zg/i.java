package zg;

import kotlin.Result;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f119430a;

    static {
        Object objB;
        try {
            Result.Companion companion = Result.f93230c;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            objB = Result.b(property != null ? StringsKt.toIntOrNull(property) : null);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        Integer num = (Integer) (Result.i(objB) ? null : objB);
        f119430a = num != null ? num.intValue() : 2097152;
    }
}
