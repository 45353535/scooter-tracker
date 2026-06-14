package io.bidmachine.analytics.internal.q;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import eg.k0;
import eg.x1;
import io.bidmachine.analytics.internal.q.d;
import java.util.List;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final i f79741l = new i(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Lazy f79742m = lf.i.a(d.f79764a);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Lazy f79743n = lf.i.a(e.f79765a);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Lazy f79744o = lf.i.a(f.f79766a);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Lazy f79745p = lf.i.a(C0961b.f79762a);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Lazy f79746q = lf.i.a(h.f79768a);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Lazy f79747r = lf.i.a(c.f79763a);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Lazy f79748s = lf.i.a(g.f79767a);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Lazy f79749t = lf.i.a(a.f79761a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f79750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile io.bidmachine.analytics.internal.q.c f79751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f79752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f79753d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Lazy f79754e = lf.i.a(o.f79775a);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Lazy f79755f = lf.i.a(new l());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Lazy f79756g = lf.i.a(new m());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Lazy f79757h = lf.i.a(new n());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Lazy f79758i = lf.i.a(new p());

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Lazy f79759j = lf.i.a(new j());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ServiceConnection f79760k = new q();

    static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f79761a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return io.bidmachine.analytics.internal.a.e.a("cGxheUJpbGxpbmdMaWJyYXJ5VmVyc2lvbg==");
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.q.b$b, reason: collision with other inner class name */
    static final class C0961b extends Lambda implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0961b f79762a = new C0961b();

        C0961b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return io.bidmachine.analytics.internal.a.e.a("VkVSU0lPTl9OQU1F");
        }
    }

    static final class c extends Lambda implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f79763a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return io.bidmachine.analytics.internal.a.e.a("Y29tLmFuZHJvaWQudmVuZGluZy5iaWxsaW5nLkluQXBwQmlsbGluZ1NlcnZpY2UuQklORA==");
        }
    }

    static final class d extends Lambda implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f79764a = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return io.bidmachine.analytics.internal.a.e.a("Y29tLmFuZHJvaWQuYmlsbGluZ2NsaWVudC5CdWlsZENvbmZpZw==");
        }
    }

    static final class e extends Lambda implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f79765a = new e();

        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return io.bidmachine.analytics.internal.a.e.a("Y29tLmFuZHJvaWQuYmlsbGluZ2NsaWVudC5rdHguQnVpbGRDb25maWc=");
        }
    }

    static final class f extends Lambda implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f79766a = new f();

        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return io.bidmachine.analytics.internal.a.e.a("Y29tLmdvb2dsZS5hbmRyb2lkLnBsYXkuYmlsbGluZ2NsaWVudC52ZXJzaW9u");
        }
    }

    static final class g extends Lambda implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f79767a = new g();

        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return io.bidmachine.analytics.internal.a.e.a("Y29tLmFuZHJvaWQudmVuZGluZw==");
        }
    }

    static final class h extends Lambda implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f79768a = new h();

        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return io.bidmachine.analytics.internal.a.e.a("Y29tLmFuZHJvaWQudmVuZGluZy5CSUxMSU5H");
        }
    }

    public static final class i {
        public /* synthetic */ i(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return (String) b.f79749t.getValue();
        }

        public final String b() {
            return (String) b.f79745p.getValue();
        }

        public final String c() {
            return (String) b.f79747r.getValue();
        }

        public final String d() {
            return (String) b.f79742m.getValue();
        }

        public final String e() {
            return (String) b.f79743n.getValue();
        }

        public final String f() {
            return (String) b.f79744o.getValue();
        }

        public final String g() {
            return (String) b.f79748s.getValue();
        }

        public final String h() {
            return (String) b.f79746q.getValue();
        }

        private i() {
        }
    }

    static final class j extends Lambda implements Function0 {
        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final io.bidmachine.analytics.internal.a.f invoke() {
            Object objB;
            io.bidmachine.analytics.internal.a.f fVarA;
            b bVar = b.this;
            try {
                Result.Companion companion = Result.f93230c;
                String strP = bVar.p();
                if (strP == null || (fVarA = io.bidmachine.analytics.internal.a.f.f79519d.a(strP)) == null) {
                    String strN = bVar.n();
                    fVarA = strN != null ? io.bidmachine.analytics.internal.a.f.f79519d.a(strN) : null;
                }
                objB = Result.b(fVarA);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.f93230c;
                objB = Result.b(kotlin.d.a(th2));
            }
            return (io.bidmachine.analytics.internal.a.f) (Result.i(objB) ? null : objB);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f79770a;

        k(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return b.this.new k(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f79770a;
            if (i10 != 0 && i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            while (b.this.f79751b == null) {
                this.f79770a = 1;
                if (k0.a(100L, this) == objG) {
                    return objG;
                }
            }
            io.bidmachine.analytics.internal.q.c cVar = b.this.f79751b;
            if (cVar != null) {
                return cVar.s();
            }
            return null;
        }
    }

    static final class l extends Lambda implements Function0 {
        l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return b.this.a(b.f79741l.d());
        }
    }

    static final class m extends Lambda implements Function0 {
        m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return b.this.a(b.f79741l.e());
        }
    }

    static final class n extends Lambda implements Function0 {
        n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return b.this.m();
        }
    }

    static final class o extends Lambda implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final o f79775a = new o();

        o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.random.d invoke() {
            return kotlin.random.e.a(System.nanoTime());
        }
    }

    static final class p extends Lambda implements Function0 {
        p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            String strO = b.this.o();
            if (strO != null) {
                return strO;
            }
            String strN = b.this.n();
            return strN == null ? b.this.p() : strN;
        }
    }

    public static final class q implements ServiceConnection {
        q() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            io.bidmachine.analytics.internal.q.c cVar;
            io.bidmachine.analytics.internal.a.f fVarL = b.this.l();
            if (fVarL == null) {
                throw new IllegalArgumentException("Version not found in connected callback");
            }
            b bVar = b.this;
            String strR = bVar.r();
            if (strR != null) {
                b bVar2 = b.this;
                cVar = new io.bidmachine.analytics.internal.q.c(new d.a(iBinder, d.a.f79824d.a(fVarL), null, 4, null), bVar2.f79750a.getPackageName(), fVarL, strR, bVar2.q().l());
            } else {
                cVar = null;
            }
            bVar.f79751b = cVar;
            b bVar3 = b.this;
            bVar3.f79752c = bVar3.f79751b != null;
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            b.this.f79752c = false;
            b.this.f79751b = null;
        }
    }

    public b(Context context) {
        this.f79750a = context;
    }

    private final Intent k() {
        i iVar = f79741l;
        Intent intent = new Intent(iVar.c());
        intent.setPackage(iVar.g());
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String m() {
        Object objB;
        try {
            Result.Companion companion = Result.f93230c;
            Bundle bundle = this.f79750a.getPackageManager().getApplicationInfo(this.f79750a.getPackageName(), 128).metaData;
            objB = Result.b(bundle != null ? bundle.getString(f79741l.f()) : null);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        return (String) (Result.i(objB) ? null : objB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String n() {
        return (String) this.f79755f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String o() {
        return (String) this.f79756g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String p() {
        return (String) this.f79757h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.random.d q() {
        return (kotlin.random.d) this.f79754e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String r() {
        return (String) this.f79758i.getValue();
    }

    private final ComponentName s() {
        ServiceInfo serviceInfo;
        List<ResolveInfo> listQueryIntentServices = this.f79750a.getPackageManager().queryIntentServices(k(), 0);
        if (!listQueryIntentServices.isEmpty() && (serviceInfo = listQueryIntentServices.get(0).serviceInfo) != null) {
            String str = serviceInfo.packageName;
            String str2 = serviceInfo.name;
            if (Intrinsics.areEqual(f79741l.g(), str) && str2 != null) {
                return new ComponentName(str, str2);
            }
        }
        return null;
    }

    public final void i() {
        ComponentName componentNameS = s();
        if (componentNameS == null) {
            throw new IllegalArgumentException("Component name not found");
        }
        String strR = r();
        if (strR == null) {
            throw new IllegalArgumentException("Library version not found");
        }
        Context context = this.f79750a;
        Intent intentK = k();
        intentK.setComponent(componentNameS);
        intentK.putExtra(f79741l.a(), strR);
        if (!context.bindService(intentK, this.f79760k, 1)) {
            throw new IllegalStateException("Can't connect");
        }
        this.f79753d = true;
    }

    public final void j() {
        if (this.f79753d) {
            this.f79750a.unbindService(this.f79760k);
        }
        this.f79753d = false;
    }

    public final io.bidmachine.analytics.internal.a.f l() {
        return (io.bidmachine.analytics.internal.a.f) this.f79759j.getValue();
    }

    public final boolean t() {
        return this.f79750a.getPackageManager().checkPermission(f79741l.h(), this.f79750a.getPackageName()) == 0;
    }

    public final boolean u() {
        return s() != null;
    }

    public final Object a(long j10, Continuation continuation) {
        return x1.e(j10, new k(null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String a(String str) {
        Object objB;
        try {
            Result.Companion companion = Result.f93230c;
            Object obj = Class.forName(str).getField(f79741l.b()).get(null);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
            objB = Result.b((String) obj);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        return (String) (Result.i(objB) ? null : objB);
    }
}
