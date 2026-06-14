package io.bidmachine;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public class BidTokenTaskManager {

    @Nullable
    private static volatile ee.a instance;

    public static void cancel(@NonNull ee.b bVar) {
        get().b(bVar);
    }

    public static void execute(@NonNull Runnable runnable) {
        get().execute(runnable);
    }

    @NonNull
    private static ee.a get() {
        ee.a aVar;
        ee.a aVar2 = instance;
        if (aVar2 != null) {
            return aVar2;
        }
        synchronized (ee.a.class) {
            try {
                aVar = instance;
                if (aVar == null) {
                    aVar = new ee.a();
                    instance = aVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    public static void schedule(@NonNull ee.b bVar, long j10, @NonNull TimeUnit timeUnit) {
        get().d(bVar, j10, timeUnit);
    }
}
