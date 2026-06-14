package com.fyber.inneractive.sdk.external;

/* JADX INFO: loaded from: classes7.dex */
public class ImpressionData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Pricing f20560a = new Pricing();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Video f20561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f20562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f20563d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f20564e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f20565f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f20566g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f20567h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f20568i;

    public static class Pricing {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public double f20569a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f20570b;

        public String getCurrency() {
            return this.f20570b;
        }

        public double getValue() {
            return this.f20569a;
        }

        public void setValue(double d10) {
            this.f20569a = d10;
        }

        public String toString() {
            return "Pricing{value=" + this.f20569a + ", currency='" + this.f20570b + "'}";
        }
    }

    public static class Video {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f20571a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f20572b;

        public Video(boolean z10, long j10) {
            this.f20571a = z10;
            this.f20572b = j10;
        }

        public long getDuration() {
            return this.f20572b;
        }

        public boolean isSkippable() {
            return this.f20571a;
        }

        public String toString() {
            return "Video{skippable=" + this.f20571a + ", duration=" + this.f20572b + '}';
        }
    }

    public String getAdvertiserDomain() {
        return this.f20568i;
    }

    public String getCampaignId() {
        return this.f20567h;
    }

    public String getCountry() {
        return this.f20564e;
    }

    public String getCreativeId() {
        return this.f20566g;
    }

    public Long getDemandId() {
        return this.f20563d;
    }

    public String getDemandSource() {
        return this.f20562c;
    }

    public String getImpressionId() {
        return this.f20565f;
    }

    public Pricing getPricing() {
        return this.f20560a;
    }

    public Video getVideo() {
        return this.f20561b;
    }

    public void setAdvertiserDomain(String str) {
        this.f20568i = str;
    }

    public void setCampaignId(String str) {
        this.f20567h = str;
    }

    public void setCountry(String str) {
        this.f20564e = str;
    }

    public void setCpmValue(String str) {
        double d10;
        try {
            d10 = Double.parseDouble(str);
        } catch (Exception unused) {
            d10 = 0.0d;
        }
        this.f20560a.f20569a = d10;
    }

    public void setCreativeId(String str) {
        this.f20566g = str;
    }

    public void setCurrency(String str) {
        this.f20560a.f20570b = str;
    }

    public void setDemandId(Long l10) {
        this.f20563d = l10;
    }

    public void setDemandSource(String str) {
        this.f20562c = str;
    }

    public void setDuration(long j10) {
        this.f20561b.f20572b = j10;
    }

    public void setImpressionId(String str) {
        this.f20565f = str;
    }

    public void setPricing(Pricing pricing) {
        this.f20560a = pricing;
    }

    public void setVideo(Video video) {
        this.f20561b = video;
    }

    public String toString() {
        return "ImpressionData{pricing=" + this.f20560a + ", video=" + this.f20561b + ", demandSource='" + this.f20562c + "', country='" + this.f20564e + "', impressionId='" + this.f20565f + "', creativeId='" + this.f20566g + "', campaignId='" + this.f20567h + "', advertiserDomain='" + this.f20568i + "'}";
    }
}
