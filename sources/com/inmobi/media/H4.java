package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.Config;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.ironsource.C4240b4;
import j$.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class H4 implements InterfaceC4022s4 {
    @Override // com.inmobi.media.InterfaceC4022s4
    public final void a(Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        synchronized (this) {
            try {
                K4 k42 = K4.f37202a;
                Intrinsics.checkNotNullExpressionValue("K4", "access$getTAG$p(...)");
                K4 k43 = K4.f37202a;
                C3774i4 c3774i4 = Y3.f38021a;
                Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
                C3774i4 c3774i42 = Y3.f38021a;
                K4.f37206e = X5.a(((SignalsConfig) c3774i42.a(SignalsConfig.class)).getKA());
                Context context = Ji.f37157a;
                if (context != null) {
                    Intrinsics.checkNotNullExpressionValue("K4", "TAG");
                    ConcurrentHashMap concurrentHashMap = Ea.f36782b;
                    Ea eaA = Da.a(context, "c_data_store");
                    Context context2 = Ji.f37157a;
                    int i10 = 1;
                    if (context2 != null) {
                        Ea eaA2 = Da.a(context2, "c_data_store");
                        Intrinsics.checkNotNullParameter("akv", C4240b4.i.W);
                        i10 = eaA2.f36783a.getInt("akv", 1);
                    }
                    Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
                    if (((SignalsConfig) c3774i42.a(SignalsConfig.class)).getVAK() != i10) {
                        Intrinsics.checkNotNullExpressionValue("K4", "TAG");
                        Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
                        eaA.a("akv", ((SignalsConfig) c3774i42.a(SignalsConfig.class)).getVAK(), false);
                        k43.f();
                    }
                }
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
