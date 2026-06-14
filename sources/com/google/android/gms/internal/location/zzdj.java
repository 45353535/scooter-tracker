package com.google.android.gms.internal.location;

import androidx.annotation.GuardedBy;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import com.vungle.ads.internal.signals.SignalManager;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes8.dex */
public final class zzdj {
    private static final SimpleDateFormat zza;
    private static final SimpleDateFormat zzb;

    @GuardedBy("sharedStringBuilder")
    private static final StringBuilder zzc;

    static {
        Locale locale = Locale.ROOT;
        zza = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", locale);
        zzb = new SimpleDateFormat("MM-dd HH:mm:ss", locale);
        zzc = new StringBuilder(33);
    }

    public static String zza(long j10) {
        String string;
        StringBuilder sb2 = zzc;
        synchronized (sb2) {
            sb2.setLength(0);
            zzb(j10, sb2);
            string = sb2.toString();
        }
        return string;
    }

    public static void zzb(long j10, StringBuilder sb2) {
        if (j10 == 0) {
            sb2.append("0s");
            return;
        }
        sb2.ensureCapacity(sb2.length() + 27);
        boolean z10 = false;
        if (j10 < 0) {
            sb2.append(TokenBuilder.TOKEN_DELIMITER);
            if (j10 != Long.MIN_VALUE) {
                j10 = -j10;
            } else {
                j10 = Long.MAX_VALUE;
                z10 = true;
            }
        }
        if (j10 >= SignalManager.TWENTY_FOUR_HOURS_MILLIS) {
            sb2.append(j10 / SignalManager.TWENTY_FOUR_HOURS_MILLIS);
            sb2.append("d");
            j10 %= SignalManager.TWENTY_FOUR_HOURS_MILLIS;
        }
        if (true == z10) {
            j10 = 25975808;
        }
        if (j10 >= 3600000) {
            sb2.append(j10 / 3600000);
            sb2.append("h");
            j10 %= 3600000;
        }
        if (j10 >= 60000) {
            sb2.append(j10 / 60000);
            sb2.append("m");
            j10 %= 60000;
        }
        if (j10 >= 1000) {
            sb2.append(j10 / 1000);
            sb2.append("s");
            j10 %= 1000;
        }
        if (j10 > 0) {
            sb2.append(j10);
            sb2.append("ms");
        }
    }
}
