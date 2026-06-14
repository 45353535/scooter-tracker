package com.google.firebase;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArrayMap;
import androidx.core.os.UserManagerCompat;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentDiscovery;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRuntime;
import com.google.firebase.components.Lazy;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.concurrent.UiExecutor;
import com.google.firebase.events.Publisher;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.inject.Provider;
import com.google.firebase.internal.DataCollectionConfigStorage;
import com.google.firebase.provider.FirebaseInitProvider;
import com.google.firebase.tracing.ComponentMonitor;
import com.google.firebase.tracing.FirebaseTrace;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public class FirebaseApp {

    @NonNull
    public static final String DEFAULT_APP_NAME = "[DEFAULT]";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Object f31677k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final Map f31678l = new ArrayMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f31679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f31680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FirebaseOptions f31681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ComponentRuntime f31682d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Lazy f31685g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Provider f31686h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f31683e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f31684f = new AtomicBoolean();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f31687i = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f31688j = new CopyOnWriteArrayList();

    @KeepForSdk
    public interface BackgroundStateChangeListener {
        @KeepForSdk
        void onBackgroundStateChanged(boolean z10);
    }

    @TargetApi(14)
    private static class GlobalBackgroundStateListener implements BackgroundDetector.BackgroundStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static AtomicReference f31689a = new AtomicReference();

        private GlobalBackgroundStateListener() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            if (PlatformVersion.isAtLeastIceCreamSandwich() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f31689a.get() == null) {
                    GlobalBackgroundStateListener globalBackgroundStateListener = new GlobalBackgroundStateListener();
                    if (androidx.compose.animation.core.c.a(f31689a, null, globalBackgroundStateListener)) {
                        BackgroundDetector.initialize(application);
                        BackgroundDetector.getInstance().addListener(globalBackgroundStateListener);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public void onBackgroundStateChanged(boolean z10) {
            synchronized (FirebaseApp.f31677k) {
                try {
                    for (FirebaseApp firebaseApp : new ArrayList(FirebaseApp.f31678l.values())) {
                        if (firebaseApp.f31683e.get()) {
                            firebaseApp.k(z10);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @TargetApi(24)
    private static class UserUnlockReceiver extends BroadcastReceiver {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static AtomicReference f31690b = new AtomicReference();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f31691a;

        public UserUnlockReceiver(Context context) {
            this.f31691a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            if (f31690b.get() == null) {
                UserUnlockReceiver userUnlockReceiver = new UserUnlockReceiver(context);
                if (androidx.compose.animation.core.c.a(f31690b, null, userUnlockReceiver)) {
                    context.registerReceiver(userUnlockReceiver, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (FirebaseApp.f31677k) {
                try {
                    Iterator it = FirebaseApp.f31678l.values().iterator();
                    while (it.hasNext()) {
                        ((FirebaseApp) it.next()).i();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            unregister();
        }

        public void unregister() {
            this.f31691a.unregisterReceiver(this);
        }
    }

    protected FirebaseApp(final Context context, String str, FirebaseOptions firebaseOptions) {
        this.f31679a = (Context) Preconditions.checkNotNull(context);
        this.f31680b = Preconditions.checkNotEmpty(str);
        this.f31681c = (FirebaseOptions) Preconditions.checkNotNull(firebaseOptions);
        StartupTime startupTime = FirebaseInitProvider.getStartupTime();
        FirebaseTrace.pushTrace("Firebase");
        FirebaseTrace.pushTrace("ComponentDiscovery");
        List<Provider<ComponentRegistrar>> listDiscoverLazy = ComponentDiscovery.forContext(context, ComponentDiscoveryService.class).discoverLazy();
        FirebaseTrace.popTrace();
        FirebaseTrace.pushTrace("Runtime");
        ComponentRuntime.Builder processor = ComponentRuntime.builder(UiExecutor.INSTANCE).addLazyComponentRegistrars(listDiscoverLazy).addComponentRegistrar(new FirebaseCommonRegistrar()).addComponentRegistrar(new ExecutorsRegistrar()).addComponent(Component.of(context, (Class<Context>) Context.class, (Class<? super Context>[]) new Class[0])).addComponent(Component.of(this, (Class<FirebaseApp>) FirebaseApp.class, (Class<? super FirebaseApp>[]) new Class[0])).addComponent(Component.of(firebaseOptions, (Class<FirebaseOptions>) FirebaseOptions.class, (Class<? super FirebaseOptions>[]) new Class[0])).setProcessor(new ComponentMonitor());
        if (UserManagerCompat.isUserUnlocked(context) && FirebaseInitProvider.isCurrentlyInitializing()) {
            processor.addComponent(Component.of(startupTime, (Class<StartupTime>) StartupTime.class, (Class<? super StartupTime>[]) new Class[0]));
        }
        ComponentRuntime componentRuntimeBuild = processor.build();
        this.f31682d = componentRuntimeBuild;
        FirebaseTrace.popTrace();
        this.f31685g = new Lazy(new Provider() { // from class: com.google.firebase.a
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                return FirebaseApp.b(this.f31709a, context);
            }
        });
        this.f31686h = componentRuntimeBuild.getProvider(DefaultHeartBeatController.class);
        addBackgroundStateChangeListener(new BackgroundStateChangeListener() { // from class: com.google.firebase.b
            @Override // com.google.firebase.FirebaseApp.BackgroundStateChangeListener
            public final void onBackgroundStateChanged(boolean z10) {
                FirebaseApp.a(this.f31763a, z10);
            }
        });
        FirebaseTrace.popTrace();
    }

    public static /* synthetic */ void a(FirebaseApp firebaseApp, boolean z10) {
        if (z10) {
            firebaseApp.getClass();
        } else {
            ((DefaultHeartBeatController) firebaseApp.f31686h.get()).registerHeartBeat();
        }
    }

    public static /* synthetic */ DataCollectionConfigStorage b(FirebaseApp firebaseApp, Context context) {
        return new DataCollectionConfigStorage(context, firebaseApp.getPersistenceKey(), (Publisher) firebaseApp.f31682d.get(Publisher.class));
    }

    @VisibleForTesting
    public static void clearInstancesForTest() {
        synchronized (f31677k) {
            f31678l.clear();
        }
    }

    private void g() {
        Preconditions.checkState(!this.f31684f.get(), "FirebaseApp was deleted");
    }

    @NonNull
    public static List<FirebaseApp> getApps(@NonNull Context context) {
        ArrayList arrayList;
        synchronized (f31677k) {
            arrayList = new ArrayList(f31678l.values());
        }
        return arrayList;
    }

    @NonNull
    public static FirebaseApp getInstance() {
        FirebaseApp firebaseApp;
        synchronized (f31677k) {
            try {
                firebaseApp = (FirebaseApp) f31678l.get(DEFAULT_APP_NAME);
                if (firebaseApp == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.getMyProcessName() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((DefaultHeartBeatController) firebaseApp.f31686h.get()).registerHeartBeat();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return firebaseApp;
    }

    private static List h() {
        ArrayList arrayList = new ArrayList();
        synchronized (f31677k) {
            try {
                Iterator it = f31678l.values().iterator();
                while (it.hasNext()) {
                    arrayList.add(((FirebaseApp) it.next()).getName());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (!UserManagerCompat.isUserUnlocked(this.f31679a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + getName());
            UserUnlockReceiver.b(this.f31679a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + getName());
        this.f31682d.initializeEagerComponents(isDefaultApp());
        ((DefaultHeartBeatController) this.f31686h.get()).registerHeartBeat();
    }

    @Nullable
    public static FirebaseApp initializeApp(@NonNull Context context) {
        synchronized (f31677k) {
            try {
                if (f31678l.containsKey(DEFAULT_APP_NAME)) {
                    return getInstance();
                }
                FirebaseOptions firebaseOptionsFromResource = FirebaseOptions.fromResource(context);
                if (firebaseOptionsFromResource == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return initializeApp(context, firebaseOptionsFromResource);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static String j(String str) {
        return str.trim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(boolean z10) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator it = this.f31687i.iterator();
        while (it.hasNext()) {
            ((BackgroundStateChangeListener) it.next()).onBackgroundStateChanged(z10);
        }
    }

    private void l() {
        Iterator it = this.f31688j.iterator();
        while (it.hasNext()) {
            ((FirebaseAppLifecycleListener) it.next()).onDeleted(this.f31680b, this.f31681c);
        }
    }

    @KeepForSdk
    public void addBackgroundStateChangeListener(BackgroundStateChangeListener backgroundStateChangeListener) {
        g();
        if (this.f31683e.get() && BackgroundDetector.getInstance().isInBackground()) {
            backgroundStateChangeListener.onBackgroundStateChanged(true);
        }
        this.f31687i.add(backgroundStateChangeListener);
    }

    @KeepForSdk
    public void addLifecycleEventListener(@NonNull FirebaseAppLifecycleListener firebaseAppLifecycleListener) {
        g();
        Preconditions.checkNotNull(firebaseAppLifecycleListener);
        this.f31688j.add(firebaseAppLifecycleListener);
    }

    public void delete() {
        if (this.f31684f.compareAndSet(false, true)) {
            synchronized (f31677k) {
                f31678l.remove(this.f31680b);
            }
            l();
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof FirebaseApp) {
            return this.f31680b.equals(((FirebaseApp) obj).getName());
        }
        return false;
    }

    @KeepForSdk
    public <T> T get(Class<T> cls) {
        g();
        return (T) this.f31682d.get(cls);
    }

    @NonNull
    public Context getApplicationContext() {
        g();
        return this.f31679a;
    }

    @NonNull
    public String getName() {
        g();
        return this.f31680b;
    }

    @NonNull
    public FirebaseOptions getOptions() {
        g();
        return this.f31681c;
    }

    @KeepForSdk
    public String getPersistenceKey() {
        return Base64Utils.encodeUrlSafeNoPadding(getName().getBytes(Charset.defaultCharset())) + "+" + Base64Utils.encodeUrlSafeNoPadding(getOptions().getApplicationId().getBytes(Charset.defaultCharset()));
    }

    public int hashCode() {
        return this.f31680b.hashCode();
    }

    @KeepForSdk
    public boolean isDataCollectionDefaultEnabled() {
        g();
        return ((DataCollectionConfigStorage) this.f31685g.get()).isEnabled();
    }

    @KeepForSdk
    @VisibleForTesting
    public boolean isDefaultApp() {
        return DEFAULT_APP_NAME.equals(getName());
    }

    @KeepForSdk
    public void removeBackgroundStateChangeListener(BackgroundStateChangeListener backgroundStateChangeListener) {
        g();
        this.f31687i.remove(backgroundStateChangeListener);
    }

    @KeepForSdk
    public void removeLifecycleEventListener(@NonNull FirebaseAppLifecycleListener firebaseAppLifecycleListener) {
        g();
        Preconditions.checkNotNull(firebaseAppLifecycleListener);
        this.f31688j.remove(firebaseAppLifecycleListener);
    }

    public void setAutomaticResourceManagementEnabled(boolean z10) {
        g();
        if (this.f31683e.compareAndSet(!z10, z10)) {
            boolean zIsInBackground = BackgroundDetector.getInstance().isInBackground();
            if (z10 && zIsInBackground) {
                k(true);
            } else {
                if (z10 || !zIsInBackground) {
                    return;
                }
                k(false);
            }
        }
    }

    @KeepForSdk
    public void setDataCollectionDefaultEnabled(Boolean bool) {
        g();
        ((DataCollectionConfigStorage) this.f31685g.get()).setEnabled(bool);
    }

    public String toString() {
        return Objects.toStringHelper(this).add("name", this.f31680b).add("options", this.f31681c).toString();
    }

    @KeepForSdk
    @Deprecated
    public void setDataCollectionDefaultEnabled(boolean z10) {
        setDataCollectionDefaultEnabled(Boolean.valueOf(z10));
    }

    @KeepForSdk
    public static String getPersistenceKey(String str, FirebaseOptions firebaseOptions) {
        return Base64Utils.encodeUrlSafeNoPadding(str.getBytes(Charset.defaultCharset())) + "+" + Base64Utils.encodeUrlSafeNoPadding(firebaseOptions.getApplicationId().getBytes(Charset.defaultCharset()));
    }

    @NonNull
    public static FirebaseApp getInstance(@NonNull String str) {
        FirebaseApp firebaseApp;
        String str2;
        synchronized (f31677k) {
            try {
                firebaseApp = (FirebaseApp) f31678l.get(j(str));
                if (firebaseApp != null) {
                    ((DefaultHeartBeatController) firebaseApp.f31686h.get()).registerHeartBeat();
                } else {
                    List listH = h();
                    if (listH.isEmpty()) {
                        str2 = "";
                    } else {
                        str2 = "Available app names: " + TextUtils.join(", ", listH);
                    }
                    throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", str, str2));
                }
            } finally {
            }
        }
        return firebaseApp;
    }

    @NonNull
    public static FirebaseApp initializeApp(@NonNull Context context, @NonNull FirebaseOptions firebaseOptions) {
        return initializeApp(context, firebaseOptions, DEFAULT_APP_NAME);
    }

    @NonNull
    public static FirebaseApp initializeApp(@NonNull Context context, @NonNull FirebaseOptions firebaseOptions, @NonNull String str) {
        FirebaseApp firebaseApp;
        GlobalBackgroundStateListener.b(context);
        String strJ = j(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f31677k) {
            Map map = f31678l;
            Preconditions.checkState(!map.containsKey(strJ), "FirebaseApp name " + strJ + " already exists!");
            Preconditions.checkNotNull(context, "Application context cannot be null.");
            firebaseApp = new FirebaseApp(context, strJ, firebaseOptions);
            map.put(strJ, firebaseApp);
        }
        firebaseApp.i();
        return firebaseApp;
    }
}
