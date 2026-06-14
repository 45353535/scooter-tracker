package io.appmetrica.analytics.logger.common;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.logger.common.impl.a;
import io.appmetrica.analytics.logger.common.impl.b;
import io.appmetrica.analytics.logger.common.impl.c;
import io.appmetrica.analytics.logger.common.impl.d;

/* JADX INFO: loaded from: classes12.dex */
public abstract class BaseImportantLogger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f78745a;

    public BaseImportantLogger(@NonNull String str) {
        this.f78745a = new c(new d(str), new a(), new b());
    }

    public void info(@NonNull String str, @Nullable String str2, @Nullable Object... objArr) {
        c cVar = this.f78745a;
        cVar.f78752b.getClass();
        for (String str3 : cVar.f78753c.a(a.a(str, str2, objArr))) {
            String str4 = cVar.f78751a.f78754a;
            if (str3 == null) {
                str3 = "";
            }
            Log.println(4, str4, str3);
        }
    }
}
