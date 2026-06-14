package org.bidon.sdk.databinders.extras;

import com.ironsource.C4240b4;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H&J\u0014\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\bH&¨\u0006\t"}, d2 = {"Lorg/bidon/sdk/databinders/extras/Extras;", "", "addExtra", "", C4240b4.i.W, "", "value", "getExtras", "", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface Extras {
    void addExtra(@NotNull String key, @Nullable Object value);

    @NotNull
    Map<String, Object> getExtras();
}
