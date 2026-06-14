package le;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ve.u;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f94203a = "ktor-client";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set f94204b;

    static {
        u uVar = u.f106718a;
        f94204b = SetsKt.setOf((Object[]) new String[]{uVar.k(), uVar.m(), uVar.r(), uVar.o(), uVar.q()});
    }

    public static final Object c(Continuation continuation) {
        CoroutineContext.Element element = continuation.getContext().get(m.f94196c);
        Intrinsics.checkNotNull(element);
        return ((m) element).a();
    }

    public static final void d(final ve.o requestHeaders, final ye.c content, final Function2 block) {
        String string;
        String string2;
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(block, "block");
        te.d.a(new Function1() { // from class: le.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return r.e(requestHeaders, content, (ve.p) obj);
            }
        }).c(new Function2() { // from class: le.o
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return r.f(block, (String) obj, (List) obj2);
            }
        });
        u uVar = u.f106718a;
        if (requestHeaders.get(uVar.x()) == null && content.c().get(uVar.x()) == null && g()) {
            block.invoke(uVar.x(), f94203a);
        }
        ve.g gVarB = content.b();
        if ((gVarB == null || (string = gVarB.toString()) == null) && (string = content.c().get(uVar.i())) == null) {
            string = requestHeaders.get(uVar.i());
        }
        Long lA = content.a();
        if ((lA == null || (string2 = lA.toString()) == null) && (string2 = content.c().get(uVar.g())) == null) {
            string2 = requestHeaders.get(uVar.g());
        }
        if (string != null) {
            block.invoke(uVar.i(), string);
        }
        if (string2 != null) {
            block.invoke(uVar.g(), string2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(ve.o oVar, ye.c cVar, ve.p buildHeaders) {
        Intrinsics.checkNotNullParameter(buildHeaders, "$this$buildHeaders");
        buildHeaders.d(oVar);
        buildHeaders.d(cVar.c());
        return Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(Function2 function2, String key, List values) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(values, "values");
        u uVar = u.f106718a;
        if (Intrinsics.areEqual(uVar.g(), key)) {
            return Unit.f93236a;
        }
        if (Intrinsics.areEqual(uVar.i(), key)) {
            return Unit.f93236a;
        }
        if (f94204b.contains(key)) {
            Iterator it = values.iterator();
            while (it.hasNext()) {
                function2.invoke(key, (String) it.next());
            }
        } else {
            function2.invoke(key, CollectionsKt.joinToString$default(values, Intrinsics.areEqual(uVar.j(), key) ? "; " : StringUtils.COMMA, null, null, 0, null, null, 62, null));
        }
        return Unit.f93236a;
    }

    private static final boolean g() {
        return !ze.u.f119366a.a();
    }
}
