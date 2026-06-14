package org.bidon.sdk.segment.impl;

import com.ironsource.A1;
import kotlin.Metadata;
import kotlin.jvm.internal.v0;
import lf.m;
import org.bidon.sdk.segment.Segment;
import org.bidon.sdk.segment.Segmentation;
import org.bidon.sdk.utils.di.InstanceType;
import org.bidon.sdk.utils.di.SimpleDiStorage;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lorg/bidon/sdk/segment/impl/SegmentationImpl;", "Lorg/bidon/sdk/segment/Segmentation;", "<init>", "()V", A1.f40174i, "Lorg/bidon/sdk/segment/Segment;", "getSegment", "()Lorg/bidon/sdk/segment/Segment;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SegmentationImpl implements Segmentation {
    @Override // org.bidon.sdk.segment.Segmentation
    @NotNull
    public Segment getSegment() {
        InstanceType<?> instanceType = SimpleDiStorage.INSTANCE.getInstances().get(v0.b(Segment.class));
        if (instanceType instanceof InstanceType.Singleton) {
            Object singleton = ((InstanceType.Singleton) instanceType).getInstance();
            if (singleton != null) {
                return (Segment) singleton;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.segment.Segment");
        }
        if (instanceType instanceof InstanceType.Factory) {
            Object objBuild = ((InstanceType.Factory) instanceType).build();
            if (objBuild != null) {
                return (Segment) objBuild;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.segment.Segment");
        }
        if (instanceType instanceof InstanceType.ParamFactory) {
            new InstanceType.ParamFactory.Params();
            throw new IllegalArgumentException("Required value was null.");
        }
        if (instanceType != null) {
            throw new m();
        }
        throw new IllegalStateException(("No factory provided for class: " + Segment.class).toString());
    }
}
