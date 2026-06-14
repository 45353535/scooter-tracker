package com.yandex.div.core.view2.divs;

import k8.a6;
import kotlin.Metadata;
import kotlin.ranges.g;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\b\u0005\u001a%\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\n\u001a\u0004\u0018\u00010\t*\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\f\u001a\u0004\u0018\u00010\t*\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\f\u0010\u000b\u001a\u0017\u0010\r\u001a\u0004\u0018\u00010\t*\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Lk8/a6;", "", "incoming", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "Landroidx/transition/Transition;", "toTransition", "(Lk8/a6;ZLcom/yandex/div/json/expressions/ExpressionResolver;)Landroidx/transition/Transition;", "", "", "translateValue", "(Ljava/lang/Double;)Ljava/lang/Float;", "scaleValue", "alphaValue", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class DivStateBinderKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a6.c.values().length];
            try {
                iArr[a6.c.TRANSLATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a6.c.SCALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a6.c.NO_ANIMATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final Float alphaValue(Double d10) {
        if (d10 != null) {
            return Float.valueOf(g.m((float) d10.doubleValue(), 0.0f, 1.0f));
        }
        return null;
    }

    private static final Float scaleValue(Double d10) {
        if (d10 != null) {
            return Float.valueOf(g.d((float) d10.doubleValue(), 0.0f));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.transition.Transition toTransition(k8.a6 r10, boolean r11, com.yandex.div.json.expressions.ExpressionResolver r12) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.DivStateBinderKt.toTransition(k8.a6, boolean, com.yandex.div.json.expressions.ExpressionResolver):androidx.transition.Transition");
    }

    private static final Float translateValue(Double d10) {
        if (d10 != null) {
            return Float.valueOf(g.m((float) d10.doubleValue(), -1.0f, 1.0f));
        }
        return null;
    }
}
