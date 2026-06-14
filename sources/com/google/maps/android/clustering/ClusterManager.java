package com.google.maps.android.clustering;

import android.content.Context;
import android.os.AsyncTask;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.Marker;
import com.google.maps.android.clustering.ClusterItem;
import com.google.maps.android.clustering.algo.Algorithm;
import com.google.maps.android.clustering.algo.NonHierarchicalDistanceBasedAlgorithm;
import com.google.maps.android.clustering.algo.PreCachingAlgorithmDecorator;
import com.google.maps.android.clustering.algo.ScreenBasedAlgorithm;
import com.google.maps.android.clustering.algo.ScreenBasedAlgorithmAdapter;
import com.google.maps.android.clustering.view.ClusterRenderer;
import com.google.maps.android.clustering.view.DefaultClusterRenderer;
import com.google.maps.android.collections.MarkerManager;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes9.dex */
public class ClusterManager<T extends ClusterItem> implements GoogleMap.OnCameraIdleListener, GoogleMap.OnMarkerClickListener, GoogleMap.OnInfoWindowClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MarkerManager f33734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MarkerManager.Collection f33735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MarkerManager.Collection f33736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ScreenBasedAlgorithm f33737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ClusterRenderer f33738e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private GoogleMap f33739f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private CameraPosition f33740g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ClusterTask f33741h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ReadWriteLock f33742i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private OnClusterItemClickListener f33743j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private OnClusterInfoWindowClickListener f33744k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private OnClusterInfoWindowLongClickListener f33745l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private OnClusterItemInfoWindowClickListener f33746m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private OnClusterItemInfoWindowLongClickListener f33747n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private OnClusterClickListener f33748o;

    private class ClusterTask extends AsyncTask<Float, Void, Set<? extends Cluster<T>>> {
        private ClusterTask() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Set doInBackground(Float... fArr) {
            Algorithm<T> algorithm = ClusterManager.this.getAlgorithm();
            algorithm.lock();
            try {
                return algorithm.getClusters(fArr[0].floatValue());
            } finally {
                algorithm.unlock();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Set set) {
            ClusterManager.this.f33738e.onClustersChanged(set);
        }
    }

    public interface OnClusterClickListener<T extends ClusterItem> {
        boolean onClusterClick(Cluster<T> cluster);
    }

    public interface OnClusterInfoWindowClickListener<T extends ClusterItem> {
        void onClusterInfoWindowClick(Cluster<T> cluster);
    }

    public interface OnClusterInfoWindowLongClickListener<T extends ClusterItem> {
        void onClusterInfoWindowLongClick(Cluster<T> cluster);
    }

    public interface OnClusterItemClickListener<T extends ClusterItem> {
        boolean onClusterItemClick(T t10);
    }

    public interface OnClusterItemInfoWindowClickListener<T extends ClusterItem> {
        void onClusterItemInfoWindowClick(T t10);
    }

    public interface OnClusterItemInfoWindowLongClickListener<T extends ClusterItem> {
        void onClusterItemInfoWindowLongClick(T t10);
    }

    public ClusterManager(Context context, GoogleMap googleMap) {
        this(context, googleMap, new MarkerManager(googleMap));
    }

    public boolean addItem(T t10) {
        Algorithm<T> algorithm = getAlgorithm();
        algorithm.lock();
        try {
            return algorithm.addItem(t10);
        } finally {
            algorithm.unlock();
        }
    }

    public boolean addItems(Collection<T> collection) {
        Algorithm<T> algorithm = getAlgorithm();
        algorithm.lock();
        try {
            return algorithm.addItems(collection);
        } finally {
            algorithm.unlock();
        }
    }

    public void clearItems() {
        Algorithm<T> algorithm = getAlgorithm();
        algorithm.lock();
        try {
            algorithm.clearItems();
        } finally {
            algorithm.unlock();
        }
    }

    public void cluster() {
        this.f33742i.writeLock().lock();
        try {
            this.f33741h.cancel(true);
            ClusterTask clusterTask = new ClusterTask();
            this.f33741h = clusterTask;
            clusterTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, Float.valueOf(this.f33739f.getCameraPosition().zoom));
        } finally {
            this.f33742i.writeLock().unlock();
        }
    }

    public Algorithm<T> getAlgorithm() {
        return this.f33737d;
    }

    public MarkerManager.Collection getClusterMarkerCollection() {
        return this.f33736c;
    }

    public MarkerManager.Collection getMarkerCollection() {
        return this.f33735b;
    }

    public MarkerManager getMarkerManager() {
        return this.f33734a;
    }

    public ClusterRenderer<T> getRenderer() {
        return this.f33738e;
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnCameraIdleListener
    public void onCameraIdle() {
        ClusterRenderer clusterRenderer = this.f33738e;
        if (clusterRenderer instanceof GoogleMap.OnCameraIdleListener) {
            ((GoogleMap.OnCameraIdleListener) clusterRenderer).onCameraIdle();
        }
        this.f33737d.onCameraChange(this.f33739f.getCameraPosition());
        if (this.f33737d.shouldReclusterOnMapMovement()) {
            cluster();
            return;
        }
        CameraPosition cameraPosition = this.f33740g;
        if (cameraPosition == null || cameraPosition.zoom != this.f33739f.getCameraPosition().zoom) {
            this.f33740g = this.f33739f.getCameraPosition();
            cluster();
        }
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener
    public void onInfoWindowClick(@NonNull Marker marker) {
        getMarkerManager().onInfoWindowClick(marker);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
    public boolean onMarkerClick(@NonNull Marker marker) {
        return getMarkerManager().onMarkerClick(marker);
    }

    public boolean removeItem(T t10) {
        Algorithm<T> algorithm = getAlgorithm();
        algorithm.lock();
        try {
            return algorithm.removeItem(t10);
        } finally {
            algorithm.unlock();
        }
    }

    public boolean removeItems(Collection<T> collection) {
        Algorithm<T> algorithm = getAlgorithm();
        algorithm.lock();
        try {
            return algorithm.removeItems(collection);
        } finally {
            algorithm.unlock();
        }
    }

    public void setAlgorithm(Algorithm<T> algorithm) {
        if (algorithm instanceof ScreenBasedAlgorithm) {
            setAlgorithm((ScreenBasedAlgorithm) algorithm);
        } else {
            setAlgorithm((ScreenBasedAlgorithm) new ScreenBasedAlgorithmAdapter(algorithm));
        }
    }

    public void setAnimation(boolean z10) {
        this.f33738e.setAnimation(z10);
    }

    public void setOnClusterClickListener(OnClusterClickListener<T> onClusterClickListener) {
        this.f33748o = onClusterClickListener;
        this.f33738e.setOnClusterClickListener(onClusterClickListener);
    }

    public void setOnClusterInfoWindowClickListener(OnClusterInfoWindowClickListener<T> onClusterInfoWindowClickListener) {
        this.f33744k = onClusterInfoWindowClickListener;
        this.f33738e.setOnClusterInfoWindowClickListener(onClusterInfoWindowClickListener);
    }

    public void setOnClusterInfoWindowLongClickListener(OnClusterInfoWindowLongClickListener<T> onClusterInfoWindowLongClickListener) {
        this.f33745l = onClusterInfoWindowLongClickListener;
        this.f33738e.setOnClusterInfoWindowLongClickListener(onClusterInfoWindowLongClickListener);
    }

    public void setOnClusterItemClickListener(OnClusterItemClickListener<T> onClusterItemClickListener) {
        this.f33743j = onClusterItemClickListener;
        this.f33738e.setOnClusterItemClickListener(onClusterItemClickListener);
    }

    public void setOnClusterItemInfoWindowClickListener(OnClusterItemInfoWindowClickListener<T> onClusterItemInfoWindowClickListener) {
        this.f33746m = onClusterItemInfoWindowClickListener;
        this.f33738e.setOnClusterItemInfoWindowClickListener(onClusterItemInfoWindowClickListener);
    }

    public void setOnClusterItemInfoWindowLongClickListener(OnClusterItemInfoWindowLongClickListener<T> onClusterItemInfoWindowLongClickListener) {
        this.f33747n = onClusterItemInfoWindowLongClickListener;
        this.f33738e.setOnClusterItemInfoWindowLongClickListener(onClusterItemInfoWindowLongClickListener);
    }

    public void setRenderer(ClusterRenderer<T> clusterRenderer) {
        this.f33738e.setOnClusterClickListener(null);
        this.f33738e.setOnClusterItemClickListener(null);
        this.f33736c.clear();
        this.f33735b.clear();
        this.f33738e.onRemove();
        this.f33738e = clusterRenderer;
        clusterRenderer.onAdd();
        this.f33738e.setOnClusterClickListener(this.f33748o);
        this.f33738e.setOnClusterInfoWindowClickListener(this.f33744k);
        this.f33738e.setOnClusterInfoWindowLongClickListener(this.f33745l);
        this.f33738e.setOnClusterItemClickListener(this.f33743j);
        this.f33738e.setOnClusterItemInfoWindowClickListener(this.f33746m);
        this.f33738e.setOnClusterItemInfoWindowLongClickListener(this.f33747n);
        cluster();
    }

    public boolean updateItem(T t10) {
        Algorithm<T> algorithm = getAlgorithm();
        algorithm.lock();
        try {
            return algorithm.updateItem(t10);
        } finally {
            algorithm.unlock();
        }
    }

    public ClusterManager(Context context, GoogleMap googleMap, MarkerManager markerManager) {
        this.f33742i = new ReentrantReadWriteLock();
        this.f33739f = googleMap;
        this.f33734a = markerManager;
        this.f33736c = markerManager.newCollection();
        this.f33735b = markerManager.newCollection();
        this.f33738e = new DefaultClusterRenderer(context, googleMap, this);
        this.f33737d = new ScreenBasedAlgorithmAdapter(new PreCachingAlgorithmDecorator(new NonHierarchicalDistanceBasedAlgorithm()));
        this.f33741h = new ClusterTask();
        this.f33738e.onAdd();
    }

    public void setAlgorithm(ScreenBasedAlgorithm<T> screenBasedAlgorithm) {
        screenBasedAlgorithm.lock();
        try {
            Algorithm<T> algorithm = getAlgorithm();
            this.f33737d = screenBasedAlgorithm;
            if (algorithm != null) {
                algorithm.lock();
                try {
                    screenBasedAlgorithm.addItems(algorithm.getItems());
                    algorithm.unlock();
                } catch (Throwable th2) {
                    algorithm.unlock();
                    throw th2;
                }
            }
            screenBasedAlgorithm.unlock();
            if (this.f33737d.shouldReclusterOnMapMovement()) {
                this.f33737d.onCameraChange(this.f33739f.getCameraPosition());
            }
            cluster();
        } catch (Throwable th3) {
            screenBasedAlgorithm.unlock();
            throw th3;
        }
    }
}
