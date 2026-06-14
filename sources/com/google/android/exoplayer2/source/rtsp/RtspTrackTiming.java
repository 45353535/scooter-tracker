package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.UriUtil;

/* JADX INFO: loaded from: classes7.dex */
final class RtspTrackTiming {
    public final long rtpTimestamp;
    public final int sequenceNumber;
    public final Uri uri;

    private RtspTrackTiming(long j10, int i10, Uri uri) {
        this.rtpTimestamp = j10;
        this.sequenceNumber = i10;
        this.uri = uri;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.common.collect.ImmutableList<com.google.android.exoplayer2.source.rtsp.RtspTrackTiming> parseTrackTiming(java.lang.String r20, android.net.Uri r21) throws com.google.android.exoplayer2.ParserException {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.rtsp.RtspTrackTiming.parseTrackTiming(java.lang.String, android.net.Uri):com.google.common.collect.ImmutableList");
    }

    @VisibleForTesting
    static Uri resolveUri(String str, Uri uri) {
        Assertions.checkArgument(((String) Assertions.checkNotNull(uri.getScheme())).equals("rtsp"));
        Uri uri2 = Uri.parse(str);
        if (uri2.isAbsolute()) {
            return uri2;
        }
        String strValueOf = String.valueOf(str);
        Uri uri3 = Uri.parse(strValueOf.length() != 0 ? "rtsp://".concat(strValueOf) : new String("rtsp://"));
        String string = uri.toString();
        return ((String) Assertions.checkNotNull(uri3.getHost())).equals(uri.getHost()) ? uri3 : string.endsWith("/") ? UriUtil.resolveToUri(string, str) : UriUtil.resolveToUri(string.concat("/"), str);
    }
}
