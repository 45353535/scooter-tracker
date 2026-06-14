package com.startapp.sdk.adsbase.adinformation;

import android.widget.RelativeLayout;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
@Keep
public class AdInformationPositions {
    protected static final String DEFAULT_POSITION = Position.BOTTOM_LEFT.name();
    public static final String OBJECT_PROPERY_GLOBAL_NAME = "Positions";

    @Keep
    public enum Position {
        TOP_LEFT(1, new int[]{10, 9}, -1),
        TOP_RIGHT(2, new int[]{10, 11}, 1),
        BOTTOM_LEFT(3, new int[]{12, 9}, -1),
        BOTTOM_RIGHT(4, new int[]{12, 11}, 1);

        private int animationMultiplier;
        private int index;
        private int[] rules;

        Position(int i10, int[] iArr, int i11) {
            this.rules = iArr;
            this.animationMultiplier = i11;
            this.index = i10;
        }

        public static Position getByIndex(long j10) {
            Position position = BOTTOM_LEFT;
            Position[] positionArrValues = values();
            for (int i10 = 0; i10 < positionArrValues.length; i10++) {
                if (positionArrValues[i10].getIndex() == j10) {
                    position = positionArrValues[i10];
                }
            }
            return position;
        }

        public static Position getByName(String str) {
            Position position = BOTTOM_LEFT;
            Position[] positionArrValues = values();
            for (int i10 = 0; i10 < positionArrValues.length; i10++) {
                String strName = positionArrValues[i10].name();
                Locale locale = Locale.ROOT;
                if (strName.toLowerCase(locale).compareTo(str.toLowerCase(locale)) == 0) {
                    position = positionArrValues[i10];
                }
            }
            return position;
        }

        public void addRules(RelativeLayout.LayoutParams layoutParams) {
            int i10 = 0;
            while (true) {
                int[] iArr = this.rules;
                if (i10 >= iArr.length) {
                    return;
                }
                layoutParams.addRule(iArr[i10]);
                i10++;
            }
        }

        @NonNull
        public Position flipHorizontal() {
            int i10 = b.f63984a[ordinal()];
            if (i10 == 1) {
                return TOP_RIGHT;
            }
            if (i10 == 2) {
                return TOP_LEFT;
            }
            if (i10 == 3) {
                return BOTTOM_RIGHT;
            }
            if (i10 == 4) {
                return BOTTOM_LEFT;
            }
            throw new IllegalStateException();
        }

        public int getAnimationStartMultiplier() {
            return this.animationMultiplier;
        }

        public int getIndex() {
            return this.index;
        }
    }
}
