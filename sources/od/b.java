package od;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    @Nullable
    public Map<String, Object> getCustomParams() {
        return null;
    }

    public abstract void load(@NonNull ContextProvider contextProvider, @NonNull c cVar, @NonNull d dVar, @NonNull k kVar, @NonNull NetworkAdUnit networkAdUnit) throws Throwable;

    public void onClicked() {
    }

    public void onDestroy() {
    }

    public void onExpired() {
    }

    public void onImpression() {
    }

    public void onShowFailed() {
    }

    public void onShown() {
    }
}
