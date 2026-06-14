package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.ads.UnityAds;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class Vf implements Tf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Vf f41912a = new Vf();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Lazy f41913b = lf.i.a(a.f41914a);

    static final class a extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f41914a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            try {
                UnityAds unityAds = UnityAds.INSTANCE;
                Object objInvoke = UnityAds.class.getMethod("getVersion", null).invoke(null, null);
                if (objInvoke instanceof String) {
                    return (String) objInvoke;
                }
                return null;
            } catch (Throwable th2) {
                C4462o4.d().a(th2);
                IronLog.INTERNAL.warning(th2.getMessage());
                return null;
            }
        }
    }

    private Vf() {
    }

    @Override // com.ironsource.Tf
    @Nullable
    public String a() {
        return (String) f41913b.getValue();
    }
}
