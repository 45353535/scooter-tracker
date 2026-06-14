package f1;

import android.content.Context;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.ironsource.N6;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class h9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f70011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s3 f70012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ba f70013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y f70014d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CoroutineDispatcher f70015e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Lazy f70016f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Lazy f70017g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Lazy f70018h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile Job f70019i;

    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f70020f = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final AtomicReference invoke() {
            return new AtomicReference(null);
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f70021r;

        public b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return h9.this.new b(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f70021r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            h9.this.i();
            h9.this.f70019i = null;
            return Unit.f93236a;
        }
    }

    public static final class c extends Lambda implements Function1 {
        public c() {
            super(1);
        }

        public final void a(AppSetIdInfo appSetIdInfo) {
            h9.this.c(appSetIdInfo);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((AppSetIdInfo) obj);
            return Unit.f93236a;
        }
    }

    public static final class d extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final d f70024f = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final AtomicReference invoke() {
            return new AtomicReference(null);
        }
    }

    public static final class e extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final e f70025f = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final AtomicInteger invoke() {
            return new AtomicInteger();
        }
    }

    public h9(Context context, s3 android2, ba ifa, y base64Wrapper, CoroutineDispatcher ioDispatcher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(android2, "android");
        Intrinsics.checkNotNullParameter(ifa, "ifa");
        Intrinsics.checkNotNullParameter(base64Wrapper, "base64Wrapper");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.f70011a = context;
        this.f70012b = android2;
        this.f70013c = ifa;
        this.f70014d = base64Wrapper;
        this.f70015e = ioDispatcher;
        this.f70016f = lf.i.a(d.f70024f);
        this.f70017g = lf.i.a(e.f70025f);
        this.f70018h = lf.i.a(a.f70020f);
        m();
    }

    public static final void g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public final kf a(Context context) {
        try {
            e1 e1VarA = this.f70013c.a();
            eg.j("IFA: " + e1VarA, null, 2, null);
            String strA = e1VarA.a();
            f6 f6VarB = e1VarA.b();
            String strB = this.f70013c.b(context, f6VarB == f6.f69803e);
            if (strA != null) {
                strB = "000000000";
            }
            String str = strB;
            String strD = b1.b.d();
            if (h8.f70006a.g()) {
                h8.d(strA);
                h8.f(str);
            }
            return new kf(f6VarB, b(strA, str, strD), str, strA, (String) k().get(), Integer.valueOf(l().get()), strD);
        } catch (Exception e10) {
            String message = e10.getMessage();
            if (message != null) {
                eg.j(message, null, 2, null);
            }
            return new kf(null, null, null, null, null, null, null, 127, null);
        }
    }

    public final String b(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        if (str != null) {
            bb.d(jSONObject, N6.V0, str);
        } else if (str2 != null) {
            bb.d(jSONObject, CommonUrlParts.UUID, str2);
        }
        String str4 = (String) k().get();
        if (str4 != null) {
            bb.d(jSONObject, "appsetid", str4);
        }
        if (str3 != null) {
            bb.d(jSONObject, "instance_id", str3);
        }
        y yVar = this.f70014d;
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return yVar.c(string);
    }

    public final void c(AppSetIdInfo appSetIdInfo) {
        if (appSetIdInfo != null) {
            k().set(appSetIdInfo.getId());
            l().set(appSetIdInfo.getScope());
        }
    }

    public final boolean h() {
        return true;
    }

    public final void i() {
        n();
        j().set(a(this.f70011a));
    }

    public final AtomicReference j() {
        return (AtomicReference) this.f70018h.getValue();
    }

    public final AtomicReference k() {
        return (AtomicReference) this.f70016f.getValue();
    }

    public final AtomicInteger l() {
        return (AtomicInteger) this.f70017g.getValue();
    }

    public final void m() {
        try {
            this.f70019i = eg.i.d(kotlinx.coroutines.i.a(this.f70015e), null, null, new b(null), 3, null);
        } catch (Throwable th2) {
            eg.i("Error launching identity job", th2);
        }
    }

    public final void n() {
        try {
            if (!h()) {
                eg.j("AppSetId dependency not present", null, 2, null);
                return;
            }
            Task taskA = this.f70012b.a(this.f70011a);
            if (taskA != null) {
                final c cVar = new c();
                taskA.addOnSuccessListener(new OnSuccessListener() { // from class: f1.g9
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(Object obj) {
                        h9.g(cVar, obj);
                    }
                });
            }
        } catch (Exception e10) {
            eg.i("Error requesting AppSetId", e10);
        }
    }

    public final kf o() {
        if (this.f70019i == null) {
            m();
            Unit unit = Unit.f93236a;
        }
        kf kfVar = (kf) j().get();
        return kfVar == null ? a(this.f70011a) : kfVar;
    }

    public /* synthetic */ h9(Context context, s3 s3Var, ba baVar, y yVar, CoroutineDispatcher coroutineDispatcher, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, s3Var, baVar, yVar, (i10 & 16) != 0 ? eg.o0.b() : coroutineDispatcher);
    }
}
