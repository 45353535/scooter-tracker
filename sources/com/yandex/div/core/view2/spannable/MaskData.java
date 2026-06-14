package com.yandex.div.core.view2.spannable;

import androidx.annotation.ColorInt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/core/view2/spannable/MaskData;", "", "()V", "Particles", "Solid", "Lcom/yandex/div/core/view2/spannable/MaskData$Particles;", "Lcom/yandex/div/core/view2/spannable/MaskData$Solid;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class MaskData {

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u0007\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\b\u0010\u001bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/yandex/div/core/view2/spannable/MaskData$Particles;", "Lcom/yandex/div/core/view2/spannable/MaskData;", "", "color", "", "density", "", "isAnimated", "isEnabled", "particleSize", "<init>", "(IFZZF)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getColor", "F", "getDensity", "()F", "Z", "()Z", "getParticleSize", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Particles extends MaskData {
        private final int color;
        private final float density;
        private final boolean isAnimated;
        private final boolean isEnabled;
        private final float particleSize;

        public Particles(@ColorInt int i10, float f10, boolean z10, boolean z11, float f11) {
            super(null);
            this.color = i10;
            this.density = f10;
            this.isAnimated = z10;
            this.isEnabled = z11;
            this.particleSize = f11;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Particles)) {
                return false;
            }
            Particles particles = (Particles) other;
            return this.color == particles.color && Float.compare(this.density, particles.density) == 0 && this.isAnimated == particles.isAnimated && this.isEnabled == particles.isEnabled && Float.compare(this.particleSize, particles.particleSize) == 0;
        }

        public final int getColor() {
            return this.color;
        }

        public final float getDensity() {
            return this.density;
        }

        public final float getParticleSize() {
            return this.particleSize;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r1v8 */
        /* JADX WARN: Type inference failed for: r2v0 */
        /* JADX WARN: Type inference failed for: r2v1, types: [int] */
        /* JADX WARN: Type inference failed for: r2v2 */
        public int hashCode() {
            int iFloatToIntBits = ((this.color * 31) + Float.floatToIntBits(this.density)) * 31;
            boolean z10 = this.isAnimated;
            ?? r12 = z10;
            if (z10) {
                r12 = 1;
            }
            int i10 = (iFloatToIntBits + r12) * 31;
            boolean z11 = this.isEnabled;
            return ((i10 + (z11 ? 1 : z11)) * 31) + Float.floatToIntBits(this.particleSize);
        }

        /* JADX INFO: renamed from: isAnimated, reason: from getter */
        public final boolean getIsAnimated() {
            return this.isAnimated;
        }

        /* JADX INFO: renamed from: isEnabled, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        @NotNull
        public String toString() {
            return "Particles(color=" + this.color + ", density=" + this.density + ", isAnimated=" + this.isAnimated + ", isEnabled=" + this.isEnabled + ", particleSize=" + this.particleSize + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0005\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/yandex/div/core/view2/spannable/MaskData$Solid;", "Lcom/yandex/div/core/view2/spannable/MaskData;", "", "color", "", "isEnabled", "<init>", "(IZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getColor", "Z", "()Z", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Solid extends MaskData {
        private final int color;
        private final boolean isEnabled;

        public Solid(@ColorInt int i10, boolean z10) {
            super(null);
            this.color = i10;
            this.isEnabled = z10;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Solid)) {
                return false;
            }
            Solid solid = (Solid) other;
            return this.color == solid.color && this.isEnabled == solid.isEnabled;
        }

        public final int getColor() {
            return this.color;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3 */
        public int hashCode() {
            int i10 = this.color * 31;
            boolean z10 = this.isEnabled;
            ?? r12 = z10;
            if (z10) {
                r12 = 1;
            }
            return i10 + r12;
        }

        /* JADX INFO: renamed from: isEnabled, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        @NotNull
        public String toString() {
            return "Solid(color=" + this.color + ", isEnabled=" + this.isEnabled + ')';
        }
    }

    public /* synthetic */ MaskData(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private MaskData() {
    }
}
