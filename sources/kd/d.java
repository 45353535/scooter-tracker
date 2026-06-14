package kd;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class d {
    public static void a(e eVar, Runnable runnable, long j10) {
        eVar.schedule(runnable, j10, TimeUnit.MILLISECONDS);
    }
}
