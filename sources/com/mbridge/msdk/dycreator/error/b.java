package com.mbridge.msdk.dycreator.error;

import androidx.media3.common.PlaybackException;

/* JADX INFO: loaded from: classes10.dex */
public enum b {
    NOT_FOUND_VIEWOPTION(-101, "ViewOption is null"),
    NOT_FOUND_CONTEXT(PlaybackException.ERROR_CODE_AUTHENTICATION_EXPIRED, "context is null"),
    FILE_CREATE_VIEW_FILE(PlaybackException.ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED, "file create view is null"),
    CAMPAIGNEX_IS_NULL(PlaybackException.ERROR_CODE_CONCURRENT_STREAM_LIMIT, "Campaign size only one"),
    NOT_FOUND_CAMPAIGN(PlaybackException.ERROR_CODE_PARENTAL_CONTROL_RESTRICTED, "campaign is null"),
    NOT_FOUND_DYNAMIC_FILE(PlaybackException.ERROR_CODE_NOT_AVAILABLE_IN_REGION, "dynamic file is not exits"),
    BIND_DATA_FILE_OR_DIR(PlaybackException.ERROR_CODE_SKIP_LIMIT_REACHED, "data file or file dir is not exits "),
    NOT_FOUND_DYNAMIC_OPTION(-108, "dynamic_option is not exits");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f48145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f48146b;

    b(int i10, String str) {
        this.f48145a = i10;
        this.f48146b = str;
    }

    public int d() {
        return this.f48145a;
    }

    public String g() {
        return this.f48146b;
    }
}
