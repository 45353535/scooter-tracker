package com.applovin.impl;

import android.content.IntentFilter;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class f5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f8839a = new HashSet(32);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f8840b = new Object();

    public boolean a(String str) {
        synchronized (this.f8840b) {
            try {
                Iterator it = this.f8839a.iterator();
                while (it.hasNext()) {
                    if (str.equals(((g5) it.next()).b())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        g5 g5VarA;
        if (StringUtils.isValidString(str)) {
            synchronized (this.f8840b) {
                g5VarA = a(str, appLovinCommunicatorSubscriber);
            }
            if (g5VarA != null) {
                g5VarA.a(false);
                AppLovinBroadcastManager.unregisterReceiver(g5VarA);
            }
        }
    }

    public boolean a(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        if (appLovinCommunicatorSubscriber != null && StringUtils.isValidString(str)) {
            synchronized (this.f8840b) {
                try {
                    g5 g5VarA = a(str, appLovinCommunicatorSubscriber);
                    if (g5VarA != null) {
                        com.applovin.impl.sdk.o.h("AppLovinCommunicator", "Attempting to re-subscribe subscriber (" + appLovinCommunicatorSubscriber + ") to topic (" + str + ")");
                        if (!g5VarA.c()) {
                            g5VarA.a(true);
                            AppLovinBroadcastManager.registerReceiver(g5VarA, new IntentFilter(str));
                        }
                        return true;
                    }
                    g5 g5Var = new g5(str, appLovinCommunicatorSubscriber);
                    this.f8839a.add(g5Var);
                    AppLovinBroadcastManager.registerReceiver(g5Var, new IntentFilter(str));
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        com.applovin.impl.sdk.o.h("AppLovinCommunicator", "Unable to subscribe - invalid subscriber (" + appLovinCommunicatorSubscriber + ") or topic (" + str + ")");
        return false;
    }

    private g5 a(String str, AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber) {
        for (g5 g5Var : this.f8839a) {
            if (str.equals(g5Var.b()) && appLovinCommunicatorSubscriber.equals(g5Var.a())) {
                return g5Var;
            }
        }
        return null;
    }
}
