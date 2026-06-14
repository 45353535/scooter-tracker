package com.vungle.ads.internal.omsdk;

import android.util.Base64;
import android.view.View;
import com.iab.omid.library.vungle.Omid;
import com.iab.omid.library.vungle.adsession.AdEvents;
import com.iab.omid.library.vungle.adsession.AdSession;
import com.iab.omid.library.vungle.adsession.AdSessionConfiguration;
import com.iab.omid.library.vungle.adsession.AdSessionContext;
import com.iab.omid.library.vungle.adsession.CreativeType;
import com.iab.omid.library.vungle.adsession.ImpressionType;
import com.iab.omid.library.vungle.adsession.Owner;
import com.iab.omid.library.vungle.adsession.Partner;
import com.iab.omid.library.vungle.adsession.VerificationScriptResource;
import com.mbridge.msdk.MBridgeConstans;
import com.vungle.ads.BuildConfig;
import com.vungle.ads.internal.model.OmSdkData;
import com.vungle.ads.internal.util.Logger;
import java.net.URL;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v0;
import kotlin.text.Charsets;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.e;
import kotlinx.serialization.json.v;
import net.pubnative.lite.sdk.utils.AtomManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/vungle/ads/internal/omsdk/NativeOMTracker;", "", "", "omSdkData", "omSdkJS", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "", "start", "(Landroid/view/View;)V", AtomManager.ATOM_STOP_METHOD_NAME, "()V", "impressionOccurred", "Lkotlinx/serialization/json/b;", "json", "Lkotlinx/serialization/json/b;", "Lcom/iab/omid/library/vungle/adsession/AdSession;", "adSession", "Lcom/iab/omid/library/vungle/adsession/AdSession;", "Lcom/iab/omid/library/vungle/adsession/AdEvents;", "adEvents", "Lcom/iab/omid/library/vungle/adsession/AdEvents;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class NativeOMTracker {

    @Nullable
    private AdEvents adEvents;

    @Nullable
    private AdSession adSession;

    @NotNull
    private final b json;

    public NativeOMTracker(@NotNull String omSdkData, @NotNull String omSdkJS) {
        OmSdkData omSdkData2;
        Intrinsics.checkNotNullParameter(omSdkData, "omSdkData");
        Intrinsics.checkNotNullParameter(omSdkJS, "omSdkJS");
        b bVarB = v.b(null, new Function1<e, Unit>() { // from class: com.vungle.ads.internal.omsdk.NativeOMTracker$json$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(e eVar) {
                invoke2(eVar);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull e Json) {
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                Json.f(true);
                Json.d(true);
                Json.e(false);
            }
        }, 1, null);
        this.json = bVarB;
        try {
            AdSessionConfiguration adSessionConfigurationCreateAdSessionConfiguration = AdSessionConfiguration.createAdSessionConfiguration(CreativeType.NATIVE_DISPLAY, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, Owner.NONE, false);
            Partner partnerCreatePartner = Partner.createPartner(BuildConfig.OMSDK_PARTNER_NAME, BuildConfig.VERSION_NAME);
            byte[] bArrDecode = Base64.decode(omSdkData, 0);
            if (bArrDecode != null) {
                String str = new String(bArrDecode, Charsets.UTF_8);
                KSerializer kSerializerB = ug.v.b(bVarB.a(), v0.o(OmSdkData.class));
                Intrinsics.checkNotNull(kSerializerB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                omSdkData2 = (OmSdkData) bVarB.c(kSerializerB, str);
            } else {
                omSdkData2 = null;
            }
            VerificationScriptResource verificationScriptResource = VerificationScriptResource.createVerificationScriptResourceWithParameters(omSdkData2 != null ? omSdkData2.getVendorKey() : null, new URL(omSdkData2 != null ? omSdkData2.getVendorURL() : null), omSdkData2 != null ? omSdkData2.getParams() : null);
            Intrinsics.checkNotNullExpressionValue(verificationScriptResource, "verificationScriptResource");
            this.adSession = AdSession.createAdSession(adSessionConfigurationCreateAdSessionConfiguration, AdSessionContext.createNativeAdSessionContext(partnerCreatePartner, omSdkJS, CollectionsKt.listOf(verificationScriptResource), null, null));
        } catch (Exception e10) {
            Logger.INSTANCE.e("NativeOMTracker", "error occured when create omsdk adSession:", e10);
        }
    }

    public final void impressionOccurred() {
        AdEvents adEvents = this.adEvents;
        if (adEvents != null) {
            adEvents.impressionOccurred();
        }
    }

    public final void start(@NotNull View view) {
        AdSession adSession;
        Intrinsics.checkNotNullParameter(view, "view");
        if (!Omid.isActive() || (adSession = this.adSession) == null) {
            return;
        }
        adSession.registerAdView(view);
        adSession.start();
        AdEvents adEventsCreateAdEvents = AdEvents.createAdEvents(adSession);
        this.adEvents = adEventsCreateAdEvents;
        if (adEventsCreateAdEvents != null) {
            adEventsCreateAdEvents.loaded();
        }
    }

    public final void stop() {
        AdSession adSession = this.adSession;
        if (adSession != null) {
            adSession.finish();
        }
        this.adSession = null;
    }
}
