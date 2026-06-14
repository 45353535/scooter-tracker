package io.bidmachine;

import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, d2 = {"Lio/bidmachine/PrivacySheetData;", "", "Lio/bidmachine/LabelData;", "labelData", "Lid/z0;", "privacySheetParams", "<init>", "(Lio/bidmachine/LabelData;Lid/z0;)V", "component1", "()Lio/bidmachine/LabelData;", "component2", "()Lid/z0;", MenuActionType.COPY, "(Lio/bidmachine/LabelData;Lid/z0;)Lio/bidmachine/PrivacySheetData;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lio/bidmachine/LabelData;", "getLabelData", "Lid/z0;", "getPrivacySheetParams", "bidmachine-android-sdk_bh_3_5_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class PrivacySheetData {

    @NotNull
    private final LabelData labelData;

    @NotNull
    private final id.z0 privacySheetParams;

    public PrivacySheetData(@NotNull LabelData labelData, @NotNull id.z0 privacySheetParams) {
        Intrinsics.checkNotNullParameter(labelData, "labelData");
        Intrinsics.checkNotNullParameter(privacySheetParams, "privacySheetParams");
        this.labelData = labelData;
        this.privacySheetParams = privacySheetParams;
    }

    public static /* synthetic */ PrivacySheetData copy$default(PrivacySheetData privacySheetData, LabelData labelData, id.z0 z0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            labelData = privacySheetData.labelData;
        }
        if ((i10 & 2) != 0) {
            z0Var = privacySheetData.privacySheetParams;
        }
        return privacySheetData.copy(labelData, z0Var);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final LabelData getLabelData() {
        return this.labelData;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final id.z0 getPrivacySheetParams() {
        return this.privacySheetParams;
    }

    @NotNull
    public final PrivacySheetData copy(@NotNull LabelData labelData, @NotNull id.z0 privacySheetParams) {
        Intrinsics.checkNotNullParameter(labelData, "labelData");
        Intrinsics.checkNotNullParameter(privacySheetParams, "privacySheetParams");
        return new PrivacySheetData(labelData, privacySheetParams);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrivacySheetData)) {
            return false;
        }
        PrivacySheetData privacySheetData = (PrivacySheetData) other;
        return Intrinsics.areEqual(this.labelData, privacySheetData.labelData) && Intrinsics.areEqual(this.privacySheetParams, privacySheetData.privacySheetParams);
    }

    @NotNull
    public final LabelData getLabelData() {
        return this.labelData;
    }

    @NotNull
    public final id.z0 getPrivacySheetParams() {
        return this.privacySheetParams;
    }

    public int hashCode() {
        return (this.labelData.hashCode() * 31) + this.privacySheetParams.hashCode();
    }

    @NotNull
    public String toString() {
        return "PrivacySheetData(labelData=" + this.labelData + ", privacySheetParams=" + this.privacySheetParams + ')';
    }
}
