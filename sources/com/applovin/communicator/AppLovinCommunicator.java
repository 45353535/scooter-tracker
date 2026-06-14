package com.applovin.communicator;

import android.content.Context;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.communicator.MessagingServiceImpl;
import com.applovin.impl.f5;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class AppLovinCommunicator {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static AppLovinCommunicator f8172e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f8173f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f8174g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private k f8175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private o f8176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f5 f8177c = new f5();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final MessagingServiceImpl f8178d = new MessagingServiceImpl();

    public static AppLovinCommunicator getInstance() {
        return getInstance(k.o());
    }

    public void a(k kVar) {
        this.f8175a = kVar;
        this.f8176b = kVar.O();
        a("Attached SDK instance: " + kVar + APSSharedUtil.TRUNCATE_SEPARATOR);
    }

    public AppLovinCommunicatorMessagingService getMessagingService() {
        return this.f8178d;
    }

    public boolean hasSubscriber(String str) {
        return this.f8177c.a(str);
    }

    public boolean respondsToTopic(String str) {
        return this.f8175a.t().a(str);
    }

    public void subscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        subscribe(appLovinCommunicatorSubscriber, Collections.singletonList(str));
    }

    public String toString() {
        return "AppLovinCommunicator{sdk=" + this.f8175a + '}';
    }

    public void unsubscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        unsubscribe(appLovinCommunicatorSubscriber, Collections.singletonList(str));
    }

    @Deprecated
    public static AppLovinCommunicator getInstance(Context context) {
        synchronized (f8173f) {
            try {
                if (f8172e == null) {
                    f8172e = new AppLovinCommunicator();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f8172e;
    }

    public void subscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, List<String> list) {
        for (String str : list) {
            if (this.f8177c.a(appLovinCommunicatorSubscriber, str)) {
                this.f8178d.maybeSendStickyMessages(str);
            } else {
                a("Unable to subscribe " + appLovinCommunicatorSubscriber + " to topic: " + str);
            }
        }
    }

    public void unsubscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, List<String> list) {
        for (String str : list) {
            a("Unsubscribing " + appLovinCommunicatorSubscriber + " from topic: " + str);
            this.f8177c.b(appLovinCommunicatorSubscriber, str);
        }
    }

    private void a(String str) {
        if (this.f8176b == null || !o.a()) {
            return;
        }
        this.f8176b.a("AppLovinCommunicator", str);
    }
}
