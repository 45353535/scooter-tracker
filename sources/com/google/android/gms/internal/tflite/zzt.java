package com.google.android.gms.internal.tflite;

import android.content.SharedPreferences;
import androidx.annotation.GuardedBy;
import androidx.collection.ArrayMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class zzt {

    @GuardedBy("SharedPreferencesLoader.class")
    private static final Map zza = new ArrayMap();
    private final SharedPreferences zzb;
    private final SharedPreferences.OnSharedPreferenceChangeListener zzc;

    static synchronized void zza() {
        Map map = zza;
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            SharedPreferences sharedPreferences = ((zzt) it.next()).zzb;
            throw null;
        }
        map.clear();
    }
}
