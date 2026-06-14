package wd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class d {
    public static void a(e eVar, Runnable task) {
        Intrinsics.checkNotNullParameter(task, "task");
        eVar.schedule(task, 0L);
    }

    public static boolean b(e eVar, Runnable task) {
        Boolean bool;
        Intrinsics.checkNotNullParameter(task, "task");
        try {
            eVar.execute(task);
            bool = Boolean.TRUE;
        } catch (Throwable unused) {
            bool = null;
        }
        return Intrinsics.areEqual(bool, Boolean.TRUE);
    }

    public static boolean c(e eVar, Runnable task, long j10) {
        Boolean bool;
        Intrinsics.checkNotNullParameter(task, "task");
        try {
            eVar.schedule(task, j10);
            bool = Boolean.TRUE;
        } catch (Throwable unused) {
            bool = null;
        }
        return Intrinsics.areEqual(bool, Boolean.TRUE);
    }
}
