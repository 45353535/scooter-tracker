package kotlin.coroutines;

import androidx.activity.s;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface d extends CoroutineContext.Element {

    @NotNull
    public static final b M8 = b.f93266b;

    public static final class a {
        public static CoroutineContext.Element a(d dVar, CoroutineContext.b key) {
            Intrinsics.checkNotNullParameter(key, "key");
            if (!(key instanceof kotlin.coroutines.b)) {
                if (d.M8 != key) {
                    return null;
                }
                Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return dVar;
            }
            kotlin.coroutines.b bVar = (kotlin.coroutines.b) key;
            if (bVar.a(dVar.getKey())) {
                CoroutineContext.Element elementB = bVar.b(dVar);
                if (s.a(elementB)) {
                    return elementB;
                }
            }
            return null;
        }

        public static CoroutineContext b(d dVar, CoroutineContext.b key) {
            Intrinsics.checkNotNullParameter(key, "key");
            if (!(key instanceof kotlin.coroutines.b)) {
                return d.M8 == key ? e.f93267b : dVar;
            }
            kotlin.coroutines.b bVar = (kotlin.coroutines.b) key;
            return (!bVar.a(dVar.getKey()) || bVar.b(dVar) == null) ? dVar : e.f93267b;
        }
    }

    public static final class b implements CoroutineContext.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ b f93266b = new b();

        private b() {
        }
    }

    Continuation interceptContinuation(Continuation continuation);

    void releaseInterceptedContinuation(Continuation continuation);
}
