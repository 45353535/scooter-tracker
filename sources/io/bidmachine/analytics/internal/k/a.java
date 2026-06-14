package io.bidmachine.analytics.internal.k;

import android.content.Context;
import android.os.Bundle;
import eg.k0;
import eg.m1;
import io.bidmachine.analytics.internal.g.e;
import io.bidmachine.analytics.internal.i.a;
import io.bidmachine.analytics.internal.j.a;
import io.bidmachine.analytics.internal.m.a;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.time.b;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.a0;
import pd.g0;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends io.bidmachine.analytics.internal.j.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final h f79613m = new h(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Lazy f79614n = lf.i.a(d.f79629a);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Lazy f79615o = lf.i.a(c.f79628a);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Lazy f79616p = lf.i.a(b.f79627a);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Lazy f79617q = lf.i.a(C0952a.f79626a);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Lazy f79618r = lf.i.a(g.f79632a);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Lazy f79619s = lf.i.a(e.f79630a);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Lazy f79620t = lf.i.a(f.f79631a);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final i f79621h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f79622i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Lazy f79623j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List f79624k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private volatile Bundle f79625l;

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.k.a$a, reason: collision with other inner class name */
    static final class C0952a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0952a f79626a = new C0952a();

        C0952a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return io.bidmachine.analytics.internal.a.e.a("YW5kcm9pZC5vcy5CdW5kbGU=");
        }
    }

    static final class b extends Lambda implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f79627a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return io.bidmachine.analytics.internal.a.e.a("Y29tLnNhZmVkay5hbmRyb2lkLnV0aWxzLlBlcnNpc3RlbnRDb25jdXJyZW50SGFzaE1hcA==");
        }
    }

    static final class c extends Lambda implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f79628a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return io.bidmachine.analytics.internal.a.e.a("Y29tLnNhZmVkay5hbmRyb2lkLmFuYWx5dGljcy5TdGF0c0NvbGxlY3Rvcg==");
        }
    }

    static final class d extends Lambda implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f79629a = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i invoke() {
            h hVar = a.f79613m;
            return new i(hVar.c(), hVar.b());
        }
    }

    static final class e extends Lambda implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f79630a = new e();

        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return io.bidmachine.analytics.internal.a.e.a("Y2xpY2tfdXJs");
        }
    }

    static final class f extends Lambda implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f79631a = new f();

        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return io.bidmachine.analytics.internal.a.e.a("ZXZlbnRfaWQ=");
        }
    }

    static final class g extends Lambda implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f79632a = new g();

        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return io.bidmachine.analytics.internal.a.e.a("aXNfY2xpY2tlZA==");
        }
    }

    public static final class h {
        public /* synthetic */ h(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return (String) a.f79617q.getValue();
        }

        public final String b() {
            return (String) a.f79616p.getValue();
        }

        public final String c() {
            return (String) a.f79615o.getValue();
        }

        public final i d() {
            return (i) a.f79614n.getValue();
        }

        public final String e() {
            return (String) a.f79619s.getValue();
        }

        public final String f() {
            return (String) a.f79620t.getValue();
        }

        public final String g() {
            return (String) a.f79618r.getValue();
        }

        private h() {
        }
    }

    public static final class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f79633a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f79634b;

        public i(String str, String str2) {
            this.f79633a = str;
            this.f79634b = str2;
        }

        public final String a() {
            return this.f79634b;
        }

        public final String b() {
            return this.f79633a;
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f79635a;

        j(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return a.this.new j(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            long jS;
            Object objG = pf.b.g();
            int i10 = this.f79635a;
            if (i10 != 0 && i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            do {
                Object objL = a.this.l();
                if (Result.j(objL)) {
                    b.a aVar = kotlin.time.b.f93560c;
                    jS = kotlin.time.c.s(2, cg.b.f6839f);
                } else {
                    if (Result.g(objL) instanceof IllegalStateException) {
                        return Unit.f93236a;
                    }
                    b.a aVar2 = kotlin.time.b.f93560c;
                    jS = kotlin.time.c.s(30, cg.b.f6839f);
                }
                this.f79635a = 1;
            } while (k0.b(jS, this) != objG);
            return objG;
        }
    }

    static final class k extends Lambda implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ io.bidmachine.analytics.internal.a.d f79637a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(io.bidmachine.analytics.internal.a.d dVar) {
            super(0);
            this.f79637a = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CoroutineScope invoke() {
            return kotlinx.coroutines.i.a(m1.b(null, 1, null).plus(this.f79637a.b()));
        }
    }

    public /* synthetic */ a(i iVar, io.bidmachine.analytics.internal.a.d dVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? f79613m.d() : iVar, (i10 & 2) != 0 ? io.bidmachine.analytics.internal.a.d.f79505g.a() : dVar);
    }

    private final Object k() {
        try {
            Result.Companion companion = Result.f93230c;
            Class<?> cls = Class.forName(this.f79621h.b());
            for (Field field : cls.getDeclaredFields()) {
                if (Modifier.isStatic(field.getModifiers()) && field.getType() == cls) {
                    field.setAccessible(true);
                    Result.Companion companion2 = Result.f93230c;
                    return Result.b(field.get(null));
                }
            }
            return Result.b(null);
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.f93230c;
            return Result.b(kotlin.d.a(th2));
        }
    }

    @Override // io.bidmachine.analytics.internal.h.d
    public String a() {
        return this.f79622i;
    }

    @Override // io.bidmachine.analytics.internal.h.d
    public void d(Context context) {
    }

    public final CoroutineScope j() {
        return (CoroutineScope) this.f79623j.getValue();
    }

    public final Object l() {
        try {
            Result.Companion companion = Result.f93230c;
            Object objK = k();
            Object obj = Result.i(objK) ? null : objK;
            if (obj == null) {
                if (Result.i(objK)) {
                    a(e.a.MONITOR_INVALID, "Collector not found");
                    return Result.b(kotlin.d.a(new IllegalStateException()));
                }
                a(e.a.MONITOR_NO_CONTENT, "Collector disabled");
                return Result.b(kotlin.d.a(new RuntimeException()));
            }
            Object objD = d(obj);
            Object obj2 = Result.i(objD) ? null : objD;
            if (obj2 == null) {
                if (!Result.i(objD)) {
                    return Result.b(Unit.f93236a);
                }
                a(e.a.MONITOR_INVALID, "List not found");
                return Result.b(kotlin.d.a(new IllegalStateException()));
            }
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) obj2;
            Iterator it = CollectionsKt.toSet(concurrentHashMap.keySet()).iterator();
            while (it.hasNext()) {
                Object obj3 = concurrentHashMap.get(it.next());
                if (obj3 != null) {
                    Object objC = c(obj3);
                    if (Result.i(objC)) {
                        objC = null;
                    }
                    Bundle bundle = (Bundle) objC;
                    if (bundle != null) {
                        a(bundle);
                    }
                }
            }
            return Result.b(Unit.f93236a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            return Result.b(kotlin.d.a(th2));
        }
    }

    @Override // io.bidmachine.analytics.internal.h.d
    /* JADX INFO: renamed from: a */
    public void b(a.C0950a c0950a) throws ClassNotFoundException {
        super.b(c0950a);
        Class.forName(this.f79621h.b());
    }

    @Override // io.bidmachine.analytics.internal.j.a
    public a.b b(Map map) {
        String string;
        Boolean boolI;
        h hVar = f79613m;
        Object obj = map.get(hVar.f());
        if (obj == null || (string = obj.toString()) == null) {
            string = UUID.randomUUID().toString();
        }
        Object obj2 = map.get(hVar.e());
        String string2 = obj2 != null ? obj2.toString() : null;
        Object obj3 = map.get(hVar.g());
        return new a.b(string, 0, null, null, string2, (obj3 == null || (boolI = g0.I(obj3, null, 1, null)) == null) ? false : boolI.booleanValue(), 14, null);
    }

    @Override // io.bidmachine.analytics.internal.j.a
    public a.EnumC0951a c(Map map) {
        String string;
        String upperCase;
        Object obj = map.get("ad_format_type");
        if (obj != null && (string = obj.toString()) != null && (upperCase = string.toUpperCase(Locale.US)) != null) {
            a.j jVar = io.bidmachine.analytics.internal.m.a.f79642k;
            if (Intrinsics.areEqual(upperCase, jVar.a()) ? true : Intrinsics.areEqual(upperCase, jVar.e()) ? true : Intrinsics.areEqual(upperCase, jVar.d())) {
                return a.EnumC0951a.BANNER;
            }
            if (Intrinsics.areEqual(upperCase, jVar.b()) ? true : Intrinsics.areEqual(upperCase, jVar.c())) {
                return a.EnumC0951a.INTERSTITIAL;
            }
            if (Intrinsics.areEqual(upperCase, jVar.g()) ? true : Intrinsics.areEqual(upperCase, jVar.h()) ? true : Intrinsics.areEqual(upperCase, jVar.i())) {
                return a.EnumC0951a.REWARDED;
            }
            if (Intrinsics.areEqual(upperCase, jVar.f())) {
                return a.EnumC0951a.NATIVE;
            }
        }
        return null;
    }

    @Override // io.bidmachine.analytics.internal.h.d
    public void e(Context context) {
        a0.j(j().getCoroutineContext(), null, 1, null);
    }

    @Override // io.bidmachine.analytics.internal.j.a, io.bidmachine.analytics.internal.h.d
    public void f(Context context) {
        super.f(context);
        eg.i.d(j(), null, null, new j(null), 3, null);
    }

    private final Object d(Object obj) {
        Field field;
        try {
            Result.Companion companion = Result.f93230c;
            Class<?> cls = Class.forName(this.f79621h.a());
            Field[] declaredFields = obj.getClass().getDeclaredFields();
            int length = declaredFields.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    field = null;
                    break;
                }
                field = declaredFields[i10];
                if (!Modifier.isStatic(field.getModifiers()) && cls.isAssignableFrom(field.getType())) {
                    break;
                }
                i10++;
            }
            if (field == null) {
                return Result.b(null);
            }
            field.setAccessible(true);
            Result.Companion companion2 = Result.f93230c;
            return Result.b(field.get(obj));
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.f93230c;
            return Result.b(kotlin.d.a(th2));
        }
    }

    public a(i iVar, io.bidmachine.analytics.internal.a.d dVar) {
        this.f79621h = iVar;
        this.f79622i = "bic";
        this.f79623j = lf.i.a(new k(dVar));
        this.f79624k = CollectionsKt.emptyList();
    }

    private final void a(Bundle bundle) {
        h hVar = f79613m;
        String str = bundle.getString(hVar.f(), "") + '-' + bundle.getBoolean(hVar.g(), false);
        if (this.f79624k.contains(str)) {
            return;
        }
        this.f79625l = bundle;
        List mutableList = CollectionsKt.toMutableList((Collection) this.f79624k);
        mutableList.add(str);
        if (mutableList.size() > 30) {
            CollectionsKt.removeFirstOrNull(mutableList);
        }
        this.f79624k = CollectionsKt.toList(mutableList);
        a(io.bidmachine.analytics.internal.a.e.a(bundle));
    }

    public final Object c(Object obj) {
        Method method;
        try {
            Result.Companion companion = Result.f93230c;
            Class<?> cls = obj.getClass();
            Class<?> cls2 = Class.forName(f79613m.a());
            Method[] declaredMethods = cls.getDeclaredMethods();
            int length = declaredMethods.length;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    method = null;
                    break;
                }
                method = declaredMethods[i11];
                if (io.bidmachine.analytics.internal.k.b.a(method) == 0 && cls2.isAssignableFrom(method.getReturnType())) {
                    break;
                }
                i11++;
            }
            if (method == null) {
                Method[] methods = cls.getMethods();
                int length2 = methods.length;
                while (true) {
                    if (i10 >= length2) {
                        break;
                    }
                    Method method2 = methods[i10];
                    if (io.bidmachine.analytics.internal.k.b.a(method2) == 0 && cls2.isAssignableFrom(method2.getReturnType())) {
                        method = method2;
                        break;
                    }
                    i10++;
                }
            }
            if (method == null) {
                return Result.b(null);
            }
            method.setAccessible(true);
            Object objInvoke = method.invoke(obj, null);
            Result.Companion companion2 = Result.f93230c;
            return Result.b((Bundle) objInvoke);
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.f93230c;
            return Result.b(kotlin.d.a(th2));
        }
    }

    private final void a(e.a aVar, String str) {
        this.f79625l = null;
        a(new io.bidmachine.analytics.internal.g.e("bic", aVar, str));
    }
}
