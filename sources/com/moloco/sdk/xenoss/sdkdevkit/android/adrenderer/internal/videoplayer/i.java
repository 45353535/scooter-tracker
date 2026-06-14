package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

import android.view.View;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes10.dex */
public abstract class i {
    public static final Flow b(t tVar, View view) {
        Flow flowA;
        return (view == null || (flowA = tVar.a(view)) == null) ? hg.i.D(Boolean.FALSE) : flowA;
    }
}
