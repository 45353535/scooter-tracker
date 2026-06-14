package org.bidon.sdk.segment;

import java.util.Map;
import kotlin.Metadata;
import org.bidon.sdk.segment.models.Gender;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001c\u0010 \u001a\u00020!2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010#H&J\u001a\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00032\b\u0010&\u001a\u0004\u0018\u00010\u0001H&J\u0014\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010#H&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u0004\u0018\u00010\rX¦\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u0007X¦\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000bR\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u0016X¦\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001b\u001a\u00020\u001cX¦\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006("}, d2 = {"Lorg/bidon/sdk/segment/Segment;", "", "segmentUid", "", "getSegmentUid", "()Ljava/lang/String;", "age", "", "getAge", "()Ljava/lang/Integer;", "setAge", "(Ljava/lang/Integer;)V", "gender", "Lorg/bidon/sdk/segment/models/Gender;", "getGender", "()Lorg/bidon/sdk/segment/models/Gender;", "setGender", "(Lorg/bidon/sdk/segment/models/Gender;)V", "level", "getLevel", "setLevel", "totalInAppAmount", "", "getTotalInAppAmount", "()Ljava/lang/Double;", "setTotalInAppAmount", "(Ljava/lang/Double;)V", "isPaying", "", "()Z", "setPaying", "(Z)V", "setCustomAttributes", "", "attributes", "", "putCustomAttribute", "attribute", "value", "getCustomAttributes", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface Segment {
    @Nullable
    Integer getAge();

    @NotNull
    Map<String, Object> getCustomAttributes();

    @Nullable
    Gender getGender();

    @Nullable
    Integer getLevel();

    @Nullable
    String getSegmentUid();

    @Nullable
    Double getTotalInAppAmount();

    boolean isPaying();

    void putCustomAttribute(@NotNull String attribute, @Nullable Object value);

    void setAge(@Nullable Integer num);

    void setCustomAttributes(@NotNull Map<String, ? extends Object> attributes);

    void setGender(@Nullable Gender gender);

    void setLevel(@Nullable Integer num);

    void setPaying(boolean z10);

    void setTotalInAppAmount(@Nullable Double d10);
}
