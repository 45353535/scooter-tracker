package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.util.BiConsumer;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigValue;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONException;

/* JADX INFO: loaded from: classes9.dex */
public class ConfigGetParameterHandler {

    @VisibleForTesting(otherwise = 3)
    public static final Charset FRC_BYTE_ARRAY_ENCODING = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final Pattern f33060e = Pattern.compile("^(1|true|t|yes|y|on)$", 2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final Pattern f33061f = Pattern.compile("^(0|false|f|no|n|off|)$", 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f33062a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f33063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ConfigCacheClient f33064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ConfigCacheClient f33065d;

    public ConfigGetParameterHandler(Executor executor, ConfigCacheClient configCacheClient, ConfigCacheClient configCacheClient2) {
        this.f33063b = executor;
        this.f33064c = configCacheClient;
        this.f33065d = configCacheClient2;
    }

    private void b(final String str, final ConfigContainer configContainer) {
        if (configContainer == null) {
            return;
        }
        synchronized (this.f33062a) {
            try {
                for (final BiConsumer biConsumer : this.f33062a) {
                    this.f33063b.execute(new Runnable() { // from class: com.google.firebase.remoteconfig.internal.j
                        @Override // java.lang.Runnable
                        public final void run() {
                            biConsumer.accept(str, configContainer);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static ConfigContainer c(ConfigCacheClient configCacheClient) {
        return configCacheClient.getBlocking();
    }

    private static Double d(ConfigCacheClient configCacheClient, String str) {
        ConfigContainer configContainerC = c(configCacheClient);
        if (configContainerC == null) {
            return null;
        }
        try {
            return Double.valueOf(configContainerC.getConfigs().getDouble(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    private static Set e(ConfigCacheClient configCacheClient) {
        HashSet hashSet = new HashSet();
        ConfigContainer configContainerC = c(configCacheClient);
        if (configContainerC != null) {
            Iterator<String> itKeys = configContainerC.getConfigs().keys();
            while (itKeys.hasNext()) {
                hashSet.add(itKeys.next());
            }
        }
        return hashSet;
    }

    private static TreeSet f(String str, ConfigContainer configContainer) {
        TreeSet treeSet = new TreeSet();
        Iterator<String> itKeys = configContainer.getConfigs().keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (next.startsWith(str)) {
                treeSet.add(next);
            }
        }
        return treeSet;
    }

    private static Long g(ConfigCacheClient configCacheClient, String str) {
        ConfigContainer configContainerC = c(configCacheClient);
        if (configContainerC == null) {
            return null;
        }
        try {
            return Long.valueOf(configContainerC.getConfigs().getLong(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    private static String h(ConfigCacheClient configCacheClient, String str) {
        ConfigContainer configContainerC = c(configCacheClient);
        if (configContainerC == null) {
            return null;
        }
        try {
            return configContainerC.getConfigs().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    private static void i(String str, String str2) {
        Log.w(FirebaseRemoteConfig.TAG, String.format("No value of type '%s' exists for parameter key '%s'.", str2, str));
    }

    public void addListener(BiConsumer<String, ConfigContainer> biConsumer) {
        synchronized (this.f33062a) {
            this.f33062a.add(biConsumer);
        }
    }

    public Map<String, FirebaseRemoteConfigValue> getAll() {
        HashSet<String> hashSet = new HashSet();
        hashSet.addAll(e(this.f33064c));
        hashSet.addAll(e(this.f33065d));
        HashMap map = new HashMap();
        for (String str : hashSet) {
            map.put(str, getValue(str));
        }
        return map;
    }

    public boolean getBoolean(String str) {
        String strH = h(this.f33064c, str);
        if (strH != null) {
            if (f33060e.matcher(strH).matches()) {
                b(str, c(this.f33064c));
                return true;
            }
            if (f33061f.matcher(strH).matches()) {
                b(str, c(this.f33064c));
                return false;
            }
        }
        String strH2 = h(this.f33065d, str);
        if (strH2 != null) {
            if (f33060e.matcher(strH2).matches()) {
                return true;
            }
            if (f33061f.matcher(strH2).matches()) {
                return false;
            }
        }
        i(str, "Boolean");
        return false;
    }

    public byte[] getByteArray(String str) {
        String strH = h(this.f33064c, str);
        if (strH != null) {
            b(str, c(this.f33064c));
            return strH.getBytes(FRC_BYTE_ARRAY_ENCODING);
        }
        String strH2 = h(this.f33065d, str);
        if (strH2 != null) {
            return strH2.getBytes(FRC_BYTE_ARRAY_ENCODING);
        }
        i(str, "ByteArray");
        return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_BYTE_ARRAY;
    }

    public double getDouble(String str) {
        Double d10 = d(this.f33064c, str);
        if (d10 != null) {
            b(str, c(this.f33064c));
            return d10.doubleValue();
        }
        Double d11 = d(this.f33065d, str);
        if (d11 != null) {
            return d11.doubleValue();
        }
        i(str, "Double");
        return 0.0d;
    }

    public Set<String> getKeysByPrefix(String str) {
        if (str == null) {
            str = "";
        }
        TreeSet treeSet = new TreeSet();
        ConfigContainer configContainerC = c(this.f33064c);
        if (configContainerC != null) {
            treeSet.addAll(f(str, configContainerC));
        }
        ConfigContainer configContainerC2 = c(this.f33065d);
        if (configContainerC2 != null) {
            treeSet.addAll(f(str, configContainerC2));
        }
        return treeSet;
    }

    public long getLong(String str) {
        Long lG = g(this.f33064c, str);
        if (lG != null) {
            b(str, c(this.f33064c));
            return lG.longValue();
        }
        Long lG2 = g(this.f33065d, str);
        if (lG2 != null) {
            return lG2.longValue();
        }
        i(str, "Long");
        return 0L;
    }

    public String getString(String str) {
        String strH = h(this.f33064c, str);
        if (strH != null) {
            b(str, c(this.f33064c));
            return strH;
        }
        String strH2 = h(this.f33065d, str);
        if (strH2 != null) {
            return strH2;
        }
        i(str, "String");
        return "";
    }

    public FirebaseRemoteConfigValue getValue(String str) {
        String strH = h(this.f33064c, str);
        if (strH != null) {
            b(str, c(this.f33064c));
            return new FirebaseRemoteConfigValueImpl(strH, 2);
        }
        String strH2 = h(this.f33065d, str);
        if (strH2 != null) {
            return new FirebaseRemoteConfigValueImpl(strH2, 1);
        }
        i(str, "FirebaseRemoteConfigValue");
        return new FirebaseRemoteConfigValueImpl("", 0);
    }
}
