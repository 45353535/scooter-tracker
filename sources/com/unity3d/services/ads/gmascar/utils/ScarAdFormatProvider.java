package com.unity3d.services.ads.gmascar.utils;

import com.ironsource.C4455ne;
import com.unity3d.ads.AdFormat;
import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.core.extensions.AdFormatExtensions;
import com.unity3d.services.core.configuration.IExperiments;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m6.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/unity3d/services/ads/gmascar/utils/ScarAdFormatProvider;", "Lcom/unity3d/services/ads/gmascar/utils/IScarAdFormatProvider;", "Lcom/unity3d/ads/TokenConfiguration;", "tokenConfiguration", "Lcom/unity3d/services/core/configuration/IExperiments;", C4455ne.f44465d, "<init>", "(Lcom/unity3d/ads/TokenConfiguration;Lcom/unity3d/services/core/configuration/IExperiments;)V", "", "Lm6/d;", "buildAdFormatList", "()Ljava/util/List;", "Lcom/unity3d/ads/TokenConfiguration;", "getTokenConfiguration", "()Lcom/unity3d/ads/TokenConfiguration;", "Lcom/unity3d/services/core/configuration/IExperiments;", "getExperiments", "()Lcom/unity3d/services/core/configuration/IExperiments;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ScarAdFormatProvider implements IScarAdFormatProvider {

    @NotNull
    private final IExperiments experiments;

    @Nullable
    private final TokenConfiguration tokenConfiguration;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdFormat.values().length];
            try {
                iArr[AdFormat.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ScarAdFormatProvider(@Nullable TokenConfiguration tokenConfiguration, @NotNull IExperiments experiments) {
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.tokenConfiguration = tokenConfiguration;
        this.experiments = experiments;
    }

    @Override // com.unity3d.services.ads.gmascar.utils.IScarAdFormatProvider
    @NotNull
    public List<d> buildAdFormatList() {
        ArrayList arrayList = new ArrayList();
        TokenConfiguration tokenConfiguration = this.tokenConfiguration;
        if (tokenConfiguration == null) {
            arrayList.add(d.REWARDED);
            arrayList.add(d.INTERSTITIAL);
            if (this.experiments.isScarBannerHbEnabled()) {
                arrayList.add(d.BANNER);
                return arrayList;
            }
        } else {
            if (WhenMappings.$EnumSwitchMapping$0[tokenConfiguration.getAdFormat().ordinal()] != 1) {
                arrayList.add(AdFormatExtensions.toUnityAdFormat(this.tokenConfiguration.getAdFormat()));
                return arrayList;
            }
            if (this.experiments.isScarBannerHbEnabled()) {
                arrayList.add(d.BANNER);
            }
        }
        return arrayList;
    }

    @NotNull
    public final IExperiments getExperiments() {
        return this.experiments;
    }

    @Nullable
    public final TokenConfiguration getTokenConfiguration() {
        return this.tokenConfiguration;
    }
}
