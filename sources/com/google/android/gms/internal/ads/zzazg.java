package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes8.dex */
public final class zzazg extends zzazf {
    private zzazg(Context context, zzaze zzazeVar) {
        super(context, zzazeVar);
    }

    public static zzazg zzt(Context context, zzavi zzaviVar) {
        zzaze zzazeVar = new zzaze(zzaviVar);
        zzazf.zzo(context, zzazeVar);
        return new zzazg(context, zzazeVar);
    }
}
