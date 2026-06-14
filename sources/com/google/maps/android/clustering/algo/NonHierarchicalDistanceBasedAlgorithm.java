package com.google.maps.android.clustering.algo;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterItem;
import com.google.maps.android.geometry.Bounds;
import com.google.maps.android.geometry.Point;
import com.google.maps.android.projection.SphericalMercatorProjection;
import com.google.maps.android.quadtree.PointQuadTree;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public class NonHierarchicalDistanceBasedAlgorithm<T extends ClusterItem> extends AbstractAlgorithm<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final SphericalMercatorProjection f33753e = new SphericalMercatorProjection(1.0d);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f33754b = 100;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Collection f33755c = new LinkedHashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final PointQuadTree f33756d = new PointQuadTree(0.0d, 1.0d, 0.0d, 1.0d);

    protected static class QuadItem<T extends ClusterItem> implements PointQuadTree.Item, Cluster<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ClusterItem f33757a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Point f33758b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final LatLng f33759c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Set f33760d;

        public boolean equals(Object obj) {
            if (obj instanceof QuadItem) {
                return ((QuadItem) obj).f33757a.equals(this.f33757a);
            }
            return false;
        }

        @Override // com.google.maps.android.quadtree.PointQuadTree.Item
        public Point getPoint() {
            return this.f33758b;
        }

        @Override // com.google.maps.android.clustering.Cluster
        public LatLng getPosition() {
            return this.f33759c;
        }

        @Override // com.google.maps.android.clustering.Cluster
        public int getSize() {
            return 1;
        }

        public int hashCode() {
            return this.f33757a.hashCode();
        }

        private QuadItem(ClusterItem clusterItem) {
            this.f33757a = clusterItem;
            LatLng position = clusterItem.getPosition();
            this.f33759c = position;
            this.f33758b = NonHierarchicalDistanceBasedAlgorithm.f33753e.toPoint(position);
            this.f33760d = Collections.singleton(clusterItem);
        }

        @Override // com.google.maps.android.clustering.Cluster
        public Set<T> getItems() {
            return this.f33760d;
        }
    }

    private Bounds b(Point point, double d10) {
        double d11 = d10 / 2.0d;
        double d12 = point.f34025x;
        double d13 = point.f34026y;
        return new Bounds(d12 - d11, d12 + d11, d13 - d11, d13 + d11);
    }

    private double c(Point point, Point point2) {
        double d10 = point.f34025x;
        double d11 = point2.f34025x;
        double d12 = (d10 - d11) * (d10 - d11);
        double d13 = point.f34026y;
        double d14 = point2.f34026y;
        return d12 + ((d13 - d14) * (d13 - d14));
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean addItem(T t10) {
        boolean zAdd;
        QuadItem quadItem = new QuadItem(t10);
        synchronized (this.f33756d) {
            try {
                zAdd = this.f33755c.add(quadItem);
                if (zAdd) {
                    this.f33756d.add(quadItem);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zAdd;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean addItems(Collection<T> collection) {
        Iterator<T> it = collection.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (addItem(it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public void clearItems() {
        synchronized (this.f33756d) {
            this.f33755c.clear();
            this.f33756d.clear();
        }
    }

    protected Collection d(PointQuadTree pointQuadTree, float f10) {
        return this.f33755c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.maps.android.clustering.algo.Algorithm
    public Set<? extends Cluster<T>> getClusters(float f10) {
        double dPow = (((double) this.f33754b) / Math.pow(2.0d, (int) f10)) / 256.0d;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        synchronized (this.f33756d) {
            try {
                Iterator it = d(this.f33756d, f10).iterator();
                while (it.hasNext()) {
                    QuadItem quadItem = (QuadItem) it.next();
                    if (!hashSet.contains(quadItem)) {
                        Collection<QuadItem> collectionSearch = this.f33756d.search(b(quadItem.getPoint(), dPow));
                        if (collectionSearch.size() == 1) {
                            hashSet2.add(quadItem);
                            hashSet.add(quadItem);
                            map.put(quadItem, Double.valueOf(0.0d));
                        } else {
                            StaticCluster staticCluster = new StaticCluster(quadItem.f33757a.getPosition());
                            hashSet2.add(staticCluster);
                            for (QuadItem quadItem2 : collectionSearch) {
                                Double d10 = (Double) map.get(quadItem2);
                                Iterator it2 = it;
                                double dC = c(quadItem2.getPoint(), quadItem.getPoint());
                                if (d10 == null) {
                                    map.put(quadItem2, Double.valueOf(dC));
                                    staticCluster.add(quadItem2.f33757a);
                                    map2.put(quadItem2, staticCluster);
                                } else if (d10.doubleValue() >= dC) {
                                    ((StaticCluster) map2.get(quadItem2)).remove(quadItem2.f33757a);
                                    map.put(quadItem2, Double.valueOf(dC));
                                    staticCluster.add(quadItem2.f33757a);
                                    map2.put(quadItem2, staticCluster);
                                }
                                it = it2;
                            }
                            hashSet.addAll(collectionSearch);
                            it = it;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hashSet2;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public Collection<T> getItems() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        synchronized (this.f33756d) {
            try {
                Iterator it = this.f33755c.iterator();
                while (it.hasNext()) {
                    linkedHashSet.add(((QuadItem) it.next()).f33757a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return linkedHashSet;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public int getMaxDistanceBetweenClusteredItems() {
        return this.f33754b;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean removeItem(T t10) {
        boolean zRemove;
        QuadItem quadItem = new QuadItem(t10);
        synchronized (this.f33756d) {
            try {
                zRemove = this.f33755c.remove(quadItem);
                if (zRemove) {
                    this.f33756d.remove(quadItem);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zRemove;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean removeItems(Collection<T> collection) {
        boolean z10;
        synchronized (this.f33756d) {
            try {
                Iterator<T> it = collection.iterator();
                z10 = false;
                while (it.hasNext()) {
                    QuadItem quadItem = new QuadItem(it.next());
                    if (this.f33755c.remove(quadItem)) {
                        this.f33756d.remove(quadItem);
                        z10 = true;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public void setMaxDistanceBetweenClusteredItems(int i10) {
        this.f33754b = i10;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean updateItem(T t10) {
        boolean zRemoveItem;
        synchronized (this.f33756d) {
            try {
                zRemoveItem = removeItem(t10);
                if (zRemoveItem) {
                    zRemoveItem = addItem(t10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zRemoveItem;
    }
}
