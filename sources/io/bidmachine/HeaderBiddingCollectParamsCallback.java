package io.bidmachine;

import androidx.annotation.NonNull;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public interface HeaderBiddingCollectParamsCallback {
    void onCollectFail(@NonNull ae.a aVar);

    void onCollectFinished(@NonNull Map<String, String> map);
}
