package com.fyber.inneractive.sdk.player.exoplayer2.text.webvtt;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f22923a = Pattern.compile("^NOTE(( |\t).*)?$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f22924b = Pattern.compile("^\ufeff?WEBVTT(( |\t).*)?$");

    public static long a(String str) {
        String[] strArrSplit = str.split("\\.", 2);
        long j10 = 0;
        for (String str2 : strArrSplit[0].split(StringUtils.PROCESS_POSTFIX_DELIMITER)) {
            j10 = (j10 * 60) + Long.parseLong(str2);
        }
        return (Long.parseLong(strArrSplit[1]) + (j10 * 1000)) * 1000;
    }
}
