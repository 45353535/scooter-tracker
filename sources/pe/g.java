package pe;

import java.io.Closeable;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ze.a f98277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f98278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Function1 f98279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Function0 f98280e;

    public g(ze.a key, Object config, Function1 body) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(body, "body");
        this.f98277b = key;
        this.f98278c = config;
        this.f98279d = body;
        this.f98280e = new Function0() { // from class: pe.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g.n();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n() {
        return Unit.f93236a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f98280e.invoke();
    }

    public final void q0(ie.c scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        d dVar = new d(this.f98277b, scope, this.f98278c);
        this.f98279d.invoke(dVar);
        this.f98280e = dVar.d();
        Iterator it = dVar.c().iterator();
        while (it.hasNext()) {
            ((j) it.next()).a(scope);
        }
    }
}
