package com.google.maps.android.collections;

import androidx.annotation.NonNull;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.maps.android.collections.MapObjectManager;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class CircleManager extends MapObjectManager<Circle, Collection> implements GoogleMap.OnCircleClickListener {
    public CircleManager(@NonNull GoogleMap googleMap) {
        super(googleMap);
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    void b() {
        GoogleMap googleMap = this.f33906a;
        if (googleMap != null) {
            googleMap.setOnCircleClickListener(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.maps.android.collections.MapObjectManager
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void a(Circle circle) {
        circle.remove();
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    public /* bridge */ /* synthetic */ MapObjectManager.Collection getCollection(String str) {
        return super.getCollection(str);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnCircleClickListener
    public void onCircleClick(@NonNull Circle circle) {
        Collection collection = (Collection) this.f33908c.get(circle);
        if (collection == null || collection.f33902c == null) {
            return;
        }
        collection.f33902c.onCircleClick(circle);
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    public /* bridge */ /* synthetic */ boolean remove(Circle circle) {
        return super.remove(circle);
    }

    public class Collection extends MapObjectManager.Collection {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private GoogleMap.OnCircleClickListener f33902c;

        public Collection() {
            super();
        }

        public void addAll(java.util.Collection<CircleOptions> collection) {
            Iterator<CircleOptions> it = collection.iterator();
            while (it.hasNext()) {
                addCircle(it.next());
            }
        }

        public Circle addCircle(CircleOptions circleOptions) {
            Circle circleAddCircle = CircleManager.this.f33906a.addCircle(circleOptions);
            super.a(circleAddCircle);
            return circleAddCircle;
        }

        public java.util.Collection<Circle> getCircles() {
            return b();
        }

        public void hideAll() {
            Iterator<Circle> it = getCircles().iterator();
            while (it.hasNext()) {
                it.next().setVisible(false);
            }
        }

        public boolean remove(Circle circle) {
            return super.c(circle);
        }

        public void setOnCircleClickListener(GoogleMap.OnCircleClickListener onCircleClickListener) {
            this.f33902c = onCircleClickListener;
        }

        public void showAll() {
            Iterator<Circle> it = getCircles().iterator();
            while (it.hasNext()) {
                it.next().setVisible(true);
            }
        }

        public void addAll(java.util.Collection<CircleOptions> collection, boolean z10) {
            Iterator<CircleOptions> it = collection.iterator();
            while (it.hasNext()) {
                addCircle(it.next()).setVisible(z10);
            }
        }
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    public /* bridge */ /* synthetic */ MapObjectManager.Collection newCollection(String str) {
        return super.newCollection(str);
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    public Collection newCollection() {
        return new Collection();
    }
}
