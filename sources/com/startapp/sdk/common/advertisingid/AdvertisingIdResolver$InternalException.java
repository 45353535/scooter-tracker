package com.startapp.sdk.common.advertisingid;

/* JADX INFO: loaded from: classes11.dex */
class AdvertisingIdResolver$InternalException extends Exception {
    private static final long serialVersionUID = -3951983339713608735L;
    final int infoEventFlags;

    public AdvertisingIdResolver$InternalException(int i10) {
        super(String.valueOf(i10));
        this.infoEventFlags = i10;
    }
}
