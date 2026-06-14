package com.vungle.ads.internal.model;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.vungle.ads.internal.Constants;
import com.vungle.ads.internal.model.AdPayload;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.jetbrains.annotations.NotNull;
import vg.a;
import yg.f;
import yg.i;
import yg.i2;
import yg.o0;
import yg.x0;
import yg.y2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/vungle/ads/internal/model/AdPayload.AdUnit.$serializer", "Lyg/o0;", "Lcom/vungle/ads/internal/model/AdPayload$AdUnit;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/vungle/ads/internal/model/AdPayload$AdUnit;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/vungle/ads/internal/model/AdPayload$AdUnit;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AdPayload$AdUnit$$serializer implements o0 {

    @NotNull
    public static final AdPayload$AdUnit$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        AdPayload$AdUnit$$serializer adPayload$AdUnit$$serializer = new AdPayload$AdUnit$$serializer();
        INSTANCE = adPayload$AdUnit$$serializer;
        i2 i2Var = new i2("com.vungle.ads.internal.model.AdPayload.AdUnit", adPayload$AdUnit$$serializer, 30);
        i2Var.n("id", true);
        i2Var.n("ad_type", true);
        i2Var.n(FirebaseAnalytics.Param.AD_SOURCE, true);
        i2Var.n("expiry", true);
        i2Var.n("expiry_duration", true);
        i2Var.n("deeplink_url", true);
        i2Var.n("click_coordinates_enabled", true);
        i2Var.n("ad_load_optimization", true);
        i2Var.n("template_heartbeat_check", true);
        i2Var.n("mediation_name", true);
        i2Var.n("info", true);
        i2Var.n("sleep", true);
        i2Var.n("error_code", true);
        i2Var.n("tpat", true);
        i2Var.n("vm_url", true);
        i2Var.n("vm_version", true);
        i2Var.n("ad_market_id", true);
        i2Var.n("notification", true);
        i2Var.n(Constants.LOAD_AD, true);
        i2Var.n("viewability", true);
        i2Var.n("template_type", true);
        i2Var.n("template_settings", true);
        i2Var.n("creative_id", true);
        i2Var.n("app_id", true);
        i2Var.n("show_close", true);
        i2Var.n("show_close_incentivized", true);
        i2Var.n(Reporting.Key.AD_SIZE, true);
        i2Var.n("webview_settings", true);
        i2Var.n("use_preloading", true);
        i2Var.n("ad_partial_download_enabled", true);
        descriptor = i2Var;
    }

    private AdPayload$AdUnit$$serializer() {
    }

    @Override // yg.o0
    @NotNull
    public KSerializer[] childSerializers() {
        y2 y2Var = y2.f119104a;
        KSerializer kSerializerT = a.t(y2Var);
        KSerializer kSerializerT2 = a.t(y2Var);
        KSerializer kSerializerT3 = a.t(y2Var);
        x0 x0Var = x0.f119093a;
        KSerializer kSerializerT4 = a.t(x0Var);
        KSerializer kSerializerT5 = a.t(x0Var);
        KSerializer kSerializerT6 = a.t(y2Var);
        i iVar = i.f118983a;
        return new KSerializer[]{kSerializerT, kSerializerT2, kSerializerT3, kSerializerT4, kSerializerT5, kSerializerT6, a.t(iVar), a.t(iVar), a.t(iVar), a.t(y2Var), a.t(y2Var), a.t(x0Var), a.t(x0Var), a.t(AdPayload.TpatSerializer.INSTANCE), a.t(y2Var), a.t(y2Var), a.t(y2Var), a.t(new f(y2Var)), a.t(new f(y2Var)), a.t(AdPayload$ViewAbility$$serializer.INSTANCE), a.t(y2Var), a.t(AdPayload$TemplateSettings$$serializer.INSTANCE), a.t(y2Var), a.t(y2Var), a.t(x0Var), a.t(x0Var), a.t(AdPayload$AdSizeInfo$$serializer.INSTANCE), a.t(AdPayload$WebViewSettings$$serializer.INSTANCE), a.t(iVar), a.t(iVar)};
    }

    /*  JADX ERROR: Type inference failed with stack overflow
        jadx.core.utils.exceptions.JadxOverflowException
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // ug.c
    @org.jetbrains.annotations.NotNull
    public com.vungle.ads.internal.model.AdPayload.AdUnit deserialize(@org.jetbrains.annotations.NotNull kotlinx.serialization.encoding.Decoder r82) {
        /*
            Method dump skipped, instruction units count: 2764
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.model.AdPayload$AdUnit$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.vungle.ads.internal.model.AdPayload$AdUnit");
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // ug.n
    public void serialize(@NotNull Encoder encoder, @NotNull AdPayload.AdUnit value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        xg.f fVarB = encoder.b(descriptor2);
        AdPayload.AdUnit.write$Self(value, fVarB, descriptor2);
        fVarB.c(descriptor2);
    }

    @Override // yg.o0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return o0.a.a(this);
    }
}
