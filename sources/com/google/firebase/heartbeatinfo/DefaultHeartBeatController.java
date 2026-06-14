package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.util.Base64OutputStream;
import androidx.annotation.NonNull;
import androidx.core.os.UserManagerCompat;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Lazy;
import com.google.firebase.components.Qualified;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.inject.Provider;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class DefaultHeartBeatController implements HeartBeatController, HeartBeatInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f32807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f32808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f32809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f32810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f32811e;

    private DefaultHeartBeatController(final Context context, final String str, Set set, Provider provider, Executor executor) {
        this(new Lazy(new Provider() { // from class: com.google.firebase.heartbeatinfo.d
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                return DefaultHeartBeatController.b(context, str);
            }
        }), set, executor, provider, context);
    }

    public static /* synthetic */ String a(DefaultHeartBeatController defaultHeartBeatController) {
        String string;
        synchronized (defaultHeartBeatController) {
            try {
                HeartBeatInfoStorage heartBeatInfoStorage = (HeartBeatInfoStorage) defaultHeartBeatController.f32807a.get();
                List listG = heartBeatInfoStorage.g();
                heartBeatInfoStorage.f();
                JSONArray jSONArray = new JSONArray();
                for (int i10 = 0; i10 < listG.size(); i10++) {
                    HeartBeatResult heartBeatResult = (HeartBeatResult) listG.get(i10);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", heartBeatResult.getUserAgent());
                    jSONObject.put("dates", new JSONArray((Collection) heartBeatResult.getUsedDates()));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", "2");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        string = byteArrayOutputStream.toString("UTF-8");
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return string;
    }

    public static /* synthetic */ HeartBeatInfoStorage b(Context context, String str) {
        return new HeartBeatInfoStorage(context, str);
    }

    public static /* synthetic */ DefaultHeartBeatController c(Qualified qualified, ComponentContainer componentContainer) {
        return new DefaultHeartBeatController((Context) componentContainer.get(Context.class), ((FirebaseApp) componentContainer.get(FirebaseApp.class)).getPersistenceKey(), componentContainer.setOf(HeartBeatConsumer.class), componentContainer.getProvider(UserAgentPublisher.class), (Executor) componentContainer.get(qualified));
    }

    @NonNull
    public static Component<DefaultHeartBeatController> component() {
        final Qualified qualified = Qualified.qualified(Background.class, Executor.class);
        return Component.builder(DefaultHeartBeatController.class, HeartBeatController.class, HeartBeatInfo.class).add(Dependency.required((Class<?>) Context.class)).add(Dependency.required((Class<?>) FirebaseApp.class)).add(Dependency.setOf((Class<?>) HeartBeatConsumer.class)).add(Dependency.requiredProvider((Class<?>) UserAgentPublisher.class)).add(Dependency.required((Qualified<?>) qualified)).factory(new ComponentFactory() { // from class: com.google.firebase.heartbeatinfo.b
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return DefaultHeartBeatController.c(qualified, componentContainer);
            }
        }).build();
    }

    public static /* synthetic */ Void d(DefaultHeartBeatController defaultHeartBeatController) {
        synchronized (defaultHeartBeatController) {
            ((HeartBeatInfoStorage) defaultHeartBeatController.f32807a.get()).o(System.currentTimeMillis(), ((UserAgentPublisher) defaultHeartBeatController.f32809c.get()).getUserAgent());
        }
        return null;
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatInfo
    @NonNull
    public synchronized HeartBeatInfo.HeartBeat getHeartBeatCode(@NonNull String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        HeartBeatInfoStorage heartBeatInfoStorage = (HeartBeatInfoStorage) this.f32807a.get();
        if (!heartBeatInfoStorage.m(jCurrentTimeMillis)) {
            return HeartBeatInfo.HeartBeat.NONE;
        }
        heartBeatInfoStorage.k();
        return HeartBeatInfo.HeartBeat.GLOBAL;
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatController
    public Task<String> getHeartBeatsHeader() {
        return !UserManagerCompat.isUserUnlocked(this.f32808b) ? Tasks.forResult("") : Tasks.call(this.f32811e, new Callable() { // from class: com.google.firebase.heartbeatinfo.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return DefaultHeartBeatController.a(this.f32818b);
            }
        });
    }

    public Task<Void> registerHeartBeat() {
        return this.f32810d.size() <= 0 ? Tasks.forResult(null) : !UserManagerCompat.isUserUnlocked(this.f32808b) ? Tasks.forResult(null) : Tasks.call(this.f32811e, new Callable() { // from class: com.google.firebase.heartbeatinfo.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return DefaultHeartBeatController.d(this.f32820b);
            }
        });
    }

    DefaultHeartBeatController(Provider provider, Set set, Executor executor, Provider provider2, Context context) {
        this.f32807a = provider;
        this.f32810d = set;
        this.f32811e = executor;
        this.f32809c = provider2;
        this.f32808b = context;
    }
}
