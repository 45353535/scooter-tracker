package x8;

import com.explorestack.protobuf.adcom.Ad;
import id.z0;
import io.bidmachine.LabelData;
import io.bidmachine.PrivacySheetData;
import jd.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f108155a;

    public c(a labelDataMapper) {
        Intrinsics.checkNotNullParameter(labelDataMapper, "labelDataMapper");
        this.f108155a = labelDataMapper;
    }

    public final PrivacySheetData a(Ad.Display.Native.Asset data) {
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            String value = data.getData().getValue();
            Intrinsics.checkNotNullExpressionValue(value, "data.data.value");
            z0 z0VarC = d.c(value);
            if (z0VarC == null) {
                return null;
            }
            a aVar = this.f108155a;
            Ad.Display.Native.Asset.LabelAsset label = data.getLabel();
            Intrinsics.checkNotNullExpressionValue(label, "data.label");
            LabelData labelDataA = aVar.a(label);
            if (labelDataA == null) {
                return null;
            }
            return new PrivacySheetData(labelDataA, z0VarC);
        } catch (Throwable unused) {
            return null;
        }
    }
}
