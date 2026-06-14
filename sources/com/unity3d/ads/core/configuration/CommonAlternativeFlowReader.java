package com.unity3d.ads.core.configuration;

import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.services.core.configuration.ConfigurationReader;
import hg.l0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u000bH\u0096\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/unity3d/ads/core/configuration/CommonAlternativeFlowReader;", "Lcom/unity3d/ads/core/configuration/AlternativeFlowReader;", "configurationReader", "Lcom/unity3d/services/core/configuration/ConfigurationReader;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "mediationMetadataReader", "Lcom/unity3d/ads/core/configuration/MediationTraitsMetadataReader;", "(Lcom/unity3d/services/core/configuration/ConfigurationReader;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/configuration/MediationTraitsMetadataReader;)V", "isAlternativeFlowEnabled", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "isAlternativeFlowRead", "invoke", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CommonAlternativeFlowReader implements AlternativeFlowReader {

    @NotNull
    private final ConfigurationReader configurationReader;

    @NotNull
    private final MutableStateFlow isAlternativeFlowEnabled;

    @NotNull
    private final MutableStateFlow isAlternativeFlowRead;

    @NotNull
    private final MediationTraitsMetadataReader mediationMetadataReader;

    @NotNull
    private final SessionRepository sessionRepository;

    public CommonAlternativeFlowReader(@NotNull ConfigurationReader configurationReader, @NotNull SessionRepository sessionRepository, @NotNull MediationTraitsMetadataReader mediationMetadataReader) {
        Intrinsics.checkNotNullParameter(configurationReader, "configurationReader");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(mediationMetadataReader, "mediationMetadataReader");
        this.configurationReader = configurationReader;
        this.sessionRepository = sessionRepository;
        this.mediationMetadataReader = mediationMetadataReader;
        this.isAlternativeFlowRead = l0.a(Boolean.FALSE);
        this.isAlternativeFlowEnabled = l0.a(Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    @Override // com.unity3d.ads.core.configuration.AlternativeFlowReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean invoke() {
        /*
            r4 = this;
            kotlinx.coroutines.flow.MutableStateFlow r0 = r4.isAlternativeFlowRead
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1b
            kotlinx.coroutines.flow.MutableStateFlow r0 = r4.isAlternativeFlowEnabled
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L1b:
            com.unity3d.ads.core.configuration.MediationTraitsMetadataReader r0 = r4.mediationMetadataReader
            com.unity3d.services.core.misc.JsonStorage r1 = r0.getJsonStorage()
            java.lang.String r0 = r0.getKey()
            java.lang.Object r0 = r1.get(r0)
            r1 = 0
            if (r0 == 0) goto L39
            java.lang.String r2 = "get(key)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            boolean r2 = r0 instanceof org.json.JSONObject
            if (r2 == 0) goto L36
            goto L37
        L36:
            r0 = r1
        L37:
            if (r0 != 0) goto L3a
        L39:
            r0 = r1
        L3a:
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            if (r0 == 0) goto L5d
            java.lang.String r2 = "boldSdkEnabled"
            boolean r3 = r0.has(r2)
            if (r3 == 0) goto L47
            r1 = r0
        L47:
            if (r1 == 0) goto L5d
            kotlinx.coroutines.flow.MutableStateFlow r0 = r4.isAlternativeFlowEnabled
            boolean r1 = r1.optBoolean(r2)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.setValue(r1)
            kotlinx.coroutines.flow.MutableStateFlow r0 = r4.isAlternativeFlowRead
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.setValue(r1)
        L5d:
            kotlinx.coroutines.flow.MutableStateFlow r0 = r4.isAlternativeFlowRead
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto La1
            com.unity3d.services.core.configuration.ConfigurationReader r0 = r4.configurationReader
            com.unity3d.services.core.configuration.Configuration r0 = r0.getCurrentConfiguration()
            com.unity3d.services.core.configuration.IExperiments r0 = r0.getExperiments()
            boolean r0 = r0.isBoldSdkNextSessionEnabled()
            if (r0 != 0) goto L83
            kotlinx.coroutines.flow.MutableStateFlow r0 = r4.isAlternativeFlowEnabled
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.setValue(r1)
            goto L9a
        L83:
            kotlinx.coroutines.flow.MutableStateFlow r0 = r4.isAlternativeFlowEnabled
            com.unity3d.ads.core.data.repository.SessionRepository r1 = r4.sessionRepository
            gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfiguration r1 = r1.getNativeConfiguration()
            gatewayprotocol.v1.NativeConfigurationOuterClass$FeatureFlags r1 = r1.getFeatureFlags()
            boolean r1 = r1.getBoldSdkNextSessionEnabled()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.setValue(r1)
        L9a:
            kotlinx.coroutines.flow.MutableStateFlow r0 = r4.isAlternativeFlowRead
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.setValue(r1)
        La1:
            kotlinx.coroutines.flow.MutableStateFlow r0 = r4.isAlternativeFlowEnabled
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.configuration.CommonAlternativeFlowReader.invoke():boolean");
    }
}
