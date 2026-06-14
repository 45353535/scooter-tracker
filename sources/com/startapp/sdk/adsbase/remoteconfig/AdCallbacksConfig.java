package com.startapp.sdk.adsbase.remoteconfig;

import androidx.annotation.Nullable;
import com.startapp.json.TypeInfo;
import com.startapp.sdk.internal.vi;
import j$.util.Objects;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public class AdCallbacksConfig implements Serializable {
    private static final long serialVersionUID = -4207400392050812703L;
    private boolean logNotSubscribed;

    @Nullable
    @TypeInfo(type = HashSet.class)
    private Set<String> names;

    public final boolean a(String str) {
        Set<String> set = this.names;
        if (set == null) {
            return false;
        }
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            if (str.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AdCallbacksConfig adCallbacksConfig = (AdCallbacksConfig) obj;
            if (this.logNotSubscribed == adCallbacksConfig.logNotSubscribed && vi.a(this.names, adCallbacksConfig.names)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.names, Boolean.valueOf(this.logNotSubscribed));
    }

    public final boolean a() {
        return this.logNotSubscribed;
    }
}
