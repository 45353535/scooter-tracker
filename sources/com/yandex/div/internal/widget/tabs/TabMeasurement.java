package com.yandex.div.internal.widget.tabs;

import android.os.Bundle;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes11.dex */
class TabMeasurement {
    private int mFirstTabHeight = -1;
    private int mMaxTabHeight = -1;
    private final int mTabCount;
    private int[] mTabHeight;

    @NonNull
    private final TabMeasurementFunction mTabMeasurementFunction;

    interface TabMeasurementFunction {
        int getTabHeight(int i10);
    }

    TabMeasurement(int i10, @NonNull TabMeasurementFunction tabMeasurementFunction) {
        this.mTabCount = i10;
        this.mTabMeasurementFunction = tabMeasurementFunction;
        this.mTabHeight = new int[i10];
    }

    int getFirstTabHeight() {
        if (this.mFirstTabHeight < 0) {
            this.mFirstTabHeight = this.mTabMeasurementFunction.getTabHeight(0);
        }
        return this.mFirstTabHeight;
    }

    int getMaxTabHeight() {
        if (this.mMaxTabHeight < 0) {
            int firstTabHeight = getFirstTabHeight();
            for (int i10 = 1; i10 < this.mTabCount; i10++) {
                firstTabHeight = Math.max(firstTabHeight, this.mTabMeasurementFunction.getTabHeight(i10));
            }
            this.mMaxTabHeight = firstTabHeight;
        }
        return this.mMaxTabHeight;
    }

    int getTabHeight(int i10) {
        int i11 = this.mTabCount;
        if (i11 == 0) {
            return 0;
        }
        if (i10 < 0) {
            return getTabHeight(0);
        }
        if (i10 >= i11) {
            return getTabHeight(i11);
        }
        int[] iArr = this.mTabHeight;
        if (iArr[i10] <= 0) {
            iArr[i10] = this.mTabMeasurementFunction.getTabHeight(i10);
        }
        return this.mTabHeight[i10];
    }

    void removeState(@NonNull Bundle bundle, int i10) {
        bundle.remove("FIRST_TAB_HEIGHT_PREFIX" + i10);
        bundle.remove("MAX_TAB_HEIGHT_PREFIX" + i10);
    }

    void restoreState(@NonNull Bundle bundle, int i10) {
        this.mFirstTabHeight = bundle.getInt("FIRST_TAB_HEIGHT_PREFIX" + i10, -1);
        this.mMaxTabHeight = bundle.getInt("MAX_TAB_HEIGHT_PREFIX" + i10, -1);
    }
}
