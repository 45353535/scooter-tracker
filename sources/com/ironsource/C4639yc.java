package com.ironsource;

import android.app.Activity;
import com.ironsource.sdk.IronSourceNetwork;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.yc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4639yc implements InterfaceC4622xc {
    @Override // com.ironsource.InterfaceC4622xc
    public void a(@NotNull Activity activity, @NotNull L9 adInstance, @NotNull Map<String, String> showParams) throws Exception {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(showParams, "showParams");
        IronSourceNetwork.showAd(activity, adInstance, showParams);
    }

    @Override // com.ironsource.InterfaceC4622xc
    public boolean a(@NotNull L9 adInstance) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        return IronSourceNetwork.isAdAvailableForInstance(adInstance);
    }
}
