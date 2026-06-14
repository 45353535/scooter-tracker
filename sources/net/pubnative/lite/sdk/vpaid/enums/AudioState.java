package net.pubnative.lite.sdk.vpaid.enums;

import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public enum AudioState {
    MUTED("muted"),
    ON("on"),
    DEFAULT("default");

    final String stateName;

    AudioState(String str) {
        this.stateName = str;
    }

    public static AudioState fromString(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        AudioState audioState = MUTED;
        if (lowerCase.equals(audioState.stateName)) {
            return audioState;
        }
        AudioState audioState2 = ON;
        if (lowerCase.equals(audioState2.stateName)) {
            return audioState2;
        }
        AudioState audioState3 = DEFAULT;
        if (lowerCase.equals(audioState3.stateName)) {
            return audioState3;
        }
        return null;
    }

    public String getStateName() {
        return this.stateName;
    }
}
