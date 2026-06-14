package com.ironsource;

import android.text.TextUtils;
import com.ironsource.AbstractC4425m3;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class Wb extends AbstractC4425m3<C4230ac, AdapterAdListener> implements Q0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Wb(@Nullable List<? extends NetworkSettings> list, @NotNull Nb configs, @Nullable String str, @NotNull C4432ma publisherDataHolder, @Nullable C4246ba c4246ba) {
        super(new Xb(str, list, configs), publisherDataHolder, c4246ba);
        Intrinsics.checkNotNullParameter(configs, "configs");
        Intrinsics.checkNotNullParameter(publisherDataHolder, "publisherDataHolder");
    }

    @Override // com.ironsource.AbstractC4425m3
    protected void G() {
    }

    @Override // com.ironsource.AbstractC4425m3
    protected boolean H() {
        return false;
    }

    public final void M() {
        Sf sf2;
        int iIntValue;
        C4621xb c4621xb;
        IronLog.INTERNAL.verbose();
        try {
            C4230ac c4230ac = (C4230ac) this.f43642a.d();
            if (c4230ac != null) {
                Integer numR = c4230ac.r();
                if (numR == null) {
                    iIntValue = this.C.a(this.f43656o.b());
                } else {
                    Intrinsics.checkNotNullExpressionValue(numR, "it.sessionDepth ?: sessi…epth(mManagerData.adUnit)");
                    iIntValue = numR.intValue();
                }
                D0 d02 = this.f43660s;
                if (d02 != null && (c4621xb = d02.f40512f) != null) {
                    c4621xb.a(iIntValue);
                }
                c4230ac.P();
                this.f43642a.a(null);
                this.f43642a.b(null);
            }
            this.f43650i = null;
            a(AbstractC4425m3.f.NONE);
        } catch (Throwable th2) {
            C4462o4.d().a(th2);
            String str = "destroyNativeAd - exception = " + th2.getLocalizedMessage();
            IronLog.INTERNAL.error(b(str));
            D0 d03 = this.f43660s;
            if (d03 == null || (sf2 = d03.f40516j) == null) {
                return;
            }
            sf2.g(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ironsource.AbstractC4425m3
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C4230ac a(@NotNull NetworkSettings providerSettings, @NotNull BaseAdAdapter<?, AdapterAdListener> adapter, int i10, @NotNull String currentAuctionId, @NotNull C4424m2 item) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(currentAuctionId, "currentAuctionId");
        Intrinsics.checkNotNullParameter(item, "item");
        return new C4230ac(this, new C4405l0(IronSource.a.NATIVE_AD, this.f43656o.o(), i10, this.f43648g, currentAuctionId, this.f43646e, this.f43647f, providerSettings, this.f43656o.n()), adapter, this.f43650i, item, this);
    }

    @Override // com.ironsource.AbstractC4425m3
    @NotNull
    protected K0 g() {
        return new C4376j5();
    }

    @Override // com.ironsource.AbstractC4425m3
    @NotNull
    protected String l() {
        return "NA";
    }

    @Override // com.ironsource.AbstractC4425m3
    @NotNull
    protected String o() {
        return IronSourceConstants.OPW_NT_MANAGER_NAME;
    }

    @Override // com.ironsource.AbstractC4425m3
    protected boolean v() {
        return false;
    }

    public final void a(@Nullable C4283dd c4283dd) {
        String str;
        int iB;
        IronLog.INTERNAL.verbose("placement = " + c4283dd);
        if (c4283dd == null || TextUtils.isEmpty(c4283dd.c())) {
            kotlin.jvm.internal.a1 a1Var = kotlin.jvm.internal.a1.f93282a;
            str = String.format("can't load native ad - %s", Arrays.copyOf(new Object[]{c4283dd == null ? "placement is null" : "placement name is empty"}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
            iB = C4644z0.b(this.f43656o.b());
        } else if (this.E.c(ContextProvider.getInstance().getApplicationContext(), c4283dd, this.f43656o.b())) {
            kotlin.jvm.internal.a1 a1Var2 = kotlin.jvm.internal.a1.f93282a;
            str = String.format("placement %s is capped", Arrays.copyOf(new Object[]{c4283dd.c()}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
            iB = C4644z0.f(this.f43656o.b());
        } else {
            str = null;
            iB = 510;
        }
        if (TextUtils.isEmpty(str)) {
            this.f43650i = c4283dd;
            A();
        } else {
            IronLog.API.error(b(str));
            a(iB, str, false);
        }
    }

    @Override // com.ironsource.AbstractC4425m3
    @NotNull
    protected JSONObject b(@NotNull NetworkSettings providerSettings) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        JSONObject nativeAdSettings = providerSettings.getNativeAdSettings();
        Intrinsics.checkNotNullExpressionValue(nativeAdSettings, "providerSettings.nativeAdSettings");
        return nativeAdSettings;
    }

    public final void a(@NotNull InternalNativeAdListener nativeAdListener) {
        Intrinsics.checkNotNullParameter(nativeAdListener, "nativeAdListener");
        a(new Vb(nativeAdListener));
    }

    @Override // com.ironsource.AbstractC4425m3
    protected void a(@Nullable AbstractC4478p3<?> abstractC4478p3, @Nullable AdInfo adInfo) {
        if (abstractC4478p3 instanceof C4230ac) {
            C4230ac c4230ac = (C4230ac) abstractC4478p3;
            this.f43661t.a(c4230ac.Q(), c4230ac.R(), adInfo);
        }
    }

    @Override // com.ironsource.AbstractC4425m3
    protected void a(@Nullable IronSourceError ironSourceError) {
        this.f43661t.a(ironSourceError);
    }

    @Override // com.ironsource.AbstractC4425m3, com.ironsource.C0
    @NotNull
    public Map<String, Object> a(@NotNull A0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Map<String, Object> data = super.a(event);
        C4283dd c4283dd = this.f43650i;
        if (c4283dd != null) {
            Intrinsics.checkNotNullExpressionValue(data, "data");
            data.put("placement", c4283dd.c());
        }
        UUID uuid = this.f43664w;
        if (uuid != null) {
            Intrinsics.checkNotNullExpressionValue(data, "data");
            data.put("objectId", uuid);
        }
        Intrinsics.checkNotNullExpressionValue(data, "data");
        return data;
    }
}
