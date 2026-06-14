package com.applovin.impl;

import android.content.Intent;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.communicator.CommunicatorMessageImpl;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class g5 implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WeakReference f8906c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f8904a = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f8907d = new LinkedHashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f8908e = new Object();

    g5(String str, AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber) {
        this.f8905b = str;
        this.f8906c = new WeakReference(appLovinCommunicatorSubscriber);
    }

    public AppLovinCommunicatorSubscriber a() {
        return (AppLovinCommunicatorSubscriber) this.f8906c.get();
    }

    public String b() {
        return this.f8905b;
    }

    public boolean c() {
        return this.f8904a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g5)) {
            return false;
        }
        AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber = (AppLovinCommunicatorSubscriber) this.f8906c.get();
        g5 g5Var = (g5) obj;
        AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber2 = (AppLovinCommunicatorSubscriber) g5Var.f8906c.get();
        return b().equals(g5Var.b()) && (appLovinCommunicatorSubscriber == null ? appLovinCommunicatorSubscriber == appLovinCommunicatorSubscriber2 : appLovinCommunicatorSubscriber.equals(appLovinCommunicatorSubscriber2));
    }

    public int hashCode() {
        int iHashCode = this.f8905b.hashCode();
        AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber = (AppLovinCommunicatorSubscriber) this.f8906c.get();
        return (iHashCode * 31) + (appLovinCommunicatorSubscriber != null ? appLovinCommunicatorSubscriber.hashCode() : 0);
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        boolean z10;
        if (a() == null) {
            com.applovin.impl.sdk.o.h("AppLovinCommunicator", "Message received for GC'd subscriber");
            return;
        }
        CommunicatorMessageImpl communicatorMessageImpl = (CommunicatorMessageImpl) intent;
        synchronized (this.f8908e) {
            try {
                if (this.f8907d.contains(communicatorMessageImpl.getUniqueId())) {
                    z10 = false;
                } else {
                    this.f8907d.add(communicatorMessageImpl.getUniqueId());
                    z10 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            a().onMessageReceived((AppLovinCommunicatorMessage) communicatorMessageImpl);
        }
    }

    public void a(boolean z10) {
        this.f8904a = z10;
    }
}
