package x8;

import com.explorestack.protobuf.adcom.NativeAssetPosition;
import io.bidmachine.PositionData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NativeAssetPosition.values().length];
            try {
                iArr[NativeAssetPosition.ASSET_POSITION_TOP_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NativeAssetPosition.ASSET_POSITION_TOP_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NativeAssetPosition.ASSET_POSITION_BOTTOM_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NativeAssetPosition.ASSET_POSITION_BOTTOM_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final PositionData a(NativeAssetPosition data) {
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            int i10 = a.$EnumSwitchMapping$0[data.ordinal()];
            if (i10 == 1) {
                return PositionData.TopLeft;
            }
            if (i10 == 2) {
                return PositionData.TopRight;
            }
            if (i10 == 3) {
                return PositionData.BottomLeft;
            }
            if (i10 != 4) {
                return null;
            }
            return PositionData.BottomRight;
        } catch (Throwable unused) {
            return null;
        }
    }
}
