package org.bidon.sdk.ads.banner.helper.impl;

import android.content.Context;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.ads.banner.helper.GetOrientationUseCase;
import org.bidon.sdk.auction.models.AdObjectRequest;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0007H\u0096\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lorg/bidon/sdk/ads/banner/helper/impl/GetOrientationUseCaseImpl;", "Lorg/bidon/sdk/ads/banner/helper/GetOrientationUseCase;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "invoke", "Lorg/bidon/sdk/auction/models/AdObjectRequest$Orientation;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GetOrientationUseCaseImpl implements GetOrientationUseCase {

    @NotNull
    private final Context context;

    public GetOrientationUseCaseImpl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @Override // org.bidon.sdk.ads.banner.helper.GetOrientationUseCase
    @NotNull
    public AdObjectRequest.Orientation invoke() {
        int i10 = this.context.getResources().getConfiguration().orientation;
        return i10 != 1 ? i10 != 2 ? AdObjectRequest.Orientation.Portrait : AdObjectRequest.Orientation.Landscape : AdObjectRequest.Orientation.Portrait;
    }
}
