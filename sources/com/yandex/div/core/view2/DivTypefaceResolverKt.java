package com.yandex.div.core.view2;

import android.graphics.Typeface;
import com.yandex.div.core.font.DivTypefaceProvider;
import k8.jd;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a'\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a3\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\n\u001a#\u0010\u000b\u001a\u00020\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "fontWeight", "Lcom/yandex/div/core/font/DivTypefaceProvider;", "typefaceProvider", "Landroid/graphics/Typeface;", "kotlin.jvm.PlatformType", "getTypeface", "(ILcom/yandex/div/core/font/DivTypefaceProvider;)Landroid/graphics/Typeface;", "Lk8/jd;", "fontWeightValue", "(Lk8/jd;Ljava/lang/Integer;Lcom/yandex/div/core/font/DivTypefaceProvider;)Landroid/graphics/Typeface;", "getTypefaceValue", "(Lk8/jd;Ljava/lang/Integer;)I", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class DivTypefaceResolverKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[jd.values().length];
            try {
                iArr[jd.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[jd.REGULAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[jd.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[jd.BOLD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Typeface getTypeface(int i10, @NotNull DivTypefaceProvider divTypefaceProvider) {
        Typeface typefaceFor = divTypefaceProvider.getTypefaceFor(i10);
        return typefaceFor == null ? Typeface.DEFAULT : typefaceFor;
    }

    public static final int getTypefaceValue(@Nullable jd jdVar, @Nullable Integer num) {
        if (num != null) {
            return num.intValue();
        }
        int i10 = jdVar == null ? -1 : WhenMappings.$EnumSwitchMapping$0[jdVar.ordinal()];
        if (i10 == 1) {
            return 300;
        }
        if (i10 == 2) {
            return 400;
        }
        if (i10 != 3) {
            return i10 != 4 ? 400 : 700;
        }
        return 500;
    }

    public static final Typeface getTypeface(@Nullable jd jdVar, @Nullable Integer num, @NotNull DivTypefaceProvider divTypefaceProvider) {
        return getTypeface(getTypefaceValue(jdVar, num), divTypefaceProvider);
    }
}
