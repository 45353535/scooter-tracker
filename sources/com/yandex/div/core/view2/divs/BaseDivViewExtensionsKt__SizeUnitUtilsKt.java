package com.yandex.div.core.view2.divs;

import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.json.expressions.ExpressionResolver;
import k8.jp;
import k8.kp;
import k8.oa;
import k8.xc;
import kotlin.Metadata;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a%\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u0004\u0018\u00018\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u0004\u0018\u00018\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0006\u001a-\u0010\n\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u0004\u0018\u00018\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a%\u0010\f\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u0004\u0018\u00018\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\u0006\u001a%\u0010\u000e\u001a\u00020\r\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u0004\u0018\u00018\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a%\u0010\u0010\u001a\u00020\r\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u0004\u0018\u00018\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u000f\u001a-\u0010\u0011\u001a\u00020\r\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u0004\u0018\u00018\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012\u001a%\u0010\u0013\u001a\u00020\r\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u0004\u0018\u00018\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u000f\u001a\u001b\u0010\u000e\u001a\u00020\r*\u0004\u0018\u00010\u00142\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u0015\u001a\u001b\u0010\u0010\u001a\u00020\r*\u0004\u0018\u00010\u00142\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0015\u001a#\u0010\u0011\u001a\u00020\r*\u0004\u0018\u00010\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0016\u001a#\u0010\u0017\u001a\u00020\r*\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a#\u0010\u0017\u001a\u00020\r*\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u0017\u0010\u001c\u001a#\u0010\u0017\u001a\u00020\r*\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u0017\u0010\u001e\u001a#\u0010\u001f\u001a\u00020\u0004*\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001f\u0010 \u001a#\u0010\u001f\u001a\u00020\u0004*\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001f\u0010!\u001a#\u0010\u0017\u001a\u00020\r*\u00020\"2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u0017\u0010#\u001a\u0013\u0010$\u001a\u00020\r*\u00020\bH\u0000¢\u0006\u0004\b$\u0010%\u001a#\u0010&\u001a\u00020\u0004*\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b&\u0010!¨\u0006'"}, d2 = {"", "T", "Landroid/util/DisplayMetrics;", "metrics", "", "dpToPxF", "(Ljava/lang/Number;Landroid/util/DisplayMetrics;)F", "spToPxF", "Lk8/jp;", "unit", "unitToPxF", "(Ljava/lang/Number;Landroid/util/DisplayMetrics;Lk8/jp;)F", "pxToDpF", "", "dpToPx", "(Ljava/lang/Number;Landroid/util/DisplayMetrics;)I", "spToPx", "unitToPx", "(Ljava/lang/Number;Landroid/util/DisplayMetrics;Lk8/jp;)I", "pxToDp", "", "(Ljava/lang/Long;Landroid/util/DisplayMetrics;)I", "(Ljava/lang/Long;Landroid/util/DisplayMetrics;Lk8/jp;)I", "toPx", "(JLk8/jp;Landroid/util/DisplayMetrics;)I", "Lk8/xc;", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "(Lk8/xc;Landroid/util/DisplayMetrics;Lcom/yandex/div/json/expressions/ExpressionResolver;)I", "Lk8/kp;", "(Lk8/kp;Landroid/util/DisplayMetrics;Lcom/yandex/div/json/expressions/ExpressionResolver;)I", "toPxF", "(Lk8/xc;Landroid/util/DisplayMetrics;Lcom/yandex/div/json/expressions/ExpressionResolver;)F", "(JLk8/jp;Landroid/util/DisplayMetrics;)F", "Lk8/oa;", "(Lk8/oa;Landroid/util/DisplayMetrics;Lcom/yandex/div/json/expressions/ExpressionResolver;)I", "toAndroidUnit", "(Lk8/jp;)I", "fontSizeToPx", "div_release"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "com/yandex/div/core/view2/divs/BaseDivViewExtensionsKt")
abstract /* synthetic */ class BaseDivViewExtensionsKt__SizeUnitUtilsKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[jp.values().length];
            try {
                iArr[jp.DP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[jp.SP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[jp.PX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final <T extends Number> int dpToPx(@Nullable T t10, @NotNull DisplayMetrics displayMetrics) {
        return zf.a.d(BaseDivViewExtensionsKt.dpToPxF(t10, displayMetrics));
    }

    public static final <T extends Number> float dpToPxF(@Nullable T t10, @NotNull DisplayMetrics displayMetrics) {
        return TypedValue.applyDimension(1, t10 != null ? t10.floatValue() : 0.0f, displayMetrics);
    }

    public static final float fontSizeToPx(long j10, @NotNull jp jpVar, @NotNull DisplayMetrics displayMetrics) {
        Number numberValueOf;
        int i10 = WhenMappings.$EnumSwitchMapping$0[jpVar.ordinal()];
        if (i10 == 1) {
            numberValueOf = Integer.valueOf(BaseDivViewExtensionsKt.dpToPx(Long.valueOf(j10), displayMetrics));
        } else if (i10 == 2) {
            numberValueOf = Integer.valueOf(BaseDivViewExtensionsKt.spToPx(Long.valueOf(j10), displayMetrics));
        } else {
            if (i10 != 3) {
                throw new m();
            }
            numberValueOf = Long.valueOf(j10);
        }
        return numberValueOf.floatValue();
    }

    public static final <T extends Number> int pxToDp(@Nullable T t10, @NotNull DisplayMetrics displayMetrics) {
        return zf.a.d(BaseDivViewExtensionsKt.pxToDpF(t10, displayMetrics));
    }

    public static final <T extends Number> float pxToDpF(@Nullable T t10, @NotNull DisplayMetrics displayMetrics) {
        if (Build.VERSION.SDK_INT >= 34) {
            return TypedValue.deriveDimension(1, t10 != null ? t10.floatValue() : 0.0f, displayMetrics);
        }
        return (t10 != null ? t10.floatValue() : 0.0f) / displayMetrics.density;
    }

    public static final <T extends Number> int spToPx(@Nullable T t10, @NotNull DisplayMetrics displayMetrics) {
        return zf.a.d(BaseDivViewExtensionsKt.spToPxF(t10, displayMetrics));
    }

    public static final <T extends Number> float spToPxF(@Nullable T t10, @NotNull DisplayMetrics displayMetrics) {
        return TypedValue.applyDimension(2, t10 != null ? t10.floatValue() : 0.0f, displayMetrics);
    }

    public static final int toAndroidUnit(@NotNull jp jpVar) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[jpVar.ordinal()];
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2) {
                if (i10 == 3) {
                    return 0;
                }
                throw new m();
            }
        }
        return i11;
    }

    public static final int toPx(long j10, @NotNull jp jpVar, @NotNull DisplayMetrics displayMetrics) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[jpVar.ordinal()];
        if (i10 == 1) {
            return BaseDivViewExtensionsKt.dpToPx(Long.valueOf(j10), displayMetrics);
        }
        if (i10 == 2) {
            return BaseDivViewExtensionsKt.spToPx(Long.valueOf(j10), displayMetrics);
        }
        if (i10 != 3) {
            throw new m();
        }
        long j11 = j10 >> 31;
        if (j11 == 0 || j11 == -1) {
            return (int) j10;
        }
        KAssert kAssert = KAssert.INSTANCE;
        if (Assert.isEnabled()) {
            Assert.fail("Unable convert '" + j10 + "' to Int");
        }
        return j10 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
    }

    public static final float toPxF(@NotNull xc xcVar, @NotNull DisplayMetrics displayMetrics, @NotNull ExpressionResolver expressionResolver) {
        return BaseDivViewExtensionsKt.toPxF(((Number) xcVar.f92339b.evaluate(expressionResolver)).longValue(), (jp) xcVar.f92338a.evaluate(expressionResolver), displayMetrics);
    }

    public static final <T extends Number> int unitToPx(@Nullable T t10, @NotNull DisplayMetrics displayMetrics, @NotNull jp jpVar) {
        return zf.a.d(BaseDivViewExtensionsKt.unitToPxF(t10, displayMetrics, jpVar));
    }

    public static final <T extends Number> float unitToPxF(@Nullable T t10, @NotNull DisplayMetrics displayMetrics, @NotNull jp jpVar) {
        return TypedValue.applyDimension(BaseDivViewExtensionsKt.toAndroidUnit(jpVar), t10 != null ? t10.floatValue() : 0.0f, displayMetrics);
    }

    public static final int dpToPx(@Nullable Long l10, @NotNull DisplayMetrics displayMetrics) {
        Integer numValueOf;
        int i10;
        if (l10 != null) {
            long jLongValue = l10.longValue();
            long j10 = jLongValue >> 31;
            if (j10 == 0 || j10 == -1) {
                i10 = (int) jLongValue;
            } else {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + jLongValue + "' to Int");
                }
                i10 = jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            numValueOf = Integer.valueOf(i10);
        } else {
            numValueOf = null;
        }
        return BaseDivViewExtensionsKt.dpToPx(numValueOf, displayMetrics);
    }

    public static final int spToPx(@Nullable Long l10, @NotNull DisplayMetrics displayMetrics) {
        Integer numValueOf;
        int i10;
        if (l10 != null) {
            long jLongValue = l10.longValue();
            long j10 = jLongValue >> 31;
            if (j10 == 0 || j10 == -1) {
                i10 = (int) jLongValue;
            } else {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + jLongValue + "' to Int");
                }
                i10 = jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            numValueOf = Integer.valueOf(i10);
        } else {
            numValueOf = null;
        }
        return BaseDivViewExtensionsKt.spToPx(numValueOf, displayMetrics);
    }

    public static final float toPxF(long j10, @NotNull jp jpVar, @NotNull DisplayMetrics displayMetrics) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[jpVar.ordinal()];
        if (i10 == 1) {
            return BaseDivViewExtensionsKt.dpToPxF(Long.valueOf(j10), displayMetrics);
        }
        if (i10 == 2) {
            return BaseDivViewExtensionsKt.spToPxF(Long.valueOf(j10), displayMetrics);
        }
        if (i10 == 3) {
            return j10;
        }
        throw new m();
    }

    public static final int unitToPx(@Nullable Long l10, @NotNull DisplayMetrics displayMetrics, @NotNull jp jpVar) {
        Integer numValueOf;
        int i10;
        if (l10 != null) {
            long jLongValue = l10.longValue();
            long j10 = jLongValue >> 31;
            if (j10 == 0 || j10 == -1) {
                i10 = (int) jLongValue;
            } else {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + jLongValue + "' to Int");
                }
                i10 = jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            numValueOf = Integer.valueOf(i10);
        } else {
            numValueOf = null;
        }
        return BaseDivViewExtensionsKt.unitToPx(numValueOf, displayMetrics, jpVar);
    }

    public static final int toPx(@NotNull xc xcVar, @NotNull DisplayMetrics displayMetrics, @NotNull ExpressionResolver expressionResolver) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[((jp) xcVar.f92338a.evaluate(expressionResolver)).ordinal()];
        if (i10 == 1) {
            return BaseDivViewExtensionsKt.dpToPx((Long) xcVar.f92339b.evaluate(expressionResolver), displayMetrics);
        }
        if (i10 == 2) {
            return BaseDivViewExtensionsKt.spToPx((Long) xcVar.f92339b.evaluate(expressionResolver), displayMetrics);
        }
        if (i10 == 3) {
            long jLongValue = ((Number) xcVar.f92339b.evaluate(expressionResolver)).longValue();
            long j10 = jLongValue >> 31;
            if (j10 == 0 || j10 == -1) {
                return (int) jLongValue;
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unable convert '" + jLongValue + "' to Int");
            }
            return jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        throw new m();
    }

    public static final int toPx(@NotNull kp kpVar, @NotNull DisplayMetrics displayMetrics, @NotNull ExpressionResolver expressionResolver) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[((jp) kpVar.f88676a.evaluate(expressionResolver)).ordinal()];
        if (i10 == 1) {
            return BaseDivViewExtensionsKt.dpToPx((Long) kpVar.f88677b.evaluate(expressionResolver), displayMetrics);
        }
        if (i10 == 2) {
            return BaseDivViewExtensionsKt.spToPx((Long) kpVar.f88677b.evaluate(expressionResolver), displayMetrics);
        }
        if (i10 == 3) {
            long jLongValue = ((Number) kpVar.f88677b.evaluate(expressionResolver)).longValue();
            long j10 = jLongValue >> 31;
            if (j10 == 0 || j10 == -1) {
                return (int) jLongValue;
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unable convert '" + jLongValue + "' to Int");
            }
            return jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        throw new m();
    }

    public static final int toPx(@NotNull oa oaVar, @NotNull DisplayMetrics displayMetrics, @NotNull ExpressionResolver expressionResolver) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[((jp) oaVar.f90179a.evaluate(expressionResolver)).ordinal()];
        if (i10 == 1) {
            return BaseDivViewExtensionsKt.dpToPx((Number) oaVar.f90180b.evaluate(expressionResolver), displayMetrics);
        }
        if (i10 == 2) {
            return BaseDivViewExtensionsKt.spToPx((Number) oaVar.f90180b.evaluate(expressionResolver), displayMetrics);
        }
        if (i10 == 3) {
            return (int) ((Number) oaVar.f90180b.evaluate(expressionResolver)).doubleValue();
        }
        throw new m();
    }
}
