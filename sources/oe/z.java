package oe;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import ve.g;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final yh.d f96953a = df.a.a("io.ktor.client.plugins.HttpPlainText");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final pe.b f96954b = pe.i.b("HttpPlainText", a.f96955b, new Function1() { // from class: oe.y
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return z.b((pe.d) obj);
        }
    });

    /* synthetic */ class a extends kotlin.jvm.internal.y implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f96955b = new a();

        a() {
            super(0, x.class, "<init>", "<init>()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final x invoke() {
            return new x();
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.k implements Function3 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f96956r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f96957s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f96958t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ String f96959u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ Charset f96960v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, Charset charset, Continuation continuation) {
            super(3, continuation);
            this.f96959u = str;
            this.f96960v = charset;
        }

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(re.d dVar, Object obj, Continuation continuation) {
            b bVar = new b(this.f96959u, this.f96960v, continuation);
            bVar.f96957s = dVar;
            bVar.f96958t = obj;
            return bVar.invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f96956r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            re.d dVar = (re.d) this.f96957s;
            Object obj2 = this.f96958t;
            z.c(this.f96959u, dVar);
            if (!(obj2 instanceof String)) {
                return null;
            }
            ve.g gVarD = ve.y.d(dVar);
            if (gVarD == null || Intrinsics.areEqual(gVarD.e(), g.d.f106662a.a().e())) {
                return z.e(this.f96960v, dVar, (String) obj2, gVarD);
            }
            return null;
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.k implements Function5 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f96961r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f96962s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f96963t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f96964u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ Charset f96965v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Charset charset, Continuation continuation) {
            super(5, continuation);
            this.f96965v = charset;
        }

        @Override // kotlin.jvm.functions.Function5
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(pe.o oVar, se.c cVar, io.ktor.utils.io.e eVar, ff.a aVar, Continuation continuation) {
            c cVar2 = new c(this.f96965v, continuation);
            cVar2.f96962s = cVar;
            cVar2.f96963t = eVar;
            cVar2.f96964u = aVar;
            return cVar2.invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            se.c cVar;
            Object objG = pf.b.g();
            int i10 = this.f96961r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                se.c cVar2 = (se.c) this.f96962s;
                io.ktor.utils.io.e eVar = (io.ktor.utils.io.e) this.f96963t;
                if (!Intrinsics.areEqual(((ff.a) this.f96964u).a(), kotlin.jvm.internal.v0.b(String.class))) {
                    return null;
                }
                this.f96962s = cVar2;
                this.f96963t = null;
                this.f96961r = 1;
                Object objJ = io.ktor.utils.io.h.j(eVar, this);
                if (objJ == objG) {
                    return objG;
                }
                cVar = cVar2;
                obj = objJ;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cVar = (se.c) this.f96962s;
                kotlin.d.b(obj);
            }
            return z.d(this.f96965v, cVar.p(), (pg.s) obj);
        }
    }

    public static final class d implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return mf.a.d(gf.a.g((Charset) obj), gf.a.g((Charset) obj2));
        }
    }

    public static final class e implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return mf.a.d((Float) ((Pair) obj2).getSecond(), (Float) ((Pair) obj).getSecond());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(pe.d createClientPlugin) {
        Intrinsics.checkNotNullParameter(createClientPlugin, "$this$createClientPlugin");
        List<Pair> listSortedWith = CollectionsKt.sortedWith(MapsKt.toList(((x) createClientPlugin.e()).a()), new e());
        Charset charsetC = ((x) createClientPlugin.e()).c();
        Set setB = ((x) createClientPlugin.e()).b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setB) {
            if (!((x) createClientPlugin.e()).a().containsKey((Charset) obj)) {
                arrayList.add(obj);
            }
        }
        List<Charset> listSortedWith2 = CollectionsKt.sortedWith(arrayList, new d());
        StringBuilder sb2 = new StringBuilder();
        for (Charset charset : listSortedWith2) {
            if (sb2.length() > 0) {
                sb2.append(StringUtils.COMMA);
            }
            sb2.append(gf.a.g(charset));
        }
        for (Pair pair : listSortedWith) {
            Charset charset2 = (Charset) pair.component1();
            float fFloatValue = ((Number) pair.component2()).floatValue();
            if (sb2.length() > 0) {
                sb2.append(StringUtils.COMMA);
            }
            double d10 = fFloatValue;
            if (0.0d > d10 || d10 > 1.0d) {
                throw new IllegalStateException("Check failed.");
            }
            sb2.append(gf.a.g(charset2) + ";q=" + (((double) zf.a.d(100 * fFloatValue)) / 100.0d));
        }
        if (sb2.length() == 0) {
            sb2.append(gf.a.g(charsetC));
        }
        String string = sb2.toString();
        Charset charsetD = ((x) createClientPlugin.e()).d();
        if (charsetD == null && (charsetD = (Charset) CollectionsKt.firstOrNull(listSortedWith2)) == null) {
            Pair pair2 = (Pair) CollectionsKt.firstOrNull(listSortedWith);
            charsetD = pair2 != null ? (Charset) pair2.getFirst() : null;
            if (charsetD == null) {
                charsetD = Charsets.UTF_8;
            }
        }
        createClientPlugin.f(d1.f96749a, new b(string, charsetD, null));
        createClientPlugin.i(new c(charsetC, null));
        return Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(String str, re.d dVar) {
        ve.p headers = dVar.getHeaders();
        ve.u uVar = ve.u.f106718a;
        if (headers.j(uVar.d()) != null) {
            return;
        }
        f96953a.i("Adding Accept-Charset=" + str + " to " + dVar.i());
        dVar.getHeaders().m(uVar.d(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String d(Charset charset, je.b bVar, pg.s sVar) {
        Charset charsetA = ve.y.a(bVar.e());
        if (charsetA != null) {
            charset = charsetA;
        }
        f96953a.i("Reading response body for " + bVar.d().getUrl() + " as String with charset " + charset);
        return hf.g.c(sVar, charset, 0, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ye.c e(Charset charset, re.d dVar, String str, ve.g gVar) {
        Charset charsetA;
        ve.g gVarA = gVar == null ? g.d.f106662a.a() : gVar;
        if (gVar != null && (charsetA = ve.h.a(gVar)) != null) {
            charset = charsetA;
        }
        f96953a.i("Sending request body to " + dVar.i() + " as text/plain with charset " + charset);
        return new ye.e(str, ve.h.b(gVarA, charset), null, 4, null);
    }

    public static final pe.b i() {
        return f96954b;
    }
}
