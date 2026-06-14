package com.startapp.sdk.internal;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public class aj {
    private String admtag;
    private String campaign_id;

    @Nullable
    private String partnerName;

    @Nullable
    private String partnerResponse;
    private boolean recordHops;
    private boolean skipFailed;

    @Nullable
    private Long skipafter;

    @Nullable
    private Long skipmin;
    private String ttl_sec;
    private String vasttag;

    public String getAdmTag() {
        return this.admtag;
    }

    public String getCampaignId() {
        return this.campaign_id;
    }

    @Nullable
    public String getPartnerName() {
        return this.partnerName;
    }

    @Nullable
    public String getPartnerResponse() {
        return this.partnerResponse;
    }

    @Nullable
    public Long getSkipafter() {
        return this.skipafter;
    }

    @Nullable
    public Long getSkipmin() {
        return this.skipmin;
    }

    public String getTtlSec() {
        return this.ttl_sec;
    }

    public String getVastTag() {
        return this.vasttag;
    }

    public boolean isRecordHops() {
        return this.recordHops;
    }

    public boolean isSkipFailed() {
        return this.skipFailed;
    }
}
