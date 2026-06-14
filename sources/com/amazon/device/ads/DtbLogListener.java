package com.amazon.device.ads;

/* JADX INFO: loaded from: classes5.dex */
public interface DtbLogListener {
    String getTag();

    void postMessage(DTBLogLevel dTBLogLevel, String str);
}
