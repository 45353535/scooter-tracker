package ef;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.b1;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f69098e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final List f69099f = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f69100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f69101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f69102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f69103d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public c(i phase, j relation, List interceptors) {
        Intrinsics.checkNotNullParameter(phase, "phase");
        Intrinsics.checkNotNullParameter(relation, "relation");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        this.f69100a = phase;
        this.f69101b = relation;
        this.f69102c = interceptors;
        this.f69103d = true;
    }

    private final List c() {
        return CollectionsKt.toMutableList((Collection) this.f69102c);
    }

    private final void d() {
        this.f69102c = c();
        this.f69103d = false;
    }

    public final void a(Function3 interceptor) {
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        if (this.f69103d) {
            d();
        }
        this.f69102c.add(interceptor);
    }

    public final void b(List destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        List list = this.f69102c;
        if (destination instanceof ArrayList) {
            ArrayList arrayList = (ArrayList) destination;
            arrayList.ensureCapacity(arrayList.size() + list.size());
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            destination.add(list.get(i10));
        }
    }

    public final i e() {
        return this.f69100a;
    }

    public final j f() {
        return this.f69101b;
    }

    public final int g() {
        return this.f69102c.size();
    }

    public final boolean h() {
        return this.f69102c.isEmpty();
    }

    public final List i() {
        this.f69103d = true;
        return this.f69102c;
    }

    public String toString() {
        return "Phase `" + this.f69100a.a() + "`, " + g() + " handlers";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(i phase, j relation) {
        Intrinsics.checkNotNullParameter(phase, "phase");
        Intrinsics.checkNotNullParameter(relation, "relation");
        List list = f69099f;
        Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.MutableList<@[ExtensionFunctionType] kotlin.coroutines.SuspendFunction2<io.ktor.util.pipeline.PipelineContext<TSubject of io.ktor.util.pipeline.PhaseContent, Call of io.ktor.util.pipeline.PhaseContent>, TSubject of io.ktor.util.pipeline.PhaseContent, kotlin.Unit>>");
        this(phase, relation, b1.c(list));
        if (!list.isEmpty()) {
            throw new IllegalStateException("The shared empty array list has been modified");
        }
    }
}
