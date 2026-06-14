package com.appodeal.ads.modules.common.internal.context;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import com.appodeal.ads.modules.common.internal.LogConstants;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0012\u0013J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001e\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b0\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/context/ActivityProvider;", "", "resumedActivity", "Landroid/app/Activity;", "getResumedActivity", "()Landroid/app/Activity;", "resumedActivityFlow", "Lkotlinx/coroutines/flow/Flow;", "Ljava/lang/ref/WeakReference;", "getResumedActivityFlow", "()Lkotlinx/coroutines/flow/Flow;", "activityFlow", "Lcom/appodeal/ads/modules/common/internal/context/ActivityProvider$State;", "getActivityFlow", "observe", "", "applicationContext", "Landroid/content/Context;", "State", "LifecycleCallback", "internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ActivityProvider {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/context/ActivityProvider$LifecycleCallback;", "", "onActivityResumed", "", "activity", "Landroid/app/Activity;", "onActivityPaused", "onActivityDestroyed", "onAppConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface LifecycleCallback {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class DefaultImpls {
            public static void onActivityDestroyed(LifecycleCallback lifecycleCallback, Activity activity) {
            }

            public static void onActivityPaused(LifecycleCallback lifecycleCallback, Activity activity) {
            }

            public static void onActivityResumed(LifecycleCallback lifecycleCallback, Activity activity) {
            }

            public static void onAppConfigurationChanged(LifecycleCallback lifecycleCallback, Configuration newConfig) {
                Intrinsics.checkNotNullParameter(newConfig, "newConfig");
            }
        }

        void onActivityDestroyed(Activity activity);

        void onActivityPaused(Activity activity);

        void onActivityResumed(Activity activity);

        void onAppConfigurationChanged(Configuration newConfig);
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/context/ActivityProvider$State;", "", "Resumed", "Paused", LogConstants.EVENT_DESTROYED, "ConfigurationChanged", "Lcom/appodeal/ads/modules/common/internal/context/ActivityProvider$State$ConfigurationChanged;", "Lcom/appodeal/ads/modules/common/internal/context/ActivityProvider$State$Destroyed;", "Lcom/appodeal/ads/modules/common/internal/context/ActivityProvider$State$Paused;", "Lcom/appodeal/ads/modules/common/internal/context/ActivityProvider$State$Resumed;", "internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface State {

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/context/ActivityProvider$State$ConfigurationChanged;", "Lcom/appodeal/ads/modules/common/internal/context/ActivityProvider$State;", "Landroid/content/res/Configuration;", "newConfig", "<init>", "(Landroid/content/res/Configuration;)V", "", "toString", "()Ljava/lang/String;", "a", "Landroid/content/res/Configuration;", "getNewConfig", "()Landroid/content/res/Configuration;", "internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ConfigurationChanged implements State {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            public final Configuration newConfig;

            public ConfigurationChanged(Configuration newConfig) {
                Intrinsics.checkNotNullParameter(newConfig, "newConfig");
                this.newConfig = newConfig;
            }

            public final Configuration getNewConfig() {
                return this.newConfig;
            }

            public String toString() {
                return "ConfigurationChanged";
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/context/ActivityProvider$State$Destroyed;", "Lcom/appodeal/ads/modules/common/internal/context/ActivityProvider$State;", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "activity", "<init>", "(Ljava/lang/ref/WeakReference;)V", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/ref/WeakReference;", "getActivity", "()Ljava/lang/ref/WeakReference;", "internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Destroyed implements State {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            public final WeakReference activity;

            public Destroyed(WeakReference<Activity> activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                this.activity = activity;
            }

            public final WeakReference<Activity> getActivity() {
                return this.activity;
            }

            public String toString() {
                return "Destroyed(" + this.activity.get() + ")";
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/context/ActivityProvider$State$Paused;", "Lcom/appodeal/ads/modules/common/internal/context/ActivityProvider$State;", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "activity", "<init>", "(Ljava/lang/ref/WeakReference;)V", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/ref/WeakReference;", "getActivity", "()Ljava/lang/ref/WeakReference;", "internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Paused implements State {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            public final WeakReference activity;

            public Paused(WeakReference<Activity> activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                this.activity = activity;
            }

            public final WeakReference<Activity> getActivity() {
                return this.activity;
            }

            public String toString() {
                return "Paused(" + this.activity.get() + ")";
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/context/ActivityProvider$State$Resumed;", "Lcom/appodeal/ads/modules/common/internal/context/ActivityProvider$State;", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "activity", "<init>", "(Ljava/lang/ref/WeakReference;)V", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/ref/WeakReference;", "getActivity", "()Ljava/lang/ref/WeakReference;", "internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Resumed implements State {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            public final WeakReference activity;

            public Resumed(WeakReference<Activity> activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                this.activity = activity;
            }

            public final WeakReference<Activity> getActivity() {
                return this.activity;
            }

            public String toString() {
                return "Resumed(" + this.activity.get() + ")";
            }
        }
    }

    Flow getActivityFlow();

    Activity getResumedActivity();

    Flow getResumedActivityFlow();

    void observe(Context applicationContext);
}
