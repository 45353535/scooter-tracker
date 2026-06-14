package org.bidon.sdk.databinders.segment;

import com.my.target.common.menu.MenuActionType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.utils.serializer.JsonName;
import org.bidon.sdk.utils.serializer.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0080\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0015\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J`\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020\f2\b\u0010&\u001a\u0004\u0018\u00010\bHÖ\u0003J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\t\u0010(\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u000b\u0010\u001aR\u001a\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u001c\u0010\u0011¨\u0006)"}, d2 = {"Lorg/bidon/sdk/databinders/segment/SegmentAttributesRequestBody;", "Lorg/bidon/sdk/utils/serializer/Serializable;", "age", "", "gender", "", "customAttributes", "", "", "inAppAmount", "", "isPaying", "", "gameLevel", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "getAge", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getGender", "()Ljava/lang/String;", "getCustomAttributes", "()Ljava/util/Map;", "getInAppAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getGameLevel", "component1", "component2", "component3", "component4", "component5", "component6", MenuActionType.COPY, "(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Integer;)Lorg/bidon/sdk/databinders/segment/SegmentAttributesRequestBody;", "equals", "other", "hashCode", "toString", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class SegmentAttributesRequestBody implements Serializable {

    @JsonName(key = "age")
    @Nullable
    private final Integer age;

    @JsonName(key = "custom_attributes")
    @NotNull
    private final Map<String, Object> customAttributes;

    @JsonName(key = "game_level")
    @Nullable
    private final Integer gameLevel;

    @JsonName(key = "gender")
    @Nullable
    private final String gender;

    @JsonName(key = "total_in_apps_amount")
    @Nullable
    private final Double inAppAmount;

    @JsonName(key = "is_paying")
    @Nullable
    private final Boolean isPaying;

    public SegmentAttributesRequestBody(@Nullable Integer num, @Nullable String str, @NotNull Map<String, ? extends Object> customAttributes, @Nullable Double d10, @Nullable Boolean bool, @Nullable Integer num2) {
        Intrinsics.checkNotNullParameter(customAttributes, "customAttributes");
        this.age = num;
        this.gender = str;
        this.customAttributes = customAttributes;
        this.inAppAmount = d10;
        this.isPaying = bool;
        this.gameLevel = num2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SegmentAttributesRequestBody copy$default(SegmentAttributesRequestBody segmentAttributesRequestBody, Integer num, String str, Map map, Double d10, Boolean bool, Integer num2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = segmentAttributesRequestBody.age;
        }
        if ((i10 & 2) != 0) {
            str = segmentAttributesRequestBody.gender;
        }
        if ((i10 & 4) != 0) {
            map = segmentAttributesRequestBody.customAttributes;
        }
        if ((i10 & 8) != 0) {
            d10 = segmentAttributesRequestBody.inAppAmount;
        }
        if ((i10 & 16) != 0) {
            bool = segmentAttributesRequestBody.isPaying;
        }
        if ((i10 & 32) != 0) {
            num2 = segmentAttributesRequestBody.gameLevel;
        }
        Boolean bool2 = bool;
        Integer num3 = num2;
        return segmentAttributesRequestBody.copy(num, str, map, d10, bool2, num3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getAge() {
        return this.age;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getGender() {
        return this.gender;
    }

    @NotNull
    public final Map<String, Object> component3() {
        return this.customAttributes;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getInAppAmount() {
        return this.inAppAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getIsPaying() {
        return this.isPaying;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getGameLevel() {
        return this.gameLevel;
    }

    @NotNull
    public final SegmentAttributesRequestBody copy(@Nullable Integer age, @Nullable String gender, @NotNull Map<String, ? extends Object> customAttributes, @Nullable Double inAppAmount, @Nullable Boolean isPaying, @Nullable Integer gameLevel) {
        Intrinsics.checkNotNullParameter(customAttributes, "customAttributes");
        return new SegmentAttributesRequestBody(age, gender, customAttributes, inAppAmount, isPaying, gameLevel);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SegmentAttributesRequestBody)) {
            return false;
        }
        SegmentAttributesRequestBody segmentAttributesRequestBody = (SegmentAttributesRequestBody) other;
        return Intrinsics.areEqual(this.age, segmentAttributesRequestBody.age) && Intrinsics.areEqual(this.gender, segmentAttributesRequestBody.gender) && Intrinsics.areEqual(this.customAttributes, segmentAttributesRequestBody.customAttributes) && Intrinsics.areEqual((Object) this.inAppAmount, (Object) segmentAttributesRequestBody.inAppAmount) && Intrinsics.areEqual(this.isPaying, segmentAttributesRequestBody.isPaying) && Intrinsics.areEqual(this.gameLevel, segmentAttributesRequestBody.gameLevel);
    }

    @Nullable
    public final Integer getAge() {
        return this.age;
    }

    @NotNull
    public final Map<String, Object> getCustomAttributes() {
        return this.customAttributes;
    }

    @Nullable
    public final Integer getGameLevel() {
        return this.gameLevel;
    }

    @Nullable
    public final String getGender() {
        return this.gender;
    }

    @Nullable
    public final Double getInAppAmount() {
        return this.inAppAmount;
    }

    public int hashCode() {
        Integer num = this.age;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.gender;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.customAttributes.hashCode()) * 31;
        Double d10 = this.inAppAmount;
        int iHashCode3 = (iHashCode2 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Boolean bool = this.isPaying;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num2 = this.gameLevel;
        return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    @Nullable
    public final Boolean isPaying() {
        return this.isPaying;
    }

    @NotNull
    public String toString() {
        return "SegmentAttributesRequestBody(age=" + this.age + ", gender=" + this.gender + ", customAttributes=" + this.customAttributes + ", inAppAmount=" + this.inAppAmount + ", isPaying=" + this.isPaying + ", gameLevel=" + this.gameLevel + ")";
    }
}
