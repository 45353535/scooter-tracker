package androidx.media3.extractor.text;

import android.os.Bundle;
import android.os.Parcel;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.BundleCollectionUtil;
import androidx.media3.common.util.UnstableApi;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.google.common.base.Function;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@UnstableApi
public final class CueEncoder {
    public byte[] encode(List<Cue> list, long j10) {
        ArrayList<Bundle> bundleArrayList = BundleCollectionUtil.toBundleArrayList(list, new Function() { // from class: androidx.media3.extractor.text.a
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                return ((Cue) obj).toSerializableBundle();
            }
        });
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, bundleArrayList);
        bundle.putLong("d", j10);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }
}
