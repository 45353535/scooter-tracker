package com.ironsource;

import android.text.TextUtils;
import com.ironsource.AbstractC4458o0;
import com.ironsource.D0;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.logger.IronLog;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public class K2 extends AbstractC4458o0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final WeakReference<N2> f41193j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final a f41194k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final L2 f41195l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K2(@NotNull C4441n0 tools, @NotNull L2 adUnitData, @NotNull N2 listener) {
        String str;
        int iB;
        super(tools, adUnitData, listener, null, 8, null);
        Intrinsics.checkNotNullParameter(tools, "tools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f41193j = new WeakReference<>(listener);
        this.f41194k = new a();
        this.f41195l = adUnitData;
        C4283dd c4283ddG = g();
        IronLog.INTERNAL.verbose("placement = " + c4283ddG);
        if (c4283ddG == null || TextUtils.isEmpty(c4283ddG.c())) {
            kotlin.jvm.internal.a1 a1Var = kotlin.jvm.internal.a1.f93282a;
            str = String.format("can't load banner - %s", Arrays.copyOf(new Object[]{c4283ddG == null ? "placement is null" : "placement name is empty"}, 1));
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
    public C4492q0 b() {
        return new R2(this.f41195l.b(), a(l()));
    }

    private final class a extends AbstractC4458o0.a implements InterfaceC4629y2 {
        public a() {
            super();
        }

        @Override // com.ironsource.InterfaceC4629y2
        public void a(@NotNull C4595w2 instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            IronLog.INTERNAL.verbose(K2.this.a(instance.q()));
            N2 n22 = (N2) K2.this.f41193j.get();
            if (n22 != null) {
                n22.g();
            }
        }

        @Override // com.ironsource.AbstractC4458o0.a, com.ironsource.D
        public void b(@NotNull AbstractC4643z instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            super.b(instance);
            InterfaceC4610x0 interfaceC4610x0I = K2.this.i();
            if (interfaceC4610x0I != null) {
                interfaceC4610x0I.a(instance.e());
            }
        }

        @Override // com.ironsource.InterfaceC4629y2
        public void c(@NotNull C4595w2 instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            IronLog.INTERNAL.verbose(K2.this.a(instance.q()));
            N2 n22 = (N2) K2.this.f41193j.get();
            if (n22 != null) {
                n22.h();
            }
        }

        @Override // com.ironsource.InterfaceC4629y2
        public void b(@NotNull C4595w2 instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            IronLog.INTERNAL.verbose(K2.this.a(instance.q()));
            N2 n22 = (N2) K2.this.f41193j.get();
            if (n22 != null) {
                n22.j();
            }
        }
    }

    private final ISBannerSize l() {
        return f().a(this.f41195l.b().h());
    }

    public final void a(@Nullable eg egVar, @NotNull InterfaceC4610x0 displayListener) {
        Intrinsics.checkNotNullParameter(displayListener, "displayListener");
        if (egVar != null) {
            a(new A2(egVar), displayListener);
        }
    }

    @Override // com.ironsource.AbstractC4458o0
    @NotNull
    protected C a() {
        return new C() { // from class: com.ironsource.ji
            @Override // com.ironsource.C
            public final AbstractC4643z a(A a10, G g10) {
                return K2.a(this.f43426a, a10, g10);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC4643z a(K2 this$0, A instanceData, G adInstancePayload) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        Intrinsics.checkNotNullParameter(adInstancePayload, "adInstancePayload");
        return new C4595w2(new V0(this$0.f(), D0.b.PROVIDER), instanceData, adInstancePayload, this$0.f41194k);
    }

    private final ISBannerSize a(ISBannerSize iSBannerSize) {
        if (!iSBannerSize.isSmart()) {
            return iSBannerSize;
        }
        if (AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext())) {
            return com.ironsource.mediationsdk.l.a();
        }
        return ISBannerSize.BANNER;
    }
}
