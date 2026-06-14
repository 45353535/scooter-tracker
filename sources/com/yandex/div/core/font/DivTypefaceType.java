package com.yandex.div.core.font;

import android.graphics.Typeface;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes11.dex */
public enum DivTypefaceType {
    REGULAR,
    MEDIUM,
    BOLD,
    LIGHT;

    /* JADX INFO: renamed from: com.yandex.div.core.font.DivTypefaceType$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$yandex$div$core$font$DivTypefaceType;

        static {
            int[] iArr = new int[DivTypefaceType.values().length];
            $SwitchMap$com$yandex$div$core$font$DivTypefaceType = iArr;
            try {
                iArr[DivTypefaceType.BOLD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$yandex$div$core$font$DivTypefaceType[DivTypefaceType.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$yandex$div$core$font$DivTypefaceType[DivTypefaceType.LIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public Typeface getTypeface(@NonNull DivTypefaceProvider divTypefaceProvider) {
        int i10 = AnonymousClass1.$SwitchMap$com$yandex$div$core$font$DivTypefaceType[ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? divTypefaceProvider.getRegular() : divTypefaceProvider.getLight() : divTypefaceProvider.getMedium() : divTypefaceProvider.getBold();
    }
}
