package com.my.target.common;

import android.content.Context;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.my.target.a7;
import com.my.target.common.MyTargetConfig;
import com.my.target.common.MyTargetManager;
import com.my.target.d2;
import com.my.target.f0;
import com.my.target.gb;
import com.my.target.i6;
import com.my.target.o5;
import com.my.target.q5;
import com.my.target.r5;
import com.my.target.t1;
import com.my.target.v1;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
public final class MyTargetManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f59424a = new AtomicBoolean();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile MyTargetConfig f59425b = new MyTargetConfig.Builder().build();

    public static /* synthetic */ void a(Context context) {
        v1.a(context);
        r5.c(context);
        d2.b().a(f59425b, context);
        a7.a(context);
        f0.b();
        b(context);
        t1 t1VarA = d2.b().a();
        if (t1VarA == null) {
            i6.a("undefined", "undefined", "undefined", context);
        } else {
            i6.a(t1VarA.f60826a, t1VarA.f60829d, t1VarA.f60830e, context);
        }
    }

    public static void b(Context context) {
        String strA = o5.a();
        HashMap map = new HashMap(1);
        map.put("kotlin_version", strA);
        q5.b("SDK Launch").a(map).b(context);
    }

    @NonNull
    @WorkerThread
    public static String getBidderToken(@NonNull Context context) {
        return d2.b().a(f59425b, MyTargetPrivacy.currentPrivacy(), context);
    }

    @NonNull
    public static MyTargetConfig getSdkConfig() {
        return f59425b;
    }

    @AnyThread
    public static void initSdk(@NonNull Context context) {
        final Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            gb.c("MyTarget cannot be initialized due to a null application context");
        } else if (f59424a.compareAndSet(false, true)) {
            gb.c("MyTarget initialization");
            f0.b(new Runnable() { // from class: l5.c
                @Override // java.lang.Runnable
                public final void run() {
                    MyTargetManager.a(applicationContext);
                }
            });
        }
    }

    public static boolean isSdkInitialized() {
        return f59424a.get();
    }

    public static void setDebugMode(boolean z10) {
        gb.f59768a = z10;
        if (z10) {
            gb.a("Debug mode enabled");
        }
    }

    public static void setSdkConfig(@NonNull MyTargetConfig myTargetConfig) {
        f59425b = myTargetConfig;
    }
}
