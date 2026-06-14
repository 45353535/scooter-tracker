package lb;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.google.common.base.Function;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class d {
    public byte[] a(List list, long j10) {
        ArrayList<? extends Parcelable> arrayListB = q9.g.b(list, new Function() { // from class: lb.c
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                return ((p9.a) obj).d();
            }
        });
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, arrayListB);
        bundle.putLong("d", j10);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }
}
