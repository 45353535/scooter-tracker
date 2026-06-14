package com.ironsource;

import android.text.TextUtils;
import com.ironsource.AbstractC4458o0;
import com.ironsource.D0;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.bc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4248bc extends AbstractC4458o0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4248bc(@NotNull C4441n0 adTools, @NotNull C4265cc adUnitData, @NotNull InterfaceC4282dc listener) {
        String str;
        int iB;
        super(adTools, adUnitData, listener, null, 8, null);
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(listener, "listener");
        C4283dd c4283ddG = g();
        IronLog.INTERNAL.verbose("placement = " + c4283ddG);
        if (c4283ddG == null || TextUtils.isEmpty(c4283ddG.c())) {
            kotlin.jvm.internal.a1 a1Var = kotlin.jvm.internal.a1.f93282a;
            str = String.format("can't load native ad - %s", Arrays.copyOf(new Object[]{c4283ddG == null ? "placement is null" : "placement name is empty"}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
            iB = C4644z0.b(adUnitData.b().a());
        } else {
            str = null;
            iB = 510;
        }
        if (str != null) {
            IronLog.API.error(a(str));
            a(iB, str);
        }
    }

    @Override // com.ironsource.AbstractC4458o0
    @NotNull
    protected C a() {
        return new C() { // from class: com.ironsource.kk
            @Override // com.ironsource.C
            public final AbstractC4643z a(A a10, G g10) {
                return C4248bc.a(this.f43490a, a10, g10);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC4643z a(C4248bc this$0, A adInstanceData, G adInstancePayload) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInstanceData, "adInstanceData");
        Intrinsics.checkNotNullParameter(adInstancePayload, "adInstancePayload");
        return new Tb(new V0(this$0.f(), D0.b.PROVIDER), adInstanceData, adInstancePayload, new AbstractC4458o0.a());
    }
}
