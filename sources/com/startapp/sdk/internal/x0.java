package com.startapp.sdk.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes11.dex */
public abstract class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile Application f65496a;

    public static Context a(Context context) {
        Context applicationContext = f65496a;
        if (applicationContext != null) {
            return applicationContext;
        }
        try {
            if (context instanceof Application) {
                try {
                    f65496a = (Application) context;
                } catch (Throwable unused) {
                }
                applicationContext = context;
            } else if (context instanceof ContextWrapper) {
                Context baseContext = ((ContextWrapper) context).getBaseContext();
                if (baseContext != null) {
                    applicationContext = a(baseContext);
                }
            } else if (context != null) {
                applicationContext = context.getApplicationContext();
            }
        } catch (Throwable unused2) {
        }
        if (applicationContext != null) {
            return applicationContext;
        }
        Application application = f65496a;
        if (application == null) {
            synchronized (x0.class) {
                try {
                    application = f65496a;
                    if (application == null) {
                        try {
                            Method declaredMethod = Class.forName(Activity.class.getName().concat("Thread")).getDeclaredMethod("current".concat("Application"), null);
                            declaredMethod.setAccessible(true);
                            application = (Application) declaredMethod.invoke(null, null);
                        } catch (Throwable unused3) {
                        }
                        f65496a = application;
                    }
                } finally {
                }
            }
        }
        return application == null ? context : application;
    }
}
