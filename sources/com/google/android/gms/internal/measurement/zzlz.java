package com.google.android.gms.internal.measurement;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzlz {
    static zzlr zzb(Class cls) {
        String str;
        ClassLoader classLoader = zzlz.class.getClassLoader();
        if (cls.equals(zzlr.class)) {
            str = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else {
            if (!cls.getPackage().equals(zzlz.class.getPackage())) {
                throw new IllegalArgumentException(cls.getName());
            }
            str = String.format("%s.BlazeGenerated%sLoader", cls.getPackage().getName(), cls.getSimpleName());
        }
        try {
            try {
                try {
                    return (zzlr) cls.cast(((zzlz) Class.forName(str, true, classLoader).getConstructor(null).newInstance(null)).zza());
                } catch (InstantiationException e10) {
                    throw new IllegalStateException(e10);
                } catch (NoSuchMethodException e11) {
                    throw new IllegalStateException(e11);
                }
            } catch (IllegalAccessException e12) {
                throw new IllegalStateException(e12);
            } catch (InvocationTargetException e13) {
                throw new IllegalStateException(e13);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(zzlz.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add((zzlr) cls.cast(((zzlz) it.next()).zza()));
                } catch (ServiceConfigurationError e14) {
                    Logger.getLogger(zzlm.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(cls.getSimpleName()), (Throwable) e14);
                }
            }
            if (arrayList.size() == 1) {
                return (zzlr) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (zzlr) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e15) {
                throw new IllegalStateException(e15);
            } catch (NoSuchMethodException e16) {
                throw new IllegalStateException(e16);
            } catch (InvocationTargetException e17) {
                throw new IllegalStateException(e17);
            }
        }
    }

    protected abstract zzlr zza();
}
