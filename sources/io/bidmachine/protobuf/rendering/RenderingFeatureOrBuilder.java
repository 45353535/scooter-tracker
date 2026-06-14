package io.bidmachine.protobuf.rendering;

import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import io.bidmachine.protobuf.rendering.RenderingFeature;

/* JADX INFO: loaded from: classes3.dex */
public interface RenderingFeatureOrBuilder extends MessageOrBuilder {
    RenderingFeature.BrokenCreativeDetector getBrokenCreativeDetector();

    RenderingFeature.BrokenCreativeDetectorOrBuilder getBrokenCreativeDetectorOrBuilder();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

    RenderingFeature.FeatureCase getFeatureCase();

    boolean hasBrokenCreativeDetector();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
