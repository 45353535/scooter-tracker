package org.bidon.sdk.stats.usecases;

import com.appodeal.ads.modules.common.internal.LogConstants;
import com.ironsource.C4240b4;
import com.ironsource.C4424m2;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import org.bidon.sdk.stats.models.ImpressionRequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qf.a;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0001\u000eJB\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u000bH¦B¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lorg/bidon/sdk/stats/usecases/SendImpressionRequestUseCase;", "", "invoke", "Lkotlin/Result;", "Lorg/bidon/sdk/utils/networking/BaseResponse;", "urlPath", "", "bodyKey", "body", "Lorg/bidon/sdk/stats/models/ImpressionRequestBody;", HandleInvocationsFromAdViewer.KEY_EXTRAS, "", "invoke-yxL6bBk", "(Ljava/lang/String;Ljava/lang/String;Lorg/bidon/sdk/stats/models/ImpressionRequestBody;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Type", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface SendImpressionRequestUseCase {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lorg/bidon/sdk/stats/usecases/SendImpressionRequestUseCase$Type;", "", C4240b4.i.W, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", LogConstants.EVENT_SHOW, "Click", "Reward", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @NotNull
        private final String key;
        public static final Type Show = new Type(LogConstants.EVENT_SHOW, 0, C4424m2.f43623v);
        public static final Type Click = new Type("Click", 1, "click");
        public static final Type Reward = new Type("Reward", 2, "reward");

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{Show, Click, Reward};
        }

        static {
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = a.a(typeArr$values);
        }

        private Type(String str, int i10, String str2) {
            this.key = str2;
        }

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        @NotNull
        public final String getKey() {
            return this.key;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: invoke-yxL6bBk */
    Object mo8676invokeyxL6bBk(@NotNull String str, @NotNull String str2, @NotNull ImpressionRequestBody impressionRequestBody, @NotNull Map<String, ? extends Object> map, @NotNull Continuation continuation);
}
