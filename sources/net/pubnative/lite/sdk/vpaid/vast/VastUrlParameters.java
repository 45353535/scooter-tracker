package net.pubnative.lite.sdk.vpaid.vast;

/* JADX INFO: loaded from: classes3.dex */
public class VastUrlParameters {
    final String advertisingId;
    final String bundleId;
    final String deviceHeight;
    final String deviceWidth;
    final String dnt;
    final String gdpr;
    final String gdprConsent;
    final String latitude;
    final String longitude;
    final String usPrivacy;
    final String userAgent;

    public static class Builder {
        private String advertisingId;
        private String bundleId;
        private String deviceHeight;
        private String deviceWidth;
        private String dnt;
        private String gdpr;
        private String gdprConsent;
        private String latitude;
        private String longitude;
        private String usPrivacy;
        private String userAgent;

        public Builder advertisingId(String str) {
            this.advertisingId = str;
            return this;
        }

        public VastUrlParameters build() {
            return new VastUrlParameters(this);
        }

        public Builder bundleId(String str) {
            this.bundleId = str;
            return this;
        }

        public Builder deviceHeight(String str) {
            this.deviceHeight = str;
            return this;
        }

        public Builder deviceWidth(String str) {
            this.deviceWidth = str;
            return this;
        }

        public Builder dnt(String str) {
            this.dnt = str;
            return this;
        }

        public Builder gdpr(String str) {
            this.gdpr = str;
            return this;
        }

        public Builder gdprConsent(String str) {
            this.gdprConsent = str;
            return this;
        }

        public Builder latitude(String str) {
            this.latitude = str;
            return this;
        }

        public Builder longitude(String str) {
            this.longitude = str;
            return this;
        }

        public Builder usPrivacy(String str) {
            this.usPrivacy = str;
            return this;
        }

        public Builder userAgent(String str) {
            this.userAgent = str;
            return this;
        }
    }

    private VastUrlParameters(Builder builder) {
        this.advertisingId = builder.advertisingId;
        this.bundleId = builder.bundleId;
        this.dnt = builder.dnt;
        this.latitude = builder.latitude;
        this.longitude = builder.longitude;
        this.userAgent = builder.userAgent;
        this.deviceWidth = builder.deviceWidth;
        this.deviceHeight = builder.deviceHeight;
        this.gdpr = builder.gdpr;
        this.gdprConsent = builder.gdprConsent;
        this.usPrivacy = builder.usPrivacy;
    }
}
