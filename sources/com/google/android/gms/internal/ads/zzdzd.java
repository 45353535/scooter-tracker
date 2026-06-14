package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import j$.util.Objects;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzdzd {
    public final long zza;
    public final int[] zzb;

    private zzdzd(long j10, int[] iArr) {
        this.zza = j10;
        this.zzb = iArr;
    }

    public static zzguf zza(JsonReader jsonReader) throws IOException {
        int i10 = zzguf.zzd;
        zzguc zzgucVar = new zzguc();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            zzguf zzgufVarZzi = zzguf.zzi();
            jsonReader.beginObject();
            zzdzd zzdzdVar = null;
            Long lValueOf = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (Objects.equals(strNextName, "id")) {
                    lValueOf = Long.valueOf(jsonReader.nextLong());
                } else if (Objects.equals(strNextName, "event_types")) {
                    zzguc zzgucVar2 = new zzguc();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        zzgucVar2.zzf(Integer.valueOf(jsonReader.nextInt()));
                    }
                    jsonReader.endArray();
                    zzgufVarZzi = zzgucVar2.zzi();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            if (lValueOf != null && !zzgufVarZzi.isEmpty()) {
                long jLongValue = lValueOf.longValue();
                int[] iArr = new int[zzgufVarZzi.size()];
                for (int i11 = 0; i11 < zzgufVarZzi.size(); i11++) {
                    iArr[i11] = ((Integer) zzgufVarZzi.get(i11)).intValue();
                }
                zzdzdVar = new zzdzd(jLongValue, iArr);
            }
            if (zzdzdVar != null) {
                zzgucVar.zzf(zzdzdVar);
            }
        }
        jsonReader.endArray();
        return zzgucVar.zzi();
    }
}
