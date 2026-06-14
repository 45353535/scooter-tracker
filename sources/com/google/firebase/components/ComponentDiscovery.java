package com.google.firebase.components;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.inject.Provider;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class ComponentDiscovery<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f31778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RegistrarNameRetriever f31779b;

    private static class MetadataRegistrarNameRetriever implements RegistrarNameRetriever<Context> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class f31780a;

        private Bundle a(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) this.f31780a), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("ComponentDiscovery", this.f31780a + " has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }

        private MetadataRegistrarNameRetriever(Class cls) {
            this.f31780a = cls;
        }

        @Override // com.google.firebase.components.ComponentDiscovery.RegistrarNameRetriever
        public List<String> retrieve(Context context) {
            Bundle bundleA = a(context);
            if (bundleA == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            for (String str : bundleA.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundleA.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }
    }

    @VisibleForTesting
    interface RegistrarNameRetriever<T> {
        List<String> retrieve(T t10);
    }

    ComponentDiscovery(Object obj, RegistrarNameRetriever registrarNameRetriever) {
        this.f31778a = obj;
        this.f31779b = registrarNameRetriever;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ComponentRegistrar b(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
            }
            throw new InvalidRegistrarException(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str));
            return null;
        } catch (IllegalAccessException e10) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", str), e10);
        } catch (InstantiationException e11) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", str), e11);
        } catch (NoSuchMethodException e12) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", str), e12);
        } catch (InvocationTargetException e13) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", str), e13);
        }
    }

    public static ComponentDiscovery<Context> forContext(Context context, Class<? extends Service> cls) {
        return new ComponentDiscovery<>(context, new MetadataRegistrarNameRetriever(cls));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public List<ComponentRegistrar> discover() {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.f31779b.retrieve(this.f31778a).iterator();
        while (it.hasNext()) {
            try {
                ComponentRegistrar componentRegistrarB = b(it.next());
                if (componentRegistrarB != null) {
                    arrayList.add(componentRegistrarB);
                }
            } catch (InvalidRegistrarException e10) {
                Log.w("ComponentDiscovery", "Invalid component registrar.", e10);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public List<Provider<ComponentRegistrar>> discoverLazy() {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.f31779b.retrieve(this.f31778a)) {
            arrayList.add(new Provider() { // from class: com.google.firebase.components.g
                @Override // com.google.firebase.inject.Provider
                public final Object get() {
                    return ComponentDiscovery.b(str);
                }
            });
        }
        return arrayList;
    }
}
