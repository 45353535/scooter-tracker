package com.google.android.material.color;

import android.content.Context;
import android.content.res.Configuration;
import android.view.ContextThemeWrapper;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.google.android.material.R;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
@RequiresApi(api = 30)
class ResourcesLoaderColorResourcesOverride implements ColorResourcesOverride {

    private static class ResourcesLoaderColorResourcesOverrideSingleton {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final ResourcesLoaderColorResourcesOverride f26107a = new ResourcesLoaderColorResourcesOverride();
    }

    static ColorResourcesOverride a() {
        return ResourcesLoaderColorResourcesOverrideSingleton.f26107a;
    }

    @Override // com.google.android.material.color.ColorResourcesOverride
    public boolean applyIfPossible(Context context, Map<Integer, Integer> map) {
        if (!ResourcesLoaderUtils.a(context, map)) {
            return false;
        }
        ThemeUtils.applyThemeOverlay(context, R.style.ThemeOverlay_Material3_PersonalizedColors);
        return true;
    }

    @Override // com.google.android.material.color.ColorResourcesOverride
    @NonNull
    public Context wrapContextIfPossible(Context context, Map<Integer, Integer> map) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R.style.ThemeOverlay_Material3_PersonalizedColors);
        contextThemeWrapper.applyOverrideConfiguration(new Configuration());
        return ResourcesLoaderUtils.a(contextThemeWrapper, map) ? contextThemeWrapper : context;
    }

    private ResourcesLoaderColorResourcesOverride() {
    }
}
