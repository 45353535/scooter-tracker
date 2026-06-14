package ed;

import ic.j;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import lf.i;
import lf.l;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final j f69067n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Lazy f69068o;

    static final class a extends Lambda implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final b invoke() {
            c cVar = c.this;
            return new b(cVar, cVar.n());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String parent, j coroutineDispatchers) {
        super(parent);
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
        this.f69067n = coroutineDispatchers;
        this.f69068o = i.b(l.f94210c, new a());
    }

    public final j n() {
        return this.f69067n;
    }

    public final b o() {
        return (b) this.f69068o.getValue();
    }
}
