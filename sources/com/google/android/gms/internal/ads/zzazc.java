package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public interface zzazc {
    void zzd(@Nullable MotionEvent motionEvent);

    @Deprecated
    void zze(int i10, int i11, int i12);

    String zzf(Context context, @Nullable String str, @Nullable View view, @Nullable Activity activity);

    String zzg(Context context, @Nullable String str, @Nullable View view);

    void zzh(@Nullable View view);

    void zzi(StackTraceElement[] stackTraceElementArr);

    String zzj(Context context, @Nullable View view, @Nullable Activity activity);

    String zzk(Context context);

    String zzl(Context context);
}
