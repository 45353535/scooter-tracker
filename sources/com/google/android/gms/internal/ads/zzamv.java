package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes8.dex */
public final class zzamv implements zzamf {
    private static final Pattern zza = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    private final boolean zzb;

    @Nullable
    private final zzamu zzc;
    private final zzer zzd;
    private Map zze;
    private float zzf;
    private float zzg;

    public zzamv() {
        this(null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzb(com.google.android.gms.internal.ads.zzer r7, java.nio.charset.Charset r8) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamv.zzb(com.google.android.gms.internal.ads.zzer, java.nio.charset.Charset):void");
    }

    private static long zzc(String str) {
        Matcher matcher = zza.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        String str2 = zzfj.zza;
        long j10 = Long.parseLong(strGroup) * 3600000000L;
        long j11 = Long.parseLong(matcher.group(2)) * 60000000;
        return j10 + j11 + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * 10000);
    }

    private static float zzd(int i10) {
        if (i10 == 0) {
            return 0.05f;
        }
        if (i10 != 1) {
            return i10 != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    private static int zze(long j10, List list, List list2) {
        int i10;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                i10 = 0;
                break;
            }
            if (((Long) list.get(size)).longValue() == j10) {
                return size;
            }
            if (((Long) list.get(size)).longValue() < j10) {
                i10 = size + 1;
                break;
            }
        }
        list.add(i10, Long.valueOf(j10));
        list2.add(i10, i10 == 0 ? new ArrayList() : new ArrayList((Collection) list2.get(i10 - 1)));
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x030f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bc  */
    @Override // com.google.android.gms.internal.ads.zzamf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(byte[] r23, int r24, int r25, com.google.android.gms.internal.ads.zzame r26, com.google.android.gms.internal.ads.zzdr r27) {
        /*
            Method dump skipped, instruction units count: 868
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamv.zza(byte[], int, int, com.google.android.gms.internal.ads.zzame, com.google.android.gms.internal.ads.zzdr):void");
    }

    public zzamv(@Nullable List list) {
        this.zzf = -3.4028235E38f;
        this.zzg = -3.4028235E38f;
        this.zzd = new zzer();
        if (list == null || list.isEmpty()) {
            this.zzb = false;
            this.zzc = null;
            return;
        }
        this.zzb = true;
        String strZzi = zzfj.zzi((byte[]) list.get(0));
        zzgrc.zza(strZzi.startsWith("Format:"));
        zzamu zzamuVarZza = zzamu.zza(strZzi);
        zzamuVarZza.getClass();
        this.zzc = zzamuVarZza;
        zzb(new zzer((byte[]) list.get(1)), StandardCharsets.UTF_8);
    }
}
