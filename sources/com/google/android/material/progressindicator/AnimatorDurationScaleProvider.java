package com.google.android.material.progressindicator;

import android.content.ContentResolver;
import android.provider.Settings;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class AnimatorDurationScaleProvider {
    public float getSystemAnimatorDurationScale(@NonNull ContentResolver contentResolver) {
        return Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
    }
}
