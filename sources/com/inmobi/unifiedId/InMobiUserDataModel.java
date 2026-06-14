package com.inmobi.unifiedId;

import androidx.autofill.HintConstants;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.my.target.common.menu.MenuActionType;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001:\u0001#BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012&\u0010\b\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ0\u0010\u000e\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJR\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022(\b\u0002\u0010\b\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\fR7\u0010\b\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u000f¨\u0006$"}, d2 = {"Lcom/inmobi/unifiedId/InMobiUserDataModel;", "", "Lcom/inmobi/unifiedId/InMobiUserDataTypes;", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "emailId", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", HandleInvocationsFromAdViewer.KEY_EXTRAS, "<init>", "(Lcom/inmobi/unifiedId/InMobiUserDataTypes;Lcom/inmobi/unifiedId/InMobiUserDataTypes;Ljava/util/HashMap;)V", "component1", "()Lcom/inmobi/unifiedId/InMobiUserDataTypes;", "component2", "component3", "()Ljava/util/HashMap;", MenuActionType.COPY, "(Lcom/inmobi/unifiedId/InMobiUserDataTypes;Lcom/inmobi/unifiedId/InMobiUserDataTypes;Ljava/util/HashMap;)Lcom/inmobi/unifiedId/InMobiUserDataModel;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/inmobi/unifiedId/InMobiUserDataTypes;", "getPhoneNumber", "b", "getEmailId", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "Ljava/util/HashMap;", "getExtras", "Builder", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class InMobiUserDataModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final InMobiUserDataTypes phoneNumber;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    public final InMobiUserDataTypes emailId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final HashMap extras;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\u0006J5\u0010\u000b\u001a\u00020\u00002&\u0010\u000b\u001a\"\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u0001`\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/inmobi/unifiedId/InMobiUserDataModel$Builder;", "", "<init>", "()V", "Lcom/inmobi/unifiedId/InMobiUserDataTypes;", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "(Lcom/inmobi/unifiedId/InMobiUserDataTypes;)Lcom/inmobi/unifiedId/InMobiUserDataModel$Builder;", "emailId", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", HandleInvocationsFromAdViewer.KEY_EXTRAS, "(Ljava/util/HashMap;)Lcom/inmobi/unifiedId/InMobiUserDataModel$Builder;", "Lcom/inmobi/unifiedId/InMobiUserDataModel;", "build", "()Lcom/inmobi/unifiedId/InMobiUserDataModel;", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public InMobiUserDataTypes f40091a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public InMobiUserDataTypes f40092b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public HashMap f40093c;

        @NotNull
        public final InMobiUserDataModel build() {
            return new InMobiUserDataModel(this.f40091a, this.f40092b, this.f40093c);
        }

        @NotNull
        public final Builder emailId(@Nullable InMobiUserDataTypes emailId) {
            this.f40092b = emailId;
            return this;
        }

        @NotNull
        public final Builder extras(@Nullable HashMap<String, String> extras) {
            this.f40093c = extras;
            return this;
        }

        @NotNull
        public final Builder phoneNumber(@Nullable InMobiUserDataTypes phoneNumber) {
            this.f40091a = phoneNumber;
            return this;
        }
    }

    public InMobiUserDataModel(@Nullable InMobiUserDataTypes inMobiUserDataTypes, @Nullable InMobiUserDataTypes inMobiUserDataTypes2, @Nullable HashMap<String, String> map) {
        this.phoneNumber = inMobiUserDataTypes;
        this.emailId = inMobiUserDataTypes2;
        this.extras = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InMobiUserDataModel copy$default(InMobiUserDataModel inMobiUserDataModel, InMobiUserDataTypes inMobiUserDataTypes, InMobiUserDataTypes inMobiUserDataTypes2, HashMap map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            inMobiUserDataTypes = inMobiUserDataModel.phoneNumber;
        }
        if ((i10 & 2) != 0) {
            inMobiUserDataTypes2 = inMobiUserDataModel.emailId;
        }
        if ((i10 & 4) != 0) {
            map = inMobiUserDataModel.extras;
        }
        return inMobiUserDataModel.copy(inMobiUserDataTypes, inMobiUserDataTypes2, map);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final InMobiUserDataTypes getPhoneNumber() {
        return this.phoneNumber;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final InMobiUserDataTypes getEmailId() {
        return this.emailId;
    }

    @Nullable
    public final HashMap<String, String> component3() {
        return this.extras;
    }

    @NotNull
    public final InMobiUserDataModel copy(@Nullable InMobiUserDataTypes phoneNumber, @Nullable InMobiUserDataTypes emailId, @Nullable HashMap<String, String> extras) {
        return new InMobiUserDataModel(phoneNumber, emailId, extras);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InMobiUserDataModel)) {
            return false;
        }
        InMobiUserDataModel inMobiUserDataModel = (InMobiUserDataModel) other;
        return Intrinsics.areEqual(this.phoneNumber, inMobiUserDataModel.phoneNumber) && Intrinsics.areEqual(this.emailId, inMobiUserDataModel.emailId) && Intrinsics.areEqual(this.extras, inMobiUserDataModel.extras);
    }

    @Nullable
    public final InMobiUserDataTypes getEmailId() {
        return this.emailId;
    }

    @Nullable
    public final HashMap<String, String> getExtras() {
        return this.extras;
    }

    @Nullable
    public final InMobiUserDataTypes getPhoneNumber() {
        return this.phoneNumber;
    }

    public int hashCode() {
        InMobiUserDataTypes inMobiUserDataTypes = this.phoneNumber;
        int iHashCode = (inMobiUserDataTypes == null ? 0 : inMobiUserDataTypes.hashCode()) * 31;
        InMobiUserDataTypes inMobiUserDataTypes2 = this.emailId;
        int iHashCode2 = (iHashCode + (inMobiUserDataTypes2 == null ? 0 : inMobiUserDataTypes2.hashCode())) * 31;
        HashMap map = this.extras;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "InMobiUserDataModel(phoneNumber=" + this.phoneNumber + ", emailId=" + this.emailId + ", extras=" + this.extras + ")";
    }
}
