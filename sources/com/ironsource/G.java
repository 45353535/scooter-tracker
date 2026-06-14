package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC4576v0 f40928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final NetworkSettings f40929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Lazy f40930c;

    static final class a extends Lambda implements Function0<BaseAdAdapter<?, ?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ V0 f40931a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ G f40932b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(V0 v02, G g10) {
            super(0);
            this.f40931a = v02;
            this.f40932b = g10;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BaseAdAdapter<?, ?> invoke() {
            return this.f40931a.a(this.f40932b.e(), this.f40932b.a(), this.f40932b.d());
        }
    }

    public G(@NotNull V0 adTools, @NotNull AbstractC4576v0 adUnitData, @NotNull NetworkSettings providerSettings) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        this.f40928a = adUnitData;
        this.f40929b = providerSettings;
        this.f40930c = lf.i.a(new a(adTools, this));
    }

    @NotNull
    public final IronSource.a a() {
        return this.f40928a.b().a();
    }

    @Nullable
    public final BaseAdAdapter<?, ?> b() {
        return (BaseAdAdapter) this.f40930c.getValue();
    }

    @NotNull
    public final String c() {
        String providerName = this.f40929b.getProviderName();
        Intrinsics.checkNotNullExpressionValue(providerName, "providerSettings.providerName");
        return providerName;
    }

    @NotNull
    public final UUID d() {
        return this.f40928a.b().b();
    }

    @NotNull
    public final NetworkSettings e() {
        return this.f40929b;
    }
}
