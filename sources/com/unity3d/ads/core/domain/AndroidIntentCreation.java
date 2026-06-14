package com.unity3d.ads.core.domain;

import android.content.Intent;
import android.net.Uri;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J=\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\nH\u0096\u0002¨\u0006\f"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidIntentCreation;", "Lcom/unity3d/ads/core/domain/IntentCreation;", "()V", "invoke", "Landroid/content/Intent;", "url", "", "packageName", "action", HandleInvocationsFromAdViewer.KEY_EXTRAS, "", "", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidIntentCreation implements IntentCreation {
    @Override // com.unity3d.ads.core.domain.IntentCreation
    @NotNull
    public Intent invoke(@NotNull String url, @Nullable String packageName, @Nullable String action, @Nullable Map<String, ? extends Object> extras) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intent intent = new Intent();
        if (packageName != null) {
            if (packageName.length() <= 0) {
                packageName = null;
            }
            if (packageName != null) {
                intent.setPackage(packageName);
            }
        }
        if (action != null) {
            if (action.length() <= 0) {
                action = null;
            }
            if (action != null) {
                intent.setAction(action);
            }
        }
        Uri uri = Uri.parse(url);
        Intrinsics.checkNotNullExpressionValue(uri, "parse(this)");
        intent.setData(uri);
        if (extras != null) {
            for (Map.Entry<String, ? extends Object> entry : extras.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof String) {
                    intent.putExtra(key, (String) value);
                } else if (value instanceof Integer) {
                    intent.putExtra(key, ((Number) value).intValue());
                } else if (value instanceof Boolean) {
                    intent.putExtra(key, ((Boolean) value).booleanValue());
                } else if (value instanceof Float) {
                    intent.putExtra(key, ((Number) value).floatValue());
                } else if (value instanceof Double) {
                    intent.putExtra(key, ((Number) value).doubleValue());
                }
            }
        }
        return intent;
    }
}
