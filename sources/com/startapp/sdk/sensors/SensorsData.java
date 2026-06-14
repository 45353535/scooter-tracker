package com.startapp.sdk.sensors;

import androidx.annotation.Nullable;
import com.startapp.json.TypeInfo;
import com.startapp.sdk.adsbase.remoteconfig.ComponentInfoEventConfig;
import com.startapp.sdk.internal.vi;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class SensorsData implements Serializable {
    private static final long serialVersionUID = -4441352330701662536L;
    private int collectionPeriodInSeconds;
    private boolean detailsString;
    private boolean enable;
    private int samplesPerBatch;
    private int totalBatchAmount;
    private int totalDailyBatchAmount;
    private int samplingFrequencyInHertz = 10;

    @Nullable
    @TypeInfo(complex = true)
    private ComponentInfoEventConfig infoEvents = null;

    public final int a() {
        return this.collectionPeriodInSeconds;
    }

    public final ComponentInfoEventConfig b() {
        return this.infoEvents;
    }

    public final int c() {
        return this.samplesPerBatch;
    }

    public final int d() {
        int i10 = this.samplingFrequencyInHertz;
        if (i10 == 0) {
            return 10;
        }
        return i10;
    }

    public final int e() {
        return this.totalBatchAmount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && SensorsData.class == obj.getClass()) {
            SensorsData sensorsData = (SensorsData) obj;
            if (this.enable == sensorsData.enable && this.totalBatchAmount == sensorsData.totalBatchAmount && this.totalDailyBatchAmount == sensorsData.totalDailyBatchAmount && this.collectionPeriodInSeconds == sensorsData.collectionPeriodInSeconds && this.samplingFrequencyInHertz == sensorsData.samplingFrequencyInHertz && this.samplesPerBatch == sensorsData.samplesPerBatch && this.detailsString == sensorsData.detailsString && vi.a((Object) this.infoEvents, (Object) sensorsData.infoEvents)) {
                return true;
            }
        }
        return false;
    }

    public final int f() {
        return this.totalDailyBatchAmount;
    }

    public final boolean g() {
        return this.detailsString;
    }

    public final boolean h() {
        return this.enable;
    }

    public final int hashCode() {
        Object[] objArr = {Boolean.valueOf(this.enable), Integer.valueOf(this.totalBatchAmount), Integer.valueOf(this.totalDailyBatchAmount), Integer.valueOf(this.collectionPeriodInSeconds), Integer.valueOf(this.samplingFrequencyInHertz), Integer.valueOf(this.samplesPerBatch), Boolean.valueOf(this.detailsString), this.infoEvents};
        WeakHashMap weakHashMap = vi.f65408a;
        return Arrays.deepHashCode(objArr);
    }
}
