package com.ironsource.sdk;

import android.app.Activity;
import android.content.Context;
import com.ironsource.P9;
import com.ironsource.Zd;

/* JADX INFO: loaded from: classes10.dex */
@Deprecated
public class SSAFactory {
    public static Zd getPublisherInstance(Activity activity) throws Exception {
        return P9.b((Context) activity);
    }

    public static Zd getPublisherTestInstance(Activity activity, int i10) throws Exception {
        return P9.a(activity, i10);
    }
}
