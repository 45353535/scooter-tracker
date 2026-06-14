package t2;

import android.content.Context;
import com.facebook.internal.e;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import t2.l;
import t2.o;
import t2.u;

/* JADX INFO: loaded from: classes7.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f104824a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f104825b = new AtomicBoolean(false);

    private h() {
    }

    private final void d(u.a aVar, String str) {
        if (e3.a.d(this)) {
            return;
        }
        try {
            boolean zE = r.e();
            if (zE) {
                r.g();
            }
            if (aVar == u.a.V2_V4) {
                l.b bVar = l.f104833q;
                r.d(bVar.c(), bVar.e(), false, str, aVar, zE);
                r.d(bVar.f(), bVar.e(), true, str, aVar, zE);
                bVar.c().clear();
                bVar.f().clear();
            } else {
                o.a aVar2 = o.N;
                r.d(aVar2.c(), aVar2.e(), false, str, aVar, zE);
                r.d(aVar2.f(), aVar2.e(), true, str, aVar, zE);
                aVar2.c().clear();
                aVar2.f().clear();
            }
            if (zE) {
                r.h();
            }
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    public static final synchronized void e(final Context context, final u.a billingClientVersion) {
        if (e3.a.d(h.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(billingClientVersion, "billingClientVersion");
            AtomicBoolean atomicBoolean = f104825b;
            if (atomicBoolean.get()) {
                return;
            }
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            u.a aVar = u.a.V2_V4;
            if (billingClientVersion == aVar) {
                ref$ObjectRef.f93280b = l.f104833q.d(context);
            } else if (billingClientVersion == u.a.V5_V7) {
                ref$ObjectRef.f93280b = o.N.d(context);
            }
            if (ref$ObjectRef.f93280b == null) {
                atomicBoolean.set(true);
                return;
            }
            if (!com.facebook.internal.e.g(e.b.AndroidIAPSubscriptionAutoLogging) || (u2.e.d() && billingClientVersion != aVar)) {
                ((i) ref$ObjectRef.f93280b).a(u.b.INAPP, new Runnable() { // from class: t2.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.h(billingClientVersion, context);
                    }
                });
            } else {
                ((i) ref$ObjectRef.f93280b).a(u.b.INAPP, new Runnable() { // from class: t2.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.f(ref$ObjectRef, billingClientVersion, context);
                    }
                });
            }
        } catch (Throwable th2) {
            e3.a.b(th2, h.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Ref$ObjectRef billingClientWrapper, final u.a billingClientVersion, final Context context) {
        if (e3.a.d(h.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(billingClientWrapper, "$billingClientWrapper");
            Intrinsics.checkNotNullParameter(billingClientVersion, "$billingClientVersion");
            Intrinsics.checkNotNullParameter(context, "$context");
            ((i) billingClientWrapper.f93280b).a(u.b.SUBS, new Runnable() { // from class: t2.g
                @Override // java.lang.Runnable
                public final void run() {
                    h.g(billingClientVersion, context);
                }
            });
        } catch (Throwable th2) {
            e3.a.b(th2, h.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(u.a billingClientVersion, Context context) {
        if (e3.a.d(h.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(billingClientVersion, "$billingClientVersion");
            Intrinsics.checkNotNullParameter(context, "$context");
            h hVar = f104824a;
            String packageName = context.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
            hVar.d(billingClientVersion, packageName);
        } catch (Throwable th2) {
            e3.a.b(th2, h.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(u.a billingClientVersion, Context context) {
        if (e3.a.d(h.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(billingClientVersion, "$billingClientVersion");
            Intrinsics.checkNotNullParameter(context, "$context");
            h hVar = f104824a;
            String packageName = context.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
            hVar.d(billingClientVersion, packageName);
        } catch (Throwable th2) {
            e3.a.b(th2, h.class);
        }
    }
}
