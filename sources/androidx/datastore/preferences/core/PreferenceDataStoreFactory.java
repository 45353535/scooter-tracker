package androidx.datastore.preferences.core;

import androidx.datastore.core.DataMigration;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreFactory;
import androidx.datastore.core.FileStorage;
import androidx.datastore.core.Storage;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import com.ironsource.C4240b4;
import eg.m1;
import eg.o0;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vh.c0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JU\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011JU\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0010\u0010\u0014JU\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00150\fH\u0007¢\u0006\u0004\b\u0016\u0010\u0011¨\u0006\u0017"}, d2 = {"Landroidx/datastore/preferences/core/PreferenceDataStoreFactory;", "", "<init>", "()V", "Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;", "Landroidx/datastore/preferences/core/Preferences;", "corruptionHandler", "", "Landroidx/datastore/core/DataMigration;", "migrations", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlin/Function0;", "Ljava/io/File;", "produceFile", "Landroidx/datastore/core/DataStore;", "create", "(Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;Ljava/util/List;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function0;)Landroidx/datastore/core/DataStore;", "Landroidx/datastore/core/Storage;", C4240b4.a.f42506k, "(Landroidx/datastore/core/Storage;Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;Ljava/util/List;Lkotlinx/coroutines/CoroutineScope;)Landroidx/datastore/core/DataStore;", "Lvh/c0;", "createWithPath", "datastore-preferences-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PreferenceDataStoreFactory {

    @NotNull
    public static final PreferenceDataStoreFactory INSTANCE = new PreferenceDataStoreFactory();

    private PreferenceDataStoreFactory() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DataStore create$default(PreferenceDataStoreFactory preferenceDataStoreFactory, Storage storage, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, CoroutineScope coroutineScope, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i10 & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        if ((i10 & 8) != 0) {
            coroutineScope = i.a(Actual_jvmAndroidKt.ioDispatcher().plus(m1.b(null, 1, null)));
        }
        return preferenceDataStoreFactory.create((Storage<Preferences>) storage, (ReplaceFileCorruptionHandler<Preferences>) replaceFileCorruptionHandler, (List<? extends DataMigration<Preferences>>) list, coroutineScope);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DataStore createWithPath$default(PreferenceDataStoreFactory preferenceDataStoreFactory, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, CoroutineScope coroutineScope, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i10 & 2) != 0) {
            list = CollectionsKt.emptyList();
        }
        if ((i10 & 4) != 0) {
            coroutineScope = i.a(Actual_jvmAndroidKt.ioDispatcher().plus(m1.b(null, 1, null)));
        }
        return preferenceDataStoreFactory.createWithPath(replaceFileCorruptionHandler, list, coroutineScope, function0);
    }

    @NotNull
    public final DataStore<Preferences> create(@NotNull Storage<Preferences> storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return create$default(this, storage, (ReplaceFileCorruptionHandler) null, (List) null, (CoroutineScope) null, 14, (Object) null);
    }

    @NotNull
    public final DataStore<Preferences> createWithPath(@Nullable ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, @NotNull List<? extends DataMigration<Preferences>> migrations, @NotNull Function0<c0> produceFile) {
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        return createWithPath$default(this, replaceFileCorruptionHandler, migrations, null, produceFile, 4, null);
    }

    @NotNull
    public final DataStore<Preferences> create(@NotNull Storage<Preferences> storage, @Nullable ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return create$default(this, storage, replaceFileCorruptionHandler, (List) null, (CoroutineScope) null, 12, (Object) null);
    }

    @NotNull
    public final DataStore<Preferences> createWithPath(@Nullable ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, @NotNull Function0<c0> produceFile) {
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        return createWithPath$default(this, replaceFileCorruptionHandler, null, null, produceFile, 6, null);
    }

    @NotNull
    public final DataStore<Preferences> create(@NotNull Storage<Preferences> storage, @Nullable ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, @NotNull List<? extends DataMigration<Preferences>> migrations) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        return create$default(this, storage, replaceFileCorruptionHandler, migrations, (CoroutineScope) null, 8, (Object) null);
    }

    @NotNull
    public final DataStore<Preferences> createWithPath(@NotNull Function0<c0> produceFile) {
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        return createWithPath$default(this, null, null, null, produceFile, 7, null);
    }

    @NotNull
    public final DataStore<Preferences> create(@Nullable ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, @NotNull List<? extends DataMigration<Preferences>> migrations, @NotNull Function0<? extends File> produceFile) {
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        return create$default(this, replaceFileCorruptionHandler, migrations, (CoroutineScope) null, produceFile, 4, (Object) null);
    }

    @NotNull
    public final DataStore<Preferences> createWithPath(@Nullable ReplaceFileCorruptionHandler<Preferences> corruptionHandler, @NotNull List<? extends DataMigration<Preferences>> migrations, @NotNull CoroutineScope scope, @NotNull final Function0<c0> produceFile) {
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        return create(corruptionHandler, migrations, scope, new Function0<File>() { // from class: androidx.datastore.preferences.core.PreferenceDataStoreFactory.createWithPath.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final File invoke() {
                return produceFile.invoke().o();
            }
        });
    }

    @NotNull
    public final DataStore<Preferences> create(@Nullable ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, @NotNull Function0<? extends File> produceFile) {
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        return create$default(this, replaceFileCorruptionHandler, (List) null, (CoroutineScope) null, produceFile, 6, (Object) null);
    }

    @NotNull
    public final DataStore<Preferences> create(@NotNull Function0<? extends File> produceFile) {
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        return create$default(this, (ReplaceFileCorruptionHandler) null, (List) null, (CoroutineScope) null, produceFile, 7, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DataStore create$default(PreferenceDataStoreFactory preferenceDataStoreFactory, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, CoroutineScope coroutineScope, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i10 & 2) != 0) {
            list = CollectionsKt.emptyList();
        }
        if ((i10 & 4) != 0) {
            coroutineScope = i.a(o0.b().plus(m1.b(null, 1, null)));
        }
        return preferenceDataStoreFactory.create((ReplaceFileCorruptionHandler<Preferences>) replaceFileCorruptionHandler, (List<? extends DataMigration<Preferences>>) list, coroutineScope, (Function0<? extends File>) function0);
    }

    @NotNull
    public final DataStore<Preferences> create(@Nullable ReplaceFileCorruptionHandler<Preferences> corruptionHandler, @NotNull List<? extends DataMigration<Preferences>> migrations, @NotNull CoroutineScope scope, @NotNull final Function0<? extends File> produceFile) {
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        return new PreferenceDataStore(create(new FileStorage(PreferencesFileSerializer.INSTANCE, null, new Function0<File>() { // from class: androidx.datastore.preferences.core.PreferenceDataStoreFactory$create$delegate$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final File invoke() {
                File fileInvoke = produceFile.invoke();
                if (Intrinsics.areEqual(uf.i.y(fileInvoke), "preferences_pb")) {
                    File absoluteFile = fileInvoke.getAbsoluteFile();
                    Intrinsics.checkNotNullExpressionValue(absoluteFile, "file.absoluteFile");
                    return absoluteFile;
                }
                throw new IllegalStateException(("File extension for file: " + fileInvoke + " does not match required extension for Preferences file: preferences_pb").toString());
            }
        }, 2, null), corruptionHandler, migrations, scope));
    }

    @NotNull
    public final DataStore<Preferences> create(@NotNull Storage<Preferences> storage, @Nullable ReplaceFileCorruptionHandler<Preferences> corruptionHandler, @NotNull List<? extends DataMigration<Preferences>> migrations, @NotNull CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return new PreferenceDataStore(DataStoreFactory.INSTANCE.create(storage, corruptionHandler, migrations, scope));
    }
}
