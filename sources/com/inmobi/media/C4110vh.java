package com.inmobi.media;

import com.inmobi.media.C4110vh;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.Config;
import com.inmobi.media.core.config.models.CrashConfig;
import com.inmobi.media.core.config.models.RootConfig;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.inmobi.media.core.config.models.TelemetryConfig;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.vh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4110vh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3569a4 f39781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f39782b;

    public C4110vh(C3569a4 configDao) {
        Intrinsics.checkNotNullParameter(configDao, "configDao");
        this.f39781a = configDao;
        this.f39782b = lf.i.a(new Function0() { // from class: w3.ac
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4110vh.a();
            }
        });
    }

    public static final Bh a() {
        return new Bh((C4077u9) He.f37017b.getValue());
    }

    public static final ArrayList a(C4110vh c4110vh) {
        C3873m4 c3873m4;
        C3873m4 c3873m42;
        C3873m4 c3873m43;
        C3873m4 c3873m44;
        C3873m4 c3873m45;
        ArrayList arrayList = new ArrayList();
        C3774i4 c3774i4 = Y3.f38021a;
        Intrinsics.checkNotNullParameter(RootConfig.class, "clazz");
        C3774i4 c3774i42 = Y3.f38021a;
        RootConfig rootConfig = (RootConfig) c3774i42.a(RootConfig.class);
        if (a(rootConfig, RootConfig.class)) {
            Intrinsics.checkNotNullParameter(RootConfig.class, "clazz");
            RootConfig rootConfig2 = (RootConfig) c3774i42.a(RootConfig.class);
            if (Intrinsics.areEqual(RootConfig.class, RootConfig.class)) {
                c3873m45 = new C3873m4(rootConfig2.getUrlForType("root"), rootConfig2);
            } else {
                Intrinsics.checkNotNullParameter(RootConfig.class, "clazz");
                Config configA = c3774i42.a(RootConfig.class);
                c3873m45 = new C3873m4(rootConfig2.getUrlForType(configA.getType()), configA);
            }
            arrayList.add(c3873m45);
            return arrayList;
        }
        if (a(rootConfig, AdConfig.class)) {
            Intrinsics.checkNotNullParameter(RootConfig.class, "clazz");
            RootConfig rootConfig3 = (RootConfig) c3774i42.a(RootConfig.class);
            if (Intrinsics.areEqual(AdConfig.class, RootConfig.class)) {
                c3873m44 = new C3873m4(rootConfig3.getUrlForType("root"), rootConfig3);
            } else {
                Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
                Config configA2 = c3774i42.a(AdConfig.class);
                c3873m44 = new C3873m4(rootConfig3.getUrlForType(configA2.getType()), configA2);
            }
            arrayList.add(c3873m44);
        }
        if (a(rootConfig, TelemetryConfig.class)) {
            Intrinsics.checkNotNullParameter(RootConfig.class, "clazz");
            RootConfig rootConfig4 = (RootConfig) c3774i42.a(RootConfig.class);
            if (Intrinsics.areEqual(TelemetryConfig.class, RootConfig.class)) {
                c3873m43 = new C3873m4(rootConfig4.getUrlForType("root"), rootConfig4);
            } else {
                Intrinsics.checkNotNullParameter(TelemetryConfig.class, "clazz");
                Config configA3 = c3774i42.a(TelemetryConfig.class);
                c3873m43 = new C3873m4(rootConfig4.getUrlForType(configA3.getType()), configA3);
            }
            arrayList.add(c3873m43);
        }
        if (a(rootConfig, SignalsConfig.class)) {
            Intrinsics.checkNotNullParameter(RootConfig.class, "clazz");
            RootConfig rootConfig5 = (RootConfig) c3774i42.a(RootConfig.class);
            if (Intrinsics.areEqual(SignalsConfig.class, RootConfig.class)) {
                c3873m42 = new C3873m4(rootConfig5.getUrlForType("root"), rootConfig5);
            } else {
                Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
                Config configA4 = c3774i42.a(SignalsConfig.class);
                c3873m42 = new C3873m4(rootConfig5.getUrlForType(configA4.getType()), configA4);
            }
            arrayList.add(c3873m42);
        }
        if (a(rootConfig, CrashConfig.class)) {
            Intrinsics.checkNotNullParameter(RootConfig.class, "clazz");
            RootConfig rootConfig6 = (RootConfig) c3774i42.a(RootConfig.class);
            if (Intrinsics.areEqual(CrashConfig.class, RootConfig.class)) {
                c3873m4 = new C3873m4(rootConfig6.getUrlForType("root"), rootConfig6);
            } else {
                Intrinsics.checkNotNullParameter(CrashConfig.class, "clazz");
                Config configA5 = c3774i42.a(CrashConfig.class);
                c3873m4 = new C3873m4(rootConfig6.getUrlForType(configA5.getType()), configA5);
            }
            arrayList.add(c3873m4);
        }
        return arrayList;
    }

    public static boolean a(RootConfig rootConfig, Class clazz) {
        C3774i4 c3774i4 = Y3.f38021a;
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Config configA = Y3.f38021a.a(clazz);
        return configA == null || System.currentTimeMillis() - configA.getLastUpdateTimeStamp() > rootConfig.getExpiryInMillisForType(AbstractC4047t4.a(clazz));
    }
}
