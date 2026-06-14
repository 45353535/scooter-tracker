package org.bidon.sdk.databinders.segment;

import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.g.e0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.utils.serializer.JsonName;
import org.bidon.sdk.utils.serializer.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lorg/bidon/sdk/databinders/segment/SegmentRequestBody;", "Lorg/bidon/sdk/utils/serializer/Serializable;", e0.f66120c, "", "ext", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getUid", "()Ljava/lang/String;", "getExt", "component1", "component2", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class SegmentRequestBody implements Serializable {

    @JsonName(key = "ext")
    @Nullable
    private final String ext;

    @JsonName(key = e0.f66120c)
    @Nullable
    private final String uid;

    public SegmentRequestBody(@Nullable String str, @Nullable String str2) {
        this.uid = str;
        this.ext = str2;
    }

    public static /* synthetic */ SegmentRequestBody copy$default(SegmentRequestBody segmentRequestBody, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = segmentRequestBody.uid;
        }
        if ((i10 & 2) != 0) {
            str2 = segmentRequestBody.ext;
        }
        return segmentRequestBody.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUid() {
        return this.uid;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getExt() {
        return this.ext;
    }

    @NotNull
    public final SegmentRequestBody copy(@Nullable String uid, @Nullable String ext) {
        return new SegmentRequestBody(uid, ext);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SegmentRequestBody)) {
            return false;
        }
        SegmentRequestBody segmentRequestBody = (SegmentRequestBody) other;
        return Intrinsics.areEqual(this.uid, segmentRequestBody.uid) && Intrinsics.areEqual(this.ext, segmentRequestBody.ext);
    }

    @Nullable
    public final String getExt() {
        return this.ext;
    }

    @Nullable
    public final String getUid() {
        return this.uid;
    }

    public int hashCode() {
        String str = this.uid;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.ext;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SegmentRequestBody(uid=" + this.uid + ", ext=" + this.ext + ")";
    }
}
