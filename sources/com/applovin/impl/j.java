package com.applovin.impl;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.d6;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import io.appmetrica.analytics.BuildConfig;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class j implements AppLovinCommunicatorSubscriber {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f9113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f9114b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LinkedHashMap f9115c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f9116d = DesugarCollections.synchronizedSet(new HashSet());

    class a extends LinkedHashMap {
        a() {
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry entry) {
            return size() > 16;
        }
    }

    public interface b {
        void onCreativeIdGenerated(String str, String str2);
    }

    public j(com.applovin.impl.sdk.k kVar) {
        this.f9113a = kVar;
        if (c()) {
            AppLovinCommunicator.getInstance(com.applovin.impl.sdk.k.o()).subscribe(this, "safedk_ad_info");
        }
    }

    public void b(b bVar) {
        this.f9116d.remove(bVar);
    }

    public void c(String str) {
        this.f9113a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f9113a.O().a("AdReviewManager", "Removing ad info for serve id: " + str);
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f9114b) {
            this.f9115c.remove(str);
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return j.class.getSimpleName();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("safedk_ad_info".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle bundle = appLovinCommunicatorMessage.getMessageData().getBundle(BuildConfig.SDK_BUILD_FLAVOR);
            if (bundle == null) {
                this.f9113a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f9113a.O().k("AdReviewManager", "Received SafeDK ad info without public data");
                    return;
                }
                return;
            }
            Bundle bundle2 = appLovinCommunicatorMessage.getMessageData().getBundle("private");
            if (bundle2 == null) {
                this.f9113a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f9113a.O().k("AdReviewManager", "Received SafeDK ad info without private data");
                    return;
                }
                return;
            }
            if (MaxAdFormat.formatFromString(bundle2.getString("ad_format")) == null) {
                this.f9113a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f9113a.O().k("AdReviewManager", "Received SafeDK ad info without ad format");
                    return;
                }
                return;
            }
            final String string = bundle2.getString("id");
            if (TextUtils.isEmpty(string)) {
                this.f9113a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f9113a.O().k("AdReviewManager", "Received SafeDK ad info without serve id");
                    return;
                }
                return;
            }
            synchronized (this.f9114b) {
                try {
                    this.f9113a.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f9113a.O().a("AdReviewManager", "Storing current SafeDK ad info for serve id: " + string + ", public data: " + bundle);
                    }
                    this.f9115c.put(string, bundle);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            final String string2 = bundle.getString("ad_review_creative_id");
            this.f9113a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f9113a.O().a("AdReviewManager", "Received SafeDK ad info with Ad Review creative id: " + string2);
            }
            if (!StringUtils.isValidString(string2) || this.f9116d.isEmpty()) {
                return;
            }
            HashSet<b> hashSet = new HashSet(this.f9116d);
            this.f9113a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f9113a.O().a("AdReviewManager", "Notifying listeners: " + this.f9116d);
            }
            for (final b bVar : hashSet) {
                this.f9113a.q0().a((i5) new r6(this.f9113a, "creativeIdGenerated", new Runnable() { // from class: com.applovin.impl.eb
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f8805b.a(bVar, string, string2);
                    }
                }), d6.b.OTHER);
            }
        }
    }

    public static String b() {
        return b("getVersion");
    }

    public Bundle a(String str) {
        Bundle bundle;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f9114b) {
            bundle = (Bundle) this.f9115c.get(str);
        }
        this.f9113a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f9113a.O().a("AdReviewManager", "Retrieved ad info (" + bundle + ") for serve id: " + str);
        }
        return bundle;
    }

    private static String b(String str) {
        Class<?> cls;
        try {
            try {
                cls = Class.forName("com.applovin.quality.AppLovinQualityService");
            } catch (Throwable unused) {
                cls = Class.forName("com.safedk.android.SafeDK");
            }
            return (String) cls.getMethod(str, null).invoke(null, null);
        } catch (Throwable unused2) {
            return "";
        }
    }

    public static boolean c() {
        return StringUtils.isValidString(b());
    }

    public void a(b bVar) {
        this.f9116d.add(bVar);
    }

    public static String a() {
        return b("getSdkKey");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(b bVar, String str, String str2) {
        this.f9113a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f9113a.O().a("AdReviewManager", "Notifying Ad Review creative id generated for listener: " + bVar);
        }
        bVar.onCreativeIdGenerated(str, str2);
    }
}
