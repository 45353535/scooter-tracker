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
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
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
public class DefaultClusterRenderer<T extends ClusterItem> implements ClusterRenderer<T> {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int[] f33833w = {10, 20, 50, 100, 200, 500, 1000};

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final TimeInterpolator f33834x = new DecelerateInterpolator();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final GoogleMap f33835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final IconGenerator f33836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ClusterManager f33837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f33838d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ShapeDrawable f33842h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private MarkerCache f33845k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Set f33847m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private MarkerCache f33848n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f33849o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final ViewModifier f33850p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ClusterManager.OnClusterClickListener f33851q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ClusterManager.OnClusterInfoWindowClickListener f33852r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private ClusterManager.OnClusterInfoWindowLongClickListener f33853s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ClusterManager.OnClusterItemClickListener f33854t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ClusterManager.OnClusterItemInfoWindowClickListener f33855u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ClusterManager.OnClusterItemInfoWindowLongClickListener f33856v;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Executor f33841g = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Set f33843i = Collections.newSetFromMap(new ConcurrentHashMap());

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private SparseArray f33844j = new SparseArray();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f33846l = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f33839e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f33840f = 300;

    private class AnimationTask extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final MarkerWithPosition f33859b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Marker f33860c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final LatLng f33861d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final LatLng f33862e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f33863f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private MarkerManager f33864g;

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f33863f) {
                DefaultClusterRenderer.this.f33845k.remove(this.f33860c);
                DefaultClusterRenderer.this.f33848n.remove(this.f33860c);
                this.f33864g.remove(this.f33860c);
            }
            this.f33859b.f33882b = this.f33862e;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (this.f33862e == null || this.f33861d == null || this.f33860c == null) {
                return;
            }
            float animatedFraction = valueAnimator.getAnimatedFraction();
            LatLng latLng = this.f33862e;
            double d10 = latLng.latitude;
            LatLng latLng2 = this.f33861d;
            double d11 = latLng2.latitude;
            double d12 = animatedFraction;
            double d13 = ((d10 - d11) * d12) + d11;
            double dSignum = latLng.longitude - latLng2.longitude;
            if (Math.abs(dSignum) > 180.0d) {
                dSignum -= Math.signum(dSignum) * 360.0d;
            }
            this.f33860c.setPosition(new LatLng(d13, (dSignum * d12) + this.f33861d.longitude));
        }

        public void perform() {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setInterpolator(DefaultClusterRenderer.f33834x);
            valueAnimatorOfFloat.setDuration(DefaultClusterRenderer.this.f33840f);
            valueAnimatorOfFloat.addUpdateListener(this);
            valueAnimatorOfFloat.addListener(this);
            valueAnimatorOfFloat.start();
        }

        public void removeOnAnimationComplete(MarkerManager markerManager) {
            this.f33864g = markerManager;
            this.f33863f = true;
        }

        private AnimationTask(MarkerWithPosition markerWithPosition, LatLng latLng, LatLng latLng2) {
            this.f33859b = markerWithPosition;
            this.f33860c = markerWithPosition.f33881a;
            this.f33861d = latLng;
            this.f33862e = latLng2;
        }
    }

    private class CreateMarkerTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Cluster f33866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Set f33867b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final LatLng f33868c;

        public CreateMarkerTask(Cluster<T> cluster, Set<MarkerWithPosition> set, LatLng latLng) {
            this.f33866a = cluster;
            this.f33867b = set;
            this.f33868c = latLng;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(MarkerModifier markerModifier) {
            MarkerWithPosition markerWithPosition;
            MarkerWithPosition markerWithPosition2;
            if (DefaultClusterRenderer.this.L(this.f33866a)) {
                Marker markerAddMarker = DefaultClusterRenderer.this.f33848n.get(this.f33866a);
                if (markerAddMarker == null) {
                    MarkerOptions markerOptions = new MarkerOptions();
                    LatLng position = this.f33868c;
                    if (position == null) {
                        position = this.f33866a.getPosition();
                    }
                    MarkerOptions markerOptionsPosition = markerOptions.position(position);
                    DefaultClusterRenderer.this.F(this.f33866a, markerOptionsPosition);
                    markerAddMarker = DefaultClusterRenderer.this.f33837c.getClusterMarkerCollection().addMarker(markerOptionsPosition);
                    DefaultClusterRenderer.this.f33848n.put(this.f33866a, markerAddMarker);
                    markerWithPosition = new MarkerWithPosition(markerAddMarker);
                    LatLng latLng = this.f33868c;
                    if (latLng != null) {
                        markerModifier.animate(markerWithPosition, latLng, this.f33866a.getPosition());
                    }
                } else {
                    markerWithPosition = new MarkerWithPosition(markerAddMarker);
                    DefaultClusterRenderer.this.J(this.f33866a, markerAddMarker);
                }
                DefaultClusterRenderer.this.I(this.f33866a, markerAddMarker);
                this.f33867b.add(markerWithPosition);
                return;
            }
            for (T t10 : this.f33866a.getItems()) {
                Marker markerAddMarker2 = DefaultClusterRenderer.this.f33845k.get(t10);
                if (markerAddMarker2 == null) {
                    MarkerOptions markerOptions2 = new MarkerOptions();
                    LatLng latLng2 = this.f33868c;
                    if (latLng2 != null) {
                        markerOptions2.position(latLng2);
                    } else {
                        markerOptions2.position(t10.getPosition());
                        if (t10.getZIndex() != null) {
                            markerOptions2.zIndex(t10.getZIndex().floatValue());
                        }
                    }
                    DefaultClusterRenderer.this.E(t10, markerOptions2);
                    markerAddMarker2 = DefaultClusterRenderer.this.f33837c.getMarkerCollection().addMarker(markerOptions2);
                    markerWithPosition2 = new MarkerWithPosition(markerAddMarker2);
                    DefaultClusterRenderer.this.f33845k.put(t10, markerAddMarker2);
                    LatLng latLng3 = this.f33868c;
                    if (latLng3 != null) {
                        markerModifier.animate(markerWithPosition2, latLng3, t10.getPosition());
                    }
                } else {
                    markerWithPosition2 = new MarkerWithPosition(markerAddMarker2);
                    DefaultClusterRenderer.this.H(t10, markerAddMarker2);
                }
                DefaultClusterRenderer.this.G(t10, markerAddMarker2);
                this.f33867b.add(markerWithPosition2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class MarkerCache<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Map f33870a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map f33871b;

        private MarkerCache() {
            this.f33870a = new HashMap();
            this.f33871b = new HashMap();
        }

        public Marker get(T t10) {
            return (Marker) this.f33870a.get(t10);
        }

        public void put(T t10, Marker marker) {
            this.f33870a.put(t10, marker);
            this.f33871b.put(marker, t10);
        }

        public void remove(Marker marker) {
            Object obj = this.f33871b.get(marker);
            this.f33871b.remove(marker);
            this.f33870a.remove(obj);
        }

        public T get(Marker marker) {
            return (T) this.f33871b.get(marker);
        }
    }

    @SuppressLint({"HandlerLeak"})
    private class MarkerModifier extends Handler implements MessageQueue.IdleHandler {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Lock f33872b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Condition f33873c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Queue f33874d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Queue f33875e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Queue f33876f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Queue f33877g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Queue f33878h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f33879i;

        private void a() {
            if (!this.f33877g.isEmpty()) {
                b((Marker) this.f33877g.poll());
                return;
            }
            if (!this.f33878h.isEmpty()) {
                ((AnimationTask) this.f33878h.poll()).perform();
                return;
            }
            if (!this.f33875e.isEmpty()) {
                ((CreateMarkerTask) this.f33875e.poll()).b(this);
            } else if (!this.f33874d.isEmpty()) {
                ((CreateMarkerTask) this.f33874d.poll()).b(this);
            } else {
                if (this.f33876f.isEmpty()) {
                    return;
                }
                b((Marker) this.f33876f.poll());
            }
        }

        private void b(Marker marker) {
            DefaultClusterRenderer.this.f33845k.remove(marker);
            DefaultClusterRenderer.this.f33848n.remove(marker);
            DefaultClusterRenderer.this.f33837c.getMarkerManager().remove(marker);
        }

        public void add(boolean z10, DefaultClusterRenderer<T>.CreateMarkerTask createMarkerTask) {
            this.f33872b.lock();
            sendEmptyMessage(0);
            if (z10) {
                this.f33875e.add(createMarkerTask);
            } else {
                this.f33874d.add(createMarkerTask);
            }
            this.f33872b.unlock();
        }

        public void animate(MarkerWithPosition markerWithPosition, LatLng latLng, LatLng latLng2) {
            this.f33872b.lock();
            this.f33878h.add(new AnimationTask(markerWithPosition, latLng, latLng2));
            this.f33872b.unlock();
        }

        public void animateThenRemove(MarkerWithPosition markerWithPosition, LatLng latLng, LatLng latLng2) {
            this.f33872b.lock();
            AnimationTask animationTask = new AnimationTask(markerWithPosition, latLng, latLng2);
            animationTask.removeOnAnimationComplete(DefaultClusterRenderer.this.f33837c.getMarkerManager());
            this.f33878h.add(animationTask);
            this.f33872b.unlock();
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (!this.f33879i) {
                Looper.myQueue().addIdleHandler(this);
                this.f33879i = true;
            }
            removeMessages(0);
            this.f33872b.lock();
            for (int i10 = 0; i10 < 10; i10++) {
                try {
                    a();
                } catch (Throwable th2) {
                    this.f33872b.unlock();
                    throw th2;
                }
            }
            if (isBusy()) {
                sendEmptyMessageDelayed(0, 10L);
            } else {
                this.f33879i = false;
                Looper.myQueue().removeIdleHandler(this);
                this.f33873c.signalAll();
            }
            this.f33872b.unlock();
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean isBusy() {
            /*
                r2 = this;
                java.util.concurrent.locks.Lock r0 = r2.f33872b     // Catch: java.lang.Throwable -> L30
                r0.lock()     // Catch: java.lang.Throwable -> L30
                java.util.Queue r0 = r2.f33874d     // Catch: java.lang.Throwable -> L30
                boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L30
                if (r0 == 0) goto L32
                java.util.Queue r0 = r2.f33875e     // Catch: java.lang.Throwable -> L30
                boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L30
                if (r0 == 0) goto L32
                java.util.Queue r0 = r2.f33877g     // Catch: java.lang.Throwable -> L30
                boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L30
                if (r0 == 0) goto L32
                java.util.Queue r0 = r2.f33876f     // Catch: java.lang.Throwable -> L30
                boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L30
                if (r0 == 0) goto L32
                java.util.Queue r0 = r2.f33878h     // Catch: java.lang.Throwable -> L30
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
                java.util.concurrent.locks.Lock r1 = r2.f33872b
                r1.unlock()
                return r0
            L39:
                java.util.concurrent.locks.Lock r1 = r2.f33872b
                r1.unlock()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.maps.android.clustering.view.DefaultClusterRenderer.MarkerModifier.isBusy():boolean");
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            sendEmptyMessage(0);
            return true;
        }

        public void remove(boolean z10, Marker marker) {
            this.f33872b.lock();
            sendEmptyMessage(0);
            if (z10) {
                this.f33877g.add(marker);
            } else {
                this.f33876f.add(marker);
            }
            this.f33872b.unlock();
        }

        public void waitUntilFree() {
            while (isBusy()) {
                sendEmptyMessage(0);
                this.f33872b.lock();
                try {
                    try {
                        if (isBusy()) {
                            this.f33873c.await();
                        }
                    } catch (InterruptedException e10) {
                        throw new RuntimeException(e10);
                    }
                } finally {
                    this.f33872b.unlock();
                }
            }
        }

        private MarkerModifier() {
            super(Looper.getMainLooper());
            ReentrantLock reentrantLock = new ReentrantLock();
            this.f33872b = reentrantLock;
            this.f33873c = reentrantLock.newCondition();
            this.f33874d = new LinkedList();
            this.f33875e = new LinkedList();
            this.f33876f = new LinkedList();
            this.f33877g = new LinkedList();
            this.f33878h = new LinkedList();
        }
    }

    private static class MarkerWithPosition {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Marker f33881a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private LatLng f33882b;

        public boolean equals(Object obj) {
            if (obj instanceof MarkerWithPosition) {
                return this.f33881a.equals(((MarkerWithPosition) obj).f33881a);
            }
            return false;
        }

        public int hashCode() {
            return this.f33881a.hashCode();
        }

        private MarkerWithPosition(Marker marker) {
            this.f33881a = marker;
            this.f33882b = marker.getPosition();
        }
    }

    private class RenderTask implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Set f33883b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Runnable f33884c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Projection f33885d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private SphericalMercatorProjection f33886e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private float f33887f;

        @Override // java.lang.Runnable
        @SuppressLint({"NewApi"})
        public void run() {
            LatLngBounds latLngBoundsBuild;
            ArrayList arrayList;
            DefaultClusterRenderer defaultClusterRenderer = DefaultClusterRenderer.this;
            if (!defaultClusterRenderer.K(defaultClusterRenderer.B(defaultClusterRenderer.f33847m), DefaultClusterRenderer.this.B(this.f33883b))) {
                this.f33884c.run();
                return;
            }
            ArrayList arrayList2 = null;
            MarkerModifier markerModifier = new MarkerModifier();
            float f10 = this.f33887f;
            boolean z10 = f10 > DefaultClusterRenderer.this.f33849o;
            float f11 = f10 - DefaultClusterRenderer.this.f33849o;
            Set<MarkerWithPosition> set = DefaultClusterRenderer.this.f33843i;
            try {
                latLngBoundsBuild = this.f33885d.getVisibleRegion().latLngBounds;
            } catch (Exception e10) {
                e10.printStackTrace();
                latLngBoundsBuild = LatLngBounds.builder().include(new LatLng(0.0d, 0.0d)).build();
            }
            if (DefaultClusterRenderer.this.f33847m == null || !DefaultClusterRenderer.this.f33839e) {
                arrayList = null;
            } else {
                arrayList = new ArrayList();
                for (Cluster cluster : DefaultClusterRenderer.this.f33847m) {
                    if (DefaultClusterRenderer.this.L(cluster) && latLngBoundsBuild.contains(cluster.getPosition())) {
                        arrayList.add(this.f33886e.toPoint(cluster.getPosition()));
                    }
                }
            }
            Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
            for (Cluster cluster2 : this.f33883b) {
                boolean zContains = latLngBoundsBuild.contains(cluster2.getPosition());
                if (z10 && zContains && DefaultClusterRenderer.this.f33839e) {
                    Point pointX = DefaultClusterRenderer.this.x(arrayList, this.f33886e.toPoint(cluster2.getPosition()));
                    if (pointX != null) {
                        markerModifier.add(true, new CreateMarkerTask(cluster2, setNewSetFromMap, this.f33886e.toLatLng(pointX)));
                    } else {
                        markerModifier.add(true, new CreateMarkerTask(cluster2, setNewSetFromMap, null));
                    }
                } else {
                    markerModifier.add(zContains, new CreateMarkerTask(cluster2, setNewSetFromMap, null));
                }
            }
            markerModifier.waitUntilFree();
            set.removeAll(setNewSetFromMap);
            if (DefaultClusterRenderer.this.f33839e) {
                arrayList2 = new ArrayList();
                for (Cluster cluster3 : this.f33883b) {
                    if (DefaultClusterRenderer.this.L(cluster3) && latLngBoundsBuild.contains(cluster3.getPosition())) {
                        arrayList2.add(this.f33886e.toPoint(cluster3.getPosition()));
                    }
                }
            }
            for (MarkerWithPosition markerWithPosition : set) {
                boolean zContains2 = latLngBoundsBuild.contains(markerWithPosition.f33882b);
                if (z10 || f11 <= -3.0f || !zContains2 || !DefaultClusterRenderer.this.f33839e) {
                    markerModifier.remove(zContains2, markerWithPosition.f33881a);
                } else {
                    Point pointX2 = DefaultClusterRenderer.this.x(arrayList2, this.f33886e.toPoint(markerWithPosition.f33882b));
                    if (pointX2 != null) {
                        markerModifier.animateThenRemove(markerWithPosition, markerWithPosition.f33882b, this.f33886e.toLatLng(pointX2));
                    } else {
                        markerModifier.remove(true, markerWithPosition.f33881a);
                    }
                }
            }
            markerModifier.waitUntilFree();
            DefaultClusterRenderer.this.f33843i = setNewSetFromMap;
            DefaultClusterRenderer.this.f33847m = this.f33883b;
            DefaultClusterRenderer.this.f33849o = f10;
            this.f33884c.run();
        }

        public void setCallback(Runnable runnable) {
            this.f33884c = runnable;
        }

        public void setMapZoom(float f10) {
            this.f33887f = f10;
            this.f33886e = new SphericalMercatorProjection(Math.pow(2.0d, Math.min(f10, DefaultClusterRenderer.this.f33849o)) * 256.0d);
        }

        public void setProjection(Projection projection) {
            this.f33885d = projection;
        }

        private RenderTask(Set set) {
            this.f33883b = set;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"HandlerLeak"})
    class ViewModifier extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f33889a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private RenderTask f33890b;

        private ViewModifier() {
            this.f33889a = false;
            this.f33890b = null;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            RenderTask renderTask;
            if (message.what == 1) {
                this.f33889a = false;
                if (this.f33890b != null) {
                    sendEmptyMessage(0);
                    return;
                }
                return;
            }
            removeMessages(0);
            if (this.f33889a || this.f33890b == null) {
                return;
            }
            Projection projection = DefaultClusterRenderer.this.f33835a.getProjection();
            synchronized (this) {
                renderTask = this.f33890b;
                this.f33890b = null;
                this.f33889a = true;
            }
            renderTask.setCallback(new Runnable() { // from class: com.google.maps.android.clustering.view.j
                @Override // java.lang.Runnable
                public final void run() {
                    this.f33901b.sendEmptyMessage(1);
                }
            });
            renderTask.setProjection(projection);
            renderTask.setMapZoom(DefaultClusterRenderer.this.f33835a.getCameraPosition().zoom);
            DefaultClusterRenderer.this.f33841g.execute(renderTask);
        }

        public void queue(Set<? extends Cluster<T>> set) {
            synchronized (this) {
                this.f33890b = new RenderTask(set);
            }
            sendEmptyMessage(0);
        }
    }

    public DefaultClusterRenderer(Context context, GoogleMap googleMap, ClusterManager<T> clusterManager) {
        this.f33845k = new MarkerCache();
        this.f33848n = new MarkerCache();
        this.f33850p = new ViewModifier();
        this.f33835a = googleMap;
        this.f33838d = context.getResources().getDisplayMetrics().density;
        IconGenerator iconGenerator = new IconGenerator(context);
        this.f33836b = iconGenerator;
        iconGenerator.setContentView(D(context));
        iconGenerator.setTextAppearance(R.style.amu_ClusterIcon_TextAppearance);
        iconGenerator.setBackground(C());
        this.f33837c = clusterManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Set B(Set set) {
        return set != null ? DesugarCollections.unmodifiableSet(set) : Collections.EMPTY_SET;
    }

    private LayerDrawable C() {
        this.f33842h = new ShapeDrawable(new OvalShape());
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(-2130706433);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, this.f33842h});
        int i10 = (int) (this.f33838d * 3.0f);
        layerDrawable.setLayerInset(1, i10, i10, i10, i10);
        return layerDrawable;
    }

    private SquareTextView D(Context context) {
        SquareTextView squareTextView = new SquareTextView(context);
        squareTextView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        squareTextView.setId(R.id.amu_text);
        int i10 = (int) (this.f33838d * 12.0f);
        squareTextView.setPadding(i10, i10, i10, i10);
        return squareTextView;
    }

    public static /* synthetic */ void a(DefaultClusterRenderer defaultClusterRenderer, Marker marker) {
        ClusterManager.OnClusterInfoWindowLongClickListener onClusterInfoWindowLongClickListener = defaultClusterRenderer.f33853s;
        if (onClusterInfoWindowLongClickListener != null) {
            onClusterInfoWindowLongClickListener.onClusterInfoWindowLongClick((Cluster) defaultClusterRenderer.f33848n.get(marker));
        }
    }

    public static /* synthetic */ boolean b(DefaultClusterRenderer defaultClusterRenderer, Marker marker) {
        ClusterManager.OnClusterClickListener onClusterClickListener = defaultClusterRenderer.f33851q;
        return onClusterClickListener != null && onClusterClickListener.onClusterClick((Cluster) defaultClusterRenderer.f33848n.get(marker));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void c(DefaultClusterRenderer defaultClusterRenderer, Marker marker) {
        ClusterManager.OnClusterItemInfoWindowLongClickListener onClusterItemInfoWindowLongClickListener = defaultClusterRenderer.f33856v;
        if (onClusterItemInfoWindowLongClickListener != 0) {
            onClusterItemInfoWindowLongClickListener.onClusterItemInfoWindowLongClick((ClusterItem) defaultClusterRenderer.f33845k.get(marker));
        }
    }

    public static /* synthetic */ void d(DefaultClusterRenderer defaultClusterRenderer, Marker marker) {
        ClusterManager.OnClusterInfoWindowClickListener onClusterInfoWindowClickListener = defaultClusterRenderer.f33852r;
        if (onClusterInfoWindowClickListener != null) {
            onClusterInfoWindowClickListener.onClusterInfoWindowClick((Cluster) defaultClusterRenderer.f33848n.get(marker));
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
            int maxDistanceBetweenClusteredItems = this.f33837c.getAlgorithm().getMaxDistanceBetweenClusteredItems();
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
        BitmapDescriptor bitmapDescriptor = (BitmapDescriptor) this.f33844j.get(iY);
        if (bitmapDescriptor != null) {
            return bitmapDescriptor;
        }
        this.f33842h.getPaint().setColor(getColor(iY));
        this.f33836b.setTextAppearance(getClusterTextAppearance(iY));
        BitmapDescriptor bitmapDescriptorFromBitmap = BitmapDescriptorFactory.fromBitmap(this.f33836b.makeIcon(z(iY)));
        this.f33844j.put(iY, bitmapDescriptorFromBitmap);
        return bitmapDescriptorFromBitmap;
    }

    protected void E(ClusterItem clusterItem, MarkerOptions markerOptions) {
        if (clusterItem.getTitle() != null && clusterItem.getSnippet() != null) {
            markerOptions.title(clusterItem.getTitle());
            markerOptions.snippet(clusterItem.getSnippet());
        } else if (clusterItem.getTitle() != null) {
            markerOptions.title(clusterItem.getTitle());
        } else if (clusterItem.getSnippet() != null) {
            markerOptions.title(clusterItem.getSnippet());
        }
    }

    protected void F(Cluster cluster, MarkerOptions markerOptions) {
        markerOptions.icon(A(cluster));
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

    protected void J(Cluster cluster, Marker marker) {
        marker.setIcon(A(cluster));
    }

    protected boolean K(Set set, Set set2) {
        return !set2.equals(set);
    }

    protected boolean L(Cluster cluster) {
        return cluster.getSize() >= this.f33846l;
    }

    public Cluster<T> getCluster(Marker marker) {
        return (Cluster) this.f33848n.get(marker);
    }

    public T getClusterItem(Marker marker) {
        return (T) this.f33845k.get(marker);
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
        return this.f33845k.get(t10);
    }

    public int getMinClusterSize() {
        return this.f33846l;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void onAdd() {
        this.f33837c.getMarkerCollection().setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() { // from class: com.google.maps.android.clustering.view.DefaultClusterRenderer.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
            public boolean onMarkerClick(@NonNull Marker marker) {
                return DefaultClusterRenderer.this.f33854t != null && DefaultClusterRenderer.this.f33854t.onClusterItemClick((ClusterItem) DefaultClusterRenderer.this.f33845k.get(marker));
            }
        });
        this.f33837c.getMarkerCollection().setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() { // from class: com.google.maps.android.clustering.view.DefaultClusterRenderer.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener
            public void onInfoWindowClick(@NonNull Marker marker) {
                if (DefaultClusterRenderer.this.f33855u != null) {
                    DefaultClusterRenderer.this.f33855u.onClusterItemInfoWindowClick((ClusterItem) DefaultClusterRenderer.this.f33845k.get(marker));
                }
            }
        });
        this.f33837c.getMarkerCollection().setOnInfoWindowLongClickListener(new GoogleMap.OnInfoWindowLongClickListener() { // from class: com.google.maps.android.clustering.view.f
            @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowLongClickListener
            public final void onInfoWindowLongClick(Marker marker) {
                DefaultClusterRenderer.c(this.f33897a, marker);
            }
        });
        this.f33837c.getClusterMarkerCollection().setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() { // from class: com.google.maps.android.clustering.view.g
            @Override // com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
            public final boolean onMarkerClick(Marker marker) {
                return DefaultClusterRenderer.b(this.f33898a, marker);
            }
        });
        this.f33837c.getClusterMarkerCollection().setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() { // from class: com.google.maps.android.clustering.view.h
            @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener
            public final void onInfoWindowClick(Marker marker) {
                DefaultClusterRenderer.d(this.f33899a, marker);
            }
        });
        this.f33837c.getClusterMarkerCollection().setOnInfoWindowLongClickListener(new GoogleMap.OnInfoWindowLongClickListener() { // from class: com.google.maps.android.clustering.view.i
            @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowLongClickListener
            public final void onInfoWindowLongClick(Marker marker) {
                DefaultClusterRenderer.a(this.f33900a, marker);
            }
        });
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void onClustersChanged(Set<? extends Cluster<T>> set) {
        this.f33850p.queue(set);
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void onRemove() {
        this.f33837c.getMarkerCollection().setOnMarkerClickListener(null);
        this.f33837c.getMarkerCollection().setOnInfoWindowClickListener(null);
        this.f33837c.getMarkerCollection().setOnInfoWindowLongClickListener(null);
        this.f33837c.getClusterMarkerCollection().setOnMarkerClickListener(null);
        this.f33837c.getClusterMarkerCollection().setOnInfoWindowClickListener(null);
        this.f33837c.getClusterMarkerCollection().setOnInfoWindowLongClickListener(null);
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setAnimation(boolean z10) {
        this.f33839e = z10;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setAnimationDuration(long j10) {
        this.f33840f = j10;
    }

    public void setMinClusterSize(int i10) {
        this.f33846l = i10;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setOnClusterClickListener(ClusterManager.OnClusterClickListener<T> onClusterClickListener) {
        this.f33851q = onClusterClickListener;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setOnClusterInfoWindowClickListener(ClusterManager.OnClusterInfoWindowClickListener<T> onClusterInfoWindowClickListener) {
        this.f33852r = onClusterInfoWindowClickListener;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setOnClusterInfoWindowLongClickListener(ClusterManager.OnClusterInfoWindowLongClickListener<T> onClusterInfoWindowLongClickListener) {
        this.f33853s = onClusterInfoWindowLongClickListener;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setOnClusterItemClickListener(ClusterManager.OnClusterItemClickListener<T> onClusterItemClickListener) {
        this.f33854t = onClusterItemClickListener;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setOnClusterItemInfoWindowClickListener(ClusterManager.OnClusterItemInfoWindowClickListener<T> onClusterItemInfoWindowClickListener) {
        this.f33855u = onClusterItemInfoWindowClickListener;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setOnClusterItemInfoWindowLongClickListener(ClusterManager.OnClusterItemInfoWindowLongClickListener<T> onClusterItemInfoWindowLongClickListener) {
        this.f33856v = onClusterItemInfoWindowLongClickListener;
    }

    protected int y(Cluster cluster) {
        int size = cluster.getSize();
        int i10 = 0;
        if (size <= f33833w[0]) {
            return size;
        }
        while (true) {
            int[] iArr = f33833w;
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
        if (i10 < f33833w[0]) {
            return String.valueOf(i10);
        }
        return i10 + "+";
    }

    public Marker getMarker(Cluster<T> cluster) {
        return this.f33848n.get(cluster);
    }
}
