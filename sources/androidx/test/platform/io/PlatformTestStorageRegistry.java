package androidx.test.platform.io;

import androidx.test.internal.platform.ServiceLoaderWrapper;
import androidx.test.internal.util.Checks;

/* JADX INFO: loaded from: classes5.dex */
public final class PlatformTestStorageRegistry {
    private static PlatformTestStorage testStorageInstance = (PlatformTestStorage) ServiceLoaderWrapper.loadSingleService(PlatformTestStorage.class, new ServiceLoaderWrapper.Factory() { // from class: androidx.test.platform.io.b
        @Override // androidx.test.internal.platform.ServiceLoaderWrapper.Factory
        public final Object create() {
            return new FileTestStorage();
        }
    });

    private PlatformTestStorageRegistry() {
    }

    public static synchronized PlatformTestStorage getInstance() {
        return testStorageInstance;
    }

    public static synchronized void registerInstance(PlatformTestStorage platformTestStorage) {
        testStorageInstance = (PlatformTestStorage) Checks.checkNotNull(platformTestStorage);
    }
}
