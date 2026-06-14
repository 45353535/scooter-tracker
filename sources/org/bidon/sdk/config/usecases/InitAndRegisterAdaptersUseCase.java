package org.bidon.sdk.config.usecases;

import android.content.Context;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.bidon.sdk.adapter.Adapter;
import org.bidon.sdk.config.models.ConfigResponse;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J4\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH¦B¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"Lorg/bidon/sdk/config/usecases/InitAndRegisterAdaptersUseCase;", "", "invoke", "", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "adapters", "", "Lorg/bidon/sdk/adapter/Adapter;", "configResponse", "Lorg/bidon/sdk/config/models/ConfigResponse;", "isTestMode", "", "(Landroid/content/Context;Ljava/util/List;Lorg/bidon/sdk/config/models/ConfigResponse;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface InitAndRegisterAdaptersUseCase {
    @Nullable
    Object invoke(@NotNull Context context, @NotNull List<? extends Adapter> list, @NotNull ConfigResponse configResponse, boolean z10, @NotNull Continuation continuation);
}
