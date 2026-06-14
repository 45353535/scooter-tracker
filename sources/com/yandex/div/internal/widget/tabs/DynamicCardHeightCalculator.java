package com.yandex.div.internal.widget.tabs;

import android.view.ViewGroup;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import com.yandex.div.internal.widget.tabs.HeightCalculatorFactory;

/* JADX INFO: loaded from: classes11.dex */
@MainThread
public class DynamicCardHeightCalculator extends BaseCardHeightCalculator {
    public DynamicCardHeightCalculator(@NonNull ViewGroup viewGroup, @NonNull HeightCalculatorFactory.MeasureTabHeightFn measureTabHeightFn, @NonNull HeightCalculatorFactory.GetTabCountFn getTabCountFn) {
        super(viewGroup, measureTabHeightFn, getTabCountFn);
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseCardHeightCalculator
    protected int getOptimalHeight(@NonNull TabMeasurement tabMeasurement, int i10, float f10) {
        if (f10 < 0.01f) {
            return tabMeasurement.getTabHeight(i10);
        }
        return Math.round(tabMeasurement.getTabHeight(i10) + ((tabMeasurement.getTabHeight(i10 + 1) - r0) * f10));
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseCardHeightCalculator, com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout.HeightCalculator
    public int measureHeight(int i10, int i11) {
        dropMeasureCache();
        return super.measureHeight(i10, i11);
    }

    @Override // com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout.HeightCalculator
    public boolean shouldRequestLayoutOnScroll(int i10, float f10) {
        return true;
    }
}
