package com.mbridge.msdk.playercommon.exoplayer2.source.chunk;

import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.HttpDataSource;

/* JADX INFO: loaded from: classes10.dex */
public final class ChunkedTrackBlacklistUtil {
    public static final long DEFAULT_TRACK_BLACKLIST_MS = 60000;
    private static final String TAG = "ChunkedTrackBlacklist";

    private ChunkedTrackBlacklistUtil() {
    }

    public static boolean maybeBlacklistTrack(TrackSelection trackSelection, int i10, Exception exc) {
        return maybeBlacklistTrack(trackSelection, i10, exc, 60000L);
    }

    public static boolean shouldBlacklist(Exception exc) {
        if (!(exc instanceof HttpDataSource.InvalidResponseCodeException)) {
            return false;
        }
        int i10 = ((HttpDataSource.InvalidResponseCodeException) exc).responseCode;
        return i10 == 404 || i10 == 410;
    }

    public static boolean maybeBlacklistTrack(TrackSelection trackSelection, int i10, Exception exc, long j10) {
        if (!shouldBlacklist(exc)) {
            return false;
        }
        boolean zBlacklist = trackSelection.blacklist(i10, j10);
        int i11 = ((HttpDataSource.InvalidResponseCodeException) exc).responseCode;
        if (!zBlacklist) {
            Log.w(TAG, "Blacklisting failed (cannot blacklist last enabled track): responseCode=" + i11 + ", format=" + trackSelection.getFormat(i10));
            return zBlacklist;
        }
        Log.w(TAG, "Blacklisted: duration=" + j10 + ", responseCode=" + i11 + ", format=" + trackSelection.getFormat(i10));
        return zBlacklist;
    }
}
