package org.bidon.sdk.databinders.extras;

import com.ironsource.C4240b4;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0014\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\rH\u0016J\f\u0010\u000e\u001a\u00020\u000f*\u00020\u0007H\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lorg/bidon/sdk/databinders/extras/ExtrasImpl;", "Lorg/bidon/sdk/databinders/extras/Extras;", "<init>", "()V", HandleInvocationsFromAdViewer.KEY_EXTRAS, "", "", "", "addExtra", "", C4240b4.i.W, "value", "getExtras", "", "isTypeSupported", "", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExtrasImpl implements Extras {

    @NotNull
    private final Map<String, Object> extras = new LinkedHashMap();

    private final boolean isTypeSupported(Object obj) {
        boolean z10 = (obj instanceof String) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Boolean) || (obj instanceof Character) || (obj instanceof JSONObject);
        if (!z10) {
            LogExtKt.logError("Extras", "Type of " + obj + " is not supported", new UnsupportedOperationException());
        }
        return z10;
    }

    @Override // org.bidon.sdk.databinders.extras.Extras
    public void addExtra(@NotNull String key, @Nullable Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (value == null || !isTypeSupported(value)) {
            this.extras.remove(key);
            return;
        }
        if (Intrinsics.areEqual(this.extras.get(key), value)) {
            return;
        }
        LogExtKt.logInfo("Extras", "Extras updated: " + this.extras);
        this.extras.put(key, value);
    }

    @Override // org.bidon.sdk.databinders.extras.Extras
    @NotNull
    public Map<String, Object> getExtras() {
        return MapsKt.toMap(this.extras);
    }
}
