package com.yandex.div.core.font;

import android.graphics.Typeface;
import android.os.Build;
import androidx.annotation.Nullable;
import e7.a;

/* JADX INFO: loaded from: classes11.dex */
public interface DivTypefaceProvider {
    public static final DivTypefaceProvider DEFAULT = new DivTypefaceProvider() { // from class: com.yandex.div.core.font.DivTypefaceProvider.1
        @Override // com.yandex.div.core.font.DivTypefaceProvider
        @Nullable
        public Typeface getBold() {
            return null;
        }

        @Override // com.yandex.div.core.font.DivTypefaceProvider
        @Nullable
        public Typeface getLight() {
            return null;
        }

        @Override // com.yandex.div.core.font.DivTypefaceProvider
        @Nullable
        public Typeface getMedium() {
            return null;
        }

        @Override // com.yandex.div.core.font.DivTypefaceProvider
        @Nullable
        public Typeface getRegular() {
            return null;
        }

        @Override // com.yandex.div.core.font.DivTypefaceProvider
        @Nullable
        public Typeface getTypefaceFor(int i10) {
            return Build.VERSION.SDK_INT >= 28 ? Typeface.create(Typeface.DEFAULT, i10, false) : a.a(this, i10);
        }

        @Override // com.yandex.div.core.font.DivTypefaceProvider
        public /* synthetic */ boolean isVariable() {
            return a.b(this);
        }
    };

    @Nullable
    Typeface getBold();

    @Nullable
    Typeface getLight();

    @Nullable
    Typeface getMedium();

    @Nullable
    Typeface getRegular();

    @Nullable
    Typeface getTypefaceFor(int i10);

    boolean isVariable();
}
