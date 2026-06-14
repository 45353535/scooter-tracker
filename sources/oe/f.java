package oe;

import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f96760b = new b(0 == true ? 1 : 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ze.a f96761c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function1 f96762a;

    public static final class a implements ve.x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ve.p f96763a = new ve.p(0, 1, null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ve.m0 f96764b = new ve.m0(null, null, 0, null, null, null, null, null, false, 511, null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ze.b f96765c = ze.d.a(true);

        public final ze.b a() {
            return this.f96765c;
        }

        public final ve.m0 b() {
            return this.f96764b;
        }

        @Override // ve.x
        public ve.p getHeaders() {
            return this.f96763a;
        }
    }

    public static final class b implements v {

        static final class a extends kotlin.coroutines.jvm.internal.k implements Function3 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f96766r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            private /* synthetic */ Object f96767s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ f f96768t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f fVar, Continuation continuation) {
                super(3, continuation);
                this.f96768t = fVar;
            }

            @Override // kotlin.jvm.functions.Function3
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object invoke(ef.e eVar, Object obj, Continuation continuation) {
                a aVar = new a(this.f96768t, continuation);
                aVar.f96767s = eVar;
                return aVar.invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                pf.b.g();
                if (this.f96766r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                ef.e eVar = (ef.e) this.f96767s;
                String string = ((re.d) eVar.b()).i().toString();
                a aVar = new a();
                f fVar = this.f96768t;
                ze.b0.c(aVar.getHeaders(), ((re.d) eVar.b()).getHeaders());
                ve.o oVarP = aVar.getHeaders().p();
                fVar.f96762a.invoke(aVar);
                for (Map.Entry entry : oVarP.entries()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    List listA = aVar.getHeaders().a(str);
                    if (listA == null) {
                        aVar.getHeaders().c(str, list);
                    } else if (!Intrinsics.areEqual(listA, list) && !Intrinsics.areEqual(str, ve.u.f106718a.j())) {
                        aVar.getHeaders().l(str);
                        aVar.getHeaders().c(str, list);
                        aVar.getHeaders().h(str, listA);
                    }
                }
                f.f96760b.f(aVar.b().b(), ((re.d) eVar.b()).i());
                for (ze.a aVar2 : aVar.a().c()) {
                    if (!((re.d) eVar.b()).c().g(aVar2)) {
                        ze.b bVarC = ((re.d) eVar.b()).c();
                        Intrinsics.checkNotNull(aVar2, "null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>");
                        bVarC.e(aVar2, aVar.a().b(aVar2));
                    }
                }
                ((re.d) eVar.b()).getHeaders().clear();
                ((re.d) eVar.b()).getHeaders().d(aVar.getHeaders().p());
                h.f96779a.i("Applied DefaultRequest to " + string + ". New url: " + ((re.d) eVar.b()).i());
                return Unit.f93236a;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final List d(List list, List list2) {
            if (list2.isEmpty()) {
                return list;
            }
            if (list.isEmpty() || ((CharSequence) CollectionsKt.first(list2)).length() == 0) {
                return list2;
            }
            List listCreateListBuilder = CollectionsKt.createListBuilder((list.size() + list2.size()) - 1);
            int size = list.size() - 1;
            for (int i10 = 0; i10 < size; i10++) {
                listCreateListBuilder.add(list.get(i10));
            }
            listCreateListBuilder.addAll(list2);
            return CollectionsKt.build(listCreateListBuilder);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void f(ve.f1 f1Var, ve.m0 m0Var) {
            if (m0Var.p() == null) {
                m0Var.A(f1Var.getProtocolOrNull());
            }
            if (m0Var.j().length() > 0) {
                return;
            }
            ve.m0 m0VarC = ve.w0.c(f1Var);
            m0VarC.A(m0Var.p());
            if (m0Var.n() != 0) {
                m0VarC.y(m0Var.n());
            }
            m0VarC.v(f.f96760b.d(m0VarC.g(), m0Var.g()));
            if (m0Var.d().length() > 0) {
                m0VarC.s(m0Var.d());
            }
            ve.h0 h0VarB = ve.k0.b(0, 1, null);
            ze.b0.c(h0VarB, m0VarC.e());
            m0VarC.t(m0Var.e());
            for (Map.Entry entry : h0VarB.entries()) {
                String str = (String) entry.getKey();
                List list = (List) entry.getValue();
                if (!m0VarC.e().contains(str)) {
                    m0VarC.e().c(str, list);
                }
            }
            ve.w0.j(m0Var, m0VarC);
        }

        @Override // oe.v
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(f plugin, ie.c scope) {
            Intrinsics.checkNotNullParameter(plugin, "plugin");
            Intrinsics.checkNotNullParameter(scope, "scope");
            scope.s().l(re.g.f99440g.a(), new a(plugin, null));
        }

        @Override // oe.v
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public f a(Function1 block) {
            Intrinsics.checkNotNullParameter(block, "block");
            return new f(block, null);
        }

        @Override // oe.v
        public ze.a getKey() {
            return f.f96761c;
        }

        private b() {
        }
    }

    static {
        KType kTypeO = null;
        KClass kClassB = kotlin.jvm.internal.v0.b(f.class);
        try {
            kTypeO = kotlin.jvm.internal.v0.o(f.class);
        } catch (Throwable unused) {
        }
        f96761c = new ze.a("DefaultRequest", new ff.a(kClassB, kTypeO));
    }

    public /* synthetic */ f(Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1);
    }

    private f(Function1 function1) {
        this.f96762a = function1;
    }
}
