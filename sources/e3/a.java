package e3;

import android.os.Handler;
import android.os.Looper;
import b3.b;
import b3.c;
import com.facebook.s;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f68913a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set f68914b = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f68915c;

    /* JADX INFO: renamed from: e3.a$a, reason: collision with other inner class name */
    public static final class RunnableC0865a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Throwable f68916b;

        RunnableC0865a(Throwable th2) {
            this.f68916b = th2;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new RuntimeException(this.f68916b);
        }
    }

    private a() {
    }

    public static final void a() {
        f68915c = true;
    }

    public static final void b(Throwable th2, Object o10) {
        Intrinsics.checkNotNullParameter(o10, "o");
        if (f68915c) {
            f68914b.add(o10);
            if (s.q()) {
                b.c(th2);
                c.a.b(th2, c.EnumC0126c.CrashShield).g();
            }
            e(th2);
        }
    }

    public static final boolean c() {
        return false;
    }

    public static final boolean d(Object o10) {
        Intrinsics.checkNotNullParameter(o10, "o");
        return f68914b.contains(o10);
    }

    public static final void e(Throwable th2) {
        if (c()) {
            new Handler(Looper.getMainLooper()).post(new RunnableC0865a(th2));
        }
    }
}
