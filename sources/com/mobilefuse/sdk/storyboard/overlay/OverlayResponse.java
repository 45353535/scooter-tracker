package com.mobilefuse.sdk.storyboard.overlay;

import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.json.JSONObjectGetValueOrNullKt;
import com.mobilefuse.sdk.network.model.AdmMediaType;
import com.my.target.common.menu.MenuActionType;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u000fJF\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lcom/mobilefuse/sdk/storyboard/overlay/OverlayResponse;", "", "type", "Lcom/mobilefuse/sdk/network/model/AdmMediaType;", "adm", "", POBCTAOverlayData.KEY_CTA_DISMISSIBLE, "", "showDelay", "", "dismissDelay", "(Lcom/mobilefuse/sdk/network/model/AdmMediaType;Ljava/lang/String;ZLjava/lang/Float;Ljava/lang/Float;)V", "getAdm", "()Ljava/lang/String;", "getDismissDelay", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getDismissible", "()Z", "getShowDelay", "getType", "()Lcom/mobilefuse/sdk/network/model/AdmMediaType;", "component1", "component2", "component3", "component4", "component5", MenuActionType.COPY, "(Lcom/mobilefuse/sdk/network/model/AdmMediaType;Ljava/lang/String;ZLjava/lang/Float;Ljava/lang/Float;)Lcom/mobilefuse/sdk/storyboard/overlay/OverlayResponse;", "equals", "other", "hashCode", "", "toString", y.f66058y, "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
public final /* data */ class OverlayResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String adm;

    @Nullable
    private final Float dismissDelay;
    private final boolean dismissible;

    @Nullable
    private final Float showDelay;

    @Nullable
    private final AdmMediaType type;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/mobilefuse/sdk/storyboard/overlay/OverlayResponse$Companion;", "", "()V", "getType", "Lcom/mobilefuse/sdk/network/model/AdmMediaType;", "value", "", "parseResponse", "Lcom/mobilefuse/sdk/storyboard/overlay/OverlayResponse;", "json", "Lorg/json/JSONObject;", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
    public static final class Companion {
        private Companion() {
        }

        @Nullable
        public final AdmMediaType getType(@Nullable String value) {
            if (value != null && Intrinsics.areEqual(value, "mraid")) {
                return AdmMediaType.BANNER;
            }
            return null;
        }

        @Nullable
        public final OverlayResponse parseResponse(@NotNull JSONObject json) {
            String string;
            Intrinsics.checkNotNullParameter(json, "json");
            try {
                String stringOrNull = JSONObjectGetValueOrNullKt.getStringOrNull(json, "adm");
                if (stringOrNull == null || (string = StringsKt.v1(stringOrNull).toString()) == null) {
                    return null;
                }
                return new OverlayResponse(OverlayResponse.INSTANCE.getType(JSONObjectGetValueOrNullKt.getStringOrNull(json, "type")), string, json.optBoolean(POBCTAOverlayData.KEY_CTA_DISMISSIBLE), JSONObjectGetValueOrNullKt.getFloatOrNull(json, "show_delay"), JSONObjectGetValueOrNullKt.getFloatOrNull(json, "dismiss_delay"));
            } catch (Throwable th2) {
                StabilityHelper.logException(this, th2);
                return null;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public OverlayResponse(@Nullable AdmMediaType admMediaType, @NotNull String adm, boolean z10, @Nullable Float f10, @Nullable Float f11) {
        Intrinsics.checkNotNullParameter(adm, "adm");
        this.type = admMediaType;
        this.adm = adm;
        this.dismissible = z10;
        this.showDelay = f10;
        this.dismissDelay = f11;
    }

    public static /* synthetic */ OverlayResponse copy$default(OverlayResponse overlayResponse, AdmMediaType admMediaType, String str, boolean z10, Float f10, Float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            admMediaType = overlayResponse.type;
        }
        if ((i10 & 2) != 0) {
            str = overlayResponse.adm;
        }
        if ((i10 & 4) != 0) {
            z10 = overlayResponse.dismissible;
        }
        if ((i10 & 8) != 0) {
            f10 = overlayResponse.showDelay;
        }
        if ((i10 & 16) != 0) {
            f11 = overlayResponse.dismissDelay;
        }
        Float f12 = f11;
        boolean z11 = z10;
        return overlayResponse.copy(admMediaType, str, z11, f10, f12);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AdmMediaType getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAdm() {
        return this.adm;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getDismissible() {
        return this.dismissible;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Float getShowDelay() {
        return this.showDelay;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Float getDismissDelay() {
        return this.dismissDelay;
    }

    @NotNull
    public final OverlayResponse copy(@Nullable AdmMediaType type, @NotNull String adm, boolean dismissible, @Nullable Float showDelay, @Nullable Float dismissDelay) {
        Intrinsics.checkNotNullParameter(adm, "adm");
        return new OverlayResponse(type, adm, dismissible, showDelay, dismissDelay);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OverlayResponse)) {
            return false;
        }
        OverlayResponse overlayResponse = (OverlayResponse) other;
        return Intrinsics.areEqual(this.type, overlayResponse.type) && Intrinsics.areEqual(this.adm, overlayResponse.adm) && this.dismissible == overlayResponse.dismissible && Intrinsics.areEqual((Object) this.showDelay, (Object) overlayResponse.showDelay) && Intrinsics.areEqual((Object) this.dismissDelay, (Object) overlayResponse.dismissDelay);
    }

    @NotNull
    public final String getAdm() {
        return this.adm;
    }

    @Nullable
    public final Float getDismissDelay() {
        return this.dismissDelay;
    }

    public final boolean getDismissible() {
        return this.dismissible;
    }

    @Nullable
    public final Float getShowDelay() {
        return this.showDelay;
    }

    @Nullable
    public final AdmMediaType getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    public int hashCode() {
        AdmMediaType admMediaType = this.type;
        int iHashCode = (admMediaType != null ? admMediaType.hashCode() : 0) * 31;
        String str = this.adm;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        boolean z10 = this.dismissible;
        ?? r22 = z10;
        if (z10) {
            r22 = 1;
        }
        int i10 = (iHashCode2 + r22) * 31;
        Float f10 = this.showDelay;
        int iHashCode3 = (i10 + (f10 != null ? f10.hashCode() : 0)) * 31;
        Float f11 = this.dismissDelay;
        return iHashCode3 + (f11 != null ? f11.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "OverlayResponse(type=" + this.type + ", adm=" + this.adm + ", dismissible=" + this.dismissible + ", showDelay=" + this.showDelay + ", dismissDelay=" + this.dismissDelay + ")";
    }

    public /* synthetic */ OverlayResponse(AdmMediaType admMediaType, String str, boolean z10, Float f10, Float f11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? AdmMediaType.BANNER : admMediaType, str, (i10 & 4) != 0 ? false : z10, f10, f11);
    }
}
