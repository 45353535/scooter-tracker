package com.unity3d.ads.core.domain.exposure;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.ads.core.domain.om.IsOMActivated;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "([Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class CommonAdViewerExposedFunctionsKt$getAdContext$1 implements ExposedFunction {
    final /* synthetic */ String $adData;
    final /* synthetic */ String $adDataRefreshToken;
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ AndroidGetAdPlayerContext $getAndroidAdPlayerContext;
    final /* synthetic */ String $impressionConfig;
    final /* synthetic */ IsOMActivated $isOMActivated;

    CommonAdViewerExposedFunctionsKt$getAdContext$1(String str, String str2, String str3, AndroidGetAdPlayerContext androidGetAdPlayerContext, AdObject adObject, IsOMActivated isOMActivated) {
        this.$adData = str;
        this.$impressionConfig = str2;
        this.$adDataRefreshToken = str3;
        this.$getAndroidAdPlayerContext = androidGetAdPlayerContext;
        this.$adObject = adObject;
        this.$isOMActivated = isOMActivated;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // kotlin.jvm.functions.Function2
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull java.lang.Object[] r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r12) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getAdContext$1.invoke(java.lang.Object[], kotlin.coroutines.Continuation):java.lang.Object");
    }
}
