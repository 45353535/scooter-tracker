package com.monetization.ads.exo.source.dash;

import android.net.Uri;
import android.text.TextUtils;
import j$.util.DesugarTimeZone;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import yads.ba2;
import yads.ca2;
import yads.e30;
import yads.st;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements ca2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f58992a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

    @Override // yads.ca2
    public final Object a(Uri uri, e30 e30Var) throws IOException {
        String line = new BufferedReader(new InputStreamReader(e30Var, st.f115925c)).readLine();
        try {
            Matcher matcher = f58992a.matcher(line);
            if (!matcher.matches()) {
                throw new ba2("Couldn't parse timestamp: " + line, null, true, 4);
            }
            String strGroup = matcher.group(1);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
            long time = simpleDateFormat.parse(strGroup).getTime();
            if (!"Z".equals(matcher.group(2))) {
                long j10 = "+".equals(matcher.group(4)) ? 1L : -1L;
                long j11 = Long.parseLong(matcher.group(5));
                String strGroup2 = matcher.group(7);
                time -= (((j11 * 60) + (TextUtils.isEmpty(strGroup2) ? 0L : Long.parseLong(strGroup2))) * 60000) * j10;
            }
            return Long.valueOf(time);
        } catch (ParseException e10) {
            throw new ba2(null, e10, true, 4);
        }
    }
}
