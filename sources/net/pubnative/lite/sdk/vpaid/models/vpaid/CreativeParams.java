package net.pubnative.lite.sdk.vpaid.models.vpaid;

/* JADX INFO: loaded from: classes3.dex */
public class CreativeParams {
    private String creativeData;
    private final int desiredBitrate;
    private String environmentVars;
    private final int height;
    private final String viewMode;
    private final int width;

    public CreativeParams(int i10, int i11, String str, int i12) {
        this.width = i10;
        this.height = i11;
        this.viewMode = "'" + str + "'";
        this.desiredBitrate = i12;
    }

    public String getCreativeData() {
        return this.creativeData;
    }

    public int getDesiredBitrate() {
        return this.desiredBitrate;
    }

    public String getEnvironmentVars() {
        return this.environmentVars;
    }

    public int getHeight() {
        return this.height;
    }

    public String getViewMode() {
        return this.viewMode;
    }

    public int getWidth() {
        return this.width;
    }

    public void setAdParameters(String str) {
        this.creativeData = str;
    }

    public void setEnvironmentVars(String str) {
        this.environmentVars = str;
    }
}
