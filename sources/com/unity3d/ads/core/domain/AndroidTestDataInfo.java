package com.unity3d.ads.core.domain;

import com.taurusx.tax.f.y;
import com.unity3d.ads.core.configuration.AndroidManifestIntPropertyReader;
import gatewayprotocol.v1.TestDataKt;
import gatewayprotocol.v1.TestDataOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0096\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidTestDataInfo;", "Lcom/unity3d/ads/core/domain/GetTestDataInfo;", "androidManifestIntPropertyReader", "Lcom/unity3d/ads/core/configuration/AndroidManifestIntPropertyReader;", "(Lcom/unity3d/ads/core/configuration/AndroidManifestIntPropertyReader;)V", "invoke", "Lgatewayprotocol/v1/TestDataOuterClass$TestData;", y.f66058y, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidTestDataInfo implements GetTestDataInfo {

    @NotNull
    public static final String EXCHANGE_TEST_MODE = "ExchangeTestMode";

    @NotNull
    private final AndroidManifestIntPropertyReader androidManifestIntPropertyReader;

    public AndroidTestDataInfo(@NotNull AndroidManifestIntPropertyReader androidManifestIntPropertyReader) {
        Intrinsics.checkNotNullParameter(androidManifestIntPropertyReader, "androidManifestIntPropertyReader");
        this.androidManifestIntPropertyReader = androidManifestIntPropertyReader;
    }

    @Override // com.unity3d.ads.core.domain.GetTestDataInfo
    @Nullable
    public TestDataOuterClass.TestData invoke() {
        TestDataKt.Dsl.Companion companion = TestDataKt.Dsl.INSTANCE;
        TestDataOuterClass.TestData.Builder builderNewBuilder = TestDataOuterClass.TestData.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        TestDataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        Integer propertyByName = this.androidManifestIntPropertyReader.getPropertyByName(EXCHANGE_TEST_MODE);
        if (propertyByName != null) {
            dsl_create.setForceExchangeTestMode(propertyByName.intValue());
        }
        TestDataOuterClass.TestData testData_build = dsl_create._build();
        if (testData_build.hasForceExchangeTestMode()) {
            return testData_build;
        }
        return null;
    }
}
