package com.google.firebase.crashlytics.internal.metadata;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public class UserMetadata {
    public static final String INTERNAL_KEYDATA_FILENAME = "internal-keys";
    public static final String KEYDATA_FILENAME = "keys";

    @VisibleForTesting
    public static final int MAX_ATTRIBUTES = 64;

    @VisibleForTesting
    public static final int MAX_ATTRIBUTE_SIZE = 1024;

    @VisibleForTesting
    public static final int MAX_INTERNAL_KEY_SIZE = 8192;

    @VisibleForTesting
    public static final int MAX_ROLLOUT_ASSIGNMENTS = 128;
    public static final String ROLLOUTS_STATE_FILENAME = "rollouts-state";
    public static final String USERDATA_FILENAME = "user-data";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MetaDataStore f32206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CrashlyticsWorkers f32207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f32208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SerializeableKeysMap f32209d = new SerializeableKeysMap(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SerializeableKeysMap f32210e = new SerializeableKeysMap(true);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final RolloutAssignmentList f32211f = new RolloutAssignmentList(128);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicMarkableReference f32212g = new AtomicMarkableReference(null, false);

    /* JADX INFO: Access modifiers changed from: private */
    class SerializeableKeysMap {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicMarkableReference f32213a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicReference f32214b = new AtomicReference(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f32215c;

        public SerializeableKeysMap(boolean z10) {
            this.f32215c = z10;
            this.f32213a = new AtomicMarkableReference(new KeysMap(64, z10 ? 8192 : 1024), false);
        }

        public static /* synthetic */ void a(SerializeableKeysMap serializeableKeysMap) throws Throwable {
            serializeableKeysMap.f32214b.set(null);
            serializeableKeysMap.c();
        }

        private void b() {
            Runnable runnable = new Runnable() { // from class: com.google.firebase.crashlytics.internal.metadata.d
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    UserMetadata.SerializeableKeysMap.a(this.f32224b);
                }
            };
            if (androidx.compose.animation.core.c.a(this.f32214b, null, runnable)) {
                UserMetadata.this.f32207b.diskWrite.submit(runnable);
            }
        }

        private void c() throws Throwable {
            Map<String, String> keys;
            synchronized (this) {
                try {
                    if (this.f32213a.isMarked()) {
                        keys = ((KeysMap) this.f32213a.getReference()).getKeys();
                        AtomicMarkableReference atomicMarkableReference = this.f32213a;
                        atomicMarkableReference.set((KeysMap) atomicMarkableReference.getReference(), false);
                    } else {
                        keys = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (keys != null) {
                UserMetadata.this.f32206a.writeKeyData(UserMetadata.this.f32208c, keys, this.f32215c);
            }
        }

        public Map<String, String> getKeys() {
            return ((KeysMap) this.f32213a.getReference()).getKeys();
        }

        public boolean setKey(String str, String str2) {
            synchronized (this) {
                try {
                    if (!((KeysMap) this.f32213a.getReference()).setKey(str, str2)) {
                        return false;
                    }
                    AtomicMarkableReference atomicMarkableReference = this.f32213a;
                    atomicMarkableReference.set((KeysMap) atomicMarkableReference.getReference(), true);
                    b();
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void setKeys(Map<String, String> map) {
            synchronized (this) {
                ((KeysMap) this.f32213a.getReference()).setKeys(map);
                AtomicMarkableReference atomicMarkableReference = this.f32213a;
                atomicMarkableReference.set((KeysMap) atomicMarkableReference.getReference(), true);
            }
            b();
        }
    }

    public UserMetadata(String str, FileStore fileStore, CrashlyticsWorkers crashlyticsWorkers) {
        this.f32208c = str;
        this.f32206a = new MetaDataStore(fileStore);
        this.f32207b = crashlyticsWorkers;
    }

    public static /* synthetic */ void c(UserMetadata userMetadata, String str, Map map, List list) throws Throwable {
        if (userMetadata.getUserId() != null) {
            userMetadata.f32206a.writeUserData(str, userMetadata.getUserId());
        }
        if (!map.isEmpty()) {
            userMetadata.f32206a.writeKeyData(str, map);
        }
        if (list.isEmpty()) {
            return;
        }
        userMetadata.f32206a.writeRolloutState(str, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() throws Throwable {
        boolean z10;
        String userId;
        synchronized (this.f32212g) {
            try {
                z10 = false;
                if (this.f32212g.isMarked()) {
                    userId = getUserId();
                    this.f32212g.set(userId, false);
                    z10 = true;
                } else {
                    userId = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            this.f32206a.writeUserData(this.f32208c, userId);
        }
    }

    public static UserMetadata loadFromExistingSession(String str, FileStore fileStore, CrashlyticsWorkers crashlyticsWorkers) {
        MetaDataStore metaDataStore = new MetaDataStore(fileStore);
        UserMetadata userMetadata = new UserMetadata(str, fileStore, crashlyticsWorkers);
        ((KeysMap) userMetadata.f32209d.f32213a.getReference()).setKeys(metaDataStore.e(str, false));
        ((KeysMap) userMetadata.f32210e.f32213a.getReference()).setKeys(metaDataStore.e(str, true));
        userMetadata.f32212g.set(metaDataStore.readUserId(str), false);
        userMetadata.f32211f.updateRolloutAssignmentList(metaDataStore.readRolloutsState(str));
        return userMetadata;
    }

    @Nullable
    public static String readUserId(String str, FileStore fileStore) {
        return new MetaDataStore(fileStore).readUserId(str);
    }

    public Map<String, String> getCustomKeys(Map<String, String> map) {
        if (map.isEmpty()) {
            return this.f32209d.getKeys();
        }
        HashMap map2 = new HashMap(this.f32209d.getKeys());
        int i10 = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String strSanitizeString = KeysMap.sanitizeString(entry.getKey(), 1024);
            if (map2.size() < 64 || map2.containsKey(strSanitizeString)) {
                map2.put(strSanitizeString, KeysMap.sanitizeString(entry.getValue(), 1024));
            } else {
                i10++;
            }
        }
        if (i10 > 0) {
            Logger.getLogger().w("Ignored " + i10 + " keys when adding event specific keys. Maximum allowable: 1024");
        }
        return DesugarCollections.unmodifiableMap(map2);
    }

    public Map<String, String> getInternalKeys() {
        return this.f32210e.getKeys();
    }

    public List<CrashlyticsReport.Session.Event.RolloutAssignment> getRolloutsState() {
        return this.f32211f.getReportRolloutsState();
    }

    @Nullable
    public String getUserId() {
        return (String) this.f32212g.getReference();
    }

    public boolean setCustomKey(String str, String str2) {
        return this.f32209d.setKey(str, str2);
    }

    public void setCustomKeys(Map<String, String> map) {
        this.f32209d.setKeys(map);
    }

    public boolean setInternalKey(String str, String str2) {
        return this.f32210e.setKey(str, str2);
    }

    public void setNewSession(final String str) {
        synchronized (this.f32208c) {
            this.f32208c = str;
            final Map<String, String> keys = this.f32209d.getKeys();
            final List<RolloutAssignment> rolloutAssignmentList = this.f32211f.getRolloutAssignmentList();
            this.f32207b.diskWrite.submit(new Runnable() { // from class: com.google.firebase.crashlytics.internal.metadata.b
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    UserMetadata.c(this.f32219b, str, keys, rolloutAssignmentList);
                }
            });
        }
    }

    public void setUserId(String str) {
        String strSanitizeString = KeysMap.sanitizeString(str, 1024);
        synchronized (this.f32212g) {
            try {
                if (CommonUtils.nullSafeEquals(strSanitizeString, (String) this.f32212g.getReference())) {
                    return;
                }
                this.f32212g.set(strSanitizeString, true);
                this.f32207b.diskWrite.submit(new Runnable() { // from class: com.google.firebase.crashlytics.internal.metadata.c
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        this.f32223b.g();
                    }
                });
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @CanIgnoreReturnValue
    public boolean updateRolloutsState(List<RolloutAssignment> list) {
        synchronized (this.f32211f) {
            try {
                if (!this.f32211f.updateRolloutAssignmentList(list)) {
                    return false;
                }
                final List<RolloutAssignment> rolloutAssignmentList = this.f32211f.getRolloutAssignmentList();
                this.f32207b.diskWrite.submit(new Runnable() { // from class: com.google.firebase.crashlytics.internal.metadata.a
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        UserMetadata userMetadata = this.f32217b;
                        userMetadata.f32206a.writeRolloutState(userMetadata.f32208c, rolloutAssignmentList);
                    }
                });
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Map<String, String> getCustomKeys() {
        return this.f32209d.getKeys();
    }
}
