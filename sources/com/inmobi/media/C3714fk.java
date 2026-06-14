package com.inmobi.media;

import android.os.Build;
import androidx.compose.material.TextFieldImplKt;
import com.inmobi.media.C3714fk;
import com.inmobi.media.I2;
import com.inmobi.media.core.config.models.TelemetryConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.fk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3714fk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TelemetryConfig f38588a;

    public C3714fk(TelemetryConfig telemetryConfig) {
        Intrinsics.checkNotNullParameter(telemetryConfig, "telemetryConfig");
        this.f38588a = telemetryConfig;
        ((C4155xc) Ji.f37161e.getValue()).a(new int[]{TextFieldImplKt.AnimationDuration, 152}, new Function1() { // from class: w3.e7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3714fk.a(this.f107036b, (I2) obj);
            }
        });
    }

    public static final Unit a(C3714fk c3714fk, I2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        switch (it.f37045a) {
            case TextFieldImplKt.AnimationDuration /* 150 */:
                Map map = it.f37047c;
                Object obj = map != null ? map.get("data") : null;
                c3714fk.a("CrashEventOccurred", obj instanceof T4 ? (T4) obj : null);
                break;
            case 151:
                Map map2 = it.f37047c;
                Object obj2 = map2 != null ? map2.get("data") : null;
                Wn wn = obj2 instanceof Wn ? (Wn) obj2 : null;
                c3714fk.getClass();
                if (wn != null && AbstractC3790il.a(wn)) {
                    C4148x5.f39893a.getClass();
                    if (!C4148x5.r()) {
                        c3714fk.a("MainThreadBlockedEvent", wn);
                    }
                }
                break;
            case 152:
                Map map3 = it.f37047c;
                Object obj3 = map3 != null ? map3.get("data") : null;
                c3714fk.a(obj3 instanceof C4194z1 ? (C4194z1) obj3 : null);
                break;
        }
        return Unit.f93236a;
    }

    public final void a(C4194z1 c4194z1) {
        if (Build.VERSION.SDK_INT < 30 || c4194z1 == null || c4194z1.f40026g != 6) {
            return;
        }
        a("ANREvent", c4194z1);
    }

    public final void a(String str, Q9 q92) {
        if (this.f38588a.getPriorityEventsList().contains(str) && q92 != null && AbstractC3790il.a(q92)) {
            Wj.b(str, new LinkedHashMap(), EnumC3585ak.f38215a);
        }
    }
}
