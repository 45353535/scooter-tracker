package com.google.android.datatransport.runtime.backends;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
class MetadataBackendRegistry implements BackendRegistry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BackendFactoryProvider f24397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CreationContextFactory f24398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f24399c;

    static class BackendFactoryProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f24400a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map f24401b = null;

        BackendFactoryProvider(Context context) {
            this.f24400a = context;
        }

        private Map a(Context context) {
            Bundle bundleD = d(context);
            if (bundleD == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.EMPTY_MAP;
            }
            HashMap map = new HashMap();
            for (String str : bundleD.keySet()) {
                Object obj = bundleD.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String str2 : ((String) obj).split(StringUtils.COMMA, -1)) {
                        String strTrim = str2.trim();
                        if (!strTrim.isEmpty()) {
                            map.put(strTrim, str.substring(8));
                        }
                    }
                }
            }
            return map;
        }

        private Map c() {
            if (this.f24401b == null) {
                this.f24401b = a(this.f24400a);
            }
            return this.f24401b;
        }

        private static Bundle d(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
                return null;
            }
        }

        BackendFactory b(String str) {
            String str2 = (String) c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (BackendFactory) Class.forName(str2).asSubclass(BackendFactory.class).getDeclaredConstructor(null).newInstance(null);
            } catch (ClassNotFoundException e10) {
                Log.w("BackendRegistry", String.format("Class %s is not found.", str2), e10);
                return null;
            } catch (IllegalAccessException e11) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e11);
                return null;
            } catch (InstantiationException e12) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e12);
                return null;
            } catch (NoSuchMethodException e13) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e13);
                return null;
            } catch (InvocationTargetException e14) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e14);
                return null;
            }
        }
    }

    MetadataBackendRegistry(Context context, CreationContextFactory creationContextFactory) {
        this(new BackendFactoryProvider(context), creationContextFactory);
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendRegistry
    @Nullable
    public synchronized TransportBackend get(String str) {
        if (this.f24399c.containsKey(str)) {
            return (TransportBackend) this.f24399c.get(str);
        }
        BackendFactory backendFactoryB = this.f24397a.b(str);
        if (backendFactoryB == null) {
            return null;
        }
        TransportBackend transportBackendCreate = backendFactoryB.create(this.f24398b.a(str));
        this.f24399c.put(str, transportBackendCreate);
        return transportBackendCreate;
    }

    MetadataBackendRegistry(BackendFactoryProvider backendFactoryProvider, CreationContextFactory creationContextFactory) {
        this.f24399c = new HashMap();
        this.f24397a = backendFactoryProvider;
        this.f24398b = creationContextFactory;
    }
}
