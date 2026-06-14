package org.bidon.sdk.adapter;

import android.content.Context;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.bidon.sdk.adapter.AdapterParameters;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u0000H¦@¢\u0006\u0002\u0010\tJ\u0015\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\fH&¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"Lorg/bidon/sdk/adapter/Initializable;", "T", "Lorg/bidon/sdk/adapter/AdapterParameters;", "", "init", "", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "configParams", "(Landroid/content/Context;Lorg/bidon/sdk/adapter/AdapterParameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "parseConfigParam", "json", "", "(Ljava/lang/String;)Lorg/bidon/sdk/adapter/AdapterParameters;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface Initializable<T extends AdapterParameters> {
    @Nullable
    Object init(@NotNull Context context, @NotNull T t10, @NotNull Continuation continuation);

    @NotNull
    T parseConfigParam(@NotNull String json);
}
