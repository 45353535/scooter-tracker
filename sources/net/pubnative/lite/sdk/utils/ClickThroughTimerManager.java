package net.pubnative.lite.sdk.utils;

/* JADX INFO: loaded from: classes3.dex */
public class ClickThroughTimerManager {
    private static final int DEFAULT_CLICK_THROUGH_TIMER = 10;
    private static final int MAX_CLICK_THROUGH_TIMER = 35;
    private static final int MIN_CLICK_THROUGH_TIMER = 5;

    public interface ClickThroughTimerListener {
        void onClickThroughTriggered();
    }

    public static int getClickThroughTimer(Integer num) {
        if (num == null) {
            return 10000;
        }
        if (num.intValue() > 35) {
            return 35000;
        }
        if (num.intValue() < 5) {
            return 5000;
        }
        return num.intValue() * 1000;
    }
}
