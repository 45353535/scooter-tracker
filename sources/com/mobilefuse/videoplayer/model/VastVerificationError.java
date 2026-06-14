package com.mobilefuse.videoplayer.model;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/mobilefuse/videoplayer/model/VastVerificationError;", "", "errorCode", "", "(Ljava/lang/String;II)V", "getErrorCode", "()I", "RESOURCE_REJECTED", "NOT_SUPPORTED", "LOAD_ERROR", "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
public enum VastVerificationError {
    RESOURCE_REJECTED(1),
    NOT_SUPPORTED(2),
    LOAD_ERROR(3);

    private final int errorCode;

    VastVerificationError(int i10) {
        this.errorCode = i10;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }
}
