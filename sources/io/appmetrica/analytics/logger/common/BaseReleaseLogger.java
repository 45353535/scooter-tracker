package io.appmetrica.analytics.logger.common;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C4240b4;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import io.appmetrica.analytics.logger.common.impl.a;
import io.appmetrica.analytics.logger.common.impl.b;
import io.appmetrica.analytics.logger.common.impl.c;
import io.appmetrica.analytics.logger.common.impl.d;

/* JADX INFO: loaded from: classes12.dex */
public abstract class BaseReleaseLogger {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile String f78746d = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f78747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile boolean f78748b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f78749c;

    public BaseReleaseLogger(@NonNull String str, @NonNull String str2) {
        this.f78749c = new c(new d(str), new a(), new b());
        this.f78747a = str2;
    }

    public static void init(@NonNull Context context) {
        f78746d = C4240b4.j.f42672d + context.getPackageName() + "] : ";
    }

    public void error(@Nullable String str, @Nullable Object... objArr) {
        if (this.f78748b) {
            c cVar = this.f78749c;
            String prefix = getPrefix();
            cVar.f78752b.getClass();
            for (String str2 : cVar.f78753c.a(a.a(prefix, str, objArr))) {
                String str3 = cVar.f78751a.f78754a;
                if (str2 == null) {
                    str2 = "";
                }
                Log.println(6, str3, str2);
            }
        }
    }

    @NonNull
    public String getPrefix() {
        return f78746d + this.f78747a;
    }

    public void info(@Nullable String str, @Nullable Object... objArr) {
        if (this.f78748b) {
            c cVar = this.f78749c;
            String prefix = getPrefix();
            cVar.f78752b.getClass();
            for (String str2 : cVar.f78753c.a(a.a(prefix, str, objArr))) {
                String str3 = cVar.f78751a.f78754a;
                if (str2 == null) {
                    str2 = "";
                }
                Log.println(4, str3, str2);
            }
        }
    }

    public void setEnabled(boolean z10) {
        this.f78748b = z10;
    }

    public void warning(@Nullable String str, @Nullable Object... objArr) {
        if (this.f78748b) {
            c cVar = this.f78749c;
            String prefix = getPrefix();
            cVar.f78752b.getClass();
            for (String str2 : cVar.f78753c.a(a.a(prefix, str, objArr))) {
                String str3 = cVar.f78751a.f78754a;
                if (str2 == null) {
                    str2 = "";
                }
                Log.println(5, str3, str2);
            }
        }
    }

    public void error(@Nullable Throwable th2, @Nullable String str, @Nullable Object... objArr) {
        if (this.f78748b) {
            c cVar = this.f78749c;
            String prefix = getPrefix();
            cVar.f78752b.getClass();
            StringBuilder sb2 = new StringBuilder();
            if (str == null) {
                str = "";
            }
            sb2.append(str);
            sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
            sb2.append(Log.getStackTraceString(th2));
            for (String str2 : cVar.f78753c.a(a.a(prefix, sb2.toString(), objArr))) {
                String str3 = cVar.f78751a.f78754a;
                if (str2 == null) {
                    str2 = "";
                }
                Log.println(6, str3, str2);
            }
        }
    }
}
