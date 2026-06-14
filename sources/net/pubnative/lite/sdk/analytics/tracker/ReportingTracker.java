package net.pubnative.lite.sdk.analytics.tracker;

/* JADX INFO: loaded from: classes3.dex */
public class ReportingTracker {
    private String js;
    private int responseCode;
    private final String type;
    private String url;

    public ReportingTracker(String str, String str2, int i10) {
        this.js = "";
        this.type = str;
        this.url = str2;
        this.responseCode = i10;
    }

    public String getJs() {
        return this.js;
    }

    public int getResponseCode() {
        return this.responseCode;
    }

    public String getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public ReportingTracker(String str, String str2) {
        this.url = "";
        this.responseCode = 0;
        this.type = str;
        this.js = str2;
    }
}
