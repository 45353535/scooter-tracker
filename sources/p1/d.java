package p1;

import com.adjust.sdk.network.ErrorCodes;
import io.bidmachine.protobuf.EventTypeExtended;

/* JADX INFO: loaded from: classes6.dex */
public enum d {
    ENCRYPTION_EXCEPTION(ErrorCodes.THROWABLE),
    RAW_ONE_DT_ERROR(EventTypeExtended.EVENT_TYPE_CLICK_BY_SOURCE_VALUE),
    ONE_DT_PARSE_ERROR(1102),
    ONE_DT_AUTHENTICATION_ERROR(1103),
    ONE_DT_BROADCAST_ERROR(1104),
    ONE_DT_REQUEST_ERROR(1105),
    ONE_DT_GENERAL_ERROR(1106);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f98060b;

    d(int i10) {
        this.f98060b = i10;
    }

    public final int d() {
        return this.f98060b;
    }
}
