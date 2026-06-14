package org.bidon.sdk.utils.networking.requests;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import org.bidon.sdk.databinders.DataBinderType;
import org.bidon.sdk.utils.serializer.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J`\u0010\u0002\u001a\u00020\u0003\"\b\b\u0000\u0010\u0004*\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u0001H\u00042\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00040\u00072\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u000eH¦B¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"Lorg/bidon/sdk/utils/networking/requests/CreateRequestBodyUseCase;", "", "invoke", "Lorg/json/JSONObject;", "T", "Lorg/bidon/sdk/utils/serializer/Serializable;", "binders", "", "Lorg/bidon/sdk/databinders/DataBinderType;", "dataKeyName", "", "data", "list", HandleInvocationsFromAdViewer.KEY_EXTRAS, "", "(Ljava/util/List;Ljava/lang/String;Lorg/bidon/sdk/utils/serializer/Serializable;Ljava/util/List;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface CreateRequestBodyUseCase {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object invoke$default(CreateRequestBodyUseCase createRequestBodyUseCase, List list, String str, Serializable serializable, List list2, Map map, Continuation continuation, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
            }
            if ((i10 & 4) != 0) {
                serializable = null;
            }
            Serializable serializable2 = serializable;
            if ((i10 & 8) != 0) {
                list2 = CollectionsKt.emptyList();
            }
            return createRequestBodyUseCase.invoke(list, str, serializable2, list2, map, continuation);
        }
    }

    @Nullable
    <T extends Serializable> Object invoke(@NotNull List<? extends DataBinderType> list, @Nullable String str, @Nullable T t10, @NotNull List<? extends T> list2, @NotNull Map<String, ? extends Object> map, @NotNull Continuation continuation);
}
