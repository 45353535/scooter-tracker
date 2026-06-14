package ze;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {
    public static final void a(b bVar, b other) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        for (a aVar : other.c()) {
            Intrinsics.checkNotNull(aVar, "null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>");
            bVar.e(aVar, other.b(aVar));
        }
    }
}
