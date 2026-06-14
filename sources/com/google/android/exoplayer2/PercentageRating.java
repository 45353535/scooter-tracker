package com.google.android.exoplayer2;

import android.os.Bundle;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class PercentageRating extends Rating {
    private static final int TYPE = 1;
    private final float percent;
    private static final String FIELD_PERCENT = Util.intToStringMaxRadix(1);
    public static final Bundleable.Creator<PercentageRating> CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.o2
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            return PercentageRating.fromBundle(bundle);
        }
    };

    public PercentageRating() {
        this.percent = -1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static PercentageRating fromBundle(Bundle bundle) {
        Assertions.checkArgument(bundle.getInt(Rating.FIELD_RATING_TYPE, -1) == 1);
        float f10 = bundle.getFloat(FIELD_PERCENT, -1.0f);
        return f10 == -1.0f ? new PercentageRating() : new PercentageRating(f10);
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof PercentageRating) && this.percent == ((PercentageRating) obj).percent;
    }

    public float getPercent() {
        return this.percent;
    }

    public int hashCode() {
        return Objects.hashCode(Float.valueOf(this.percent));
    }

    @Override // com.google.android.exoplayer2.Rating
    public boolean isRated() {
        return this.percent != -1.0f;
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(Rating.FIELD_RATING_TYPE, 1);
        bundle.putFloat(FIELD_PERCENT, this.percent);
        return bundle;
    }

    public PercentageRating(@FloatRange(from = 0.0d, to = TextSelectionMouseDetectorKt.ClicksSlop) float f10) {
        Assertions.checkArgument(f10 >= 0.0f && f10 <= 100.0f, "percent must be in the range of [0, 100]");
        this.percent = f10;
    }
}
