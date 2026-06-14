package s2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import lf.i;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f99544a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f99545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Lazy f99546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AtomicBoolean f99547d;

    /* JADX INFO: renamed from: s2.a$a, reason: collision with other inner class name */
    static final class C1188a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final C1188a f99548f = new C1188a();

        C1188a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final ExecutorService invoke() {
            return Executors.newCachedThreadPool();
        }
    }

    static {
        String string = a.class.toString();
        Intrinsics.checkNotNullExpressionValue(string, "GpsTopicsManager::class.java.toString()");
        f99545b = string;
        f99546c = i.a(C1188a.f99548f);
        f99547d = new AtomicBoolean(false);
    }

    private a() {
    }

    public static final void a() {
        if (e3.a.d(a.class)) {
            return;
        }
        try {
            f99547d.set(true);
        } catch (Throwable th2) {
            e3.a.b(th2, a.class);
        }
    }
}
