package x8;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.explorestack.protobuf.adcom.Ad;
import com.explorestack.protobuf.adcom.NativeAssetPosition;
import io.bidmachine.LabelData;
import io.bidmachine.PositionData;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import pd.g0;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f108154a;

    public a(b positionDataMapper) {
        Intrinsics.checkNotNullParameter(positionDataMapper, "positionDataMapper");
        this.f108154a = positionDataMapper;
    }

    public final LabelData a(Ad.Display.Native.Asset.LabelAsset data) {
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            b bVar = this.f108154a;
            NativeAssetPosition pos = data.getPos();
            Intrinsics.checkNotNullExpressionValue(pos, "data.pos");
            PositionData positionDataA = bVar.a(pos);
            if (positionDataA == null) {
                return null;
            }
            String content = data.getContent();
            Intrinsics.checkNotNullExpressionValue(content, "data.content");
            byte[] bytes = content.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            byte[] bArrH = g0.h(bytes, 0, 1, null);
            if (bArrH == null) {
                return null;
            }
            Bitmap image = BitmapFactory.decodeByteArray(bArrH, 0, bArrH.length);
            float w10 = data.getW();
            float h10 = data.getH();
            Intrinsics.checkNotNullExpressionValue(image, "image");
            return new LabelData(w10, h10, image, positionDataA);
        } catch (Throwable unused) {
            return null;
        }
    }
}
