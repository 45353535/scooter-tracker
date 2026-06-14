package com.google.firebase.remoteconfig.internal.rollouts;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateSubscriptionsHandler;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsState;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes9.dex */
public class RolloutsStateSubscriptionsHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConfigCacheClient f33159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RolloutsStateFactory f33160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Executor f33161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Set f33162d = Collections.newSetFromMap(new ConcurrentHashMap());

    public RolloutsStateSubscriptionsHandler(@NonNull ConfigCacheClient configCacheClient, @NonNull RolloutsStateFactory rolloutsStateFactory, @NonNull Executor executor) {
        this.f33159a = configCacheClient;
        this.f33160b = rolloutsStateFactory;
        this.f33161c = executor;
    }

    public static /* synthetic */ void a(RolloutsStateSubscriptionsHandler rolloutsStateSubscriptionsHandler, Task task, final RolloutsStateSubscriber rolloutsStateSubscriber, ConfigContainer configContainer) {
        rolloutsStateSubscriptionsHandler.getClass();
        try {
            ConfigContainer configContainer2 = (ConfigContainer) task.getResult();
            if (configContainer2 != null) {
                final RolloutsState rolloutsStateA = rolloutsStateSubscriptionsHandler.f33160b.a(configContainer2);
                rolloutsStateSubscriptionsHandler.f33161c.execute(new Runnable() { // from class: s3.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        rolloutsStateSubscriber.onRolloutsStateChanged(rolloutsStateA);
                    }
                });
            }
        } catch (FirebaseRemoteConfigException e10) {
            Log.w(FirebaseRemoteConfig.TAG, "Exception publishing RolloutsState to subscriber. Continuing to listen for changes.", e10);
        }
    }

    public void publishActiveRolloutsState(@NonNull ConfigContainer configContainer) {
        try {
            final RolloutsState rolloutsStateA = this.f33160b.a(configContainer);
            for (final RolloutsStateSubscriber rolloutsStateSubscriber : this.f33162d) {
                this.f33161c.execute(new Runnable() { // from class: s3.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        rolloutsStateSubscriber.onRolloutsStateChanged(rolloutsStateA);
                    }
                });
            }
        } catch (FirebaseRemoteConfigException e10) {
            Log.w(FirebaseRemoteConfig.TAG, "Exception publishing RolloutsState to subscribers. Continuing to listen for changes.", e10);
        }
    }

    public void registerRolloutsStateSubscriber(@NonNull final RolloutsStateSubscriber rolloutsStateSubscriber) {
        this.f33162d.add(rolloutsStateSubscriber);
        final Task<ConfigContainer> task = this.f33159a.get();
        task.addOnSuccessListener(this.f33161c, new OnSuccessListener() { // from class: s3.a
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                RolloutsStateSubscriptionsHandler.a(this.f99549a, task, rolloutsStateSubscriber, (ConfigContainer) obj);
            }
        });
    }
}
