package com.pubmatic.sdk.video;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.network.POBTrackerHandler;
import com.taurusx.tax.n.z;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class POBVastErrorHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final POBTrackerHandler f62975a;

    public POBVastErrorHandler(@NonNull POBTrackerHandler pOBTrackerHandler) {
        this.f62975a = pOBTrackerHandler;
    }

    private boolean a(POBVastError pOBVastError) {
        return (pOBVastError == null || convertToPOBError(pOBVastError) == null) ? false : true;
    }

    @Nullable
    public static POBError convertToPOBError(@NonNull POBVastError pOBVastError) {
        int errorCode = pOBVastError.getErrorCode();
        if (errorCode != 200 && errorCode != 201 && errorCode != 405) {
            if (errorCode != 900) {
                switch (errorCode) {
                    case 100:
                    case 101:
                    case 102:
                        return new POBError(1007, pOBVastError.getErrorMessage());
                    default:
                        switch (errorCode) {
                            case 300:
                                break;
                            case 301:
                            case 304:
                                return new POBError(1005, pOBVastError.getErrorMessage());
                            default:
                                switch (errorCode) {
                                    case 400:
                                    case 403:
                                        break;
                                    case 401:
                                        break;
                                    case 402:
                                        return new POBError(1003, pOBVastError.getErrorMessage());
                                    default:
                                        switch (errorCode) {
                                            case 500:
                                            case 503:
                                                break;
                                            case 501:
                                            case 502:
                                                break;
                                            default:
                                                return null;
                                        }
                                        break;
                                }
                            case 302:
                            case 303:
                                return new POBError(1002, pOBVastError.getErrorMessage());
                        }
                        break;
                }
            }
            return new POBError(1006, pOBVastError.getErrorMessage());
        }
        return new POBError(1009, pOBVastError.getErrorMessage());
    }

    public void executeVastErrors(@Nullable List<String> list, @NonNull POBVastError pOBVastError) {
        executeVastErrorsWithMacros(list, null, pOBVastError, null);
    }

    public void executeVastErrorsWithMacros(@Nullable List<String> list, @Nullable Map<Object, Object> map, @NonNull POBVastError pOBVastError, @Nullable Map<String, String> map2) {
        POBLog.debug("POBVastErrorHandler", "Vast error occurred: %s", pOBVastError.toString());
        if (list == null || list.isEmpty()) {
            POBLog.warn("POBVastErrorHandler", "Tracker url list is empty for vast error: %d", new Object[0]);
            return;
        }
        if (!a(pOBVastError)) {
            POBLog.warn("POBVastErrorHandler", "Skipped tracker execution for vast error: %d", Integer.valueOf(pOBVastError.getErrorCode()));
            return;
        }
        if (map == null) {
            map = DesugarCollections.synchronizedMap(new HashMap(1));
        }
        map.put(z.f66398w, "" + pOBVastError.getErrorCode());
        this.f62975a.handleTrackersForError(list, map, map2);
    }
}
