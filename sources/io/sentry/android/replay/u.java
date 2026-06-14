package io.sentry.android.replay;

import android.util.Log;
import com.unity3d.services.core.fid.Constants;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f83141a = new u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Lazy f83142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Lazy f83143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Lazy f83144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f83145e;

    static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f83146f = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Field invoke() throws NoSuchFieldException {
            Class clsC = u.f83141a.c();
            if (clsC == null) {
                return null;
            }
            Field declaredField = clsC.getDeclaredField("mViews");
            declaredField.setAccessible(true);
            return declaredField;
        }
    }

    static final class b extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f83147f = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Class invoke() {
            try {
                return Class.forName("android.view.WindowManagerGlobal");
            } catch (Throwable th2) {
                Log.w("WindowManagerSpy", th2);
                return null;
            }
        }
    }

    static final class c extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final c f83148f = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Method method;
            Class clsC = u.f83141a.c();
            if (clsC == null || (method = clsC.getMethod(Constants.GET_INSTANCE, null)) == null) {
                return null;
            }
            return method.invoke(null, null);
        }
    }

    static {
        lf.l lVar = lf.l.f94211d;
        f83142b = lf.i.b(lVar, b.f83147f);
        f83143c = lf.i.b(lVar, c.f83148f);
        f83144d = lf.i.b(lVar, a.f83146f);
        f83145e = 8;
    }

    private u() {
    }

    private final Field b() {
        return (Field) f83144d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class c() {
        return (Class) f83142b.getValue();
    }

    private final Object d() {
        return f83143c.getValue();
    }

    public final void e(Function1 swap) {
        Field fieldB;
        Intrinsics.checkNotNullParameter(swap, "swap");
        try {
            Object objD = d();
            if (objD == null || (fieldB = f83141a.b()) == null) {
                return;
            }
            Object obj = fieldB.get(objD);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.util.ArrayList<android.view.View>{ kotlin.collections.TypeAliasesKt.ArrayList<android.view.View> }");
            fieldB.set(objD, swap.invoke((ArrayList) obj));
        } catch (Throwable th2) {
            Log.w("WindowManagerSpy", th2);
        }
    }
}
