package com.unity3d.ads.core.domain;

import android.content.Context;
import android.content.Intent;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer;
import com.unity3d.ads.adplayer.DisplayMessage;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006JU\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidHandleOpenUrl;", "Lcom/unity3d/ads/core/domain/HandleOpenUrl;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "intentCreation", "Lcom/unity3d/ads/core/domain/IntentCreation;", "(Landroid/content/Context;Lcom/unity3d/ads/core/domain/IntentCreation;)V", "invoke", "", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "url", "", "packageName", "action", HandleInvocationsFromAdViewer.KEY_EXTRAS, "", "", HandleInvocationsFromAdViewer.KEY_USE_ACTIVITY_FOR_RESULT, "", "(Lcom/unity3d/ads/core/data/model/AdObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidHandleOpenUrl implements HandleOpenUrl {

    @NotNull
    private final Context context;

    @NotNull
    private final IntentCreation intentCreation;

    public AndroidHandleOpenUrl(@NotNull Context context, @NotNull IntentCreation intentCreation) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intentCreation, "intentCreation");
        this.context = context;
        this.intentCreation = intentCreation;
    }

    @Override // com.unity3d.ads.core.domain.HandleOpenUrl
    @Nullable
    public Object invoke(@NotNull AdObject adObject, @NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Map<String, ? extends Object> map, boolean z10, @NotNull Continuation continuation) {
        Intent intentInvoke = this.intentCreation.invoke(str, str2, str3, map);
        if (adObject.getAdType() == DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_BANNER) {
            intentInvoke.setFlags(268435456);
            this.context.startActivity(intentInvoke);
            return Unit.f93236a;
        }
        MutableSharedFlow displayMessages = AndroidFullscreenWebViewAdPlayer.INSTANCE.getDisplayMessages();
        String string = ProtobufExtensionsKt.toUUID(adObject.getOpportunityId()).toString();
        Intrinsics.checkNotNullExpressionValue(string, "adObject.opportunityId.toUUID().toString()");
        Object objEmit = displayMessages.emit(new DisplayMessage.OpenUrl(string, intentInvoke, z10), continuation);
        return objEmit == b.g() ? objEmit : Unit.f93236a;
    }
}
