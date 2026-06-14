package lb;

import android.os.Bundle;
import android.os.Parcel;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.google.common.base.Function;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
public final class b {
    public e a(long j10, byte[] bArr, int i10, int i11) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, i10, i11);
        parcelObtain.setDataPosition(0);
        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
        parcelObtain.recycle();
        return new e(q9.g.a(new Function() { // from class: lb.a
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                return p9.a.b((Bundle) obj);
            }
        }, (ArrayList) q9.a.e(bundle.getParcelableArrayList(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM))), j10, bundle.getLong("d"));
    }
}
