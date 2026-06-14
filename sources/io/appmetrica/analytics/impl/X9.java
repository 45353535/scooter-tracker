package io.appmetrica.analytics.impl;

import android.content.pm.FeatureInfo;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes12.dex */
public abstract class X9 {
    public final Y9 a(@NonNull FeatureInfo featureInfo) {
        if (featureInfo.name != null) {
            return b(featureInfo);
        }
        int i10 = featureInfo.reqGlEsVersion;
        if (i10 == 0) {
            return b(featureInfo);
        }
        return new Y9("openGlFeature", i10, (featureInfo.flags & 1) != 0);
    }

    public abstract Y9 b(FeatureInfo featureInfo);
}
