package androidx.compose.ui.graphics;

import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@ExperimentalComposeUiApi
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0092\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u001aø\u0001\u0000¢\u0006\u0002\u0010\u001bJ\t\u00105\u001a\u00020\u0004HÆ\u0003J\t\u00106\u001a\u00020\u0004HÆ\u0003J\u0019\u00107\u001a\u00020\u000fHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b8\u0010\u001fJ\t\u00109\u001a\u00020\u0011HÆ\u0003J\t\u0010:\u001a\u00020\u0013HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u0019\u0010<\u001a\u00020\u0017HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b=\u0010\u001fJ\u0019\u0010>\u001a\u00020\u0017HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b?\u0010\u001fJ\u0019\u0010@\u001a\u00020\u001aHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bA\u0010%J\t\u0010B\u001a\u00020\u0004HÆ\u0003J\t\u0010C\u001a\u00020\u0004HÆ\u0003J\t\u0010D\u001a\u00020\u0004HÆ\u0003J\t\u0010E\u001a\u00020\u0004HÆ\u0003J\t\u0010F\u001a\u00020\u0004HÆ\u0003J\t\u0010G\u001a\u00020\u0004HÆ\u0003J\t\u0010H\u001a\u00020\u0004HÆ\u0003J\t\u0010I\u001a\u00020\u0004HÆ\u0003JÂ\u0001\u0010J\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u001aHÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bK\u0010LJ\b\u0010M\u001a\u00020\u0002H\u0016J\u0013\u0010N\u001a\u00020\u00132\b\u0010O\u001a\u0004\u0018\u00010PHÖ\u0003J\t\u0010Q\u001a\u00020RHÖ\u0001J\t\u0010S\u001a\u00020THÖ\u0001J\u0010\u0010U\u001a\u00020\u00022\u0006\u0010V\u001a\u00020\u0002H\u0016J\f\u0010W\u001a\u00020X*\u00020YH\u0016R\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0016\u001a\u00020\u0017ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001c\u0010\u0019\u001a\u00020\u001aø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\n\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001dR\u0011\u0010\f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001dR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001dR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001dR\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001dR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u001c\u0010\u0018\u001a\u00020\u0017ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010 \u001a\u0004\b1\u0010\u001fR\u001c\u0010\u000e\u001a\u00020\u000fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010 \u001a\u0004\b2\u0010\u001fR\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001dR\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001d\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Z"}, d2 = {"Landroidx/compose/ui/graphics/GraphicsLayerModifierNodeElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/graphics/SimpleGraphicsLayerModifier;", "scaleX", "", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "transformOrigin", "Landroidx/compose/ui/graphics/TransformOrigin;", "shape", "Landroidx/compose/ui/graphics/Shape;", "clip", "", "renderEffect", "Landroidx/compose/ui/graphics/RenderEffect;", "ambientShadowColor", "Landroidx/compose/ui/graphics/Color;", "spotShadowColor", "compositingStrategy", "Landroidx/compose/ui/graphics/CompositingStrategy;", "(FFFFFFFFFFJLandroidx/compose/ui/graphics/Shape;ZLandroidx/compose/ui/graphics/RenderEffect;JJILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAlpha", "()F", "getAmbientShadowColor-0d7_KjU", "()J", "J", "getCameraDistance", "getClip", "()Z", "getCompositingStrategy--NrFUSI", "()I", "I", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "getRotationX", "getRotationY", "getRotationZ", "getScaleX", "getScaleY", "getShadowElevation", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "getSpotShadowColor-0d7_KjU", "getTransformOrigin-SzJe1aQ", "getTranslationX", "getTranslationY", "component1", "component10", "component11", "component11-SzJe1aQ", "component12", "component13", "component14", "component15", "component15-0d7_KjU", "component16", "component16-0d7_KjU", "component17", "component17--NrFUSI", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", MenuActionType.COPY, "copy-JVvOYNQ", "(FFFFFFFFFFJLandroidx/compose/ui/graphics/Shape;ZLandroidx/compose/ui/graphics/RenderEffect;JJI)Landroidx/compose/ui/graphics/GraphicsLayerModifierNodeElement;", "create", "equals", "other", "", "hashCode", "", "toString", "", "update", "node", "inspectableProperties", "", "Landroidx/compose/ui/platform/InspectorInfo;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final /* data */ class GraphicsLayerModifierNodeElement extends ModifierNodeElement<SimpleGraphicsLayerModifier> {
    private final float alpha;
    private final long ambientShadowColor;
    private final float cameraDistance;
    private final boolean clip;
    private final int compositingStrategy;

    @Nullable
    private final RenderEffect renderEffect;
    private final float rotationX;
    private final float rotationY;
    private final float rotationZ;
    private final float scaleX;
    private final float scaleY;
    private final float shadowElevation;

    @NotNull
    private final Shape shape;
    private final long spotShadowColor;
    private final long transformOrigin;
    private final float translationX;
    private final float translationY;

    public /* synthetic */ GraphicsLayerModifierNodeElement(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, Shape shape, boolean z10, RenderEffect renderEffect, long j11, long j12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, j10, shape, z10, renderEffect, j11, j12, i10);
    }

    /* JADX INFO: renamed from: copy-JVvOYNQ$default, reason: not valid java name */
    public static /* synthetic */ GraphicsLayerModifierNodeElement m1755copyJVvOYNQ$default(GraphicsLayerModifierNodeElement graphicsLayerModifierNodeElement, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, Shape shape, boolean z10, RenderEffect renderEffect, long j11, long j12, int i10, int i11, Object obj) {
        int i12;
        long j13;
        float f20 = (i11 & 1) != 0 ? graphicsLayerModifierNodeElement.scaleX : f10;
        float f21 = (i11 & 2) != 0 ? graphicsLayerModifierNodeElement.scaleY : f11;
        float f22 = (i11 & 4) != 0 ? graphicsLayerModifierNodeElement.alpha : f12;
        float f23 = (i11 & 8) != 0 ? graphicsLayerModifierNodeElement.translationX : f13;
        float f24 = (i11 & 16) != 0 ? graphicsLayerModifierNodeElement.translationY : f14;
        float f25 = (i11 & 32) != 0 ? graphicsLayerModifierNodeElement.shadowElevation : f15;
        float f26 = (i11 & 64) != 0 ? graphicsLayerModifierNodeElement.rotationX : f16;
        float f27 = (i11 & 128) != 0 ? graphicsLayerModifierNodeElement.rotationY : f17;
        float f28 = (i11 & 256) != 0 ? graphicsLayerModifierNodeElement.rotationZ : f18;
        float f29 = (i11 & 512) != 0 ? graphicsLayerModifierNodeElement.cameraDistance : f19;
        long j14 = (i11 & 1024) != 0 ? graphicsLayerModifierNodeElement.transformOrigin : j10;
        Shape shape2 = (i11 & 2048) != 0 ? graphicsLayerModifierNodeElement.shape : shape;
        boolean z11 = (i11 & 4096) != 0 ? graphicsLayerModifierNodeElement.clip : z10;
        float f30 = f20;
        RenderEffect renderEffect2 = (i11 & 8192) != 0 ? graphicsLayerModifierNodeElement.renderEffect : renderEffect;
        long j15 = (i11 & 16384) != 0 ? graphicsLayerModifierNodeElement.ambientShadowColor : j11;
        long j16 = (i11 & 32768) != 0 ? graphicsLayerModifierNodeElement.spotShadowColor : j12;
        if ((i11 & 65536) != 0) {
            j13 = j16;
            i12 = graphicsLayerModifierNodeElement.compositingStrategy;
        } else {
            i12 = i10;
            j13 = j16;
        }
        return graphicsLayerModifierNodeElement.m1760copyJVvOYNQ(f30, f21, f22, f23, f24, f25, f26, f27, f28, f29, j14, shape2, z11, renderEffect2, j15, j13, i12);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getScaleX() {
        return this.scaleX;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final float getCameraDistance() {
        return this.cameraDistance;
    }

    /* JADX INFO: renamed from: component11-SzJe1aQ, reason: not valid java name and from getter */
    public final long getTransformOrigin() {
        return this.transformOrigin;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Shape getShape() {
        return this.shape;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getClip() {
        return this.clip;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    /* JADX INFO: renamed from: component15-0d7_KjU, reason: not valid java name and from getter */
    public final long getAmbientShadowColor() {
        return this.ambientShadowColor;
    }

    /* JADX INFO: renamed from: component16-0d7_KjU, reason: not valid java name and from getter */
    public final long getSpotShadowColor() {
        return this.spotShadowColor;
    }

    /* JADX INFO: renamed from: component17--NrFUSI, reason: not valid java name and from getter */
    public final int getCompositingStrategy() {
        return this.compositingStrategy;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getScaleY() {
        return this.scaleY;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getAlpha() {
        return this.alpha;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getTranslationX() {
        return this.translationX;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getTranslationY() {
        return this.translationY;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final float getShadowElevation() {
        return this.shadowElevation;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final float getRotationX() {
        return this.rotationX;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final float getRotationY() {
        return this.rotationY;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final float getRotationZ() {
        return this.rotationZ;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-JVvOYNQ, reason: not valid java name */
    public final GraphicsLayerModifierNodeElement m1760copyJVvOYNQ(float scaleX, float scaleY, float alpha, float translationX, float translationY, float shadowElevation, float rotationX, float rotationY, float rotationZ, float cameraDistance, long transformOrigin, @NotNull Shape shape, boolean clip, @Nullable RenderEffect renderEffect, long ambientShadowColor, long spotShadowColor, int compositingStrategy) {
        Intrinsics.checkNotNullParameter(shape, "shape");
        return new GraphicsLayerModifierNodeElement(scaleX, scaleY, alpha, translationX, translationY, shadowElevation, rotationX, rotationY, rotationZ, cameraDistance, transformOrigin, shape, clip, renderEffect, ambientShadowColor, spotShadowColor, compositingStrategy, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GraphicsLayerModifierNodeElement)) {
            return false;
        }
        GraphicsLayerModifierNodeElement graphicsLayerModifierNodeElement = (GraphicsLayerModifierNodeElement) other;
        return Float.compare(this.scaleX, graphicsLayerModifierNodeElement.scaleX) == 0 && Float.compare(this.scaleY, graphicsLayerModifierNodeElement.scaleY) == 0 && Float.compare(this.alpha, graphicsLayerModifierNodeElement.alpha) == 0 && Float.compare(this.translationX, graphicsLayerModifierNodeElement.translationX) == 0 && Float.compare(this.translationY, graphicsLayerModifierNodeElement.translationY) == 0 && Float.compare(this.shadowElevation, graphicsLayerModifierNodeElement.shadowElevation) == 0 && Float.compare(this.rotationX, graphicsLayerModifierNodeElement.rotationX) == 0 && Float.compare(this.rotationY, graphicsLayerModifierNodeElement.rotationY) == 0 && Float.compare(this.rotationZ, graphicsLayerModifierNodeElement.rotationZ) == 0 && Float.compare(this.cameraDistance, graphicsLayerModifierNodeElement.cameraDistance) == 0 && TransformOrigin.m1959equalsimpl0(this.transformOrigin, graphicsLayerModifierNodeElement.transformOrigin) && Intrinsics.areEqual(this.shape, graphicsLayerModifierNodeElement.shape) && this.clip == graphicsLayerModifierNodeElement.clip && Intrinsics.areEqual(this.renderEffect, graphicsLayerModifierNodeElement.renderEffect) && Color.m1605equalsimpl0(this.ambientShadowColor, graphicsLayerModifierNodeElement.ambientShadowColor) && Color.m1605equalsimpl0(this.spotShadowColor, graphicsLayerModifierNodeElement.spotShadowColor) && CompositingStrategy.m1684equalsimpl0(this.compositingStrategy, graphicsLayerModifierNodeElement.compositingStrategy);
    }

    public final float getAlpha() {
        return this.alpha;
    }

    /* JADX INFO: renamed from: getAmbientShadowColor-0d7_KjU, reason: not valid java name */
    public final long m1761getAmbientShadowColor0d7_KjU() {
        return this.ambientShadowColor;
    }

    public final float getCameraDistance() {
        return this.cameraDistance;
    }

    public final boolean getClip() {
        return this.clip;
    }

    /* JADX INFO: renamed from: getCompositingStrategy--NrFUSI, reason: not valid java name */
    public final int m1762getCompositingStrategyNrFUSI() {
        return this.compositingStrategy;
    }

    @Nullable
    public final RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    public final float getRotationX() {
        return this.rotationX;
    }

    public final float getRotationY() {
        return this.rotationY;
    }

    public final float getRotationZ() {
        return this.rotationZ;
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final float getScaleY() {
        return this.scaleY;
    }

    public final float getShadowElevation() {
        return this.shadowElevation;
    }

    @NotNull
    public final Shape getShape() {
        return this.shape;
    }

    /* JADX INFO: renamed from: getSpotShadowColor-0d7_KjU, reason: not valid java name */
    public final long m1763getSpotShadowColor0d7_KjU() {
        return this.spotShadowColor;
    }

    /* JADX INFO: renamed from: getTransformOrigin-SzJe1aQ, reason: not valid java name */
    public final long m1764getTransformOriginSzJe1aQ() {
        return this.transformOrigin;
    }

    public final float getTranslationX() {
        return this.translationX;
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v23, types: [int] */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int iFloatToIntBits = ((((((((((((((((((((((Float.floatToIntBits(this.scaleX) * 31) + Float.floatToIntBits(this.scaleY)) * 31) + Float.floatToIntBits(this.alpha)) * 31) + Float.floatToIntBits(this.translationX)) * 31) + Float.floatToIntBits(this.translationY)) * 31) + Float.floatToIntBits(this.shadowElevation)) * 31) + Float.floatToIntBits(this.rotationX)) * 31) + Float.floatToIntBits(this.rotationY)) * 31) + Float.floatToIntBits(this.rotationZ)) * 31) + Float.floatToIntBits(this.cameraDistance)) * 31) + TransformOrigin.m1962hashCodeimpl(this.transformOrigin)) * 31) + this.shape.hashCode()) * 31;
        boolean z10 = this.clip;
        ?? r12 = z10;
        if (z10) {
            r12 = 1;
        }
        int i10 = (iFloatToIntBits + r12) * 31;
        RenderEffect renderEffect = this.renderEffect;
        return ((((((i10 + (renderEffect == null ? 0 : renderEffect.hashCode())) * 31) + Color.m1611hashCodeimpl(this.ambientShadowColor)) * 31) + Color.m1611hashCodeimpl(this.spotShadowColor)) * 31) + CompositingStrategy.m1685hashCodeimpl(this.compositingStrategy);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
        inspectorInfo.setName("graphicsLayer");
        inspectorInfo.getProperties().set("scaleX", Float.valueOf(this.scaleX));
        inspectorInfo.getProperties().set("scaleY", Float.valueOf(this.scaleY));
        inspectorInfo.getProperties().set("alpha", Float.valueOf(this.alpha));
        inspectorInfo.getProperties().set("translationX", Float.valueOf(this.translationX));
        inspectorInfo.getProperties().set("translationY", Float.valueOf(this.translationY));
        inspectorInfo.getProperties().set("shadowElevation", Float.valueOf(this.shadowElevation));
        inspectorInfo.getProperties().set("rotationX", Float.valueOf(this.rotationX));
        inspectorInfo.getProperties().set("rotationY", Float.valueOf(this.rotationY));
        inspectorInfo.getProperties().set("rotationZ", Float.valueOf(this.rotationZ));
        inspectorInfo.getProperties().set("cameraDistance", Float.valueOf(this.cameraDistance));
        inspectorInfo.getProperties().set("transformOrigin", TransformOrigin.m1952boximpl(this.transformOrigin));
        inspectorInfo.getProperties().set("shape", this.shape);
        inspectorInfo.getProperties().set("clip", Boolean.valueOf(this.clip));
        inspectorInfo.getProperties().set("renderEffect", this.renderEffect);
        inspectorInfo.getProperties().set("ambientShadowColor", Color.m1594boximpl(this.ambientShadowColor));
        inspectorInfo.getProperties().set("spotShadowColor", Color.m1594boximpl(this.spotShadowColor));
        inspectorInfo.getProperties().set("compositingStrategy", CompositingStrategy.m1681boximpl(this.compositingStrategy));
    }

    @NotNull
    public String toString() {
        return "GraphicsLayerModifierNodeElement(scaleX=" + this.scaleX + ", scaleY=" + this.scaleY + ", alpha=" + this.alpha + ", translationX=" + this.translationX + ", translationY=" + this.translationY + ", shadowElevation=" + this.shadowElevation + ", rotationX=" + this.rotationX + ", rotationY=" + this.rotationY + ", rotationZ=" + this.rotationZ + ", cameraDistance=" + this.cameraDistance + ", transformOrigin=" + ((Object) TransformOrigin.m1963toStringimpl(this.transformOrigin)) + ", shape=" + this.shape + ", clip=" + this.clip + ", renderEffect=" + this.renderEffect + ", ambientShadowColor=" + ((Object) Color.m1612toStringimpl(this.ambientShadowColor)) + ", spotShadowColor=" + ((Object) Color.m1612toStringimpl(this.spotShadowColor)) + ", compositingStrategy=" + ((Object) CompositingStrategy.m1686toStringimpl(this.compositingStrategy)) + ')';
    }

    private GraphicsLayerModifierNodeElement(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, Shape shape, boolean z10, RenderEffect renderEffect, long j11, long j12, int i10) {
        this.scaleX = f10;
        this.scaleY = f11;
        this.alpha = f12;
        this.translationX = f13;
        this.translationY = f14;
        this.shadowElevation = f15;
        this.rotationX = f16;
        this.rotationY = f17;
        this.rotationZ = f18;
        this.cameraDistance = f19;
        this.transformOrigin = j10;
        this.shape = shape;
        this.clip = z10;
        this.renderEffect = renderEffect;
        this.ambientShadowColor = j11;
        this.spotShadowColor = j12;
        this.compositingStrategy = i10;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @NotNull
    public SimpleGraphicsLayerModifier create() {
        return new SimpleGraphicsLayerModifier(this.scaleX, this.scaleY, this.alpha, this.translationX, this.translationY, this.shadowElevation, this.rotationX, this.rotationY, this.rotationZ, this.cameraDistance, this.transformOrigin, this.shape, this.clip, this.renderEffect, this.ambientShadowColor, this.spotShadowColor, this.compositingStrategy, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @NotNull
    public SimpleGraphicsLayerModifier update(@NotNull SimpleGraphicsLayerModifier node) {
        Intrinsics.checkNotNullParameter(node, "node");
        node.setScaleX(this.scaleX);
        node.setScaleY(this.scaleY);
        node.setAlpha(this.alpha);
        node.setTranslationX(this.translationX);
        node.setTranslationY(this.translationY);
        node.setShadowElevation(this.shadowElevation);
        node.setRotationX(this.rotationX);
        node.setRotationY(this.rotationY);
        node.setRotationZ(this.rotationZ);
        node.setCameraDistance(this.cameraDistance);
        node.m1908setTransformOrigin__ExYCQ(this.transformOrigin);
        node.setShape(this.shape);
        node.setClip(this.clip);
        node.setRenderEffect(this.renderEffect);
        node.m1905setAmbientShadowColor8_81llA(this.ambientShadowColor);
        node.m1907setSpotShadowColor8_81llA(this.spotShadowColor);
        node.m1906setCompositingStrategyaDBOjCE(this.compositingStrategy);
        node.invalidateLayerBlock();
        return node;
    }
}
