package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.data.datasource.MediationDataSource;
import gatewayprotocol.v1.ClientInfoOuterClass;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/unity3d/ads/core/data/repository/AndroidMediationRepository;", "Lcom/unity3d/ads/core/data/repository/MediationRepository;", "mediationDataSource", "Lcom/unity3d/ads/core/data/datasource/MediationDataSource;", "(Lcom/unity3d/ads/core/data/datasource/MediationDataSource;)V", "mediationProvider", "Lkotlin/Function0;", "Lgatewayprotocol/v1/ClientInfoOuterClass$MediationProvider;", "getMediationProvider", "()Lkotlin/jvm/functions/Function0;", "name", "", "getName", "()Ljava/lang/String;", "version", "getVersion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidMediationRepository implements MediationRepository {

    @NotNull
    private final MediationDataSource mediationDataSource;

    public AndroidMediationRepository(@NotNull MediationDataSource mediationDataSource) {
        Intrinsics.checkNotNullParameter(mediationDataSource, "mediationDataSource");
        this.mediationDataSource = mediationDataSource;
    }

    @Override // com.unity3d.ads.core.data.repository.MediationRepository
    @NotNull
    public Function0<ClientInfoOuterClass.MediationProvider> getMediationProvider() {
        return new Function0<ClientInfoOuterClass.MediationProvider>() { // from class: com.unity3d.ads.core.data.repository.AndroidMediationRepository$mediationProvider$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ClientInfoOuterClass.MediationProvider invoke() {
                String name = this.this$0.getName();
                if (name != null) {
                    ClientInfoOuterClass.MediationProvider mediationProvider = StringsKt.a0(name, "AppLovinSdk_", false, 2, null) ? ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_MAX : StringsKt.N(name, "AdMob", true) ? ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_ADMOB : StringsKt.N(name, "MAX", true) ? ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_MAX : StringsKt.N(name, "ironSource", true) ? ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_LEVELPLAY : ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_CUSTOM;
                    if (mediationProvider != null) {
                        return mediationProvider;
                    }
                }
                return ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_UNSPECIFIED;
            }
        };
    }

    @Override // com.unity3d.ads.core.data.repository.MediationRepository
    @Nullable
    public String getName() {
        return this.mediationDataSource.getName();
    }

    @Override // com.unity3d.ads.core.data.repository.MediationRepository
    @Nullable
    public String getVersion() {
        return this.mediationDataSource.getVersion();
    }
}
