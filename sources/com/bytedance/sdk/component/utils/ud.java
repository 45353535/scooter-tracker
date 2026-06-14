package com.bytedance.sdk.component.utils;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.view.View;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public class ud {
    private static qdl qdl;

    public interface qdl {
        ExecutorService getAsyncStartActivityThreadPool();

        boolean isEnableAsyncStartActivity();

        boolean isStartActivityBySubThread();
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.utils.ud$ud, reason: collision with other inner class name */
    public interface InterfaceC0240ud {
        void qdl();

        void qdl(Throwable th2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean lnr(Context context, Intent intent, InterfaceC0240ud interfaceC0240ud) {
        if (context != null && intent != null) {
            try {
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                context.startActivity(intent);
                if (interfaceC0240ud == null) {
                    return true;
                }
                interfaceC0240ud.qdl();
                return true;
            } catch (Throwable th2) {
                if (interfaceC0240ud != null) {
                    interfaceC0240ud.qdl(th2);
                }
            }
        }
        return false;
    }

    public static void qdl(qdl qdlVar) {
        qdl = qdlVar;
    }

    public static void qdl(final Context context, final Intent intent, final InterfaceC0240ud interfaceC0240ud) {
        ExecutorService asyncStartActivityThreadPool;
        qdl qdlVar = qdl;
        if (qdlVar == null || !qdlVar.isStartActivityBySubThread() || (asyncStartActivityThreadPool = qdl.getAsyncStartActivityThreadPool()) == null) {
            lnr(context, intent, interfaceC0240ud);
        } else {
            asyncStartActivityThreadPool.execute(new com.bytedance.sdk.component.jpc.jpc("startAct") { // from class: com.bytedance.sdk.component.utils.ud.1
                @Override // java.lang.Runnable
                public void run() {
                    ud.lnr(context, intent, interfaceC0240ud);
                }
            });
        }
    }

    public static boolean qdl(final Context context, final Intent intent, final InterfaceC0240ud interfaceC0240ud, boolean z10) {
        qdl qdlVar;
        ExecutorService asyncStartActivityThreadPool;
        if (z10 && (qdlVar = qdl) != null && qdlVar.isEnableAsyncStartActivity() && (asyncStartActivityThreadPool = qdl.getAsyncStartActivityThreadPool()) != null) {
            asyncStartActivityThreadPool.execute(new com.bytedance.sdk.component.jpc.jpc("startAct") { // from class: com.bytedance.sdk.component.utils.ud.2
                @Override // java.lang.Runnable
                public void run() {
                    ud.lnr(context, intent, interfaceC0240ud);
                }
            });
            return true;
        }
        return lnr(context, intent, interfaceC0240ud);
    }

    public static Activity qdl(View view) {
        View viewFindViewById;
        Context context;
        if (view == null) {
            return null;
        }
        Context context2 = view.getContext();
        if (context2 instanceof Activity) {
            return (Activity) context2;
        }
        View rootView = view.getRootView();
        if (rootView == null || (viewFindViewById = rootView.findViewById(R.id.content)) == null || (context = viewFindViewById.getContext()) == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            Context baseContext = ((ContextWrapper) context).getBaseContext();
            if (baseContext instanceof Activity) {
                return (Activity) baseContext;
            }
        }
        return null;
    }

    public static boolean qdl(Activity activity) {
        return activity == null || activity.isFinishing() || activity.isDestroyed();
    }
}
