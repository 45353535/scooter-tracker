package com.google.android.gms.maps.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public final class zzcc {
    private static final String zza = "zzcc";

    @Nullable
    @SuppressLint({"StaticFieldLeak"})
    private static Context zzb;
    private static zzf zzc;

    public static zzf zza(Context context, @Nullable MapsInitializer.Renderer renderer) throws GooglePlayServicesNotAvailableException {
        Preconditions.checkNotNull(context);
        String str = zza;
        Log.d(str, "preferredRenderer: ".concat(String.valueOf(renderer)));
        zzf zzfVar = zzc;
        if (zzfVar != null) {
            return zzfVar;
        }
        int iIsGooglePlayServicesAvailable = GooglePlayServicesUtil.isGooglePlayServicesAvailable(context, 13400000);
        if (iIsGooglePlayServicesAvailable != 0) {
            throw new GooglePlayServicesNotAvailableException(iIsGooglePlayServicesAvailable);
        }
        zzf zzfVarZzd = zzd(context, renderer);
        zzc = zzfVarZzd;
        try {
            int iZzd = zzfVarZzd.zzd();
            String packageName = context.getPackageName();
            if (iZzd != 2 || packageName.equals("com.google.android.apps.photos")) {
                Log.d(str, "not early loading native code");
            } else {
                Log.d(str, "early loading native code");
                try {
                    zzc.zzn(ObjectWrapper.wrap(zzc(context, renderer)));
                } catch (RemoteException e10) {
                    throw new RuntimeRemoteException(e10);
                } catch (UnsatisfiedLinkError unused) {
                    Log.w(zza, "Caught UnsatisfiedLinkError attempting to load the LATEST renderer's native library. Attempting to use the LEGACY renderer instead.");
                    zzb = null;
                    zzc = zzd(context, MapsInitializer.Renderer.LEGACY);
                }
            }
            try {
                zzf zzfVar2 = zzc;
                Context contextZzc = zzc(context, renderer);
                Objects.requireNonNull(contextZzc);
                zzfVar2.zzl(ObjectWrapper.wrap(contextZzc.getResources()), 19020000);
                return zzc;
            } catch (RemoteException e11) {
                throw new RuntimeRemoteException(e11);
            }
        } catch (RemoteException e12) {
            throw new RuntimeRemoteException(e12);
        }
    }

    private static Context zzb(Exception exc, Context context) {
        Log.e(zza, "Failed to load maps module, use pre-Chimera", exc);
        return GooglePlayServicesUtil.getRemoteContext(context);
    }

    private static Context zzc(Context context, @Nullable MapsInitializer.Renderer renderer) {
        Context contextZzb;
        Context context2 = zzb;
        if (context2 != null) {
            return context2;
        }
        String str = renderer == MapsInitializer.Renderer.LEGACY ? "com.google.android.gms.maps_legacy_dynamite" : "com.google.android.gms.maps_core_dynamite";
        try {
            contextZzb = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, str).getModuleContext();
        } catch (Exception e10) {
            if (str.equals("com.google.android.gms.maps_dynamite")) {
                contextZzb = zzb(e10, context);
            } else {
                try {
                    Log.d(zza, "Attempting to load maps_dynamite again.");
                    contextZzb = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, "com.google.android.gms.maps_dynamite").getModuleContext();
                } catch (Exception e11) {
                    contextZzb = zzb(e11, context);
                }
            }
        }
        zzb = contextZzb;
        if (contextZzb != null) {
            return contextZzb;
        }
        throw new RuntimeException("Unable to load maps module, maps container context is null");
    }

    private static zzf zzd(Context context, @Nullable MapsInitializer.Renderer renderer) {
        Log.i(zza, "Making Creator dynamically");
        try {
            IBinder iBinder = (IBinder) zze(((ClassLoader) Preconditions.checkNotNull(zzc(context, renderer).getClassLoader())).loadClass("com.google.android.gms.maps.internal.CreatorImpl"));
            if (iBinder == null) {
                throw new RuntimeException("Unable to load maps module, IBinder for com.google.android.gms.maps.internal.CreatorImpl is null");
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
            return iInterfaceQueryLocalInterface instanceof zzf ? (zzf) iInterfaceQueryLocalInterface : new zze(iBinder);
        } catch (ClassNotFoundException e10) {
            throw new IllegalStateException("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl", e10);
        }
    }

    private static Object zze(Class cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException("Unable to call the default constructor of ".concat(cls.getName()), e10);
        } catch (InstantiationException e11) {
            throw new IllegalStateException("Unable to instantiate the dynamic class ".concat(cls.getName()), e11);
        }
    }
}
