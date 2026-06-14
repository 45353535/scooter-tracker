package io.bidmachine.ads.networks.gam_dynamic.versions;

import androidx.annotation.NonNull;
import ge.a;

/* JADX INFO: loaded from: classes12.dex */
public abstract class BaseVersionWrapper implements VersionWrapper {
    private final int minDeviceApiVersion;

    @NonNull
    private final a versionForWhichCompiled;

    public BaseVersionWrapper(int i10, @NonNull a aVar) {
        this.minDeviceApiVersion = i10;
        this.versionForWhichCompiled = aVar;
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.versions.VersionWrapper
    public int getMinDeviceApiVersion() {
        return this.minDeviceApiVersion;
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.versions.VersionWrapper
    @NonNull
    public a getVersionForWhichCompiled() {
        return this.versionForWhichCompiled;
    }
}
