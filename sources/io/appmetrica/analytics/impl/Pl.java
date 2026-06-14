package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.StartupParamsCallback;
import java.util.HashMap;

/* JADX INFO: loaded from: classes12.dex */
public final class Pl extends HashMap {
    public Pl() {
        put(Nl.UNKNOWN, StartupParamsCallback.Reason.UNKNOWN);
        put(Nl.NETWORK, StartupParamsCallback.Reason.NETWORK);
        put(Nl.PARSE, StartupParamsCallback.Reason.INVALID_RESPONSE);
    }
}
