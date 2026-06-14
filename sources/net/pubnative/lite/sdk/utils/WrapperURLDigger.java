package net.pubnative.lite.sdk.utils;

import com.startapp.simple.bloomfilter.codec.IOUtils;

/* JADX INFO: loaded from: classes3.dex */
public class WrapperURLDigger {
    public String getURL(String str) {
        try {
            return (!str.contains(IOUtils.LINE_SEPARATOR_UNIX) || str.split(IOUtils.LINE_SEPARATOR_UNIX).length <= 0) ? str : str.split(IOUtils.LINE_SEPARATOR_UNIX)[0];
        } catch (RuntimeException unused) {
            return str;
        }
    }
}
