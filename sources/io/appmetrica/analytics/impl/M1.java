package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.executors.BlockingExecutor;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrash;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashServiceConfig;
import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;
import j$.util.Objects;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes12.dex */
public final class M1 implements A1, InterfaceC5408s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f76106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f76107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile InterfaceC5584z1 f76108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C5161i4 f76109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final T1 f76110e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Xg f76111f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C5244la f76112g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C5336p2 f76113h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final N1 f76114i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C5173ih f76115j;

    @MainThread
    public M1(@NonNull Context context, @NonNull InterfaceC5584z1 interfaceC5584z1) {
        this(context, interfaceC5584z1, new C5213k5(context));
    }

    public final void a() {
        this.f76110e.c(new S1() { // from class: io.appmetrica.analytics.impl.kp
            @Override // io.appmetrica.analytics.impl.S1
            public final void a(Intent intent) {
                this.f77634a.d(intent);
            }
        });
    }

    @Override // io.appmetrica.analytics.impl.A1
    @WorkerThread
    public final void b(Intent intent) {
        this.f76110e.d(intent);
        if (intent != null) {
            String action = intent.getAction();
            Uri data = intent.getData();
            String encodedAuthority = data == null ? null : data.getEncodedAuthority();
            if (!"io.appmetrica.analytics.IAppMetricaService".equals(action) || encodedAuthority == null || data == null || !Objects.equals(data.getPath(), "/client")) {
                return;
            }
            int i10 = Integer.parseInt(data.getQueryParameter("pid"));
            this.f76109d.a(encodedAuthority, Integer.valueOf(i10), data.getQueryParameter("psid"));
            this.f76113h.a(i10);
        }
    }

    @Override // io.appmetrica.analytics.impl.A1
    @WorkerThread
    public final void c(Intent intent) {
        T1 t12 = this.f76110e;
        if (intent == null) {
            t12.getClass();
            return;
        }
        t12.getClass();
        String action = intent.getAction();
        if (!TextUtils.isEmpty(action)) {
            t12.f76477a.a(action, Integer.valueOf(T1.a(intent)));
        }
        for (Map.Entry entry : t12.f76478b.entrySet()) {
            S1 s12 = (S1) entry.getKey();
            if (((R1) entry.getValue()).a(intent)) {
                s12.a(intent);
            }
        }
    }

    public final void d(Intent intent) {
        C5468ua.H.v().a(AbstractC5295nb.e(intent.getStringExtra("screen_size")));
    }

    @Override // io.appmetrica.analytics.impl.A1
    @WorkerThread
    public final void onConfigurationChanged(@NonNull Configuration configuration) {
        C5468ua.H.v().a(configuration);
    }

    @Override // io.appmetrica.analytics.impl.A1
    @WorkerThread
    public final void onCreate() {
        if (this.f76106a) {
            C5468ua.H.v().a(this.f76107b.getResources().getConfiguration());
        } else {
            this.f76112g.b(this.f76107b);
            C5468ua c5468ua = C5468ua.H;
            synchronized (c5468ua) {
                c5468ua.B.initAsync();
                c5468ua.f78372u.a(c5468ua.f78352a);
                c5468ua.f78372u.a(new lo(c5468ua.B));
                NetworkServiceLocator.init(new C5264m5(new C5476ui(c5468ua.h()), new C5513w5(c5468ua.f78352a)));
                c5468ua.l().a(c5468ua.f78368q);
                c5468ua.E();
            }
            AbstractC4996bk.f76918a.e();
            C5256lm c5256lm = C5468ua.H.f78372u;
            c5256lm.b();
            C5204jm c5204jmB = c5256lm.b();
            Ck ckP = C5468ua.H.p();
            ckP.a(new C5151hk(new C5144hd(this.f76110e)), c5204jmB);
            c5256lm.a(ckP);
            ((El) C5468ua.H.A()).getClass();
            a();
            C5468ua.H.m().init();
            C5468ua.H.c().init();
            N1 n12 = this.f76114i;
            Context context = this.f76107b;
            C5161i4 c5161i4 = this.f76109d;
            n12.getClass();
            this.f76111f = new Xg(context, c5161i4);
            Context context2 = this.f76107b;
            AbstractC5434t1.f78254a.b(context2);
            AppMetrica.getReporter(context2, "20799a27-fa80-4b36-b2db-0f8141f24180");
            Context context3 = this.f76107b;
            Xg xg2 = this.f76111f;
            Vd vdR = C5468ua.k().r();
            IHandlerExecutor iHandlerExecutorE = C5468ua.k().x().e();
            C5290n6 c5290n6 = new C5290n6(context3, xg2, EnumC5168ib.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE, new X(), new BlockingExecutor(), "previous");
            C5290n6 c5290n62 = new C5290n6(context3, xg2, EnumC5168ib.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE, new C5444tb(), iHandlerExecutorE, "actual");
            File crashesDirectory = FileUtils.getCrashesDirectory(context3);
            if (crashesDirectory != null) {
                FileObserverC5240l6 fileObserverC5240l6 = new FileObserverC5240l6(crashesDirectory, c5290n62, new C5141ha());
                iHandlerExecutorE.execute(new Zf(crashesDirectory, c5290n6));
                if (!crashesDirectory.exists()) {
                    crashesDirectory.mkdir();
                } else if (!crashesDirectory.isDirectory() && crashesDirectory.delete()) {
                    crashesDirectory.mkdir();
                }
                fileObserverC5240l6.startWatching();
                C5468ua.H.E.storeReference(fileObserverC5240l6);
            }
            vdR.getClass();
            File nativeCrashDirectory = FileUtils.getNativeCrashDirectory(context3);
            String absolutePath = nativeCrashDirectory != null ? nativeCrashDirectory.getAbsolutePath() : null;
            if (absolutePath != null) {
                vdR.f76593a.init(context3, new NativeCrashServiceConfig(absolutePath));
                List<NativeCrash> allCrashes = vdR.f76593a.getAllCrashes();
                if (!allCrashes.isEmpty()) {
                    Qd qdB = vdR.f76594b.b(context3, xg2);
                    Iterator<T> it = allCrashes.iterator();
                    while (it.hasNext()) {
                        qdB.newCrash((NativeCrash) it.next());
                    }
                }
                vdR.f76593a.setDefaultCrashHandler(vdR.f76594b.a(context3, xg2));
            }
            new P5(CollectionsKt.listOf(new RunnableC5045dh())).run();
            this.f76106a = true;
        }
        C5468ua.H.l().a();
    }

    @Override // io.appmetrica.analytics.impl.A1
    @MainThread
    public final void onDestroy() {
        Mb mbL = C5468ua.H.l();
        synchronized (mbL) {
            Iterator it = mbL.f76124c.iterator();
            while (it.hasNext()) {
                ((InterfaceC5354pk) it.next()).onDestroy();
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.A1
    @WorkerThread
    public final void pauseUserSession(@NonNull Bundle bundle) {
        Gf gf2;
        bundle.setClassLoader(Gf.class.getClassLoader());
        String str = Gf.f75823c;
        try {
            gf2 = (Gf) bundle.getParcelable("PROCESS_CFG_OBJ");
        } catch (Throwable unused) {
            gf2 = null;
        }
        Integer asInteger = gf2 != null ? gf2.f75824a.getAsInteger("PROCESS_CFG_PROCESS_ID") : null;
        if (asInteger != null) {
            this.f76113h.b(asInteger.intValue());
        }
    }

    @Override // io.appmetrica.analytics.impl.A1
    @WorkerThread
    public final void reportData(int i10, Bundle bundle) {
        this.f76115j.getClass();
        List listEmptyList = (List) C5468ua.H.f78373v.f77537a.get(Integer.valueOf(i10));
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        if (listEmptyList.isEmpty()) {
            return;
        }
        Iterator it = listEmptyList.iterator();
        while (it.hasNext()) {
            ((InterfaceC5176ik) it.next()).reportData(i10, bundle);
        }
    }

    @Override // io.appmetrica.analytics.impl.A1
    @WorkerThread
    public final void resumeUserSession(@NonNull Bundle bundle) {
        Gf gf2;
        bundle.setClassLoader(Gf.class.getClassLoader());
        String str = Gf.f75823c;
        try {
            gf2 = (Gf) bundle.getParcelable("PROCESS_CFG_OBJ");
        } catch (Throwable unused) {
            gf2 = null;
        }
        Integer asInteger = gf2 != null ? gf2.f75824a.getAsInteger("PROCESS_CFG_PROCESS_ID") : null;
        if (asInteger != null) {
            this.f76113h.c(asInteger.intValue());
        }
    }

    public M1(Context context, InterfaceC5584z1 interfaceC5584z1, C5213k5 c5213k5) {
        this(context, interfaceC5584z1, new C5161i4(context, c5213k5), new T1(), C5244la.f77693d, C5468ua.k().e(), new N1());
    }

    @Override // io.appmetrica.analytics.impl.A1
    @WorkerThread
    public final void a(Intent intent) {
        T1 t12 = this.f76110e;
        if (intent == null) {
            t12.getClass();
            return;
        }
        t12.getClass();
        String action = intent.getAction();
        if (!TextUtils.isEmpty(action)) {
            t12.f76477a.a(action, Integer.valueOf(T1.a(intent)));
        }
        for (Map.Entry entry : t12.f76478b.entrySet()) {
            S1 s12 = (S1) entry.getKey();
            if (((R1) entry.getValue()).a(intent)) {
                s12.a(intent);
            }
        }
    }

    public M1(Context context, InterfaceC5584z1 interfaceC5584z1, C5161i4 c5161i4, T1 t12, C5244la c5244la, C5336p2 c5336p2, N1 n12) {
        this.f76106a = false;
        this.f76107b = context;
        this.f76108c = interfaceC5584z1;
        this.f76109d = c5161i4;
        this.f76110e = t12;
        this.f76112g = c5244la;
        this.f76113h = c5336p2;
        this.f76114i = n12;
        this.f76115j = new C5173ih();
    }

    @WorkerThread
    public final void a(Bundle bundle) {
        bundle.setClassLoader(CounterConfiguration.class.getClassLoader());
        W5.b(bundle);
        Xg xg2 = this.f76111f;
        if (xg2 != null) {
            xg2.a(W5.b(bundle), bundle);
        }
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void a(@NonNull InterfaceC5584z1 interfaceC5584z1) {
        this.f76108c = interfaceC5584z1;
    }

    @Override // io.appmetrica.analytics.impl.A1
    @WorkerThread
    public final void a(Intent intent, int i10) {
        ((C5534x1) this.f76108c).f78544a.stopSelfResult(i10);
    }

    @Override // io.appmetrica.analytics.impl.A1
    @WorkerThread
    public final void a(Intent intent, int i10, int i11) {
        ((C5534x1) this.f76108c).f78544a.stopSelfResult(i11);
    }
}
