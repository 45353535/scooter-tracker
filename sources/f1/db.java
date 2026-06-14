package f1;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class db {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f69642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f69643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ua f69644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f3 f69645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h9 f69646e;

    public db(Context context, ScheduledExecutorService backgroundExecutor, ua sdkInitializer, f3 tokenGenerator, h9 identity) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(backgroundExecutor, "backgroundExecutor");
        Intrinsics.checkNotNullParameter(sdkInitializer, "sdkInitializer");
        Intrinsics.checkNotNullParameter(tokenGenerator, "tokenGenerator");
        Intrinsics.checkNotNullParameter(identity, "identity");
        this.f69642a = context;
        this.f69643b = backgroundExecutor;
        this.f69644c = sdkInitializer;
        this.f69645d = tokenGenerator;
        this.f69646e = identity;
    }

    public static final void a(db this$0, String appId, String appSignature, d1.f onStarted, e1.c cVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(appId, "$appId");
        Intrinsics.checkNotNullParameter(appSignature, "$appSignature");
        Intrinsics.checkNotNullParameter(onStarted, "$onStarted");
        this$0.d();
        ld.f70416c.b(this$0.f69642a);
        this$0.f69644c.e(appId, appSignature, onStarted, cVar);
    }

    public static /* synthetic */ void b(db dbVar, String str, String str2, d1.f fVar, e1.c cVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            cVar = null;
        }
        dbVar.c(str, str2, fVar, cVar);
    }

    public final void c(final String appId, final String appSignature, final d1.f onStarted, final e1.c cVar) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(appSignature, "appSignature");
        Intrinsics.checkNotNullParameter(onStarted, "onStarted");
        this.f69643b.execute(new Runnable() { // from class: f1.cb
            @Override // java.lang.Runnable
            public final void run() {
                db.a(this.f69523b, appId, appSignature, onStarted, cVar);
            }
        });
    }

    public final void d() {
        try {
            Thread.sleep(100L);
            this.f69646e.o();
        } catch (Exception e10) {
            eg.e("startIdentity error " + e10, null, 2, null);
        }
    }
}
