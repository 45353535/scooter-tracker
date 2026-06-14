package com.unity3d.ironsourceads.internal.services;

import android.content.Context;
import com.ironsource.EnumC4380j9;
import com.unity3d.ironsourceads.internal.services.a;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class d {
    public static /* synthetic */ a.AbstractC0843a a(a aVar, Context context, EnumC4380j9 enumC4380j9, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: destroy");
        }
        if ((i10 & 2) != 0) {
            enumC4380j9 = EnumC4380j9.APP_ACTIVITY;
        }
        return aVar.a(context, enumC4380j9);
    }
}
