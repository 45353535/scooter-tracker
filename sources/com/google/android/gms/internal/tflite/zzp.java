package com.google.android.gms.internal.tflite;

import android.content.ContentResolver;
import android.database.ContentObserver;
import androidx.annotation.GuardedBy;
import androidx.collection.ArrayMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class zzp {

    @GuardedBy("ConfigurationContentLoader.class")
    private static final Map zza = new ArrayMap();
    private final ContentResolver zzb;
    private final ContentObserver zzc;

    static synchronized void zza() {
        Map map = zza;
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            ContentResolver contentResolver = ((zzp) it.next()).zzb;
            throw null;
        }
        map.clear();
    }
}
