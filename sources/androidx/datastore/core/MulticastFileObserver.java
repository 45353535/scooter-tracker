package androidx.datastore.core;

import android.os.FileObserver;
import androidx.annotation.CheckResult;
import androidx.annotation.VisibleForTesting;
import androidx.datastore.core.MulticastFileObserver;
import com.ironsource.C4240b4;
import com.taurusx.tax.f.y;
import eg.p0;
import hg.i;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016R&\u0010\u0005\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Landroidx/datastore/core/MulticastFileObserver;", "Landroid/os/FileObserver;", "path", "", "(Ljava/lang/String;)V", "delegates", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lkotlin/Function1;", "", "Landroidx/datastore/core/FileMoveObserver;", "getPath", "()Ljava/lang/String;", "onEvent", "event", "", y.f66058y, "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MulticastFileObserver extends FileObserver {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Object LOCK = new Object();

    @NotNull
    private static final Map<String, MulticastFileObserver> fileObservers = new LinkedHashMap();

    @NotNull
    private final CopyOnWriteArrayList<Function1<String, Unit>> delegates;

    @NotNull
    private final String path;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0018\u0010\n\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\tH\u0003¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0011\u0010\u0003R,\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00140\u00138\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0019\u0010\u0003\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Landroidx/datastore/core/MulticastFileObserver$Companion;", "", "<init>", "()V", "Ljava/io/File;", "parent", "Lkotlin/Function1;", "", "", "Landroidx/datastore/core/FileMoveObserver;", "observer", "Leg/p0;", "observe", "(Ljava/io/File;Lkotlin/jvm/functions/Function1;)Leg/p0;", C4240b4.i.f42616b, "Lkotlinx/coroutines/flow/Flow;", "(Ljava/io/File;)Lkotlinx/coroutines/flow/Flow;", "removeAllObservers$datastore_core_release", "removeAllObservers", "", "Landroidx/datastore/core/MulticastFileObserver;", "fileObservers", "Ljava/util/Map;", "getFileObservers$datastore_core_release", "()Ljava/util/Map;", "getFileObservers$datastore_core_release$annotations", "LOCK", "Ljava/lang/Object;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @VisibleForTesting
        public static /* synthetic */ void getFileObservers$datastore_core_release$annotations() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void observe$lambda$4(String str, Function1 observer) {
            Intrinsics.checkNotNullParameter(observer, "$observer");
            synchronized (MulticastFileObserver.LOCK) {
                try {
                    Companion companion = MulticastFileObserver.INSTANCE;
                    MulticastFileObserver multicastFileObserver = companion.getFileObservers$datastore_core_release().get(str);
                    if (multicastFileObserver != null) {
                        multicastFileObserver.delegates.remove(observer);
                        if (multicastFileObserver.delegates.isEmpty()) {
                            companion.getFileObservers$datastore_core_release().remove(str);
                            multicastFileObserver.stopWatching();
                        }
                    }
                    Unit unit = Unit.f93236a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @NotNull
        public final Map<String, MulticastFileObserver> getFileObservers$datastore_core_release() {
            return MulticastFileObserver.fileObservers;
        }

        @CheckResult
        @NotNull
        public final Flow observe(@NotNull File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            return i.j(new MulticastFileObserver$Companion$observe$1(file, null));
        }

        @VisibleForTesting
        public final void removeAllObservers$datastore_core_release() {
            synchronized (MulticastFileObserver.LOCK) {
                try {
                    Iterator<T> it = MulticastFileObserver.INSTANCE.getFileObservers$datastore_core_release().values().iterator();
                    while (it.hasNext()) {
                        ((MulticastFileObserver) it.next()).stopWatching();
                    }
                    MulticastFileObserver.INSTANCE.getFileObservers$datastore_core_release().clear();
                    Unit unit = Unit.f93236a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @CheckResult
        public final p0 observe(File parent, final Function1<? super String, Unit> observer) {
            final String key = parent.getCanonicalFile().getPath();
            synchronized (MulticastFileObserver.LOCK) {
                try {
                    Map<String, MulticastFileObserver> fileObservers$datastore_core_release = MulticastFileObserver.INSTANCE.getFileObservers$datastore_core_release();
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    MulticastFileObserver multicastFileObserver = fileObservers$datastore_core_release.get(key);
                    if (multicastFileObserver == null) {
                        multicastFileObserver = new MulticastFileObserver(key, null);
                        fileObservers$datastore_core_release.put(key, multicastFileObserver);
                    }
                    MulticastFileObserver multicastFileObserver2 = multicastFileObserver;
                    multicastFileObserver2.delegates.add(observer);
                    if (multicastFileObserver2.delegates.size() == 1) {
                        multicastFileObserver2.startWatching();
                    }
                    Unit unit = Unit.f93236a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return new p0() { // from class: androidx.datastore.core.a
                @Override // eg.p0
                public final void dispose() {
                    MulticastFileObserver.Companion.observe$lambda$4(key, observer);
                }
            };
        }
    }

    public /* synthetic */ MulticastFileObserver(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @NotNull
    public final String getPath() {
        return this.path;
    }

    @Override // android.os.FileObserver
    public void onEvent(int event, @Nullable String path) {
        Iterator<T> it = this.delegates.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(path);
        }
    }

    private MulticastFileObserver(String str) {
        super(str, 128);
        this.path = str;
        this.delegates = new CopyOnWriteArrayList<>();
    }
}
