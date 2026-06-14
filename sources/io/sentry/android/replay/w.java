package io.sentry.android.replay;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f83244a = new w();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Lazy f83245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Lazy f83246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f83247d;

    static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f83248f = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Class invoke() {
            try {
                return Class.forName("com.android.internal.policy.DecorView");
            } catch (Throwable th2) {
                Log.d("WindowSpy", "Unexpected exception loading DecorView on API " + Build.VERSION.SDK_INT, th2);
                return null;
            }
        }
    }

    static final class b extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f83249f = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Field invoke() {
            Class clsB = w.f83244a.b();
            if (clsB == null) {
                return null;
            }
            try {
                Field declaredField = clsB.getDeclaredField("mWindow");
                declaredField.setAccessible(true);
                return declaredField;
            } catch (NoSuchFieldException e10) {
                Log.d("WindowSpy", "Unexpected exception retrieving " + clsB + "#mWindow on API " + Build.VERSION.SDK_INT, e10);
                return null;
            }
        }
    }

    static {
        lf.l lVar = lf.l.f94211d;
        f83245b = lf.i.b(lVar, a.f83248f);
        f83246c = lf.i.b(lVar, b.f83249f);
        f83247d = 8;
    }

    private w() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class b() {
        return (Class) f83245b.getValue();
    }

    private final Field c() {
        return (Field) f83246c.getValue();
    }

    public final Window d(View maybeDecorView) throws IllegalAccessException {
        Field fieldC;
        Intrinsics.checkNotNullParameter(maybeDecorView, "maybeDecorView");
        Class clsB = b();
        if (clsB == null || !clsB.isInstance(maybeDecorView) || (fieldC = f83244a.c()) == null) {
            return null;
        }
        Object obj = fieldC.get(maybeDecorView);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.view.Window");
        return (Window) obj;
    }
}
