package com.google.firebase.remoteconfig;

import androidx.annotation.NonNull;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_ConfigUpdate extends ConfigUpdate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f32949a;

    AutoValue_ConfigUpdate(Set set) {
        if (set == null) {
            throw new NullPointerException("Null updatedKeys");
        }
        this.f32949a = set;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ConfigUpdate) {
            return this.f32949a.equals(((ConfigUpdate) obj).getUpdatedKeys());
        }
        return false;
    }

    @Override // com.google.firebase.remoteconfig.ConfigUpdate
    @NonNull
    public Set<String> getUpdatedKeys() {
        return this.f32949a;
    }

    public int hashCode() {
        return this.f32949a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ConfigUpdate{updatedKeys=" + this.f32949a + "}";
    }
}
