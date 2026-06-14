package com.unity3d.services.core.device;

import com.taurusx.tax.f.y;
import com.unity3d.services.core.device.StorageManager;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.JsonStorage;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import hg.l0;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0016\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\u0006\u0010\u000b\u001a\u00020\nJ\b\u0010\f\u001a\u00020\nH\u0016J\u001a\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u0006\u0010\u0013\u001a\u00020\nJ\b\u0010\u0014\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/unity3d/services/core/device/Storage;", "Lcom/unity3d/services/core/misc/JsonStorage;", "_targetFileName", "", "type", "Lcom/unity3d/services/core/device/StorageManager$StorageType;", "(Ljava/lang/String;Lcom/unity3d/services/core/device/StorageManager$StorageType;)V", "getType", "()Lcom/unity3d/services/core/device/StorageManager$StorageType;", "clearStorage", "", "initStorage", "readStorage", "sendEvent", "", "eventType", "Lcom/unity3d/services/core/device/StorageEvent;", "value", "", "storageFileExists", "writeStorage", y.f66058y, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class Storage extends JsonStorage {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final MutableStateFlow onStorageEventCallbacks = l0.a(CollectionsKt.emptyList());

    @NotNull
    private final String _targetFileName;

    @NotNull
    private final StorageManager.StorageType type;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\t\u001a\u00020\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006J\u001a\u0010\u000b\u001a\u00020\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006R&\u0010\u0003\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/unity3d/services/core/device/Storage$Companion;", "", "()V", "onStorageEventCallbacks", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lkotlin/Function1;", "Lcom/unity3d/services/core/device/StorageEventInfo;", "", "addStorageEventCallback", "callback", "removeStorageEventCallback", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void addStorageEventCallback(@NotNull Function1<? super StorageEventInfo, Unit> callback) {
            Object value;
            Intrinsics.checkNotNullParameter(callback, "callback");
            MutableStateFlow mutableStateFlow = Storage.onStorageEventCallbacks;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.b(value, CollectionsKt.plus((Collection<? extends Function1<? super StorageEventInfo, Unit>>) value, callback)));
        }

        public final void removeStorageEventCallback(@NotNull Function1<? super StorageEventInfo, Unit> callback) {
            Object value;
            Intrinsics.checkNotNullParameter(callback, "callback");
            MutableStateFlow mutableStateFlow = Storage.onStorageEventCallbacks;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.b(value, CollectionsKt.minus((List) value, callback)));
        }

        private Companion() {
        }
    }

    public Storage(@NotNull String _targetFileName, @NotNull StorageManager.StorageType type) {
        Intrinsics.checkNotNullParameter(_targetFileName, "_targetFileName");
        Intrinsics.checkNotNullParameter(type, "type");
        this._targetFileName = _targetFileName;
        this.type = type;
    }

    public synchronized boolean clearStorage() {
        clearData();
        return new File(this._targetFileName).delete();
    }

    @NotNull
    public final StorageManager.StorageType getType() {
        return this.type;
    }

    public final synchronized boolean initStorage() {
        readStorage();
        super.initData();
        return true;
    }

    public synchronized boolean readStorage() {
        byte[] fileBytes;
        boolean z10 = true;
        synchronized (this) {
            try {
                try {
                    fileBytes = Utilities.readFileBytes(new File(this._targetFileName));
                } catch (Exception e10) {
                    DeviceLog.debug("Failed to read storage JSON file:", e10);
                }
            } catch (FileNotFoundException e11) {
                DeviceLog.debug("Storage JSON file not found in local cache:", e11);
            }
            if (fileBytes == null) {
                return false;
            }
            setData(new JSONObject(new String(fileBytes, Charsets.UTF_8)));
            return z10;
            z10 = false;
            return z10;
        }
    }

    public final synchronized void sendEvent(@Nullable StorageEvent eventType, @Nullable Object value) {
        synchronized (this) {
            List list = (List) onStorageEventCallbacks.getValue();
            if (list.isEmpty()) {
                if (!(WebViewApp.getCurrentApp() != null ? WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.STORAGE, eventType, this.type.name(), value) : false)) {
                    DeviceLog.debug("Couldn't send storage event to WebApp");
                }
                return;
            }
            Intrinsics.checkNotNull(eventType);
            StorageEventInfo storageEventInfo = new StorageEventInfo(eventType, this.type, value);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((Function1) it.next()).invoke(storageEventInfo);
            }
        }
    }

    public final synchronized boolean storageFileExists() {
        return new File(this._targetFileName).exists();
    }

    public synchronized boolean writeStorage() {
        File file = new File(this._targetFileName);
        if (getData() == null) {
            return false;
        }
        return Utilities.writeFile(file, getData().toString());
    }
}
