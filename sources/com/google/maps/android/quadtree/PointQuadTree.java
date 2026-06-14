package com.google.maps.android.quadtree;

import com.google.maps.android.geometry.Bounds;
import com.google.maps.android.geometry.Point;
import com.google.maps.android.quadtree.PointQuadTree.Item;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public class PointQuadTree<T extends Item> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bounds f34052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f34053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Set f34054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f34055d;

    public interface Item {
        Point getPoint();
    }

    public PointQuadTree(double d10, double d11, double d12, double d13) {
        this(new Bounds(d10, d11, d12, d13));
    }

    private void a(double d10, double d11, Item item) {
        List list = this.f34055d;
        if (list == null) {
            if (this.f34054c == null) {
                this.f34054c = new LinkedHashSet();
            }
            this.f34054c.add(item);
            if (this.f34054c.size() <= 50 || this.f34053b >= 40) {
                return;
            }
            d();
            return;
        }
        Bounds bounds = this.f34052a;
        if (d11 < bounds.midY) {
            if (d10 < bounds.midX) {
                ((PointQuadTree) list.get(0)).a(d10, d11, item);
                return;
            } else {
                ((PointQuadTree) list.get(1)).a(d10, d11, item);
                return;
            }
        }
        if (d10 < bounds.midX) {
            ((PointQuadTree) list.get(2)).a(d10, d11, item);
        } else {
            ((PointQuadTree) list.get(3)).a(d10, d11, item);
        }
    }

    private boolean b(double d10, double d11, Item item) {
        List list = this.f34055d;
        if (list != null) {
            Bounds bounds = this.f34052a;
            return d11 < bounds.midY ? d10 < bounds.midX ? ((PointQuadTree) list.get(0)).b(d10, d11, item) : ((PointQuadTree) list.get(1)).b(d10, d11, item) : d10 < bounds.midX ? ((PointQuadTree) list.get(2)).b(d10, d11, item) : ((PointQuadTree) list.get(3)).b(d10, d11, item);
        }
        Set set = this.f34054c;
        if (set == null) {
            return false;
        }
        return set.remove(item);
    }

    private void c(Bounds bounds, Collection collection) {
        if (this.f34052a.intersects(bounds)) {
            List list = this.f34055d;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((PointQuadTree) it.next()).c(bounds, collection);
                }
            } else if (this.f34054c != null) {
                if (bounds.contains(this.f34052a)) {
                    collection.addAll(this.f34054c);
                    return;
                }
                for (Item item : this.f34054c) {
                    if (bounds.contains(item.getPoint())) {
                        collection.add(item);
                    }
                }
            }
        }
    }

    private void d() {
        ArrayList arrayList = new ArrayList(4);
        this.f34055d = arrayList;
        Bounds bounds = this.f34052a;
        arrayList.add(new PointQuadTree(bounds.minX, bounds.midX, bounds.minY, bounds.midY, this.f34053b + 1));
        List list = this.f34055d;
        Bounds bounds2 = this.f34052a;
        list.add(new PointQuadTree(bounds2.midX, bounds2.maxX, bounds2.minY, bounds2.midY, this.f34053b + 1));
        List list2 = this.f34055d;
        Bounds bounds3 = this.f34052a;
        list2.add(new PointQuadTree(bounds3.minX, bounds3.midX, bounds3.midY, bounds3.maxY, this.f34053b + 1));
        List list3 = this.f34055d;
        Bounds bounds4 = this.f34052a;
        list3.add(new PointQuadTree(bounds4.midX, bounds4.maxX, bounds4.midY, bounds4.maxY, this.f34053b + 1));
        Set<Item> set = this.f34054c;
        this.f34054c = null;
        for (Item item : set) {
            a(item.getPoint().f34025x, item.getPoint().f34026y, item);
        }
    }

    public void add(T t10) {
        Point point = t10.getPoint();
        if (this.f34052a.contains(point.f34025x, point.f34026y)) {
            a(point.f34025x, point.f34026y, t10);
        }
    }

    public void clear() {
        this.f34055d = null;
        Set set = this.f34054c;
        if (set != null) {
            set.clear();
        }
    }

    public boolean remove(T t10) {
        Point point = t10.getPoint();
        if (this.f34052a.contains(point.f34025x, point.f34026y)) {
            return b(point.f34025x, point.f34026y, t10);
        }
        return false;
    }

    public Collection<T> search(Bounds bounds) {
        ArrayList arrayList = new ArrayList();
        c(bounds, arrayList);
        return arrayList;
    }

    public PointQuadTree(Bounds bounds) {
        this(bounds, 0);
    }

    private PointQuadTree(double d10, double d11, double d12, double d13, int i10) {
        this(new Bounds(d10, d11, d12, d13), i10);
    }

    private PointQuadTree(Bounds bounds, int i10) {
        this.f34055d = null;
        this.f34052a = bounds;
        this.f34053b = i10;
    }
}
