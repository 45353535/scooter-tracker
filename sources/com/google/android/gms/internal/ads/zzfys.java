package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.unity3d.services.core.fid.Constants;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfys {
    @Nullable
    public static Object zza(String str, String str2, zzfyr... zzfyrVarArr) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        return Class.forName(str).getDeclaredMethod(Constants.GET_INSTANCE, null).invoke(null, null);
    }
}
