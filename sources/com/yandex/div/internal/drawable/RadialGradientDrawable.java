package com.yandex.div.internal.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.taurusx.tax.f.y;
import com.yandex.div.internal.drawable.RadialGradientDrawable;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lf.i;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 52\u00020\u0001:\u0003657B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010#\u001a\u0004\b(\u0010%\"\u0004\b)\u0010'R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00103\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104¨\u00068"}, d2 = {"Lcom/yandex/div/internal/drawable/RadialGradientDrawable;", "Landroid/graphics/drawable/Drawable;", "Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Radius;", "radius", "Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Center;", "centerX", "centerY", "", "colors", "<init>", "(Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Radius;Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Center;Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Center;[I)V", "Landroid/graphics/Rect;", "bounds", "", "onBoundsChange", "(Landroid/graphics/Rect;)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "", "alpha", "setAlpha", "(I)V", "getOpacity", "()I", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Radius;", "getRadius", "()Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Radius;", "setRadius", "(Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Radius;)V", "Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Center;", "getCenterX", "()Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Center;", "setCenterX", "(Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Center;)V", "getCenterY", "setCenterY", "[I", "getColors", "()[I", "setColors", "([I)V", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "Landroid/graphics/RectF;", "rect", "Landroid/graphics/RectF;", y.f66058y, "Center", "Radius", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RadialGradientDrawable extends Drawable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private Center centerX;

    @NotNull
    private Center centerY;

    @NotNull
    private int[] colors;

    @NotNull
    private Radius radius;

    @NotNull
    private final Paint paint = new Paint();

    @NotNull
    private RectF rect = new RectF();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Center;", "", "()V", "Fixed", "Relative", "Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Center$Fixed;", "Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Center$Relative;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Center {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Center$Fixed;", "Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Center;", "", "value", "<init>", "(F)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getValue", "()F", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class Fixed extends Center {
            private final float value;

            public Fixed(float f10) {
                super(null);
                this.value = f10;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Fixed) && Float.compare(this.value, ((Fixed) other).value) == 0;
            }

            public final float getValue() {
                return this.value;
            }

            public int hashCode() {
                return Float.floatToIntBits(this.value);
            }

            @NotNull
            public String toString() {
                return "Fixed(value=" + this.value + ')';
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Center$Relative;", "Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Center;", "", "value", "<init>", "(F)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getValue", "()F", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class Relative extends Center {
            private final float value;

            public Relative(float f10) {
                super(null);
                this.value = f10;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Relative) && Float.compare(this.value, ((Relative) other).value) == 0;
            }

            public final float getValue() {
                return this.value;
            }

            public int hashCode() {
                return Float.floatToIntBits(this.value);
            }

            @NotNull
            public String toString() {
                return "Relative(value=" + this.value + ')';
            }
        }

        public /* synthetic */ Center(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Center() {
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J6\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011²\u0006\u0010\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0013X\u008a\u0084\u0002²\u0006\u0010\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0013X\u008a\u0084\u0002"}, d2 = {"Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Companion;", "", "()V", "MIN_GRADIENT_RADIUS", "", "createRadialGradient", "Landroid/graphics/RadialGradient;", "radius", "Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Radius;", "centerX", "Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Center;", "centerY", "colors", "", "width", "", "height", "div_release", "distancesToCorners", "", "distancesToSides"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Radius.Relative.Type.values().length];
                try {
                    iArr[Radius.Relative.Type.NEAREST_CORNER.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Radius.Relative.Type.FARTHEST_CORNER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Radius.Relative.Type.NEAREST_SIDE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Radius.Relative.Type.FARTHEST_SIDE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float createRadialGradient$distTo(float f10, float f11, float f12, float f13) {
            double d10 = 2;
            return (float) Math.sqrt(((float) Math.pow(f10 - f12, d10)) + ((float) Math.pow(f11 - f13, d10)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float createRadialGradient$distToHorizontalSide(float f10, float f11) {
            return Math.abs(f10 - f11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float createRadialGradient$distToVerticalSide(float f10, float f11) {
            return Math.abs(f10 - f11);
        }

        private static final Float[] createRadialGradient$lambda$0(Lazy lazy) {
            return (Float[]) lazy.getValue();
        }

        private static final Float[] createRadialGradient$lambda$1(Lazy lazy) {
            return (Float[]) lazy.getValue();
        }

        private static final float createRadialGradient$value(Center center, int i10) {
            if (center instanceof Center.Fixed) {
                return ((Center.Fixed) center).getValue();
            }
            if (center instanceof Center.Relative) {
                return ((Center.Relative) center).getValue() * i10;
            }
            throw new m();
        }

        @NotNull
        public final RadialGradient createRadialGradient(@NotNull Radius radius, @NotNull Center centerX, @NotNull Center centerY, @NotNull int[] colors, int width, int height) {
            float fFloatValue;
            final float fCreateRadialGradient$value = createRadialGradient$value(centerX, width);
            final float fCreateRadialGradient$value2 = createRadialGradient$value(centerY, height);
            final float f10 = width;
            final float f11 = height;
            final float f12 = 0.0f;
            final float f13 = 0.0f;
            Lazy lazyA = i.a(new Function0<Float[]>() { // from class: com.yandex.div.internal.drawable.RadialGradientDrawable$Companion$createRadialGradient$distancesToCorners$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Float[] invoke() {
                    return new Float[]{Float.valueOf(RadialGradientDrawable.Companion.createRadialGradient$distTo(fCreateRadialGradient$value, fCreateRadialGradient$value2, f12, f13)), Float.valueOf(RadialGradientDrawable.Companion.createRadialGradient$distTo(fCreateRadialGradient$value, fCreateRadialGradient$value2, f10, f13)), Float.valueOf(RadialGradientDrawable.Companion.createRadialGradient$distTo(fCreateRadialGradient$value, fCreateRadialGradient$value2, f10, f11)), Float.valueOf(RadialGradientDrawable.Companion.createRadialGradient$distTo(fCreateRadialGradient$value, fCreateRadialGradient$value2, f12, f11))};
                }
            });
            Lazy lazyA2 = i.a(new Function0<Float[]>() { // from class: com.yandex.div.internal.drawable.RadialGradientDrawable$Companion$createRadialGradient$distancesToSides$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Float[] invoke() {
                    return new Float[]{Float.valueOf(RadialGradientDrawable.Companion.createRadialGradient$distToVerticalSide(fCreateRadialGradient$value, f12)), Float.valueOf(RadialGradientDrawable.Companion.createRadialGradient$distToVerticalSide(fCreateRadialGradient$value, f10)), Float.valueOf(RadialGradientDrawable.Companion.createRadialGradient$distToHorizontalSide(fCreateRadialGradient$value2, f11)), Float.valueOf(RadialGradientDrawable.Companion.createRadialGradient$distToHorizontalSide(fCreateRadialGradient$value2, f13))};
                }
            });
            if (radius instanceof Radius.Fixed) {
                fFloatValue = ((Radius.Fixed) radius).getValue();
            } else {
                if (!(radius instanceof Radius.Relative)) {
                    throw new m();
                }
                int i10 = WhenMappings.$EnumSwitchMapping$0[((Radius.Relative) radius).getType().ordinal()];
                if (i10 == 1) {
                    Float fMinOrNull = ArraysKt.minOrNull(createRadialGradient$lambda$0(lazyA));
                    Intrinsics.checkNotNull(fMinOrNull);
                    fFloatValue = fMinOrNull.floatValue();
                } else if (i10 == 2) {
                    Float fMaxOrNull = ArraysKt.maxOrNull(createRadialGradient$lambda$0(lazyA));
                    Intrinsics.checkNotNull(fMaxOrNull);
                    fFloatValue = fMaxOrNull.floatValue();
                } else if (i10 == 3) {
                    Float fMinOrNull2 = ArraysKt.minOrNull(createRadialGradient$lambda$1(lazyA2));
                    Intrinsics.checkNotNull(fMinOrNull2);
                    fFloatValue = fMinOrNull2.floatValue();
                } else {
                    if (i10 != 4) {
                        throw new m();
                    }
                    Float fMaxOrNull2 = ArraysKt.maxOrNull(createRadialGradient$lambda$1(lazyA2));
                    Intrinsics.checkNotNull(fMaxOrNull2);
                    fFloatValue = fMaxOrNull2.floatValue();
                }
            }
            if (fFloatValue <= 0.0f) {
                fFloatValue = 0.01f;
            }
            return new RadialGradient(fCreateRadialGradient$value, fCreateRadialGradient$value2, fFloatValue, colors, (float[]) null, Shader.TileMode.CLAMP);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Radius;", "", "()V", "Fixed", "Relative", "Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Radius$Fixed;", "Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Radius$Relative;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Radius {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Radius$Fixed;", "Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Radius;", "", "value", "<init>", "(F)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getValue", "()F", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class Fixed extends Radius {
            private final float value;

            public Fixed(float f10) {
                super(null);
                this.value = f10;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Fixed) && Float.compare(this.value, ((Fixed) other).value) == 0;
            }

            public final float getValue() {
                return this.value;
            }

            public int hashCode() {
                return Float.floatToIntBits(this.value);
            }

            @NotNull
            public String toString() {
                return "Fixed(value=" + this.value + ')';
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Radius$Relative;", "Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Radius;", "Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Radius$Relative$Type;", "type", "<init>", "(Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Radius$Relative$Type;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Radius$Relative$Type;", "getType", "()Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Radius$Relative$Type;", "Type", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class Relative extends Radius {

            @NotNull
            private final Type type;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Radius$Relative$Type;", "", "(Ljava/lang/String;I)V", "NEAREST_CORNER", "FARTHEST_CORNER", "NEAREST_SIDE", "FARTHEST_SIDE", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public enum Type {
                NEAREST_CORNER,
                FARTHEST_CORNER,
                NEAREST_SIDE,
                FARTHEST_SIDE
            }

            public Relative(@NotNull Type type) {
                super(null);
                this.type = type;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Relative) && this.type == ((Relative) other).type;
            }

            @NotNull
            public final Type getType() {
                return this.type;
            }

            public int hashCode() {
                return this.type.hashCode();
            }

            @NotNull
            public String toString() {
                return "Relative(type=" + this.type + ')';
            }
        }

        public /* synthetic */ Radius(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Radius() {
        }
    }

    public RadialGradientDrawable(@NotNull Radius radius, @NotNull Center center, @NotNull Center center2, @NotNull int[] iArr) {
        this.radius = radius;
        this.centerX = center;
        this.centerY = center2;
        this.colors = iArr;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        canvas.drawRect(this.rect, this.paint);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.paint.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(@NotNull Rect bounds) {
        super.onBoundsChange(bounds);
        this.paint.setShader(INSTANCE.createRadialGradient(this.radius, this.centerX, this.centerY, this.colors, bounds.width(), bounds.height()));
        this.rect.set(bounds);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.paint.setAlpha(alpha);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }
}
