package com.mobilefuse.sdk;

import com.mobilefuse.sdk.json.JSONObjectGetValueOrNullKt;
import com.my.target.common.menu.MenuActionType;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 !2\u00020\u0001:\u0001!B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010JD\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010¨\u0006\""}, d2 = {"Lcom/mobilefuse/sdk/CloseConfigResponse;", "", POBCTAOverlayData.KEY_CTA_POS, "Lcom/mobilefuse/sdk/PositionType;", "width", "", "height", "xOffset", "yOffset", "(Lcom/mobilefuse/sdk/PositionType;FFLjava/lang/Float;Ljava/lang/Float;)V", "getHeight", "()F", "getPos", "()Lcom/mobilefuse/sdk/PositionType;", "getWidth", "getXOffset", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getYOffset", "component1", "component2", "component3", "component4", "component5", MenuActionType.COPY, "(Lcom/mobilefuse/sdk/PositionType;FFLjava/lang/Float;Ljava/lang/Float;)Lcom/mobilefuse/sdk/CloseConfigResponse;", "equals", "", "other", "hashCode", "", "toString", "", com.taurusx.tax.f.y.f66058y, "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
public final /* data */ class CloseConfigResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final float height;

    @NotNull
    private final PositionType pos;
    private final float width;

    @Nullable
    private final Float xOffset;

    @Nullable
    private final Float yOffset;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n¨\u0006\u000b"}, d2 = {"Lcom/mobilefuse/sdk/CloseConfigResponse$Companion;", "", "()V", "getPosition", "Lcom/mobilefuse/sdk/PositionType;", "value", "", "parseResponse", "Lcom/mobilefuse/sdk/CloseConfigResponse;", "json", "Lorg/json/JSONObject;", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
    public static final class Companion {
        private Companion() {
        }

        private final PositionType getPosition(String value) {
            for (PositionType positionType : PositionType.values()) {
                if (StringsKt.N(positionType.name(), value, true)) {
                    return positionType;
                }
            }
            return null;
        }

        @Nullable
        public final CloseConfigResponse parseResponse(@Nullable JSONObject json) {
            if (json == null) {
                return null;
            }
            try {
                PositionType position = getPosition(JSONObjectGetValueOrNullKt.getStringOrNull(json, POBCTAOverlayData.KEY_CTA_POS));
                if (position == null) {
                    position = PositionType.tr;
                }
                PositionType positionType = position;
                Float floatOrNull = JSONObjectGetValueOrNullKt.getFloatOrNull(json, POBCoreNativeConstants.NATIVE_IMAGE_WIDTH);
                float fFloatValue = floatOrNull != null ? floatOrNull.floatValue() : 50.0f;
                Float floatOrNull2 = JSONObjectGetValueOrNullKt.getFloatOrNull(json, "h");
                return new CloseConfigResponse(positionType, fFloatValue, floatOrNull2 != null ? floatOrNull2.floatValue() : 50.0f, JSONObjectGetValueOrNullKt.getFloatOrNull(json, "offset_x"), JSONObjectGetValueOrNullKt.getFloatOrNull(json, "offset_y"));
            } catch (Throwable th2) {
                StabilityHelper.logException(this, th2);
                return null;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public CloseConfigResponse(@NotNull PositionType pos, float f10, float f11, @Nullable Float f12, @Nullable Float f13) {
        Intrinsics.checkNotNullParameter(pos, "pos");
        this.pos = pos;
        this.width = f10;
        this.height = f11;
        this.xOffset = f12;
        this.yOffset = f13;
    }

    public static /* synthetic */ CloseConfigResponse copy$default(CloseConfigResponse closeConfigResponse, PositionType positionType, float f10, float f11, Float f12, Float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            positionType = closeConfigResponse.pos;
        }
        if ((i10 & 2) != 0) {
            f10 = closeConfigResponse.width;
        }
        if ((i10 & 4) != 0) {
            f11 = closeConfigResponse.height;
        }
        if ((i10 & 8) != 0) {
            f12 = closeConfigResponse.xOffset;
        }
        if ((i10 & 16) != 0) {
            f13 = closeConfigResponse.yOffset;
        }
        Float f14 = f13;
        float f15 = f11;
        return closeConfigResponse.copy(positionType, f10, f15, f12, f14);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PositionType getPos() {
        return this.pos;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getHeight() {
        return this.height;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Float getXOffset() {
        return this.xOffset;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Float getYOffset() {
        return this.yOffset;
    }

    @NotNull
    public final CloseConfigResponse copy(@NotNull PositionType pos, float width, float height, @Nullable Float xOffset, @Nullable Float yOffset) {
        Intrinsics.checkNotNullParameter(pos, "pos");
        return new CloseConfigResponse(pos, width, height, xOffset, yOffset);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CloseConfigResponse)) {
            return false;
        }
        CloseConfigResponse closeConfigResponse = (CloseConfigResponse) other;
        return Intrinsics.areEqual(this.pos, closeConfigResponse.pos) && Float.compare(this.width, closeConfigResponse.width) == 0 && Float.compare(this.height, closeConfigResponse.height) == 0 && Intrinsics.areEqual((Object) this.xOffset, (Object) closeConfigResponse.xOffset) && Intrinsics.areEqual((Object) this.yOffset, (Object) closeConfigResponse.yOffset);
    }

    public final float getHeight() {
        return this.height;
    }

    @NotNull
    public final PositionType getPos() {
        return this.pos;
    }

    public final float getWidth() {
        return this.width;
    }

    @Nullable
    public final Float getXOffset() {
        return this.xOffset;
    }

    @Nullable
    public final Float getYOffset() {
        return this.yOffset;
    }

    public int hashCode() {
        PositionType positionType = this.pos;
        int iHashCode = (((((positionType != null ? positionType.hashCode() : 0) * 31) + Float.floatToIntBits(this.width)) * 31) + Float.floatToIntBits(this.height)) * 31;
        Float f10 = this.xOffset;
        int iHashCode2 = (iHashCode + (f10 != null ? f10.hashCode() : 0)) * 31;
        Float f11 = this.yOffset;
        return iHashCode2 + (f11 != null ? f11.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CloseConfigResponse(pos=" + this.pos + ", width=" + this.width + ", height=" + this.height + ", xOffset=" + this.xOffset + ", yOffset=" + this.yOffset + ")";
    }
}
