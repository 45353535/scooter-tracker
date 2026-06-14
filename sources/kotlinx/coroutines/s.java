package kotlinx.coroutines;

import java.io.Closeable;
import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.s;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s extends CoroutineDispatcher implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f93640b = new a(null);

    public static final class a extends kotlin.coroutines.b {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final s d(CoroutineContext.Element element) {
            if (element instanceof s) {
                return (s) element;
            }
            return null;
        }

        private a() {
            super(CoroutineDispatcher.Key, new Function1() { // from class: eg.v0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return s.a.d((CoroutineContext.Element) obj);
                }
            });
        }
    }

    public abstract Executor m();
}
