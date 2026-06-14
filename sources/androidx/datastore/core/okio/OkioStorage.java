package androidx.datastore.core.okio;

import androidx.datastore.core.InterProcessCoordinator;
import androidx.datastore.core.Storage;
import androidx.datastore.core.StorageConnection;
import com.taurusx.tax.f.y;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lf.i;
import org.jetbrains.annotations.NotNull;
import vh.c0;
import vh.l;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u001b*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u001bBG\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u001a\b\u0002\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R&\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0014R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u001b\u0010\u001a\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Landroidx/datastore/core/okio/OkioStorage;", "T", "Landroidx/datastore/core/Storage;", "Lvh/l;", "fileSystem", "Landroidx/datastore/core/okio/OkioSerializer;", "serializer", "Lkotlin/Function2;", "Lvh/c0;", "Landroidx/datastore/core/InterProcessCoordinator;", "coordinatorProducer", "Lkotlin/Function0;", "producePath", "<init>", "(Lvh/l;Landroidx/datastore/core/okio/OkioSerializer;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "Landroidx/datastore/core/StorageConnection;", "createConnection", "()Landroidx/datastore/core/StorageConnection;", "Lvh/l;", "Landroidx/datastore/core/okio/OkioSerializer;", "Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function0;", "canonicalPath$delegate", "Lkotlin/Lazy;", "getCanonicalPath", "()Lvh/c0;", "canonicalPath", y.f66058y, "datastore-core-okio"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OkioStorage<T> implements Storage<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Set<String> activeFiles = new LinkedHashSet();

    @NotNull
    private static final Synchronizer activeFilesLock = new Synchronizer();

    /* JADX INFO: renamed from: canonicalPath$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy canonicalPath;

    @NotNull
    private final Function2<c0, l, InterProcessCoordinator> coordinatorProducer;

    @NotNull
    private final l fileSystem;

    @NotNull
    private final Function0<c0> producePath;

    @NotNull
    private final OkioSerializer<T> serializer;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/datastore/core/okio/OkioStorage$Companion;", "", "()V", "activeFiles", "", "", "getActiveFiles$datastore_core_okio", "()Ljava/util/Set;", "activeFilesLock", "Landroidx/datastore/core/okio/Synchronizer;", "getActiveFilesLock", "()Landroidx/datastore/core/okio/Synchronizer;", "datastore-core-okio"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<String> getActiveFiles$datastore_core_okio() {
            return OkioStorage.activeFiles;
        }

        @NotNull
        public final Synchronizer getActiveFilesLock() {
            return OkioStorage.activeFilesLock;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OkioStorage(@NotNull l fileSystem, @NotNull OkioSerializer<T> serializer, @NotNull Function2<? super c0, ? super l, ? extends InterProcessCoordinator> coordinatorProducer, @NotNull Function0<c0> producePath) {
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(coordinatorProducer, "coordinatorProducer");
        Intrinsics.checkNotNullParameter(producePath, "producePath");
        this.fileSystem = fileSystem;
        this.serializer = serializer;
        this.coordinatorProducer = coordinatorProducer;
        this.producePath = producePath;
        this.canonicalPath = i.a(new Function0<c0>(this) { // from class: androidx.datastore.core.okio.OkioStorage$canonicalPath$2
            final /* synthetic */ OkioStorage<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final c0 invoke() {
                c0 c0Var = (c0) ((OkioStorage) this.this$0).producePath.invoke();
                boolean zF = c0Var.f();
                OkioStorage<T> okioStorage = this.this$0;
                if (zF) {
                    return c0Var.i();
                }
                throw new IllegalStateException(("OkioStorage requires absolute paths, but did not get an absolute path from producePath = " + ((OkioStorage) okioStorage).producePath + ", instead got " + c0Var).toString());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c0 getCanonicalPath() {
        return (c0) this.canonicalPath.getValue();
    }

    @Override // androidx.datastore.core.Storage
    @NotNull
    public StorageConnection<T> createConnection() {
        String string = getCanonicalPath().toString();
        synchronized (activeFilesLock) {
            Set<String> set = activeFiles;
            if (set.contains(string)) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + string + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            set.add(string);
        }
        return new OkioStorageConnection(this.fileSystem, getCanonicalPath(), this.serializer, this.coordinatorProducer.invoke(getCanonicalPath(), this.fileSystem), new Function0<Unit>(this) { // from class: androidx.datastore.core.okio.OkioStorage.createConnection.2
            final /* synthetic */ OkioStorage<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Companion companion = OkioStorage.INSTANCE;
                Synchronizer activeFilesLock2 = companion.getActiveFilesLock();
                OkioStorage<T> okioStorage = this.this$0;
                synchronized (activeFilesLock2) {
                    companion.getActiveFiles$datastore_core_okio().remove(okioStorage.getCanonicalPath().toString());
                    Unit unit = Unit.f93236a;
                }
            }
        });
    }

    public /* synthetic */ OkioStorage(l lVar, OkioSerializer okioSerializer, Function2 function2, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(lVar, okioSerializer, (i10 & 4) != 0 ? new Function2<c0, l, InterProcessCoordinator>() { // from class: androidx.datastore.core.okio.OkioStorage.1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final InterProcessCoordinator invoke(@NotNull c0 path, @NotNull l lVar2) {
                Intrinsics.checkNotNullParameter(path, "path");
                Intrinsics.checkNotNullParameter(lVar2, "<anonymous parameter 1>");
                return OkioStorageKt.createSingleProcessCoordinator(path);
            }
        } : function2, function0);
    }
}
