package com.inmobi.media;

import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorEntity;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.sdk.AppLovinSdk;
import com.inmobi.media.AbstractC4205zc;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.inmobi.signals.adinfo.SignalCollector;
import com.unity3d.services.core.fid.Constants;
import j$.util.Objects;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.zc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC4205zc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f40040a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SignalsConfig f40041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f40042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Lazy f40043d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Lazy f40044e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Boolean f40045f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Function2 f40046g;

    static {
        C3774i4 c3774i4 = Y3.f38021a;
        Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
        SignalsConfig signalsConfig = (SignalsConfig) Y3.f38021a.a(SignalsConfig.class);
        f40041b = signalsConfig;
        String topic = signalsConfig.getPublisher().getAuto().getTopic();
        if (topic.length() == 0) {
            topic = "max_revenue_events";
        }
        f40042c = topic;
        f40043d = lf.i.a(new Function0() { // from class: w3.md
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC4205zc.d();
            }
        });
        f40044e = lf.i.a(new Function0() { // from class: w3.nd
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(AbstractC4205zc.b());
            }
        });
        f40046g = new Function2() { // from class: w3.od
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AbstractC4205zc.a((Bundle) obj, (String) obj2);
            }
        };
    }

    public static final Unit a(Bundle bundle, String topic) {
        LinkedHashMap linkedHashMapA;
        Intrinsics.checkNotNullParameter(topic, "topic");
        if (bundle != null) {
            try {
                if (Intrinsics.areEqual(topic, f40042c) && (linkedHashMapA = a(bundle)) != null) {
                    Og.f37496a.getClass();
                    Og.a(linkedHashMapA);
                    linkedHashMapA.toString();
                }
            } catch (Throwable unused) {
            }
        }
        return Unit.f93236a;
    }

    public static final boolean b() {
        try {
            int i10 = AppLovinCommunicator.f8174g;
            if (!Intrinsics.areEqual(AppLovinCommunicator.class.getMethod(Constants.GET_INSTANCE, null).getReturnType(), AppLovinCommunicator.class)) {
                return false;
            }
            int i11 = AppLovinCommunicatorMessage.f8179b;
            if (Intrinsics.areEqual(AppLovinCommunicatorSubscriber.class.getMethod("onMessageReceived", AppLovinCommunicatorMessage.class).getReturnType(), Void.TYPE)) {
                return Intrinsics.areEqual(AppLovinCommunicatorEntity.class.getMethod("getCommunicatorId", null).getReturnType(), String.class);
            }
            return false;
        } catch (Error | Exception unused) {
            return false;
        }
    }

    public static boolean c() {
        String str;
        Boolean bool = f40045f;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            String str2 = AppLovinSdk.VERSION;
            Object obj = AppLovinSdk.class.getField("VERSION").get(null);
            str = obj instanceof String ? (String) obj : null;
        } catch (Throwable unused) {
        }
        if (str == null) {
            str = com.ironsource.X1.f42014f;
        }
        List<String> incompatibleSdkVer = f40041b.getPublisher().getAuto().getIncompatibleSdkVer();
        Objects.toString(incompatibleSdkVer);
        boolean z10 = Intrinsics.areEqual(str, com.ironsource.X1.f42014f) || incompatibleSdkVer.contains(str);
        f40045f = Boolean.valueOf(z10);
        return z10;
    }

    public static final SignalCollector d() {
        return new SignalCollector(CollectionsKt.listOf(f40042c));
    }

    public static void a() {
        if (f40041b.getPublisher().getAuto().getEnabled() && !c() && ((Boolean) f40044e.getValue()).booleanValue() && f40042c.length() != 0 && f40040a.compareAndSet(false, true)) {
            ((SignalCollector) f40043d.getValue()).setupAppLovinCommunicator(f40046g);
        }
    }

    public static LinkedHashMap a(Bundle data) {
        boolean z10;
        Object obj;
        Object obj2;
        Intrinsics.checkNotNullParameter(data, "data");
        if (!f40040a.get()) {
            return null;
        }
        SignalsConfig signalsConfig = f40041b;
        if (!signalsConfig.getPublisher().getAuto().getEnabled()) {
            return null;
        }
        Map<String, SignalsConfig.PublisherConfig.KeyData> allowedKeys = signalsConfig.getPublisher().getAuto().getAllowedKeys();
        if (allowedKeys.isEmpty()) {
            return null;
        }
        Objects.toString(allowedKeys.keySet());
        Set<String> setKeySet = data.keySet();
        if (setKeySet.isEmpty()) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Intrinsics.checkNotNull(setKeySet);
        if (setKeySet.contains("ad_format") && (obj2 = data.get("ad_format")) != null) {
            linkedHashMap.put("auto_type", obj2);
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z10);
        if (!z10) {
            boolValueOf = null;
        }
        if (boolValueOf == null) {
            return null;
        }
        for (Map.Entry<String, SignalsConfig.PublisherConfig.KeyData> entry : allowedKeys.entrySet()) {
            String key = entry.getKey();
            SignalsConfig.PublisherConfig.KeyData value = entry.getValue();
            if (setKeySet.contains(key)) {
                String name = value.getName();
                if (F3.a(name) && (obj = data.get(key)) != null) {
                    linkedHashMap.put(name, obj);
                }
            }
        }
        if (linkedHashMap.isEmpty()) {
            return null;
        }
        return linkedHashMap;
    }
}
