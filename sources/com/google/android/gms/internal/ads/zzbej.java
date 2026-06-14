package com.google.android.gms.internal.ads;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbej {
    private final int zza;
    private final zzbeg zzb = new zzbel();

    public zzbej(int i10) {
        this.zza = i10;
    }

    public final String zza(ArrayList arrayList) {
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb2.append(((String) arrayList.get(i10)).toLowerCase(Locale.US));
            sb2.append('\n');
        }
        String[] strArrSplit = sb2.toString().split(IOUtils.LINE_SEPARATOR_UNIX);
        if (strArrSplit.length == 0) {
            return "";
        }
        zzbei zzbeiVar = new zzbei();
        int i11 = this.zza;
        PriorityQueue priorityQueue = new PriorityQueue(i11, new zzbeh(this));
        for (String str : strArrSplit) {
            String[] strArrZzb = zzbek.zzb(str, false);
            if (strArrZzb.length != 0) {
                zzben.zza(strArrZzb, i11, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                zzbeiVar.zzb.write(this.zzb.zza(((zzbem) it.next()).zzb));
            } catch (IOException e10) {
                int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Error while writing hash to byteStream", e10);
            }
        }
        return zzbeiVar.toString();
    }
}
