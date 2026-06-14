package net.pubnative.lite.sdk.models;

/* JADX INFO: loaded from: classes3.dex */
public class LearnMoreData {
    private final LearnMoreLocation location;
    private final LearnMoreSize size;

    public LearnMoreData(String str, String str2) {
        this.size = LearnMoreSize.fromString(str);
        this.location = LearnMoreLocation.fromString(str2);
    }

    public LearnMoreLocation getLocation() {
        return this.location;
    }

    public LearnMoreSize getSize() {
        return this.size;
    }
}
