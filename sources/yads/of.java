package yads;

import android.os.Looper;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class of {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f114286j = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static volatile of f114287k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f114288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f114289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f114290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CoroutineScope f114291d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final cf f114292e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Cif f114293f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p33 f114294g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j10 f114295h = new j10();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f114296i = new AtomicBoolean(false);

    public of(long j10, long j11, Set set, CoroutineScope coroutineScope, cf cfVar, Cif cif, p33 p33Var) {
        this.f114288a = j10;
        this.f114289b = j11;
        this.f114290c = set;
        this.f114291d = coroutineScope;
        this.f114292e = cfVar;
        this.f114293f = cif;
        this.f114294g = p33Var;
    }

    public static final void a(of ofVar) {
        ofVar.f114294g.getClass();
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        StackTraceElement[] stackTraceElementArr = allStackTraces.get(Looper.getMainLooper().getThread());
        if (stackTraceElementArr != null) {
            Set set = t03.f116008a;
            if (t03.a(stackTraceElementArr, ofVar.f114290c)) {
                ofVar.f114293f.f111971a.reportAnr(allStackTraces);
            }
        }
    }
}
