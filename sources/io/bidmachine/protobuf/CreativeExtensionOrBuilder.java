package io.bidmachine.protobuf;

import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import io.bidmachine.protobuf.CreativeExtension;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public interface CreativeExtensionOrBuilder extends MessageOrBuilder {
    CreativeExtension.AssetAppearance getAsset();

    CreativeExtension.AssetAppearanceOrBuilder getAssetOrBuilder();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

    CreativeExtension.Feature getFeatures(int i10);

    int getFeaturesCount();

    List<CreativeExtension.Feature> getFeaturesList();

    CreativeExtension.FeatureOrBuilder getFeaturesOrBuilder(int i10);

    List<? extends CreativeExtension.FeatureOrBuilder> getFeaturesOrBuilderList();

    CreativeExtension.Postbanner getPostbanners(int i10);

    int getPostbannersCount();

    List<CreativeExtension.Postbanner> getPostbannersList();

    CreativeExtension.PostbannerOrBuilder getPostbannersOrBuilder(int i10);

    List<? extends CreativeExtension.PostbannerOrBuilder> getPostbannersOrBuilderList();

    boolean hasAsset();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
