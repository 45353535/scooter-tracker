package com.inmobi.media;

import android.content.Context;
import java.io.File;
import java.util.concurrent.Semaphore;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Rb {
    public static void a(Function1 runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        eg.i.d(A9.f36557c, null, null, new Nb(runnable, null), 3, null);
    }

    public static Object a(Function0 run) {
        Semaphore semaphore;
        Intrinsics.checkNotNullParameter(run, "run");
        try {
            Result.Companion companion = Result.f93230c;
            try {
                try {
                    semaphore = Sb.f37703b;
                    semaphore.acquire();
                    run.invoke();
                } catch (Exception e10) {
                    Lazy lazy = P9.f37527a;
                    P9.a(new L2(e10));
                    semaphore = Sb.f37703b;
                }
                semaphore.release();
                return Result.b(Unit.f93236a);
            } catch (Throwable th2) {
                Sb.f37703b.release();
                throw th2;
            }
        } catch (Throwable th3) {
            Result.Companion companion2 = Result.f93230c;
            return Result.b(kotlin.d.a(th3));
        }
    }

    public static String a(Context context, long j10) {
        Intrinsics.checkNotNullParameter(context, "context");
        File file = new File(context.getFilesDir() + "/logging");
        if (!file.exists()) {
            file.mkdirs();
        }
        return context.getFilesDir() + "/logging/" + j10 + ".txt";
    }

    public static String a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getFilesDir() + "/logging";
    }
}
