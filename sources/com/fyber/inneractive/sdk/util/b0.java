package com.fyber.inneractive.sdk.util;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f23853a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f23854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f23855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y f23856d;

    public static void a(b0 b0Var, Context context, Intent intent) {
        boolean zIsKeyguardLocked;
        synchronized (b0Var) {
            try {
                zIsKeyguardLocked = ((KeyguardManager) context.getSystemService("keyguard")).isKeyguardLocked();
            } catch (Exception unused) {
                IAlog.a("%sFailed to get lock screen status", IAlog.a(b0Var));
                zIsKeyguardLocked = false;
            }
            if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                b0Var.f23854b = true;
            } else if (("android.intent.action.SCREEN_ON".equals(intent.getAction()) && !zIsKeyguardLocked) || "android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                b0Var.f23854b = false;
            }
            IAlog.a("%sNew screen state is locked: %s. number of listeners: %d", IAlog.a(b0Var), Boolean.valueOf(b0Var.f23854b), Integer.valueOf(b0Var.f23853a.size()));
            for (a0 a0Var : b0Var.f23853a) {
                boolean z10 = b0Var.f23854b;
                com.fyber.inneractive.sdk.renderers.l lVar = (com.fyber.inneractive.sdk.renderers.l) a0Var;
                lVar.getClass();
                IAlog.a("%sgot onLockScreenStateChanged with: %s", IAlog.a(lVar), Boolean.valueOf(z10));
                if (z10) {
                    lVar.c(false);
                    com.fyber.inneractive.sdk.renderers.d dVar = lVar.f23681y;
                    if (dVar != null && dVar.f23655g) {
                        dVar.f23655g = false;
                        r.f23896b.removeCallbacks(dVar.f23658j);
                    }
                } else {
                    lVar.O();
                    com.fyber.inneractive.sdk.renderers.d dVar2 = lVar.f23681y;
                    if (dVar2 != null && !dVar2.f23656h && !dVar2.f23655g && dVar2.f23654f != 0) {
                        dVar2.f23654f = 0L;
                        dVar2.f23655g = true;
                        dVar2.a();
                    }
                }
            }
        }
    }
}
