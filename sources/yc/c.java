package yc;

import eg.i;
import ic.j;
import id.c0;
import id.e0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f118913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f118914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f118915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d f118916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final CoroutineScope f118917e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final j f118918f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f118919g;

    static final class a extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f118920r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Object[] f118922t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ e0 f118923u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Object[] objArr, e0 e0Var, Continuation continuation) {
            super(2, continuation);
            this.f118922t = objArr;
            this.f118923u = e0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return c.this.new a(this.f118922t, this.f118923u, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f118920r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            e eVar = c.this.f118915c;
            List mutableList = CollectionsKt.toMutableList((Collection) ArraysKt.filterNotNull(this.f118922t));
            mutableList.add(0, this.f118923u);
            if (eVar.a(mutableList)) {
                return Unit.f93236a;
            }
            List list = (List) c.this.f118919g.get(this.f118923u);
            if (list != null) {
                if (list.isEmpty()) {
                    list = null;
                }
                if (list != null) {
                    c cVar = c.this;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (!cVar.f118914b.a(((c0) obj2).b())) {
                            arrayList.add(obj2);
                        }
                    }
                    c cVar2 = c.this;
                    e0 e0Var = this.f118923u;
                    Object[] objArr = this.f118922t;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        cVar2.f118916d.a(e0Var, (c0) it.next(), Arrays.copyOf(objArr, objArr.length));
                    }
                }
            }
            return Unit.f93236a;
        }
    }

    public c(String sourceName, e stateGroupEventInterceptor, e animationEventInterceptor, d callbackProcessor, CoroutineScope coroutineScope, j coroutineDispatchers, Map map) {
        Intrinsics.checkNotNullParameter(sourceName, "sourceName");
        Intrinsics.checkNotNullParameter(stateGroupEventInterceptor, "stateGroupEventInterceptor");
        Intrinsics.checkNotNullParameter(animationEventInterceptor, "animationEventInterceptor");
        Intrinsics.checkNotNullParameter(callbackProcessor, "callbackProcessor");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
        this.f118913a = sourceName;
        this.f118914b = stateGroupEventInterceptor;
        this.f118915c = animationEventInterceptor;
        this.f118916d = callbackProcessor;
        this.f118917e = coroutineScope;
        this.f118918f = coroutineDispatchers;
        this.f118919g = map == null ? new EnumMap(e0.class) : map;
    }

    @Override // yc.b
    public void a(int i10) {
        e(e0.OnClick, Integer.valueOf(i10));
    }

    @Override // yc.b
    public void b(Integer num) {
        e(e0.OnMute, num);
    }

    @Override // yc.b
    public void c(boolean z10) {
        e(e0.OnUseCustomClose, Boolean.valueOf(z10));
    }

    @Override // yc.b
    public void e() {
        e(e0.OnExpand, new Object[0]);
    }

    @Override // yc.b
    public void i() {
        e(e0.OnMidpoint, new Object[0]);
    }

    @Override // yc.b
    public void j() {
        e(e0.OnScheduled, new Object[0]);
    }

    @Override // yc.b
    public void k() {
        e(e0.OnFirstQuartile, new Object[0]);
    }

    @Override // yc.b
    public void l() {
        e(e0.OnStart, new Object[0]);
    }

    @Override // yc.b
    public void m() {
        e(e0.OnImpression, new Object[0]);
    }

    @Override // yc.b
    public void onClose() {
        e(e0.OnClose, new Object[0]);
    }

    @Override // yc.b
    public void a(Integer num) {
        e(e0.OnUnMute, num);
    }

    @Override // yc.b
    public void b() {
        e(e0.OnResume, new Object[0]);
    }

    @Override // yc.b
    public void c() {
        e(e0.OnThirdQuartile, new Object[0]);
    }

    @Override // yc.b
    public void d() {
        e(e0.OnSkip, new Object[0]);
    }

    public final void e(e0 eventType, Object... params) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(params, "params");
        i.d(this.f118917e, this.f118918f.d(), null, new a(params, eventType, null), 2, null);
    }

    @Override // yc.b
    public String f() {
        return this.f118913a;
    }

    @Override // yc.b
    public void g() {
        e(e0.OnPause, new Object[0]);
    }

    @Override // yc.b
    public void h() {
        e(e0.OnCollapse, new Object[0]);
    }

    @Override // yc.b
    public void a() {
        e(e0.OnComplete, new Object[0]);
    }

    @Override // yc.b
    public void a(long j10, long j11) {
        e(e0.OnProgress, Long.valueOf(j10), Long.valueOf(j11));
    }

    @Override // yc.b
    public void a(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        e(e0.OnNavigate, url);
    }
}
