package com.mbridge.msdk.dycreator.bus;

import android.os.Looper;
import android.util.Log;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes10.dex */
public final class EventBus {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static volatile EventBus f48041o;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f48053k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static ExecutorService f48040n = Executors.newCachedThreadPool();
    public static String TAG = "Event";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Map<Class<?>, List<Class<?>>> f48042p = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, CopyOnWriteArrayList<Subscription>> f48043a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Object, List<Class<?>>> f48044b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<Class<?>, Object> f48045c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ThreadLocal<List<Object>> f48046d = new ThreadLocal<List<Object>>() { // from class: com.mbridge.msdk.dycreator.bus.EventBus.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<Object> initialValue() {
            return new ArrayList();
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ThreadLocal<BooleanWrapper> f48047e = new ThreadLocal<BooleanWrapper>() { // from class: com.mbridge.msdk.dycreator.bus.EventBus.2
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BooleanWrapper initialValue() {
            return new BooleanWrapper();
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f48048f = "onEvent";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HandlerPoster f48049g = new HandlerPoster(this, Looper.getMainLooper(), 10);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final BackgroundPoster f48050h = new BackgroundPoster(this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AsyncPoster f48051i = new AsyncPoster(this);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final SubscriberMethodFinder f48052j = new SubscriberMethodFinder();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f48054l = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Map<String, Object> f48055m = new ConcurrentHashMap();

    /* JADX INFO: renamed from: com.mbridge.msdk.dycreator.bus.EventBus$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f48058a;

        static {
            int[] iArr = new int[ThreadMode.values().length];
            f48058a = iArr;
            try {
                iArr[ThreadMode.PostThread.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f48058a[ThreadMode.MainThread.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f48058a[ThreadMode.BackgroundThread.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f48058a[ThreadMode.Async.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static final class BooleanWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f48059a;

        BooleanWrapper() {
        }
    }

    interface PostCallback {
        void onPostCompleted(List<SubscriberExceptionEvent> list);
    }

    private void a(Object obj, String str, boolean z10) {
        Iterator<SubscriberMethod> it = this.f48052j.a(obj.getClass(), str).iterator();
        while (it.hasNext()) {
            a(obj, it.next(), z10);
        }
    }

    public static void clearCaches() {
        SubscriberMethodFinder.a();
        f48042p.clear();
    }

    public static void clearSkipMethodNameVerifications() {
        SubscriberMethodFinder.clearSkipMethodNameVerifications();
    }

    public static EventBus getDefault() {
        if (f48041o == null) {
            synchronized (EventBus.class) {
                try {
                    if (f48041o == null) {
                        f48041o = new EventBus();
                    }
                } finally {
                }
            }
        }
        return f48041o;
    }

    public static void skipMethodNameVerificationFor(Class<?> cls) {
        SubscriberMethodFinder.a(cls);
    }

    public void configureLogSubscriberExceptions(boolean z10) {
        if (this.f48053k) {
            throw new EventBusException("This method must be called before any registration");
        }
        this.f48054l = z10;
    }

    public Object getStickyEvent(Class<?> cls) {
        Object obj;
        synchronized (this.f48045c) {
            obj = this.f48045c.get(cls);
        }
        return obj;
    }

    public void post(Object obj) {
        List<Object> list = this.f48046d.get();
        list.add(obj);
        BooleanWrapper booleanWrapper = this.f48047e.get();
        if (booleanWrapper.f48059a) {
            return;
        }
        boolean z10 = Looper.getMainLooper() == Looper.myLooper();
        booleanWrapper.f48059a = true;
        while (!list.isEmpty()) {
            try {
                a(list.remove(0), z10);
            } finally {
                booleanWrapper.f48059a = false;
            }
        }
    }

    public void postSticky(Object obj) {
        post(obj);
        synchronized (this.f48045c) {
            this.f48045c.put(obj.getClass(), obj);
        }
    }

    public void register(Object obj) {
        a(obj, this.f48048f, false);
    }

    public void registerSticky(Object obj) {
        a(obj, this.f48048f, true);
    }

    public void release() {
        if (f48041o != null) {
            f48041o = null;
            f48040n = null;
            Map<Class<?>, List<Class<?>>> map = f48042p;
            if (map != null && map.size() > 0) {
                map.clear();
            }
            Map<Class<?>, CopyOnWriteArrayList<Subscription>> map2 = this.f48043a;
            if (map2 != null && map2.size() > 0) {
                this.f48043a.clear();
            }
            Map<Object, List<Class<?>>> map3 = this.f48044b;
            if (map3 != null && map3.size() > 0) {
                this.f48044b.clear();
            }
            Map<Class<?>, Object> map4 = this.f48045c;
            if (map4 != null && map4.size() > 0) {
                this.f48045c.clear();
            }
            Map<String, Object> map5 = this.f48055m;
            if (map5 == null || map5.size() <= 0) {
                return;
            }
            this.f48055m.clear();
        }
    }

    public Object removeStickyEvent(Class<?> cls) {
        Object objRemove;
        synchronized (this.f48045c) {
            objRemove = this.f48045c.remove(cls);
        }
        return objRemove;
    }

    public synchronized void unregister(Object obj, Class<?>... clsArr) {
        try {
            if (clsArr.length == 0) {
                throw new IllegalArgumentException("Provide at least one event class");
            }
            List<Class<?>> list = this.f48044b.get(obj);
            if (list != null) {
                for (Class<?> cls : clsArr) {
                    a(obj, cls);
                    list.remove(cls);
                }
                if (list.isEmpty()) {
                    this.f48044b.remove(obj);
                }
            } else {
                Log.w(TAG, "Subscriber to unregister was not registered before: " + obj.getClass());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void register(String str, Object obj) {
        Map<String, Object> map = this.f48055m;
        if (map != null && map.containsKey(str)) {
            unregister(this.f48055m.get(str));
        }
        this.f48055m.put(str, obj);
        a(obj, this.f48048f, false);
    }

    public void registerSticky(Object obj, String str) {
        a(obj, str, true);
    }

    public void registerSticky(Object obj, Class<?> cls, Class<?>... clsArr) {
        a(obj, this.f48048f, true, cls, clsArr);
    }

    public synchronized void registerSticky(Object obj, String str, Class<?> cls, Class<?>... clsArr) {
        a(obj, str, true, cls, clsArr);
    }

    public boolean removeStickyEvent(Object obj) {
        synchronized (this.f48045c) {
            try {
                Class<?> cls = obj.getClass();
                if (!obj.equals(this.f48045c.get(cls))) {
                    return false;
                }
                this.f48045c.remove(cls);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private synchronized void a(Object obj, String str, boolean z10, Class<?> cls, Class<?>... clsArr) {
        try {
            for (SubscriberMethod subscriberMethod : this.f48052j.a(obj.getClass(), str)) {
                if (cls == subscriberMethod.f48072c) {
                    a(obj, subscriberMethod, z10);
                } else if (clsArr != null) {
                    int length = clsArr.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= length) {
                            break;
                        }
                        if (clsArr[i10] == subscriberMethod.f48072c) {
                            a(obj, subscriberMethod, z10);
                            break;
                        }
                        i10++;
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void register(Object obj, String str) {
        a(obj, str, false);
    }

    public void register(Object obj, Class<?> cls, Class<?>... clsArr) {
        a(obj, this.f48048f, false, cls, clsArr);
    }

    public synchronized void register(Object obj, String str, Class<?> cls, Class<?>... clsArr) {
        a(obj, str, false, cls, clsArr);
    }

    public synchronized void unregister(Object obj) {
        try {
            List<Class<?>> list = this.f48044b.get(obj);
            if (list != null) {
                Iterator<Class<?>> it = list.iterator();
                while (it.hasNext()) {
                    a(obj, it.next());
                }
                this.f48044b.remove(obj);
            } else {
                Log.w(TAG, "Subscriber to unregister was not registered before: " + obj.getClass());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void a(Object obj, SubscriberMethod subscriberMethod, boolean z10) {
        Object obj2;
        this.f48053k = true;
        Class<?> cls = subscriberMethod.f48072c;
        CopyOnWriteArrayList<Subscription> copyOnWriteArrayList = this.f48043a.get(cls);
        Subscription subscription = new Subscription(obj, subscriberMethod);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.f48043a.put(cls, copyOnWriteArrayList);
        } else {
            Iterator<Subscription> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                if (it.next().equals(subscription)) {
                    throw new EventBusException("Subscriber " + obj.getClass() + " already registered to event " + cls);
                }
            }
        }
        subscriberMethod.f48070a.setAccessible(true);
        copyOnWriteArrayList.add(subscription);
        List<Class<?>> arrayList = this.f48044b.get(obj);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f48044b.put(obj, arrayList);
        }
        arrayList.add(cls);
        if (z10) {
            synchronized (this.f48045c) {
                obj2 = this.f48045c.get(cls);
            }
            if (obj2 != null) {
                a(subscription, obj2, Looper.getMainLooper() == Looper.myLooper());
            }
        }
    }

    public synchronized void unregister(String str) {
        try {
            Map<String, Object> map = this.f48055m;
            if (map != null && map.containsKey(str)) {
                Object objRemove = this.f48055m.remove(str);
                List<Class<?>> list = this.f48044b.get(objRemove);
                if (list != null) {
                    Iterator<Class<?>> it = list.iterator();
                    while (it.hasNext()) {
                        a(objRemove, it.next());
                    }
                    this.f48044b.remove(objRemove);
                } else {
                    Log.w(TAG, "Subscriber to unregister was not registered before: " + objRemove.getClass());
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void a(Object obj, Class<?> cls) {
        CopyOnWriteArrayList<Subscription> copyOnWriteArrayList = this.f48043a.get(cls);
        if (copyOnWriteArrayList != null) {
            int size = copyOnWriteArrayList.size();
            int i10 = 0;
            while (i10 < size) {
                if (copyOnWriteArrayList.get(i10).f48076a == obj) {
                    copyOnWriteArrayList.remove(i10);
                    i10--;
                    size--;
                }
                i10++;
            }
        }
    }

    private void a(Object obj, boolean z10) throws Error {
        CopyOnWriteArrayList<Subscription> copyOnWriteArrayList;
        if (obj != null) {
            try {
                Class<?> cls = obj.getClass();
                List<Class<?>> listA = a(cls);
                int size = listA.size();
                boolean z11 = false;
                for (int i10 = 0; i10 < size; i10++) {
                    Class<?> cls2 = listA.get(i10);
                    synchronized (this) {
                        copyOnWriteArrayList = this.f48043a.get(cls2);
                    }
                    if (copyOnWriteArrayList != null) {
                        Iterator<Subscription> it = copyOnWriteArrayList.iterator();
                        while (it.hasNext()) {
                            a(it.next(), obj, z10);
                        }
                        z11 = true;
                    }
                }
                if (z11) {
                    return;
                }
                Log.d(TAG, "No subscripers registered for event " + cls);
                if (cls == NoSubscriberEvent.class || cls == SubscriberExceptionEvent.class) {
                    return;
                }
                post(new NoSubscriberEvent(this, obj));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    private void a(Subscription subscription, Object obj, boolean z10) {
        int i10 = AnonymousClass3.f48058a[subscription.f48077b.f48071b.ordinal()];
        if (i10 == 1) {
            a(subscription, obj);
            return;
        }
        if (i10 == 2) {
            if (z10) {
                a(subscription, obj);
                return;
            } else {
                this.f48049g.a(subscription, obj);
                return;
            }
        }
        if (i10 == 3) {
            if (z10) {
                this.f48050h.enqueue(subscription, obj);
                return;
            } else {
                a(subscription, obj);
                return;
            }
        }
        if (i10 == 4) {
            this.f48051i.enqueue(subscription, obj);
            return;
        }
        throw new IllegalStateException("Unknown thread mode: " + subscription.f48077b.f48071b);
    }

    private List<Class<?>> a(Class<?> cls) {
        List<Class<?>> arrayList;
        Map<Class<?>, List<Class<?>>> map = f48042p;
        synchronized (map) {
            try {
                arrayList = map.get(cls);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    for (Class<?> superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
                        arrayList.add(superclass);
                        a(arrayList, superclass.getInterfaces());
                    }
                    f48042p.put(cls, arrayList);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    static void a(List<Class<?>> list, Class<?>[] clsArr) {
        for (Class<?> cls : clsArr) {
            if (!list.contains(cls)) {
                list.add(cls);
                a(list, cls.getInterfaces());
            }
        }
    }

    void a(PendingPost pendingPost) {
        Object obj = pendingPost.f48065a;
        Subscription subscription = pendingPost.f48066b;
        PendingPost.a(pendingPost);
        a(subscription, obj);
    }

    void a(Subscription subscription, Object obj) throws Error {
        try {
            subscription.f48077b.f48070a.invoke(subscription.f48076a, obj);
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException("Unexpected exception", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (obj instanceof SubscriberExceptionEvent) {
                Log.e(TAG, "SubscriberExceptionEvent subscriber " + subscription.f48076a.getClass() + " threw an exception", cause);
                SubscriberExceptionEvent subscriberExceptionEvent = (SubscriberExceptionEvent) obj;
                Log.e(TAG, "Initial event " + subscriberExceptionEvent.causingEvent + " caused exception in " + subscriberExceptionEvent.causingSubscriber, subscriberExceptionEvent.throwable);
                return;
            }
            if (this.f48054l) {
                Log.e(TAG, "Could not dispatch event: " + obj.getClass() + " to subscribing class " + subscription.f48076a.getClass(), cause);
            }
            post(new SubscriberExceptionEvent(this, cause, obj, subscription.f48076a));
        }
    }
}
