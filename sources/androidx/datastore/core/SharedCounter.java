package androidx.datastore.core;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Landroidx/datastore/core/SharedCounter;", "", "mappedAddress", "", "(J)V", "getValue", "", "incrementAndGetValue", "Factory", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SharedCounter {

    /* JADX INFO: renamed from: Factory, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final NativeSharedCounter nativeSharedCounter = new NativeSharedCounter();
    private final long mappedAddress;

    /* JADX INFO: renamed from: androidx.datastore.core.SharedCounter$Factory, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001b\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0000¢\u0006\u0002\b\fJ\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0006\u0010\u0010\u001a\u00020\u0011R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Landroidx/datastore/core/SharedCounter$Factory;", "", "()V", "nativeSharedCounter", "Landroidx/datastore/core/NativeSharedCounter;", "getNativeSharedCounter$datastore_core_release", "()Landroidx/datastore/core/NativeSharedCounter;", "create", "Landroidx/datastore/core/SharedCounter;", "produceFile", "Lkotlin/Function0;", "Ljava/io/File;", "create$datastore_core_release", "createCounterFromFd", "pfd", "Landroid/os/ParcelFileDescriptor;", "loadLib", "", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final SharedCounter createCounterFromFd(ParcelFileDescriptor pfd) throws IOException {
            int fd2 = pfd.getFd();
            if (getNativeSharedCounter$datastore_core_release().nativeTruncateFile(fd2) != 0) {
                throw new IOException("Failed to truncate counter file");
            }
            long jNativeCreateSharedCounter = getNativeSharedCounter$datastore_core_release().nativeCreateSharedCounter(fd2);
            if (jNativeCreateSharedCounter >= 0) {
                return new SharedCounter(jNativeCreateSharedCounter, null);
            }
            throw new IOException("Failed to mmap counter file");
        }

        @NotNull
        public final SharedCounter create$datastore_core_release(@NotNull Function0<? extends File> produceFile) throws Throwable {
            ParcelFileDescriptor parcelFileDescriptorOpen;
            Intrinsics.checkNotNullParameter(produceFile, "produceFile");
            try {
                parcelFileDescriptorOpen = ParcelFileDescriptor.open(produceFile.invoke(), 939524096);
            } catch (Throwable th2) {
                th = th2;
                parcelFileDescriptorOpen = null;
            }
            try {
                SharedCounter sharedCounterCreateCounterFromFd = createCounterFromFd(parcelFileDescriptorOpen);
                if (parcelFileDescriptorOpen != null) {
                    parcelFileDescriptorOpen.close();
                }
                return sharedCounterCreateCounterFromFd;
            } catch (Throwable th3) {
                th = th3;
                if (parcelFileDescriptorOpen != null) {
                    parcelFileDescriptorOpen.close();
                }
                throw th;
            }
        }

        @NotNull
        public final NativeSharedCounter getNativeSharedCounter$datastore_core_release() {
            return SharedCounter.nativeSharedCounter;
        }

        public final void loadLib() {
            System.loadLibrary("datastore_shared_counter");
        }

        private Companion() {
        }
    }

    public /* synthetic */ SharedCounter(long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10);
    }

    public final int getValue() {
        return nativeSharedCounter.nativeGetCounterValue(this.mappedAddress);
    }

    public final int incrementAndGetValue() {
        return nativeSharedCounter.nativeIncrementAndGetCounterValue(this.mappedAddress);
    }

    private SharedCounter(long j10) {
        this.mappedAddress = j10;
    }
}
