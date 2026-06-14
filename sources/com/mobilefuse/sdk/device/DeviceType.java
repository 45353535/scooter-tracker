package com.mobilefuse.sdk.device;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/mobilefuse/sdk/device/DeviceType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "MOBILE_OR_TABLET", "PC", "CONNECTED_TV", "PHONE", "TABLET", "CONNECTED_DEVICE", "SET_TOP_BOX", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
public enum DeviceType {
    MOBILE_OR_TABLET(1),
    PC(2),
    CONNECTED_TV(3),
    PHONE(4),
    TABLET(5),
    CONNECTED_DEVICE(6),
    SET_TOP_BOX(7);

    private final int value;

    DeviceType(int i10) {
        this.value = i10;
    }

    public final int getValue() {
        return this.value;
    }
}
