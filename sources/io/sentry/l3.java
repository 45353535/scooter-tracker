package io.sentry;

import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class l3 {
    public static Date a(String str, ILogger iLogger) {
        if (str == null) {
            return null;
        }
        try {
            try {
                return l.f(str);
            } catch (Exception unused) {
                return l.g(str);
            }
        } catch (Exception e10) {
            iLogger.a(g7.ERROR, "Error when deserializing millis timestamp format.", e10);
            return null;
        }
    }
}
