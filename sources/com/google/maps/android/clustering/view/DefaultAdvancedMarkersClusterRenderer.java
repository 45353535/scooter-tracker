package com.google.maps.android.clustering.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.Projection;
import com.google.android.gms.maps.model.AdvancedMarker;
import com.google.android.gms.maps.model.AdvancedMarkerOptions;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.maps.android.R;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterItem;
import com.google.maps.android.clustering.ClusterManager;
import com.google.maps.android.collections.MarkerManager;
import com.google.maps.android.geometry.Point;
import com.google.maps.android.projection.SphericalMercatorProjection;
import com.google.maps.android.ui.IconGenerator;
import com.google.maps.android.ui.SquareTextView;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes9.dex */
public class DefaultAdvancedMarkersClusterRenderer<T extends ClusterItem> implements ClusterRenderer<T> {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int[] f33774w = {10, 20, 50, 100, 200, 500, 1000};

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final TimeInterpolator f33775x = new DecelerateInterpolator();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final GoogleMap f33776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final IconGenerator f33777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ClusterManager f33778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f33779d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ShapeDrawable f33783h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private MarkerCache f33786k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Set f33788m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private MarkerCache f33789n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f33790o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final ViewModifier f33791p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ClusterManager.OnClusterClickListener f33792q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ClusterManager.OnClusterInfoWindowClickListener f33793r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private ClusterManager.OnClusterInfoWindowLongClickListener f33794s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ClusterManager.OnClusterItemClickListener f33795t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ClusterManager.OnClusterItemInfoWindowClickListener f33796u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ClusterManager.OnClusterItemInfoWindowLongClickListener f33797v;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Executor f33782g = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Set f33784i = Collections.newSetFromMap(new ConcurrentHashMap());

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private SparseArray f33785j = new SparseArray();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f33787l = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f33780e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f33781f = 300;

    private class AnimationTask extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final MarkerWithPosition f33800b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Marker f33801c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final LatLng f33802d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final LatLng f33803e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f33804f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private MarkerManager f33805g;

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f33804f) {
                DefaultAdvancedMarkersClusterRenderer.this.f33786k.remove(this.f33801c);
                DefaultAdvancedMarkersClusterRenderer.this.f33789n.remove(this.f33801c);
                this.f33805g.remove(this.f33801c);
            }
            this.f33800b.f33823b = this.f33803e;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float animatedFraction = valueAnimator.getAnimatedFraction();
            LatLng latLng = this.f33803e;
            double d10 = latLng.latitude;
            LatLng latLng2 = this.f33802d;
            double d11 = latLng2.latitude;
            double d12 = animatedFraction;
            double d13 = ((d10 - d11) * d12) + d11;
            double dSignum = latLng.longitude - latLng2.longitude;
            if (Math.abs(dSignum) > 180.0d) {
                dSignum -= Math.signum(dSignum) * 360.0d;
            }
            this.f33801c.setPosition(new LatLng(d13, (dSignum * d12) + this.f33802d.longitude));
        }

        public void perform() {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setInterpolator(DefaultAdvancedMarkersClusterRenderer.f33775x);
            valueAnimatorOfFloat.setDuration(DefaultAdvancedMarkersClusterRenderer.this.f33781f);
            valueAnimatorOfFloat.addUpdateListener(this);
            valueAnimatorOfFloat.addListener(this);
            valueAnimatorOfFloat.start();
        }

        public void removeOnAnimationComplete(MarkerManager markerManager) {
            this.f33805g = markerManager;
            this.f33804f = true;
        }

        private AnimationTask(MarkerWithPosition markerWithPosition, LatLng latLng, LatLng latLng2) {
            this.f33800b = markerWithPosition;
            this.f33801c = markerWithPosition.f33822a;
            this.f33802d = latLng;
            this.f33803e = latLng2;
        }
    }

    private class CreateMarkerTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Cluster f33807a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Set f33808b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final LatLng f33809c;

        public CreateMarkerTask(Cluster<T> cluster, Set<MarkerWithPosition> set, LatLng latLng) {
            this.f33807a = cluster;
            this.f33808b = set;
            this.f33809c = latLng;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(MarkerModifier markerModifier) {
            MarkerWithPosition markerWithPosition;
            MarkerWithPosition markerWithPosition2;
            if (DefaultAdvancedMarkersClusterRenderer.this.L(this.f33807a)) {
                AdvancedMarker advancedMarker = (AdvancedMarker) DefaultAdvancedMarkersClusterRenderer.this.f33789n.get(this.f33807a);
                if (advancedMarker == null) {
                    AdvancedMarkerOptions advancedMarkerOptions = new AdvancedMarkerOptions();
                    LatLng position = this.f33809c;
                    if (position == null) {
                        position = this.f33807a.getPosition();
                    }
                    AdvancedMarkerOptions advancedMarkerOptionsPosition = advancedMarkerOptions.position(position);
                    DefaultAdvancedMarkersClusterRenderer.this.F(this.f33807a, advancedMarkerOptionsPosition);
                    advancedMarker = (AdvancedMarker) DefaultAdvancedMarkersClusterRenderer.this.f33778c.getClusterMarkerCollection().addMarker(advancedMarkerOptionsPosition);
                    DefaultAdvancedMarkersClusterRenderer.this.f33789n.put(this.f33807a, advancedMarker);
                    markerWithPosition = new MarkerWithPosition(advancedMarker);
                    LatLng latLng = this.f33809c;
                    if (latLng != null) {
                        markerModifier.animate(markerWithPosition, latLng, this.f33807a.getPosition());
                    }
                } else {
                    markerWithPosition = new MarkerWithPosition(advancedMarker);
                    DefaultAdvancedMarkersClusterRenderer.this.J(this.f33807a, advancedMarker);
                }
                DefaultAdvancedMarkersClusterRenderer.this.I(this.f33807a, advancedMarker);
                this.f33808b.add(markerWithPosition);
                return;
            }
            for (T t10 : this.f33807a.getItems()) {
                AdvancedMarker advancedMarker2 = (AdvancedMarker) DefaultAdvancedMarkersClusterRenderer.this.f33786k.get(t10);
                if (advancedMarker2 == null) {
                    AdvancedMarkerOptions advancedMarkerOptions2 = new AdvancedMarkerOptions();
                    LatLng latLng2 = this.f33809c;
                    if (latLng2 != null) {
                        advancedMarkerOptions2.position(latLng2);
                    } else {
                        advancedMarkerOptions2.position(t10.getPosition());
                        if (t10.getZIndex() != null) {
                            advancedMarkerOptions2.zIndex(t10.getZIndex().floatValue());
                        }
                    }
                    DefaultAdvancedMarkersClusterRenderer.this.E(t10, advancedMarkerOptions2);
                    advancedMarker2 = (AdvancedMarker) DefaultAdvancedMarkersClusterRenderer.this.f33778c.getMarkerCollection().addMarker(advancedMarkerOptions2);
                    markerWithPosition2 = new MarkerWithPosition(advancedMarker2);
                    DefaultAdvancedMarkersClusterRenderer.this.f33786k.put(t10, advancedMarker2);
                    LatLng latLng3 = this.f33809c;
                    if (latLng3 != null) {
                        markerModifier.animate(markerWithPosition2, latLng3, t10.getPosition());
                    }
                } else {
                    markerWithPosition2 = new MarkerWithPosition(advancedMarker2);
                    DefaultAdvancedMarkersClusterRenderer.this.H(t10, advancedMarker2);
                }
                DefaultAdvancedMarkersClusterRenderer.this.G(t10, advancedMarker2);
                this.f33808b.add(markerWithPosition2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class MarkerCache<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Map f33811a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map f33812b;

        private MarkerCache() {
            this.f33811a = new HashMap();
            this.f33812b = new HashMap();
        }

        public Marker get(T t10) {
            return (Marker) this.f33811a.get(t10);
        }

        public void put(T t10, Marker marker) {
            this.f33811a.put(t10, marker);
            this.f33812b.put(marker, t10);
        }

        public void remove(Marker marker) {
            Object obj = this.f33812b.get(marker);
            this.f33812b.remove(marker);
            this.f33811a.remove(obj);
        }

        public T get(Marker marker) {
            return (T) this.f33812b.get(marker);
        }
    }

    @SuppressLint({"HandlerLeak"})
    private class MarkerModifier extends Handler implements MessageQueue.IdleHandler {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Lock f33813b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Condition f33814c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Queue f33815d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Queue f33816e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Queue f33817f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Queue f33818g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Queue f33819h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f33820i;

        private void a() {
            if (!this.f33818g.isEmpty()) {
                b((Marker) this.f33818g.poll());
                return;
            }
            if (!this.f33819h.isEmpty()) {
                ((AnimationTask) this.f33819h.poll()).perform();
                return;
            }
            if (!this.f33816e.isEmpty()) {
                ((CreateMarkerTask) this.f33816e.poll()).b(this);
            } else if (!this.f33815d.isEmpty()) {
                ((CreateMarkerTask) this.f33815d.poll()).b(this);
            } else {
                if (this.f33817f.isEmpty()) {
                    return;
                }
                b((Marker) this.f33817f.poll());
            }
        }

        private void b(Marker marker) {
            DefaultAdvancedMarkersClusterRenderer.this.f33786k.remove(marker);
            DefaultAdvancedMarkersClusterRenderer.this.f33789n.remove(marker);
            DefaultAdvancedMarkersClusterRenderer.this.f33778c.getMarkerManager().remove(marker);
        }

        public void add(boolean z10, DefaultAdvancedMarkersClusterRenderer<T>.CreateMarkerTask createMarkerTask) {
            this.f33813b.lock();
            sendEmptyMessage(0);
            if (z10) {
                this.f33816e.add(createMarkerTask);
            } else {
                this.f33815d.add(createMarkerTask);
            }
            this.f33813b.unlock();
        }

        public void animate(MarkerWithPosition markerWithPosition, LatLng latLng, LatLng latLng2) {
            this.f33813b.lock();
            this.f33819h.add(new AnimationTask(markerWithPosition, latLng, latLng2));
            this.f33813b.unlock();
        }

        public void animateThenRemove(MarkerWithPosition markerWithPosition, LatLng latLng, LatLng latLng2) {
            this.f33813b.lock();
            AnimationTask animationTask = new AnimationTask(markerWithPosition, latLng, latLng2);
            animationTask.removeOnAnimationComplete(DefaultAdvancedMarkersClusterRenderer.this.f33778c.getMarkerManager());
            this.f33819h.add(animationTask);
            this.f33813b.unlock();
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (!this.f33820i) {
                Looper.myQueue().addIdleHandler(this);
                this.f33820i = true;
            }
            removeMessages(0);
            this.f33813b.lock();
            for (int i10 = 0; i10 < 10; i10++) {
                try {
                    a();
                } catch (Throwable th2) {
                    this.f33813b.unlock();
                    throw th2;
                }
            }
            if (isBusy()) {
                sendEmptyMessageDelayed(0, 10L);
            } else {
                this.f33820i = false;
                Looper.myQueue().removeIdleHandler(this);
                this.f33814c.signalAll();
            }
            this.f33813b.unlock();
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean isBusy() {
            /*
                r2 = this;
                java.util.concurrent.locks.Lock r0 = r2.f33813b     // Catch: java.lang.Throwable -> L30
                r0.lock()     // Catch: java.lang.Throwable -> L30
                java.util.Queue r0 = r2.f33815d     // Catch: java.lang.Throwable -> L30
                boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L30
                if (r0 == 0) goto L32
                java.util.Queue r0 = r2.f33816e     // Catch: java.lang.Throwable -> L30
                boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L30
                if (r0 == 0) goto L32
                java.util.Queue r0 = r2.f33818g     // Catch: java.lang.Throwable -> L30
                boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L30
                if (r0 == 0) goto L32
                java.util.Queue r0 = r2.f33817f     // Catch: java.lang.Throwable -> L30
                boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L30
                if (r0 == 0) goto L32
                java.util.Queue r0 = r2.f33819h     // Catch: java.lang.Throwable -> L30
                boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L30
                if (r0 != 0) goto L2e
                goto L32
            L2e:
                r0 = 0
                goto L33
            L30:
                r0 = move-exception
                goto L39
            L32:
                r0 = 1
            L33:
                java.util.concurrent.locks.Lock r1 = r2.f33813b
                r1.unlock()
                return r0
            L39:
                java.util.concurrent.locks.Lock r1 = r2.f33813b
                r1.unlock()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.maps.android.clustering.view.DefaultAdvancedMarkersClusterRenderer.MarkerModifier.isBusy():boolean");
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            sendEmptyMessage(0);
            return true;
        }

        public void remove(boolean z10, Marker marker) {
            this.f33813b.lock();
            sendEmptyMessage(0);
            if (z10) {
                this.f33818g.add(marker);
            } else {
                this.f33817f.add(marker);
            }
            this.f33813b.unlock();
        }

        public void waitUntilFree() {
            while (isBusy()) {
                sendEmptyMessage(0);
                this.f33813b.lock();
                try {
                    try {
                        if (isBusy()) {
                            this.f33814c.await();
                        }
                    } catch (InterruptedException e10) {
                        throw new RuntimeException(e10);
                    }
                } finally {
                    this.f33813b.unlock();
                }
            }
        }

        private MarkerModifier() {
            super(Looper.getMainLooper());
            ReentrantLock reentrantLock = new ReentrantLock();
            this.f33813b = reentrantLock;
            this.f33814c = reentrantLock.newCondition();
            this.f33815d = new LinkedList();
            this.f33816e = new LinkedList();
            this.f33817f = new LinkedList();
            this.f33818g = new LinkedList();
            this.f33819h = new LinkedList();
        }
    }

    private static class MarkerWithPosition {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Marker f33822a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private LatLng f33823b;

        public boolean equals(Object obj) {
            if (obj instanceof MarkerWithPosition) {
                return this.f33822a.equals(((MarkerWithPosition) obj).f33822a);
            }
            return false;
        }

        public int hashCode() {
            return this.f33822a.hashCode();
        }

        private MarkerWithPosition(Marker marker) {
            this.f33822a = marker;
            this.f33823b = marker.getPosition();
        }
    }

    private class RenderTask implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Set f33824b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Runnable f33825c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Projection f33826d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private SphericalMercatorProjection f33827e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private float f33828f;

        @Override // java.lang.Runnable
        @SuppressLint({"NewApi"})
        public void run() {
            LatLngBounds latLngBoundsBuild;
            ArrayList arrayList;
            DefaultAdvancedMarkersClusterRenderer defaultAdvancedMarkersClusterRenderer = DefaultAdvancedMarkersClusterRenderer.this;
            if (!defaultAdvancedMarkersClusterRenderer.K(defaultAdvancedMarkersClusterRenderer.B(defaultAdvancedMarkersClusterRenderer.f33788m), DefaultAdvancedMarkersClusterRenderer.this.B(this.f33824b))) {
                this.f33825c.run();
                return;
            }
            ArrayList arrayList2 = null;
            MarkerModifier markerModifier = new MarkerModifier();
            float f10 = this.f33828f;
            boolean z10 = f10 > DefaultAdvancedMarkersClusterRenderer.this.f33790o;
            float f11 = f10 - DefaultAdvancedMarkersClusterRenderer.this.f33790o;
            Set<MarkerWithPosition> set = DefaultAdvancedMarkersClusterRenderer.this.f33784i;
            try {
                latLngBoundsBuild = this.f33826d.getVisibleRegion().latLngBounds;
            } catch (Exception e10) {
                e10.printStackTrace();
                latLngBoundsBuild = LatLngBounds.builder().include(new LatLng(0.0d, 0.0d)).build();
            }
            if (DefaultAdvancedMarkersClusterRenderer.this.f33788m == null || !DefaultAdvancedMarkersClusterRenderer.this.f33780e) {
                arrayList = null;
            } else {
                arrayList = new ArrayList();
                for (Cluster cluster : DefaultAdvancedMarkersClusterRenderer.this.f33788m) {
                    if (DefaultAdvancedMarkersClusterRenderer.this.L(cluster) && latLngBoundsBuild.contains(cluster.getPosition())) {
                        arrayList.add(this.f33827e.toPoint(cluster.getPosition()));
                    }
                }
            }
            Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
            for (Cluster cluster2 : this.f33824b) {
                boolean zContains = latLngBoundsBuild.contains(cluster2.getPosition());
                if (z10 && zContains && DefaultAdvancedMarkersClusterRenderer.this.f33780e) {
                    Point pointX = DefaultAdvancedMarkersClusterRenderer.this.x(arrayList, this.f33827e.toPoint(cluster2.getPosition()));
                    if (pointX != null) {
                        markerModifier.add(true, new CreateMarkerTask(cluster2, setNewSetFromMap, this.f33827e.toLatLng(pointX)));
                    } else {
                        markerModifier.add(true, new CreateMarkerTask(cluster2, setNewSetFromMap, null));
                    }
                } else {
                    markerModifier.add(zContains, new CreateMarkerTask(cluster2, setNewSetFromMap, null));
                }
            }
            markerModifier.waitUntilFree();
            set.removeAll(setNewSetFromMap);
            if (DefaultAdvancedMarkersClusterRenderer.this.f33780e) {
                arrayList2 = new ArrayList();
                for (Cluster cluster3 : this.f33824b) {
                    if (DefaultAdvancedMarkersClusterRenderer.this.L(cluster3) && latLngBoundsBuild.contains(cluster3.getPosition())) {
                        arrayList2.add(this.f33827e.toPoint(cluster3.getPosition()));
                    }
                }
            }
            for (MarkerWithPosition markerWithPosition : set) {
                boolean zContains2 = latLngBoundsBuild.contains(markerWithPosition.f33823b);
                if (z10 || f11 <= -3.0f || !zContains2 || !DefaultAdvancedMarkersClusterRenderer.this.f33780e) {
                    markerModifier.remove(zContains2, markerWithPosition.f33822a);
                } else {
                    Point pointX2 = DefaultAdvancedMarkersClusterRenderer.this.x(arrayList2, this.f33827e.toPoint(markerWithPosition.f33823b));
                    if (pointX2 != null) {
                        markerModifier.animateThenRemove(markerWithPosition, markerWithPosition.f33823b, this.f33827e.toLatLng(pointX2));
                    } else {
                        markerModifier.remove(true, markerWithPosition.f33822a);
                    }
                }
            }
            markerModifier.waitUntilFree();
            DefaultAdvancedMarkersClusterRenderer.this.f33784i = setNewSetFromMap;
            DefaultAdvancedMarkersClusterRenderer.this.f33788m = this.f33824b;
            DefaultAdvancedMarkersClusterRenderer.this.f33790o = f10;
            this.f33825c.run();
        }

        public void setCallback(Runnable runnable) {
            this.f33825c = runnable;
        }

        public void setMapZoom(float f10) {
            this.f33828f = f10;
            this.f33827e = new SphericalMercatorProjection(Math.pow(2.0d, Math.min(f10, DefaultAdvancedMarkersClusterRenderer.this.f33790o)) * 256.0d);
        }

        public void setProjection(Projection projection) {
            this.f33826d = projection;
        }

        private RenderTask(Set set) {
            this.f33824b = set;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"HandlerLeak"})
    class ViewModifier extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f33830a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private RenderTask f33831b;

        private ViewModifier() {
            this.f33830a = false;
            this.f33831b = null;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            RenderTask renderTask;
            if (message.what == 1) {
                this.f33830a = false;
                if (this.f33831b != null) {
                    sendEmptyMessage(0);
                    return;
                }
                return;
            }
            removeMessages(0);
            if (this.f33830a || this.f33831b == null) {
                return;
            }
            Projection projection = DefaultAdvancedMarkersClusterRenderer.this.f33776a.getProjection();
            synchronized (this) {
                renderTask = this.f33831b;
                this.f33831b = null;
                this.f33830a = true;
            }
            renderTask.setCallback(new Runnable() { // from class: com.google.maps.android.clustering.view.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f33896b.sendEmptyMessage(1);
                }
            });
            renderTask.setProjection(projection);
            renderTask.setMapZoom(DefaultAdvancedMarkersClusterRenderer.this.f33776a.getCameraPosition().zoom);
            DefaultAdvancedMarkersClusterRenderer.this.f33782g.execute(renderTask);
        }

        public void queue(Set<? extends Cluster<T>> set) {
            synchronized (this) {
                this.f33831b = new RenderTask(set);
            }
            sendEmptyMessage(0);
        }
    }

    public DefaultAdvancedMarkersClusterRenderer(Context context, GoogleMap googleMap, ClusterManager<T> clusterManager) {
        this.f33786k = new MarkerCache();
        this.f33789n = new MarkerCache();
        this.f33791p = new ViewModifier();
        this.f33776a = googleMap;
        this.f33779d = context.getResources().getDisplayMetrics().density;
        IconGenerator iconGenerator = new IconGenerator(context);
        this.f33777b = iconGenerator;
        iconGenerator.setContentView(D(context));
        iconGenerator.setTextAppearance(R.style.amu_ClusterIcon_TextAppearance);
        iconGenerator.setBackground(C());
        this.f33778c = clusterManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Set B(Set set) {
        return set != null ? DesugarCollections.unmodifiableSet(set) : Collections.EMPTY_SET;
    }

    private LayerDrawable C() {
        this.f33783h = new ShapeDrawable(new OvalShape());
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(-2130706433);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, this.f33783h});
        int i10 = (int) (this.f33779d * 3.0f);
        layerDrawable.setLayerInset(1, i10, i10, i10, i10);
        return layerDrawable;
    }

    private SquareTextView D(Context context) {
        SquareTextView squareTextView = new SquareTextView(context);
        squareTextView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        squareTextView.setId(R.id.amu_text);
        int i10 = (int) (this.f33779d * 12.0f);
        squareTextView.setPadding(i10, i10, i10, i10);
        return squareTextView;
    }

    public static /* synthetic */ void a(DefaultAdvancedMarkersClusterRenderer defaultAdvancedMarkersClusterRenderer, Marker marker) {
        ClusterManager.OnClusterInfoWindowClickListener onClusterInfoWindowClickListener = defaultAdvancedMarkersClusterRenderer.f33793r;
        if (onClusterInfoWindowClickListener != null) {
            onClusterInfoWindowClickListener.onClusterInfoWindowClick((Cluster) defaultAdvancedMarkersClusterRenderer.f33789n.get(marker));
        }
    }

    public static /* synthetic */ boolean b(DefaultAdvancedMarkersClusterRenderer defaultAdvancedMarkersClusterRenderer, Marker marker) {
        ClusterManager.OnClusterClickListener onClusterClickListener = defaultAdvancedMarkersClusterRenderer.f33792q;
        return onClusterClickListener != null && onClusterClickListener.onClusterClick((Cluster) defaultAdvancedMarkersClusterRenderer.f33789n.get(marker));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void c(DefaultAdvancedMarkersClusterRenderer defaultAdvancedMarkersClusterRenderer, Marker marker) {
        ClusterManager.OnClusterItemInfoWindowLongClickListener onClusterItemInfoWindowLongClickListener = defaultAdvancedMarkersClusterRenderer.f33797v;
        if (onClusterItemInfoWindowLongClickListener != 0) {
            onClusterItemInfoWindowLongClickListener.onClusterItemInfoWindowLongClick((ClusterItem) defaultAdvancedMarkersClusterRenderer.f33786k.get(marker));
        }
    }

    public static /* synthetic */ void d(DefaultAdvancedMarkersClusterRenderer defaultAdvancedMarkersClusterRenderer, Marker marker) {
        ClusterManager.OnClusterInfoWindowLongClickListener onClusterInfoWindowLongClickListener = defaultAdvancedMarkersClusterRenderer.f33794s;
        if (onClusterInfoWindowLongClickListener != null) {
            onClusterInfoWindowLongClickListener.onClusterInfoWindowLongClick((Cluster) defaultAdvancedMarkersClusterRenderer.f33789n.get(marker));
        }
    }

    private static double w(Point point, Point point2) {
        double d10 = point.f34025x;
        double d11 = point2.f34025x;
        double d12 = (d10 - d11) * (d10 - d11);
        double d13 = point.f34026y;
        double d14 = point2.f34026y;
        return d12 + ((d13 - d14) * (d13 - d14));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Point x(List list, Point point) {
        Point point2 = null;
        if (list != null && !list.isEmpty()) {
            int maxDistanceBetweenClusteredItems = this.f33778c.getAlgorithm().getMaxDistanceBetweenClusteredItems();
            double d10 = maxDistanceBetweenClusteredItems * maxDistanceBetweenClusteredItems;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Point point3 = (Point) it.next();
                double dW = w(point3, point);
                if (dW < d10) {
                    point2 = point3;
                    d10 = dW;
                }
            }
        }
        return point2;
    }

    protected BitmapDescriptor A(Cluster cluster) {
        int iY = y(cluster);
        BitmapDescriptor bitmapDescriptor = (BitmapDescriptor) this.f33785j.get(iY);
        if (bitmapDescriptor != null) {
            return bitmapDescriptor;
        }
        this.f33783h.getPaint().setColor(getColor(iY));
        this.f33777b.setTextAppearance(getClusterTextAppearance(iY));
        BitmapDescriptor bitmapDescriptorFromBitmap = BitmapDescriptorFactory.fromBitmap(this.f33777b.makeIcon(z(iY)));
        this.f33785j.put(iY, bitmapDescriptorFromBitmap);
        return bitmapDescriptorFromBitmap;
    }

    protected void E(ClusterItem clusterItem, AdvancedMarkerOptions advancedMarkerOptions) {
        if (clusterItem.getTitle() != null && clusterItem.getSnippet() != null) {
            advancedMarkerOptions.title(clusterItem.getTitle());
            advancedMarkerOptions.snippet(clusterItem.getSnippet());
        } else if (clusterItem.getTitle() != null) {
            advancedMarkerOptions.title(clusterItem.getTitle());
        } else if (clusterItem.getSnippet() != null) {
            advancedMarkerOptions.title(clusterItem.getSnippet());
        }
    }

    protected void F(Cluster cluster, AdvancedMarkerOptions advancedMarkerOptions) {
        advancedMarkerOptions.icon(A(cluster));
    }

    protected void G(ClusterItem clusterItem, Marker marker) {
    }

    protected void H(ClusterItem clusterItem, Marker marker) {
        boolean z10 = true;
        boolean z11 = false;
        if (clusterItem.getTitle() == null || clusterItem.getSnippet() == null) {
            if (clusterItem.getSnippet() != null && !clusterItem.getSnippet().equals(marker.getTitle())) {
                marker.setTitle(clusterItem.getSnippet());
            } else if (clusterItem.getTitle() != null && !clusterItem.getTitle().equals(marker.getTitle())) {
                marker.setTitle(clusterItem.getTitle());
            }
            z11 = true;
        } else {
            if (!clusterItem.getTitle().equals(marker.getTitle())) {
                marker.setTitle(clusterItem.getTitle());
                z11 = true;
            }
            if (!clusterItem.getSnippet().equals(marker.getSnippet())) {
                marker.setSnippet(clusterItem.getSnippet());
                z11 = true;
            }
        }
        if (marker.getPosition().equals(clusterItem.getPosition())) {
            z10 = z11;
        } else {
            marker.setPosition(clusterItem.getPosition());
            if (clusterItem.getZIndex() != null) {
                marker.setZIndex(clusterItem.getZIndex().floatValue());
            }
        }
        if (z10 && marker.isInfoWindowShown()) {
            marker.showInfoWindow();
        }
    }

    protected void I(Cluster cluster, Marker marker) {
    }

    protected void J(Cluster cluster, AdvancedMarker advancedMarker) {
        advancedMarker.setIcon(A(cluster));
    }

    protected boolean K(Set set, Set set2) {
        return !set2.equals(set);
    }

    protected boolean L(Cluster cluster) {
        return cluster.getSize() >= this.f33787l;
    }

    public Cluster<T> getCluster(Marker marker) {
        return (Cluster) this.f33789n.get(marker);
    }

    public T getClusterItem(Marker marker) {
        return (T) this.f33786k.get(marker);
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    @StyleRes
    public int getClusterTextAppearance(int i10) {
        return R.style.amu_ClusterIcon_TextAppearance;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public int getColor(int i10) {
        float fMin = 300.0f - Math.min(i10, 300.0f);
        return Color.HSVToColor(new float[]{((fMin * fMin) / 90000.0f) * 220.0f, 1.0f, 0.6f});
    }

    public Marker getMarker(T t10) {
        return this.f33786k.get(t10);
    }

    public int getMinClusterSize() {
        return this.f33787l;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void onAdd() {
        this.f33778c.getMarkerCollection().setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() { // from class: com.google.maps.android.clustering.view.DefaultAdvancedMarkersClusterRenderer.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
            public boolean onMarkerClick(@NonNull Marker marker) {
                return DefaultAdvancedMarkersClusterRenderer.this.f33795t != null && DefaultAdvancedMarkersClusterRenderer.this.f33795t.onClusterItemClick((ClusterItem) DefaultAdvancedMarkersClusterRenderer.this.f33786k.get(marker));
            }
        });
        this.f33778c.getMarkerCollection().setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() { // from class: com.google.maps.android.clustering.view.DefaultAdvancedMarkersClusterRenderer.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener
            public void onInfoWindowClick(@NonNull Marker marker) {
                if (DefaultAdvancedMarkersClusterRenderer.this.f33796u != null) {
                    DefaultAdvancedMarkersClusterRenderer.this.f33796u.onClusterItemInfoWindowClick((ClusterItem) DefaultAdvancedMarkersClusterRenderer.this.f33786k.get(marker));
                }
            }
        });
        this.f33778c.getMarkerCollection().setOnInfoWindowLongClickListener(new GoogleMap.OnInfoWindowLongClickListener() { // from class: com.google.maps.android.clustering.view.a
            @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowLongClickListener
            public final void onInfoWindowLongClick(Marker marker) {
                DefaultAdvancedMarkersClusterRenderer.c(this.f33892a, marker);
            }
        });
        this.f33778c.getClusterMarkerCollection().setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() { // from class: com.google.maps.android.clustering.view.b
            @Override // com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
            public final boolean onMarkerClick(Marker marker) {
                return DefaultAdvancedMarkersClusterRenderer.b(this.f33893a, marker);
            }
        });
        this.f33778c.getClusterMarkerCollection().setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() { // from class: com.google.maps.android.clustering.view.c
            @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener
            public final void onInfoWindowClick(Marker marker) {
                DefaultAdvancedMarkersClusterRenderer.a(this.f33894a, marker);
            }
        });
        this.f33778c.getClusterMarkerCollection().setOnInfoWindowLongClickListener(new GoogleMap.OnInfoWindowLongClickListener() { // from class: com.google.maps.android.clustering.view.d
            @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowLongClickListener
            public final void onInfoWindowLongClick(Marker marker) {
                DefaultAdvancedMarkersClusterRenderer.d(this.f33895a, marker);
            }
        });
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void onClustersChanged(Set<? extends Cluster<T>> set) {
        this.f33791p.queue(set);
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void onRemove() {
        this.f33778c.getMarkerCollection().setOnMarkerClickListener(null);
        this.f33778c.getMarkerCollection().setOnInfoWindowClickListener(null);
        this.f33778c.getMarkerCollection().setOnInfoWindowLongClickListener(null);
        this.f33778c.getClusterMarkerCollection().setOnMarkerClickListener(null);
        this.f33778c.getClusterMarkerCollection().setOnInfoWindowClickListener(null);
        this.f33778c.getClusterMarkerCollection().setOnInfoWindowLongClickListener(null);
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setAnimation(boolean z10) {
        this.f33780e = z10;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setAnimationDuration(long j10) {
        this.f33781f = j10;
    }

    public void setMinClusterSize(int i10) {
        this.f33787l = i10;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setOnClusterClickListener(ClusterManager.OnClusterClickListener<T> onClusterClickListener) {
        this.f33792q = onClusterClickListener;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setOnClusterInfoWindowClickListener(ClusterManager.OnClusterInfoWindowClickListener<T> onClusterInfoWindowClickListener) {
        this.f33793r = onClusterInfoWindowClickListener;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setOnClusterInfoWindowLongClickListener(ClusterManager.OnClusterInfoWindowLongClickListener<T> onClusterInfoWindowLongClickListener) {
        this.f33794s = onClusterInfoWindowLongClickListener;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setOnClusterItemClickListener(ClusterManager.OnClusterItemClickListener<T> onClusterItemClickListener) {
        this.f33795t = onClusterItemClickListener;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setOnClusterItemInfoWindowClickListener(ClusterManager.OnClusterItemInfoWindowClickListener<T> onClusterItemInfoWindowClickListener) {
        this.f33796u = onClusterItemInfoWindowClickListener;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setOnClusterItemInfoWindowLongClickListener(ClusterManager.OnClusterItemInfoWindowLongClickListener<T> onClusterItemInfoWindowLongClickListener) {
        this.f33797v = onClusterItemInfoWindowLongClickListener;
    }

    protected int y(Cluster cluster) {
        int size = cluster.getSize();
        int i10 = 0;
        if (size <= f33774w[0]) {
            return size;
        }
        while (true) {
            int[] iArr = f33774w;
            if (i10 >= iArr.length - 1) {
                return iArr[iArr.length - 1];
            }
            int i11 = i10 + 1;
            if (size < iArr[i11]) {
                return iArr[i10];
            }
            i10 = i11;
        }
    }

    protected String z(int i10) {
        if (i10 < f33774w[0]) {
            return String.valueOf(i10);
        }
        return i10 + "+";
    }

    public Marker getMarker(Cluster<T> cluster) {
        return this.f33789n.get(cluster);
    }
}
