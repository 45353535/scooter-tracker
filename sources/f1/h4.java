package f1;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function9;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes6.dex */
public final class h4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function0 f69989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b1.e f69990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rd f69991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Lazy f69992d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m0 f69993e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r5 f69994f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t6 f69995g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Lazy f69996h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ScheduledExecutorService f69997i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final wc f69998j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final y f69999k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final s1 f70000l;

    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ bf f70002g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(bf bfVar) {
            super(0);
            this.f70002g = bfVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final r3 invoke() {
            return new r3(h4.this.f69991c.d(), h4.this.f69991c.a(), this.f70002g, h4.this.f69991c.l(), h4.this.f69991c.j(), h4.this.f69990b, h4.this.f69991c.h(), h4.this.f69991c.b());
        }
    }

    public static final class b extends Lambda implements Function0 {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final AtomicReference invoke() {
            return h4.this.f69991c.a().b();
        }
    }

    public h4(bf adType, Function0 get, b1.e eVar, rd dependencyContainer) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(get, "get");
        Intrinsics.checkNotNullParameter(dependencyContainer, "dependencyContainer");
        this.f69989a = get;
        this.f69990b = eVar;
        this.f69991c = dependencyContainer;
        this.f69992d = lf.i.a(new a(adType));
        this.f69993e = d().c();
        this.f69994f = d().e();
        this.f69995g = dependencyContainer.d().c();
        this.f69996h = lf.i.a(new b());
        this.f69997i = dependencyContainer.g().b();
        this.f69998j = dependencyContainer.a().k();
        this.f69999k = dependencyContainer.d().a();
        this.f70000l = new j2(dependencyContainer.d()).a();
    }

    public final Object b() {
        return ((Function9) this.f69989a.invoke()).invoke(this.f69993e, this.f69994f, this.f69995g, e(), this.f69997i, this.f70000l, this.f69998j, this.f69999k, this.f69991c.b().a());
    }

    public final r3 d() {
        return (r3) this.f69992d.getValue();
    }

    public final AtomicReference e() {
        return (AtomicReference) this.f69996h.getValue();
    }

    public /* synthetic */ h4(bf bfVar, Function0 function0, b1.e eVar, rd rdVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bfVar, function0, eVar, (i10 & 8) != 0 ? rd.f70996b : rdVar);
    }
}
