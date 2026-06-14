package yads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public abstract class bi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f109009a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile zh f109010b;

    public static void a(Context context, mr1 mr1Var) {
        CoroutineScope coroutineScopeA = kotlinx.coroutines.i.a(eg.m1.b(null, 1, null).plus(eg.o0.b()).plus(new k10(mr1Var)));
        if (f109009a.getAndSet(true)) {
            return;
        }
        eg.i.d(coroutineScopeA, null, null, new ai(context, mr1Var, coroutineScopeA, null), 3, null);
    }
}
