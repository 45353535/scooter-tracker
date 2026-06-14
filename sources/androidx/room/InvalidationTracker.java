package androidx.room;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.lifecycle.LiveData;
import androidx.room.coroutines.RunBlockingUninterruptible_androidKt;
import androidx.room.support.AutoCloser;
import androidx.sqlite.SQLiteConnection;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.my.target.common.menu.MenuActionType;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.z0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import net.pubnative.lite.sdk.utils.AtomManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 s2\u00020\u0001:\u0003tusBS\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u0004\u0012\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\t\"\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fB%\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\t\"\u00020\u0005¢\u0006\u0004\b\u000b\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001c\u001a\u00020\u000e2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0007H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\"\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0000¢\u0006\u0004\b \u0010!J\u0017\u0010'\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020#H\u0000¢\u0006\u0004\b%\u0010&J\u0010\u0010*\u001a\u00020\u000eH\u0080@¢\u0006\u0004\b(\u0010)J\u000f\u0010,\u001a\u00020\u000eH\u0001¢\u0006\u0004\b+\u0010\u0010J\r\u0010-\u001a\u00020\u000e¢\u0006\u0004\b-\u0010\u0010J$\u0010/\u001a\u00020\u00132\u0012\u0010.\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\t\"\u00020\u0005H\u0087@¢\u0006\u0004\b/\u00100J9\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0007022\u0012\u0010.\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\t\"\u00020\u00052\b\b\u0002\u00101\u001a\u00020\u0013H\u0007¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b7\u00106J\u0017\u00109\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b9\u00106J\u0017\u0010:\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b:\u00106J\u000f\u0010;\u001a\u00020\u000eH\u0016¢\u0006\u0004\b;\u0010\u0010J\u000f\u0010<\u001a\u00020\u000eH\u0017¢\u0006\u0004\b<\u0010\u0010J\u001d\u0010>\u001a\u00020\u000e2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0000¢\u0006\u0004\b=\u0010\u001dJ;\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000B\"\u0004\b\u0000\u0010?2\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\t2\u000e\u0010A\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000@H\u0017¢\u0006\u0004\bC\u0010DJC\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000B\"\u0004\b\u0000\u0010?2\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\t2\u0006\u0010E\u001a\u00020\u00132\u000e\u0010A\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000@H\u0017¢\u0006\u0004\bC\u0010FJI\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000B\"\u0004\b\u0000\u0010?2\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\t2\u0006\u0010E\u001a\u00020\u00132\u0014\u0010A\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0006\u0012\u0004\u0018\u00018\u00000GH\u0007¢\u0006\u0004\bC\u0010HJ'\u0010P\u001a\u00020\u000e2\u0006\u0010J\u001a\u00020I2\u0006\u0010K\u001a\u00020\u00052\u0006\u0010M\u001a\u00020LH\u0000¢\u0006\u0004\bN\u0010OJ\u000f\u0010R\u001a\u00020\u000eH\u0000¢\u0006\u0004\bQ\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010S\u001a\u0004\bT\u0010UR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010VR&\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010VR\"\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010W\u001a\u0004\bX\u0010YR\u0014\u0010[\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R \u0010_\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020^0]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010VR\u0018\u0010b\u001a\u00060`j\u0002`a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010dR\u001a\u0010f\u001a\b\u0012\u0004\u0012\u00020\u000e0e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u001a\u0010h\u001a\b\u0012\u0004\u0012\u00020\u000e0e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010gR\u0014\u0010j\u001a\u00020i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0018\u0010l\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u0018\u0010o\u001a\u0004\u0018\u00010n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010q\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010r¨\u0006v"}, d2 = {"Landroidx/room/InvalidationTracker;", "", "Landroidx/room/RoomDatabase;", "database", "", "", "shadowTablesMap", "", "viewTables", "", "tableNames", "<init>", "(Landroidx/room/RoomDatabase;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;)V", "(Landroidx/room/RoomDatabase;[Ljava/lang/String;)V", "", "onAutoCloseCallback", "()V", "Landroidx/room/InvalidationTracker$Observer;", "observer", "", "addObserverOnly", "(Landroidx/room/InvalidationTracker$Observer;)Z", "removeObserverOnly", "", "getAllObservers", "()Ljava/util/List;", "", "tableIds", "notifyInvalidatedObservers", "(Ljava/util/Set;)V", "Landroidx/room/support/AutoCloser;", "autoCloser", "setAutoCloser$room_runtime", "(Landroidx/room/support/AutoCloser;)V", "setAutoCloser", "Landroidx/sqlite/SQLiteConnection;", "connection", "internalInit$room_runtime", "(Landroidx/sqlite/SQLiteConnection;)V", "internalInit", "sync$room_runtime", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sync", "syncBlocking$room_runtime", "syncBlocking", "refreshAsync", "tables", ToolBar.REFRESH, "([Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emitInitialState", "Lkotlinx/coroutines/flow/Flow;", "createFlow", "([Ljava/lang/String;Z)Lkotlinx/coroutines/flow/Flow;", "addObserver", "(Landroidx/room/InvalidationTracker$Observer;)V", "addRemoteObserver$room_runtime", "addRemoteObserver", "addWeakObserver", "removeObserver", "refreshVersionsAsync", "refreshVersionsSync", "notifyObserversByTableNames$room_runtime", "notifyObserversByTableNames", "T", "Ljava/util/concurrent/Callable;", "computeFunction", "Landroidx/lifecycle/LiveData;", "createLiveData", "([Ljava/lang/String;Ljava/util/concurrent/Callable;)Landroidx/lifecycle/LiveData;", "inTransaction", "([Ljava/lang/String;ZLjava/util/concurrent/Callable;)Landroidx/lifecycle/LiveData;", "Lkotlin/Function1;", "([Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)Landroidx/lifecycle/LiveData;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "name", "Landroid/content/Intent;", "serviceIntent", "initMultiInstanceInvalidation$room_runtime", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;)V", "initMultiInstanceInvalidation", "stop$room_runtime", AtomManager.ATOM_STOP_METHOD_NAME, "Landroidx/room/RoomDatabase;", "getDatabase$room_runtime", "()Landroidx/room/RoomDatabase;", "Ljava/util/Map;", "[Ljava/lang/String;", "getTableNames$room_runtime", "()[Ljava/lang/String;", "Landroidx/room/TriggerBasedInvalidationTracker;", "implementation", "Landroidx/room/TriggerBasedInvalidationTracker;", "", "Landroidx/room/ObserverWrapper;", "observerMap", "Ljava/util/concurrent/locks/ReentrantLock;", "Landroidx/room/concurrent/ReentrantLock;", "observerMapLock", "Ljava/util/concurrent/locks/ReentrantLock;", "Landroidx/room/support/AutoCloser;", "Lkotlin/Function0;", "onRefreshScheduled", "Lkotlin/jvm/functions/Function0;", "onRefreshCompleted", "Landroidx/room/InvalidationLiveDataContainer;", "invalidationLiveDataContainer", "Landroidx/room/InvalidationLiveDataContainer;", "multiInstanceInvalidationIntent", "Landroid/content/Intent;", "Landroidx/room/MultiInstanceInvalidationClient;", "multiInstanceInvalidationClient", "Landroidx/room/MultiInstanceInvalidationClient;", "trackerLock", "Ljava/lang/Object;", com.taurusx.tax.f.y.f66058y, "Observer", "MultiInstanceClientInitState", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class InvalidationTracker {

    @Nullable
    private AutoCloser autoCloser;

    @NotNull
    private final RoomDatabase database;

    @NotNull
    private final TriggerBasedInvalidationTracker implementation;

    @NotNull
    private final InvalidationLiveDataContainer invalidationLiveDataContainer;

    @Nullable
    private MultiInstanceInvalidationClient multiInstanceInvalidationClient;

    @Nullable
    private Intent multiInstanceInvalidationIntent;

    @NotNull
    private final Map<Observer, ObserverWrapper> observerMap;

    @NotNull
    private final ReentrantLock observerMapLock;

    @NotNull
    private final Function0<Unit> onRefreshCompleted;

    @NotNull
    private final Function0<Unit> onRefreshScheduled;

    @NotNull
    private final Map<String, String> shadowTablesMap;

    @NotNull
    private final String[] tableNames;

    @NotNull
    private final Object trackerLock;

    @NotNull
    private final Map<String, Set<String>> viewTables;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Landroidx/room/InvalidationTracker$MultiInstanceClientInitState;", "", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "name", "", "serviceIntent", "Landroid/content/Intent;", "<init>", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;)V", "getContext", "()Landroid/content/Context;", "getName", "()Ljava/lang/String;", "getServiceIntent", "()Landroid/content/Intent;", "component1", "component2", "component3", MenuActionType.COPY, "equals", "", "other", "hashCode", "", "toString", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final /* data */ class MultiInstanceClientInitState {

        @NotNull
        private final Context context;

        @NotNull
        private final String name;

        @NotNull
        private final Intent serviceIntent;

        public MultiInstanceClientInitState(@NotNull Context context, @NotNull String name, @NotNull Intent serviceIntent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(serviceIntent, "serviceIntent");
            this.context = context;
            this.name = name;
            this.serviceIntent = serviceIntent;
        }

        public static /* synthetic */ MultiInstanceClientInitState copy$default(MultiInstanceClientInitState multiInstanceClientInitState, Context context, String str, Intent intent, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                context = multiInstanceClientInitState.context;
            }
            if ((i10 & 2) != 0) {
                str = multiInstanceClientInitState.name;
            }
            if ((i10 & 4) != 0) {
                intent = multiInstanceClientInitState.serviceIntent;
            }
            return multiInstanceClientInitState.copy(context, str, intent);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Context getContext() {
            return this.context;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Intent getServiceIntent() {
            return this.serviceIntent;
        }

        @NotNull
        public final MultiInstanceClientInitState copy(@NotNull Context context, @NotNull String name, @NotNull Intent serviceIntent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(serviceIntent, "serviceIntent");
            return new MultiInstanceClientInitState(context, name, serviceIntent);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MultiInstanceClientInitState)) {
                return false;
            }
            MultiInstanceClientInitState multiInstanceClientInitState = (MultiInstanceClientInitState) other;
            return Intrinsics.areEqual(this.context, multiInstanceClientInitState.context) && Intrinsics.areEqual(this.name, multiInstanceClientInitState.name) && Intrinsics.areEqual(this.serviceIntent, multiInstanceClientInitState.serviceIntent);
        }

        @NotNull
        public final Context getContext() {
            return this.context;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final Intent getServiceIntent() {
            return this.serviceIntent;
        }

        public int hashCode() {
            return (((this.context.hashCode() * 31) + this.name.hashCode()) * 31) + this.serviceIntent.hashCode();
        }

        @NotNull
        public String toString() {
            return "MultiInstanceClientInitState(context=" + this.context + ", name=" + this.name + ", serviceIntent=" + this.serviceIntent + ')';
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006B%\b\u0014\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004¢\u0006\u0004\b\u0005\u0010\tJ\u0016\u0010\r\u001a\u00020\u000e2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fH&R\u001e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\u00118PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/room/InvalidationTracker$Observer;", "", "tables", "", "", "<init>", "([Ljava/lang/String;)V", "firstTable", "rest", "(Ljava/lang/String;[Ljava/lang/String;)V", "getTables$room_runtime", "()[Ljava/lang/String;", "[Ljava/lang/String;", "onInvalidated", "", "", "isRemote", "", "isRemote$room_runtime", "()Z", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Observer {

        @NotNull
        private final String[] tables;

        public Observer(@NotNull String[] tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            this.tables = tables;
        }

        @NotNull
        /* JADX INFO: renamed from: getTables$room_runtime, reason: from getter */
        public final String[] getTables() {
            return this.tables;
        }

        public boolean isRemote$room_runtime() {
            return false;
        }

        public abstract void onInvalidated(@NotNull Set<String> tables);

        protected Observer(@NotNull String firstTable, @NotNull String... rest) {
            Intrinsics.checkNotNullParameter(firstTable, "firstTable");
            Intrinsics.checkNotNullParameter(rest, "rest");
            z0 z0Var = new z0(2);
            z0Var.a(firstTable);
            z0Var.b(rest);
            this((String[]) z0Var.d(new String[z0Var.c()]));
        }
    }

    /* JADX INFO: renamed from: androidx.room.InvalidationTracker$addObserver$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.room.InvalidationTracker$addObserver$1", f = "InvalidationTracker.android.kt", l = {253}, m = "invokeSuspend")
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.k implements Function2<CoroutineScope, Continuation, Object> {
        int label;

        AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return InvalidationTracker.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.d.b(obj);
                TriggerBasedInvalidationTracker triggerBasedInvalidationTracker = InvalidationTracker.this.implementation;
                this.label = 1;
                if (triggerBasedInvalidationTracker.syncTriggers$room_runtime(this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: androidx.room.InvalidationTracker$refreshVersionsSync$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.room.InvalidationTracker$refreshVersionsSync$1", f = "InvalidationTracker.android.kt", l = {345}, m = "invokeSuspend")
    static final class C16591 extends kotlin.coroutines.jvm.internal.k implements Function2<CoroutineScope, Continuation, Object> {
        int label;

        C16591(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return InvalidationTracker.this.new C16591(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.d.b(obj);
                Function0<Unit> function0 = InvalidationTracker.this.onRefreshScheduled;
                Function0<Unit> function02 = InvalidationTracker.this.onRefreshCompleted;
                this.label = 1;
                if (InvalidationTracker.this.implementation.refreshInvalidation$room_runtime(new String[0], function0, function02, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C16591) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: androidx.room.InvalidationTracker$removeObserver$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.room.InvalidationTracker$removeObserver$1", f = "InvalidationTracker.android.kt", l = {310}, m = "invokeSuspend")
    static final class C16601 extends kotlin.coroutines.jvm.internal.k implements Function2<CoroutineScope, Continuation, Object> {
        int label;

        C16601(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return InvalidationTracker.this.new C16601(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.d.b(obj);
                TriggerBasedInvalidationTracker triggerBasedInvalidationTracker = InvalidationTracker.this.implementation;
                this.label = 1;
                if (triggerBasedInvalidationTracker.syncTriggers$room_runtime(this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C16601) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public InvalidationTracker(@NotNull RoomDatabase database, @NotNull Map<String, String> shadowTablesMap, @NotNull Map<String, Set<String>> viewTables, @NotNull String... tableNames) {
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(shadowTablesMap, "shadowTablesMap");
        Intrinsics.checkNotNullParameter(viewTables, "viewTables");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        this.database = database;
        this.shadowTablesMap = shadowTablesMap;
        this.viewTables = viewTables;
        this.tableNames = tableNames;
        TriggerBasedInvalidationTracker triggerBasedInvalidationTracker = new TriggerBasedInvalidationTracker(database, shadowTablesMap, viewTables, tableNames, database.getUseTempTrackingTable(), new InvalidationTracker$implementation$1(this));
        this.implementation = triggerBasedInvalidationTracker;
        this.observerMap = new LinkedHashMap();
        this.observerMapLock = new ReentrantLock();
        this.onRefreshScheduled = new Function0() { // from class: androidx.room.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InvalidationTracker.onRefreshScheduled$lambda$0(this.f5403b);
            }
        };
        this.onRefreshCompleted = new Function0() { // from class: androidx.room.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InvalidationTracker.onRefreshCompleted$lambda$1(this.f5404b);
            }
        };
        this.invalidationLiveDataContainer = new InvalidationLiveDataContainer(database);
        this.trackerLock = new Object();
        triggerBasedInvalidationTracker.setOnAllowRefresh$room_runtime(new Function0() { // from class: androidx.room.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(InvalidationTracker._init_$lambda$2(this.f5405b));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$2(InvalidationTracker invalidationTracker) {
        return !invalidationTracker.database.inCompatibilityMode() || invalidationTracker.database.isOpenInternal$room_runtime();
    }

    private final boolean addObserverOnly(Observer observer) {
        Pair<String[], int[]> pairValidateTableNames$room_runtime = this.implementation.validateTableNames$room_runtime(observer.getTables());
        String[] strArrComponent1 = pairValidateTableNames$room_runtime.component1();
        int[] iArrComponent2 = pairValidateTableNames$room_runtime.component2();
        ObserverWrapper observerWrapper = new ObserverWrapper(observer, iArrComponent2, strArrComponent1);
        ReentrantLock reentrantLock = this.observerMapLock;
        reentrantLock.lock();
        try {
            ObserverWrapper observerWrapperPut = this.observerMap.containsKey(observer) ? (ObserverWrapper) MapsKt.getValue(this.observerMap, observer) : this.observerMap.put(observer, observerWrapper);
            reentrantLock.unlock();
            return observerWrapperPut == null && this.implementation.onObserverAdded$room_runtime(iArrComponent2);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public static /* synthetic */ Flow createFlow$default(InvalidationTracker invalidationTracker, String[] strArr, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createFlow");
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return invalidationTracker.createFlow(strArr, z10);
    }

    private final List<Observer> getAllObservers() {
        ReentrantLock reentrantLock = this.observerMapLock;
        reentrantLock.lock();
        try {
            return CollectionsKt.toList(this.observerMap.keySet());
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyInvalidatedObservers(Set<Integer> tableIds) {
        ReentrantLock reentrantLock = this.observerMapLock;
        reentrantLock.lock();
        try {
            List list = CollectionsKt.toList(this.observerMap.values());
            reentrantLock.unlock();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((ObserverWrapper) it.next()).notifyByTableIds$room_runtime(tableIds);
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAutoCloseCallback() {
        synchronized (this.trackerLock) {
            try {
                MultiInstanceInvalidationClient multiInstanceInvalidationClient = this.multiInstanceInvalidationClient;
                if (multiInstanceInvalidationClient != null) {
                    List<Observer> allObservers = getAllObservers();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : allObservers) {
                        if (!((Observer) obj).isRemote$room_runtime()) {
                            arrayList.add(obj);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        multiInstanceInvalidationClient.stop();
                    }
                }
                this.implementation.resetSync$room_runtime();
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onRefreshCompleted$lambda$1(InvalidationTracker invalidationTracker) {
        AutoCloser autoCloser = invalidationTracker.autoCloser;
        if (autoCloser != null) {
            autoCloser.decrementCountAndScheduleClose();
        }
        return Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onRefreshScheduled$lambda$0(InvalidationTracker invalidationTracker) {
        AutoCloser autoCloser = invalidationTracker.autoCloser;
        if (autoCloser != null) {
            autoCloser.incrementCountAndEnsureDbIsOpen();
        }
        return Unit.f93236a;
    }

    private final boolean removeObserverOnly(Observer observer) {
        ReentrantLock reentrantLock = this.observerMapLock;
        reentrantLock.lock();
        try {
            ObserverWrapper observerWrapperRemove = this.observerMap.remove(observer);
            return observerWrapperRemove != null && this.implementation.onObserverRemoved$room_runtime(observerWrapperRemove.getTableIds());
        } finally {
            reentrantLock.unlock();
        }
    }

    @WorkerThread
    public void addObserver(@NotNull Observer observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        if (addObserverOnly(observer)) {
            RunBlockingUninterruptible_androidKt.runBlockingUninterruptible(new AnonymousClass1(null));
        }
    }

    public final void addRemoteObserver$room_runtime(@NotNull Observer observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        if (!observer.isRemote$room_runtime()) {
            throw new IllegalStateException("isRemote was false of observer argument");
        }
        addObserverOnly(observer);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @WorkerThread
    public void addWeakObserver(@NotNull Observer observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        addObserver(new WeakObserver(this, observer));
    }

    @NotNull
    public final Flow createFlow(@NotNull String... tables) {
        Intrinsics.checkNotNullParameter(tables, "tables");
        return createFlow$default(this, tables, false, 2, null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @NotNull
    public <T> LiveData<T> createLiveData(@NotNull String[] tableNames, @NotNull Callable<T> computeFunction) {
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        Intrinsics.checkNotNullParameter(computeFunction, "computeFunction");
        return createLiveData(tableNames, false, (Callable) computeFunction);
    }

    @NotNull
    /* JADX INFO: renamed from: getDatabase$room_runtime, reason: from getter */
    public final RoomDatabase getDatabase() {
        return this.database;
    }

    @NotNull
    /* JADX INFO: renamed from: getTableNames$room_runtime, reason: from getter */
    public final String[] getTableNames() {
        return this.tableNames;
    }

    public final void initMultiInstanceInvalidation$room_runtime(@NotNull Context context, @NotNull String name, @NotNull Intent serviceIntent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(serviceIntent, "serviceIntent");
        this.multiInstanceInvalidationIntent = serviceIntent;
        this.multiInstanceInvalidationClient = new MultiInstanceInvalidationClient(context, name, this);
    }

    public final void internalInit$room_runtime(@NotNull SQLiteConnection connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.implementation.configureConnection(connection);
        synchronized (this.trackerLock) {
            try {
                MultiInstanceInvalidationClient multiInstanceInvalidationClient = this.multiInstanceInvalidationClient;
                if (multiInstanceInvalidationClient != null) {
                    Intent intent = this.multiInstanceInvalidationIntent;
                    if (intent == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    multiInstanceInvalidationClient.start(intent);
                    Unit unit = Unit.f93236a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void notifyObserversByTableNames$room_runtime(@NotNull Set<String> tables) {
        Intrinsics.checkNotNullParameter(tables, "tables");
        ReentrantLock reentrantLock = this.observerMapLock;
        reentrantLock.lock();
        try {
            List<ObserverWrapper> list = CollectionsKt.toList(this.observerMap.values());
            reentrantLock.unlock();
            for (ObserverWrapper observerWrapper : list) {
                if (!observerWrapper.getObserver().isRemote$room_runtime()) {
                    observerWrapper.notifyByTableNames$room_runtime(tables);
                }
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public final Object refresh(@NotNull String[] strArr, @NotNull Continuation continuation) {
        return this.implementation.refreshInvalidation$room_runtime(strArr, this.onRefreshScheduled, this.onRefreshCompleted, continuation);
    }

    public final void refreshAsync() {
        this.implementation.refreshInvalidationAsync$room_runtime(this.onRefreshScheduled, this.onRefreshCompleted);
    }

    public void refreshVersionsAsync() {
        this.implementation.refreshInvalidationAsync$room_runtime(this.onRefreshScheduled, this.onRefreshCompleted);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @WorkerThread
    public void refreshVersionsSync() {
        RunBlockingUninterruptible_androidKt.runBlockingUninterruptible(new C16591(null));
    }

    @WorkerThread
    public void removeObserver(@NotNull Observer observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        if (removeObserverOnly(observer)) {
            RunBlockingUninterruptible_androidKt.runBlockingUninterruptible(new C16601(null));
        }
    }

    public final void setAutoCloser$room_runtime(@NotNull AutoCloser autoCloser) {
        Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
        this.autoCloser = autoCloser;
        autoCloser.setAutoCloseCallback(new InvalidationTracker$setAutoCloser$1(this));
    }

    public final void stop$room_runtime() {
        MultiInstanceInvalidationClient multiInstanceInvalidationClient = this.multiInstanceInvalidationClient;
        if (multiInstanceInvalidationClient != null) {
            multiInstanceInvalidationClient.stop();
        }
    }

    @Nullable
    public final Object sync$room_runtime(@NotNull Continuation continuation) throws Throwable {
        Object objSyncTriggers$room_runtime = this.implementation.syncTriggers$room_runtime(continuation);
        return objSyncTriggers$room_runtime == pf.b.g() ? objSyncTriggers$room_runtime : Unit.f93236a;
    }

    @WorkerThread
    public final void syncBlocking$room_runtime() {
        RunBlockingUninterruptible_androidKt.runBlockingUninterruptible(new InvalidationTracker$syncBlocking$1(this, null));
    }

    @NotNull
    public final Flow createFlow(@NotNull String[] tables, boolean emitInitialState) {
        Intrinsics.checkNotNullParameter(tables, "tables");
        Pair<String[], int[]> pairValidateTableNames$room_runtime = this.implementation.validateTableNames$room_runtime(tables);
        String[] strArrComponent1 = pairValidateTableNames$room_runtime.component1();
        Flow flowCreateFlow$room_runtime = this.implementation.createFlow$room_runtime(strArrComponent1, pairValidateTableNames$room_runtime.component2(), emitInitialState);
        MultiInstanceInvalidationClient multiInstanceInvalidationClient = this.multiInstanceInvalidationClient;
        Flow flowCreateFlow = multiInstanceInvalidationClient != null ? multiInstanceInvalidationClient.createFlow(strArrComponent1) : null;
        return flowCreateFlow != null ? hg.i.I(flowCreateFlow$room_runtime, flowCreateFlow) : flowCreateFlow$room_runtime;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @NotNull
    public <T> LiveData<T> createLiveData(@NotNull String[] tableNames, boolean inTransaction, @NotNull Callable<T> computeFunction) {
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        Intrinsics.checkNotNullParameter(computeFunction, "computeFunction");
        this.implementation.validateTableNames$room_runtime(tableNames);
        return this.invalidationLiveDataContainer.create(tableNames, inTransaction, computeFunction);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @NotNull
    public final <T> LiveData<T> createLiveData(@NotNull String[] tableNames, boolean inTransaction, @NotNull Function1<? super SQLiteConnection, ? extends T> computeFunction) {
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        Intrinsics.checkNotNullParameter(computeFunction, "computeFunction");
        this.implementation.validateTableNames$room_runtime(tableNames);
        return this.invalidationLiveDataContainer.create(tableNames, inTransaction, computeFunction);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public InvalidationTracker(@NotNull RoomDatabase database, @NotNull String... tableNames) {
        this(database, MapsKt.emptyMap(), MapsKt.emptyMap(), (String[]) Arrays.copyOf(tableNames, tableNames.length));
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
    }
}
