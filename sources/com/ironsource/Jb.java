package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Map;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class Jb {
    public final void a(@Nullable Map<String, String> map, boolean z10) {
        if (z10 && TextUtils.isEmpty(com.ironsource.mediationsdk.r.m().p()) && map != null && !map.isEmpty()) {
            for (String str : map.keySet()) {
                if (IronSourceUtils.a(str)) {
                    String str2 = map.get(str);
                    if (!TextUtils.isEmpty(str2)) {
                        str = str2;
                    }
                    com.ironsource.mediationsdk.r.m().g(str);
                    return;
                }
            }
        }
    }
}
