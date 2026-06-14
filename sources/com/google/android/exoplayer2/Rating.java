package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes7.dex */
public abstract class Rating implements Bundleable {
    static final int RATING_TYPE_HEART = 0;
    static final int RATING_TYPE_PERCENTAGE = 1;
    static final int RATING_TYPE_STAR = 2;
    static final int RATING_TYPE_THUMB = 3;
    static final int RATING_TYPE_UNSET = -1;
    static final float RATING_UNSET = -1.0f;
    static final String FIELD_RATING_TYPE = Util.intToStringMaxRadix(0);
    public static final Bundleable.Creator<Rating> CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.u2
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            return Rating.fromBundle(bundle);
        }
    };

    Rating() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Rating fromBundle(Bundle bundle) {
        int i10 = bundle.getInt(FIELD_RATING_TYPE, -1);
        if (i10 == 0) {
            return (Rating) HeartRating.CREATOR.fromBundle(bundle);
        }
        if (i10 == 1) {
            return (Rating) PercentageRating.CREATOR.fromBundle(bundle);
        }
        if (i10 == 2) {
            return (Rating) StarRating.CREATOR.fromBundle(bundle);
        }
        if (i10 == 3) {
            return (Rating) ThumbRating.CREATOR.fromBundle(bundle);
        }
        throw new IllegalArgumentException("Unknown RatingType: " + i10);
    }

    public abstract boolean isRated();
}
