package net.pubnative.lite.sdk;

/* JADX INFO: loaded from: classes3.dex */
public enum CountdownStyle {
    PIE_CHART("net.pubnative.lite.sdk.countdown.pie_chart"),
    TIMER("net.pubnative.lite.sdk.countdown.timer"),
    PROGRESS("net.pubnative.lite.sdk.countdown.progress");

    private final String mId;

    CountdownStyle(String str) {
        this.mId = str;
    }

    public static CountdownStyle from(String str) {
        CountdownStyle countdownStyle = PIE_CHART;
        if (!countdownStyle.getId().equals(str)) {
            CountdownStyle countdownStyle2 = TIMER;
            if (countdownStyle2.getId().equals(str)) {
                return countdownStyle2;
            }
            CountdownStyle countdownStyle3 = PROGRESS;
            if (countdownStyle3.getId().equals(str)) {
                return countdownStyle3;
            }
        }
        return countdownStyle;
    }

    public String getId() {
        return this.mId;
    }
}
