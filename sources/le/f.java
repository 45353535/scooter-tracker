package le;

import eg.e0;
import eg.s;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Lazy;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Job;
import le.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f implements b, AutoCloseable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f94185e = AtomicIntegerFieldUpdater.newUpdater(f.class, "closed");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f94186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f94187c;

    @NotNull
    private volatile /* synthetic */ int closed;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f94188d;

    public f(String engineName) {
        Intrinsics.checkNotNullParameter(engineName, "engineName");
        this.f94186b = engineName;
        this.closed = 0;
        this.f94187c = lf.i.a(new Function0() { // from class: le.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f.f(this.f94183b);
            }
        });
        this.f94188d = lf.i.a(new Function0() { // from class: le.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f.e(this.f94184b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineContext e(f fVar) {
        return ze.p.b(null, 1, null).plus(fVar.n()).plus(new e0(fVar.f94186b + "-context"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineDispatcher f(f fVar) {
        CoroutineDispatcher coroutineDispatcherA = fVar.getConfig().a();
        return coroutineDispatcherA == null ? g.a() : coroutineDispatcherA;
    }

    @Override // le.b
    public Set D() {
        return b.a.g(this);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (f94185e.compareAndSet(this, 0, 1)) {
            CoroutineContext.Element element = getCoroutineContext().get(Job.N8);
            s sVar = element instanceof s ? (s) element : null;
            if (sVar == null) {
                return;
            }
            sVar.complete();
        }
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return (CoroutineContext) this.f94188d.getValue();
    }

    public CoroutineDispatcher n() {
        return (CoroutineDispatcher) this.f94187c.getValue();
    }

    @Override // le.b
    public void q0(ie.c cVar) {
        b.a.h(this, cVar);
    }
}
