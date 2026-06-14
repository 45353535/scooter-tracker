package androidx.test.runner;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.Instrumentation;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.UserHandle;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.multidex.MultiDex;
import androidx.test.internal.platform.app.ActivityLifecycleTimeout;
import androidx.test.internal.runner.InstrumentationConnection;
import androidx.test.internal.runner.hidden.ExposedInstrumentationApi;
import androidx.test.internal.runner.intent.IntentMonitorImpl;
import androidx.test.internal.runner.intercepting.DefaultInterceptingActivityFactory;
import androidx.test.internal.runner.lifecycle.ActivityLifecycleMonitorImpl;
import androidx.test.internal.runner.lifecycle.ApplicationLifecycleMonitorImpl;
import androidx.test.internal.util.Checks;
import androidx.test.internal.util.ProcSummary;
import androidx.test.platform.app.AppComponentFactoryRegistry;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.runner.intent.IntentMonitorRegistry;
import androidx.test.runner.intent.IntentStubberRegistry;
import androidx.test.runner.intercepting.InterceptingActivityFactory;
import androidx.test.runner.lifecycle.ActivityLifecycleMonitorRegistry;
import androidx.test.runner.lifecycle.ApplicationLifecycleMonitorRegistry;
import androidx.test.runner.lifecycle.ApplicationStage;
import androidx.test.runner.lifecycle.Stage;
import androidx.tracing.Trace;
import androidx.webkit.ProxyConfig;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.Thread;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes5.dex */
public class MonitoringInstrumentation extends ExposedInstrumentationApi {
    private static final long MILLIS_TO_POLL_FOR_ACTIVITY_STOP;
    private static final long MILLIS_TO_WAIT_FOR_ACTIVITY_TO_STOP;
    private static final String TAG = "MonitoringInstr";
    private ExecutorService executorService;
    private Handler handlerForMainLooper;
    private volatile InterceptingActivityFactory interceptingActivityFactory;
    private String jsBridgeClassName;
    private Thread.UncaughtExceptionHandler oldDefaultExceptionHandler;
    private ActivityLifecycleMonitorImpl lifecycleMonitor = new ActivityLifecycleMonitorImpl();
    private ApplicationLifecycleMonitorImpl applicationMonitor = new ApplicationLifecycleMonitorImpl();
    private IntentMonitorImpl intentMonitor = new IntentMonitorImpl();
    private AtomicBoolean anActivityHasBeenLaunched = new AtomicBoolean(false);
    private AtomicLong lastIdleTime = new AtomicLong(0);
    private AtomicInteger startedActivityCounter = new AtomicInteger(0);
    private AtomicBoolean isJsBridgeLoaded = new AtomicBoolean(false);
    private volatile Boolean isOriginalInstr = null;
    private ThreadLocal<Boolean> isDexmakerClassLoaderInitialized = new ThreadLocal<>();
    private MessageQueue.IdleHandler idleHandler = new MessageQueue.IdleHandler() { // from class: androidx.test.runner.MonitoringInstrumentation.1
        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            MonitoringInstrumentation.this.lastIdleTime.set(System.currentTimeMillis());
            return true;
        }
    };
    private volatile boolean finished = false;

    public class ActivityFinisher implements Runnable {
        public ActivityFinisher() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList<Activity> arrayList = new ArrayList();
            Iterator it = EnumSet.range(Stage.CREATED, Stage.STOPPED).iterator();
            while (it.hasNext()) {
                arrayList.addAll(MonitoringInstrumentation.this.lifecycleMonitor.getActivitiesInStage((Stage) it.next()));
            }
            for (Activity activity : arrayList) {
                if (!activity.isFinishing()) {
                    try {
                        Log.i(MonitoringInstrumentation.TAG, "Finishing activity: " + activity);
                        activity.finish();
                    } catch (RuntimeException e10) {
                        Log.e(MonitoringInstrumentation.TAG, "Failed to finish activity.", e10);
                    }
                }
            }
        }
    }

    private static class StubResultCallable implements Callable<Instrumentation.ActivityResult> {
        private final Intent intent;

        StubResultCallable(Intent intent) {
            this.intent = intent;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public Instrumentation.ActivityResult call() {
            return IntentStubberRegistry.getInstance().getActivityResultForIntent(this.intent);
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(2L);
        MILLIS_TO_WAIT_FOR_ACTIVITY_TO_STOP = millis;
        MILLIS_TO_POLL_FOR_ACTIVITY_STOP = millis / 40;
    }

    private static Class<?> getMultiDexClass() throws ClassNotFoundException {
        try {
            int i10 = MultiDex.f5363a;
            return MultiDex.class;
        } catch (ClassNotFoundException unused) {
            return Class.forName("android.support.multidex.MultiDex");
        }
    }

    private List<String> getTargetProcessValues() {
        if (Build.VERSION.SDK_INT < 26) {
            return Collections.EMPTY_LIST;
        }
        try {
            String str = getContext().getPackageManager().getInstrumentationInfo(getComponentName(), 0).targetProcesses;
            if (str == null) {
                str = "";
            }
            String strTrim = str.trim();
            if (strTrim.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            for (String str2 : strTrim.split(StringUtils.COMMA, -1)) {
                String strTrim2 = str2.trim();
                if (strTrim2.length() > 0) {
                    arrayList.add(strTrim2);
                }
            }
            return arrayList;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.wtf(TAG, "Cannot locate ourselves: " + getComponentName(), e10);
            throw new IllegalStateException("Cannot locate ourselves: " + getComponentName(), e10);
        }
    }

    private void installMultidexAndExceptionHandler() {
        installMultidex();
        registerUncaughtExceptionHandler();
    }

    private boolean isHostingProcess(String str, ProcSummary procSummary) {
        int length = str.length();
        int length2 = procSummary.cmdline.length();
        if (length == length2) {
            return str.equals(procSummary.cmdline);
        }
        if (length < length2 || !str.startsWith(procSummary.cmdline) || !str.endsWith(procSummary.name)) {
            return false;
        }
        Log.w(TAG, "Use smaller processNames in AndroidManifest.xml. Long names are truncated. This process's cmdline is a prefix of the processName and suffix of comm - assuming: " + procSummary + " is: " + str);
        return true;
    }

    private boolean isOriginalInstrumentationProcess() {
        Boolean boolValueOf = this.isOriginalInstr;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(isOriginalUncached());
            this.isOriginalInstr = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    private boolean isOriginalUncached() {
        if (Build.VERSION.SDK_INT < 26) {
            return true;
        }
        List<String> targetProcessValues = getTargetProcessValues();
        if (targetProcessValues.isEmpty()) {
            return true;
        }
        boolean zEquals = ProxyConfig.MATCH_ALL_SCHEMES.equals(targetProcessValues.get(0));
        if (targetProcessValues.size() == 1 && !zEquals) {
            return true;
        }
        try {
            ProcSummary procSummarySummarize = ProcSummary.summarize("self");
            if (!zEquals) {
                return isHostingProcess(targetProcessValues.get(0), procSummarySummarize);
            }
            String packageName = getTargetContext().getApplicationInfo().processName;
            if (packageName == null) {
                packageName = getTargetContext().getPackageName();
            }
            return isHostingProcess(packageName, procSummarySummarize);
        } catch (ProcSummary.SummaryException e10) {
            Log.w(TAG, "Could not list apps for this user, running in sandbox? Assuming primary", e10);
            return false;
        }
    }

    private void registerUncaughtExceptionHandler() {
        this.oldDefaultExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: androidx.test.runner.MonitoringInstrumentation.3
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th2) {
                Log.d(MonitoringInstrumentation.TAG, String.format("Handling an uncaught exception thrown on the thread %s.", thread.getName()), th2);
                MonitoringInstrumentation.this.onException(thread, th2);
                if (MonitoringInstrumentation.this.oldDefaultExceptionHandler != null) {
                    Log.w(MonitoringInstrumentation.TAG, String.format("Invoking default uncaught exception handler %s (a %s)", MonitoringInstrumentation.this.oldDefaultExceptionHandler, MonitoringInstrumentation.this.oldDefaultExceptionHandler.getClass()));
                    MonitoringInstrumentation.this.oldDefaultExceptionHandler.uncaughtException(thread, th2);
                }
                if ("robolectric".equals(Build.FINGERPRINT) || !Looper.getMainLooper().getThread().equals(thread)) {
                    return;
                }
                Log.e(MonitoringInstrumentation.TAG, "The main thread has died and the handlers didn't care, exiting");
                System.exit(-10);
            }
        });
    }

    private void setupDexmakerClassloader() {
        Boolean bool = Boolean.TRUE;
        if (bool.equals(this.isDexmakerClassLoaderInitialized.get())) {
            return;
        }
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        ClassLoader classLoader = getTargetContext().getClassLoader();
        if (contextClassLoader != classLoader) {
            Log.i(TAG, String.format("Setting context classloader to '%s', Original: '%s'", classLoader, contextClassLoader));
            Thread.currentThread().setContextClassLoader(classLoader);
        }
        this.isDexmakerClassLoaderInitialized.set(bool);
    }

    private Instrumentation.ActivityResult stubResultFor(Intent intent) {
        if (!IntentStubberRegistry.isLoaded()) {
            return null;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return IntentStubberRegistry.getInstance().getActivityResultForIntent(intent);
        }
        FutureTask futureTask = new FutureTask(new StubResultCallable(intent));
        runOnMainSync(futureTask);
        try {
            return (Instrumentation.ActivityResult) futureTask.get();
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e10);
        } catch (ExecutionException e11) {
            String str = String.format("Could not retrieve stub result for intent %s", intent);
            if (e11.getCause() instanceof RuntimeException) {
                Log.w(TAG, str, e11);
                throw ((RuntimeException) e11.getCause());
            }
            if (e11.getCause() != null) {
                throw new RuntimeException(str, e11.getCause());
            }
            throw new RuntimeException(str, e11);
        }
    }

    private void tryLoadingJsBridge(final String str) {
        if (str == null) {
            throw new NullPointerException("JsBridge class name cannot be null!");
        }
        runOnMainSync(new Runnable() { // from class: androidx.test.runner.MonitoringInstrumentation.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Class.forName(str).getDeclaredMethod("installBridge", null).invoke(null, null);
                    MonitoringInstrumentation.this.isJsBridgeLoaded.set(true);
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                } catch (IllegalAccessException e10) {
                    throw new RuntimeException("JSbridge is available at runtime, but calling it failed.", e10);
                } catch (InvocationTargetException e11) {
                    throw new RuntimeException("JSbridge is available at runtime, but calling it failed.", e11);
                }
            }
        });
    }

    @Override // android.app.Instrumentation
    public void callActivityOnCreate(Activity activity, Bundle bundle) {
        this.lifecycleMonitor.signalLifecycleChange(Stage.PRE_ON_CREATE, activity);
        super.callActivityOnCreate(activity, bundle);
        this.lifecycleMonitor.signalLifecycleChange(Stage.CREATED, activity);
    }

    @Override // android.app.Instrumentation
    public void callActivityOnDestroy(Activity activity) {
        super.callActivityOnDestroy(activity);
        this.lifecycleMonitor.signalLifecycleChange(Stage.DESTROYED, activity);
    }

    @Override // android.app.Instrumentation
    public void callActivityOnPause(Activity activity) {
        super.callActivityOnPause(activity);
        this.lifecycleMonitor.signalLifecycleChange(Stage.PAUSED, activity);
    }

    @Override // android.app.Instrumentation
    public void callActivityOnRestart(Activity activity) {
        super.callActivityOnRestart(activity);
        this.lifecycleMonitor.signalLifecycleChange(Stage.RESTARTED, activity);
    }

    @Override // android.app.Instrumentation
    public void callActivityOnResume(Activity activity) {
        super.callActivityOnResume(activity);
        this.lifecycleMonitor.signalLifecycleChange(Stage.RESUMED, activity);
    }

    @Override // android.app.Instrumentation
    public void callActivityOnStart(Activity activity) {
        this.startedActivityCounter.incrementAndGet();
        try {
            super.callActivityOnStart(activity);
            this.lifecycleMonitor.signalLifecycleChange(Stage.STARTED, activity);
        } catch (RuntimeException e10) {
            this.startedActivityCounter.decrementAndGet();
            throw e10;
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnStop(Activity activity) {
        try {
            super.callActivityOnStop(activity);
            this.lifecycleMonitor.signalLifecycleChange(Stage.STOPPED, activity);
        } finally {
            this.startedActivityCounter.decrementAndGet();
        }
    }

    @Override // android.app.Instrumentation
    public void callApplicationOnCreate(Application application) {
        this.applicationMonitor.signalLifecycleChange(application, ApplicationStage.PRE_ON_CREATE);
        super.callApplicationOnCreate(application);
        this.applicationMonitor.signalLifecycleChange(application, ApplicationStage.CREATED);
    }

    protected void dumpThreadStateToOutputs(String str) {
        Log.e("THREAD_STATE", getThreadState());
    }

    public void execStartActivities(Context context, IBinder iBinder, IBinder iBinder2, Activity activity, Intent[] intentArr, Bundle bundle) {
        Log.d(TAG, "execStartActivities(context, ibinder, ibinder, activity, intent[], bundle)");
        for (Intent intent : intentArr) {
            execStartActivity(context, iBinder, iBinder2, activity, intent, -1, bundle);
        }
    }

    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Activity activity, Intent intent, int i10) {
        this.intentMonitor.signalIntent(intent);
        Instrumentation.ActivityResult activityResultStubResultFor = stubResultFor(intent);
        if (activityResultStubResultFor == null) {
            return super.execStartActivity(context, iBinder, iBinder2, activity, intent, i10);
        }
        Log.i(TAG, String.format("Stubbing intent %s", intent));
        return activityResultStubResultFor;
    }

    @Override // android.app.Instrumentation
    public void finish(int i10, Bundle bundle) {
        if (this.finished) {
            Log.w(TAG, "finish called 2x!");
            return;
        }
        this.finished = true;
        Trace.beginSection("MonitoringInstrumentation#finish");
        if (shouldWaitForActivitiesToComplete()) {
            this.handlerForMainLooper.post(new ActivityFinisher());
            waitForActivitiesToComplete();
        }
        ActivityLifecycleMonitorRegistry.registerInstance(null);
        restoreUncaughtExceptionHandler();
        Trace.endSection();
        super.finish(i10, bundle);
    }

    protected String getThreadState() {
        Set<Map.Entry<Thread, StackTraceElement[]>> setEntrySet = Thread.getAllStackTraces().entrySet();
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<Thread, StackTraceElement[]> entry : setEntrySet) {
            StringBuilder sb3 = new StringBuilder("  ");
            sb3.append(entry.getKey());
            sb3.append(IOUtils.LINE_SEPARATOR_UNIX);
            for (StackTraceElement stackTraceElement : entry.getValue()) {
                sb3.append("    ");
                sb3.append(stackTraceElement.toString());
                sb3.append(IOUtils.LINE_SEPARATOR_UNIX);
            }
            sb3.append(IOUtils.LINE_SEPARATOR_UNIX);
            sb2.append(sb3.toString());
        }
        return sb2.toString();
    }

    protected void installMultidex() {
    }

    protected void installOldMultiDex(Class<?> cls) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        cls.getDeclaredMethod("install", Context.class).invoke(null, getTargetContext());
    }

    public void interceptActivityUsing(InterceptingActivityFactory interceptingActivityFactory) {
        Checks.checkNotNull(interceptingActivityFactory);
        this.interceptingActivityFactory = interceptingActivityFactory;
    }

    @Deprecated
    protected boolean isPrimaryInstrProcess(@Nullable String str) {
        return isPrimaryInstrProcess();
    }

    @Override // android.app.Instrumentation
    public Activity newActivity(Class<?> cls, Context context, IBinder iBinder, Application application, Intent intent, ActivityInfo activityInfo, CharSequence charSequence, Activity activity, String str, Object obj) throws IllegalAccessException, InstantiationException {
        String name = cls.getPackage().getName();
        String packageName = context.getPackageName();
        ComponentName component = intent.getComponent();
        if (!packageName.equals(component.getPackageName()) && name.equals(component.getPackageName())) {
            intent.setComponent(new ComponentName(packageName, component.getClassName()));
        }
        return super.newActivity(cls, context, iBinder, application, intent, activityInfo, charSequence, activity, str, obj);
    }

    @Override // android.app.Instrumentation
    public Application newApplication(ClassLoader classLoader, String str, Context context) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        installMultidexAndExceptionHandler();
        Application applicationInstantiateApplication = AppComponentFactoryRegistry.instantiateApplication(classLoader, str);
        return applicationInstantiateApplication != null ? applicationInstantiateApplication : super.newApplication(classLoader, str, context);
    }

    @Override // android.app.Instrumentation
    public void onCreate(Bundle bundle) {
        InstrumentationRegistry.registerInstance(this, bundle);
        androidx.test.InstrumentationRegistry.registerInstance(this, bundle);
        ActivityLifecycleMonitorRegistry.registerInstance(this.lifecycleMonitor);
        ApplicationLifecycleMonitorRegistry.registerInstance(this.applicationMonitor);
        IntentMonitorRegistry.registerInstance(this.intentMonitor);
        this.handlerForMainLooper = new Handler(Looper.getMainLooper());
        this.executorService = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 0L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory() { // from class: androidx.test.runner.MonitoringInstrumentation.2
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
                threadNewThread.setName(MonitoringInstrumentation.class.getSimpleName());
                return threadNewThread;
            }
        });
        Looper.myQueue().addIdleHandler(this.idleHandler);
        super.onCreate(bundle);
        specifyDexMakerCacheProperty();
        setupDexmakerClassloader();
        useDefaultInterceptingActivityFactory();
    }

    @Override // android.app.Instrumentation
    public void onDestroy() {
        Log.i(TAG, "Instrumentation Finished!");
        Looper.myQueue().removeIdleHandler(this.idleHandler);
        InstrumentationConnection.getInstance().terminate();
        super.onDestroy();
    }

    @Override // android.app.Instrumentation
    public boolean onException(Object obj, Throwable th2) {
        Log.e(TAG, String.format("Exception encountered by: %s. Dumping thread state to outputs and pining for the fjords.", obj), th2);
        dumpThreadStateToOutputs("ThreadState-onException.txt");
        Log.e(TAG, "Dying now...");
        return super.onException(obj, th2);
    }

    @Override // android.app.Instrumentation
    public void onStart() {
        super.onStart();
        String str = this.jsBridgeClassName;
        if (str != null) {
            tryLoadingJsBridge(str);
        }
        waitForIdleSync();
        setupDexmakerClassloader();
        InstrumentationConnection.getInstance().init(this, new ActivityFinisher());
    }

    protected void restoreUncaughtExceptionHandler() {
        Thread.setDefaultUncaughtExceptionHandler(this.oldDefaultExceptionHandler);
    }

    @Override // android.app.Instrumentation
    public void runOnMainSync(Runnable runnable) {
        FutureTask futureTask = new FutureTask(runnable, null);
        super.runOnMainSync(futureTask);
        try {
            futureTask.get();
        } catch (InterruptedException e10) {
            throw new RuntimeException(e10);
        } catch (ExecutionException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (!(cause instanceof Error)) {
                throw new RuntimeException(cause);
            }
            throw ((Error) cause);
        }
    }

    protected final void setJsBridgeClassName(String str) {
        if (str == null) {
            throw new NullPointerException("JsBridge class name cannot be null!");
        }
        if (this.isJsBridgeLoaded.get()) {
            throw new IllegalStateException("JsBridge is already loaded!");
        }
        this.jsBridgeClassName = str;
    }

    protected boolean shouldWaitForActivitiesToComplete() {
        return Boolean.parseBoolean(InstrumentationRegistry.getArguments().getString("waitForActivitiesToComplete", "true"));
    }

    protected void specifyDexMakerCacheProperty() {
        System.getProperties().put("dexmaker.dexcache", getTargetContext().getDir("dxmaker_cache", 0).getAbsolutePath());
    }

    @Override // android.app.Instrumentation
    public Activity startActivitySync(final Intent intent) {
        Checks.checkNotMainThread();
        long j10 = this.lastIdleTime.get();
        if (this.anActivityHasBeenLaunched.compareAndSet(false, true)) {
            intent.addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        }
        Future futureSubmit = this.executorService.submit(new Callable<Activity>() { // from class: androidx.test.runner.MonitoringInstrumentation.4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Activity call() {
                return MonitoringInstrumentation.super.startActivitySync(intent);
            }
        });
        try {
            return (Activity) futureSubmit.get(ActivityLifecycleTimeout.getMillis(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("interrupted", e10);
        } catch (ExecutionException e11) {
            throw new RuntimeException("Could not launch activity", e11.getCause());
        } catch (TimeoutException unused) {
            dumpThreadStateToOutputs("ThreadState-startActivityTimeout.txt");
            futureSubmit.cancel(true);
            throw new RuntimeException(String.format("Could not launch intent %s within %s milliseconds. Perhaps the main thread has not gone idle within a reasonable amount of time? There could be an animation or something constantly repainting the screen. Or the activity is doing network calls on creation? See the threaddump logs. For your reference the last time the event queue was idle before your activity launch request was %s and now the last time the queue went idle was: %s. If these numbers are the same your activity might be hogging the event queue.", intent, Long.valueOf(ActivityLifecycleTimeout.getMillis()), Long.valueOf(j10), Long.valueOf(this.lastIdleTime.get())));
        }
    }

    protected Throwable unwrapException(Throwable th2) {
        Throwable cause = th2.getCause();
        return (cause != null && th2.getClass().equals(RuntimeException.class)) ? unwrapException(cause) : th2;
    }

    public void useDefaultInterceptingActivityFactory() {
        this.interceptingActivityFactory = new DefaultInterceptingActivityFactory();
    }

    protected void waitForActivitiesToComplete() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException("Cannot be called from main thread!");
        }
        long jCurrentTimeMillis = System.currentTimeMillis() + MILLIS_TO_WAIT_FOR_ACTIVITY_TO_STOP;
        int i10 = this.startedActivityCounter.get();
        while (i10 > 0 && System.currentTimeMillis() < jCurrentTimeMillis) {
            try {
                Log.i(TAG, "Unstopped activity count: " + i10);
                Thread.sleep(MILLIS_TO_POLL_FOR_ACTIVITY_STOP);
                i10 = this.startedActivityCounter.get();
            } catch (InterruptedException e10) {
                Log.i(TAG, "Abandoning activity wait due to interruption.", e10);
            }
        }
        if (i10 > 0) {
            dumpThreadStateToOutputs("ThreadState-unstopped.txt");
            Log.w(TAG, String.format("Still %s activities active after waiting %s ms.", Integer.valueOf(i10), Long.valueOf(MILLIS_TO_WAIT_FOR_ACTIVITY_TO_STOP)));
        }
    }

    protected final boolean isPrimaryInstrProcess() {
        return isOriginalInstrumentationProcess();
    }

    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Activity activity, Intent intent, int i10, Bundle bundle) {
        this.intentMonitor.signalIntent(intent);
        Instrumentation.ActivityResult activityResultStubResultFor = stubResultFor(intent);
        if (activityResultStubResultFor != null) {
            Log.i(TAG, String.format("Stubbing intent %s", intent));
            return activityResultStubResultFor;
        }
        return super.execStartActivity(context, iBinder, iBinder2, activity, intent, i10, bundle);
    }

    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, String str, Intent intent, int i10, Bundle bundle) {
        this.intentMonitor.signalIntent(intent);
        Instrumentation.ActivityResult activityResultStubResultFor = stubResultFor(intent);
        if (activityResultStubResultFor != null) {
            Log.i(TAG, String.format("Stubbing intent %s", intent));
            return activityResultStubResultFor;
        }
        return super.execStartActivity(context, iBinder, iBinder2, str, intent, i10, bundle);
    }

    @Override // android.app.Instrumentation
    public Activity newActivity(ClassLoader classLoader, String str, Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        if (this.interceptingActivityFactory.shouldIntercept(classLoader, str, intent)) {
            return this.interceptingActivityFactory.create(classLoader, str, intent);
        }
        Activity activityInstantiateActivity = AppComponentFactoryRegistry.instantiateActivity(classLoader, str, intent);
        return activityInstantiateActivity != null ? activityInstantiateActivity : super.newActivity(classLoader, str, intent);
    }

    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Activity activity, Intent intent, int i10, Bundle bundle, UserHandle userHandle) {
        return super.execStartActivity(context, iBinder, iBinder2, activity, intent, i10, bundle, userHandle);
    }

    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Fragment fragment, Intent intent, int i10, Bundle bundle) {
        Log.d(TAG, "execStartActivity(context, IBinder, IBinder, Fragment, Intent, int, Bundle)");
        this.intentMonitor.signalIntent(intent);
        Instrumentation.ActivityResult activityResultStubResultFor = stubResultFor(intent);
        if (activityResultStubResultFor != null) {
            Log.i(TAG, String.format("Stubbing intent %s", intent));
            return activityResultStubResultFor;
        }
        return super.execStartActivity(context, iBinder, iBinder2, fragment, intent, i10, bundle);
    }
}
