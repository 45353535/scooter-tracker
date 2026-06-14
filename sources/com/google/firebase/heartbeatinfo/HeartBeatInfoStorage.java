package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.os.Build;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import com.google.android.gms.measurement.internal.j;
import com.google.firebase.datastorage.JavaDataStorage;
import com.google.firebase.datastorage.JavaDataStorageKt;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import j$.util.DateRetargetClass;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
class HeartBeatInfoStorage {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Preferences.Key f32814b = PreferencesKeys.longKey("fire-global");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Preferences.Key f32815c = PreferencesKeys.longKey("fire-count");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Preferences.Key f32816d = PreferencesKeys.stringKey("last-used-date");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JavaDataStorage f32817a;

    public HeartBeatInfoStorage(Context context, String str) {
        this.f32817a = new JavaDataStorage(context, "FirebaseHeartBeat" + str);
    }

    public static /* synthetic */ Unit a(long j10, MutablePreferences mutablePreferences) {
        mutablePreferences.set(f32814b, Long.valueOf(j10));
        return null;
    }

    public static /* synthetic */ Unit b(HeartBeatInfoStorage heartBeatInfoStorage, String str, String str2, Preferences.Key key, MutablePreferences mutablePreferences) {
        heartBeatInfoStorage.getClass();
        Preferences.Key key2 = f32816d;
        if (((String) JavaDataStorageKt.getOrDefault(mutablePreferences, key2, "")).equals(str)) {
            Preferences.Key keyI = heartBeatInfoStorage.i(mutablePreferences, str);
            if (keyI == null || keyI.getName().equals(str2)) {
                return null;
            }
            heartBeatInfoStorage.q(mutablePreferences, key, str);
            return null;
        }
        Preferences.Key key3 = f32815c;
        long jLongValue = ((Long) JavaDataStorageKt.getOrDefault(mutablePreferences, key3, 0L)).longValue();
        if (jLongValue + 1 == 30) {
            jLongValue = heartBeatInfoStorage.e(mutablePreferences);
        }
        HashSet hashSet = new HashSet((Collection) JavaDataStorageKt.getOrDefault(mutablePreferences, key, new HashSet()));
        hashSet.add(str);
        mutablePreferences.set(key, hashSet);
        mutablePreferences.set(key3, Long.valueOf(jLongValue + 1));
        mutablePreferences.set(key2, str);
        return null;
    }

    public static /* synthetic */ Unit c(HeartBeatInfoStorage heartBeatInfoStorage, MutablePreferences mutablePreferences) {
        heartBeatInfoStorage.getClass();
        long j10 = 0;
        for (Map.Entry<Preferences.Key<?>, Object> entry : mutablePreferences.asMap().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Preferences.Key<?> key = entry.getKey();
                Set set = (Set) entry.getValue();
                String strH = heartBeatInfoStorage.h(System.currentTimeMillis());
                if (set.contains(strH)) {
                    mutablePreferences.set(key, j.a(new Object[]{strH}));
                    j10++;
                } else {
                    mutablePreferences.remove(key);
                }
            }
        }
        if (j10 == 0) {
            mutablePreferences.remove(f32815c);
            return null;
        }
        mutablePreferences.set(f32815c, Long.valueOf(j10));
        return null;
    }

    public static /* synthetic */ Unit d(HeartBeatInfoStorage heartBeatInfoStorage, String str, MutablePreferences mutablePreferences) {
        heartBeatInfoStorage.getClass();
        mutablePreferences.set(f32816d, str);
        heartBeatInfoStorage.l(mutablePreferences, str);
        return null;
    }

    private synchronized long e(MutablePreferences mutablePreferences) {
        long j10;
        try {
            long jLongValue = ((Long) JavaDataStorageKt.getOrDefault(mutablePreferences, f32815c, 0L)).longValue();
            String name = "";
            Set hashSet = new HashSet();
            String str = null;
            for (Map.Entry<Preferences.Key<?>, Object> entry : mutablePreferences.asMap().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set<String> set = (Set) entry.getValue();
                    for (String str2 : set) {
                        if (str == null || str.compareTo(str2) > 0) {
                            name = entry.getKey().getName();
                            hashSet = set;
                            str = str2;
                        }
                    }
                }
            }
            HashSet hashSet2 = new HashSet(hashSet);
            hashSet2.remove(str);
            mutablePreferences.set(PreferencesKeys.stringSetKey(name), hashSet2);
            j10 = jLongValue - 1;
            mutablePreferences.set(f32815c, Long.valueOf(j10));
        } catch (Throwable th2) {
            throw th2;
        }
        return j10;
    }

    private synchronized String h(long j10) {
        if (Build.VERSION.SDK_INT >= 26) {
            return DateRetargetClass.toInstant(new Date(j10)).atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j10));
    }

    private synchronized Preferences.Key i(MutablePreferences mutablePreferences, String str) {
        for (Map.Entry<Preferences.Key<?>, Object> entry : mutablePreferences.asMap().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return PreferencesKeys.stringSetKey(entry.getKey().getName());
                    }
                }
            }
        }
        return null;
    }

    private synchronized void l(MutablePreferences mutablePreferences, String str) {
        try {
            Preferences.Key keyI = i(mutablePreferences, str);
            if (keyI == null) {
                return;
            }
            HashSet hashSet = new HashSet((Collection) JavaDataStorageKt.getOrDefault(mutablePreferences, keyI, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                mutablePreferences.remove(keyI);
            } else {
                mutablePreferences.set(keyI, hashSet);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private synchronized void q(MutablePreferences mutablePreferences, Preferences.Key key, String str) {
        l(mutablePreferences, str);
        HashSet hashSet = new HashSet((Collection) JavaDataStorageKt.getOrDefault(mutablePreferences, key, new HashSet()));
        hashSet.add(str);
        mutablePreferences.set(key, hashSet);
    }

    synchronized void f() {
        this.f32817a.editSync(new Function1() { // from class: com.google.firebase.heartbeatinfo.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HeartBeatInfoStorage.c(this.f32829b, (MutablePreferences) obj);
            }
        });
    }

    synchronized List g() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            String strH = h(System.currentTimeMillis());
            for (Map.Entry<Preferences.Key<?>, Object> entry : this.f32817a.getAllSync().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(strH);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(HeartBeatResult.create(entry.getKey().getName(), new ArrayList(hashSet)));
                    }
                }
            }
            p(System.currentTimeMillis());
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    synchronized boolean j(long j10, long j11) {
        return h(j10).equals(h(j11));
    }

    synchronized void k() {
        final String strH = h(System.currentTimeMillis());
        this.f32817a.editSync(new Function1() { // from class: com.google.firebase.heartbeatinfo.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HeartBeatInfoStorage.d(this.f32823b, strH, (MutablePreferences) obj);
            }
        });
    }

    synchronized boolean m(long j10) {
        return n(f32814b, j10);
    }

    synchronized boolean n(Preferences.Key key, long j10) {
        if (j(((Long) this.f32817a.getSync(key, -1L)).longValue(), j10)) {
            return false;
        }
        this.f32817a.putSync(key, Long.valueOf(j10));
        return true;
    }

    synchronized void o(long j10, final String str) {
        final String strH = h(j10);
        final Preferences.Key<Set<String>> keyStringSetKey = PreferencesKeys.stringSetKey(str);
        this.f32817a.editSync(new Function1() { // from class: com.google.firebase.heartbeatinfo.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HeartBeatInfoStorage.b(this.f32825b, strH, str, keyStringSetKey, (MutablePreferences) obj);
            }
        });
    }

    synchronized void p(final long j10) {
        this.f32817a.editSync(new Function1() { // from class: com.google.firebase.heartbeatinfo.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HeartBeatInfoStorage.a(j10, (MutablePreferences) obj);
            }
        });
    }
}
