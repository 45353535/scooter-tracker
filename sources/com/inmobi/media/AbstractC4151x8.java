package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.RootConfig;
import com.ironsource.C4240b4;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.x8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC4151x8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f39916a;

    static {
        String TAG = AbstractC4151x8.class.getSimpleName();
        a(AbstractC4102v9.a());
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        AbstractC4102v9.a();
    }

    public static String a() {
        boolean zBooleanValue;
        Boolean bool = Tg.f37771b;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            Context context = Ji.f37157a;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Ea.f36782b;
                Ea eaA = Da.a(context, "user_info_store");
                Intrinsics.checkNotNullParameter("user_age_restricted", C4240b4.i.W);
                Tg.f37771b = Boolean.valueOf(eaA.f36783a.getBoolean("user_age_restricted", false));
            }
            Boolean bool2 = Tg.f37771b;
            zBooleanValue = bool2 != null ? bool2.booleanValue() : false;
        }
        if (zBooleanValue) {
            Intrinsics.checkNotNullExpressionValue("x8", "TAG");
            return null;
        }
        C3774i4 c3774i4 = Y3.f38021a;
        Intrinsics.checkNotNullParameter(RootConfig.class, "clazz");
        C3774i4 c3774i42 = Y3.f38021a;
        if (CollectionsKt.contains(((RootConfig) c3774i42.a(RootConfig.class)).getIPAddrTPSupport(), Ki.f37226b)) {
            Intrinsics.checkNotNullExpressionValue("x8", "TAG");
            return f39916a;
        }
        Intrinsics.checkNotNullExpressionValue("x8", "TAG");
        Intrinsics.checkNotNullParameter(RootConfig.class, "clazz");
        Objects.toString(((RootConfig) c3774i42.a(RootConfig.class)).getIPAddrTPSupport());
        return null;
    }

    public static void a(String str) {
        boolean zBooleanValue;
        Boolean bool = Tg.f37771b;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            Context context = Ji.f37157a;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Ea.f36782b;
                Ea eaA = Da.a(context, "user_info_store");
                Intrinsics.checkNotNullParameter("user_age_restricted", C4240b4.i.W);
                Tg.f37771b = Boolean.valueOf(eaA.f36783a.getBoolean("user_age_restricted", false));
            }
            Boolean bool2 = Tg.f37771b;
            zBooleanValue = bool2 != null ? bool2.booleanValue() : false;
        }
        if (!zBooleanValue) {
            f39916a = str;
            AbstractC4102v9.a(str);
        } else {
            f39916a = null;
            AbstractC4102v9.a(null);
        }
    }
}
