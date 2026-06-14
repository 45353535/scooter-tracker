package androidx.test.core.content.pm;

import android.content.pm.ApplicationInfo;
import androidx.annotation.Nullable;
import androidx.test.internal.util.Checks;

/* JADX INFO: loaded from: classes5.dex */
public final class ApplicationInfoBuilder {
    private int flags = 0;

    @Nullable
    private String name;

    @Nullable
    private String packageName;

    private ApplicationInfoBuilder() {
    }

    public static ApplicationInfoBuilder newBuilder() {
        return new ApplicationInfoBuilder();
    }

    public ApplicationInfo build() {
        Checks.checkNotNull(this.packageName, "Mandatory field 'packageName' missing.");
        ApplicationInfo applicationInfo = new ApplicationInfo();
        applicationInfo.flags = this.flags;
        applicationInfo.name = this.name;
        applicationInfo.packageName = this.packageName;
        return applicationInfo;
    }

    public ApplicationInfoBuilder setFlags(int i10) {
        this.flags = i10;
        return this;
    }

    public ApplicationInfoBuilder setName(@Nullable String str) {
        this.name = str;
        return this;
    }

    public ApplicationInfoBuilder setPackageName(String str) {
        this.packageName = str;
        return this;
    }
}
